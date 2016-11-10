package org.artur.controler;

import org.artur.dao.TaskDao;
import org.artur.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by ARSOSNOW on 11/1/2016.
 */
@RestController()
@RequestMapping("/tasks")
public class SampleRestContlorer {

    @Autowired
    TaskDao taskDao;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Task> getTasks(){
        return taskDao.getAllTasks();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public int createTask(@RequestParam("title") String title, @RequestParam("description") String desc){
//        return taskDao.createNewTask(title,desc);
        return -1;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Task getTaskById(@PathVariable("id") int id){
        return taskDao.getTaskById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteTaskById(@PathVariable("id") int id){
        taskDao.deleteTaskById(id);
    }

}
