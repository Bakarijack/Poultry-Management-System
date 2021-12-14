package com.javaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LogInController {
    @FXML
    private Button cancelButton;
    @FXML
    private Button loginButton;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private Hyperlink signUp;


    //action the cancel button
    public void cancelButtonOnAction(ActionEvent e){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    //action the signup link
    public void signUpLinkOnAction(ActionEvent e) throws IOException {
        //closing the login page
        Stage stage = (Stage) signUp.getScene().getWindow();
        stage.close();

        //opens the signUp window
        FXMLLoader customerViewLoader = new FXMLLoader(getClass().getResource("signUp.fxml"));
        Parent root1 = (Parent) customerViewLoader.load();
        Stage stage2 = new Stage();

        stage2.setScene(new Scene(root1));
        stage2.show();


    }

    //action the login button
    public void loginButtonOnAction(ActionEvent e) throws IOException {
        if (!usernameField.getText().isBlank() && !passwordField.getText().isBlank()){
            //loginMessageLabel.setText("you try to logIn");
            validateLogin();


        }
        else{
            loginMessageLabel.setText("Please enter username and password");
        }
    }

    //validate the details with the database data
    public void validateLogin() {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verfyLogin = "SELECT count(1) FROM UserAccounts WHERE Username = '" + usernameField.getText() +
                "' AND password='" + passwordField.getText() + "'";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verfyLogin);

            while(queryResult.next()){
                if (queryResult.getInt(1) == 1){
                    loginMessageLabel.setText("Welcome!");
                    Stage stage = (Stage) loginButton.getScene().getWindow();
                    stage.close();

                    //opens the new window
                    FXMLLoader customerViewLoader = new FXMLLoader(getClass().getResource("cartView1.fxml"));
                    Parent root1 = (Parent) customerViewLoader.load();
                    Stage stage2 = new Stage();

                    stage2.setScene(new Scene(root1));
                    stage2.show();

                }else{
                    loginMessageLabel.setText("Invalid login.Please try again.");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
