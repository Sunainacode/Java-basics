import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
public class gui extends Application{
public void start(Stage primaryStage) throws Exception{
primaryStage.setTitle("Grade Calculator");
TextField jTextField1=new TextField();
TextField jTextField2=new TextField();
TextField jTextField3=new TextField();
TextField jTextField4=new TextField();
TextField jTextField5=new TextField();
Button b1=new Button("Get Total");
Button b2=new Button("Get Grade");
Button b3=new Button("Exit");
b1.setOnAction(action->{
	int e=Integer.parseInt(jTextField1.getText());
	int as=Integer.parseInt(jTextField2.getText());
	int gk=Integer.parseInt(jTextField3.getText());
	jTextField4.setText(" "+e+as+gk);
});
b2.setOnAction(action->{
	int e=Integer.parseInt(jTextField1.getText());
	int as=Integer.parseInt(jTextField2.getText());
	int gk=Integer.parseInt(jTextField3.getText());
	if((e+as+gk)/3>80){
		jTextField5.setText("A");
	}
	else if((e+as+gk)/3>65){
		jTextField5.setText("B");
	}
	else if((e+as+gk)/3>50){
		jTextField5.setText("C");
	}
	else{
		jTextField5.setText("D");
	}
});
/*b3.setOnAction(action->{
    ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
});
*/

}
public static void main(String args[]){
	Application.launch(args);
}
}