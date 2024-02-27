package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.EventObject;
import java.util.ResourceBundle;

public class LoginController<FxmlControllerMain> implements Initializable
{
    @FXML
    private Label LoginMassageLabel;

    @FXML
    public TextField MobileNumberTextFieald;

    @FXML
    private PasswordField EpassField;
    private EventObject event;


    @FXML
    public void Login(ActionEvent event) throws IOException {
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("C:\\Users\\88016\\IdeaProjects\\untitled1\\src\\sample\\data.txt"));

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        if (br != null)
        {
            String st;
            while ((st = br.readLine()) != null)
            {
                String[] splitted = st.split(" ");




                    if (MobileNumberTextFieald.getText().equals(splitted[0]) && EpassField.getText().equals(splitted[1]))
                {


                    String num = splitted [0];
                    String name = splitted[3];
                    int amu = Integer.parseInt(splitted[11]);



                   ((Node)event.getSource()).getScene().getWindow().hide();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
                   Parent root = loader.load();
                  HomeController homecon =loader.getController();
                   homecon.showInformation(name,amu,num);


                  Stage primaryStage = new Stage();
                  primaryStage.setTitle("");
                  primaryStage.setScene(new Scene(root, 400, 550));
                  primaryStage.show();





                }

                else
                {
                LoginMassageLabel.setText("Invalid login, please try again");
            }


            }

        }

    }

    public void RegistrationButton() throws IOException {

        //Stage primaryStage =new Stage();

       // Parent root = FXMLLoader.load(getClass().getResource("Registration.fxml"));
      //  primaryStage.setTitle("");
        //primaryStage.setScene(new Scene(root, 400, 550));
        //primaryStage.show();


        FXMLLoader loader = new FXMLLoader(getClass().getResource("Registration.fxml"));
        Parent root = loader.load();

        Stage primaryStage = new Stage();
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 400, 550));
        primaryStage.show();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
