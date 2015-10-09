/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author fabio
 */
public class Venda {
    
//Variáveis Da Venda
private String data;
private String formaPagar;
private int codigoVenda;
private double valorTotal;
private double desconto;
private static int contador = 1;

public Venda(String data,String formaPagar,int codigoVenda,double valorTotal,double desconto){
 this.codigoVenda = contador;
 contador++;
 this.data = data;
 this.formaPagar = formaPagar;
 this.valorTotal = valorTotal;
 this.desconto = desconto;
 
}

    @Override
    public String toString() {
        String relatorio = "";
        relatorio += "Código Venda: "+codigoVenda;
        relatorio += "\nData : "+data;
        relatorio += "\nForma Pagar: "+formaPagar;
        relatorio += "\nValor Total: "+valorTotal;        
        relatorio += "\nDesconto: "+desconto;
        
        return relatorio;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFormaPagar() {
        return formaPagar;
    }

    public void setFormaPagar(String formaPagar) {
        this.formaPagar = formaPagar;
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public void setCodigoVenda(int codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }


    
}
