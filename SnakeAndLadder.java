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
		
        switch(choice) {
        
        case noPlay: System.out.println("The player stays in the same position:"+position);
                     break;
        case ladder: position=position+random;
                     System.out.println("The player moves ahead by number of position received by the die:"+position);
                     break;
        case snake:  position=position-random;
                     System.out.println("The player moves behind by number of position received by the die:"+position);
                     break;
        }
	}

}