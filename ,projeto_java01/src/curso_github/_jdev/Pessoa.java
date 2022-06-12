package curso_github._jdev;

import java.util.Date;

public class Pessoa {
    private int idade;
    private String nome;
    private String sobreNome;
    //Acabei de add
    private Date dataDeNascimento;
    private Date dataDeNascimento2;
    public Pessoa() {}
    
	
	
	public Pessoa(int idade, String nome, String sobreNome, Date dataDeNascimento) {
		super();
		this.idade = idade;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataDeNascimento = dataDeNascimento;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
    
    
    
    
}
