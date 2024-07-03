import java.util.Scanner;

public class systemIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three words separated by spaces: Hello Java Learners ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is Hello" + s1);
        System.out.println("s2 is Java" + s2);
        System.out.println("s3 is Learners" + s3);

            }


        }