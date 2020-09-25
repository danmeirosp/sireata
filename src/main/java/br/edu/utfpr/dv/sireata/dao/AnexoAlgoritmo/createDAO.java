package br.edu.utfpr.dv.sireata.dao.AnexoAlgoritmo;

import br.edu.utfpr.dv.sireata.model.DAOEntity;
import java.sql.SQLException;

public interface createDAO {
    public int salvar(DAOEntity anexo) throws SQLException;

	public void create(DAOEntity e);
}
