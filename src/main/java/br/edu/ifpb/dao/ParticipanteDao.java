package br.edu.ifpb.dao;

import br.edu.ifpb.domain.Participante;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ParticipanteDao {
    @PersistenceContext(unitName = "AtividadeJPA")
    EntityManager em;

    public void salvar(Participante p) {
        em.persist(p);
    }

    public void atualizar(Participante p) {
        em.merge(p);
    }

    public Participante buscar(int id) {
        return em.find(Participante.class, id);
    }

    public List<Participante> buscarTodas() {
        return em.createQuery("SELECT p FROM Participante p ORDER BY p.id", Participante.class).getResultList();
    }

}
