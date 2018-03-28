package br.com.impacta.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.impacta.dao.JpaGenericDao;
import br.com.impacta.model.Usuario;

public class UsuarioDAO {
	JpaGenericDao<Usuario> dao = new JpaGenericDao<Usuario>();
	
	@Test
	public void inserirPessoa() {
		Usuario usuario= new GerenciadorMassa().popularUsuario();
		dao.insert(usuario);
		Assert.assertTrue(usuario.getId() != null);
	}
}