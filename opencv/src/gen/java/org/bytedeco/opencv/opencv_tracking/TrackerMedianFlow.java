// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;


/** \brief the Median Flow tracker
<p>
Implementation of a paper \cite MedianFlow .
<p>
The tracker is suitable for very smooth and predictable movements when object is visible throughout
the whole sequence. It's quite and accurate for this type of problems (in particular, it was shown
by authors to outperform MIL). During the implementation period the code at
<http://www.aonsquared.co.uk/node/5>, the courtesy of the author Arthur Amarra, was used for the
reference purpose.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerMedianFlow extends Tracker {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerMedianFlow(Pointer p) { super(p); }

  @NoOffset public static class Params extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Params(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Params(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Params position(long position) {
          return (Params)super.position(position);
      }
  
    /**default constructor
     * note that the default values of parameters are recommended for most of use cases */
    public Params() { super((Pointer)null); allocate(); }
    private native void allocate();
    /**square root of number of keypoints used; increase it to trade
     * accurateness for speed */
    public native int pointsInGrid(); public native Params pointsInGrid(int pointsInGrid);
    /**window size parameter for Lucas-Kanade optical flow */
    public native @ByRef Size winSize(); public native Params winSize(Size winSize);
    /**maximal pyramid level number for Lucas-Kanade optical flow */
    public native int maxLevel(); public native Params maxLevel(int maxLevel);
    /**termination criteria for Lucas-Kanade optical flow */
    public native @ByRef TermCriteria termCriteria(); public native Params termCriteria(TermCriteria termCriteria);
    /**window size around a point for normalized cross-correlation check */
    public native @ByRef Size winSizeNCC(); public native Params winSizeNCC(Size winSizeNCC);
    /**criterion for loosing the tracked object */
    public native double maxMedianLengthOfDisplacementDifference(); public native Params maxMedianLengthOfDisplacementDifference(double maxMedianLengthOfDisplacementDifference);

    public native void read( @Const @ByRef FileNode arg0 );
    public native void write( @ByRef FileStorage arg0 );
  }

  /** \brief Constructor
    @param parameters Median Flow parameters TrackerMedianFlow::Params
    */
  public static native @Ptr TrackerMedianFlow create(@Const @ByRef Params parameters);

  public static native @Ptr TrackerMedianFlow create();
}