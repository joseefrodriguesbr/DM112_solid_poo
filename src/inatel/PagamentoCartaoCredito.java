package inatel;

//Princípio SRP : classe com apenas uma responsabilidade, apenas um motivo para ser alterada
//Princípio LSP : Uma classe derivada deve ser substituível por sua classe base. Subclasse substitui sua superclasse sem alterar o comportamento esperado.
public class PagamentoCartaoCredito implements IPagamento
{
	private String numeroCartao;

	public PagamentoCartaoCredito(String numeroCartao)
	{
		this.numeroCartao = numeroCartao;
	}

	@Override
	public String getModalidade()
	{
		return "CARTÃO DE CRÉDITO";
	}

	@Override
	public void realizarPagamento(double valor)
	{
		System.out.println("[" + this.getClass().getSimpleName() + "] Modalidade de pagamento : CARTÃO DE CRÉDITO");
		System.out.println("[" + this.getClass().getSimpleName() + "] Número do cartão : " + this.numeroCartao);
		System.out.println("[" + this.getClass().getSimpleName() + "] Pagamento com Cartão de Crédito realizado com sucesso.");
	}
}
