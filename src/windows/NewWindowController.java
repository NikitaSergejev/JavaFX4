/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author pupil
 */
public class NewWindowController implements Initializable {
     private Stage stageNewWindow;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // В методе initialize лучше выполнять только инициализацию элементов интерфейса.
        // Отображение нового окна лучше делать в другом месте, например, при необходимости.
    }

    public void showNewWindow() throws IOException {
        if (stageNewWindow == null) {
            Parent root = FXMLLoader.load(getClass().getResource("/windows/NewWindow.fxml"));
            stageNewWindow = new Stage();
            Scene sceneNewWindow = new Scene(root);
            stageNewWindow.setTitle("New window");
            stageNewWindow.setScene(sceneNewWindow);
        }
        
        stageNewWindow.show();
    }
    
    public void hideWindow() {
        if (stageNewWindow != null && stageNewWindow.isShowing()) {
            stageNewWindow.hide();
        }
    }
}
