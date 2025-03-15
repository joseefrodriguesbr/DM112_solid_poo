package inatel;

public abstract class FaturaGenerica implements IFatura
{
	protected StringBuilder getConteudoFatura(Pedido pedido, String modalidade)
	{
		StringBuilder conteudoFatura = new StringBuilder();
		System.out.println("[" + this.getClass().getSimpleName() + "] Gerando conteúdo da fatura.\n");
		conteudoFatura.append("============================================================\n");
		conteudoFatura.append("COMERCIO ELETRONICO E SERVICOS \n");
		conteudoFatura.append("------------------------------------------------------------\n");
		for (Produto produto : pedido.getListaProdutos())
		{
			conteudoFatura.append(produto.getNome() + " : R$ " + produto.getPreco() + " \n");
		}
		conteudoFatura.append("------------------------------------------------------------\n");
		conteudoFatura.append("Valor total da fatura : R$" + pedido.getValorTotalCompra() + "\n");
		conteudoFatura.append("Modalidade de pagamento : " + modalidade + "\n");
		conteudoFatura.append("============================================================\n");
		return conteudoFatura;
	}

	@Override
	public abstract void gerarFatura(Pedido pedido, String modalidade);
}
