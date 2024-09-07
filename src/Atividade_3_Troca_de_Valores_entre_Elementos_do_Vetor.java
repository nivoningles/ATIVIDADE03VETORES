public class Atividade_3_Troca_de_Valores_entre_Elementos_do_Vetor {
    public static void main(String[] args) {
        int[] numero = new int[2];

        numero[0] = 5;
        numero[1] = 10;

        System.out.println("Antes da troca\n Primeiro número "+numero[0]+" Segundo número "+numero[1]);

        int guardar = numero[0];
        numero[0]=numero[1];
        numero[1]=guardar;

        System.out.println("Depois da troca\n Primeiro número "+numero[0]+" Segundo número "+numero[1]);
    }
}
