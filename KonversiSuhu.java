import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);        
    //Konversi suhu dari CELCIUS KE FAHRENHEIT, REAMURE DAN KELVIN

        //masukkan suhu celcius
        System.out.println("Masukkan suhu celcius: ");
        double celcius = scanner.nextDouble();
        
        //Rumus celcius ke Reamur
        double reamur = (4.0/5.0)*celcius;
        //Tampilkan hasil konversi celcius ke reamur
        System.out.println("konversi "+ celcius +" derajat celcius = "+ reamur + " derajat reamur ");
    
        //Rumus Celcius ke Fahrenheit
        double fahrenheit = (9.0 / 5.0)*celcius + 32;
        //tampilkan hasil konversi celcius ke Fahrenheit
        System.out.println("konversi "+celcius + " derajat celcius = "+ fahrenheit + " derajat Fahrenheit ");

        //Rumus celcius ke Kelvin
        double kelvin = celcius + 237.15;
        //tampilkan hasil konversi celcius ke Kelvin
        System.out.println("konversi "+celcius + " derajat celcius = "+ kelvin + " derajat kelvin ");
        

    }
}
