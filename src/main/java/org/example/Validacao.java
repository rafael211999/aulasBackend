package org.example;

public class Validacao {
    static String porcentagemInss = "0";
    static String porcentagemVt = "0";
    static String porcentagenBonificacao = "0";
    public static double validacaoInss(double salarioInput){



        double inss = 0;


        if (salarioInput >= 2000) {
            inss = (salarioInput * 11) / 100;
            porcentagemInss =  "11%";
        } else if (salarioInput >= 1501 && salarioInput <= 1999) {
            inss = (salarioInput * 9) / 100;
            porcentagemInss = "9%";
        } else {
            inss = (salarioInput * 8) / 100;
        }

        return inss;
    }

    public static double validacaoVt(double salarioInput){
        double vt = 0;

        if (salarioInput > 1801) {
            vt = (salarioInput * 6) / 100;
            porcentagemVt = "6%";
        } else if (salarioInput >= 1201 && salarioInput <= 1800) {
            vt = (salarioInput * 4) / 100;
            porcentagemVt = "4%";
        } else {
            vt = 0;
        }

        return vt;
    }

    public  static double validacaoBonificacao(int tempoCasaInput, double salarioInput){

        double bonificacao = 0;
        if (tempoCasaInput >= 10) {
            bonificacao = (salarioInput * 5) / 100;
            porcentagenBonificacao = "5%";
        } else if (tempoCasaInput >= 5 && tempoCasaInput <= 9) {
            bonificacao = (salarioInput * 2) / 100;
            porcentagenBonificacao = "2%";
        } else {
            bonificacao = 0;
        }

        return bonificacao;
    }


    public  static String porcentagemI(){
        return porcentagemInss;
    }

    public  static String porcentagemV(){
        return porcentagemVt;
    }

    public  static String porcentagemB(){
        return porcentagenBonificacao;
    }







}
