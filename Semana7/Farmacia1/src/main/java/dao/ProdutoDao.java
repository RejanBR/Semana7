package dao;

import javax.persistence.EntityManager;

public class ProdutoDao {
    public Object buscarId(int i) {
    }package br.com.alurasenac.farmacia.dao;

import br.com.alurasenac.farmacia.Modelo.Produto;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import java.util.List;

    public class ProdutoDao {
        private EntityManager em;

        public ProdutoDao(EntityManager em) {
            this.em = em;
        }

        //Cadastrar Produto
        public void cadastrar(Produto.Produto produto) {
            this.em.persist(produto);
        }

        //Alterar Produto
        public void alterar(Produto.Produto produto){
            this.em.merge(produto);
        }

        //Deletar Produto
        public void deletar(Produto.Produto produto) {
            this.em.remove(produto);
        }

        //Listar Produto
        public List<Produto.Produto> buscarTodos() {
            String jpql = "SELECT p FROM Produto p";
            return em.createQuery(jpql, Produto.Produto.class).getResultList();
        }



        //Buscar por Produto
        public <Produto> Produto buscarId(int id) {
            return em.find(Produto.class, id);
        }

    }
}
