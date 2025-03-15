package inatel;

public interface IPagamento
{
	public String getModalidade();

	public void realizarPagamento(double valor);
}
