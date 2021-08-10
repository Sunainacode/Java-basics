import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.shape.Circle; 
import javafx.scene.paint.Color; 
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.collections.ObservableList; 
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class javafxx extends Application {
public void start(Stage primaryStage) {
	primaryStage.setTitle("Owner Stage");
	Label l1=new Label("Want to see Rainbow circles?");
	Button b1=new Button("Click Here");
	HBox hb1=new HBox(l1,b1);
	Scene s1=new Scene(hb1,500,500);
	primaryStage.setScene(s1);
        primaryStage.show();
	b1.setOnAction(event->{
		Stage stage = new Stage();
	        stage.initModality(Modality.WINDOW_MODAL);
        	stage.setTitle("Rainbow Concentric Circles");
	        stage.initOwner(primaryStage);
		Circle c1=new Circle(300,150,100);
		c1.setFill(Color.VIOLET);
		c1.setStroke(Color.BLACK);
		Circle c2=new Circle(300,150,90);
		c2.setFill(Color.INDIGO);
		c2.setStroke(Color.BLACK);
		Circle c3=new Circle(300,150,80);
		c3.setFill(Color.BLUE);
		c3.setStroke(Color.BLACK);
		Circle c4=new Circle(300,150,70);
		c4.setFill(Color.GREEN);
		c4.setStroke(Color.BLACK);
		Circle c5=new Circle(300,150,60);
		c5.setFill(Color.YELLOW);
		c5.setStroke(Color.BLACK);
		Circle c6=new Circle(300,150,50);
		c6.setFill(Color.ORANGE);
		c6.setStroke(Color.BLACK);
		Circle c7=new Circle(300,150,40);
		c7.setFill(Color.RED);
		c7.setStroke(Color.BLACK);
		StackPane stackk = new StackPane();
		stackk.setMargin(c1,new Insets(100,100,100,100));
		ObservableList list=stackk.getChildren();
		list.addAll(c1,c2,c3,c4,c5,c6,c7);
		Scene s2=new Scene(stackk);
		stage.setScene(s2);
        	stage.setWidth(600);
        	stage.setHeight(300);
		stage.show();
	});     
}
public static void main(String[] args){
Application.launch(args);
}
}
