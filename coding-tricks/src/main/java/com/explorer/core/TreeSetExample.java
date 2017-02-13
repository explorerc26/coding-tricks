package com.explorer.core;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      TreeSet ts = new TreeSet();
	      
	      // Add elements to the tree set
	      ts.add("C");
	      ts.add("A");
	      ts.add("B");
	      ts.add("E");
	      ts.add("F");
	      ts.add("D");
	      System.out.println(ts);
	      // run time exception
	      TreeSet<Person> personSet = new TreeSet<Person>();
	      try{
		      Person p1 = new Person("a", "b");
		      personSet.add(p1); 
		      System.out.println(personSet);
	      }catch(Exception ex){
	    	  ex.printStackTrace();
	      }
	      
	      TreeSet<PersonComp> personSetComp = new TreeSet<PersonComp>();
	      PersonComp p1 = new PersonComp("a", "e");
	      PersonComp p2 = new PersonComp("c", "d");
	      PersonComp p3 = new PersonComp("b", "f");
	      personSetComp.add(p1); 
	      personSetComp.add(p2); 
	      personSetComp.add(p3); 
	      System.out.println(personSetComp);
	      System.out.println("comparator used "+personSetComp.comparator());
	      
	      TreeSet<Person> personSetComparator = new TreeSet<Person>(new PersonComparator());
	      Person p11 = new Person("a", "e");
	      Person p22 = new Person("c", "d");
	      Person p33 = new Person("b", "f");
	      personSetComparator.add(p11);
	      personSetComparator.add(p22);
	      personSetComparator.add(p33);
	      System.out.println(personSetComparator);
	      System.out.println("comparator used "+personSetComparator.comparator());
	      
//	      compilation error 
	      //TreeSet<PersonComp> personSetCompBoth = new TreeSet<PersonComp>(new PersonComparator());
	      TreeSet<PersonComp> personSetCompBoth = new TreeSet<PersonComp>();
	      PersonComp pp1 = new PersonComp("a", "e");
	      PersonComp pp2 = new PersonComp("c", "d");
	      PersonComp pp3 = new PersonComp("b", "f");
	      personSetCompBoth.add(pp1); 
	      personSetCompBoth.add(pp2); 
	      personSetCompBoth.add(pp3); 
	      System.out.println(personSetCompBoth);
	      System.out.println("comparator used "+personSetCompBoth.comparator());
	}
	
	public static class Person{
		@Override
		public String toString() {
			return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		public Person(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		private String firstName;
		private String lastName;
		
	}

	
	public static class PersonComp implements Comparable<PersonComp>{
		@Override
		public String toString() {
			return "PersonComp [firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		public PersonComp(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		private String firstName;
		private String lastName;
		@Override
		public int compareTo(PersonComp o) {
			return firstName.compareTo(o.getFirstName());
		}
		
	}
	
	public static class PersonComparator implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getLastName().compareTo(o2.getLastName());
		}
		
	}
}
