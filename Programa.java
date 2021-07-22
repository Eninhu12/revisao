import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        String nome;
        do{
            System.out.println("Digite um nome : ");
            nome = ler.next();
            nomes.add(nome);
        }
        while(!"parar".equals(nome));
            System.out.println("Lista fechada.");


    }
}
