
package HopsitalTest;



import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.hospital.Doctor;
import com.qa.hospital.Hospital;
import com.qa.hospital.Patient;
import com.qa.hospital.PatientBuilder;
import com.qa.hospital.Staff;
import com.qa.hospital.TreatPlan;

public class Testing {
	Doctor d;
	
	@Before
	public void setup() {
		d = new Doctor();
	}
	
	@Test
	public void accessRecords() {
		assertEquals("Error", "Treatment Plan received", "Doctor");
		
//		assertEquals("Error", name, id);
	}
	
	@Test
	public void receptionAdmittance() {
		PatientBuilder p = new PatientBuilder();
		p.setLoc("ward1");
//		Staff.admitPatient(p);
//		assertEquals("Cannot find patient", "ward1", p.getLocation());
	}
	

}
