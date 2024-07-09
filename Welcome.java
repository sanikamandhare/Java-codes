import java.lang.*;
import java.util.*;

class Welcome {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String name;
        System.out.println("May I know your name: ");
        name=sc.nextLine();
        System.out.println("Welcome "+name);
        
        sc.close();

    }
    
}
