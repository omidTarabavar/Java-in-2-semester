package Chapter16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ImageExampleWithScrollPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Image image = new Image("Files\\trees.jpg");
        ImageView imageView = new ImageView(image);

        ScrollPane scrollPane = new ScrollPane(imageView);
        scrollPane.setPrefViewportHeight(350);
        scrollPane.setPrefViewportWidth(250);

        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(scrollPane);

        Scene scene = new Scene(root,400,600);
        stage.setScene(scene);
        stage.setTitle("Image Example with ScrollPane");
        stage.show();
    }
}
