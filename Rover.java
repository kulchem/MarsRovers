package marsRovers;

import java.util.Scanner;


public class Rover {

	enum Aspects {
	    N,S,E, W;

	        Aspects aspect;
	       public void Gezgin(Aspects aspect) {
	           this.aspect= aspect;
	   }
	}
		 
		
	
	 private String instr,firstAspect;       //instruction which was entered
	 private int row,column,locationX,locationY;    //using location 
		
	 //make up plateo
	   public void makeMatris(){
		   Scanner sc = new Scanner(System.in);
		    
	    	setRow(sc.nextInt());       //plateau row
	    	setColumn(sc.nextInt());     //plateau column
	    	
	    	int [][] plateo=new int [row][column];
	    	
	    	for(int i = 0;i<row;i++)
	    		   for(int j = 0;j<column;j++)
	    		      plateo[i][j]=0;
	    	 
	    	//****
	    	
	   }
	   
	   public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	//getting location and aspect
	   public void getLocAspect(){
		  
		  
		   
		   Scanner sc = new Scanner(System.in);
		   //d
		   
		   setLocationX(sc.nextInt()); //getting first row of location
	       setLocationY(sc.nextInt());  //getting first row of location
	       setFirstAspect(sc.next());   //getting first aspect of location
	       
	       
        
		   
	   }
	   
	   public int getLocationX(){ return locationX;}
	   public void setLocationX(int locationX){this.locationX=locationX;}
	   
	   public int getLocationY(){ return locationY;}
	   public void setLocationY(int locationY){this.locationY=locationY;}
	   
	   public String getFirstAspect(){ return firstAspect;}
	   public void setFirstAspect(String firstAspect){this.firstAspect=firstAspect;}
	   
	   
	   
	   
	   //getting instruction
	   public char[] getInstruction(){
		   
		   Scanner sc = new Scanner(System.in);
		   this.instr=sc.next();
	       int lnght=instr.length();
	    
	    	char []instruct=new char[lnght];
	    	
	    	for(int i=0; i<lnght;i++)
	    	{
	    		
	    		instruct[i]=instr.charAt(i);
	    		 //System.out.println(instruct[i]);
	    	}
	    	
	    	return instruct; //return ınstruct array
	    	}
	   
	    	//turning left
	    public void turnLeft(String firstAspect){
	    	
	    	if(firstAspect=="N")
	    		{ setFirstAspect("W");
	         	
	    		}
	           else
	              { if(firstAspect=="S"){
	            	  
	            	  setFirstAspect("E");
	  	         	
	            	  
	              }
	    	
	                else
	                	{if(firstAspect=="E")
	                	{
	                		setFirstAspect("N");
	        	         	
	                	}
	                	else
	                	{
	                		setFirstAspect("S");
	        	         	
	                	}}
	               }
	    	
	    	
	    	
	    /*	aspect= firstAspect ;  // consist aspect
	    	
	         
	         switch(aspect){//aspect
	         
	         case N:
	        	 firstAspect="W";
	         	return firstAspect;
	         	
	         case S:
	        	 firstAspect="E";
	         	return firstAspect;
	         case E:
	        	 firstAspect="N";
	         	return firstAspect;
	         default:
	        	 firstAspect="S";
	         	return firstAspect;
	    	}*/
	   }
	
	    //turning right
	    public void turnRight(String firstAspect){
              
	    	if(firstAspect=="N")
    		{ firstAspect="E";
	    		//setFirstAspect("E");
	    		
    		}
           else
              { if(firstAspect=="S"){
            	  setFirstAspect("W");
            	  
            	  
              }
    	
                else
                	{if(firstAspect=="E")
                	{
                		
                		setFirstAspect("S");
                		
                	}
                	else
                	{if(firstAspect=="W")
                		setFirstAspect("N");
                    	
                	}}
               }
	    	
	    /*	aspect=firstAspect;   //location[2] consist aspect
            
            switch(aspect){
            
            case N:
            	firstAspect="E";
            	return firstAspect;
            case S:
            	firstAspect="W";
            	return firstAspect;
            case E:
            	firstAspect="S";
            	return firstAspect;
            default:
            	firstAspect="N";
            	return firstAspect;
	    	
	    	
	    }*/
	    
            
}
	    //going 1 metric through defined aspect
	   public   <String> void goMCount(int locationX,int locationY,int row,int column,String firstAspect){
	    	
	    	
	    	
	    	int lastRow=locationX;
	    	int lastColumn=locationY;
	    	
	    	if(firstAspect=="N")
    		{  
    		     setLocationX(lastRow);
       	 
       	      if(lastColumn+1>column)
       	    	 setLocationY(1);
       	        else 
       		   setLocationY(lastColumn+1);
    		}
           else
              { if(firstAspect=="S"){
            	setLocationX(lastRow);
	            	 
	            	 if(lastColumn-1<column)
	            		setLocationY(column-1);
	            	   else 
	            		  setLocationY(lastColumn-1);
	            		   
            	  
                    }
    	
                else
                	{if(firstAspect=="E")
                	{
                		if(lastRow+1>row)
   	            		 setLocationX(1);
                			
   	            	   else    
   	            		setLocationX(lastRow+1);
                		
   	            	    setLocationY(lastColumn);
                	}
                	else
                	{   if(firstAspect=="W"){
                		    
                		    if(lastRow-1<row)
   	            			setLocationX(row-1);
   	            	            else    
   	            		        setLocationX(lastRow+1);
   	            	    
                		
                		//setLocationX(lastRow-1);
   	            	
   	            	setLocationY(lastColumn);}
                	}}
               }
	    	
	    	
	       /* aspect=firstAspect;
	        switch(aspect){
	        case N:
	             { 
	            	 locationX=lastRow;
	            	 
	            	 if(lastColumn+1>column)
	            		 locationY=1;
	            	   else 
	            		   locationY=lastColumn+1;
	            	 
	        	    
	              }
	             
	        case S:
	             { 
	            	 locationX=lastRow;
	            	 
	            	 if(lastColumn-1<column)
	            		 locationY=column-1;
	            	   else 
	            		   locationY=lastColumn-1;
	            	 
	            	
	        	     
	   	
	              }
	             
	        case E:
	             { 
	            	 if(lastRow+1>row)
	            		 locationX=1;
	            	   else 
	            		   locationX=lastRow+1;
	            	
	            	 
	            	 locationY=lastColumn;
	            	 
	        	     
	   	
	             }
	              
	        case W:
	             { 
	            	 
	            	 if(lastRow-1<row)
	            		 locationX=row-1;
	            	   else 
	            		   locationX=lastRow+1;
	            	 locationX=lastRow-1;
	            	 locationY=lastColumn;
	        	     
	   	
	             }
	                          
	        }*/
			
	    	
	    }

		

		
}
