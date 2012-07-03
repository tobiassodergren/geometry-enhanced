package enhanched.no.geosoft.cc.geometry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GeometryTest
{
    @Test
    public void should_be_parallel_and_overlapping_lines() {
        double[] intersectionPoint = new double[2];

        int result = Geometry.findLineSegmentIntersection(145.984245750396, -158.24911803106838, 145.984245750396, -155.41447236177703, 145.984245750396, -129.0454077948479, 145.984245750396, -157.39186511853802, intersectionPoint);

        assertEquals(-2, result);
        System.out.println("intersectionPoint[0] = " + intersectionPoint[0]);
        System.out.println("intersectionPoint[1] = " + intersectionPoint[1]);
    }
}
