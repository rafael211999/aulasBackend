package org.example;

public class Imprimir {

    public static void imprimirDoc(String nomeInput, int tempoCasaInput, double salarioInput, double inss, double vt
            , double bonificacao, double salarioLiquido,
                                   String porcentagemInss, String porcentagemVt, String porcentagenBonificacao) {


        System.out.println(" ");
        System.out.println("Contra-cheque ");
        System.out.println("-------------------------------------------------------");
        System.out.println("Nome: " + nomeInput);
        System.out.println(" ");
        System.out.println("Salário Bruto: R$" + salarioInput);
        System.out.println("Tempo de casa: " + tempoCasaInput + " anos");
        System.out.println("Desconto de inss: " + porcentagemInss + " -- " + "R$" + inss);
        System.out.println("Desconto de VT: " + porcentagemVt + " -- " + "R$" + vt);
        System.out.println("Bonificação: " + porcentagenBonificacao + " -- " + "R$" + bonificacao);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Salário Liquido: R$" + salarioLiquido);
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");
    }
}