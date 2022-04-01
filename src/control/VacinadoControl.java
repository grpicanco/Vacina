/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.beans.PropertyChangeSupport;
import java.util.List;
import java.beans.PropertyChangeListener;
import model.dao.VacinadoDao;
import model.domain.Vacinado;

/**
 *
 * @author IFAM
 */
public final class VacinadoControl {
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    
    private Vacinado vacinadoDigitado;
    private Vacinado vacinadoSelecionado;
    private List<Vacinado> vacinadoTabela;
    private final VacinadoDao vacinadoDao;
    
    public VacinadoControl(){
        vacinadoDao = new VacinadoDao();
//        vacinadoTabela = ;
        novo();
        pesquisar();
    }

    public void pesquisar() {
        vacinadoTabela.clear();
        vacinadoTabela.addAll(vacinadoDao.pesquisar(vacinadoDigitado));
    }

    public void novo() {
        setVacinadoDigitado(new Vacinado());
    }
    
    public void salvar(){
        vacinadoDao.salvarAtualizar(vacinadoDigitado);
        novo();
        pesquisar();
    }
    
    public void excluir(){
        vacinadoDao.excluir(vacinadoDigitado);
        novo();
        pesquisar();
    }

    public Vacinado getVacinadoDigitado() {
        return vacinadoDigitado;
    }

    public void setVacinadoDigitado(Vacinado vacinadoDigitado) {
        Vacinado oldVacinadoDigitado = this.vacinadoDigitado;
        this.vacinadoDigitado = vacinadoDigitado;
        propertyChangeSupport.firePropertyChange("vacinadoDigitado", oldVacinadoDigitado, vacinadoDigitado);
    }

    public Vacinado getVacinadoSelecionado() {
        return vacinadoSelecionado;
    }

    public void setVacinadoSelecionado(Vacinado vacinadoSelecionado) {
        this.vacinadoSelecionado = vacinadoSelecionado;
        if(this.vacinadoSelecionado != null){
            setVacinadoDigitado(vacinadoSelecionado);
        }
    }

    public List<Vacinado> getVacinadoTabela() {
        return vacinadoTabela;
    }

    public void setVacinadoTabela(List<Vacinado> vacinadoTabela) {
        this.vacinadoTabela = vacinadoTabela;
    }
    public void addPropertyChangeListener(PropertyChangeListener changeListener){
        propertyChangeSupport.addPropertyChangeListener(changeListener);
    }
    public void removePropertyChangeListener(PropertyChangeListener changeListener){
        propertyChangeSupport.removePropertyChangeListener(changeListener);
    }
}
