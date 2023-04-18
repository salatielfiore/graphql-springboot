package br.com.fiore.graphql.convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import br.com.fiore.graphql.input.PessoaInput;
import br.com.fiore.graphql.model.Pessoa;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PessoaConverter {

	private final ModelMapper modelMapper;

	public Pessoa converterInputParaPessoa(PessoaInput input) {
		return modelMapper.map(input, Pessoa.class);
	}

}
