/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dados.Funcionario;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author fabio
 */
public class RepositorioFuncionario extends AbstractTableModel {

//Constantes Para Coluna
    private final int NOME = 0;
    private final int CPF = 1;
    private final int EMAIL = 2;
    private final int TELEFONE = 3;
    private final int FUNCAO = 4;

//Variáveis
    private ArrayList<Funcionario> listaFuncionarios;
    private final String[] colunas = {"Nome", "Cpf", "Email", "Telefone", "Função"};

//Métodos
    public RepositorioFuncionario() {
        //Inicia Uma Lista Vazia
        this.listaFuncionarios = new ArrayList<>();
    }

    public void AtualizaTablef() {
        fireTableDataChanged();
    }

    public void addFuncionario(Funcionario f) {
        //Adiciona Funcionário
        this.listaFuncionarios.add(f);
        fireTableDataChanged();
    }

    public void removeFuncionario(int linha) {
        //Remove O Funcionario
        this.listaFuncionarios.remove(linha);
        fireTableDataChanged();
    }

    public void editaFuncionario(Funcionario f) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getNome() == f.getNome()){
             funcionario = f;   
            }
        }
    }

   public Funcionario pesquisaFuncionario(String nome){
     Funcionario f = null;
       for (int i = 0; i < this.listaFuncionarios.size(); i++) {
          Funcionario get = this.listaFuncionarios.get(i);
          if (get != null && get.getNome().equalsIgnoreCase(nome)){
           f = get;   
          }
          
       }
       return f;
   }
   
   public Funcionario getFuncionario(int linha){
    //Pega O Funcionário A Partir Da Linha
    return this.listaFuncionarios.get(linha);
   }
   
   public void inicializaFuncionarios(){
   
       Funcionario f1 = new Funcionario("Funcionario1", "234.456.754-76","Funcionario1@gmail.com","9454-9975","Balconista");
   Funcionario f2 = new Funcionario("Funcionario2", "434.256.154-36","Funcionario2@gmail.com","9834-1925","Vendedor");
   Funcionario f3 = new Funcionario("Funcionario3","123.264.745-13","funcionario3@gmail.com","9912-1224", "Operador De Caixa");
   
   this.listaFuncionarios.add(f1);
   this.listaFuncionarios.add(f2);
   this.listaFuncionarios.add(f3);
   
   }
   
   public ArrayList setArrayFuncionario(){
    return this.listaFuncionarios;  
   }
   
    @Override
    public int getRowCount() {
        //Retorna A Quantidade de Linha
      return this.listaFuncionarios.size();
    }

    @Override
    public int getColumnCount() {
        //Retorna A Quantidade de Colunas
      return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     Funcionario funcionario = this.listaFuncionarios.get(rowIndex);
     switch (columnIndex){
         case NOME:
             return funcionario.getNome();
         case CPF:
             return funcionario.getCpf();
         case EMAIL:
             return funcionario.getEmail();
         case TELEFONE:
             return funcionario.getTel();
         case FUNCAO:
             return funcionario.getFuncao();
         default:
             return funcionario;
    }

}

    @Override
    public String getColumnName(int columnIndex) {
        return this.colunas[columnIndex];
    }

    
}