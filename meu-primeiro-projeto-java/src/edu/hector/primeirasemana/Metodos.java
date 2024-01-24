package edu.hector.primeirasemana;

public class Metodos {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 5;

        int dividendo = 3;
        int divisor = 4;
    }

public int somar(int numero1, int numero2){
    return numero1 + numero2;
}

public void imprimir(String texto){
    // não precisa de return
}

public double divir (int dividendo, int divisor) throws Exception{ // caso o divisor seja 0 entrara no exception
    return dividendo / divisor;
}

private void metodoPrivado(){
    
}

}
