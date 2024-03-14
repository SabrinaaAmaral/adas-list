package br.com.projetoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<String>listaProdutos = new  ArrayList<String>();

		int opcao;

		do {
			System.out.println("*** Menu de opções ***");
			System.out.println("[1] - Listar produtos ");
			System.out.println("[2] - Adicionar       ");
			System.out.println("[3] - Alterar         ");
			System.out.println("[4] - Excluir         ");
			System.out.println("[0] - Sair            ");
			System.out.println("Escolha uma opção: ");

			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				
				
				if (listaProdutos.size()>0) {
				System.out.println("_Lista de Produtos");
				for (String produto: listaProdutos) {
				System.out.println(produto);	
				}
			}else {
				System.out.println("Nenhum Produto cadastrado ainda ......");
			}
				// Listar os produtos
				break;
			case 2:
				System.out.println("Digite o nome do Produto: ");
				String produto = scan.next();
				
				listaProdutos.add(produto);
				System.out.println("\nProduto cadastrado com sucesso");
				// Adicionar novos elementos
				break;
			case 3:
				System.out.println("Qual nome do Produto a ser alterado?");
				String produtoAtual = scan.next();
				
			     int index = listaProdutos.indexOf(produtoAtual);
			     if (index <0) {
			    	 System.out.println("Produto não encontrado com esse nome....");
			     
			     }else {
			    	 System.out.println("Qual novo nome para o produto?");
			    	 String produtoAlterado = scan.next();
			    	 listaProdutos.set(index,produtoAlterado);
			    	 System.out.println("Produto alterado com sucesso!");
			     }
				// Editar elementos
				break;
			case 4:
				System.out.println("Qual nome do produto a ser excluido?");
				String excluirProduto = scan.next();
				
				 boolean checkExclusao =listaProdutos.remove(excluirProduto);
				 if (checkExclusao == true) {
					 System.out.println("\nproduto excluído com sucesso!");
				 }else {
					 System.out.println("\nProduto não encontrado com esse nome....");
				 }
				 
				
				// Excluir elementos
				break;
			case 0:
				System.out.println("Saindo do menu ...");
				break;
				default:
					System.out.println("\nOpção de menu inválido!");
			}

		} while (opcao != 0);

		scan.close();
	}

}