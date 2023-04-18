package br.com.fiore.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.fiore.graphql.input.PessoaInput;
import br.com.fiore.graphql.model.Pessoa;
import br.com.fiore.graphql.service.PessoaService;

@Controller
@CrossOrigin("*")
public class PessoaController {

	@Autowired
	PessoaService pessoaService;

	@QueryMapping
	public List<Pessoa> listarPessoas() {
		return pessoaService.listarPessoas();
	}

	@QueryMapping
	public Pessoa buscarPessoaPorId(@Argument Long id) {
		return pessoaService.buscarPessoaPorId(id);
	}

	@QueryMapping
	public Pessoa buscarPessoaPorNome(@Argument String nome) {
		return pessoaService.buscarPessoaPorNome(nome);
	}

	@MutationMapping
	public Pessoa criarPessoa(@Argument PessoaInput pessoa) {
		return pessoaService.salvarPessoa(pessoa);
	}

	@MutationMapping
	public Pessoa atualizarPessoa(@Argument PessoaInput pessoa) {
		return pessoaService.salvarPessoa(pessoa);
	}

	@MutationMapping
	public String deletarPessoa(@Argument Long id) {
		return pessoaService.deletarPessoa(id);
	}

}
