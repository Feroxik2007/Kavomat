import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class snackMenu {
    
    public static void main(String[] args) throws InterruptedException {
        Diddy();
    }
    public static void Diddy() throws InterruptedException{
        Snack snacky = new Snack();
        snacky.setCena(1.9);
        
        int snickers = 5;
        int mms = 5;
        int reeses = 5;
        int Kitkat = 5;
        int twix = 5;
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Snickers " );
        map.put(2, "M&M's " );
        map.put(3, "Reese's Pieces" );
        map.put(4, "Kit Kat  ");
        map.put(5, "Twix" );
        System.out.println("Tu je nase menu: ");
        System.out.println("Snickers -  [1A]" + "cena: " +snacky.getCena());
        Thread.sleep(500);
        System.out.println("M&M's - [2B]" + "cena: " +  snacky.getCena());
        Thread.sleep(500);
        System.out.println("Reese's Pieces - [3C]" + "cena: " + snacky.getCena());
        Thread.sleep(500);
        System.out.println("Kik Kat - [4D]" + "cena: " + snacky.getCena());
        Thread.sleep(500);
        System.out.println("Twix - [5E]"  + "cena: " + snacky.getCena());
        System.out.println("Co si prajete?");
        String odpoved = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("snack.txt");
            if (odpoved.contains("1")) {
                snickers--;
                writer.write("Pocete snickersu: " + snickers);
                if (snickers == 0) {
                    System.out.println("Snickers su vypredane!");
                    Thread.sleep(1000);
                    Diddy();
                }
                System.out.println( "Vybrali ste si: "+ " "  + map.get(1));
                platba();
            }
            
            if(odpoved.contains("2")){
                mms--;
                writer.write("Pocete M&M's: " + " " + mms);
                if (mms == 0) {
                    System.out.println("M&M's su vypredane");
                }
                System.out.println("Vybrali ste si: " + " " + map.get(2));
                platba();
            }
            if(odpoved.contains("3")){
                reeses--;
                writer.write("Pocete Reese's Pieces: " + " " + reeses);
                if (reeses == 0) {
                    System.out.println("Reese's Pieces su vypredane");
                }
                System.out.println( "Vybrali ste si: " + " " + map.get(3));
                platba();
            }
            if(odpoved.contains("4")){
                Kitkat--;
                writer.write("Pocete Kit Kat: " + " " + Kitkat);
                if (Kitkat == 0) {
                    System.out.println("Kit Kat su vypredane");
                }
                System.out.println("Vybrali ste si: " + " " + map.get(4));
                platba();
            }
            if(odpoved.contains("5")){
                twix--;
                writer.write("Pocete Twix: " + twix);
                if (twix == 0) {
                    System.out.println("Twix su vypredane");
                }
                System.out.println("Vybrali ste si" + map.get(5));
                platba();
            }
            else{
                System.out.println("Nespravna volba");
                System.out.println("Skus este raz!");
                Thread.sleep(1000);
                Diddy();
            }
        } catch (Exception e) {
            System.out.println("Somehing went wrong");
        }
       
        scanner.close();
        
    }
    public static void platba() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        Snack cena = new Snack();
        cena.setCena(1.9);
        System.out.println("Mate presne " + cena.getCena() + " Eur ?"  + " ano/nie");
        String vyber = scanner.nextLine();
        try {
            if(vyber.equalsIgnoreCase("ano")){
                System.out.println("Prosím vložte mince do kavomatu");
                Thread.sleep(1000);
                System.out.println("Vlozili ste mince do kavomatu....");
                System.out.println("Snack sa pripravuje...");
                Thread.sleep(1000);
                System.out.println("...");
                Thread.sleep(1000);
                System.out.println("...");
                Thread.sleep(1000);
                System.out.println("...");
                Thread.sleep(1000);
                System.out.println("Snack je pripraveny na zobratie, Dakujeme za navstevu!");
                System.exit(0);
    
            }
            if(vyber.equalsIgnoreCase("nie")){
                System.out.println("Zadajte presnu ciastku aku mate: ");
                int ciastka = scanner.nextInt();
                double vydavok = ciastka - cena.getCena();
                if(ciastka > 6){
                    System.out.println("Kavomat nemoze vidat taku ciastku");
                }
                else if (ciastka < 0) {
                    System.out.println("Zadali ste zlu hodnotu");
                }
                System.out.println("Tu je vas vydavok: " + vydavok + " Eur");
                System.out.println("Snack sa pripravuje...");
                Thread.sleep(1000);
                System.out.println("...");
                Thread.sleep(1000);
                System.out.println("...");
                Thread.sleep(1000);
                System.out.println("...");
                Thread.sleep(1000);
                System.out.println("Snack je pripraveny na zobratie, Dakujeme za navstevu!");
                System.exit(ciastka);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        scanner.close();
        
        
    }
    
}
