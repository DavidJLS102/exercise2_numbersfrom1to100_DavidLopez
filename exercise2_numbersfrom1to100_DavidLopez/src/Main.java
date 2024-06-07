import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for (int numbers = 1; numbers <= 100; numbers++) {
            String essential = "";
            if (numbers % 3 == 0) {
                essential += "fizz";
            }
            if (numbers % 5 == 0) {
                essential += "buzz";
            }
            if (essential.isEmpty()){
                essential= Integer.toString(numbers);
            }
            System.out.println(essential);
        }
    }
}