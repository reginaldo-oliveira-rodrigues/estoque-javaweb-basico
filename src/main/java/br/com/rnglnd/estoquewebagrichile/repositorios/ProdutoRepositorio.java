package br.com.rnglnd.estoquewebagrichile.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.rnglnd.estoquewebagrichile.entidade.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{
    @Query("select p from Produto p where p.nome = :nome")
    Produto findByNome(@Param("nome") String nome);
}
