/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.fxml;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author REBECCA
 */
public class RegisterController {
    @FXML
    private TextField fullname;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField confirmpassword;
     @FXML
    private Button reg;

    @FXML
    private Button back;
    
    
       @FXML
    void onBack(ActionEvent event) throws IOException  {
       Parent home1 = FXMLLoader.load(getClass().getResource("login.fxml"));
         Scene h1 = new Scene(home1);
         Stage app=(Stage)((Node)event.getSource()).getScene().getWindow();
         app.setScene(h1);
         app.show();
    }

    @FXML
    void onReg(ActionEvent event) {

    }

    
    
}



