package main;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class main {
	public static WordLists wordlist = new WordLists();
	Scanner input = new Scanner(System.in);
	
	//returns a random in between 2 numbers
	public static int randInt(int min, int max) {
	    //https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
		Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;;
	    return randomNum;
	}
	//used so i dont have to type out System.out.println(); 100 times
	public static void println(Object name){
		System.out.print(name);
	}
	//returns a random name
	public static String name(){
		//gets a random index from First list
		int index1 = randInt(1,wordlist.First.length - 1);
		//get random index from 2nd list
		int index2 = randInt(1,wordlist.Last.length - 1);
		//just 2 random numbers to add to name
		int num1 = randInt(1,9);
		int num2 = randInt(1,9);
		//define name array and add elements to it
		String[] name = new String[4];
		name[0] = wordlist.First[index1];
		name[1] = wordlist.Last[index2];
		name[2] = String.valueOf(num1);
		name[3] = String.valueOf(num2);
		return Arrays.toString(name);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//aylmao is used to break the loop
		int aylmao = 0;
		while(aylmao < 1){
			println(name() + "\n");
			println("Gen another? (999 to quit)");
			String read = input.nextLine();
			if(read.equals("999")){
				aylmao = 220;
				//set aylmao to 220 breaking the while loop
			}
		}
		
		
	}

}
