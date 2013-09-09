
package br.edu.ifnmg.ltp3.trabpratico;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author diego
 */
public class Lancamento {
    private int codigo;
    private double valor;
    private double multa;
    private double desconto;
    private int formaPagamento;     // retorna um int
    private String dataVencimento;
    private String dataPagamento;
    private List<Sessao> sessoes;
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
        sessoes = new ArrayList<Sessao>();
        this.funcionario = funcionario;
    }
    
    //Methods

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void addSessao(Sessao sessao){
        if(!sessoes.contains(sessao)){
            sessoes.add(sessao);   
        }
    }
    public void removeSessao(Sessao sessao){
        if(sessoes.contains(sessao)){
            sessoes.remove(sessao);
        }
    }
    
    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        Pattern Data = Pattern.compile("\\d{1,31}\\/\\d{1,12}\\/\\d{0,}");
        Matcher verifica = Data.matcher(dataPagamento);
        
        if(verifica.matches()){
            this.dataPagamento = dataPagamento;
        }else{
            System.out.print("Data Inválida");
        }
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        Pattern Data = Pattern.compile("\\d{1,31}\\/\\d{1,12}\\/\\d{0,}");
        Matcher verifica = Data.matcher(dataVencimento);
        
        if(verifica.matches()){
            this.dataVencimento = dataVencimento;
        }else{
            System.out.print("Data Inválida");
        }
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if(desconto > 0){
            this.desconto = desconto;
        }else{
            System.out.print("Desconto Inválido");
        }
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        do{
            if(formaPagamento == 1){
                this.formaPagamento = formaPagamento;
                System.out.print("Dinheiro");
            }
            if(formaPagamento == 2){
                this.formaPagamento = formaPagamento;
                System.out.print("Cartão");
            }
            if(formaPagamento == 3){
                this.formaPagamento = formaPagamento;
                System.out.print("Boleto");
            }
        }while((formaPagamento >= 1) && (formaPagamento <= 3));
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
        if(multa >=0){
            this.multa = multa;
        }else{
            System.out.print("Valor Inválido");
        }
    }

    public void setSessao(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
    
    public List<Sessao> getItens() {
        return sessoes;
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
        if (this.sessoes != other.sessoes && (this.sessoes == null || !this.sessoes.equals(other.sessoes))) {
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
        hash = 79 * hash + this.codigo;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.multa) ^ (Double.doubleToLongBits(this.multa) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.desconto) ^ (Double.doubleToLongBits(this.desconto) >>> 32));
        hash = 79 * hash + this.formaPagamento;
        hash = 79 * hash + (this.dataVencimento != null ? this.dataVencimento.hashCode() : 0);
        hash = 79 * hash + (this.dataPagamento != null ? this.dataPagamento.hashCode() : 0);
        hash = 79 * hash + (this.sessoes != null ? this.sessoes.hashCode() : 0);
        hash = 79 * hash + (this.funcionario != null ? this.funcionario.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Lancamento{" + "codigo=" + codigo + ", valor=" + valor + ", multa=" + multa + ", desconto=" + desconto + ", formaPagamento=" + formaPagamento + ", dataVencimento=" + dataVencimento + ", dataPagamento=" + dataPagamento + ", sessoes=" + sessoes + ", funcionario=" + funcionario + '}';
    }

    
}
