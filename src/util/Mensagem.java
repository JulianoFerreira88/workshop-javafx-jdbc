package util;

import javafx.scene.control.Alert;

public class Mensagem {
    public static void mensagem(String titulo, String conteudo, Alert.AlertType tipo){
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setContentText(conteudo);
        alert.show();
    }
}
