package inatel;

public class FaturaImpressa extends FaturaGenerica
{
	public void gerarFatura(Pedido pedido, String modalidade)
	{
		System.out.println(getConteudoFatura(pedido, modalidade).toString());
		System.out.println("[" + this.getClass().getSimpleName() + "] Conectando com impressora.");
		System.out.println("[" + this.getClass().getSimpleName() + "] Fatura encaminhada para impressora.");
	}
}
