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
public class Cliente {

  //Atributos
  private String nome;
  private String cpf;
  private String email;
  private String tel;

//Métodos
  
public Cliente(String nome,String cpf,String email,String tel){
   this.nome = nome;
   this.cpf = cpf;
   this.email = email;
   this.tel = tel;
   
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

    @Override
    public String toString() {
         
        String relatorio = "";
        relatorio += "\nNome: "+nome;
        relatorio += "\nCpf: "+cpf;
        relatorio += "\nEmail: "+email;        
        relatorio += "\nTelefone: "+tel;
      
        return relatorio;
    }
     
}
