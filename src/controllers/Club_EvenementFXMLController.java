/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXListView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import models.Club;
import models.Evenement;
import services.ClubService;
import services.EvenementService;

/**
 * FXML Controller class
 *
 * @author majdi
 */
public class Club_EvenementFXMLController implements Initializable {

    @FXML
    private JFXListView< Evenement> list_even;
    public ObservableList<Evenement> evenements;
    @FXML
    private AnchorPane anchorpane_club_id;

    @FXML
    private JFXListView<Club> list_even_club;
    public ObservableList<Club> clubs;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
     
        EvenementService es = new EvenementService();
        ClubService cs = new ClubService();
        
        //lester les evenements
        evenements = FXCollections.observableArrayList(es.getAll());
        list_even.setItems(evenements);
        list_even.setCellFactory(evenementListView -> new RowEventFXMLController());
        
        //lister les clubs 
        clubs = FXCollections.observableArrayList(cs.getAll());
        list_even_club.setItems(clubs);
        list_even_club.setCellFactory(clubListView -> new RowClubFXMLController());

    }
}
