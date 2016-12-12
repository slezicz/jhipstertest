package cz.pvs.slezacek.jhipstertest.repository;

import cz.pvs.slezacek.jhipstertest.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
