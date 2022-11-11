package org.launchcode.techjobs.oo.test;

import org.junit.Before;
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
    Job engineer = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job parks = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


     assertNotEquals(engineer.getId(), parks.getId());
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

    @Test
    public void testToStringStartsAndEndsWithNewLine () {
    Job parks = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    char index0 = parks.toString().charAt(0);
    char indexEnd = parks.toString().charAt(parks.toString().length() - 1);
    char newLine = '\n';

    assertEquals(index0, newLine);
    assertEquals(indexEnd, newLine);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData () {

    Job engineer = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    String correctFormat =
            "\nID: " + engineer.getId() +
            "\nName: " + engineer.getName() +
            "\nEmployer: " + engineer.getEmployer() +
            "\nLocation: " + engineer.getLocation() +
            "\nPosition Type: " + engineer.getPositionType() +
            "\nCore Competency: " + engineer.getCoreCompetency() +
            '\n';

        assertEquals(engineer.toString(), correctFormat);
    }

    @Test
    public void testToStringHandlesEmptyField () {
        Job launchCode = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        Job coder = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));

        String jobDoesNotExist = "OOPS! This job does not seem to exist.";
        String correctFormat =
                        "\nID: "+ coder.getId() +
                        "\nName: Data not available" +
                        "\nEmployer: " + coder.getEmployer() +
                        "\nLocation: " + coder.getLocation() +
                        "\nPosition Type: " + coder.getPositionType() +
                        "\nCore Competency: Data not available" +
                        "\n";

        assertEquals(coder.toString(), correctFormat);
        assertEquals(launchCode.toString(), jobDoesNotExist);


    }


    }


