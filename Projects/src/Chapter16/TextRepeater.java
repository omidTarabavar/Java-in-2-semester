package Chapter16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TextRepeater extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        TextField textField = new TextField();
        textField.setMaxWidth(250);
        Label repeatLabel = new Label();
        repeatLabel.setTextFill(Color.RED);
        repeatLabel.setFont(Font.font("Ariel",20));
        textField.setOnKeyTyped(keyEvent -> {
            if(keyEvent.getCharacter().equals("\r")){
                repeatLabel.setText("You typed: "+textField.getText());
                textField.setText("");
            }else {
                repeatLabel.setText("Last character typed: "+keyEvent.getCharacter());
            }
        });
        VBox root = new VBox();
        root.setSpacing(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(textField,repeatLabel);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Text Repeater");
        stage.setHeight(150);
        stage.setWidth(350);
        stage.show();
    }
}
