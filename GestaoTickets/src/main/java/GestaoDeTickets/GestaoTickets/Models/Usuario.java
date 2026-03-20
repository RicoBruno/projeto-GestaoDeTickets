package GestaoDeTickets.GestaoTickets.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    
    @Column(unique = true)
    private String cpf;
    
    private String telefone;
    
    private String senha;
    private String userType; 


    public Usuario() {
    }

    public Usuario(String nome, String email, String cpf, String telefone, String senha, String userType) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
        this.userType = userType;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
}