package br.com.projetoList;

import java.util.ArrayList;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		//Declarar e inicializar  uma Lista
		List<String> listaNomes = new ArrayList<String>();
		//Descobrindo tamanho da lista
		System.out.println(listaNomes.size());
		
		//Aplicando CRUD
        //Create : Inserindo elementos
		listaNomes.add("Harry");
		listaNomes.add("Rony");
		listaNomes.add("Hermione");
		listaNomes.add("Luna");
		//System.out.println(listaNomes);
	
		// READ : Listar os elementos
		System.out.println("- Lista de presença -");
		


		//Encontrar o index de um elemento 
		
		int indexAlterar = listaNomes.indexOf("Rony");
		int indexExcluir = listaNomes.indexOf("Luna");
		
		//System.out.println(index);
		
		
		
		// Edit : Editar elementos 
		listaNomes.set(indexAlterar, "Rony Weslay");
		//System.out.println("-----------");
		
		// DELETE: Remover elementos
		
		listaNomes.remove("Luna");
		System.out.println("----");
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
		
		
		
		
		
		

	

	}
     
}
