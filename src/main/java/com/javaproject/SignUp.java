package com.javaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.Statement;

public class SignUp {
    @FXML
    private PasswordField confirmPassword;

    @FXML
    private TextField emailField;

    @FXML
    private Button finishSign;

    @FXML
    private TextField firstName;

    @FXML
    private TextField genderField;

    @FXML
    private TextField locationField;

    @FXML
    private PasswordField passwordEnter;

    @FXML
    private TextField phoneNumber;

    @FXML
    private TextField secondName;


    @FXML
    private TextField userName;

    @FXML
    private Button signCancel;

    @FXML
    private Label messagelable;

    @FXML
    void signCancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) signCancel.getScene().getWindow();
        stage.close();
    }

    private boolean valueIsValid(TextField textField) {
        return !textField.getText().isBlank();
    }

    public void registerButtonOnAction(ActionEvent event) {
        var password = passwordEnter.getText();
        var passwordConfirmation = confirmPassword.getText();

        if (isValidInput() && password.equals(passwordConfirmation)) {
            registerUser();
            confirmPassword.setText("");
        }
        else
            messagelable.setText("Fill all the fields.");
    }

    private boolean isValidInput() {
        return valueIsValid(firstName) && valueIsValid(secondName) && valueIsValid(passwordEnter)
            && valueIsValid(locationField) && valueIsValid(phoneNumber) && valueIsValid(genderField);
    }

    public void registerUser(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection();
        String firstname = firstName.getText();
        String lastname = secondName.getText();
        String username = userName.getText();
        String password = passwordEnter.getText();
        String location = locationField.getText();
        String phone = phoneNumber.getText();
        String email = emailField.getText();
        String gender = genderField.getText();

        String insertField = "INSERT INTO UserAccounts ( Firstname, Lastname, Username, Password, Location, Phone, Email, Gender) VALUES ('";
        String insertValues = firstname + "','" + lastname + "','" + username + "','" + password + "','"+location+"','"+phone+"','"+email+"','"+gender+"')";
        String insertToRegister = insertField + insertValues;

        try {
            Statement statement = connectDb.createStatement();
            statement.executeUpdate(insertToRegister);
            messagelable.setText("user has been registered success");


        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }

    }


}
