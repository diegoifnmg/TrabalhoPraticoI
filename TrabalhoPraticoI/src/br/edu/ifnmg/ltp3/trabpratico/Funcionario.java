
package br.edu.ifnmg.ltp3.trabpratico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author diego
 */
public class Funcionario {
    private int codigo;
    private String nome;
    private String senha;
    
    //Constructor
    public Funcionario() {
    }

    public Funcionario(int codigo, String nome, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.senha = senha;
    }
    
    //methods

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Pattern Nome = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher verifica = Nome.matcher(nome);
        
        if(verifica.matches()){
              this.nome = nome;
        }else{
            System.out.print("Min 3 Max 15 com _ ou -!");
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        Pattern Senha = Pattern.compile("[\\d{1,}|\\w{1,}]{8}");
        Matcher verifica = Senha.matcher(senha);
        
        if(verifica.matches()){
              this.senha = senha;
        }else{
            System.out.print("Min 1 letra ou numero, Max 8 Caractere!");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if ((this.senha == null) ? (other.senha != null) : !this.senha.equals(other.senha)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codigo;
        hash = 53 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 53 * hash + (this.senha != null ? this.senha.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + ", nome=" + nome + ", senha=" + senha + '}';
    }
    
    
    
}
