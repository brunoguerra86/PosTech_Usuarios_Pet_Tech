package br.com.fiap.api.PosTech_Usuarios_Pet_Tech.repository;

import br.com.fiap.api.PosTech_Usuarios_Pet_Tech.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
