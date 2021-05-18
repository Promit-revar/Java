import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout;
public class MyFxApp extends Application 
{
public void start(Stage s1) throws Exception
 {
        s1.setTitle("My First JavaFX App");
        Label label = new Label("Hello World, JavaFX !");
        Scene s2 = new Scene(label, 400, 200);
       
       s1.setScene(s2);
        s1.show();
    }

    public static void main(String[] args) 
   {
	launch(args);
    }
}
