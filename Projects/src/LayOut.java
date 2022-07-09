import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class LayOut extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Rectangle redRectangle = new Rectangle(200,200, Color.RED);
        Rectangle yellowRectangle = new Rectangle(135,135,Color.YELLOW);
        Rectangle blueRectangle = new Rectangle(60,60,Color.BLUE);
        StackPane pane = new StackPane(redRectangle,yellowRectangle,blueRectangle);



        Scene scene = new Scene(pane,300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("GripPane Example");
        primaryStage.show();

    }
}
