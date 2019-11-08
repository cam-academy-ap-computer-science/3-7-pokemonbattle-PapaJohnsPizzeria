
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
		String name = battleStart();
		int updatedHP = damage(name);
		statsTable(name, updatedHP);

	}

	public static String battleStart() {
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.print("Which pokemon do you choose? ");
		String pokeName = userInput.nextLine();
		System.out.println("You chose " + pokeName + "!");
		System.out.println("It's a Pokemon battle between Zebstrika and " + pokeName + "! Go!");
		return pokeName;
	}

	public static int damage(String name) {
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println("Trainer, what are your " + name + "'s stats?");
		System.out.print("Level: ");
		int level = userInput.nextInt();
		System.out.print("Attack: ");
		int attack = userInput.nextInt();
		System.out.print("Defense: ");
		int defense = userInput.nextInt();
		System.out.print("Base: ");
		int base = userInput.nextInt();
		System.out.print("STAB: ");
		int STAB = userInput.nextInt();
		System.out.print("HP: ");
		int HP = userInput.nextInt();
		System.out.println();
		double ans = ((((2* level +10)/250)+(attack / defense)* base +2)* ((0.85+(Math.random()*0.25)) * STAB));
		System.out.println(name +" sustained "+ ans +" points of damage.");
		int updatedHP = HP -10;
		System.out.println("HP, after damage, are now " + updatedHP);
		System.out.println();
		return updatedHP;
	}
	
	public static void statsTable(String name, int updatedHP) {
		System.out.println("Name	  " + name);
		System.out.println("Level	  70");
		System.out.println("------------------------------"); 
		System.out.println("HP	  " + updatedHP);
		System.out.println("ATTACK	  52");
		System.out.println("DEFENSE   51");
		System.out.println("SP. ATK   121");
		System.out.println("SP. DEF   81");
		System.out.println("SPEED 	  107");
		System.out.println("------------------------------"); 
	}

}
