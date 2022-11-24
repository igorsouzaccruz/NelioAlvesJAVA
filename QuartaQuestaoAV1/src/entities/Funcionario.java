package entities;

public class Funcionario {

	private Integer codCargo;
	private char sexo;
	private double horasTrabalhadas;
	private Cargo cargo;
	
	public Funcionario() {
	}

	public Funcionario(Integer codCargo, char sexo, double horasTrabalhadas, Cargo cargo) {
		this.codCargo = codCargo;
		this.sexo = sexo;
		this.horasTrabalhadas = horasTrabalhadas;
		this.cargo = cargo;
	}

	public Integer getCodCargo() {
		return codCargo;
	}

	public void setCodCargo(Integer codCargo) {
		this.codCargo = codCargo;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double salarioTotal() {
		double salarioTotal = horasTrabalhadas * cargo.getvalorHoraHomem();
		if(sexo == 'F') {
			salarioTotal += salarioTotal*0.2;
		}
		return salarioTotal;
	}

	@Override
	public String toString() {
		return "Funcionario [codCargo=" + codCargo + ", sexo=" + sexo + ", horasTrabalhadas=" + horasTrabalhadas
				+ ", cargo=" + cargo + "]";
	}
	
}
