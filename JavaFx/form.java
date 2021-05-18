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

public class form extends Application{
    public void start(Stage s1)throws Exception{
        s1.setTitle("Calc");
        Button b1=new Button("Add");
        TextField t1=new TextField();
        TextField t2=new TextField();
        Label l1=new Label("First Number");
        Label l2=new Label("Second Number");
        Button b2=new Button("Multiply");
        VBox vb=new VBox();
        vb.getChildren().addAll(l1,t1,l2,t2,b1,b2);
        b1.setOnAction(e->{
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            vb.getChildren().add(new Label("Ans:"+(a+b)));
        });
        b2.setOnAction(e->{
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            vb.getChildren().add(new Label("Ans: "+(a*b)));
        });
        s1.setHeight(500);
        s1.setWidth(700);
        
        Scene scene1=new Scene(vb);
        s1.setScene(scene1);
        s1.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}