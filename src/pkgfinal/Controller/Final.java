/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.fxml;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author REBECCA
 */
public class Final extends Application {

    public static Stage stage;
    
    public static void main(String[] args)  {
       
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) {
        
        try {
            stage = primaryStage;
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene =new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("LoginPage");
        } catch (IOException ex) {
            Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }
    }
    
