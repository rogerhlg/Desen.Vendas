import java.util.Date;

//Modificador de acesso - public, private, protected

public class Cliente {
	
	public Cliente() {
		this.criadoEm = new Date();
		this.estaAtivo = true;
		System.out.println("Criou o cliente...");
	}
	
	private String cpf;
	private String nome;
	private Date criadoEm;
	private boolean estaAtivo;
	
	
	//GETTERS AND SETTERS


	@Override
	public String toString() {
	  return "\n1Nome: " + nome + "\nData: " + criadoEm + "\nCPF: " + cpf +"\nStatus: " + estaAtivo + "\n";
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getCriadoEm() {
		return criadoEm;
	}


	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}


	public boolean isEstaAtivo() {
		return estaAtivo;
	}


	public void setEstaAtivo(boolean estaAtivo) {
		this.estaAtivo = estaAtivo;
	}
	
	
	/* CONSTRUCTOR
	 * public Cliente(String cpf, String nome) { cpfClient = cpf; nomeClient = nome;
	 * 
	 * }
	 */
	//caracteristica/atributo/propriedade
}
