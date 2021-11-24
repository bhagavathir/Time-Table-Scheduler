package com.za.tutorial.ga.cs;
import java.util.ArrayList;
import java.util.Arrays;
import com.za.tutorial.ga.cs.domain.Course;
import com.za.tutorial.ga.cs.domain.Department;
import com.za.tutorial.ga.cs.domain.Instructor;
import com.za.tutorial.ga.cs.domain.MeetingTime;
import com.za.tutorial.ga.cs.domain.Room;
public class Data {
	private ArrayList<Room> rooms;
	private ArrayList<Instructor> instructors;
	private ArrayList<Course> courses;
	private ArrayList<Department> depts;
	private ArrayList<MeetingTime> meetingTimes;
	private int numberOfClasses =0;
	public Data() { initialize(); }
	private Data initialize() {
		Room room1=new Room("R1",60);
		Room room2=new Room("R2",60);
		Room room3=new Room("R3",60);
		rooms= new ArrayList<Room>(Arrays.asList(room1,room2,room3));
		MeetingTime meetingTime1 = new MeetingTime("MT1","MT 09:20 - 10:15");
		MeetingTime meetingTime2 = new MeetingTime("MT2","WTH 09:20 - 10:15");
		MeetingTime meetingTime3 = new MeetingTime("MT3","F 09:20 - 11:20");
		MeetingTime meetingTime4 = new MeetingTime("MT4","MT 10:30 - 11:20");
		MeetingTime meetingTime5 = new MeetingTime("MT5","WTH 10:30 - 11:20");
//		MeetingTime meetingTime6 = new MeetingTime("MT6","TH 10:30 - 12:15");
//		MeetingTime meetingTime7 = new MeetingTime("MT7","F 10:30 - 12:15");
		meetingTimes = new ArrayList<MeetingTime>(Arrays.asList(meetingTime1, meetingTime2, meetingTime3, meetingTime4, meetingTime5)); 
		Instructor instructor1= new Instructor("I1", "Dr James Web ");
		Instructor instructor2= new Instructor("I2", "Mr Mike Brown ");
		Instructor instructor3= new Instructor("I3", "Dr Steve Day ");
		Instructor instructor4= new Instructor("I4", "Dr Jane Doe ");
		instructors=new ArrayList<Instructor>(Arrays.asList(instructor1, instructor2, instructor3, instructor4));
		Course course1 = new Course("C1","325K", new ArrayList<Instructor>(Arrays.asList(instructor1, instructor2,instructor3)),25);
		Course course2 = new Course("C2","319K", new ArrayList<Instructor>(Arrays.asList(instructor2, instructor3,instructor4)),35);
		Course course3 = new Course("C3","462K", new ArrayList<Instructor>(Arrays.asList(instructor1, instructor3,instructor4)),25);
		Course course4 = new Course("C4","464K", new ArrayList<Instructor>(Arrays.asList(instructor2, instructor1, instructor4)),30);
		Course course5 = new Course("C5","360C", new ArrayList<Instructor>(Arrays.asList(instructor1,instructor2, instructor3)),35);
//		Course course6 = new Course("C6","302K", new ArrayList<Instructor>(Arrays.asList(instructor1, instructor3)),45);
//		Course course7 = new Course("C7","303L", new ArrayList<Instructor>(Arrays.asList(instructor2, instructor4)),45);
		courses = new ArrayList<Course>(Arrays.asList(course1,course2,course3,course4,course5));
		Department dept1=new Department("CSE",new ArrayList<Course>(Arrays.asList(course1, course2, course3,course4,course5)));
		Department dept2=new Department("IT",new ArrayList<Course>(Arrays.asList(course1, course2, course3,course4,course5)));
		Department dept3=new Department("EEE",new ArrayList<Course>(Arrays.asList(course1, course2, course3,course4,course5)));
		depts=new ArrayList<Department>(Arrays.asList(dept1,dept2,dept3));
		depts.forEach(x -> numberOfClasses += x.getCourses().size());
		return this;
	}
	public ArrayList<Room> getRooms(){ return rooms; }
	public ArrayList<Instructor> getInstructors(){ return instructors; }
	public ArrayList<Course> getCourses() { return courses; }
	public ArrayList<Department> getDepts() { return depts; }
	public ArrayList<MeetingTime> getMeetingTimes() { return meetingTimes; }
	public int getNumberOfClasses() { return this.numberOfClasses;}
}
