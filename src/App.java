import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Exercício 14.

        //Entrada
        Double peso, excesso, limite, multa, aMais;
        Scanner teclado;

        teclado = new Scanner(System.in);
        System.out.println ("Digite o peso do peixe: ");

        peso = teclado.nextDouble();
        teclado.close();

        //Processamento
        limite = 50.0;
        aMais = 4.0;
        excesso = (peso - limite);
        multa = (peso - limite) * aMais;

        //Saída
        System.out.println("peso " + peso + "kg");
        System.out.println("excesso " + excesso + "kg");
        System.out.println("multa " + multa + "reais");

        System.out.println("Observação: Caso exista algum número negativo, considerá-lo igual a 0 (zero)");
        System.out.println();

    
    }
}
