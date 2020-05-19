package br.com.rafaelchagasb.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelchagasb.project.models.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {}	