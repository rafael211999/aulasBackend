package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nomeInput = "";
        int tempoCasaInput = 0;
        double salarioInput = 0;
        double inss = 0;
        double vt = 0;
        double bonificacao = 0;
        double salarioLiquido = 0;
        String porcentagemInss = "";
        String porcentagemVt = "";
        String porcentagenBonificacao = "";

        System.out.println("Bem-vindo ao nosso programa");
        System.out.println(" ");

        System.out.println("Digite o nome do colaborador:");
        nomeInput = sc.nextLine();

        System.out.println(" ");

        System.out.println("Quanto tempo de casa esse colaborador tem?");
        tempoCasaInput = sc.nextInt();

        System.out.println(" ");
        System.out.println("Qual o salário do colaborador?");
        salarioInput = sc.nextDouble();


        //Calculo de inss;

        inss = Validacao.validacaoInss(salarioInput);
        porcentagemInss = Validacao.porcentagemI();





        //Calculo de Vt;

        vt = Validacao.validacaoVt(salarioInput);
        porcentagemVt = Validacao.porcentagemV();

        //Calculo de bonificação

        bonificacao = Validacao.validacaoBonificacao(tempoCasaInput, salarioInput);
        porcentagenBonificacao = Validacao.porcentagemB();


        // Salário liquido
        salarioLiquido = (salarioInput + bonificacao) - (inss + vt);

        //Resultado

        Imprimir.imprimirDoc(nomeInput, tempoCasaInput, salarioInput, inss, vt, bonificacao, salarioLiquido, porcentagemInss, porcentagemVt, porcentagenBonificacao);


    }
}