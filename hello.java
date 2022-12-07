import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        mainmenu();
        }
    public static void game(){
        Scanner input = new Scanner(System.in);

        System.out.println("for one player, press 1. For two player, press 2");
        int player2 = 0;
        int mode = input.nextInt();

        System.out.println("You are player 1, choose a number between 0 and 100");
        int player1 = input.nextInt();

        if (mode == 1){player2 = (int)(Math.random()*101);}
        else if(mode == 2){
            System.out.println("You are player 2, choose a number between 0 and 100");
            player2 = input.nextInt();
        }

        System.out.println("player1 chose " + player1);
        System.out.println("player2 chose " + player2);

        if (player1 > player2){System.out.println("player1 wins");}
        else if(player2 > player1){System.out.println("player2 wins");}
        else if(player1 == player2){System.out.println("tie");}
        else{System.out.println("I don't know what happened");}
        mainmenu();
    }
    public static void mainmenu(){
        Scanner mainmenu = new Scanner(System.in);
        System.out.println("Welcome to WAR");
        System.out.println("To play, Type 1, to exit, type anything else");
        int play = mainmenu.nextInt();
        if (play == 1){
            game();
        }
        else{
            System.exit(0);
            mainmenu.close();
        }
    }
}
