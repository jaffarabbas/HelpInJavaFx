package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class Controller {
    dataconnection connect = new dataconnection();
    public TextArea textarea;
    @FXML
    public void mouiseclick(MouseEvent MouseEvent) throws Exception {
        String a = connect.showdata();
        textarea.setText(a);
        System.out.println(textarea.getText());
    }
}
