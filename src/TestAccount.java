
import java.util.Scanner;


public class TestAccount {
    private static Scanner scanner = new Scanner(System.in);
        
    public static void main (String[] args) {
          //todo:: create account object
          //todo:: set Interest rate

          
          
          int choice;
          double amt; 
          
          do {
              choice = displayMenu();
              switch (choice ){
                  case 1:  //todo:: display balance 
                          
                           break;
                  case 2 : //todo:: request deposit amount
                           //todo:: cash in
                           //todo:: display balance
                      
                         
                           
                           break;
                  case 3 : //todo:: request withdrawal amount
                           //todo:: cash out
                           //todo:: display balance
                      
                       
                           
                           break;
                  case 4 : //todo:: display interest amount
                      
              }
          }while (choice != 5);
    }
      
    public static int displayMenu(){
          System.out.println("\nMain Menu");
          System.out.println("1 : Check balance");
          System.out.println("2 : Cash In"); 
          System.out.println("3 : Cash Out");
          System.out.println("4 : Interest"); 
          System.out.println("5 : Exit"); 
          System.out.print("Enter a choice : "); 
          
          //todo:: read and return selection 
    }  
}
