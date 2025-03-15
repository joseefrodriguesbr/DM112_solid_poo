package inatel;

//Princípio SRP : classe com apenas uma responsabilidade, apenas um motivo para ser alterada
//Princípio LSP : Uma classe derivada deve ser substituível por sua classe base. Subclasse substitui sua superclasse sem alterar o comportamento esperado.
public class PagamentoPIX implements IPagamento
{
	private String codigoPIX;

	public PagamentoPIX(String codigoPIX)
	{
		this.codigoPIX = codigoPIX;
	}

	@Override
	public String getModalidade()
	{
		return "PIX";
	}

	@Override
	public void realizarPagamento(double valor)
	{
		System.out.println("[" + this.getClass().getSimpleName() + "] Modalidade de pagamento : PIX.");
		System.out.println("[" + this.getClass().getSimpleName() + "] Código PIX : " + this.codigoPIX);
		System.out.println("[" + this.getClass().getSimpleName() + "] Pagamento PIX realizado com sucesso.");
	}
}
