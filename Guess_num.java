package basic;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math; 

class Game{
	int count;
	int num;
	Scanner sc=new Scanner(System.in);
	Random unknown=new Random();
	int a=unknown.nextInt(100);
	public void play() {
	while(count<10){
	System.out.println("Enter your Number");
	num=sc.nextInt();
	if(num==a) {
	System.out.println("You are guess same number!");
	break;
	}
	if(a<num) {
		System.out.println("You Enter large number");
	}
	else if(a>num) {
		System.out.println("You Enter small number");
		
	}
	}
}
}
public class Guess_num {
public static void main(String[] args) {
	 Game g = new Game();
     g.play();
}
}
