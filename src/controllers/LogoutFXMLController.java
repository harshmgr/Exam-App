package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LogoutFXMLController implements Initializable {

    @FXML
    private JFXButton logoutBtn;

    @FXML
    void logout(ActionEvent event) {
        try {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/fxml/loginFXML.fxml"));
                Stage stage = (Stage) logoutBtn.getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);

            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("Cannot load home");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
