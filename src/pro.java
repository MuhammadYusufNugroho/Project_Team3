import java.util.Arrays;
import java.util.Scanner;
public class pro {
    public static void main(String[] args) {
//        Flow intro -> lvl 1 -> lvl 2 -> lvl 3
        questions show = new questions();
        introduction();
        System.out.print("\nLevel 1" + "\n\t");
        for(int x = 0; x < show.Quest1.length; x++){
            System.out.print(show.Quest1[x] + "     ");
        }

        level1();
        System.out.print("\nLevel 2" + "\n\t");
        for(int x = 0; x < show.Quest2.length; x++){
            System.out.print(show.Quest2[x] + "     ");
        }

        level2();
        System.out.print("\nLevel 3" + "\n\t");
        for(int x = 0; x < show.Quest3.length; x++){
            System.out.print(show.Quest3[x] + "     ");
        }

        level3();


    }
    public static class questions{
        //        Questions
        String[] Quest1 = {"d", "e", "t", "l", "i"};
        String[] Quest2 = {"s", "e", "c", "a", "e", "n"};
        String[] Quest3 = {"h", "k", "r", "n", "e", "o"};

        //        Answer
        String[] Answer1 = {"tie", "die", "lie", "tied", "lied", "diet", "title"};
        String[] Answer2 = {"sec", "can", "cane", "scan", "scene", "sen", "case", "cease"};
        String[] Answer3 = {"honk", "honker", "roe", "ore", "her", "hen", "one"};
    }
    public static void introduction(){
//        Variables String for introduction
        String rules1 = "\n1. Create a word using given characters, min 3 characters & max 6 characters.";
        String rules2 = "\n2. Each level, you have 10 chances to answer correctly.";
        String rules3 = "\n3. To get through to next level, you have to score 70 points each level.";
        System.out.print("Coepoe Word Puzzle" + "\n====================");
        System.out.print("\nRules : ");
        System.out.print(rules1 + rules2 + rules3);
    }
    public static void level1(){
//        Variable
        Scanner sc = new Scanner(System.in);
        int length = 10;
        int scoreCount = 0;

        String[] names = new String[length];
        questions q = new questions();
//      Logic value
        String val1  = "Right. ";
        String val2 = "You had already type this word before..";
        String val3 = "";

//      Convert Int to string


            for (int counter = 0; counter < length; counter++) {
                System.out.print("\n" + (counter + 1) + "> Your Answer : ");
                names[counter] = sc.next();
                if (Arrays.asList(q.Answer1).contains(names[counter])) {
                    System.out.print("#" + val1 + scoreCount + "0");
                    scoreCount++;
                }
//            else if(Arrays.asList(names[counter]).contains(names[counter])){
//                System.out.print(val2);
//            }
                else {
                    System.out.print(val3);
                }
            }

//      Final output
        System.out.println("\nYou had answered 10 times with " + scoreCount +" right answers..");
        for (int counter = 0; counter < length; counter++){
            System.out.print(names[counter] + " ");
        }
    }

    public static void level2(){
        Scanner sc = new Scanner(System.in);
        int length = 10;
        int scoreCount = 0;
        String[] names = new String[length];
        questions q = new questions();
//      Logic value
        String val1  = "Right. ";
//        String val2 = "You had already type this word before..";
        String val3 = "";

//      Convert Int to string


        for (int counter = 0; counter < length; counter++){
            System.out.print("\n"+(counter + 1) + "> Your Answer : ");
            names[counter] = sc.next();
            if(Arrays.asList(q.Answer2).contains(names[counter])){
                System.out.print("#" + val1 + scoreCount + "0");
                scoreCount++;
            }else{
                System.out.print(val3);
            }
        }

//      Final output
        System.out.println("\nYou had answered 10 times with 7 right answers..");
        for (int counter = 0; counter < length; counter++){
            System.out.print(names[counter] + " ");
        }
    }
    public static void level3(){
        Scanner sc = new Scanner(System.in);
        int length = 10;
        int scoreCount = 0;
        String[] names = new String[length];
        questions q = new questions();
//      Logic value
        String val1  = "Right. ";
//        String val2 = "You had already type this word before..";
        String val3 = "";

//      Convert Int to string


        for (int counter = 0; counter < length; counter++){
            System.out.print("\n"+(counter + 1) + "> Your Answer : ");
            names[counter] = sc.next();
            if(Arrays.asList(q.Answer3).contains(names[counter])){
                System.out.print("#" + val1 + scoreCount + "0");
                scoreCount++;
            }else{
                System.out.print(val3);
            }
        }

//      Final output
        System.out.println("\nYou had answered 10 times with 7 right answers..");
        for (int counter = 0; counter < length; counter++){
            System.out.print(names[counter] + " ");
        }
    }


}

