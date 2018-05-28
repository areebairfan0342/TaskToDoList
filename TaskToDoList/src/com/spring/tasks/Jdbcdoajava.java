package com.spring.tasks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.tasks.Task;

@Component
public class Jdbcdoajava {
    @Autowired
    private DataSource dataSource;
    Connection con=null;
    Statement st=null;
    ResultSet rs;
    Task task=null;
    public int insertTask(String taskname) {
	int row=0;
	try {
	    con=dataSource.getConnection();
	    st=con.createStatement();
	  //  ResultSet rs=st.executeQuery("Select task_name from tasks");
	    row=st.executeUpdate("insert into tasks(task_name) values('"+taskname+"')");
	   // while(rs.next()) {
		//task=new Task(rs.getString("task_name"));
	  //  }
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	finally {
	    
	    try {
		st.close();
		con.close();
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	return row;
	
    }
    
    public ArrayList<Task> viewTask() {
	ArrayList<Task> alltask=new ArrayList<Task>();
	try {
	    con=dataSource.getConnection();
	    st=con.createStatement();
	  //  ResultSet rs=st.executeQuery("Select task_name from tasks");
	     rs=st.executeQuery("Select * from tasks");
	    while(rs.next()) {
		task=new Task(rs.getInt("task_id"),rs.getString("task_name"),rs.getString("task_status"));
		alltask.add(task);
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	finally {
	    
	    try {
		st.close();
		con.close();
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	return alltask;
	
    }
    
    public int deleteTask(int taskid) {
   	int row=0;
   	try {
   	    con=dataSource.getConnection();
   	    st=con.createStatement();
   	  //  ResultSet rs=st.executeQuery("Select task_name from tasks");
   	    row=st.executeUpdate("Delete from tasks where task_id="+taskid);
   	} catch (SQLException e) {
   	    e.printStackTrace();
   	}
   	finally {
   	    
   	    try {
   		st.close();
   		con.close();
   	    } catch (SQLException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	    }
   	}
   	return row;
   	
       }
    
    public int markTask(int taskid) {
   	int row=0;
   	try {
   	    con=dataSource.getConnection();
   	    st=con.createStatement();
   	  //  ResultSet rs=st.executeQuery("Select task_name from tasks");
   	    row=st.executeUpdate("update tasks set task_status='Completed' where task_id="+taskid);
   	} catch (SQLException e) {
   	    e.printStackTrace();
   	}
   	finally {
   	    
   	    try {
   		st.close();
   		con.close();
   	    } catch (SQLException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	    }
   	}
   	return row;
   	
       }
    
    public int edittask(int taskid,String taskname) {
   	int row=0;
   	try {
   	    con=dataSource.getConnection();
   	    st=con.createStatement();
   	  //  ResultSet rs=st.executeQuery("Select task_name from tasks");
   	    row=st.executeUpdate("update tasks set task_name='"+taskname+"' where task_id="+taskid);
   	} catch (SQLException e) {
   	    e.printStackTrace();
   	}
   	finally {
   	    
   	    try {
   		st.close();
   		con.close();
   	    } catch (SQLException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	    }
   	}
   	return row;
   	
       }
    public ArrayList<Task> DataforeditTasks(int taskid) {
	ArrayList<Task> alltask=new ArrayList<Task>();
	try {
	    con=dataSource.getConnection();
	    st=con.createStatement();
	  //  ResultSet rs=st.executeQuery("Select task_name from tasks");
	     rs=st.executeQuery("Select * from tasks where task_id="+taskid);
	    while(rs.next()) {
		task=new Task(rs.getInt("task_id"),rs.getString("task_name"),rs.getString("task_status"));
		alltask.add(task);
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	finally {
	    
	    try {
		st.close();
		con.close();
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	return alltask;
	
    }
    
    
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
}
