
package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import java.net.URL;
import java.util.ResourceBundle;
public class AdminHomeScreenFXMLController implements Initializable {

    public Tab dashboard;
    @FXML
    private TabPane adminTabPane;
    @FXML
    private Tab addQuizTab;
    @FXML
    private Tab addStudentTab;
    @FXML
    private Tab logoutTab;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            Parent node = FXMLLoader.load(getClass().getResource("/fxml/AddQuizFXML.fxml"));
            addQuizTab.setContent(node);


            Parent studentTabNode = FXMLLoader.load(getClass()
                    .getResource("/fxml/AdminStudentTab.fxml"));
            addStudentTab.setContent(studentTabNode);


            Parent dash = FXMLLoader.load(getClass()
                    .getResource("/fxml/AdminDashboardFXML.fxml"));
            dashboard.setContent(dash);

            Parent logout = FXMLLoader.load(getClass()
                    .getResource("/fxml/LogoutFXML.fxml"));
            logoutTab.setContent(logout);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
    
}
