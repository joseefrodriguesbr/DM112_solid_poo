package inatel;

//Princípio OCP : Objeto/entidade aberto para extensão, mas fechada para modificação. Não precisa ser modificada para adicionar novos tipos de Fatura. 
//Princípio LSP : Uma classe derivada deve ser substituível por sua classe base. Garante que todas as subclasses podem ser usadas de forma intercambiável sem quebrar o comportamento.
public abstract class FaturaGenerica implements IFatura
{
	protected StringBuilder getConteudoFatura(Pedido pedido, String modalidade)
	{
		StringBuilder conteudoFatura = new StringBuilder();
		System.out.println("[" + this.getClass().getSimpleName() + "] Gerando conteúdo da fatura.\n");
		conteudoFatura.append("============================================================\n");
		conteudoFatura.append("COMERCIO ELETRONICO - FATURA\n");
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
