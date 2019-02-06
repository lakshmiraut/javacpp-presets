// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_video;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
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

import static org.bytedeco.opencv.global.opencv_video.*;


/** \brief Base interface for sparse optical flow algorithms.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_video.class)
public class SparseOpticalFlow extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseOpticalFlow(Pointer p) { super(p); }

    /** \brief Calculates a sparse optical flow.
    <p>
    @param prevImg First input image.
    @param nextImg Second input image of the same size and the same type as prevImg.
    @param prevPts Vector of 2D points for which the flow needs to be found.
    @param nextPts Output vector of 2D points containing the calculated new positions of input features in the second image.
    @param status Output status vector. Each element of the vector is set to 1 if the
                  flow for the corresponding features has been found. Otherwise, it is set to 0.
    @param err Optional output vector that contains error response for each point (inverse confidence).
     */
    public native void calc(@ByVal Mat prevImg, @ByVal Mat nextImg,
                          @ByVal Mat prevPts, @ByVal Mat nextPts,
                          @ByVal Mat status,
                          @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat err);
    public native void calc(@ByVal Mat prevImg, @ByVal Mat nextImg,
                          @ByVal Mat prevPts, @ByVal Mat nextPts,
                          @ByVal Mat status);
    public native void calc(@ByVal UMat prevImg, @ByVal UMat nextImg,
                          @ByVal UMat prevPts, @ByVal UMat nextPts,
                          @ByVal UMat status,
                          @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat err);
    public native void calc(@ByVal UMat prevImg, @ByVal UMat nextImg,
                          @ByVal UMat prevPts, @ByVal UMat nextPts,
                          @ByVal UMat status);
    public native void calc(@ByVal GpuMat prevImg, @ByVal GpuMat nextImg,
                          @ByVal GpuMat prevPts, @ByVal GpuMat nextPts,
                          @ByVal GpuMat status,
                          @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat err);
    public native void calc(@ByVal GpuMat prevImg, @ByVal GpuMat nextImg,
                          @ByVal GpuMat prevPts, @ByVal GpuMat nextPts,
                          @ByVal GpuMat status);
}