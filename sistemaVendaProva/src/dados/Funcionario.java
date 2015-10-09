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
public class Funcionario {
    
//Atributos
private String nome;
private String cpf;
private String email;
private String tel;
private String funcao;

//Métodos

public Funcionario(String nome,String cpf,String email,String tel,String funcao){
    this.nome= nome;
    this.cpf = cpf;
    this.email = email;
    this.tel = tel;
    this.funcao = funcao;
    
}

    @Override
    public String toString() {
        String relatorio = "";
        relatorio += "\nNome: "+nome;
        relatorio += "\nCpf: "+cpf;
        relatorio += "\nEmail: "+email;        
        relatorio += "\nTelefone: "+tel;
        relatorio +="\nFunção: " +funcao;
      
        return relatorio;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
