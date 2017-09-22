package model;

public class Pedido {
	private int idPedido;
	private Cliente idCliente;
	private Funcionario idFuncionario;
	private String dataPed;
	private float precoPed;
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public Cliente getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}
	public Funcionario getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(Funcionario idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public float getPrecoPed() {
		return precoPed;
	}
	public void setPrecoPed(float precoPed) {
		this.precoPed = precoPed;
	}
	public String getDataPed() {
		return dataPed;
	}
	public void setDataPed(String dataPed) {
		this.dataPed = dataPed;
	}
	
	
}
