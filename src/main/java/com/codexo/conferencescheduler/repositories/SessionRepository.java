package com.codexo.conferencescheduler.repositories;

import com.codexo.conferencescheduler.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
