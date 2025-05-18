package com.sb.backend.repository;

import java.util.Optional;

import com.sb.backend.model.ERole;
import com.sb.backend.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}