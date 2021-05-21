package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;

    @Before
    public void createJobObject() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product tester", new Employer("Acme"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        job5 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(job1.getId(), job2.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(job1.getId() < job3.getId());
        assertEquals("Product tester", job3.getName());
        assertTrue(job3.getEmployer() instanceof Employer);
        assertEquals("Acme", job3.getEmployer().getValue());
        assertTrue(job3.getLocation() instanceof Location);
        assertEquals("Desert", job3.getLocation().getValue());
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job3.getId() == job4.getId());
    }

    @Test
    public void testJobsForToString() {
        String testString = "\n" + "ID: " + job3.getId() + "\n" + "Name: " + job3.getName() + "\n" + "Employer: " + job3.getEmployer() + "\n" + "Location: " + job3.getLocation() + "\n" + "Position Type: " + job3.getPositionType() + "\n" + "Core Competency: " + job3.getCoreCompetency() + "\n";
        assertTrue(testString.equals(job3.toString()));

        String testStringBlank = "\n" + "ID: " + job1.getId() + "\n" + "Name: Data not available" + "\n" + "Employer:" +
                " Data not available" + "\n" + "Location: Data not available"+ "\n" + "Position Type: Data not available" + "\n" + "Core Competency: Data not available" + "\n";
        assertTrue(testStringBlank.equals(testStringBlank));
    }


}
