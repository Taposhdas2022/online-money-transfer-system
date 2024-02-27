package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;





public class RegistrationController
{
    private boolean _clickMeMode = true;

    private int amount = 0;

    @FXML
    private TextField mntf;
    @FXML
    private TextField nametf;
    @FXML
    private TextField gendertf;
    @FXML
    private TextField dobtf;
    @FXML
    private TextField eatf;
    @FXML
    private TextField addtf;
    @FXML
    private TextField citytf;
    @FXML
    private TextField nidntf;
    @FXML
    private PasswordField passtf;
    @FXML
    private PasswordField cpasstf;
    @FXML
    private TextField fnametf;

    @FXML
    private Label reglabel;
    @FXML
    private Label CpnmLabel;
    @FXML
    private Label mobilematchbutton;

    @FXML
    private Label maalertlabel;


    @FXML
    private Label nidalertlabel;

    @FXML
    private Label mnalertlabel;


    public void SubmitButton(ActionEvent event) throws IOException {
        FileInputStream in = null;
        String mobilenumber = mntf.getText();
        String name = nametf.getText();
        String fname = fnametf.getText();
        String dob = dobtf.getText();
        String emaila = eatf.getText();
        String Address = addtf.getText();
        String city = citytf.getText();
        String nidnumber = nidntf.getText();
        String password = passtf.getText();
        String cpassword = cpasstf.getText();
        String gender = gendertf.getText();


        try
        {



            File f1=new File("C:\\Users\\88016\\IdeaProjects\\untitled1\\src\\sample\\data.txt");
            String[] words=null;
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            String s;

            int count=0,a=0,b=0;
            while((s=br.readLine())!=null)
            {
                words = s.split(" ");
                for (String word : words)
                {
                    if (word.equals(mobilenumber))
                    {
                        count++;

                    }
                    if (word.equals(emaila))
                    {

                    a++;
                }
                    if (word.equals(nidnumber))
                {
                    b++;

                }
                }
            }


             if(count !=0)
             {
                 CpnmLabel.setText("This mobile number already exists");

             }

            else if(a !=0)
            {
                CpnmLabel.setText("this email number already exists");

            }

            else if(b !=0)
            {
                CpnmLabel.setText("this Nid number already exists");

            }


            else if (!password.equals(cpassword))
            {
                CpnmLabel.setText(" Confirm Password not match !");

            }


                            else
                            {
                                FileWriter Writer = new FileWriter("C:\\Users\\88016\\IdeaProjects\\untitled1\\src\\sample\\data.txt");
                                Writer.write(""+mobilenumber+" "+password+" "+cpassword+" "+name+" "+gender+" "+fname+" "+dob+" "+emaila+" "+Address+" "+city+" "+nidnumber+" "+amount);



                                ((Node)event.getSource()).getScene().getWindow().hide();
                                FXMLLoader loader = new FXMLLoader (getClass().getResource("Reg.fxml"));
                                Parent root = loader.load();


                                Stage primaryStage = new Stage();
                                primaryStage.setTitle("");
                                primaryStage.setScene(new Scene(root, 400, 550));
                                primaryStage.show();


                                Writer.close();
                            }




                            fr.close();






                        }
        catch (Exception e)
                        {
                            System.out.println("Error");


                        }


                    }





                    public void CancelButton() throws IOException {
                    Stage primaryStage =new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
                    primaryStage.setTitle("");
                    primaryStage.setScene(new Scene(root, 400, 550));
                    primaryStage.show();

                }

                }


