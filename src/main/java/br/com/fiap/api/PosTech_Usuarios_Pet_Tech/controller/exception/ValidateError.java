package br.com.fiap.api.PosTech_Usuarios_Pet_Tech.controller.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidateError extends StandardError{
    private List<ValidateMessage> validateMessages = new ArrayList<ValidateMessage>();

    public List<ValidateMessage> getValidateMessages() {
        return validateMessages;
    }

    public void addValidateMessage(String campo, String mensagem){
        validateMessages.add(new ValidateMessage(campo, mensagem));
    }
}
