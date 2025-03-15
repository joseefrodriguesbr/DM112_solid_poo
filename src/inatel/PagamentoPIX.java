package inatel;

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
