package br.com.fiap.api.PosTech_Usuarios_Pet_Tech.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record UsuarioDTO(
        Long id,
        @NotBlank(message = "Nome inválido")
        String nome,
        String email,
        String cpf,
        LocalDate dataNascimento
    ) {
}
