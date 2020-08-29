package br.com.cyber.octools.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cyber.octools.model.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController{

	private List<Usuario> usuarios = List.of(
		new Usuario("Rafael Sasuke", "rafael.pequeno@gmail.com", "1234", "Desenvolvedor")
	);

	@GetMapping
	public List<Usuario> todos() {
		return this.usuarios;
	}

	@GetMapping("/{id}")
	public Usuario visualizar(@PathVariable Long id) {
		return this.usuarios.get(id.intValue() - 1);
	}

	@PostMapping
	public Usuario cadastrar(@RequestBody Usuario usuario) {
		this.usuarios.add(usuario);
		return usuario;
	}

	@PutMapping("/{id}")
	public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
		this.usuarios.set(id.intValue() - 1, usuario);
    return this.usuarios.get(id.intValue() - 1);
	}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		this.usuarios.remove(id.intValue() - 1);
	}
}