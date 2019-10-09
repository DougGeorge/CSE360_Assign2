/*
 * Douglas George ID: 1213123351 assignment 1
 * This program takes in values and adds or subtracts them together to get
 * the total of the integers input.
 */
package cse360assign2;

public class AddingMachine {

	/*
	 * The class AddingMachine includes a constructor, as well as 
	 * methods to add, subtract and get the total value from the
	 * integers input.
	 */
	
	private int total;
	private String history = "0";
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () { // gets the total from the integers and returns it.
		return total;
	}
	
	public void add (int value) { // adds an integer value from the total.
		total = total + value;
		history += " + " + value; // appends the value added to the history.
	}
	
	public void subtract (int value) { // subtracts an integer value from the total.
		total = total - value;
		history += " - " + value; // appends the value subtracted to history.
	}
		
	public String toString () { // creates the string of numbers to be printed.
		return history;
	}


	public void clear() { // clears the values to start over.
		history = "0";
	}
}
