public class App {
    public static void main(String[] args) throws Exception {
        
        int numero = -10;
        String resultado ="";
        if(numero >= 0){
            resultado = "Positivo";
        }
        else{
            resultado = "Negativo";
        }

        System.out.println("Hello, World! o numero é: " + resultado);
    }
}
