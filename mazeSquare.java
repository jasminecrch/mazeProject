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

public class mazeSquare extends Canvas 
{
   private int player=0;
   private int x=0;
   private int y=0;
   
   GraphicsContext gc = getGraphicsContext2D();
   int [][]mazeBoard = new int [21][21];
   
   public mazeSquare()
   {
      super(525,525);
      
      try
      {
         Scanner scan = new Scanner(new File("mazeFile.txt"));
         
         while (scan.hasNextInt())
         {
            for(int i = 0;i<21;i++)
            {
               for(int j=0; j<21; j++)
               {
                  mazeBoard[j][i]=scan.nextInt();
                  
                  if(mazeBoard[j][i]==1)
                  {
                     
                     
                     draw(gc);
                                      
                  }
                  if(mazeBoard[j][i]==0);
                  {
                     player++;
                     x=j*25;
                     y=i*25;
                     drawWhite(gc);
                     
                     
                     if(player==1)
                     {
                        playerSquare(gc);
                        
                     }
                  }
                }
              }
           }
         }
       catch(FileNotFoundException s)
       {
         System.out.println("File does not exist");
       }
     }
    public void draw(GraphicsContext gc)
     {
      gc.fillRect(x,y,25,25);
     }
     public void drawWhite(GraphicsContext gc)
     {
      gc.setFill(Color.WHITE);
      gc.fillRect(x,y,25,25);
     }
     public void playerSquare(GraphicsContext gc)
     { 
      gc.setFill(Color.CYAN);
      gc.fillRect(x,y,25,25);
     }
     
     //moving square 
          
     
}
         
           
                   
      
   
       
           
     
     
      
    

   
    
      
      
         

