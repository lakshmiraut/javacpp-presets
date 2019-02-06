// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #endif


/************************************* CvScalar *****************************************/
/** @see Scalar_
 */
@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvScalar extends AbstractCvScalar {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvScalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvScalar(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvScalar position(long position) {
        return (CvScalar)super.position(position);
    }

    public native double val(int i); public native CvScalar val(int i, double val);
    @MemberGetter public native DoublePointer val();

// #ifdef CV__VALIDATE_UNUNITIALIZED_VARS
    public CvScalar() { super((Pointer)null); allocate(); }
    private native void allocate();
// #elif defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus)
    public CvScalar(double d0, double d1/*=0*/, double d2/*=0*/, double d3/*=0*/) { super((Pointer)null); allocate(d0, d1, d2, d3); }
    private native void allocate(double d0, double d1/*=0*/, double d2/*=0*/, double d3/*=0*/);
    public CvScalar(double d0) { super((Pointer)null); allocate(d0); }
    private native void allocate(double d0);
// #endif
// #ifdef __cplusplus
// #endif
}