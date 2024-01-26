package edu.hector.primeirasemana;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = ler.nextLine();

        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();

        System.out.println("Digite sua altura:");
        double altura = ler.nextDouble();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");
        ler.close();
        }
        catch (java.util.InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos");
        }
        /*
         * Possíveis exceções que podem acontecer:
         * - Não informar o nome e sobrenome
         * - O valor da idade ter um caractere NÃO numérico
         * - O valor da altura ter uma vírgula ou invês de ser um ponto (padrão americano)
         */

    }
}
