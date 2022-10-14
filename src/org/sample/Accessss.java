package org.sample;

public class Accessss extends Access{
private void HostelName() {
	System.out.println("Hostel Name : Nest");
	
}
public static void ownerLocation() {
	System.out.println("Java");
}
private void hostelLocation() {
	System.out.println("Hostel Location : Avadi");
}
public static void main(String[] args) {
	Accessss a = new Accessss();
	a.HostelName();
    a.ownerLocation();
	a.hostelLocation();
    System.out.println(Access.i);
	
}
}
