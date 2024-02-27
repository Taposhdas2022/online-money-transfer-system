package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController

{
    @FXML
    private AnchorPane Showuserlabel;

    @FXML
    private Label UsernameLabel;

    @FXML
    private Label BalanceLabel;

    @FXML
    private Button SendMoneyButton;

    @FXML
    private Button MobileRechargeButton;

    @FXML
    private Button CashOutButton;

    @FXML
    private Button AddMoneyButton;

    @FXML
    private Button LogoutButton;

    @FXML
    private String nametf;

    @FXML
    private int amount;

    @FXML
    private TextField MobileNumberTextFieald;

    private Object SendMoney;


    public void SendMoneyButton(ActionEvent event) throws IOException
    {



        ((Node)event.getSource()).getScene().getWindow().hide();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("s.fxml"));
                    Parent root = loader.load();



                    Stage primaryStage = new Stage();
                    primaryStage.setTitle("");
                    primaryStage.setScene(new Scene(root, 400, 550));
                    primaryStage.show();


                }


    public void MobileRechargeButton(ActionEvent event) throws IOException
    {
        Stage primaryStage =new Stage();
        ((Node)event.getSource()).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("MobileRecharge.fxml"));
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 400, 550));
        primaryStage.show();


    }
    public void CashOutButton(ActionEvent event) throws IOException
    {
        Stage primaryStage =new Stage();
        ((Node)event.getSource()).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("CashOut.fxml"));
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 400, 550));
        primaryStage.show();


    }
    public void AddMoneyButton(ActionEvent event) throws IOException
    {
        Stage primaryStage =new Stage();
        ((Node)event.getSource()).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("AddMoney.fxml"));
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 400, 550));
        primaryStage.show();




    }





    public void LogoutButton(ActionEvent event) throws IOException
    {


        Stage primaryStage =new Stage();
        ((Node)event.getSource()).getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 400, 550));
        primaryStage.show();


    }

    @FXML
    private Label smabLabel;

    public void showInformation(String name, int text, String num)
    {
        int a = text;

        UsernameLabel.setText(name);
        BalanceLabel.setText(String.valueOf(a));








    }

    public void showInformation(String name, String text)
    {
        showInformation(text, text);
        UsernameLabel.setText(name);
        BalanceLabel.setText(String.valueOf(text));
    }
}

