import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.*;
import javafx.stage.*;
import javafx.event.*;
import java.lang.*;
public class Q extends Application {
public void start(Stage primaryStage) throws Exception {
    GridPane grid= new GridPane();
    TextField t1=new TextField();
    TextField t3=new TextField();
    TextField t4=new TextField();
    TextField t5=new TextField();
    grid.add(new Label("Paiteint Name"),0,1);
    grid.add(t1,2,1);
    
    grid.add(new Label("Paiteint Type"),0,3);
    RadioButton r1=new RadioButton("OPD");
    RadioButton r2=new RadioButton("ICU");
    RadioButton r3=new RadioButton("Portrad");
    RadioButton r4=new RadioButton("Dormentary");
    grid.add(r1,0,4);
    grid.add(r2,1,4);
    grid.add(r3,2,4);
    grid.add(r4,3,4);
    ToggleGroup question1= new ToggleGroup();
    r1.setToggleGroup(question1);
r2.setToggleGroup(question1);
r3.setToggleGroup(question1);
r4.setToggleGroup(question1);
grid.add(new Label("Admission Date"),0,5);
 TextField t2=new TextField();
    grid.add(t2,2,5);
    grid.add(new Label("Discharge Date"),0,6);
    grid.add(t3,2,6);
    grid.add(new Label("No.: of days"),0,8);
    grid.add(t4,2,8);
    Label ly=new Label("Bill Amount");
    grid.add(ly,0,9);
    grid.add(t5,2,9);
    Button b1=new Button("Clear all");
    Button b2=new Button("Calculate");
    Button b3=new Button("Exit");
    grid.add(b1,0,10);
    grid.add(b2,2,10);
    grid.add(b3,4,10);
    Scene s=new Scene(grid);
    primaryStage.setScene(s);
    primaryStage.show();
    b2.setOnAction(e->{
        int days=Integer.parseInt(t4.getText());
        t5.setText(String.valueOf(days*100));
    });
    b1.setOnAction(e->{
        
        t5.setText("");
    });

}
public static void main(String args[]){
    launch(args);
}
}
try{
    Statement 1;
    Statement 2;
    Statement 3;

}
catch(Exception 1){

}
catch(Exception 2){

}finally{
    Statement 4;
}