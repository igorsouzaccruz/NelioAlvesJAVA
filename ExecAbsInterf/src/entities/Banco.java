package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco implements Imprimivel {

	private List<ContaBancaria> list = new ArrayList<>();

	public Banco(List<ContaBancaria> list) {
		super();
		this.list = list;
	}

	public List<ContaBancaria> getList() {
		return list;
	}

	public void setList(List<ContaBancaria> list) {
		this.list = list;
	}

	public void inserir(ContaBancaria conta) {
		list.add(conta);
	}

	public void remover(ContaBancaria conta) {
		list.remove(conta);
	}

	public String procurarConta(Integer numConta) {
		if (numConta == ((ContaBancaria) list).getNumConta()) {
			return ((ContaBancaria) list).mostrarDados();
		}
		return null;
	}

	public String imprimirList(List<ContaBancaria> list) {
		for (ContaBancaria dados : list) {
			System.out.println("Contas: " + dados);
		}
		return null;
	}

	@Override
	public String mostrarDados() {
		return imprimirList(list);
	}

}
