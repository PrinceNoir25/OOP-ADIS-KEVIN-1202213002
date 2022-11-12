import java.util.Scanner;
public class User {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:   ");
        String Name=sc.nextLine();

        System.out.println("No.Handphone: ");
        int NIM = sc.nextInt();
        sc.close();
        
        System.out.print(Name);
        System.out.println (NIM);

        
    }

    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message

    
}
