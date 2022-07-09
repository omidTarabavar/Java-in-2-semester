import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class SmileyFace extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Circle face = new Circle(125,125,80);
        face.setFill(Color.YELLOW);
        face.setStroke(Color.RED);

        Circle rightEye = new Circle(86,100,10);
        rightEye.setFill(Color.YELLOW);
        rightEye.setStroke(Color.BLUE);

        Circle leftEye = new Circle(162,100,10);
        leftEye.setFill(Color.YELLOW);
        leftEye.setStroke(Color.BLUE);

        Arc mouth = new Arc(125,150,45,35,0,-180);
        mouth.setFill(Color.YELLOW);
        mouth.setStroke(Color.BLUE);
        mouth.setType(ArcType.OPEN);

        Text caption = new Text(80,240,"Smiley Face");
        caption.setFill(Color.BLUE);
        caption.setFont(Font.font("Verdana",15));

        Group root = new Group(face,rightEye,leftEye,mouth,caption);

        Scene scene = new Scene(root,250,275,Color.YELLOW);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Smiley Face");

        primaryStage.show();

    }
}
