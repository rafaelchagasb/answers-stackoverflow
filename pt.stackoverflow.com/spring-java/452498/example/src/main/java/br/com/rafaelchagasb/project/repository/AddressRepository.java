package br.com.rafaelchagasb.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelchagasb.project.models.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {}