// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xfeatures2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;

import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;


/*
 * BRIEF Descriptor
 */

/** \brief Class for computing BRIEF descriptors described in \cite calon2010 .
<p>
@param bytes legth of the descriptor in bytes, valid values are: 16, 32 (default) or 64 .
@param use_orientation sample patterns using keypoints orientation, disabled by default.
 <p>
 */
@Namespace("cv::xfeatures2d") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class BriefDescriptorExtractor extends Feature2D {
    static { Loader.load(); }
    /** Default native constructor. */
    public BriefDescriptorExtractor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BriefDescriptorExtractor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BriefDescriptorExtractor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BriefDescriptorExtractor position(long position) {
        return (BriefDescriptorExtractor)super.position(position);
    }

    public static native @Ptr BriefDescriptorExtractor create( int bytes/*=32*/, @Cast("bool") boolean use_orientation/*=false*/ );
    public static native @Ptr BriefDescriptorExtractor create( );
}