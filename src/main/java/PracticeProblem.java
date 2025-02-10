import java.util.Scanner;

public class PracticeProblem{
	static Scanner sc;
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1(){
		sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		System.out.println(Math.abs(sc.nextDouble()));
	}

	public static void q2(){
		sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Input another number: ");
		double num2 = sc.nextDouble();
		sc.nextLine();
		System.out.println(Math.floor(num1/num2));
		System.out.println(Math.ceil(num1/num2));		
	}

	public static void q3(){
		sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		System.out.println(Math.round(Math.sqrt(sc.nextDouble())));
	}

	public static void q4(){
		sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Input another number: ");
		double num2 = sc.nextDouble();
		sc.nextLine();
		System.out.println(Math.pow(num1, num2));
	}

	public static void q5(){
		sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Input another number: ");
		double num2 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Input one more number: ");
		double num3 = sc.nextDouble();
		sc.nextLine();
		System.out.println(Math.max(Math.max(num1, num2), num3));
		System.out.println(Math.min(Math.min(num1, num2), num3));	
	}

	public static void q6(){
		sc = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		System.out.println(sc.nextLine().contains("on"));
	}

	public static void q7(){
		sc = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		System.out.println(sc.nextLine().equalsIgnoreCase("mango"));
		
	}
	public static void q8(){
		sc = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = sc.nextLine();
		System.out.print("Input a letter: ");
		String letter = sc.nextLine();
		System.out.println(word.indexOf(letter));
		System.out.println(word.lastIndexOf(letter));		
	}

	public static void q9(){
		sc = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = sc.nextLine();
		System.out.println("Your sentence is " + sentence.length() + " characters long");
		
	}
	public static void q10(){
		sc = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = sc.nextLine();
		System.out.print("Input a word to replace: ");
		String word1 = sc.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String word2 = sc.nextLine();
		System.out.println(sentence.replaceAll(word1, word2));
	}

	public static void q11(){
		sc = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = sc.nextLine().trim();
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
	}

	public static void q12(){
		sc = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = sc.nextLine();
		System.out.println(word.substring(0, 4));
		System.out.println(word.substring(word.length()-4));
	}
}
