package classesAleatorias;

public class Consulta {
	private String data;
	private String nomePcente;
    private String nomeDents;
    
    public Consulta(String data, String nomePcente, String nomeDents) {
    	this.data = data;
    	this.nomePcente = nomePcente;
    	this.nomeDents = nomeDents;
    }
    
    public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public String getNomePcente() {
		return nomePcente;
	}
	public void setNomePcente(String nomePcente) {
		this.nomePcente = nomePcente;
	}
	
	public String getNomeDents() {
		return nomeDents;
	}
	public void setNomeDents(String nomeDents) {
		this.nomeDents = nomeDents;
	}
	

}