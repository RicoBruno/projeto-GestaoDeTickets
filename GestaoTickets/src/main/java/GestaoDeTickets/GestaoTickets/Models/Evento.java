package GestaoDeTickets.GestaoTickets.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    
    @Column(columnDefinition = "TEXT")
    private String descricao;
    
    private LocalDate data;
    private LocalTime hora;
    
    private String local_evento;
    private BigDecimal preco;
    
    @Column(length = 1000)
    private String imagem;
    
    private String status_evento;

    @ManyToMany
    @JoinTable(
        name = "eventos_artistas",
        joinColumns = @JoinColumn(name = "evento_id"),
        inverseJoinColumns = @JoinColumn(name = "artista_id")
    )
    private List<Artistas> artistas = new ArrayList<>();

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public Evento() {
    }

    public Evento(String nome, String descricao, LocalDate data, LocalTime hora, String local_evento, BigDecimal preco, String imagem, String status_evento) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.local_evento = local_evento;
        this.preco = preco;
        this.imagem = imagem;
        this.status_evento = status_evento;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public LocalTime getHora() { return hora; }
    public void setHora(LocalTime hora) { this.hora = hora; }

    public String getLocal_evento() { return local_evento; }
    public void setLocal_evento(String local_evento) { this.local_evento = local_evento; }

    public BigDecimal getPreco() { return preco; }
    public void setPreco(BigDecimal preco) { this.preco = preco; }

    public String getImagem() { return imagem; }
    public void setImagem(String imagem) { this.imagem = imagem; }

    public String getStatus_evento() { return status_evento; }
    public void setStatus_evento(String status_evento) { this.status_evento = status_evento; }

    public List<Artistas> getArtistas() { return artistas; }
    public void setArtistas(List<Artistas> artistas) { this.artistas = artistas; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
