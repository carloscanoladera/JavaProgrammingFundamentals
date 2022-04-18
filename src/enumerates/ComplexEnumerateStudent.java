package enumerates;

public enum ComplexEnumerateStudent {
	
	
	EXCHANGE_STUDENT("EXCHANGE STUDENT", 1 , "INTERNATIONAL"),
	NATIONAL_STUDENT("NATIONAL STUDENT",2, "NATIONAL"),
	STATE_STUDENT("STATE STUDENT", 3, "LOCAL");

	private String description;	
	private int id; 
	private String name;
	
	
	ComplexEnumerateStudent(String description, int id, String name) {
		// TODO Auto-generated constructor stub
		
		this.description=description;
		this.id=id;
		this.name=name;
	}

	
	public String getDescription() {
		
		
	return this.description;
	}


	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	
}



