import java.util.*;
public class CharType {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter c: ");

        char c = s.next().charAt(0);
        int a = c;
        if (a>=65 && a<=122)
            System.out.println("Capital Letter.");
        else if (a >= 65 && a <=90)
            System.out.println("Small Letter.");
        else if (a >=48 && a <=57)
            System.out.println(" Numbers.");
        else if (a >= 33 && a <= 47)
            System.out.println("Symbol.");

    }
    
}
