import java.util.ArrayList;
import java.util.Scanner;

class calculator {
    public int results;
    public int a;
    int b, c, d;
    public int x;
    public int y;
    public int add (int x, int y) {
        results = x + y;
        System.out.println( "ADDITION IS =" + results);
        return results;
    }
     public int subtraction (int a, int b) {
    results = a - b;
    System.out.println("SUBTRACTION IS =" + results);
    return results;
}
    public int DIVISION (int c, int d) {
        results = c / d;
        System.out.println("DIVISION OF TWO NUMBERS IS =" + results);
        return results;
    }
    public int multiplication (int e, int f) {
        results = e * f;
        System.out.println("Multiplication of "+e+"  and  "+f+ "="+results);
        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Choice given belows");
        System.out.println(" 1 = Addition ");
        System.out.println(" 2 = SUBTRACTION");
        System.out.println(" 3 = DIVISION");
        System.out.println(" 4 = MULTIPLICATION ");
        calculator obj = new calculator();


        while (true) {
            int number = sc.nextInt();
            try {
                switch (number) {

                    case 1:
                        System.out.println("Enter first number:");
                        int x = sc.nextInt();
                        System.out.println("Enter second number:");
                        int y = sc.nextInt();
                        obj.add(x, y);
                        break;

                    case 2:
                        System.out.println("Enter first number: ");
                        int a = sc.nextInt();
                        System.out.println("Enter second number: ");
                        int b = sc.nextInt();
                        obj.subtraction(a, b);
                        break;
                    case 3:
                        System.out.println("Enter first number: ");
                        int c = sc.nextInt();
                        System.out.println("Enter second number: ");
                        int d = sc.nextInt();
                        obj.DIVISION(c, d);
                        break;
                    case 4:
                        System.out.println("Enter first number: ");
                        int e = sc.nextInt();
                        System.out.println("Enter second number: ");
                        int f = sc.nextInt();
                        obj.multiplication(e, f);
                        break;
                    default:
                        System.out.println("Invalid choice");

                }
            } catch (Exception e) {
                System.out.println("Cant divide by 0");
            }
        }
    }
    }
