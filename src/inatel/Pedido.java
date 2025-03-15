package inatel;

import java.util.ArrayList;
import java.util.List;

public class Pedido
{
	private List<Produto> listaProdutos = new ArrayList<Produto>();

	private double valorTotalCompra = 0;

	public Pedido()
	{
		System.out.println("\n[" + this.getClass().getSimpleName() + "] ############################################# PEDIDO INICIADO   #############################################");
	}

	public void adicionarProduto(Produto produto)
	{
		listaProdutos.add(produto);
	}

	public List<Produto> getListaProdutos()
	{
		return listaProdutos;
	}

	public double getValorTotalCompra()
	{
		return valorTotalCompra;
	}

	private void calcularValorTotalCompra()
	{
		for (Produto produto : listaProdutos)
		{
			valorTotalCompra = valorTotalCompra + produto.getPreco();
		}
	}

	public void finalizar(IPagamento iPagamento, IFatura iFatura)
	{
		calcularValorTotalCompra();
		iPagamento.realizarPagamento(this.valorTotalCompra);
		iFatura.gerarFatura(this, iPagamento.getModalidade());
		System.out.println("[" + this.getClass().getSimpleName() + "] ############################################# PEDIDO FINALIZADO ############################################# \n\n");
	}
}
