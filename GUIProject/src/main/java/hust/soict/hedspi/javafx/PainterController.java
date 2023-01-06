/**
 * This class was created at 06-Jan-23 00:32:54
 * This class is owned by FaceNet Company
 */
package hust.soict.hedspi.javafx;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class PainterController {
    @FXML
    private Pane drawingAreaPane;

    public void clearButtonPressed(javafx.event.ActionEvent actionEvent) {
        drawingAreaPane.getChildren().clear();
    }

    public void drawingAreaMouseDragged(javafx.scene.input.MouseEvent mouseEvent) {
        Circle newCircle = new Circle(mouseEvent.getX(),
                mouseEvent.getY(), 4, Color.BLACK);
        drawingAreaPane.getChildren().add(newCircle);
    }
}
