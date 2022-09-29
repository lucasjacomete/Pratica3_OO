package br.com.FolhadePagamento;

public class FPadrao extends Funcionarios{
    double calcularProventos;

    public FPadrao(int matricula, String nome, double salario, double calcularProventos) {
        super(matricula, nome, salario);
        this.calcularProventos = calcularProventos;
    }

    public double getCalcularProventos() {
        return calcularProventos;
    }

    public void setCalcularProventos(double calcularProventos) {
        this.calcularProventos = calcularProventos;
    }
    public double calcularProventos(){
        return getSalario();
    }
    
}
