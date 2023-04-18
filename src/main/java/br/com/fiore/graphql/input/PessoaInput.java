package br.com.fiore.graphql.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaInput {
	private Long id;
	private String nome;
	private String telefone;
	private String email;
	private int idade;
}
