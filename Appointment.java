import java.util.Scanner; 

public class Appointment
{
	private int startTime, endTime;
	private Date date;
	
	// constructors
	
	public Appointment(int startTime, int endTime, Date date) 
	{
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
	}
			
	public Appointment(int startTime, int endTime, int day, int month, int year) 
	{
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = new Date(day, month, year);
	}
	
	// constructors (continued) - default constructor
	
	public Appointment() 
	{
		this.startTime = startTime;
		this.endTime = endTime;
		this.date = date;
	}
	
	// generated getters and setters 
	
	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
//	public int getDay() {
//		return date.day;
//	}

//	public void setDay(int day) { // ERROR HERE
//		this.day = day;
//	}
	

	// Helper method to display an appointment (an override) 
	public String toString() 
	{
		return "Appointment on " + date.toString() + " from " + startTime + " to " + endTime;
	}
	
	// Helper method to set an appointment 
	public void set() {
        Scanner console = new Scanner(System.in);
        System.out.println("Default or existing appointment is: " + startTime + " to " + endTime + " on " + date);
        System.out.print("Enter desired start time: ");
        startTime = console.nextInt();
        System.out.print("Enter desired end time: ");
        endTime = console.nextInt();
//        System.out.print("Enter desired day: ");
//        date.day = console.nextInt();
        System.out.print("Appointment is now: " + startTime + " to " + endTime + " on " + date);
        
// 		System.out.print("Enter desired day: ");
//      date.day (aDay, aMonth, aYear); = console.nextLine();
		
	}

}