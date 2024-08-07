import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

abstract class MGame {
    protected abstract void games(int value);
    protected String chosenopt;
    public String getChosenopt(){
        return chosenopt;
    }
}

public class RockPaperScissorGame {
    private static HashMap<Integer, String> gsps = new HashMap<>();
    private static ArrayList<String> g = new ArrayList<>();
    private static Random random = new Random();

    static {
        g.add(" ");
        g.add("Stone");
        g.add("Paper");
        g.add("Scissors");
        g.add("Rock");

        gsps.put(1, g.get(1));
        gsps.put(2, g.get(2));
        gsps.put(3, g.get(3));
        gsps.put(4, g.get(4));
    }

    static class MyGameImpl extends MGame {
        @Override
        protected void games(int value) {
            if (gsps.containsKey(value)) {
                chosenopt = g.get(value);
                System.out.println("You chose " + value + " which is: " + gsps.get(value));
            } else {
                System.out.println("Sorry...\nInvalid Key...!!!");
                chosenopt = null;
            }
        }
    }

    static class ComGameImpl extends MGame {
        @Override
        protected void games(int value) {
            if (gsps.containsKey(value)) {
                chosenopt = g.get(value);
                System.out.println("I chose " + value + " which is: " + gsps.get(value));
            } else {
                System.out.println("Sorry...\nInvalid Key...!!!");
                chosenopt = null;
            }
        }
    }

    private static class Points {
        private static int count = 0;

        private Points(boolean p) {
            if (p) {
                count += 1;
            } else {
                count--;
            }
        }

        public int getCount() {
            return count;
        }
    }

    private static class SPSGame {
        Scanner sc = new Scanner(System.in);

        public void play() {
            System.out.println("Your choices: \n1.Stone \n2.Paper \n3.Scissors \n4.Rock");
            int yourValue = sc.nextInt();
            MyGameImpl playerGame = new MyGameImpl();
            playerGame.games(yourValue);

            int value = random.nextInt(3) + 1;
            ComGameImpl computerGame = new ComGameImpl();
            computerGame.games(value);

            String myOut = playerGame.getChosenopt();
            String compOut = computerGame.getChosenopt();

            boolean pt = false;
            Points p = new Points(pt);

            if (myOut != null && myOut.equals(compOut)) {
                pt = true;
                System.out.println("Hurray you have +1 Point");
                p = new Points(pt);
            } else {
                System.out.println("Sorry...\nBetter luck next time...");
            }
            System.out.println("Your points = " + p.getCount());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to proceed to game type 'yes' or 'Yes' otherwise 'No'");
        String val = sc.next();

        while (val.equalsIgnoreCase("yes")) {
            System.out.println("Want to start game type 1 or close means type 2");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Yes, continue the game ---------------->");
                    SPSGame game = new SPSGame();
                    game.play();
                    break;

                case 2:
                    System.out.println("Thank you, come again....");
                    return;

                default:
                    System.out.println("Invalid key detected");
            }
            System.out.println("If you want to proceed to game type 'yes' or 'Yes' otherwise 'No'");
            val = sc.next();
        }
    }
}
