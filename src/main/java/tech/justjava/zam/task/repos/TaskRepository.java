package tech.justjava.zam.task.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.justjava.zam.process_instance.domain.ProcessInstance;
import tech.justjava.zam.task.domain.Task;


public interface TaskRepository extends JpaRepository<Task, Long> {

    Task findFirstByProcessInstance(ProcessInstance processInstance);

}
