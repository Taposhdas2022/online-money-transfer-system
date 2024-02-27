package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;

public class S {

    @FXML
    private Button send;

    @FXML
    private TextField smnTF, cmnTF, aTF, pTF;


    public void send(ActionEvent event) throws IOException, NumberFormatException {
        BufferedReader br = null;


        try {
            br = new BufferedReader(new FileReader("C:\\Users\\88016\\IdeaProjects\\untitled1\\src\\sample\\data.txt"));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (br != null) {
            String st;
            String s;

            while ((st = br.readLine()) != null) {
                while ((s = br.readLine()) != null) {
                    //
                    String[] splitted = st.split(" ");

                    String[] sp = s.split(" ");


                    if (smnTF.getText().equals(splitted[0]) && pTF.getText().equals(splitted[1]) && cmnTF.getText().equals(sp[0])) {


                        int A = Integer.parseInt(aTF.getText());


                        int Samu = Integer.parseInt(splitted[11]);

                        int Camu = Integer.parseInt(sp[11]);

                        int sum = 0;

                        sum = Samu - A;

                        int sum1 = 0;

                        sum1 = Camu + A;


                        System.out.println(Samu);
                        System.out.println(Camu);


                        System.out.println("User Amount : " + sum);

                        System.out.println("Client Amount : " + sum1);


                    }


                }

            }


        }


    }

    public void CancelOnAction(ActionEvent event) throws IOException {
        ((Node) event.getSource()).getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent root = loader.load();


        Stage primaryStage = new Stage();
        primaryStage.setTitle("");
        primaryStage.setScene(new Scene(root, 400, 550));
        primaryStage.show();


    }
}
