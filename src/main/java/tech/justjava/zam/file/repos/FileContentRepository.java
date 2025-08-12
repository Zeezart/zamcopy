package tech.justjava.zam.file.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.justjava.zam.file.domain.FileContent;


public interface FileContentRepository extends JpaRepository<FileContent, String> {
}
