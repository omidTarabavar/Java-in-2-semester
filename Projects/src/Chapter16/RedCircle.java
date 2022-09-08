package Chapter16;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RedCircle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        final double WIDTH = 400;
        final double HEIGHT = 400;
        Circle circle = new Circle(WIDTH/2,HEIGHT/2,20, Color.RED);
        Text heading = new Text(WIDTH/2-50,20,"Click on the red circle");
        Text  message = new Text(WIDTH/2-40,HEIGHT-20,"");
        Group root = new Group(heading,circle,message);
        Scene scene = new Scene(root,WIDTH,HEIGHT,Color.YELLOW);
        scene.setOnMouseMoved(mouseEvent -> {
            circle.setCenterX(mouseEvent.getX()-50);
            circle.setCenterY(mouseEvent.getY()-50);
        });
        scene.setOnMouseDragged(mouseEvent -> {
            circle.setCenterX(mouseEvent.getX()-50);
            circle.setCenterY(mouseEvent.getY()-50);
        });
        scene.setOnMousePressed(mouseEvent -> message.setText("Keep trying!!!"));
        scene.setOnMouseReleased(mouseEvent -> message.setText(""));

        stage.setScene(scene);
        stage.setTitle("Red Circle");
        stage.show();
    }
}
