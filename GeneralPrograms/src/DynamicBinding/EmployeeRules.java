package DynamicBinding;

public interface EmployeeRules {
	
	int SALARY =20000; //by default they are static,final
	int LEAVES =10;
	

	void reportToManager(); //by default they are abstract
	
	void maintainHours();
	
	void maintaingAttendance();
	
}
