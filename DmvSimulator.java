import java.util.Scanner;
public class DmvSimulator{
    public static void welcome(){
        System.out.println("Welcome to the DMV!");

        int ticketNumber = (int)Math.floor(Math.random() * 200 + 1);

        System.out.println("Your ticket number is " + ticketNumber + ", please wait until your number is called. Press enter to contine.");

        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        int baseTicket;
        if(ticketNumber == 200){
            baseTicket = 1;
        }else{
            baseTicket = ticketNumber + 1;
        }
        while(true){
            System.out.println("Ticket number " + baseTicket + ", please come to the front desk.");
            if(baseTicket == ticketNumber){
                break;
            }else if(baseTicket == 200){
                baseTicket = 1;
            }else{
                baseTicket++;
            }

        }

        System.out.println("Im sorry you dont have the required paperwork.");

    }
    public static void main(String[] args){
       welcome();
    }
}