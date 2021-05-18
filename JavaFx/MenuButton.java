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
public class MenuButton extends Application {
public void start(Stage primaryStage) throws Exception {
primaryStage.setTitle("MenuButton Experiment");
MenuItem menuItem1 = new MenuItem("Option 1");
MenuItem menuItem2 = new MenuItem("Option 2");
MenuItem menuItem3 = new MenuItem("Option 3");
MenuButton menuButton = new MenuButton("Options", null, menuItem1,menuItem2, menuItem3);
menuItem1.setOnAction(event -> {
System.out.println("Option 3 selected via Lambda");
});
menuItem2.setOnAction(event -> {
System.out.println("Option 3 selected via Lambda");
});
menuItem3.setOnAction(event -> {
System.out.println("Option 3 selected via Lambda");
});
HBox hbox = new HBox();
Scene scene = new Scene(hbox, 200, 100);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
Application.launch(args);
}
}*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.input.KeyCombination;
import javafx.event.*;
public class MenuButton extends Application {
public void start(Stage stage) {
MenuBar menuBar = new MenuBar();
Menu fileMenu = new Menu("File");
Menu editMenu = new Menu("Edit");
Menu helpMenu = new Menu("Help");
MenuItem newItem = new MenuItem("New");
MenuItem openFileItem = new MenuItem("Open File");
MenuItem exitItem = new MenuItem("Exit");
MenuItem copyItem = new MenuItem("Copy");
MenuItem pasteItem = new MenuItem("Paste");
fileMenu.getItems().addAll(newItem, openFileItem, exitItem);
editMenu.getItems().addAll(copyItem, pasteItem);
menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
exitItem.setAccelerator(KeyCombination.keyCombination("Ctrl+X"));
// When user click on the Exit item.
exitItem.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
System.exit(0);
}
});
BorderPane root = new BorderPane();
root.setTop(menuBar);
Scene scene = new Scene(root, 350, 200);
stage.setTitle("JavaFX Menu ");
stage.setScene(scene);
stage.show();
}
public static void main(String[] args) {
Application.launch(args);
}
}