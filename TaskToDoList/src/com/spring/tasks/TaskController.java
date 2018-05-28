package com.spring.tasks;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class TaskController {
    ApplicationContext ctx=null;
    Jdbcdoajava jdj=null;
    int row=0;
    ArrayList<Task> alltask=null;
//    @RequestMapping(value="/mainform" //this value shows that the resource MainPage.jsp would available at /mainform url 
//	    ,method=RequestMethod.POST)
//    public String showForm(Task task) {
//	System.out.print(task.getTaskname());
//	ctx=new ClassPathXmlApplicationContext("data-spring.xml");
//	 jdj=ctx.getBean("jdbcdoajava", Jdbcdoajava.class);
//	 row=jdj.insertTask(task.getTaskname());
//	System.out.println(row);
//	//ModelAndView showform=new ModelAndView("redirect:/mvc/alltasks");//here we give the jsp name
//	return "redirect:/mvc/alltasks";
//    }
    
    @RequestMapping(value="/mainform" //this value shows that the resource MainPage.jsp would available at /mainform url 
	    ,method=RequestMethod.POST)
    public String showForm(@RequestParam("taskname") String task) {
	System.out.print(task);
	ctx=new ClassPathXmlApplicationContext("data-spring.xml");
	 jdj=ctx.getBean("jdbcdoajava", Jdbcdoajava.class);
	 row=jdj.insertTask(task);
	System.out.println(row);
	//ModelAndView showform=new ModelAndView("redirect:/mvc/alltasks");//here we give the jsp name
	return "redirect:/mvc/alltasks";
    }
    
    @RequestMapping(value="/alltasks", method=RequestMethod.GET)
    public ModelAndView viewTasks(ModelAndView modelAndView)
    {
	modelAndView.setViewName("Viewtasks");
	ctx=new ClassPathXmlApplicationContext("data-spring.xml");
	 jdj=ctx.getBean("jdbcdoajava", Jdbcdoajava.class);
	alltask=jdj.viewTask();
	Task task=alltask.get(0);
	System.out.println(task.getTaskstatus());
	modelAndView.addObject("alltask",alltask);
	return modelAndView;
    }
    
    @RequestMapping(value="/deletetask/{taskid}", method=RequestMethod.GET)
    public String deleteTasks(@PathVariable("taskid") int taskid)
    {
	 System.out.println(" "+taskid);
	ctx=new ClassPathXmlApplicationContext("data-spring.xml");
	 jdj=ctx.getBean("jdbcdoajava", Jdbcdoajava.class);
	
	row=jdj.deleteTask(taskid);
	//viewTasks(modelAndView);
	return "redirect:/mvc/alltasks";
	
	//return modelAndView;
    }
    
    @RequestMapping(value="/marktask/{taskid}",method=RequestMethod.GET)
    public String markTasks(@PathVariable("taskid") int taskid)
    {
	 System.out.println(" "+taskid);
	ctx=new ClassPathXmlApplicationContext("data-spring.xml");
	 jdj=ctx.getBean("jdbcdoajava", Jdbcdoajava.class);
	
	row=jdj.markTask(taskid);
	//viewTasks(modelAndView);
	return "redirect:/mvc/alltasks";
	
	//return modelAndView;
    }
    
    @RequestMapping(value="/dataforeditTasks/{taskid}",method=RequestMethod.GET)
    public ModelAndView dataforeditTasks(@PathVariable("taskid") int taskid,ModelAndView modelAndView)
    {
	modelAndView.setViewName("EditTask");
	ctx=new ClassPathXmlApplicationContext("data-spring.xml");
	 jdj=ctx.getBean("jdbcdoajava", Jdbcdoajava.class);
	 alltask=jdj.DataforeditTasks(taskid);
	Task task=alltask.get(0);
	System.out.println(task.getTaskstatus());
	modelAndView.addObject("edittask",alltask);
	return modelAndView;
	
    }
    
    @RequestMapping(value="/editTasks",method=RequestMethod.POST)
    public String editTasks(@RequestParam("taskname") String taskname,@RequestParam("taskid") int taskid,ModelAndView modelAndView)
    {
	System.out.println("editTasks "+taskid);
	ctx=new ClassPathXmlApplicationContext("data-spring.xml");
	 jdj=ctx.getBean("jdbcdoajava", Jdbcdoajava.class);
	 row=jdj.edittask(taskid,taskname);
	//Task task=alltask.get(0);
	//System.out.println(task.getTaskstatus());
	//modelAndView.addObject("edittask",alltask);
	return "redirect:/mvc/alltasks";
	
    }
}
