import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        float diff=0;
        float div=0;

        System.out.println("Enter the two numbers");

        Scanner num1 = new Scanner(System.in);
        int a = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        int b = num2.nextInt();


        float sum=a+b;
        System.out.println("Sum of two given number is "+sum);

        if(a>b){
            diff=a-b;
        }
        else{
            diff=b-a;
        }
        System.out.println("The difference of given two number is "+ diff);

        float mul=a*b;
        System.out.println("Product of two numbers is "+ mul);

        if(b>a){
            div=b/a;
        }
        else{
            div=a/b;
        }
        System.out.println("Quotient of two given numbers is "+div);
    }
}
