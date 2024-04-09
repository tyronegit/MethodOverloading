public class Main {

    public static void main(String[] args) {

//       calculateScore("Tyrone", 500); //returns Name and initial score without returning score times 1000.

//       int newScore = calculateScore("Tyrone", 500);
//       System.out.println ("New score is " + newScore);

//       int new2Score = calculateScore(75);
//        System.out.println ("Second new score is " + new2Score);
        System.out.println ("New score is " + calculateScore ("Tyrone", 500)); // concatenating overloaded method with name
        System.out.println ("New score is " + calculateScore (10)); // concatenating overloaded method without name

        calculateScore ();
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println ("Player " + playerName + " scored " + score + " points");
        return  score * 1000;
    }

//    public static int calculateScore(int score) {
//
//        System.out.println ("Unnamed player scored " + score + " points");
//        return  score * 1000;
//    }

    public static int calculateScore(int score) {

        return calculateScore ("Anonymous", score);
    }

    public static int calculateScore() {

        System.out.println ("No player name, no player score.");

        return  0;
    }

}


