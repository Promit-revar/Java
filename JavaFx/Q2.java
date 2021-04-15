import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.*;
import javafx.stage.Stage;
public class Q2 extends Application {


 public void start(Stage s)
 {

 s.setTitle("creating CheckBox");

 TilePane r = new TilePane();
 Label l = new Label("This is a check box");


 String st[] = { "Arnab", "Andrew", "Ankit" };

 r.getChildren().add(l);

 CheckBox c1 = new CheckBox(st[0]);
 CheckBox c2= new CheckBox(st[1]);
CheckBox c3 = new CheckBox(st[2]); 

 Label l1 = new Label(st[0]+" ");
 Label l2= new Label(st[1]+" ");
 Label l3= new Label(st[2]+" ");

 EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

 public void handle(ActionEvent e)
 {
 CheckBox c=((CheckBox)e.getSource());
 Label lt=new Label();
 if(c==c1)
{
 lt =l1;
 }
 else if(c==c2)
 {
lt=l2;
 }
 else
lt=l3;
 if (c.isSelected())
 lt.setText(((CheckBox)e.getSource()).getText()+ " selected ");
 else
 lt.setText(((CheckBox)e.getSource()).getText() + " not selected ");
 }

 };


 c1.setOnAction(event);
 c2.setOnAction(event);
 c3.setOnAction(event);

 r.getChildren().addAll(c1,l1,c2,l2,c3,l3);
 Scene sc = new Scene(r, 150, 200);
 s.setScene(sc);

 s.show();
 }

 public static void main(String args[])
 {
 // launch the application
 launch(args);
 }
}