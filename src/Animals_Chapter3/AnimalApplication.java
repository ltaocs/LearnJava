package Animals_Chapter3;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class AnimalApplication extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws Exception
    {
        stage.setTitle("Animals");

        Group root = new Group();
        Canvas canvas = new Canvas(700, 700);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawAnimals(gc);
        root.getChildren().add(canvas);
        stage.setScene(new Scene(root));
        stage.show();

        stage.setX(300);
        stage.setY(-900);
    }

    private void drawAnimals(final GraphicsContext gc)
    {
        Animal animal = new Animal();
        animal.draw(gc);
    }

}
