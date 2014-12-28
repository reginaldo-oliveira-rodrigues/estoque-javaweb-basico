package br.com.rnglnd.estoquewebagrichile.entidade;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Balanco implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private List<Produto> produtos;
    private BigDecimal total;
    private Date dataBalanco;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDENTIFICADOR")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    
    // se esse conjunto de produtos tiver apenas um produto, este balanço é por produto,
    // se esse conjunto tiver mais de um produto, é balanço geral.
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDENTIFICADOR")
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    @Column(name = "TOTAL")
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    
    @Column(name = "DATA_BALANCO")
    public Date getDataBalanco() {
        return dataBalanco;
    }
    public void setDataBalanco(Date dataBalanco) {
        this.dataBalanco = dataBalanco;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Balanco)) {
            return false;
        }
        Balanco other = (Balanco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.rnglnd.estoquewebagrichile.entidade.Balanco[ id=" + id + " ]";
    }

    
    
}
