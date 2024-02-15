package edu.hector.segundasemana.testes;
import java.util.Scanner;
public class TestGetSet {
    public static void main(String[] args) {
        telaInicial();
    }

    public static void telaInicial(){
        Scanner ler = new Scanner(System.in);
        int operacao = 0;

        System.out.println("================= Imports Brasil =================");
        System.out.println("Temos dois carros a venda qual deles te interessa?");
        System.out.println("1 - Supra\n2 - GT500\n3 - Sair");
        operacao = ler.nextInt();


        switch (operacao) {
            case 1:
                toyota();
                break;
            case 2:
                shelby();
                break;
            default:
                System.out.println("Informe uma das opções que está sendo exibida!");
                break;

            }
    }

    public static void toyota(){
        ObjetoGetSet toyota = new ObjetoGetSet();

        toyota.setModelo("Supra");
        toyota.setMotor("3.0 Turbo");
        toyota.setPortas(2);

        System.out.println("Carro: "+toyota.getModelo()+ "\nMotor: "+toyota.getMotor()+"\nPortas: "+toyota.getPortas());
    }

    public static void shelby(){
        ObjetoGetSet shelby = new ObjetoGetSet();

        shelby.setModelo("GT500");
        shelby.setMotor("V8");
        shelby.setPortas(2);

        System.out.println("Carro: "+shelby.getModelo()+ "\nMotor: "+shelby.getMotor()+"\nPortas: "+shelby.getPortas());
    }
}
