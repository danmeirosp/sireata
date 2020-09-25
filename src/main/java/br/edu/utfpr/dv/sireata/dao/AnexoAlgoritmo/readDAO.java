package br.edu.utfpr.dv.sireata.dao.AnexoAlgoritmo;

import br.edu.utfpr.dv.sireata.model.DAOEntity;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

public interface readDAO {

    public DAOEntity buscarPorId(int id) throws SQLException;
    public List<? extends DAOEntity> listarPorAta(int idAta) throws SQLException;
	public Set<? extends DAOEntity> readAll();
}