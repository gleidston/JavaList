package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


       Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


    }




  public static void main(String[] args) {
    String product1 = "computer" ;
    String product2 = "officer desk ";

    int age = 30 ;
    int  code = 5290;
    char  gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double  measure = 53.234567;

    System.out.printf("comuter witch  price is : %.2f %n office desk wicth price is %.2f %n%n record %d years old code %d and gender %c %n%n measue witch eight decimal places %.8f rounded (three decimals placed ): %.3f   ",price1,price2,age,code,gender,measure,price1);
    Locale.setDefault(Locale.US);
    System.out.printf("us decimal point %.2f!",price2);
  }

}
