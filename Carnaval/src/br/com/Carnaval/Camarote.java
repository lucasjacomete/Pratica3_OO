package br.com.Carnaval;

public class Camarote extends Ingresso{
    
    public Camarote(double valorIngresso, String localizacaoCamarote, double valorAdicional) {
        super(valorIngresso);
        this.localizacaoCamarote = localizacaoCamarote;
        this.valorAdicional = valorAdicional;
    }
    private String localizacaoCamarote;
    private double valorAdicional;
    public String getLocalizacaoCamarote() {
        return localizacaoCamarote;
    }
    public void setLocalizacaoCamarote(String localizacaoCamarote) {
        this.localizacaoCamarote = localizacaoCamarote;
    }
    public double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    public String imprimeIngresso(){
        return "Ingresso Camarote: "+(getValorIngresso()+getValorAdicional())+"\n"+getLocalizacaoCamarote();
    }
}
