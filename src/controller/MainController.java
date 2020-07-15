package controller;

import conexao.Conexao;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import util.Mensagem;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private MenuItem menuItemDepartment;
    @FXML
    private MenuItem menuItemSeller;
    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemDepartmentAction() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Clicado");
        alert.show();
    }

    @FXML
    public void onMenuItemSellerAction() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Clicado");
        alert.show();
    }

    @FXML
    public void onMenuItemAboutAction() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Clicado");
        alert.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
