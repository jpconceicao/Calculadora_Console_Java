import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        exibirMenu();
        int opcao = sc.nextInt();

        realizarOperacao(opcao, sc);

        System.out.println("Aplicação Encerrada!");

        sc.close();
    }

    public static void exibirMenu() {
        System.out.println("\nSelecione a operação desejada: ");
        System.out.println("1 - Soma entre dois números");
        System.out.println("2 - Subtração entre dois números");
        System.out.println("3 - Multiplicação entre dois números");
        System.out.println("4 - Divisão entre dois números");
        System.out.println("5 - Numero elevado ao quadrado");
        System.out.println("0 - Finalizar aplicação\n");
    }

    public static void realizarOperacao(int opcao, Scanner sc) {
        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    soma(sc);
                    break;

                case 2:
                    subtracao(sc);
                    break;

                case 3:
                    multiplicacao(sc);
                    break;

                case 4:
                    divisao(sc);
                    break;

                case 5:
                    quadradoDoNumero(sc);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("\nDigite uma opção válida!");
                    break;
            }

            exibirMenu();
            opcao = sc.nextInt();
        }
    }

    public static void soma(Scanner sc) {
        System.out.println("Insira o primeiro numero: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        int segundoNumero = sc.nextInt();

        System.out.println(
                "\nO resultado de " + primeiroNumero + " + " + segundoNumero + " é: " + (primeiroNumero + segundoNumero));
    }

    public static void subtracao(Scanner sc) {
        System.out.println("Insira o primeiro numero: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        int segundoNumero = sc.nextInt();

        System.out.println(
                "\nO resultado de " + primeiroNumero + " - " + segundoNumero + " é: " + (primeiroNumero - segundoNumero));
    }

    public static void multiplicacao(Scanner sc) {
        System.out.println("Insira o primeiro numero: ");
        float primeiroNumero = sc.nextFloat();
        System.out.println("Insira o segundo numero: ");
        float segundoNumero = sc.nextFloat();

        System.out.println(
                "\nO resultado de " + primeiroNumero + " x " + segundoNumero + " é: " + (primeiroNumero * segundoNumero));
    }

    public static void divisao(Scanner sc) {
        System.out.println("Insira o primeiro numero: ");
        float primeiroNumero = sc.nextFloat();
        System.out.println("Insira o segundo numero: ");
        float segundoNumero = sc.nextFloat();

        System.out.println(
                "\nO resultado de " + primeiroNumero + " + " + segundoNumero + " é: " + (primeiroNumero / segundoNumero));
    }

    public static void quadradoDoNumero(Scanner sc)
    {
        System.out.println("Insira o primeiro numero: ");
        int numero = sc.nextInt();

        // Melhorar o quadrado do número
        System.out.println("O quadrado de " + numero + " é: " + (numero * numero));
    }

}