package Animals_Chapter3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;

public class Bear
{
    public void draw(final GraphicsContext gc)
    {
        drawHead(gc);
        drawEars(gc);
        drawEyes(gc);
        drawNose(gc);
        drawMouth(gc);
    }

    private void drawMouth(final GraphicsContext gc)
    {
        gc.strokeLine(350, 475, 350, 550);
        gc.strokeArc(280, 455, 140, 100, 180, 180, ArcType.OPEN);
    }

    private void drawNose(final GraphicsContext gc)
    {
        gc.fillOval(320, 400, 60, 60);
    }

    private void drawEyes(final GraphicsContext gc)
    {
        gc.fillOval(250, 320, 30, 30);
        gc.fillOval(420, 320, 30, 30);
    }

    private void drawHead(final GraphicsContext gc)
    {
        gc.setLineWidth(5);
        gc.strokeOval(100, 100, 500, 500);
        gc.strokeOval(225, 350, 250, 250);
    }

    private void drawEars(final GraphicsContext gc)
    {
        gc.strokeOval(85, 85, 100, 100);
        gc.strokeOval(515, 85, 100, 100);
    }
}
