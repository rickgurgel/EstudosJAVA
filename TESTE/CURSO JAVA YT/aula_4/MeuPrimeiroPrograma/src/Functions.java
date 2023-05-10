public class Functions {
    public static void main(String[] args){
        sum(10, 15);
        sum(7, 15);
        sum(8, 15);
        sum(5, 15);
    }

    static void sum(int x, int y) {
        // static void -> declaração padrão
        // sum -> nome da função, geralmente usamos verbos para definir o que a função fará
        // () -> usamos para definir o que chegará naquela função
        // (tipo nomeDaVariavel)
        // {} -> bloco de código

        System.out.println(x+y);

    }
}
