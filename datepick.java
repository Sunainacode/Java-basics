//Program 3:
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.time.LocalDate;
public class datepick extends Application {
public void start(Stage primaryStage) throws Exception {
primaryStage.setTitle("DatePicker Experiment 1");
DatePicker datePicker = new DatePicker();
Button button = new Button("Read Date");
button.setOnAction(action -> {
LocalDate value = datePicker.getValue();
System.out.println("U have selected"+value);
});
HBox hbox = new HBox();
hbox.getChildren().addAll(datePicker,button);
Scene scene = new Scene(hbox, 300, 240);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
Application.launch(args);
}
}
/*
Program 4:
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Textfield extends Application {
public void start(Stage primaryStage) throws Exception {
primaryStage.setTitle("HBox Experiment 1");
TextField textField = new TextField();
StackPane hbox = new StackPane();
hbox.getChildren().add(textField);
Scene scene = new Scene(hbox, 200, 100);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
Application.launch(args);
}
}
Program 5:
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class Check extends Application {
public static void main(String[] args) {
launch(args);
}
public void start(Stage primaryStage) throws Exception {
HBox root=new HBox();
Button b1=new Button("Exit");
Button b2=new Button("Click Me");
TextField t1=new TextField();
Label l1=new Label("Welcome");
root.getChildren().add(t1);
root.getChildren().add(b1);
root.getChildren().add(b2);
Scene scene = new Scene(root, 300, 250);
scene.setCursor(Cursor.WAIT);
b1.setOnAction(e->{
System.out.println("I will exit");
System.exit(0);
});
b2.setOnAction(new EventHandler<ActionEvent>() {
public void handle(ActionEvent event) {
System.out.println("U have Clicked a button!"+
t1.getText());
}
});
primaryStage.setTitle("Hello World!");
primaryStage.setScene(scene);
primaryStage.show();
}
}
Program 6:
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class twoscene extends Application {
Scene scene1, scene2;
public void start(Stage primaryStage) {
primaryStage.setTitle("My First JavaFX GUI");
Label label1= new Label("This is the first scene");
Button button1= new Button("Go to scene 2");
button1.setOnAction(e -> primaryStage.setScene(scene2));
VBox layout1 = new VBox(20);
layout1.getChildren().addAll(label1, button1);
scene1= new Scene(layout1, 300, 250);
//Scene 2
Label label2= new Label("This is the second scene");
Button button2= new Button("Go to scene 1");
button2.setOnAction(e -> primaryStage.setScene(scene1));
VBox layout2= new VBox(20);
layout2.getChildren().addAll(label2, button2);
scene2= new Scene(layout2,300,250);
primaryStage.setScene(scene1);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}
Program 7:
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class listviewtest extends Application {
@Override
public void start(Stage primaryStage) throws Exception {
primaryStage.setTitle("ListView Experiment 1");
ListView listView = new ListView();
listView.getItems().add("Item 1");
listView.getItems().add("Item 2");
listView.getItems().add("Item 3");
Button button = new Button("Read Selected Value");
button.setOnAction(event -> {
ObservableList selectedIndices =
listView.getSelectionModel().getSelectedIndices();
for(Object o : selectedIndices){
System.out.println("o = " + o + " (" + o.getClass() + ")");
}
});
VBox vBox = new VBox(listView, button);
Scene scene = new Scene(vBox, 300, 120);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
Application.launch(args);
}

}
*/