/*import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.geometry.Pos;
public class da extends Application {
public void start(Stage primaryStage) {
GridPane grid = new GridPane();
grid.add(new Label("Earned Score"),1, 0);
grid.add(new Label("Max Possible"),2, 0);
grid.add(new Label("Score #1:"), 0, 1);
grid.add(new TextField(), 1, 1);
grid.add(new TextField(), 2, 1);
grid.add(new Label("Score #2:"), 0, 2);
grid.add(new TextField(), 1, 2);
grid.add(new TextField(), 2, 2);
grid.add(new Label("Score #3:"), 0, 3);
grid.add(new TextField(), 1, 3);
grid.add(new TextField(), 2, 3);
grid.add(new Label("Score #4:"), 0, 4);
grid.add(new TextField(), 1, 4);
grid.add(new TextField(), 2, 4);
grid.add(new Label("Score #5:"), 0, 5);
grid.add(new TextField(), 1, 5);
grid.add(new TextField(), 2, 5);
grid.add(new Label("Score #6:"), 0, 6);
grid.add(new TextField(), 1, 6);
grid.add(new TextField(), 2, 6);
//create scene and put calcCourseScore inside
Scene scene1 = new Scene(grid);
primaryStage.setScene(scene1);
primaryStage.setTitle("Calculate Course Score");
primaryStage.setResizable(true);
primaryStage.show();
}
public static void main(String[] args){
Application.launch(args);
}
}
*/
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
class PortNumberException extends Exception{
    PortNumberException(){
        super("Invalid Port Number...");
    }
}
class UserValidationException extends Exception{
    UserValidationException(){
        super("Invalid");
    }
}
public class da extends Application{
    public void start(Stage first)throws Exception{
        first.setTitle("Server Status -StoreKeeper");
        TextField t1= new TextField();
        TextField t2= new TextField();
        TextField t3= new TextField();
        TextField t4= new TextField();
        
        PasswordField t5 = new PasswordField();
        Label l1=new Label("Server is running");
        Button b1=new Button("Connect");
        Button b2=new Button("Reset");
        GridPane grid=new GridPane();
       
        //grid.setHalignment(l1, HPos.RIGHT);
        grid.setHgap(10); 
        grid.setVgap(8);
        
        grid.add(new Label("Server Configure"),5,6);
        grid.add(l1,5,8);
        grid.add(new Label("MYSQL host:"),4,11);
        grid.add(t1,5,11);
        grid.add(new Label("Port:"),4,13);
        grid.add(t2,5,13);
        grid.add(new Label("MYSQL database:"),4,15);
        grid.add(t3,5,15);
        grid.add(new Label("MYSQL Username"),4,17);
        grid.add(t4,5,17);
        grid.add(new Label("MYSQL password"),4,19);
        grid.add(t5,5,19);
        grid.add(b1,6,20);
        
        grid.add(b2,7,20);
        
        b2.setOnAction(e->{
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");


        });
        b1.setOnAction(e->{
            String s=new String();
            s=t2.getText();
            String usr=new String();
        String pass=new String();
        usr=t4.getText();
        pass=t5.getText();
            try{
            if(s.length()>5){
                throw new PortNumberException();
            }
        
        
       
            if(usr.compareTo("root")!=0 || pass.compareTo("1234")!=0){
                throw new UserValidationException();
            }
            else{
                l1.setText("Valid");
            }
        }catch(PortNumberException ex){
                l1.setText(String.valueOf(ex.getMessage()));
            }
        catch(UserValidationException ex){
            l1.setText(String.valueOf(ex.getMessage()));
        }


        });
        Scene s=new Scene(grid);
        first.setScene(s);
        first.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}