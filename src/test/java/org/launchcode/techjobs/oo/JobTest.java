package org.launchcode.techjobs.oo;
import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        job1.setId(1);

        assertEquals(1, job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job1.getName().equals("Product tester"));
        assertTrue(job1.getEmployer().getValue().equals("ACME"));
        assertTrue(job1.getLocation().getValue().equals("Desert"));
        assertTrue(job1.getPositionType().getValue().equals("Quality control"));
        assertTrue(job1.getCoreCompetency().getValue().equals("Persistence"));
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job();

        String expectedString =
                "\nID: " + job.getId() +
                "\nName: Data not available" +
                "\nEmployer: Data not available" +
                        "\nLocation: Data not available" +
                        "\nPosition Type: Data not available" +
                        "\nCore Competency: Data not available" +
                        "\n";

        assertEquals(expectedString, job.toString());
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedString =
                "\nID: " + job.getId() +
                        "\nName: Product tester" +
                        "\nEmployer: ACME" +
                        "\nLocation: Desert" +
                        "\nPosition Type: Quality control" +
                        "\nCore Competency: Persistence" +
                        "\n";

        assertEquals(expectedString, job.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job();

        String expectedString =
                "\nID: " + job.getId() +
                        "\nName: Data not available" +
                        "\nEmployer: Data not available" +
                        "\nLocation: Data not available" +
                        "\nPosition Type: Data not available" +
                        "\nCore Competency: Data not available" +
                        "\n";

        assertEquals(expectedString, job.toString());
    }
    };
