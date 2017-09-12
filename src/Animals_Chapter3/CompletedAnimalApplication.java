package Animals_Chapter3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class CompletedAnimalApplication extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Animals");

        Group root = new Group();
        Canvas canvas = new Canvas(700, 700);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawAnimals(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawAnimals(final GraphicsContext gc)
    {
        Bear bear = new Bear();
        bear.draw(gc);
    }

}
