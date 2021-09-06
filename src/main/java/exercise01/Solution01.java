package exercise01;
    import java.util.Scanner;
class Solution01 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your name?" +
                "");
        String name = userInput.next();


        System.out.println("Hello " + name + ". Nice to meet you!");
    }
}
