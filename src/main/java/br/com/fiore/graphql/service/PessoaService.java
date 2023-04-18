package br.com.fiore.graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiore.graphql.convert.PessoaConverter;
import br.com.fiore.graphql.input.PessoaInput;
import br.com.fiore.graphql.model.Pessoa;
import br.com.fiore.graphql.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	PessoaRepository pessoaRepository;
	@Autowired
	PessoaConverter converter;

	public Pessoa buscarPessoaPorId(Long id) {
		return pessoaRepository.findById(id).orElse(null);
	}

	public Pessoa buscarPessoaPorNome(String nome) {
		return pessoaRepository.findByNome(nome).orElse(null);
	}

	public List<Pessoa> listarPessoas() {
		return pessoaRepository.findAll();
	}

	public Pessoa salvarPessoa(PessoaInput pessoa) {
		return pessoaRepository.save(converter.converterInputParaPessoa(pessoa));
	}

	public String deletarPessoa(Long id) {
		pessoaRepository.deleteById(id);
		return "Pessoa excluida com sucesso.";
	}

}
