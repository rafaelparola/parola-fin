package org.parolafin.backend.repository;

import org.parolafin.backend.entity.AppUser;
import org.parolafin.backend.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {

}
