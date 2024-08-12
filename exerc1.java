public class exerc1 {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(fatorial(numero));
        System.out.println(somatorio(5));
    }

    // Modele e implemente um método recursivo que calcule o fatorial de um número n passado como parâmetro.
    public static int fatorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * fatorial(num - 1);
        }
    }

    // Modele e implemente um método recursivo que calcule o somatório de um número n (passado como parâmetro) até 0.
    public static int somatorio(int num){

        if (num == 0){
            return 0;
        }
        else if (num == 1){
            return 1;
        }
        else{
            return num + somatorio(num-1);
        }

    }
}