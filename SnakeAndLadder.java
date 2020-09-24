/**
 * 
 */
package com.assignment2.training;

/**
 * @author saideeksha
 *
 */
public class SnakeAndLadder {

	/**
	 * @param args
	 */
	public static final int noPlay=1;
	public static final int ladder=2;
	public static final int snake=3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable
		int position=0;
		
		//Computation
		int random = (int)(Math.random() * (6) + 1);
		int choice = (int)(Math.random() * (3) + 1);
		
		if(position<0) {
        	position=0;
        }
		while(position!=100) {
        	random = (int)(Math.random() * (6) + 1);
            switch(choice) {
            case noPlay: break;
            case ladder: position=position+random;
                         break;
            case snake:  position=position-random;
                         break;
            }
        	position+=random;
        	if((position+random)<=100){
        		position=position+random;
        	}
        }
        System.out.println("The Player is the winner: "+position);
	}

}