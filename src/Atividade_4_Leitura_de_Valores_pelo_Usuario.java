import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_4_Leitura_de_Valores_pelo_Usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String[] numeros = new String[3];
        Double[] numerosFormatados = new Double[3];
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Informar o primeiro valor: ");
        numeros[0] = sc.nextLine();
        System.out.print("Informar o segundo valor: ");
        numeros[1] = sc.nextLine();
        System.out.print("Informar o terceiro valor: ");
        numeros[2] = sc.nextLine();

        numeros[0] = numeros[0].replace(",", ".");
        numeros[1] = numeros[1].replace(",", ".");
        numeros[2] = numeros[2].replace(",", ".");

        numerosFormatados[0] = Double.parseDouble(numeros[0]);
        numerosFormatados[1] = Double.parseDouble(numeros[1]);
        numerosFormatados[2] = Double.parseDouble(numeros[2]);

        Double mediaDosNumeros = (numerosFormatados[0]+numerosFormatados[1]+numerosFormatados[2])/3;
        String mediaDosNumerosFormatado = df.format(mediaDosNumeros);

        numeros[0] = df.format(numerosFormatados[0]);
        numeros[1] = df.format(numerosFormatados[1]);
        numeros[2] = df.format(numerosFormatados[2]);

        System.out.println("\nOs numero inseridos foram:"+" \n"+numeros[0]+" \n"+numeros[1]+" \n"+numeros[2]+"\nE a média destes números é:\n"+mediaDosNumerosFormatado);

    }
}
