package inatel;

//Princípio SRP : classe com apenas uma responsabilidade, apenas um motivo para ser alterada
public class Categoria
{
	private int codigo;

	private String nome;

	public Categoria(int codigo, String nome)
	{
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo()
	{
		return codigo;
	}

	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
}
