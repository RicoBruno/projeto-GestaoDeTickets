package GestaoDeTickets.GestaoTickets.Repositories;

import GestaoDeTickets.GestaoTickets.Models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
}
