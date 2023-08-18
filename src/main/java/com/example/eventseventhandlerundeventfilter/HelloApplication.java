package com.example.eventseventhandlerundeventfilter;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException
    {

    BorderPane root = new BorderPane();
			BorderPane.setAlignment(root,Pos.CENTER);
    Scene scene = new Scene(root,400,400);

    StackPane paneup=new StackPane();
    Rectangle up=new Rectangle(50,50,50,50);
    Text up1=new Text("UP");
			up.setFill(Color.LIGHTGRAY);
			paneup.setPadding(new Insets(60,0,0,200));
			paneup.getChildren().addAll(up,up1);

    StackPane paneleft=new StackPane();
    Rectangle left=new Rectangle(50,50,50,50);
    Text left1=new Text("LEFT");
			left.setFill(Color.LIGHTGRAY);
			paneleft.setPadding(new Insets(155,0,0,100));
			paneleft.getChildren().addAll(left,left1);

    StackPane panedown=new StackPane();
    Rectangle down=new Rectangle(50,50,50,50);
    Text down1=new Text("DOWN");
			down.setFill(Color.LIGHTGRAY);
			panedown.setPadding(new Insets(155,0,0,200));
			panedown.getChildren().addAll(down,down1);

    StackPane paneright=new StackPane();
    Rectangle right=new Rectangle(50,50,50,50);
    Text right1=new Text("RIGHT");
			right.setFill(Color.LIGHTGRAY);
			paneright.setPadding(new Insets(155,0,0,300));
			paneright.getChildren().addAll(right,right1);


    Rectangle rect=new Rectangle(100.0,100.0,100.0,100.0);
			rect.setFill(Color.BLUE);
			rect.setCursor(Cursor.H_RESIZE);
			root.getChildren().addAll(rect,paneup,paneleft,panedown,paneright);

        scene.setOnKeyPressed(event->{
            if(event.getCode()== KeyCode.UP){
                up.setFill(Color.GREEN);;
                rect.setY(rect.getY()-10);
            }
            else if(event.getCode()==KeyCode.DOWN){
                down.setFill(Color.GREEN);
                rect.setY(rect.getY()+10);
            }

            else if(event.getCode()==KeyCode.LEFT) {
                left.setFill(Color.GREEN);
                rect.setX(rect.getX()-10);
            }

            else	if(event.getCode()==KeyCode.RIGHT){
                right.setFill(Color.GREEN);
                rect.setX(rect.getX()+10);
            }
        });

        rect.setOnMouseDragged(event->{
            rect.setX(event.getX());
            rect.setY(event.getY());
        });

        rect.setOnMouseEntered(event->{
            {
                rect.setFill(Color.GREEN);
            }
        });
        rect.setOnMouseExited(event->{
            rect.setFill(Color.BLUE);
        });

        scene.addEventHandler(KeyEvent.KEY_RELEASED, event->{
            if(event.getCode()==KeyCode.UP) {
                up.setFill(Color.LIGHTGRAY);
            }else if(event.getCode()==KeyCode.DOWN) {
                down.setFill(Color.LIGHTGRAY);
            }
            if(event.getCode()==KeyCode.LEFT) {
                left.setFill(Color.LIGHTGRAY);
            }else if(event.getCode()==KeyCode.RIGHT) {
                right.setFill(Color.LIGHTGRAY);
            }
        });

			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();

}

    public static void main(String[] args) {
        launch();
    }
}