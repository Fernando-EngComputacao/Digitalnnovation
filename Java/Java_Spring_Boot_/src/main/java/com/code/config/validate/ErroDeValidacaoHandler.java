package com.code.config.validate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.code.controller.dao.ErroFormDao;

@RestControllerAdvice
public class ErroDeValidacaoHandler {
	
	@Autowired
	private MessageSource messageSource;

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<ErroFormDao> handle(MethodArgumentNotValidException exception) {
		List<ErroFormDao>  errosDao = new ArrayList<>();
		List<FieldError> fieldsErros = exception.getBindingResult().getFieldErrors();
		
		fieldsErros.forEach(listaErro -> {
			String mensagem = messageSource.getMessage(listaErro, LocaleContextHolder.getLocale());
			ErroFormDao erro = new ErroFormDao(listaErro.getField(), mensagem);
			
			errosDao.add(erro);
		});
		
		return errosDao;
		
	}
}
