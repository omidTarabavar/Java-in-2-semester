package Chapter16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;

public class VideoPlayer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        File file = new File("Trees.mp4");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mp = new MediaPlayer(media);
        MediaView mv = new MediaView(mp);
        Button playFromStart = new Button("Play from start");
        Button pauseButton = new Button("Pause");
        Button resumeButton = new Button("Resume");
        HBox buttonBox = new HBox(20);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(playFromStart,pauseButton,resumeButton);
        playFromStart.setOnAction(e -> {
            mp.seek(Duration.millis(0));
            mp.play();
        });
        pauseButton.setOnAction(e -> mp.pause());
        resumeButton.setOnAction(e -> mp.play());

        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(mv,buttonBox);

        Scene scene = new Scene(root,800,500);
        stage.setScene(scene);
        stage.setTitle("Video Example");
        stage.show();

    }
}
