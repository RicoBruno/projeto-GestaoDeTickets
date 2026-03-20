package GestaoDeTickets.GestaoTickets.Repositories;

import GestaoDeTickets.GestaoTickets.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    // Spring Data cria automaticamente a query para buscar por email
    Optional<Usuario> findByEmail(String email);
}
