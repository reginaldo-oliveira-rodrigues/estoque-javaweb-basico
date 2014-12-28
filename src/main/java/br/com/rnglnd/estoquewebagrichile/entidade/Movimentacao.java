package br.com.rnglnd.estoquewebagrichile.entidade;

import br.com.rnglnd.estoquewebagrichile.enumeradores.TiposMovimentacao;
import br.com.rnglnd.estoquewebagrichile.enumeradores.Unidades;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.joda.time.DateTime;

@Entity
public class Movimentacao implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private DateTime dataMovimentacao;
    private Produto produto;
    private BigDecimal quantidade;
    private Unidades unidadeMedida;
    private TiposMovimentacao tipoMovimentacao;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDENTIFICADOR")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    
    @Column(name = "DATA_MOVIMENTACAO")
    public DateTime getDataMovimentacao() {
        return dataMovimentacao;
    }
    public void setDataMovimentacao(DateTime dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    
    @OneToOne(fetch = FetchType.EAGER, targetEntity = Produto.class)
    @JoinColumn(name = "IDENTIFICADOR")
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Column(name = "QUANTIDADE")
    public BigDecimal getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }
    
    
    @Column(name = "UNIDADE_MEDIDA")
    @Enumerated(EnumType.STRING)
    public Unidades getUnidadeMedida() {
        return unidadeMedida;
    }
    public void setUnidadeMedida(Unidades unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    
    @Column(name = "TIPO_MOVIMENTACAO")
    @Enumerated(EnumType.STRING)
    public TiposMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }
    public void setTipoMovimentacao(TiposMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }
        
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Movimentacao)) {
            return false;
        }
        Movimentacao other = (Movimentacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.rnglnd.estoquewebagrichile.entidade.Movimentacao[ id=" + id + " ]";
    }
    
}
