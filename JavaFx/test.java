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

public class test extends Application{
    public static void main(String args[]){
        launch(args);
    }
    public void start(Stage first) throws Exception{
        first.setTitle("Windows");
        Stage s2 = new Stage();
        s2.setTitle("Iama not a owner");
        s2.initOwner(first);
        Button bt=new Button("Click here!!");
        TextField tf=new TextField();
        VBox  vBox  = new VBox(tf,bt);
        first.setWidth(600);
        first.setHeight(400);
        s2.initModality(Modality.APPLICATION_MODAL); //WINDOW_MODAL
        StackPane l2=new StackPane();
        l2.getChildren().addAll(new Rectangle(100,100,Color.BLUE),new Label("TMC"));
        Scene s1=new Scene(vBox);
        Scene stk=new Scene(l2);
        first.setScene(s1);
        s2.setScene(stk);
        first.show();
        s2.show();
    }
}