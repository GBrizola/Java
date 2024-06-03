import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class JavaFXMain extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);
        scene.setFill(Color.BLACK);

        primaryStage.setScene(scene);

        Rectangle r1 = new Rectangle();
        r1.setX(10);
        r1.setY(10);
        r1.setHeight(80);
        r1.setWidth(80);
        r1.setFill(Color.CYAN);
        Random random = new Random();
        root.getChildren().add(r1);

        final long startNanoTime = System.nanoTime();

        new AnimationTimer(){
            double speedY = 3;
            double speedX = 4;
            @Override
            public void handle(long currentNanoTIme) {
                double timer = (currentNanoTIme - startNanoTime) / 10000000000.0;
                //ANIMATION
                int r = random.nextInt(256);
                int g = random.nextInt(256);
                int b = random.nextInt(256);
                if(r1.getX() > scene.getWidth() - r1.getWidth() || r1.getX() < 0) {
                    speedX *= -1;
                    r1.setFill(Color.rgb(r,g,b));
                }
                if(r1.getY() < 0 || r1.getY() > scene.getWidth() - r1.getWidth()){
                    r1.setFill(Color.rgb(r,g,b));
                    speedY *= -1;
                }
                    r1.setX(r1.getX() + speedX);
                    r1.setY(r1.getY() + speedY);

                //ANIMATION
            }
        }.start();

        primaryStage.show();
    }
}