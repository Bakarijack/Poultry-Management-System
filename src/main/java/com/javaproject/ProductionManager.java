package com.javaproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class ProductionManager {
    @FXML
    private BorderPane mainPane;

    //methods
    public void mainLinkOnAction(ActionEvent e){
        //load the menu screen
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("productionManagerMenu");
        mainPane.setCenter(view);
    }

    public void accountLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("productionMAnagerAccount");
        mainPane.setCenter(view);
    }
    public void scheduleLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("productionManagerSchedule");
        mainPane.setCenter(view);
    }

    public void profileLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("productionManagerProfile");
        mainPane.setCenter(view);
    }

    public void helpLinkOnAction(ActionEvent e){
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("productionManagerHelp");
        mainPane.setCenter(view);
    }

    public void cutomerseportLinkOnAction(ActionEvent e) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("productionManagerCustomerReport");
        mainPane.setCenter(view);
    }
    public void chickenreportseportLinkOnAction(ActionEvent e) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("productionManagerChickenReport");
        mainPane.setCenter(view);
    }
    public void currentOrdersReportLinkOnAction(ActionEvent e) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("productionManagerCurrentOrderReport");
        mainPane.setCenter(view);
    }
    public void otherLinkOnAction(ActionEvent e) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("productionManagerOthers");
        mainPane.setCenter(view);
    }

    public void productionReportsLinkOnAction(ActionEvent e) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("productionManagerProductionReports");
        mainPane.setCenter(view);
    }

    public void FeedsReportLinkOnAction(ActionEvent e) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("productionManagerFeedsReport");
        mainPane.setCenter(view);
    }

}
