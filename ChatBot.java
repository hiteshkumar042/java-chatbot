import java.util.Scanner;

public class ChatBot{
    public static void main(String[] args) {
        //set up the Scanner.
        Scanner scan= new Scanner(System.in);

        //Collect user name and store it.
        System.out.println("Hello. What is your name?");
        String name=scan.nextLine();
        //collect user's home and store it
        System.out.println("\nHi "+name+"! I'm ChatBot. Where are you from?");
        String home = scan.nextLine();

        System.out.println("\nI hear it's beautiful at "+home+ "!. I'm from a place called Bridgelabz");

        //collect user age
        System.out.println("\nHow old are you? ");
        int age = scan.nextInt();

        System.out.println("\nYou are "+age+", I'm "+(20/age)+" times older than you.");

       //collect user favorite language
        System.out.println("\nEnough about me. What's your favorite programming languages? (Don't say Python)");
        scan.nextLine();
        String language = scan.nextLine();

        System.out.println("\n"+language+", that's great! Nice chatting with You. Have a nice day Mr. "+name+".");


    }
}