package br.com.FolhadePagamento;

public class FProdutividade extends Funcionarios {
    public FProdutividade(int matricula, String nome, double salario, double valor, int producao) {
        super(matricula, nome, salario);
        this.valor = valor;
        this.producao = producao;
    }
    double valor;
    int producao;
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getProducao() {
        return producao;
    }
    public void setProducao(int producao) {
        this.producao = producao;
    }
    public double calcularProventos(){
        return getSalario()+ (getProducao() + getValor());
    }
}