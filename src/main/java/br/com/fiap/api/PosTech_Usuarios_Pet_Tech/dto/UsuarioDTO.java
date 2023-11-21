package br.com.fiap.api.PosTech_Usuarios_Pet_Tech.dto;

import br.com.fiap.api.PosTech_Usuarios_Pet_Tech.service.validation.CriacaoUsuarioValid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@CriacaoUsuarioValid(message = "Email já cadastrado")
public record UsuarioDTO(
        Long id,
        @NotBlank(message = "Nome inválido")
        String nome,
        @Email(message = "Email inválido")
        String email,
        @CPF(message = "CPF inválido")
        String cpf,
        LocalDate dataNascimento
    ) {
}
