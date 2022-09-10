package Chapter16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ImageExampleWithButton extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Image image = new Image("Files\\OrangeSquare.png");
        ImageView imageView = new ImageView(image);

        Button button1 = new Button();
        button1.setGraphic(imageView);
        Button button2 = new Button("Quit");
        button2.setGraphic(imageView);

        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.getChildren().addAll(button1,button2);

        Scene scene = new Scene(root,400,600);
        stage.setScene(scene);
        stage.setTitle("Image Example with Button");
        stage.show();

    }
}
