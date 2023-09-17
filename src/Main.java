import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz:");
        muzik = input.nextInt();

        ortalama=((mat+fizik+kimya+turkce+muzik)/5);


        if (ortalama<=55) {

            System.out.println(" Sınıfı Geçemediniz!");

        }
        else {
            System.out.print("Sınıf Başarıyla Geçtiniz");
            System.out.print("Ortalamanız:" + ortalama);
        }

    }
}