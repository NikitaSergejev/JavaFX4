/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author pupil
 */
public class HelloController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button button;
    
    @FXML
    private void clickMe(ActionEvent event) {
        if (button.getText().equals("Click Me!")) {
            System.out.println("please clicked me again!");
            label.setText("Hello JKTV22!");
            button.setText("Click");
        }else{            
            label.setText("Hello World!");
            button.setText("Click Me!");
        }
        
    }
    @FXML
    private void newWindow(ActionEvent event) {
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
