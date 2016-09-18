import java.util.Scanner;

public class zorkGame {
public static void main(String[] args){
	Scanner kb = new Scanner (System.in);
	
	System.out.println("welcome to infernal devices\n"
			+ "you are in a small clearing, north of a stone monolith which is covered in strange runes.\n");
	String name = kb.next();
	System.out.println("hello, "+name+"! how old are you?");
	String ans = kb.next();
}
}
