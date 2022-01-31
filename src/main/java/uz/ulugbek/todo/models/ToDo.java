package uz.ulugbek.todo.models;

import lombok.Data;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ToString
@Data
public class ToDo {

    @Id
    @GeneratedValue
    private long id;
    private String text;
    private boolean completed;

    public ToDo() {}

    public ToDo(long id, String text, boolean completed) {

        this.id = id;
        this.text = text;
        this.completed = completed;
    }

    public ToDo(String text, boolean completed) {
        this.text = text;
        this.completed = completed;
    }
}