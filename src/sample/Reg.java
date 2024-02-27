package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Reg
{
    public void NextButton(ActionEvent event) throws IOException
    {

        Stage primaryStage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 400, 550));
        primaryStage.show();

    }

    public void BackButton(ActionEvent event) throws IOException
    {

        Stage primaryStage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 400, 550));
        primaryStage.show();

    }
}
