// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;
 // namespace


//////////////////////////////// Point3_ ////////////////////////////////

/** \brief Template class for 3D points specified by its coordinates {@code x}, {@code y} and {@code z}.
<p>
An instance of the class is interchangeable with the C structure CvPoint2D32f . Similarly to
Point_ , the coordinates of 3D points can be converted to another type. The vector arithmetic and
comparison operations are also supported.
<p>
The following Point3_\<\> aliases are available:
<pre>{@code
    typedef Point3_<int> Point3i;
    typedef Point3_<float> Point3f;
    typedef Point3_<double> Point3d;
}</pre>
@see cv::Point3i, cv::Point3f and cv::Point3d
*/
@Name("cv::Point3_<int>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Point3i extends IntPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point3i(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Point3i(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Point3i position(long position) {
        return (Point3i)super.position(position);
    }


    /** default constructor */
    public Point3i() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Point3i(int _x, int _y, int _z) { super((Pointer)null); allocate(_x, _y, _z); }
    private native void allocate(int _x, int _y, int _z);
    public Point3i(@Const @ByRef Point3i pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point3i pt);
    public Point3i(@Const @ByRef Point pt) { super((Pointer)null); allocate(pt); }
    private native void allocate(@Const @ByRef Point pt);

    public native @ByRef @Name("operator =") Point3i put(@Const @ByRef Point3i pt);
    /** conversion to another data type */
    /** conversion to cv::Vec<> */

    /** dot product */
    public native int dot(@Const @ByRef Point3i pt);
    /** dot product computed in double-precision arithmetics */
    public native double ddot(@Const @ByRef Point3i pt);
    /** cross product of the 2 3D points */
    public native @ByVal Point3i cross(@Const @ByRef Point3i pt);
    /** x coordinate of the 3D point */
    public native int x(); public native Point3i x(int x);
    /** y coordinate of the 3D point */
    public native int y(); public native Point3i y(int y);
    /** z coordinate of the 3D point */
    public native int z(); public native Point3i z(int z);
}