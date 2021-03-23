//Modificador de acesso - public, private, protected

public class Cliente {
	private String cpfClient;
	private String nomeClient;
	
	//GETTERS AND SETTERS
	public void setNome(String nome) {
		this.nomeClient = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpfClient = cpf;
	}
	
	public String getNome() {
		return this.nomeClient;
	}
	
	public String getCpf() {
		return this.cpfClient;
	}
	
	
	
	/* CONSTRUCTOR
	 * public Cliente(String cpf, String nome) { cpfClient = cpf; nomeClient = nome;
	 * 
	 * }
	 */
	//caracteristica/atributo/propriedade
}
