package br.com.enio.revisao;

public class Programa2 {
    public static void main(String[] args_) {
        String[] args= {"multiplicar","4","2","batata"};
        
        int r;
        Integer a = Integer.valueOf(args[1]);
        Integer b = Integer.valueOf(args[2]);
        if(args.length>3) {
        	System.out.println("ERROERROERROERRO!!!!!");
        }
        
        else if("dividir".equals(args[0])){
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
