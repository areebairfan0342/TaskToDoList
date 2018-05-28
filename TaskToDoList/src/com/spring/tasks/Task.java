package com.spring.tasks;

public class Task {
private String taskname;
private String taskstatus;
private int taskid;
//public Task(String taskname) {// constructor
//    this.setTaskname(taskname);
//    
//   }
public Task(int taskid,String taskname,String taskstatus) {// constructor
    this.setTaskname(taskname);
    this.setTaskid(taskid);
    this.setTaskstatus(taskstatus);
   }

public String getTaskstatus() {
    return taskstatus;
}
public void setTaskstatus(String taskstatus) {
    this.taskstatus = taskstatus;
}
public int getTaskid() {
    return taskid;
}
public void setTaskid(int taskid) {
    this.taskid = taskid;
}

public String getTaskname() {
    return taskname;
}

public void setTaskname(String taskname) {
    this.taskname = taskname;
}

}
