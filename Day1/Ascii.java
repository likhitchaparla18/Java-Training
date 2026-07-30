import java.util.Scanner;
public class Ascii {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a character:");
        char c = s.next().charAt(0);
        int a = c;
        System.out.println(c + "ascii-"+c);

    }

    
}
