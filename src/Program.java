import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(2, Arrays.toString(new String[]{"3","4","5"}));

        System.out.println(hm);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println(name + "! You are " + age + " years old!");
    }
}
