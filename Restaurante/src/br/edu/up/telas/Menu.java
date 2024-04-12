package br.edu.up.telas;

import java.util.Scanner;

import br.edu.up.controles.CadastroFuncionario;

public class Menu {
    Scanner ler = new Scanner(System.in);

    public void mostrar() {

        System.out.println("-------------------------");
        System.out.println("MENU PRINCIPAL");
        System.out.println("-------------------------");

        int opcao = 0;

        System.out.println("1. Cadastrar funcionário \n2. Registrar pedido\n");

        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                mostrarMenuUsuario();
                break;
            case 2:

                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }

    }

    public void mostrarMenuUsuario() {

        System.out.println("-------------------------");
        System.out.println("MENU DE USUÁRIO");
        System.out.println("-------------------------");

        System.out.println("1. Listar \n2. Incluir \n3. Alterar \n4. Excluir \n5. Voltar\n");

        int opcao = ler.nextInt();

        CadastroFuncionario cadastro = new CadastroFuncionario();

        switch (opcao) {
            case 1:
                System.out.println(cadastro.getFuncionariosString());
                menuRetornar();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                mostrar();
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }

    }

    public void menuRetornar() {
        System.out.println("5. Voltar");
        int opcao = ler.nextInt();

        switch (opcao) {
            case 5:
                mostrarMenuUsuario();
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }

    }

}
