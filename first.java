package javafx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;//Scene object-add nodes
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class first extends Application {
        @Override
    public void start(Stage primaryStage) {
        //stage,scene,nodes
        Text t1=new Text();
        t1.setText("Name:");
        TextField tf1=new TextField();//name
        Text t2=new Text();
        t2.setText("Relationship:");
        TextField tf2=new TextField();//relationship
        Text t3=new Text();
        t3.setText("Date of birth:");
        TextField tf3=new TextField();//dob
        Text t4=new Text();
        t4.setText("Favourite Color:");
        TextField tf4=new TextField();//favourite color
        Text t5=new Text();
        t5.setText("Favourite Place:");
        TextField tf5=new TextField();//favourite place
        Text t6=new Text();
        t6.setText("Phone Number:");
        TextField tf6=new TextField();//phone number
        Button btn = new Button();
        btn.setText("Submit");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Name is "+tf1.getText());
                System.out.println("Relationship is "+tf2.getText());
                System.out.println("Date of birth is "+tf3.getText());
                System.out.println("Favourite Color is "+tf4.getText());
                System.out.println("Favourite Place is "+tf5.getText());
                System.out.println("Phone Number is "+tf6.getText());
            }
        });
        GridPane root = new GridPane();
        root.addRow(0,t1,tf1);
        root.addRow(1,t2,tf2);
        root.addRow(2,t3,tf3);
        root.addRow(3,t4,tf4);
        root.addRow(4,t5,tf5);
        root.addRow(5,t6,tf6);
        root.addRow(6,btn);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("My Family Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
    	Application.launch(args);
    }
}