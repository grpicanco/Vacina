/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.domain.Vacinado;

/**
 *
 * @author IFAM
 */
public class VacinadoDao {
    public void salvarAtualizar(Vacinado vacinado){
        EntityManager em = Conexao.getEntityManager();
        em.getTransaction().begin();
        if (vacinado.getCpf() != null){
            vacinado = em.merge(vacinado);
        }
        em.persist(vacinado);
        em.getTransaction().commit();
        em.close();
    }
    public void excluir(Vacinado vacinado){
        EntityManager em = Conexao.getEntityManager();
        em.getTransaction().begin();
        vacinado = em.merge(vacinado);
        em.remove(vacinado);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Vacinado> pesquisar(Vacinado vacinado){
        Query query = null;
        EntityManager em = Conexao.getEntityManager();
        if (vacinado.getCpf() != null && !vacinado.getCpf().equals("")) {
            String sql = "from Vacinado v"
                    + "where v.tx_cpf like :cpf";
            
            query = em.createQuery(sql);
            query.setParameter("cpf", "%"+vacinado.getCpf()); 
        }
        
        return query.getResultList(); 
    }
}
