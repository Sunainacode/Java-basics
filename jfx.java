import java.sql.*;
import java.lang.Exception;
import javafx.application.Application;
import javafx.stage.Stage; 
import javafx.geometry.Insets;
import javafx.scene.paint.Color; 
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import static javafx.geometry.Pos.CENTER;
import javafx.scene.text.TextAlignment;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button; 
public class jfx extends Application {
public void start(Stage primaryStage) {
	primaryStage.setTitle("Server-Status Storekeeper");
	Label l=new Label("ServerStatus-StoreKeeper");
	l.setMaxWidth(1200);
	l.setPadding(new Insets(0,0,0,150));
	l.setStyle("-fx-background-color: black;-fx-text-fill: white; -fx-font: normal bold 15px 'serif'");
	Label l1=new Label("Server Configure");
	l1.setStyle("-fx-font: normal bold 30px 'serif'");
	l1.setTextAlignment(TextAlignment.CENTER);
	Label l2=new Label("Server is running");
	l2.setStyle("-fx-font: normal bold 18px 'serif'");
	l2.setPadding(new Insets(50,50,10,60));
	Label l3=new Label("MySQL host :");
	TextField t1=new TextField();
	Label l4=new Label("MySQL Port :");
	TextField t2=new TextField();
	Label l5=new Label("MySQL Database :");
	TextField t3=new TextField();
	Label l6=new Label("MySQL UserName :");
	TextField t4=new TextField();
	Label l7=new Label("MySQL Password :");
	PasswordField t5=new PasswordField();
	Button b1=new Button("Connect");	
	Button b2=new Button("Reset");
	HBox hb1=new HBox(l3,t1);
	hb1.setPadding(new Insets(0,0,0,33));
	HBox hb2=new HBox(l4,t2);
	hb2.setPadding(new Insets(0,0,0,33));
	HBox hb3=new HBox(l5,t3);
	hb3.setPadding(new Insets(0,0,0,5));
	HBox hb4=new HBox(l6,t4);
	HBox hb5=new HBox(l7,t5);
	hb5.setPadding(new Insets(0,0,0,8));
	HBox hb6=new HBox(b1,b2);
	hb6.setPadding(new Insets(10,0,10,130));
	VBox vb1=new VBox(20);
	vb1.getChildren().addAll(l1,l2,hb1,hb2,hb3,hb4,hb5,hb6);
	vb1.setPadding(new Insets(50,50,25,125));
	VBox vb2=new VBox(20);
	Label lk=new Label();
	lk.setPadding(new Insets(20,20,20,20));
	vb2.getChildren().addAll(l,vb1,lk);
	Scene s=new Scene(vb2,500,500);
	primaryStage.setScene(s);
        primaryStage.show();
	b1.setOnAction(event->{
		String s1=new String();
		s1=t1.getText();
		int s2=Integer.parseInt(t2.getText());
		String s3=t3.getText();
		String s4=t4.getText();
		String s5=t5.getText();
		try{
			Class.forName("com.mysql.jdbc.Driver"); 
			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students","Sunaina","password");
			Connection con=DriverManager.getConnection("jdbc:mysql://"+t1.getText()+":"+t2.getText()+"/"+t3.getText(),t4.getText(),t5.getText());
			System.out.println("Valid User");
		}
		catch(Exception ek){
			System.out.println(ek);
		}	
	});
	
	b2.setOnAction(event->{
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");

	});
	
}
public static void main(String[] args){
Application.launch(args);
}
}
