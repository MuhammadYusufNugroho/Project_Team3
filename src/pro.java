import java.util.Arrays;
import java.util.Scanner;

public class pro {
    public static void main(String[] args) {
        //        Flow intro -> lvl 1 -> lvl 2 -> lvl 3
        questions show = new questions();

        boolean isWon = false;
        boolean retry = false;
        int overallScore = 0;

        do {
            overallScore = 0;
            introduction();

            System.out.print("\nLevel 1" + "\n\t");
            for(int x = 0; x < show.Quest1.length; x++){
                System.out.print(show.Quest1[x] + "     ");
            }

            int level1Score = level1();
            overallScore += level1Score;
            if (level1Score < 70) {
                retry = promptRetry();
                continue;
            }

            System.out.print("\nLevel 2" + "\n\t");
            for(int x = 0; x < show.Quest2.length; x++){
                System.out.print(show.Quest2[x] + "     ");
            }

            int level2Score = level2();
            overallScore += level2Score;
            if (level2Score < 70) {
                retry = promptRetry();
                continue;
            }

            System.out.print("\nLevel 3" + "\n\t");
            for(int x = 0; x < show.Quest3.length; x++){
                System.out.print(show.Quest3[x] + "     ");
            }

            int level3Score = level3();
            overallScore += level3Score;
            if (level3Score < 70) {
                retry = promptRetry();
                continue;
            }

            retry = false;
            isWon = true;
        } while(retry);

        if (isWon) {
            System.out.println("Overall score: " + overallScore);
            System.out.println("You Win!!");
            System.out.println("Press enter to continue");
            try{System.in.read();}
            catch(Exception e){}
        }
    }

    static boolean promptRetry() {
        System.out.println("You lose!! Try again...");
        System.out.println("do you want to retry? [y/t]");
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        return (in.equals("Y") || in.equals("y"));
    }

    public static class questions{
        //        Questions
        String[] Quest1 = {"d", "e", "t", "l", "i"};
        String[] Quest2 = {"s", "e", "c", "a", "e", "n"};
        String[] Quest3 = {"h", "k", "r", "n", "e", "o"};

        //        Answer
        String[] Answer1 = {"tie", "die", "lie", "tied", "lied", "diet", "title", "tile"};
        String[] Answer2 = {"sec", "can", "cane", "scan", "scene", "sen", "case", "cease"};
        String[] Answer3 = {"honk", "honker", "roe", "ore", "her", "hen", "one", "neo", "hero"};
    }

    public static void introduction(){
//        Variables String for introduction
        String rules1 = "\n1. Create a word using given characters, min 3 characters & max 6 characters.";
        String rules2 = "\n2. Each level, you have 10 chances to answer correctly.";
        String rules3 = "\n3. To get through to next level, you have to score 70 points each level.";
        System.out.print("Coepoe Word Puzzle" + "\n====================");
        System.out.print("\nRules : ");
        System.out.print(rules1 + rules2 + rules3);
        System.out.print("\n");
    }

    public static int level1(){
        questions q = new questions();
        return runLevel(q.Quest1, q.Answer1);
    }

    public static int level2(){
        questions q = new questions();
        return runLevel(q.Quest2, q.Answer2);
    }

    public static int level3(){
        questions q = new questions();
        return runLevel(q.Quest3, q.Answer3);
    }

    static int runLevel(String[] questions, String[] answers) {
        Scanner sc = new Scanner(System.in);
        int chances = 10;
        int rightAnswer = 0;

        String[] names = new String[chances];

        String val1  = "Right. ";
        String val2 = "You had already type this word before..";
        String val3 = "";

        int i = 0;
        System.out.print("\n");
        do {
            System.out.print("\n" + (i + 1) + "> Your Answer : ");
            String guess = sc.next();

            if (Arrays.asList(names).contains(guess)) {
                System.out.println("You already typed this answer before..");
                continue;
            }

            if (Arrays.asList(answers).contains(guess)) {
                rightAnswer++;
                System.out.print("#" + val1 + "Score: " + (rightAnswer* 10));
            }

            names[i] = guess;
            i++;
        } while(i < chances);

//      Final output
        System.out.println("\n\nYou had answered 10 times with " + rightAnswer + " right answers..");
        System.out.println("Right answers:");
        for (int j = 0; j < answers.length; j++){
            System.out.print(answers[j] + " ");

        }
        System.out.print("\n\n");

        return rightAnswer * 10;
    }

}