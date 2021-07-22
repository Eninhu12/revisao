package br.com.enio.revisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        	Scanner ler = new Scanner(System.in);
        	
        	System.out.println("Digite um nome : ");
        	String nome = ler.next();
        	
			List<String> nomes = new ArrayList<>();
			
			
			while(!"parar".equals(nome)) {
				  nomes.add(nome);
			      System.out.println("Digite um nome : ");
			   nome = ler.next();
			    
			}
			    System.out.println("Lista fechada.");
			    
			for(int i=0;i<nomes.size();i++) {
				System.out.println(nomes.get(i));
			}
		
    }
}