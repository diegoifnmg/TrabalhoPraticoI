
package br.edu.ifnmg.ltp3.trabpratico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author diego
 */
public class Caixa {
    int codigo;
    String data;
    double saldo;
    
    //Constructor
    
    public Caixa() {
    }
    //Constructor
    
    public Caixa(int codigo, String data, double saldo) {
        this.codigo = codigo;
        this.data = data;
        this.saldo = saldo;
    }
    
    //Methods

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
        
        if(verifica.matches())
              this.data = data;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Equal and HashCode
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caixa other = (Caixa) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if ((this.data == null) ? (other.data != null) : !this.data.equals(other.data)) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.codigo;
        hash = 67 * hash + (this.data != null ? this.data.hashCode() : 0);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        return hash;
    }
    
    // ToString
    
    @Override
    public String toString() {
        return "Caixa{" + "codigo=" + codigo + ", data=" + data + ", saldo=" + saldo + '}';
    }
    
    
    
}
