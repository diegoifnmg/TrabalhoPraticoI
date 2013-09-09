
package br.edu.ifnmg.ltp3.trabpratico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author diego
 */
public class Sessao {
    private int codigo;
    private String data;
    private double saldoAbertura;
    private double saldoFechamento;
    private Caixa caixa;
    private Funcionario funcionario;
    
    //Construct

    public Sessao() {
    }

    public Sessao(int codigo, String data, double saldoAbertura, 
            double saldoFechamento, Caixa caixa, Funcionario funcionario) {
        this.codigo = codigo;
        this.data = data;
        this.saldoAbertura = saldoAbertura;
        this.saldoFechamento = saldoFechamento;
        this.caixa = caixa;
        this.funcionario = funcionario;
    }
    // Metodos
    
    
    public Caixa getCaixa() {
        return caixa;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        Pattern Data = Pattern.compile("\\d{1,31}\\/\\d{1,12}\\/\\d{0,}");
        Matcher verifica = Data.matcher(data);
        
        if(verifica.matches()){
            this.data = data;
        }else{
            System.out.print("Data Inválida");
        }
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getSaldoAbertura() {
        return saldoAbertura;
    }

    public void setSaldoAbertura(double saldoAbertura) {
        this.saldoAbertura = saldoAbertura;
    }

    public double getSaldoFechamento() {
        return saldoFechamento;
    }

    public void setSaldoFechamento(double saldoFechamento) {
        this.saldoFechamento = saldoFechamento;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sessao other = (Sessao) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if ((this.data == null) ? (other.data != null) : !this.data.equals(other.data)) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldoAbertura) != Double.doubleToLongBits(other.saldoAbertura)) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldoFechamento) != Double.doubleToLongBits(other.saldoFechamento)) {
            return false;
        }
        if (this.caixa != other.caixa && (this.caixa == null || !this.caixa.equals(other.caixa))) {
            return false;
        }
        if (this.funcionario != other.funcionario && (this.funcionario == null || !this.funcionario.equals(other.funcionario))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigo;
        hash = 97 * hash + (this.data != null ? this.data.hashCode() : 0);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.saldoAbertura) ^ (Double.doubleToLongBits(this.saldoAbertura) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.saldoFechamento) ^ (Double.doubleToLongBits(this.saldoFechamento) >>> 32));
        hash = 97 * hash + (this.caixa != null ? this.caixa.hashCode() : 0);
        hash = 97 * hash + (this.funcionario != null ? this.funcionario.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Sessao{" + "codigo=" + codigo + ", data=" + data + ", saldoAbertura=" + saldoAbertura + ", saldoFechamento=" + saldoFechamento + ", caixa=" + caixa + ", funcionario=" + funcionario + '}';
    }
    
    
    
    
}
