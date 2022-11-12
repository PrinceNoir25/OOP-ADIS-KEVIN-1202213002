package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database();
    
        // TODO Create Menu
        Menu menu1 = new Menu();
        menu1.setName(name="Bakso Sosro");
        menu1.setName(name="Bakso panas");
        menu1.setName(name="Bakso dingin");

        Menu menu2 = new Menu();
        menu2.setName(name="Soto goreng");
        menu2.setName(name="Soto Betawi");
        menu2.setName(name="Soto Tauco campur mie jago");

        Menu menu3 = new Menu();
        menu3.setName(name="Es krim rasa nasi");
        menu3.setName(name="Es krim rasa soto");
        menu3.setName(name="Es krim rasa Bakso");

        // TODO Insert Menu to Database
        db.insertMenu (menu1);
        db.insertMenu (menu2);
        db.insertMenu (menu3);
        // TODO Display Main Menu
        System.out.print("Selamat Datang di Restoran EAD");
        System.out.print("Silahkan Register terlebih dahulu");
        System.out.print("=================================");

        Scanner sc = new Scanner(System.in);
        // TODO Create User

        // Display Menu
        System.out.print(menu1);
        System.out.print(menu2);
        System.out.print(menu3);
    }
}