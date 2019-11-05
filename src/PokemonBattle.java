
/*BATTLE
 * damage()
 * prompt the user for their base stats in order to calculate damage
 * damage = ((((2* level +10)/250)+(attack / defense)* base +2)* modifier)
 * modifier = random * STAB
 * 			  random = 0.85+(Math.random()*0.25)
 * 
* 
*
*
*
*
*
*
*
*/

import java.util.*;

public class PokemonBattle {
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		battleStart();
		damage();

	}

	public static String battleStart() {
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.println("Which pokemon do you choose?");
		String pokeName = userInput.nextLine();
		System.out.println("You chose " + pokeName + "!");
		System.out.println("It's a Pokemon battle between Zebstrika and " + pokeName + "! Go!");
		return pokeName;
	}

	public static void damage() {
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer, what are your \" + pokeName + \"'s stats?");
		System.out.print("Level: ");
		int Level = userInput.nextInt();
		System.out.print("Attack: ");
		int Attack = userInput.nextInt();
		System.out.print("Defense: ");
		int Defense = userInput.nextInt();
		System.out.print("Base: ");
		int Base = userInput.nextInt();
		System.out.print("STAB: ");
		int STAB = userInput.nextInt();
		System.out.print("HP: ");
		int HP = userInput.nextInt();


	}

}
