import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sOUn = "S";

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero resultado = new Numero();

        System.out.printf("%nDigite o primeiro valor: ");
        n1.setValor(sc.nextDouble());

        System.out.printf("%nDigite a operação desejada ( +, -, /, *) : ");
        String op = sc.next();

        System.out.printf("%nDigite o segundo valor: ");
        n2.setValor(sc.nextDouble());

        switch (op) {
            case "+" -> resultado.setValor(n1.getValor() + n2.getValor());
            case "-" -> resultado.setValor(n1.getValor() - n2.getValor());
            case "/" -> resultado.setValor(n1.getValor() / n2.getValor());
            case "*" -> resultado.setValor(n1.getValor() * n2.getValor());
            default -> System.out.println("Opção inválida.");
        }

        System.out.println("Resultado: "+ resultado.getValor());

    }
}