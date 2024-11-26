
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class snackMenu {
    
    public static void menuSnackov() throws InterruptedException{
        int popcorn = 10;
        int twix = 10;
        int mms = 10;
        int snickers = 10;
        int reese = 10;

        Scanner scanner = new Scanner(System.in);
        Snack cena = new Snack();
        cena.setCena(1.8);
        List<String> pismena = new ArrayList<>();
        pismena.add("A");
        pismena.add("B");
        pismena.add("C");
        pismena.add("D");
        pismena.add("E");
        List<Integer> cisla = new ArrayList<>();
        cisla.add(1);
        cisla.add(2);
        cisla.add(3);
        cisla.add(4);
        cisla.add(5);
        List<String> snacks = new ArrayList<>();
        snacks.add("Popcorn");
        snacks.add("Twix");
        snacks.add("M&M");
        snacks.add("Snickers");
        snacks.add("Reese's");
        Collections.sort(snacks);
        System.out.println("Zvolili ste si snacky, tu je nasa ponuka: ");
        for (int i = 0; i < snacks.size(); i++) {
            if (i < pismena.size() && i < cisla.size()) {  
                System.out.println(snacks.get(i) + ": " + pismena.get(i) + cisla.get(i) + " " +  ":  "+ cena.getCena() + " Eur");
            }
        }
        System.out.print("Co si prajete: ");
        String vyber = scanner.nextLine();
        
        try {
            FileWriter writer = new FileWriter("snack.txt");
            if (vyber.equalsIgnoreCase("A1")) {
                popcorn--;
                writer.write("Popcorn: " + popcorn + "\n");
                System.out.println("Vybral si si popcorn");
                platba();
            }
            if (vyber.equalsIgnoreCase("B2")) {
                twix--;
                writer.write("Twix: " + twix + "\n");
                System.out.println("Vybral si si twix");
                platba();
            }
            if (vyber.equalsIgnoreCase("C3")) {
                mms--;
                writer.write("M&M: " + mms + "\n");
                System.out.println("Vybral si si M&M");
                platba();
            }
            if(vyber.equalsIgnoreCase("D4")){
                snickers--;
                writer.write("Snickers: " + snickers + "\n");
                System.out.println("Vybral si si snickers");
                platba();
            }
            if(vyber.equalsIgnoreCase("E5")){
                reese--;
                writer.write("Reese's: " + reese + "\n");
                System.out.println("Vybral si si reese's");
                platba();
            }
            else{
                System.out.println("Vybral si si neexistujuci produkt");
                System.out.println("Vyber si este raz");
                menuSnackov();
            }
        } catch (Exception e) {
            System.out.println("Nespravny vstup");
        }
        
        
        
    }
    public static void platba() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        Snack cena = new Snack();
        cena.setCena(1.8);
        System.out.println("Mate presne " + cena.getCena() + " Eur ?"  + " ano/nie");
        String vyber = scanner.nextLine();
        try {
            if(vyber.equalsIgnoreCase("ano")){
                System.out.println("Prosím vložte mince do kavomatu");
                Thread.sleep(1000);
                System.out.println("Vlozili ste mince do kavomatu....");
                System.out.println("Snack sa pripravuje...");
                Thread.sleep(2000);
                System.out.println("Snack je pripraveny na zobratie, Dakujeme za navstevu!");
    
            }
            if(vyber.equalsIgnoreCase("nie")){
                System.out.println("Zadajte presnu ciastku aku mate: ");
                int ciastka = scanner.nextInt();
                double vydavok = ciastka - cena.getCena();
                if(ciastka > 10){
                    System.out.println("Kavomat nemoze vidat taku ciastku");
                }
                else if (ciastka < 0) {
                    System.out.println("Zadali ste zlu hodnotu");
                }
                System.out.println("Tu je vas vydavok: " + vydavok + " Eur");
                System.out.println("Snack sa pripravuje...");
                Thread.sleep(2000);
                System.out.println("Snack je pripraveny na zobratie, Dakujeme za navstevu!");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        scanner.close();
        
        
    }
}
