
public class Produto {
	private String nomeProd;
	private String precoProd;

	
	
	//GETTERS AND SETTERS
	public void setNome(String nome) {
		this.nomeProd = nome;
	}
		
	public void setPreco(String preco) {
		this.precoProd = preco;
	}
		
	public String getNome() {
		return this.nomeProd;
	}
		
	public String getPreco() {
		return this.precoProd;
	}
}
