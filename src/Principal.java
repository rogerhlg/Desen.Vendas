import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcao;
		String nome,cpf;
		Scanner sc = new Scanner(System.in);
		Vendedor vendedor = new Vendedor();
		Produto produto = new Produto();
		ArrayList<Cliente> clientes = new ArrayList <Cliente>();
		do {
			System.out.println("## MENU ##");
			System.out.println("1-Cadastrar Cliente");
			System.out.println("2-Listar Clientes");
			System.out.println("3-Cadastrar Vendedor");
			System.out.println("4-");
			System.out.println("5-Cadastrar Produto");
			System.out.println("0-Sair");
			opcao = sc.nextInt();
			switch(opcao){
				case 1:
					Cliente cliente = new Cliente();
										
					System.out.println("Insira seu NOME: ");
					cliente.setNome(sc.next());
					System.out.println(cliente.getNome());
					
					System.out.println("Insira o seu CPF: ");
					cliente.setCpf(sc.next());
					System.out.println(cliente.getCpf());
					
					clientes.add(cliente);
					
					System.out.println(cliente);
//					Cliente cliente = new Cliente("cpf","nome"); - CONSTRUCTOR
				break;
				
				case 2:
					System.out.println("### LISTA CLIENTES ###");
					System.out.println(clientes);
					
					
				break;
				
				case 3:
					System.out.println("Insira o NOME do VENDEDOR: ");
					vendedor.setNome(sc.next());
					System.out.println(vendedor.getNome());
					
					System.out.println("Insira o CPF do VENDEDOR: ");
					vendedor.setCpf(sc.next());
					System.out.println(vendedor.getCpf());
				break;
				
				case 5:
					System.out.println("Insira o NOME do PRODUTO: ");
					produto.setNome(sc.next());
					System.out.println(produto.getNome());
					
					System.out.println("Insira o PREÇO do PRODUTO: ");
					produto.setPreco(sc.next());
					System.out.println(produto.getPreco());
				break;
				
				case 0:
					System.out.println("SAINDO...");
				break;
				default:
					System.out.println("Opção inexistente... Tente novamente.");
			}
		}while(opcao!=0);
		
		
		
		

	}

}
