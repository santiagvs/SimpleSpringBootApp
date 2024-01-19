package com.santiago.cliente_app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
  @Id
  @SequenceGenerator(name = "cliente_sequence", sequenceName = "cliente_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "cliente_sequence")
  private Long id;

  private String nome;

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
}
