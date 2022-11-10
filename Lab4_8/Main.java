import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class Main {

    public static void main(String[] args)
    throws IOException {
         Scanner in = new Scanner(System.in);
         System.out.println("You are opeator or client (1/2)");
         int user = in.nextInt();
         TaxiPark taxiPark= new TaxiPark("Uklon");
         if (user == 1)
         {
             ChoiseOperator(taxiPark);
         }
         else if (user ==2)
         {
             ChoiseUser(taxiPark);
         }
         else
         {
         System.out.print("Try again");
         }
    
        TaxiPark taxiPark= new TaxiPark("My Park");
        taxiPark.ReadFromFile();
        taxiPark.PrintCars();
        taxiPark.PrintToFile();
    }
    

   public static boolean Authorization(String filename)
   {
    Scanner in = new Scanner(System.in);
    boolean flag =false;
    System.out.print("Input login:");
    String login = in.nextLine();
    System.out.print("Input password:");
    String pass = in.nextLine();
    StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                if (words[0].equals(login) && words[1].equals(pass) )
                {
                System.out.print("You sign in");
                flag =true;
                }
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } 
        if(!flag)
        {
            System.out.print("You are not registered");
        }
        return flag;
   }


   public static Boolean Registration(String filename)
   {
    System.out.print("Input login:");
    Scanner in = new Scanner(System.in);
    String login = in.nextLine();
    System.out.print("Input password:");
    String pass = in.nextLine();
    try {
        PrintStream old = System.out;
        PrintStream fs = new PrintStream(new FileOutputStream(filename, true));
        System.setOut(fs);
        fs.println(login+" "+pass);
        fs.close();
        System.setOut(old);

        } catch (FileNotFoundException ex) {
        }
        return true;
    }


   public static void ChoiseOperator(TaxiPark taxiPark)
   {
    Scanner in = new Scanner(System.in);
    System.out.print("1- Registration\n");
    System.out.print("2- Authorization");
    int choise=in.nextInt();
    Boolean res= false;
    if (choise==1)
        {
            res=Registration("Users/Operator.txt");
            MenuToOperator  menuToOperator = new MenuToOperator(taxiPark);
            if(res)
            {
                menuToOperator.PrintMenu();
                menuToOperator.Complete();
             }
        }
    
    else if (choise==2)
        {
            res=Authorization("Users/Operator.txt");
            MenuToOperator  menuToOperator = new MenuToOperator(taxiPark);
            if(res)
            {
                menuToOperator.PrintMenu();
                menuToOperator.Complete();
            }
        
        }
    }

    
    public static void ChoiseUser(TaxiPark taxiPark)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("1- Registration\n");
        System.out.print("2- Authorization");
        int choise=in.nextInt();
        Boolean res= false;
        if (choise==1)
        {
            res=Registration("Users/User.txt");
            MenuToClient menuToClient = new MenuToClient(taxiPark);
            if(res)
            {
                menuToClient.PrintMenu();
                menuToClient.Complete();
            }
        }
        else if(choise==2)
        {
            res=Authorization("Users/User.txt");
            MenuToClient menuToClient = new MenuToClient(taxiPark);
            if(res)
            {
                menuToClient.PrintMenu();
                menuToClient.Complete();
            }
        }

    }
}
