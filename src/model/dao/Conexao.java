/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author IFAM
 */
public class Conexao {
    private static EntityManagerFactory emf;
    private static Conexao conexao;
    
    private Conexao() {
        emf = Persistence.createEntityManagerFactory("VacinaPU");
    }
    
    public synchronized static EntityManager getEntityManager(){
        if (conexao == null){
            conexao = new Conexao();
        }
        return emf.createEntityManager();
    }
    
}
