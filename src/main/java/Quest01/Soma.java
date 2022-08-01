package Quest01;

public class Soma {
    public static void main(String[] args) {
        int indice, soma, k;
        indice = 13;
        soma = 0;
        k = 0;

        while(k < indice){
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);
    }
}
