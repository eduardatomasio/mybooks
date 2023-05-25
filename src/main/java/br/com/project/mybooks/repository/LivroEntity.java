package br.com.project.mybooks.repository;

import br.com.project.mybooks.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroEntity extends JpaRepository<Livro, Long> {
}
