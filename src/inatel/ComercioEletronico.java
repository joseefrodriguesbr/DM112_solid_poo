package inatel;

public class ComercioEletronico
{
	public static void main(String[] args)
	{
		//Categorias
		System.out.println("[ComercioEletronico] Iniciando categorias...");
		Categoria categoria1 = new Categoria(1, "Eletrônicos");
		Categoria categoria2 = new Categoria(2, "Eletrodomésticoss");
		Categoria categoria3 = new Categoria(3, "Móveis");
		//Produtos
		System.out.println("[ComercioEletronico] Iniciando produtos...");
		Produto produto1 = new Produto("Video Game", 815.50, categoria1);
		Produto produto2 = new Produto("Celular", 2500.56, categoria1);
		Produto produto3 = new Produto("Sofá", 700.86, categoria3);
		Produto produto4 = new Produto("Geladeira", 1558.35, categoria2);
		// Pedido1
		Pedido pedido1 = new Pedido();
		pedido1.adicionarProduto(produto1);
		pedido1.adicionarProduto(produto2);
		pedido1.adicionarProduto(produto3);
		pedido1.finalizar(new PagamentoCartaoCredito("8888-2222-4444-3333"), new FaturaEmail("teste@inatel.com.br"));
		// Pedido2
		Pedido pedido2 = new Pedido();
		pedido2.adicionarProduto(produto3);
		pedido2.adicionarProduto(produto4);
		pedido2.finalizar(new PagamentoPIX("676768123.79789.PIX.INATEL"), new FaturaImpressa());
	}
}
