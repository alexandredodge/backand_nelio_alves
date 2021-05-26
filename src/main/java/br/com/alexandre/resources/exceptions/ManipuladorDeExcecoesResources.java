package br.com.alexandre.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.alexandre.servicos.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ManipuladorDeExcecoesResources {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<ObjAuxiliarDeErroPadrao> objectNotFound(ObjectNotFoundException ex, HttpServletRequest request){
		
		ObjAuxiliarDeErroPadrao error = new ObjAuxiliarDeErroPadrao(HttpStatus.NOT_FOUND.value(),ex.getMessage(),System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
}
