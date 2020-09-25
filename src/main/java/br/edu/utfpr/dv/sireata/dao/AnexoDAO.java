package br.edu.utfpr.dv.sireata.dao;

import java.util.List; 

import br.edu.utfpr.dv.sireata.dao.AnexoAlgoritmo.createDAO;
import br.edu.utfpr.dv.sireata.dao.AnexoAlgoritmo.deleteDAO;
import br.edu.utfpr.dv.sireata.dao.AnexoAlgoritmo.readDAO;
import br.edu.utfpr.dv.sireata.dao.AnexoAlgoritmo.updateDAO;

import br.edu.utfpr.dv.sireata.model.Anexo;

public class AnexoDAO extends testeDAO{
	public AnexoDAO (createDAO create, readDAO read, deleteDAO delete, updateDAO update) {
        this.create = create;
        this.read = read;
        this.delete = delete;
        this.update = update;
    }

	public AnexoDAO() {
	}

	public int salvar(Anexo anexo) {
		return 0;
	}

	public Anexo buscarPorId(int id) {
		return null;
	}

	public List<Anexo> listarPorAta(int idAta) {
		return null;
	}
}
