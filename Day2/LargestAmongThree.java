import java.util.Scanner;
public class LargestAmongThree {
    public static void main(String args[]){
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = s.nextInt();
        System.out.println("Enter b: ");
        int b = s.nextInt();
        System.out.println("Enter c: ");
        int c = s.nextInt();
        System.out.println(a>b? a>c? "a is big ": "c is big": b>c ?"b is big":"c is big");
    }
    
}
