package br.com.enio.revisao;

public class Programa2 {
    public static void main(String[] args_) {
        String[] args= {"dividir","4","2"};
        
        int r;
        Integer a = Integer.valueOf(args[1]);
        Integer b = Integer.valueOf(args[2]);
        
        if("dividir".equals(args[0])){
            r=a/b;
            System.out.println("O resultdo da divisão é : "+r);
        }
        else if("Somar".equals(args[0])){
            r=a+b;
            System.out.println("O resultado da Soma é : "+r);
        }
        else if("multiplicar".equals(args[0])){
            r=a*b;
            System.out.println("O resultado da multiplicação é : "+r);
        }
    }
}
