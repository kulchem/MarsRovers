package marsRovers;

import marsRovers.Rover;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	char a[]=new char[15];
        Rover g=new Rover();
        g.makeMatris();
        g.getLocAspect();
        
        
         a=g.getInstruction();
       
      for(int i=0;i<a.length;i++)
         { if(a[i]=='L')
      	   g.turnLeft(g.getFirstAspect());
           else
      	   {if(a[i]=='R')
      		   g.turnRight(g.getFirstAspect());
      	   else 
      		   if(a[i]=='M')
      		       g.goMCount(g.getRow(),g.getColumn(),g.getLocationX(),g.getLocationY(),g.getFirstAspect());
      	           
      		   else
      			   System.out.println("wrong instruction!!");
      		   }
      		       }
      
      
      System.out.print(g.getLocationX()+ " ");
      System.out.print(g.getLocationY() + " ");
      System.out.print(g.getFirstAspect() + "");
    }
}
