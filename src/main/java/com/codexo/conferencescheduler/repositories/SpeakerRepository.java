package com.codexo.conferencescheduler.repositories;

import com.codexo.conferencescheduler.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
