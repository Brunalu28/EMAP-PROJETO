package entitiesextendsDAO;

import java.util.List;

import entities.Usuario;

public class UsuarioDAO extends DAO<Identificavel> {
		
		public UsuarioDAO() {
			super(Identificavel.class);
		}

		public List<Usuario> findBy(Usuario filtro) {
			return null;
		}
}
