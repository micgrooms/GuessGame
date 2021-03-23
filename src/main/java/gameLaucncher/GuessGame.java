package gameLaucncher;

public class GuessGame {
    //Player objects
    Player p1;
    Player p2;
    Player p3;

    //Game Start Method
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //Game Variables Global
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        //Random Number Generator
        int targetNumber = (int) (Math.random()*10);
        System.out.println("Im thinking of a number betweeen 0 and 9 ...");

        //If number is guessed
        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            //Player Methods
            p1.guess();
            p2.guess();
            p3.guess();

            //Learn Who Guessed what

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            //Find out if anyone is right


            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber){
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) //Only one correct answer is required

            {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player one two it right? " + p2isRight);
                System.out.println("Player one got it right? " + p3isRight);
                break;

            } else {
                //From the top
                System.out.println("Players will have to try again.");
            }
        }
    }
}
