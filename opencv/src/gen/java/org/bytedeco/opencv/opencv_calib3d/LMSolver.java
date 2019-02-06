// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_calib3d;

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

import static org.bytedeco.opencv.global.opencv_calib3d.*;


/** \example samples/cpp/tutorial_code/features2D/Homography/pose_from_homography.cpp
An example program about pose estimation from coplanar points
<p>
Check \ref tutorial_homography "the corresponding tutorial" for more details
*/

/** Levenberg-Marquardt solver. Starting with the specified vector of parameters it
    optimizes the target vector criteria "err"
    (finds local minima of each target vector component absolute value).
    <p>
    When needed, it calls user-provided callback.
*/
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_calib3d.class)
public class LMSolver extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LMSolver(Pointer p) { super(p); }

    public static class Callback extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Callback(Pointer p) { super(p); }
    
        /**
         computes error and Jacobian for the specified vector of parameters
         <p>
         @param param the current vector of parameters
         @param err output vector of errors: err_i = actual_f_i - ideal_f_i
         @param J output Jacobian: J_ij = d(err_i)/d(param_j)
         <p>
         when J=noArray(), it means that it does not need to be computed.
         Dimensionality of error vector and param vector can be different.
         The callback should explicitly allocate (with "create" method) each output array
         (unless it's noArray()).
        */
        public native @Cast("bool") boolean compute(@ByVal Mat param, @ByVal Mat err, @ByVal Mat J);
        public native @Cast("bool") boolean compute(@ByVal UMat param, @ByVal UMat err, @ByVal UMat J);
        public native @Cast("bool") boolean compute(@ByVal GpuMat param, @ByVal GpuMat err, @ByVal GpuMat J);
    }

    /**
       Runs Levenberg-Marquardt algorithm using the passed vector of parameters as the start point.
       The final vector of parameters (whether the algorithm converged or not) is stored at the same
       vector. The method returns the number of iterations used. If it's equal to the previously specified
       maxIters, there is a big chance the algorithm did not converge.
       <p>
       @param param initial/final vector of parameters.
       <p>
       Note that the dimensionality of parameter space is defined by the size of param vector,
       and the dimensionality of optimized criteria is defined by the size of err vector
       computed by the callback.
    */
    public native int run(@ByVal Mat param);
    public native int run(@ByVal UMat param);
    public native int run(@ByVal GpuMat param);

    /**
       Sets the maximum number of iterations
       @param maxIters the number of iterations
    */
    public native void setMaxIters(int maxIters);
    /**
       Retrieves the current maximum number of iterations
    */
    public native int getMaxIters();

    /**
       Creates Levenberg-Marquard solver
       <p>
       @param cb callback
       @param maxIters maximum number of iterations that can be further
         modified using setMaxIters() method.
    */
    public static native @Ptr LMSolver create(@Ptr Callback cb, int maxIters);
}