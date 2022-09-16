import java.util.ArrayList;
import java.util.Scanner;

public class CodeWars {
    public static void main(String[] args) {
       ArrayList<Integer> integer = new ArrayList<>();
       Scanner input = new Scanner(System.in);

       while (true){
           displayMenu();
           int choice = input.nextInt();

           if (choice == 1 ){
               System.out.print("Enter a number to Add: ");
                integer.add(input.nextInt());
               System.out.println("Added");
           }
           else if (choice == 2) {
               System.out.print("Enter a number to Remove: ");
               int elementToRemove = input.nextInt();
               if (integer.contains(elementToRemove)) {
                   integer.remove(Integer.valueOf(elementToRemove));
                   System.out.println("Removed!");
               } else {
                   System.out.println("Element not found");
               }
           }
           else if (choice == 3){
               if (integer.size() == 0){
                   System.out.println("Your list is empty");
               } else {
                   System.out.println("Here is your List " + integer);
               }
           }
           else if (choice == 4){
               System.out.print("Enter index to Update: ");
               int index = input.nextInt();
               System.out.print("Enter value to Update: ");
               int newValue = input.nextInt();
               if(integer.isEmpty() || index > integer.size()) {
                   System.out.println("List is empty!");
               }
               else {
                   integer.remove(index);
                   integer.add(index, newValue);
                   System.out.println("Updated!");
               }

           }
           else if (choice > 5){
               System.out.println("Wrong Input");
           }
           else if (choice == 5){
               System.out.println("Good Bye!");
               break;
           }
       }
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Update");
        System.out.println("5. Exit");
        System.out.println();
        System.out.print("Your Choice: ");

    }

}
