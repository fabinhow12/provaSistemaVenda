/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Cliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author fabio
 */
public class RepositorioCliente extends AbstractTableModel {

//Constantes Para Colunas
    private final int NOME = 0;
    private final int CPF = 1;
    private final int EMAIL = 2;
    private final int TELEFONE = 3;
    

    //Variáveis
    private ArrayList<Cliente> listaClientes;
    private final String[] colunas = {"Nome", "Cpf", "Email", "Telefone"};

    public RepositorioCliente() {
        //Inicia Uma Lista Vazia
        this.listaClientes = new ArrayList<>();
    }

    public void AtualizaTableC() {
        //Atualiza A Os Valores Na Tabela
        fireTableDataChanged();
    }

    public void addCliente(Cliente c) {
        //Método Para Adicionar Em Um Vetor
        this.listaClientes.add(c);
        fireTableDataChanged();
    }

    public void RemoveCliente(int linha) {
        //Método Para Remover A Partir Da Linha Da Tabela
        this.listaClientes.remove(linha);
        fireTableDataChanged();
    }

    public void editarCliente(Cliente c) {
        //Edita CLiente através do for each 
        for (Cliente cliente : listaClientes) {
           if (cliente.getNome() == c.getNome()){
             cliente = c;  
           }
        }
        
    }

    public Cliente pesquisaCliente(String nome) {
        //Pesquisa Cliente através de for normal e retorna O Cliente
        Cliente c = null;
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente get = listaClientes.get(i);
            if (get != null && get.getNome().equalsIgnoreCase(nome)){
              c = get;  
            }
            
        }
        return c;
    }

    public Cliente getCliente(int linha) {
        //Pega O Produto Pela A Linha
        return this.listaClientes.get(linha);
    }

    public void inicializaCliente(){
    //Método Para Inicializar Clientes Pré-definidos
    Cliente c1 = new Cliente("Cliente1","264.756.899-66","cliente1@gmail.com","9811-1645");
    Cliente c2 = new Cliente("Cliente2","265.956.499-26","cliente2@gmail.com","9141-1645");
    Cliente c3 = new Cliente("Cliente3","164.226.399-46","cliente3@gmail.com","8119-4569");
    
    this.listaClientes.add(c1);
    this.listaClientes.add(c2);
    this.listaClientes.add(c3);
   
    }
    
    @Override
    public int getRowCount() {
        //Retorna O Número De Linhas
        return this.listaClientes.size();
    }

    @Override
    public int getColumnCount() {
        //Retornar O Número De Colunas
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Retorna Os Objetos Dentro Da Table
        Cliente cliente = this.listaClientes.get(rowIndex);
        switch (columnIndex) {
            case NOME:
                return cliente.getNome();
            case CPF:
                return cliente.getCpf();
            case EMAIL:
                return cliente.getEmail();
            case TELEFONE:
                return cliente.getTel();
            default:
                return cliente;

        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        //Método para atribuir Nome As Colunas
        return this.colunas[columnIndex];
    }

}
