import java.io.FileWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       uvodMenu();
    }

    public static void uvodMenu(){
        Scanner scanner = new Scanner(System.in);
        snackMenu snack = new snackMenu();
        System.out.println("Vitajte vo Kavomate, co si prajete zvolit?");
        System.out.println("1. Napoje");
        System.out.println("2. Snacky");
        System.out.println("3. Exit");
        int vyber = scanner.nextInt();
        try {
            if(vyber == 1){
                napoje();
            }
            if(vyber == 2){
                snack.menuSnackov();
            }
            if(vyber == 3){
    
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        scanner.close();

       
        
    }

    public static void napoje(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vybrali ste moznost napoje zvolte 1. pre teple a 2 pre studene");
        int vyber = scanner.nextInt();
        try {
            if(vyber == 1){
                teplyNapoj();
            }
            if(vyber == 2){
                studenyNapoj();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
        scanner.close();
    }

    public static void studenyNapoj(){
        Napoj napoj = new Napoj();
        
        
        int fanta = 10;
        int Kofola = 10;
        int aloeVera = 10;
        int monster = 10;

        Item napojeCena = new Item();
        napojeCena.setCena(1.8);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zvolili ste studeny napoj, co si date?");
        System.out.println("1. Fanta , " + napojeCena.getCena() + "Eur");
        System.out.println("2. Kofola , " + napojeCena.getCena() + "Eur");
        System.out.println("3. Aloe-Vera , " + napojeCena.getCena() + "Eur");
        System.out.println("4. Monster , " + napojeCena.getCena() + "Eur");
        int vyber  = scanner.nextInt();
        try {
            if (vyber == 1) {
                fanta--;
                if (fanta == 0) {
                    System.out.println("Fanta je vypredana");
                    Thread.sleep(1000);
                    studenyNapoj();
                }
                System.out.println("Vybrali ste si Fantu , cena je " + napojeCena.getCena() + " Eur");
                platbaStudene();
                FileWriter writer = new FileWriter("studeneNapoje.txt");
                writer.write("Fanta: " + fanta + "\n");
                writer.write("\n");
                writer.close();
                
                
                

            }
            if (vyber == 2) {
                Kofola--;
                System.out.println("Vybrali ste si Kofolu , cena je " + napojeCena.getCena() + " Eur");
                platbaStudene();
                FileWriter writer = new FileWriter("studeneNapoje.txt");
                writer.write("Kofola: " + Kofola + "\n");
                writer.write("\n");
                writer.close();
            }
            if (vyber == 3) {
                aloeVera--;
                System.out.println("Vybrali ste si Aloe-Veru , cena je " + napojeCena.getCena() + " Eur");
                platbaStudene();
                FileWriter writer = new FileWriter("studeneNapoje.txt");
                writer.write("Aloe-Vera: " + aloeVera + "\n");
                writer.write("\n");
                writer.close();
            }
            if (vyber == 4) {
                monster--;
                System.out.println("Vybrali ste si Monstera , cena je " + napojeCena.getCena() + " Eur");
                platbaStudene();  
                FileWriter writer = new FileWriter("studeneNapoje.txt");
                writer.write("Monster: " + monster + "\n");
                writer.write("\n");
                writer.close();
            }
            if (vyber > 4 || vyber < 1) {
                System.out.println("Skus este raz: ");
                Thread.sleep(1000);
                studenyNapoj();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }

    }

    public static void teplyNapoj(){
        Item napojeCena = new Item();
        napojeCena.setCena(1.5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zvolili ste si teple napoje!");
        System.out.println("Tu je nase menu: ");
        System.out.println("1. Latte , " + napojeCena.getCena() + "Eur");
        System.out.println("2. Cappuccino , " + napojeCena.getCena() + "Eur");
        System.out.println("3. Americano , " + napojeCena.getCena() + "Eur");
        System.out.println("4. Espreso , " + napojeCena.getCena() + "Eur");
        int vyber = scanner.nextInt();
        try {
            if (vyber == 1) {
                System.out.println("Vybrali ste si Latte , cena je " + napojeCena.getCena() + " Eur");
                platba();

            }
            if (vyber == 2) {
                System.out.println("Vybrali ste si Cappuccino , cena je " + napojeCena.getCena() + " Eur");
                platba();
            }
            if (vyber == 3) {
                System.out.println("Vybrali ste si Americano , cena je " + napojeCena.getCena() + " Eur");
                platba();
            }
            if (vyber == 4) {
                System.out.println("Vybrali ste si Espreso , cena je " + napojeCena.getCena() + " Eur");
                platba();              
            }
            if (vyber > 4 || vyber < 1) {
                System.out.println("Skus este raz: ");
                Thread.sleep(1000);
                teplyNapoj();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        scanner.close();
    }
    public static void platba() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        Item napojeCena = new Item();
        napojeCena.setCena(1.5);
        System.out.println("Mate presne " + napojeCena.getCena() + " Eur ?"  + " ano/nie");
        String vyber = scanner.nextLine();
        try {
            if(vyber.equalsIgnoreCase("ano")){
                System.out.println("Prosím vložte mince do kavomatu");
                Thread.sleep(1000);
                System.out.println("Vlozili ste mince do kavomatu....");
                System.out.println("Kava sa pripravuje...");
                Thread.sleep(2000);
                System.out.println("Kava je pripravena, Dakujeme za navstevu!");
    
            }
            if(vyber.equalsIgnoreCase("nie")){
                System.out.println("Zadajte presnu ciastku aku mate: ");
                int ciastka = scanner.nextInt();
                if(ciastka > 10){
                    System.out.println("Kavomat nemoze vidat taku ciastku");
                }
                else if (ciastka < 0) {
                    System.out.println("Zadali ste zlu hodnotu");
                }
                System.out.println("Tu je vas vydavok: " + (ciastka - napojeCena.getCena()) + " Eur");
                System.out.println("Kava sa pripravuje...");
                Thread.sleep(2000);
                System.out.println("Kava je pripravena, Dakujeme za navstevu!");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        scanner.close();
        
        
    }
    public static void platbaStudene() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        Item napojeCena = new Item();
        napojeCena.setCena(1.8);
        System.out.println("Mate presne " + napojeCena.getCena() + " Eur ?"  + " ano/nie");
        String vyber = scanner.nextLine();
        try {
            if(vyber.equalsIgnoreCase("ano")){
                System.out.println("Prosím vložte mince do kavomatu");
                System.out.println("Vlozili ste mince do kavomatu....");
                System.out.println("Napoj  sa pripravuje...");
                Thread.sleep(2000);
                System.out.println("Napoj je pripraveny, Dakujeme za navstevu!");
    
            }
            if(vyber.equalsIgnoreCase("nie")){
                System.out.println("Zadajte presnu ciastku aku mate: ");
                int ciastka = scanner.nextInt();
                if(ciastka > 10){
                    System.out.println("Kavomat nemoze vidat taku ciastku");
                }
                else if (ciastka < 0) {
                    System.out.println("Zadali ste zlu hodnotu");
                }
                System.out.println("Tu je vas vydavok: " + (ciastka - napojeCena.getCena()) + " Eur");
                System.out.println("Napoj sa pripravuje...");
                Thread.sleep(2000);
                System.out.println("Napoj je pripraveny mozete si ho zobrat, Dakujeme za navstevu!");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        scanner.close();
      
        
        
    }
}
