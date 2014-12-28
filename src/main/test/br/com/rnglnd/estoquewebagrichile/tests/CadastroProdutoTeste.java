package br.com.rnglnd.estoquewebagrichile.tests;

import br.com.rnglnd.estoquewebagrichile.entidade.Produto;
import br.com.rnglnd.estoquewebagrichile.enumeradores.Unidades;
import br.com.rnglnd.estoquewebagrichile.repositorios.ProdutoRepositorio;
import java.math.BigDecimal;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;
import org.junit.Assert;

@TransactionConfiguration(defaultRollback = false)
@Transactional
public class CadastroProdutoTeste {
    @Autowired private ProdutoRepositorio produtosRepositorio;
    
    
    @Test
    public void testeCadastroProduto(){
        String nome = "Salmão Real";
        BigDecimal valor = new BigDecimal(9.50);
        BigDecimal quantidade = new BigDecimal(40);
        
        Produto produto = estabelecerProduto(nome, Unidades.KG, quantidade, valor);
        produtosRepositorio.save(produto);
        produto = produtosRepositorio.findByNome(nome);
        
        Assert.assertNotNull("Produto não foi cadastrado na base de dados!", produto);
        Assert.assertEquals(
            "Nome do produto consultado não é o mesmo do cadastrado agora há pouco!", 
            nome, 
            produto.getNome()
        );
        Assert.assertEquals(
            "Valor do produto consultado não é o mesmo do cadastrado agora há pouco!", 
            valor, 
            produto.getValor()
        );
        
    }
    
    private Produto estabelecerProduto(String nome, Unidades unidade, 
        BigDecimal quantidade, BigDecimal valor
    ){
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setUnidadeMedida(unidade);
        produto.setDataValidade(DateTime.now());
        produto.setValor(valor);
        return produto;
    }
}
