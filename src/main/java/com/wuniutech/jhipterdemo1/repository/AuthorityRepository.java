package com.wuniutech.jhipterdemo1.repository;

import com.wuniutech.jhipterdemo1.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
