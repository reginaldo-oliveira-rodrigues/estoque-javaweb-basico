package br.com.rnglnd.estoquewebagrichile.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.rnglnd.estoquewebagrichile.entidade.Produto;


public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{

}
