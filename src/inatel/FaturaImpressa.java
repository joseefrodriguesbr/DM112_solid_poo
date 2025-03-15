package inatel;

//Princípio SRP : classe com apenas uma responsabilidade, apenas um motivo para ser alterada
//Princípio LSP : Uma classe derivada deve ser substituível por sua classe base. Subclasse substitui sua superclasse sem alterar o comportamento esperado.
public class FaturaImpressa extends FaturaGenerica
{
	public void gerarFatura(Pedido pedido, String modalidade)
	{
		System.out.println(getConteudoFatura(pedido, modalidade).toString());
		System.out.println("[" + this.getClass().getSimpleName() + "] Conectando com impressora.");
		System.out.println("[" + this.getClass().getSimpleName() + "] Fatura encaminhada para impressora.");
	}
}
