    package br.andre.projeto1;
    import java.util.Scanner;

    public class Calculadora {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            int operacao;

            System.out.println("\nCalculadora!\n");

           while (true){
                System.out.println("Digite o primeiro número:");
                double numero1 = sc.nextDouble();

                System.out.println("Digite o segundo número:");
                double numero2 = sc.nextDouble();

                System.out.println("Escolha a operação: ");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("99 - Sair");

                System.out.println("Digite a opção desejada");
                operacao = sc.nextInt();
                
                switch(operacao){
                    case 1:
                        System.out.printf("Resultado da soma = %s", soma(numero1, numero2));
                        break;
                    case 2:
                        System.out.printf("Resultado da soma = %s", subtracao(numero1, numero2));
                        break;
                    case 3:
                        System.out.printf("Resultado da soma = %s", divisao(numero1, numero2));
                        break;
                    case 4:
                        System.out.printf("Resultado da soma = %s", multiplicacao(numero1, numero2));
                        break;
                    default:
                    case 99:
                        System.out.print("Saindo!");
                        System.exit(0);
                }
            }
        }

        public static double soma(double a, double b){return a + b;}
        public static double subtracao(double a, double b){return a - b;}
        public static double divisao(double a, double b){return a / b;}
        public static double multiplicacao(double a, double b){return a * b;}}
