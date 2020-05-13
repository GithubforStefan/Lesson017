import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("please insert a number");

        try {
            int i = sc.nextInt();
            System.out.println(i);

        }
        catch (InputMismatchException inputMismatchException) {
            System.out.println("Invalid input");
        }
        */


        ArrayList <String> fruits = new ArrayList<>();
        fruits.add(0, "banana");
        fruits.add(1, "apple");
        fruits.add(2, "peach");
        fruits.add(3, null);

        try {
            System.out.println(fruits.get(4));
            for(int i = 0; i < fruits.size();i++) {
                System.out.println(fruits.get(i));
        }


        }
        catch (IndexOutOfBoundsException error){
            System.out.println("There is an error in your code!");

        }

        }


    }



