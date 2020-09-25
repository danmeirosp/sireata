package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.AnexoAlgoritmo.createDAO;
import br.edu.utfpr.dv.sireata.dao.AnexoAlgoritmo.deleteDAO;
import br.edu.utfpr.dv.sireata.dao.AnexoAlgoritmo.readDAO;
import br.edu.utfpr.dv.sireata.dao.AnexoAlgoritmo.updateDAO;

import br.edu.utfpr.dv.sireata.model.DAOEntity;
import java.sql.SQLException;
import java.util.Set;

public abstract class testeDAO {
    protected createDAO create;
    protected readDAO read;
    protected updateDAO update;
    protected deleteDAO delete;

    public void create (DAOEntity e) throws Exception {
        create.create(e);
    }
   
    public Set<? extends DAOEntity> readAll() {
        return read.readAll();
    }
    
    public void update(DAOEntity newEntity, String value) {
        update.update(newEntity, value);
    }
    
    public void excluir(int value) throws SQLException {
        delete.excluir(value);
    }    
}