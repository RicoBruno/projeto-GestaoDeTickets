package GestaoDeTickets.GestaoTickets.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Código único do ingresso (ex: TCK-12345)
    private String codigoDoIngresso;

    // Relação com quem comprou o ingresso
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    // Relação com o evento que o ingresso pertence
    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)
    private Evento evento;

    @CreationTimestamp
    private LocalDateTime dataDaCompra;

    // Status do ingresso: VALIDO, UTILIZADO, CANCELADO
    private String statusTicket;

    public Ticket() {
    }

    public Ticket(String codigoDoIngresso, Usuario usuario, Evento evento, String statusTicket) {
        this.codigoDoIngresso = codigoDoIngresso;
        this.usuario = usuario;
        this.evento = evento;
        this.statusTicket = statusTicket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoDoIngresso() {
        return codigoDoIngresso;
    }

    public void setCodigoDoIngresso(String codigoDoIngresso) {
        this.codigoDoIngresso = codigoDoIngresso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public LocalDateTime getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(LocalDateTime dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public String getStatusTicket() {
        return statusTicket;
    }

    public void setStatusTicket(String statusTicket) {
        this.statusTicket = statusTicket;
    }
}
