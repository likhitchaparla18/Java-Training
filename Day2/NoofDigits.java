import java.util.Scanner;
public class NoofDigits {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        if (n>=0 && n<10)
            System.out.println("Single digit");
        else if (n>=10 && n<100)
            System.out.println("Double digit");
        else if (n>=100 && n< 1000)
            System.out.println("Triple digit");
        else if (n>=1000 && n< 10000)
            System.out.println("Four digits");
        else
            System.out.println("Out of range.");




    


   




    }
    
}
