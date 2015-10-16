// Lab05Est.java
// The Speeding Ticket Program
// This is the student, starting version of Lab 05E.


public class Lab05Est
{
    public static void main(String args[])
    {
        System.out.println("Lab 05E");
        System.out.println();
        System.out.println("What is the posted speed limit? ==>> ");
        int limit1= Expo.enterInt();
        System.out.println();
        System.out.println("How fast was the car travelling in mph?");
        int travel1= Expo.enterInt();
        System.out.println();
        System.out.println("Did the violation occur in a school zone? {Y/N}");
        char school1= Expo.enterChar();
        System.out.println();
        
        int ticket = 0;
        
        if(limit1<travel1){
            ticket = 75 + 6*(travel1 - limit1);
                
            if(travel1 - limit1>30){
                ticket = ticket + 160;
            }
            
            
            if(school1=='Y'){
                ticket = 2*ticket;
            }
                
                
                
                
                
        }
            
            
        System.out.println("Ticket Value=" + ticket);
        
    }
}
