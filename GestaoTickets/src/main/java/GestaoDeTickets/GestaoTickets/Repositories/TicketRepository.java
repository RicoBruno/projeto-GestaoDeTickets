package GestaoDeTickets.GestaoTickets.Repositories;

import GestaoDeTickets.GestaoTickets.Models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    // Retorna todos os tickets de um usuário específico
    List<Ticket> findByUsuarioId(Long usuarioId);

    // Retorna todos os tickets de um evento específico
    List<Ticket> findByEventoId(Long eventoId);
}
