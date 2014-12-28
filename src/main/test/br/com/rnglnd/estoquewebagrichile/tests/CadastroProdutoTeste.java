package br.com.rnglnd.estoquewebagrichile.tests;

import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

@TransactionConfiguration(defaultRollback = false)
@Transactional
public class CadastroProdutoTeste {
    
    @Test
    public void testando(){
        
    }
}
