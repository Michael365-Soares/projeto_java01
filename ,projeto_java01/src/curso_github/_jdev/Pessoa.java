package curso_github._jdev;

import java.util.Date;

public class Pessoa {
    private int idade;
    private String nome;
    private String sobreNome;
    //Acabei de add
    private Date dataDeNascimento;
    
    public Pessoa() {}
    
	public Pessoa(String nome, String sobreNome) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
    
    
    
    
}
