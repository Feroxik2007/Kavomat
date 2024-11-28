import java.util.Scanner;

public class Admin {
    public static void consola(){
        main main = new main();
        snackMenu menu = new snackMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadajte svoje prihlasovacie meno: ");
        String prihlasovacieMeno = scanner.next();
        if (prihlasovacieMeno.equals("Coopjednotaprievidza16")) {
            System.out.println("Ste uspesne prihlaseny!");
        }
        else{
            System.out.println("Prihlasovacie meno je nespravne");
            main.uvodMenu();
            
        }
        
    }
}
