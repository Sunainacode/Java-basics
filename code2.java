import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
public class code2 extends Application 
{
public void start(Stage primaryStage) throws Exception
 {
        primaryStage.setTitle("ImageView Experiment 1");
        FileInputStream input = new FileInputStream("E:\\trial.jpg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        HBox hbox = new HBox(imageView);
        Scene scene = new Scene(hbox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) 
   {
	launch(args);
    }
}