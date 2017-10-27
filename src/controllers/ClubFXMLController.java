/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import models.Evenement;
import models.Profil;
import models.User;
import services.EvenementService;

/**
 * FXML Controller class
 *
 * @author majdi
 */
public class ClubFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Pane img_event_id;
    @FXML
    private AnchorPane anchorPane_id;

    AnchorPane eventclub;
    @FXML
    private JFXButton btn_evenement_id;
    @FXML
    private JFXListView<Profil> lit_view_membre;
    public ObservableList<Profil> profils;
    @FXML
    private ScrollPane scrollpane_verticale_id;
   
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClubFXMLController() {
        profils = FXCollections.observableArrayList();
        profils.addAll(new Profil(new User(), "", "", "", "icons8_User_96px_1", "", "", "", "", "", ""),
                new Profil(new User(), "", "", "", "icons8_User_96px_1", "", "", "", "", "", ""),
                new Profil(new User(), "", "", "", "icons8_User_96px_1", "", "", "", "", "", ""),
                new Profil(new User(), "", "", "", "icons8_User_96px_1", "", "", "", "", "", ""),
                new Profil(new User(), "", "", "", "icons8_User_96px_1", "", "", "", "", "", ""),
                new Profil(new User(), "", "", "", "icons8_User_96px_1", "", "", "", "", "", ""),
                new Profil(new User(), "", "", "", "icons8_User_96px_1", "", "", "", "", "", ""));

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        ProfilService ps = new ProfilService();
//        profils = FXCollections.observableArrayList(ps.getAll());

        lit_view_membre.setItems(profils);
        lit_view_membre.setCellFactory(evenementListView -> new MembreFXMLController());
    }

    @FXML
    private void GoToEvenement(MouseEvent event) {
        try {

            eventclub = FXMLLoader.load(getClass().getResource("/gui/EvenementFXML.fxml"));
            anchorPane_id.getChildren().clear();
            anchorPane_id.getChildren().add(eventclub);
        } catch (Exception e) {
            System.out.println("Can load new window");
        }
    }

    @FXML
    private void GoToEvenementDeClub(ActionEvent event) {

    }

    public void display() {
        EvenementService es = new EvenementService();
        Evenement e = es.getById(id);
        System.out.println(e);

//       path_img_event_id.setImage(new Image("http://localhost/www/Esprit4All/uploads/img_event/" + e.getPath_img()));
//       path_img_club_id.setImage(new Image("http://localhost/www/Esprit4All/uploads/img_club/path_img/"+e.getClub().getPath_img()));
//        desc_id.setText(e.getDescription());
//        libel_event_id.setText(e.getLiblle());
//        type_id.setText(e.getType());
//        date_id.setText(String.valueOf(e.getDate()));
    }
}
