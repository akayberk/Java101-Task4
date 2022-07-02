import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        float gidilenKm, birimFiyat, acilis = 10;
        System.out.println("Lutfen kac km gittiginizi yaziniz");
        Scanner input = new Scanner(System.in);
        gidilenKm = input.nextFloat();
        System.out.println("Lutfen km basina kac tl attigini yaziniz");
        birimFiyat = input.nextFloat();
        float tutar = acilis + (gidilenKm * birimFiyat);
        boolean higherThan20 = tutar>20f;
        tutar = higherThan20 ? tutar:20f;
        System.out.println(tutar);

    }
}
