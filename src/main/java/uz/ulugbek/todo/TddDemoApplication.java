package uz.ulugbek.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import uz.ulugbek.todo.models.ToDo;
import uz.ulugbek.todo.repositories.ToDoRepository;

@SpringBootApplication
public class TddDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TddDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner setup(ToDoRepository toDoRepository) {
		return (args) -> {
			toDoRepository.save(new ToDo("Add a new test case", true));
			toDoRepository.save(new ToDo("Make it fail", true));
			toDoRepository.save(new ToDo("Do changes to the code", false));
			toDoRepository.save(new ToDo("Pass the test", true));
		};
	}
}
