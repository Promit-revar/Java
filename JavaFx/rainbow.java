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
public class rainbow extends Application{
    public void start(Stage first) throws Exception{
        first.setTitle("Owner Stage");
        Button b1=new Button("Click Here");
        GridPane grid = new GridPane();
        grid.add(new Label("want to see Rainbow circles?"),4, 4);
        grid.add(b1,5, 4);
        b1.setOnAction(e-> {
            Stage s2=new Stage();
            StackPane l2=new StackPane();
            l2.getChildren().addAll(new Circle(210,Color.VIOLET),new Circle(180,Color.PURPLE),new Circle(150,Color.BLUE),new Circle(120,Color.GREEN),new Circle(90,Color.YELLOW),new Circle(60,Color.ORANGE),new Circle(30,Color.RED));
            s2.initOwner(first);
            s2.initModality(Modality.WINDOW_MODAL);
            s2.setTitle("Rainbow Circles");
            Scene stk=new Scene(l2);
            
            s2.setScene(stk);
            s2.show();

        });
        
        Scene scene1 = new Scene(grid);
        first.setScene(scene1);
        first.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}