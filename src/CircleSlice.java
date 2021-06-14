import java.util.Scanner;
import java.lang.Math;

public class CircleSlice {
    public static void main(String[] args) {
        double r, slice;

        Scanner s = new Scanner(System.in);
        System.out.print("Lütfen hesaplanmasını istediğiniz dairenin yarıçapını giriniz: ");
        r = s.nextDouble();
        System.out.print("Lütfen hesaplanmasını istediğiniz daire diliminin açısını giriniz(0-360): ");
        slice = s.nextDouble();
        if (slice < 0 || slice > 360 || r < 0)
        {
            System.out.println("Hatalı giriş!");
            return;
        }

        System.out.print("Daire diliminin alanı: " + (Math.round((Math.PI * r * r * slice / 360.0) * 100.0) / 100.0));
    }
}
