package org.artur.service;

import org.artur.dao.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import javax.annotation.PostConstruct;

/**
 * Created by ARSOSNOW on 11/10/2016.
 */
@Service
@ApplicationScope
public class TaskIdGen {

    @Autowired
    private TaskDao taskDao;

    private int currentIdVal;

//    TaskIdGen(int currentIdVal){
//        this.currentIdVal = currentIdVal;
//    }

    @PostConstruct
    private void initialize(){
        this.currentIdVal = taskDao.getAllTasks().size();
    }

    public int getCurrentIdVal() {
        return currentIdVal;
    }

    public int getNextId(){
        return ++currentIdVal;
    }
}
