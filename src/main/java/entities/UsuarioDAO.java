package entities;

import java.util.List;

public class UsuarioDAO extends DAO<Identificavel> {
		
		public UsuarioDAO() {
			super(Identificavel.class);
		}

		public List<Usuario> findBy(Usuario filtro) {
			return null;
		}
}
