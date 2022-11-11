package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId ()  {
        Job launchCode = new Job();
        Job parks = new Job();
     assertNotEquals(launchCode, parks);
    }
    @Test
    public void testJobConstructorSetsAllFields () {
       Job engineer = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

       assertEquals(engineer.getName(), "Product tester");
       assertTrue(engineer.getName() != null);

       assertEquals(engineer.getEmployer().getValue(), "ACME");
       assertTrue(engineer.getEmployer() instanceof Employer);

       assertEquals(engineer.getLocation().getValue(), "Desert");
       assertTrue(engineer.getLocation() instanceof Location);

       assertEquals(engineer.getPositionType().getValue(), "Quality control");
       assertTrue(engineer.getPositionType() instanceof PositionType);

       assertEquals(engineer.getCoreCompetency().getValue(), "Persistence");
       assertTrue(engineer.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality () {
        Job engineer = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job parks = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(engineer.getId() == parks.getId());
    }

}
