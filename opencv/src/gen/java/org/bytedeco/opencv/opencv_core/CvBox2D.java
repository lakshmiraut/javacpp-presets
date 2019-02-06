// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #endif

/** @see RotatedRect
 */
@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvBox2D extends AbstractCvBox2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvBox2D(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvBox2D(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvBox2D position(long position) {
        return (CvBox2D)super.position(position);
    }

    /** Center of the box.                          */
    public native @ByRef CvPoint2D32f center(); public native CvBox2D center(CvPoint2D32f center);
    /** Box width and length.                       */
    public native @ByRef CvSize2D32f size(); public native CvBox2D size(CvSize2D32f size);
    /** Angle between the horizontal axis           */
    /** and the first side (i.e. length) in degrees */
    public native float angle(); public native CvBox2D angle(float angle);

// #if defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus)
    public CvBox2D(@ByVal(nullValue = "CvPoint2D32f()") CvPoint2D32f c, @ByVal(nullValue = "CvSize2D32f()") CvSize2D32f s, float a/*=0*/) { super((Pointer)null); allocate(c, s, a); }
    private native void allocate(@ByVal(nullValue = "CvPoint2D32f()") CvPoint2D32f c, @ByVal(nullValue = "CvSize2D32f()") CvSize2D32f s, float a/*=0*/);
    public CvBox2D() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CvBox2D(@ByVal(nullValue = "CvPoint2D32f()") @Cast("CvPoint2D32f*") FloatBuffer c, @ByVal(nullValue = "CvSize2D32f()") CvSize2D32f s, float a/*=0*/) { super((Pointer)null); allocate(c, s, a); }
    private native void allocate(@ByVal(nullValue = "CvPoint2D32f()") @Cast("CvPoint2D32f*") FloatBuffer c, @ByVal(nullValue = "CvSize2D32f()") CvSize2D32f s, float a/*=0*/);
    public CvBox2D(@ByVal(nullValue = "CvPoint2D32f()") @Cast("CvPoint2D32f*") float[] c, @ByVal(nullValue = "CvSize2D32f()") CvSize2D32f s, float a/*=0*/) { super((Pointer)null); allocate(c, s, a); }
    private native void allocate(@ByVal(nullValue = "CvPoint2D32f()") @Cast("CvPoint2D32f*") float[] c, @ByVal(nullValue = "CvSize2D32f()") CvSize2D32f s, float a/*=0*/);
    public CvBox2D(@Const @ByRef RotatedRect rr) { super((Pointer)null); allocate(rr); }
    private native void allocate(@Const @ByRef RotatedRect rr);
// #endif
// #ifdef __cplusplus
    public native @ByVal @Name("operator cv::RotatedRect") RotatedRect asRotatedRect();
// #endif
}