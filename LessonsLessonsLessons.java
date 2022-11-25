import java.util.Scanner;
public class LessonsLessonsLessons {
    public static void main(String[] args) {
        //Level1:
        //Вводится число. Напишите на экран сообщение "Я начинаю разбираться с циклами" количество раз, равное введенному числу

        //Level2:
        //Вводится строка, выведите первый ее символ на экран количество раз, равное длине всей строки. Например, строка "привет", значит результат будет такой:
        //п
        //п
        //п
        //п
        //п
        //п

        //Если строка "Как дела?", то в ней 9 символов, значит ответ будет:
        //К
        //К
        //К
        //К
        //К
        //К
        //К
        //К
        //К


        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            System.out.println("I'm starting to understand cycles");
        }
        String str = sc.nextLine();
        int len = str.length();
        char first = str.charAt(0);

        for(int i = 0; len > i; i++){
            System.out.println(first);
        }
    }
}
