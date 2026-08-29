import java.util.*;

public class Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstname= "Ankit";
        String lastname = "Suthar";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);          // (1)
        System.out.println(fullname.length()); // (2)

        
 

        System.out.print("Enter your name: "); // input from user(3)
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println("Length of your enter name is: " + name.length());  // (4)
         for( int  i=0; i<name.length(); i++){ //ek khadi line me output dega name ka (5)
            System.out.println(name.charAt(i));
            }
        



        String name1 = "Ankit";
        String name2 = "Snkit";
        if(name1.compareTo(name2) > 0){
            System.out.println("name1 is greater"); //(6)
            }
        else if(name1.compareTo(name2) == 0){
            System.out.println("Both are equal");}
        else{
            System.out.println("name2 is grater");
            }



            
        String sentence = "My name is ankit";
        String myname = sentence.substring(11, sentence.length()); //sentence.substring(11);
        System.out.println(myname);  //(7)
        String sentence1 = sentence.replaceAll("ankit","Suthar");
        System.out.println(sentence1);
        
    }
}

