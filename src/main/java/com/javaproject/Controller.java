package com.javaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private BorderPane mainPane;


    //controlling the main pane
    public void paneHomeLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paneHome");
        mainPane.setCenter(view);
    }
    public void paneProductLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paneProduct");
        mainPane.setCenter(view);
    }

    public void paneAboutLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paneAbout");
        mainPane.setCenter(view);
    }

    public void paneFeedbackLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("paneFeedback");
        mainPane.setCenter(view);
    }

    //displays the logIn page without closing the main one
    public  void switchToLogIn(ActionEvent event) throws IOException {
        FXMLLoader logInLoader = new FXMLLoader(getClass().getResource("logIN.fxml"));
        Parent root1 = (Parent) logInLoader.load();
        Stage stage = new Stage();

        stage.setScene(new Scene(root1));
        stage.show();

    }

    //order button on action
    public void orderButtonOnAction() throws IOException {
        FXMLLoader logInLoader = new FXMLLoader(getClass().getResource("logIN.fxml"));
        Parent root1 = (Parent) logInLoader.load();
        Stage stage = new Stage();

        stage.setScene(new Scene(root1));
        stage.show();

    }


} 