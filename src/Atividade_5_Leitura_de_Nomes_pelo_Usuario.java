import java.util.Locale;
import java.util.Scanner;

public class Atividade_5_Leitura_de_Nomes_pelo_Usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String[] nome = new String[3];

        System.out.print("Informe o primeiro nome: ");
        nome[0] = sc.nextLine();
        System.out.print("Informe o segundo nome: ");
        nome[1] = sc.nextLine();
        System.out.print("Informe o terceiro nome: ");
        nome[2] = sc.nextLine();

        System.out.println("\nOs nomes informados foram:\n"+nome[0]+"\n"+nome[1]+"\n"+nome[2]);
    }
}
