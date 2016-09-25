import java.util.Scanner;

public class zorkGame {
public static void main(String[] args){
	@SuppressWarnings("resource")
	Scanner kb = new Scanner (System.in);
	
	System.out.println("welcome to infernal devices\n"
			+ "you are in a small clearing, north of a stone monolith which is covered in strange runes.\n"
			+ "to your north, west, and east is a strange forest, humming with an ethereal power.\n"
			+ "where will you go?");
	while(5<6){
	String ans = kb.nextLine();
	ans.toLowerCase();
	switch(ans){
		case "east":
		case "e":
		case "go east":
		case "west":
		case "w":
		case "go west":
		case "north":
		case "n":
		case "go north":
			System.out.println("you enter a forest. all around you are strange buzzing lights, flitting from tree to tree.\n"
					+ "a small man crosses your path but quickly scurries away.\n"
					+ "where will you go?");
			String ans2 = kb.nextLine();
			ans2.toLowerCase();
			switch(ans2){
				case "east":
				case "e":
				case "go east":
					System.out.println("you move further in to the forest.\n"
							+ "you see more creatures. one elf stops to wave at you.\n"
							+ "what will you do?");
					break;
				case "west":
				case "w":
				case "go west":
					System.out.println("the trees thin and you find yourself back at the clearing.\n"
							+ "a small fairy seems to have followed you, and they keep buzzing around your head.\n"
							+ "you're starting to feel hungry, but you're not sure where to get food.\n"
							+ "what will you do?");
					String food = kb.nextLine();
					food.toLowerCase();
					switch(food){
						case "forage":
						case "forage for food":
							System.out.println("you find three fruits that look vaguely like plums and a discarded candy bar.\n"
									+ "now what?");
							int asd = 4;
							while(asd<5){
							String eat = kb.nextLine();
							eat.toLowerCase();
							switch(eat){
								case "eat":
									System.out.println("eat the fruit or the candy?");
									break;
								case "eat fruit":
								case "eat a fruit":
								case "eat fruits":
								case "eat the fruits":
								case "eat the fruit":
									System.out.println("you bite into a fruit.\n"
											+ "it's sweet. you devour the rest of the fruit within seconds.\n"
											+ "now what?");
									asd = 6;
									break;
								case "eat candy":
								case "eat the candy":
								case "eat candy bar":
								case "eat the candy bar":
									System.out.println("you eat the candy. it tastes slightly stale, but it's chocolate, so you finish it anyway.\n"
											+ "you feel slightly sick, but you disregard it as the fairy who won't stop talking in your ear.\n"
											+ "what will you do?");
									asd = 6;
									break;
								default:
									System.out.println("i'm sorry, i don't understand.");
									break;
							}
							}
						case "south":
						case "s":
						case "go south":
							break;
						default:
							System.out.println("i'm sorry, i don't understand.");
							break;
					}
				case "follow the man":
				case "follow the small man":
				case "follow man":
				case "follow the little man":
				case "follow small man":
				case "follow little man":
					System.out.println("you run after the little man, but he weaves through the trees until you are even more lost than before.\n"
							+ "you're tired, hungry, and your arms are bleeding from where you scratched yourself on the trees.\n"
							+ "what will you do now?");
					break;
				case "south":
				case "s":
				case "go south":
					System.out.println("you move into a small, lit up area. there is a log on the ground.\n"
							+ "next to the log lies a book and a glass of water.\n"
							+ "what will you do?");
					int wat = 4;
					while (wat<5){
					String water = kb.nextLine();
					water.toLowerCase();
					switch(water){
						case "drink water":
						case "drink the water":
							System.out.println("what water?");
							break;
						case "take glass":
						case "pick up glass":
						case "pick up water":
						case "take water":
							System.out.println("taken.");
							wat = 6;
							String drink = kb.nextLine();
							drink.toLowerCase();
							switch(drink){
								case "drink water":
								case "drink the water":
									System.out.println("you drink the water. it doesn't really taste like water, but your thirst is quenched.\n"
											+ "what now?");
									break;
								default:
									System.out.println("i'm sorry, i don't understand.");
									break;
							}
						default:
							System.out.println("i'm sorry, i don't understand.");
							break;
					}
					}
					break;
				case "north":
				case "n":
				case "go north":
					System.out.println();
				default:
					System.out.println("i'm sorry, i don't understand.");
					break;
			}
			break;
		case "south":
		case "s":
		case "go south":
			System.out.println("now that you are closer to the monolith, you see that the runes are glowing softly.\n"
					+ "what will you do?");
			String rune = kb.nextLine();
			rune.toLowerCase();
			switch(rune){
			case "read runes":
			case "read the runes":
			case "read monolith":
				System.out.println("you peer at the runes. they look like a foreign language but suddenly they make sense in your head.\n"
						+ "they read 'THE INFERNAL DEVICES\n"
						+ "a text-based game created by tallyhawley.\n"
						+ "try to survive and reach the infernal devices.\n"
						+ "tessa, will, and jem depend on you.\n"
						+ "good luck.'\n"
						+ "now what?");
			default:
				System.out.println("i'm sorry, i don't understand.");
				break;
			}
			break;
		default:
			System.out.println("i'm sorry, i don't understand.");
			break;
	}
	}
}
}
