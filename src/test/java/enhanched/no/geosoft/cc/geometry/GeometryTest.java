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

        assertEquals(145.984245750396, intersectionPoint[0], 0.0005);
        assertEquals((-155.41447236177703 + -157.39186511853802) / 2, intersectionPoint[1], 0.0005);
    }

    @Test
    public void should_be_parallel_and_overlapping_lines2() {
        double[] intersectionPoint = new double[2];

        int result = Geometry.findLineSegmentIntersection(100, 100, 200, 100, 150, 100, 300, 100, intersectionPoint);

        assertEquals(-2, result);

        assertEquals((200+150)/2, intersectionPoint[0], 0.0005);
        assertEquals(100, intersectionPoint[1], .0005);
    }

    @Test
    public void should_intersect() {
        double[] intersectionPoint = new double[2];

        int result = Geometry.findLineSegmentIntersection(0, 0, 100, 100, 0, 100, 100, 0, intersectionPoint);

        assertEquals(1, result);

        assertEquals(50, intersectionPoint[0], 0.0005);
        assertEquals(50, intersectionPoint[1], .0005);
    }
}
