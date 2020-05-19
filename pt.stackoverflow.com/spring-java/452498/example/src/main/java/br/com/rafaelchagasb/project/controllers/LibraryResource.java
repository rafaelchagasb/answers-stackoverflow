package br.com.rafaelchagasb.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaelchagasb.project.models.Library;
import br.com.rafaelchagasb.project.repository.LibraryRepository;

@RestController
@RequestMapping(value = "/api")
public class LibraryResource {

  @Autowired
  LibraryRepository libraryRepository;

  @GetMapping("/libraries")
  public List<Library> listaBibliotecas() {
    return libraryRepository.findAll();
  }

  @PostMapping("/library")
  public Library salvaBiblioteca(@RequestBody Library library) {
    return libraryRepository.save(library);
  }
}