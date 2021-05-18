/*import javafx.application.Application;
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
public class splitter extends Application{
    public void start(Stage primaryst)throws Exception{
        TextField tf1=new TextField();
        primaryst.setHeight(600);
        primaryst.setWidth(700);
        primaryst.setTitle("String Splitter");
        Button b=new Button("Split");
        RadioButton r1=new RadioButton("Male");
        RadioButton r2=new RadioButton("Female");
        ToggleGroup gender= new ToggleGroup();
        r1.setToggleGroup(gender);
        r2.setToggleGroup(gender);
        VBox vb=new VBox();
        vb.getChildren().addAll(new Label("Enter String"),tf1,new Label("Gender"),r1,r2,b);
        Scene scene = new Scene(vb);
        b.setOnAction(e->{
            String [] s=tf1.getText().split(" ");
            if(r1.isSelected()){
                vb.getChildren().add(new Label("Sex :"+"Male"));
            }
            else{
                vb.getChildren().add(new Label("Sex :"+"Female"));
            }
            vb.getChildren().add(new Label("S :"+s[0]));


        });
        primaryst.setScene(scene);
        primaryst.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}*/
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
public class splitter extends Application {
 

    @Override
    public void start(Stage p) {
    p.setTitle("Test");
    Label l1=new Label("Server Configure");
    Label l2=new Label("Server is running");
     Label l=new Label("My sql Host");
     TextField t1=new TextField();
     Label ls=new Label("My sql Port");
      TextField t2=new TextField();
      Label ld=new Label("My sql Database");
      TextField t3=new TextField();
      Label lu=new Label("My sql Username");
      TextField t4=new TextField();
      Label lp=new Label("My sql password");
     PasswordField t5= new PasswordField();
     Button b1=new Button("Connect");
     Button b2=new Button("Reset");
     Label ln=new Label();
     VBox r=new VBox();
     r.getChildren().add(l1);
     r.getChildren().add(l2);
     r.getChildren().add(l);
     r.getChildren().add(t1);
     r.getChildren().add(ls);
     r.getChildren().add(t2);
     r.getChildren().add(ld);
     r.getChildren().add(t3);
     r.getChildren().add(lu);
     r.getChildren().add(t4);
     r.getChildren().add(lp);
     r.getChildren().add(t5);
     r.getChildren().add(b1);
     r.getChildren().add(b2);
     r.getChildren().add(ln);
     b1.setOnAction(e->{
    
     try{
     // Connection con = DriverManager.getConnection("jdbc:oracle:thin:@+"+t1.getText()+":"+t2.getText()+":"+t3.getText(),t4.getText(), t5.getText());
    ln.setText("Valid User");
     }
     catch(Exception ek)
     {
     ln.setText("Invalid User");
     }
     });
    Scene in=new Scene(r,300,600);
     p.setScene(in);
     p.show();
    }
    
     /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
     launch(args);
     }
    
    }