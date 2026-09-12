import java.util. Scanner;
public class bitManipulation {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("Result of " + a +  "<<1 is: " + (a<<1));
        


        int n = 5;
        int pos =  2;
        int bitMask = 2<<pos;
        if((bitMask & n) == 0){  // GET BIT ( AND OPERATION)
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    setbit(args);
    }


    public static void setbit(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        int newnumber = bitMask | n; // SET BIT ( OR OPERATION)
        System.out.println("New Set bit is: " + newnumber);

        clearbit(args);
    }


    public static void clearbit(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask); // CLEAR BIT (AND WITH NOT)

        int newNumber = notBitMask & n;
        System.out.println("New Clear bit is: " + newNumber);
            
        updatebit(args);  
    }


    public static void updatebit(String[] args) {

        System.out.print("Enter operation(0/1): ");
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper -> 1 : SET , oper -> 0 : CLEAR 

        int n = 5; 
        int pos = 1;

        if( oper == 1){ // SET
            int bitMask = 1<<pos;
            int newnumber = bitMask | n;
            System.out.println("New Update bit is: " + newnumber);
        }
        else{ // CLEAR 
            int bitMask = 1<<pos;
            int newBitMask = ~(bitMask);
            System.out.println("New Update bit is: " + newBitMask);

        }
    }
}