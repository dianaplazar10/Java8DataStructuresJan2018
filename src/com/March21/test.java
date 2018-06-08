package com.March21;

import java.util.Calendar;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int x=9;
	    x=-x;
	    System.out.println(x);

	    //MyCollection<?> n=new MyCollection<?>();
	    //--------------------------------------------
//	    Calendar cal = Calendar.getInstance();
//	    cal.set(2000,  Calendar.JULY,30);
//	    cal.roll(Calendar.MONTH, 7);
//	    System.out.println(""+cal.get(Calendar.DATE) + "-" 
//	                    + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.YEAR));
//	    cal.add(Calendar.MONTH, 10);
//	    System.out.println(""+cal.get(Calendar.DATE) + "-" 
//                + cal.get(Calendar.MONTH) + "-" + cal.get(Calendar.YEAR));
	    //O/p:
	    //29-1-2000
	    //29-11-2000
	    //----------------------------------------------
	    
	    
	    
	    
	    
	  //----------------------------------------------
	    class Shape{}
	    class Triangle extends Shape{}
	    class Rectangle extends Shape{}
	    
	    Shape shape = new Rectangle();
	    Rectangle rectangle = new Rectangle();
	    
	    //shape=rectangle; // no exception, will compile and run fine
	    //Triangle tri = (Triangle) shape;// will compile, but throws ClassCastException at runtime
	    //Triangle tri = (Triangle) rectangle;//CompileTime Exception;Cannot cast from Rectangle to Triangle
	    //System.out.println("complete");
	  //----------------------------------------------
	    
	  //----------------------------------------------
	    String report = args[0];
	    if(report.equals(Report.EMPRPT.getName())) 
	        System.out.println("Id : " + Report.EMPRPT.getId() + "Name : "+ Report.EMPRPT.getName());
	    if(report.equals(Report.EMPRPT)) 
            System.out.println("Id : " + Report.EMPRPT.getId() + "Name : "+ Report.EMPRPT.getName());
	    if(report.equals(Report.EMPRPT.toString())) 
            System.out.println("Id : " + Report.EMPRPT.getId() + "Name : "+ Report.EMPRPT.getName());
	    if(report.equals(Report.EMPRPT.name)) 
            System.out.println("Id : " + Report.EMPRPT.getId() + "Name : "+ Report.EMPRPT.getName());
	  //----------------------------------------------
	}
	
	 public enum Report{
         EMPRPT(1,"EMPLOYEE_REPORT"),mngrpt(2,"MANAGER_REPORT");
         private String name;
         private int id;
         Report(int id, String name){
             this.setName(name);this.id=id;
         }
         
         public String getName(){return name;}
         public void setName(String name){this.name = name;}
         public int getId(){ return this.id;}
         
     }

}


class MyCollection<T>{
    private Set<T> set;
    public Set<T> getCollection(){
        return this.set;
    }
}