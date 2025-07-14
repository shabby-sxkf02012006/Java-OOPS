package ebfmotors;

import java.util.*;
import java.lang.String;

public class main {
    
    public static void main (String[] args) {
        
        //Variables & Objects
             Cars car=new Cars();
             Homepage home =new Homepage();
             Scanner sc = new Scanner(System.in);
             int details;
             
            //prinitng Homepage
            home.HomePage();
             
             details=sc.nextInt();

        switch(details){
            case 1: 
                car.Mushtang();
            break;

            case 2:
                car.Toyota();
                break;
            case 3:
                car.Nissan();
                break;
            default:
            System.out.println("Invalid Choice Try again");
            break;

        }
        sc.close();
    }
}