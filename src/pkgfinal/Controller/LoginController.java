package pkgfinal.fxml;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public  class LoginController  {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;
   @FXML
    private Label fielderrorabel;
   
   @FXML
    private Button login;

    @FXML
    private Button register;


    @FXML
    void onLogin(ActionEvent event) throws IOException{
        
         Parent home1 = FXMLLoader.load(getClass().getResource("home.fxml"));
         Scene h1 = new Scene(home1);
         Stage app=(Stage)((Node)event.getSource()).getScene().getWindow();
         app.setScene(h1);
         app.show();
    }  
    @FXML
             
     void onRegister(ActionEvent event) throws IOException{
          Parent home1 = FXMLLoader.load(getClass().getResource("register.fxml"));
         Scene h2 = new Scene(home1);
         Stage app=(Stage)((Node)event.getSource()).getScene().getWindow();
         app.setScene(h2);
         app.show();
         
     }
}      
         
            
       
   
         

       