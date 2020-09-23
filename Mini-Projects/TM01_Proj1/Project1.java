package Projects;

public class Project1 {

	public static void main(String[] args) {
		
		String[][] empDetails= {{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
							{"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
							{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
							{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
							{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
							{"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
							{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}}; 
		
		long empNo=Long.parseLong(args[0]);
		String empName="";
		String dept="";
		char design_ch='e';
		String design="";
		long salary=0;
		long salary_mid=0;
		long da=0;
		
		int rows=empDetails.length;
		int cols=empDetails[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(Long.parseLong(empDetails[i][0])==empNo) {
					empName=empDetails[i][1];
					dept=empDetails[i][4];
					
					salary_mid=Integer.parseInt(empDetails[i][5]) + Integer.parseInt(empDetails[i][6]) - Integer.parseInt(empDetails[i][7]);
					design_ch=empDetails[i][3].charAt(0);
				}
			}
		}
		
		switch(design_ch) {
		case 'e':
			design="Engineer";
			da=20000;
			break;
		case 'c':
			design="Consultant";
			da=32000;
			break;
		case 'k':
			design="Clerk";
			da=12000;
			break;
		case 'r':
			design="Receptionist";
			da=15000;
			break;
		case 'm':
			design="Manager";
			da=40000;
			break;
		default:
			System.out.print("");
		}
		
		salary = salary_mid + da;
		
		
		System.out.println("\nEmp No.\tEmp Name\tDepartment\tDesignation\tSalary ");
		System.out.println(empNo+"\t"+empName+"\t\t"+dept+"\t\t"+design+"\t\t"+salary);
		
		
	}

}
