package org.artur.dao;

import org.artur.entity.Status;
import org.artur.entity.Task;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ARSOSNOW on 11/1/2016.
 */
@Repository
public class TaskDao {

    private static Map<Integer, Task> tasks;

    static {
        tasks = new HashMap<Integer, Task>(){{
            put(1,new Task(1,"FirstTask","First task in app", Status.NEW));
            put(2,new Task(2,"SecondTask","Some span task redy to do!", Status.NEW));
        }};
    }

    public Collection<Task> getAllTasks(){
        return tasks.values();
    }

    public Task getTaskById(int id) {
        return tasks.get(id);
    }

    public void createNewTask(Task task){
        tasks.put(task.getId(), task);
    }

    public void deleteTaskById(int id) {
        tasks.remove(id);
    }
}
