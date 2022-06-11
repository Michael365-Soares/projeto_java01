package br.com.michaelsoares365.estru_dados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio01 {
   public static void main(String[] args) {
	   
	   List<Integer> numeros=new ArrayList<>();
	   List<Character> letras=new ArrayList<>();
	   List<String> outros=new ArrayList<>();
	   
	   Scanner input=new Scanner(System.in);
	   String entrada;
	   System.out.println("Digite uma expressão algébrica neste formato(n1 / n2 (+/-/*/-/) n3 / n4)");
	   entrada=input.nextLine();
	   input.close();
	   Predicate<String> soma=c->c.equals("+");
	   Predicate<String> subtr=c->c.equals("-");
	   Predicate<String> multi=c->c.equals("*");
	   Predicate<String> divid=c->c.equals("/");
	   @SuppressWarnings("unused")
	   Function<List<Integer>,String> simpli=lista->{
		   for(int i=1;i<1000;i++) {
			   if(lista.get(0)%i==0&&lista.get(1)%i==0) {
				   return ""+(lista.get(0)/i)+"/"+(lista.get(1)/i);
			   } 
			   if(lista.get(0)%i==0||lista.get(1)%i==0){
				   return ""+(lista.get(0)/i)+"/"+(lista.get(1)/i);
			   }
		   }
		   return lista.get(0)+"/"+lista.get(1);
	   };
	   char[] op=entrada.toCharArray();
	   for(char c:op) {
		   System.out.print(c);
	   }
   }
}
