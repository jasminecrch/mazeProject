/*This Code shows the main maze and the key events for the game-Jasmine Crouch*/
import java.util.*;
import java.text.*;
import java.io.*;
import java.lang.*;
import javafx.application.*;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.scene.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.animation.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import java.net.*;
import javafx.scene.shape.*;
import javafx.scene.canvas.GraphicsContext;

public class mazeProject extends Application 
{
   
   
   FlowPane fp = new FlowPane();
   Canvas c = new Canvas();
      
   GraphicsContext gc = c.getGraphicsContext2D();
      
    
   
   public void start (Stage stage)
   {
   
                 
    fp.getChildren().add(new mazeSquare());   
    c.setWidth(525);
    c.setHeight(525);
    int posY=150;
    int posX=0;
    gc.setFill(Color.CYAN);
    gc.fillRect(posX,posY,25,25);
    
    fp.getChildren().add(c);
    
    

    
    
    
    
    Scene scene = new Scene(fp ,600,600);
    stage.setScene(scene);
    stage.setTitle("Maze");
    stage.show();
    
    c.setOnKeyPressed(new KeyListenerDown());
    //c.setOnKeyReleased(new KeyListenerUp());

    c.requestFocus();

   
    
      
      
         
   }

public static void main(String[] args) 
{

   launch(args);
}
public class KeyListenerDown implements EventHandler<KeyEvent>//events to move player square
 {
   int posY=150;
   int posX=0;
   public void handle(KeyEvent e)//code to change the position of the square
    {
      if(e.getCode() == KeyCode.UP)
      {
         posY-=1;
      }
      if(e.getCode() == KeyCode.DOWN)
      {
        
        posY+=1; 
         
      }
      if(e.getCode() == KeyCode.LEFT)
      {
       posX-=1; 
         
      }
      if(e.getCode() == KeyCode.RIGHT)
      {
         
       posX+=1;  
      }
      }
    }

}

