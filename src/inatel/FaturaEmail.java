package inatel;

//Princípio SRP : classe com apenas uma responsabilidade, apenas um motivo para ser alterada
//Princípio LSP : Uma classe derivada deve ser substituível por sua classe base. Subclasse substitui sua superclasse sem alterar o comportamento esperado.
public class FaturaEmail extends FaturaGenerica
{
	private String email;

	public FaturaEmail(String email)
	{
		this.email = email;
	}

	@Override
	public void gerarFatura(Pedido pedido, String modalidade)
	{
		System.out.println(getConteudoFatura(pedido, modalidade).toString());
		System.out.println("[" + this.getClass().getSimpleName() + "] Conectando ao servidor de e-mail.");
		System.out.println("[" + this.getClass().getSimpleName() + "] Fatura encaminhada por e-mail (" + this.email + ").");
	}
}
