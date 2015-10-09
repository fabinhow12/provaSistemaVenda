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
public class Produto {
    
    // ATRIBUTOS
    private int codigo;
    private String nome;
    private String desc;
    private double precoVenda;
    private double precoCusto;
    
    // variavel auxiliar
    private static int contadorCodigo = 1;
    
    //Métodos
    
    public Produto(String nome,
                   String desc,
                   double precoVenda, 
                   double precoCusto) {
        
                // criar um código autoincremental
        codigo = contadorCodigo;
        
        // atualizar o contador de codigo
        contadorCodigo++;
         
        this.nome = nome;
        this.desc = desc;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
    }
    
    
    
    
    // METODOS    
    // sobrecarga do método toString da classe Object
    @Override
    public String toString() {
        
        String relatorio = "";
        relatorio += "Código: "+codigo;
        relatorio += "\nNome: "+nome;
        relatorio += "\nDescrição: "+desc;
        relatorio += "\nPreço custo: "+precoCusto;        
        relatorio += "\nPreço venda: "+precoVenda;
        
        return relatorio;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    
}
