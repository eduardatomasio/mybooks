package br.com.project.mybooks.repository;

import br.com.project.mybooks.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
