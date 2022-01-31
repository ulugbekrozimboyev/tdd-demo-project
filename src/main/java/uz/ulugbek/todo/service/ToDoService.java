package uz.ulugbek.todo.service;

import org.springframework.stereotype.Service;
import uz.ulugbek.todo.models.ToDo;
import uz.ulugbek.todo.repositories.ToDoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;

    public ToDoService() {}
    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> findAll(){
        return toDoRepository.findAll();
    }

    public ToDo save(ToDo toDo) {
        return toDoRepository.save(toDo);
    }
}
