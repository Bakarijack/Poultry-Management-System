package com.javaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class PackingManager {
    @FXML
    private BorderPane mainPane;

    //methods
    public void mainLinkOnAction(ActionEvent e){
        //load the menu screen
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("packingManagermenu");
        mainPane.setCenter(view);
    }

    public void accountLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("packingManagerAccounts");
        mainPane.setCenter(view);
    }
    public void scheduleLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("packingManagerSchedule");
        mainPane.setCenter(view);
    }

    public void profileLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("packingManagerProfile");
        mainPane.setCenter(view);
    }

    public void helpLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("packingManagerHelp");
        mainPane.setCenter(view);
    }

    public void workersReportLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("packingMangerWorkersReport");
        mainPane.setCenter(view);
    }

    public void packingReportsLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("packingManagerPackingReport");
        mainPane.setCenter(view);
    }

    public void othersLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("packingManagerOther");
        mainPane.setCenter(view);
    }

}
