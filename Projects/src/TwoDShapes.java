import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class TwoDShapes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Rectangle rectangle = new Rectangle(50,50,50,100);
        rectangle.setStroke(Color.BLUE);
        rectangle.setFill(Color.WHITE);

        Circle circle = new Circle(120,80,20);
        circle.setFill(Color.RED);
        circle.setStroke(Color.RED);

        Arc elipse = new Arc(200,80,30,20,0,360);
        elipse.setStroke(Color.VIOLET);
        elipse.setType(ArcType.OPEN);
        elipse.setFill(Color.WHITE);

        Line line = new Line(0,180,50,250);
        line.setStroke(Color.GREEN);

        Arc arc1 = new Arc(100,180,20,30,0,120);
        arc1.setStroke(Color.VIOLET);
        arc1.setFill(Color.YELLOW);
        arc1.setType(ArcType.CHORD);

        Arc arc2 = new Arc(200,180,30,25,0,90);
        arc2.setStroke(Color.ORANGE);
        arc2.setFill(Color.ORANGE);
        arc2.setType(ArcType.ROUND);

        HBox hBox1 = new HBox(10);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.getChildren().addAll(rectangle,circle,elipse);

        HBox hBox2 = new HBox(10);
        hBox2.setAlignment(Pos.CENTER);
        hBox2.getChildren().addAll(line,arc1,arc2);

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.setBackground(Background.EMPTY);
        root.getChildren().addAll(hBox1,hBox2);

        Scene scene = new Scene(root,250,275,Color.WHITE);

        primaryStage.setScene(scene);
        primaryStage.setTitle("2D Shapes");
        primaryStage.show();



    }
}
