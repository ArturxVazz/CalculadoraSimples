package CalculadoraSimples;

import java.util.Scanner;

public class CalculadoraSimples {

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("*-- Menu --*");
            System.out.println("-------------");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao < 1 || opcao > 4);

        return opcao;
    }

    public static float entradaDados(){
        Scanner input = new Scanner(System.in);
        System.out.println("*--* Entrada de Dados *--*");
        System.out.println("----------------------");
        System.out.println("Numero:");

        float numero = input.nextFloat();
        return numero;
    }

    public static float adicao(float n1, float n2){
        System.out.println("*--* Adição *--*");
        System.out.println("-----------------");

        return n1 + n2;
    }

    public static float subtracao(float n1, float n2){

        System.out.println("*--* Subtração *--*");
        System.out.println("---------------------");
        return n1 - n2;
    }

    public static float multiplicacao(float n1, float n2){
        System.out.println("*--* multiplicacao *--*");
        System.out.println("-------------------------");
        return n1 * n2;
    }

    public static float divisao(float n1, float n2){
        System.out.println("*--* divisao *--*");
        System.out.println("-----------------------");
        return n1 / n2;
    }

    public static void imprimir(float result){
        System.out.println("*--* imprimir *--*");
        System.out.println("--------------------");
        System.out.println("Resultado: " + result);
    }

    public static float controlador(int opcao, float n1, float n2){
        System.out.println("*--* controlador *--*");
        System.out.println("----------------------");
        float result = 0;

        switch (opcao) {
            case 1:
                result= adicao(n1,n2);
                break;
            case 2:
                result = subtracao(n1,n2);
                break;
            case 3:
                result = multiplicacao(n1,n2);
                break;
            case 4:
                result = divisao(n1,n2);
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        int opcao = menu();
        float n1 = entradaDados();
        float n2 = entradaDados();
        float result = controlador(opcao, n1, n2);
        imprimir(result);
    }
}
