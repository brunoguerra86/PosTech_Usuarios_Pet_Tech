package br.com.fiap.api.PosTech_Usuarios_Pet_Tech.service.validation;

import br.com.fiap.api.PosTech_Usuarios_Pet_Tech.dto.UsuarioDTO;
import br.com.fiap.api.PosTech_Usuarios_Pet_Tech.entities.Usuario;
import br.com.fiap.api.PosTech_Usuarios_Pet_Tech.repository.UsuarioRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CriacaoUsuarioValidator implements ConstraintValidator<CriacaoUsuarioValid, UsuarioDTO> {

    @Autowired
    private UsuarioRepository repository;

    @Override
    public void initialize(CriacaoUsuarioValid anotation){}

    @Override
    public boolean isValid(UsuarioDTO dto, ConstraintValidatorContext context){
        Optional<Usuario> usuario = repository.findByEmail(dto.email());
        return usuario.isEmpty();
    }

}
