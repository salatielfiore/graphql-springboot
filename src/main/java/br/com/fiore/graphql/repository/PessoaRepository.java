package br.com.fiore.graphql.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiore.graphql.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	Optional<Pessoa> findByNome(String nome);
}
