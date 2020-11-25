import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hw3 {
    private static Random rand = new Random();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        guessNumber();
        guessWord();
        guessWord2();

    }

    public static void guessNumber(){
        int repitGame=1;
        while (repitGame == 1) {
            int number = rand.nextInt(10);
            System.out.println("Компьютер загадал число от 0 до 9. У Вас 3 попытки чтобы его отгадать.");
            for (int i = 0; i < 3; i++) {
                int answer = sc.nextInt();
                if (answer == number){
                    System.out.println("Вы угадали");
                    break;
                }else if (answer>number){
                    System.out.println("Ваше число больше");
                }else if (answer<number){
                    System.out.println("Ваше число меньше");
                }
                if (i == 2){
                    System.out.println("Вы проиграли. Правильное число="+number);
                }
            }
            System.out.println("Хотите сыграть еще? 1=да 0=нет");
            repitGame= sc.nextInt();
        }
    }

    public static void guessWord(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String rightAnswer = words[rand.nextInt(words.length)];
        System.out.println("Угадайте слово.");
        System.out.println(Arrays.toString(words));
        String answer = sc.nextLine();
        while (true) {
            if (rightAnswer.equals(answer)) {
                System.out.println("Правильно");
                break;
            } else {
                String answerWrite="";
                int l=0;
                if (answer.length()<rightAnswer.length()){
                    l = answer.length();
                }else{
                    l = rightAnswer.length();
                }
                for (int i = 0; i < l; i++) {
                    if (answer.charAt(i) == rightAnswer.charAt(i)){
                        answerWrite = answerWrite+answer.charAt(i);
                    }else{
                        answerWrite = answerWrite+'#';
                    }
                }
                for (int i = answerWrite.length(); i < 15; i++) {
                    answerWrite=answerWrite+'#';
                }
                System.out.println(answerWrite);
                answer = sc.nextLine();
            }
        }
    }

    public static void guessWord2(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String rightAnswer = words[rand.nextInt(words.length)];
        System.out.println("Угадайте слово.");
        System.out.println(Arrays.toString(words));
        StringBuilder answerWrite = new StringBuilder();
        answerWrite.append("###############");
        String answer = sc.nextLine();
        while (true) {
            if (rightAnswer.equals(answer)) {
                System.out.println("Правильно");
                break;
            } else {
                int l=0;
                if (answer.length()<rightAnswer.length()){
                    l = answer.length();
                }else{
                    l = rightAnswer.length();
                }
                for (int i = 0; i < l; i++) {
                    if (answer.charAt(i) == rightAnswer.charAt(i)){
                        answerWrite.setCharAt(i,answer.charAt(i));
                    }
                }
                System.out.println(answerWrite);
                answer = sc.nextLine();
            }
        }
    }
}
