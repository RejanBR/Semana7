package Modelo;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Fabricante {
    package br.com.alurasenac.farmacia.Modelo;

import javax.persistence.*;

    @Entity
    @Table(name = "fabricante")
    public class Fabricante {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String nome;

        public Fabricante() {}

        public Fabricante(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }
}
