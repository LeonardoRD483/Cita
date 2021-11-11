package com.example.cm.persistence.repository.jpa;

import com.example.cm.persistence.repository.model.CitaPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaPersistableRepository extends JpaRepository<CitaPersistable, Long> {
}
