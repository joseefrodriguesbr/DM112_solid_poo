package inatel;

// Princípio OCP : Permite que o objeto/entidade esteja aberto para extensão, mas fechado para modificação. Permite adicionar novos tipos de Fatura. 
// Princípio ISP : Classe nãp implementa interfaces e métodos que não irá utilizar
public interface IFatura
{
	public void gerarFatura(Pedido pedido, String modalidade);
}
