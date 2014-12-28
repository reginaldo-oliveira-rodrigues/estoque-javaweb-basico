package br.com.rnglnd.estoquewebagrichile.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.rnglnd.estoquewebagrichile.entidade.Balanco;

public interface BalancoRepositorio extends JpaRepository<Balanco, Long> {
	
}
