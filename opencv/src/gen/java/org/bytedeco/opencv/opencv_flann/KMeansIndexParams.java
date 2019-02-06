// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_flann;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_flann.*;


@Namespace("cv::flann") @Properties(inherit = org.bytedeco.opencv.presets.opencv_flann.class)
public class KMeansIndexParams extends IndexParams {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KMeansIndexParams(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public KMeansIndexParams(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public KMeansIndexParams position(long position) {
        return (KMeansIndexParams)super.position(position);
    }

    public KMeansIndexParams(int branching/*=32*/, int iterations/*=11*/,
                          @Cast("cvflann::flann_centers_init_t") int centers_init/*=cvflann::FLANN_CENTERS_RANDOM*/, float cb_index/*=0.2f*/ ) { super((Pointer)null); allocate(branching, iterations, centers_init, cb_index); }
    private native void allocate(int branching/*=32*/, int iterations/*=11*/,
                          @Cast("cvflann::flann_centers_init_t") int centers_init/*=cvflann::FLANN_CENTERS_RANDOM*/, float cb_index/*=0.2f*/ );
    public KMeansIndexParams( ) { super((Pointer)null); allocate(); }
    private native void allocate( );
}