package Chapter16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebBrowser extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        WebView wv = new WebView();
        wv.setMaxSize(750,700);
        TextField entry = new TextField();
        entry.setMaxWidth(750);
        entry.setOnKeyTyped(e -> {
            String url;
            if(e.getCharacter().equals("\r")){
                url = entry.getText();
                if(!url.startsWith("http")){
                    url = "http://"+url;
                }
                wv.getEngine().load(url);
            }
        });
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setMaxSize(800,750);
        root.getChildren().addAll(entry,wv);
        Scene scene = new Scene(root,800,750);
        stage.setScene(scene);
        stage.setTitle("Browser example");
        stage.show();
    }
}
