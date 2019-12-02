package pkgfinal.fxml;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeController {

    @FXML
    private Button searchcustomer;

    @FXML
    private Button addcustomerdetails;

    @FXML
    private Button stockdetails;

    @FXML
    private Button addpurchasedetails;

    @FXML
    private Button records;

    @FXML
    private Button logout;

    @FXML
    void onCustomer(ActionEvent event) throws IOException {
         Parent home1 = FXMLLoader.load(getClass().getResource("addcustomerdetails.fxml"));
         Scene h1 = new Scene(home1);
         Stage app=(Stage)((Node)event.getSource()).getScene().getWindow();
         app.setScene(h1);
         app.show();
         app.setTitle(" Add Customer Details Page");
    }
     @FXML
      void onLogout(ActionEvent event)  throws IOException {
         Parent home1 = FXMLLoader.load(getClass().getResource("login.fxml"));
         Scene h1 = new Scene(home1);
         Stage app=(Stage)((Node)event.getSource()).getScene().getWindow();
         app.setScene(h1);
         app.show();
          app.setTitle("Login page");
   }

    @FXML
    void onPurchase(ActionEvent event) throws IOException {
            Parent home1 = FXMLLoader.load(getClass().getResource("savepurchasedetails.fxml"));
          Scene h1 = new Scene(home1);
          Stage app=(Stage)((Node)event.getSource()).getScene().getWindow();
          app.setScene(h1);
          app.show();
          app.setTitle("Save Purchase Details");

    }

    @FXML
    void onRecords(ActionEvent event) throws IOException {
          Parent home1 = FXMLLoader.load(getClass().getResource("records.fxml"));
         Scene h1 = new Scene(home1);
         Stage app=(Stage)((Node)event.getSource()).getScene().getWindow();
         app.setScene(h1);
         app.show();
         app.setTitle("Records ");
    }

    @FXML
    void onSearch(ActionEvent event)  throws IOException {
       Parent home1 = FXMLLoader.load(getClass().getResource("searchcustomer.fxml"));
         Scene h1 = new Scene(home1);
         Stage app=(Stage)((Node)event.getSource()).getScene().getWindow();
         app.setScene(h1);
         app.show();
          app.setTitle("Search Customer");
    }

    @FXML
    void onStock(ActionEvent event) throws IOException {
Parent home1 = FXMLLoader.load(getClass().getResource("stockdetails.fxml"));
         Scene h1 = new Scene(home1);
         Stage app=(Stage)((Node)event.getSource()).getScene().getWindow();
         app.setScene(h1);
         app.show();
          app.setTitle("Stock Details ");
    }

}
