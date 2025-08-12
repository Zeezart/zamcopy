package tech.justjava.zam.chat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.justjava.zam.chat.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}