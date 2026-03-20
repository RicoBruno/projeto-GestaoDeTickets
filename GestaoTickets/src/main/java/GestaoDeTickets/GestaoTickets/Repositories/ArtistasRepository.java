package GestaoDeTickets.GestaoTickets.Repositories;

import GestaoDeTickets.GestaoTickets.Models.Artistas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistasRepository extends JpaRepository<Artistas, Long> {
    
    Optional<Artistas> findByNome(String nome);
}
