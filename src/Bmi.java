import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {


        //Boy bilgisinin alinmasi
        Scanner sc= new Scanner(System.in);
        System.out.println("Lutfen boyunuzu metre cinsinden giriniz: ");
        double boy = sc.nextDouble();

        //Kilo bilgisinin alinmasi
        System.out.println("Lutfen kilonuzu giriniz: ");
        double kilo = sc.nextDouble();

        double bmi = kilo / (boy*boy);

        System.out.println("Vucut kitle indeksiniz: " + bmi);


    }
}

