package br.edu.ifpb.dao;

import br.edu.ifpb.domain.Artigo;
import br.edu.ifpb.domain.Participante;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ArtigoDao {
    @PersistenceContext(unitName = "AtividadeJPA")
    EntityManager em;

    public void salvar(Artigo a) {
        em.persist(a);
    }

    public void atualizar(Artigo a) {
        em.merge(a);
    }

    public Artigo buscar(int id) {
        return em.find(Artigo.class, id);
    }

    public List<Artigo> buscarTodas() {
        return em.createQuery("SELECT a FROM Artigo a ORDER BY a.id", Artigo.class).getResultList();
    }
}
