/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Produto;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author fabio
 */
public class RepositorioProduto extends AbstractTableModel {

    //Constantes de Identificação Das Colunas
    private final int NOME = 0;
    private final int DESCRICAO = 1;
    private final int PRECOVENDA = 2;
    private final int PRECOCUSTO = 3;
    private final int CODIGO = 4;

    //Variáveis
    private ArrayList<Produto> listaProdutos;
    private final String[] colunas = {"Nome", "Descrição", "PreçoVenda", "PreçoCusto", "Código"};

    public RepositorioProduto() {
        //Inicia Uma lista Vazia
        this.listaProdutos = new ArrayList<>();
    }

    public void AtualizaTablep() {
        fireTableDataChanged();
    }

    public void AddProduto(Produto p) {
        //Adiciona Um Produto  
        this.listaProdutos.add(p);
        fireTableDataChanged();
    }

    public void RemoveProduto(int linha) {
        //Remove O Produto
        this.listaProdutos.remove(linha);
        fireTableDataChanged();
    }

    public void editarProduto(Produto p) {
        
        for (Produto produto : listaProdutos) {
            if (produto.getCodigo() == p.getCodigo() ){
            produto = p;    
        }
            
        }
  
             
    }

    public Produto PesquisaProduto(int codigo) {
        Produto p = null;
        for (int i = 0; i < this.listaProdutos.size(); i++) {
            Produto get = this.listaProdutos.get(i);
            if (get != null && get.getCodigo() == codigo) {
                p = get;
            }
          
        }
        return p;
    }
    
    
    public void inicializaProdutos(){
     Produto p1 = new Produto("Xbox One", "VideoGame", 2000.00, 750.00);
     Produto p2 = new Produto("Iphone 6S", "Celular",2500.00, 1000.00);
     Produto p3 = new Produto("Macbook Air", "Computador", 5000.00, 1500.00);
     Produto p4 = new Produto("The Witcher 3","Game",150.00,60.00);
     Produto p5 = new Produto("PS4","VideoGame",2500.00,1000.00);
     
    this.listaProdutos.add(p1);
    this.listaProdutos.add(p2);
    this.listaProdutos.add(p3);
    this.listaProdutos.add(p4);
    this.listaProdutos.add(p5);
    
    
    }

    public Produto getProduto(int linha) {
        //Pega O Produto Pela A Linha Da Tabela
        return this.listaProdutos.get(linha);

    }

    @Override
    public int getRowCount() {
        //Retorna A Quantidade De Linhas
        return this.listaProdutos.size();
    }

    @Override
    public int getColumnCount() {
        //Retorna O Número de Colunas
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto p = this.listaProdutos.get(rowIndex);

        switch (columnIndex) {
            case NOME:
                return p.getNome();
            case DESCRICAO:
                return p.getDesc();
            case PRECOVENDA:
                return p.getPrecoVenda();
            case PRECOCUSTO:
                return p.getPrecoCusto();
            case CODIGO:
                return p.getCodigo();
            default:
                return p;

        }

    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }

    
}
