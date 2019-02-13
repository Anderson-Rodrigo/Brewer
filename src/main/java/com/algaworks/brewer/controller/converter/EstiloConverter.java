package com.algaworks.brewer.controller.converter;

import org.springframework.core.convert.converter.Converter;

import com.algaworks.brewer.model.Estilo;

public class EstiloConverter implements Converter<Long, Estilo>{

	@Override
	public Estilo convert(Long codigo) {
		Estilo estilo = new Estilo();
		estilo.setCodigo(codigo);
		return estilo;
	}
	

}
