package Employee2;
import org.company2.Company2;
import org.client2.OrgClient;
import Ora.pacakage2.OraPackage2;


public class Employeedet { 
	
	private void empname2() {
		// TODO Auto-generated method stub
		System.out.println("Employee name is: Syed sheik mohamed");
		
		
		
	}
	
	public static void main(String[] args) {
		
		Employeedet emp=new Employeedet();
		Company2 cmp=new Company2();
		OrgClient cli =new OrgClient();
		OraPackage2 pack =new OraPackage2();
		
		
		emp.empname2();
		cmp.companyname2();
		cli.Clientname();
		pack.Projectname();
		
		
		
	}
		


}