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
}
