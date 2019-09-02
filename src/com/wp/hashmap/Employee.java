package com.wp.hashmap;

import java.util.HashMap;

public class Employee {
    @Override
	public String toString() {
		return "Employee [eno=" + eno + ", salary=" + salary + ", name=" + name + ", desg=" + desg + "]";
	}

	int eno,salary;
    String name,desg;
    public static void main(String[] args) {
    	
   	 HashMap<Employee,Project> hamp=new HashMap<Employee,Project>();
   	 
   		Employee e1=new Employee(1001,"Ashi",20000,"Team Leader");
   		Employee e2=new Employee(1002,"Sadiya",24000,"Project manager");
   		Employee e3=new Employee(1003,"Anjali",30000,"manager");
          Employee e4=new Employee(1004,"Pooja",50000,"CEO");
          Employee e5=new Employee(1004,"Pooja",50000,"CEO");
        

    	  Project p =  new Project(501, "WasteManagemant", 5, "john");
       Project p1 = new Project(502, "insurancesystem", 3, "kanny");
       Project p2 = new Project(503, "librarysystem", 7, "kelly");
      Project p3 = new Project(504, "hostelsystem", 6, "jack");
      Project p4=new Project(505,"Hotelmanagement",7,"mama");


          
          hamp.put(e1, p);
          hamp.put(e2, p1);
          hamp.put(e3, p2);
          hamp.put(e4,p3);
          hamp.put(e5,p4);
          	System.out.println(hamp);
        

   }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desg == null) ? 0 : desg.hashCode());
		result = prime * result + eno;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (desg == null) {
			if (other.desg != null)
				return false;
		} else if (!desg.equals(other.desg))
			return false;
		if (eno != other.eno)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	public Employee(int eno, String name, int salary, String desg) 
	{
		this.eno=eno;
		this.salary=salary;
		this.name=name;
		this.desg=desg;
	}
}
	
