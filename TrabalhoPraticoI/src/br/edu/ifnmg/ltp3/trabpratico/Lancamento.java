
package br.edu.ifnmg.ltp3.trabpratico;

/**
 *
 * @author diego
 */
public class Lancamento {
    int codigo;
    double valor;
    double multa;
    double desconto;
    int formaPagamento;     // retorna um int
    String dataVencimento;
    String dataPagamento;
    Sessao sessao;
    Funcionario funcionario;
    
    //Construct

    public Lancamento() {
    }

    public Lancamento(int codigo, double valor, double multa, double desconto, 
            int formaPagamento, String dataVencimento, String dataPagamento, 
            Sessao sessao, Funcionario funcionario) {
        this.codigo = codigo;
        this.valor = valor;
        this.multa = multa;
        this.desconto = desconto;
        this.formaPagamento = formaPagamento;
        this.dataVencimento = dataVencimento;
        this.dataPagamento = dataPagamento;
        this.sessao = sessao;
        this.funcionario = funcionario;
    }
    
    //Methods

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lancamento other = (Lancamento) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (Double.doubleToLongBits(this.multa) != Double.doubleToLongBits(other.multa)) {
            return false;
        }
        if (Double.doubleToLongBits(this.desconto) != Double.doubleToLongBits(other.desconto)) {
            return false;
        }
        if (this.formaPagamento != other.formaPagamento) {
            return false;
        }
        if ((this.dataVencimento == null) ? (other.dataVencimento != null) : !this.dataVencimento.equals(other.dataVencimento)) {
            return false;
        }
        if ((this.dataPagamento == null) ? (other.dataPagamento != null) : !this.dataPagamento.equals(other.dataPagamento)) {
            return false;
        }
        if (this.sessao != other.sessao && (this.sessao == null || !this.sessao.equals(other.sessao))) {
            return false;
        }
        if (this.funcionario != other.funcionario && (this.funcionario == null || !this.funcionario.equals(other.funcionario))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.codigo;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.multa) ^ (Double.doubleToLongBits(this.multa) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.desconto) ^ (Double.doubleToLongBits(this.desconto) >>> 32));
        hash = 17 * hash + this.formaPagamento;
        hash = 17 * hash + (this.dataVencimento != null ? this.dataVencimento.hashCode() : 0);
        hash = 17 * hash + (this.dataPagamento != null ? this.dataPagamento.hashCode() : 0);
        hash = 17 * hash + (this.sessao != null ? this.sessao.hashCode() : 0);
        hash = 17 * hash + (this.funcionario != null ? this.funcionario.hashCode() : 0);
        return hash;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Lancamento{" + "codigo=" + codigo + ", valor=" + valor + ", multa=" + multa + ", desconto=" + desconto + ", formaPagamento=" + formaPagamento + ", dataVencimento=" + dataVencimento + ", dataPagamento=" + dataPagamento + ", sessao=" + sessao + ", funcionario=" + funcionario + '}';
    }
    
    
    
    
}
