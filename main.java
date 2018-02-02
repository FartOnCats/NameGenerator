package main;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class main {
	public static WordLists wordlist = new WordLists();
	Scanner input = new Scanner(System.in);
	public static int randInt(int min, int max) {
	    //https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
		Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;;
	    return randomNum;
	}
	public static void println(Object name){
		System.out.print(name);
	}
	
	public static String name(){
		int index1 = randInt(1,wordlist.First.length - 1);
		int index2 = randInt(1,wordlist.Last.length - 1);
		int num1 = randInt(1,9);
		int num2 = randInt(1,9);
		String[] name = new String[4];
		name[0] = wordlist.First[index1];
		name[1] = wordlist.Last[index2];
		name[2] = String.valueOf(num1);
		name[3] = String.valueOf(num2);
		return Arrays.toString(name);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aylmao = 0;
		while(aylmao < 1){
			println(name() + "\n");
			println("Gen another? (999 to quit)");
			String read = input.nextLine();
			if(Integer.parseInt(read) == 999){
				aylmao = 220;
			
			}
		}
		
		
	}

}
