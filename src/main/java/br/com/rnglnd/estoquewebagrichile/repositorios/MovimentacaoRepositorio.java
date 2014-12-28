package br.com.rnglnd.estoquewebagrichile.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.rnglnd.estoquewebagrichile.entidade.Movimentacao;


public interface MovimentacaoRepositorio extends JpaRepository <Movimentacao, Long>{

}
