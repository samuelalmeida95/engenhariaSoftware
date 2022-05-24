public class Wyllian {
    private int first;
    private int second;
    private int third;

    public Wyllian(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int numberAdder(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getThird() {
        return third;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public static void main(String[] args) {
        Wyllian eu = new Wyllian(7, 77, 777);

        int soma = eu.numberAdder(eu.getFirst(), eu.getSecond(), eu.getThird());

        System.out.println("A soma dos números de Wyllian é: " + soma);
    }
}