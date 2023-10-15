package br.com.fiap.api.PosTech_Usuarios_Pet_Tech.controller.exception;

public class ControllerNotFoundException extends RuntimeException{
    public ControllerNotFoundException(String message){
        super(message);
    }
}
