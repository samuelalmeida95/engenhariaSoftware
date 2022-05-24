public class Main {
    public static void main(String[] args) {

        SamuelAlmeida somaDeNumeros = new SamuelAlmeida();
        somaDeNumeros.soma();
      
        JoelioMarinho teste = new JoelioMarinho(12,3);
        System.out.println(teste.soma());

        Wyllian eu = new Wyllian(7, 77, 777);
        int soma = eu.numberAdder(eu.getFirst(), eu.getSecond(), eu.getThird());
        System.out.println("A soma dos números de Wyllian é: " + soma);
    }
}
