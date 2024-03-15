package br.com.alurasenac.farmacia;

import javax.persistence.*;

public class ClassedoFabricante {
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
