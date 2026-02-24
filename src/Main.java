import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o índice de qualidade do ar: ");
        float indice = sc.nextFloat();

        System.out.println();

        System.out.println(Classification.resultClassificacao(indice));
        System.out.println(Classification.resultEfeitos(indice));

        sc.close();
    }
}