package br.com.rnglnd.estoquewebagrichile.entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name = "PRODUTO")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private String codigoBarras;
    private BigDecimal valor;
    private BigDecimal quantidade;
    private String unidadeMedida; // isto pode virar um enum com valores: UNIDADES, KG, LT, CX, PC
    private DateTime dataValidade;
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDENTIFICADOR", nullable = false)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    
    @Column(name = "NOME")
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    @Column(name = "CODIGO_BARRAS")
    public String getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    
    
    @Column(name = "VALOR")
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    
    @Column(name = "QUANTIDADE")
    public BigDecimal getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
    
    
    @Column(name = "UNIDADE_MEDIDA")
    public String getUnidadeMedida() {
        return unidadeMedida;
    }
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    
    @Column(name = "DATA_VALIDADE")
    public DateTime getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(DateTime dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    
    

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.rnglnd.estoquewebagrichile.entidade.Produto[ id=" + id + " ]";
    }
    
}
