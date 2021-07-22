package br.com.enio.revisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
			List<String> nomes = new ArrayList<>();
			String nome = null;
			
			while(!"parar".equals(nome)) {
			    System.out.println("Digite um nome : ");
			    nome = ler.next();
			    nomes.add(nome);
			}
			    System.out.println("Lista fechada.");
			    
			for(int i=0;i<nomes.size();i++) {
				System.out.println(nomes.get(i));
			}
		}
    }
}