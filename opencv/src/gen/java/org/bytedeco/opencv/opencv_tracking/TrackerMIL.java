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


/************************************ Specific Tracker Classes ************************************/

/** \brief The MIL algorithm trains a classifier in an online manner to separate the object from the
background.
<p>
Multiple Instance Learning avoids the drift problem for a robust tracking. The implementation is
based on \cite MIL .
<p>
Original code can be found here <http://vision.ucsd.edu/~bbabenko/project_miltrack.shtml>
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerMIL extends Tracker {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerMIL(Pointer p) { super(p); }

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
  
    public Params() { super((Pointer)null); allocate(); }
    private native void allocate();
    //parameters for sampler
    /** radius for gathering positive instances during init */
    public native float samplerInitInRadius(); public native Params samplerInitInRadius(float samplerInitInRadius);
    /** # negative samples to use during init */
    public native int samplerInitMaxNegNum(); public native Params samplerInitMaxNegNum(int samplerInitMaxNegNum);
    /** size of search window */
    public native float samplerSearchWinSize(); public native Params samplerSearchWinSize(float samplerSearchWinSize);
    /** radius for gathering positive instances during tracking */
    public native float samplerTrackInRadius(); public native Params samplerTrackInRadius(float samplerTrackInRadius);
    /** # positive samples to use during tracking */
    public native int samplerTrackMaxPosNum(); public native Params samplerTrackMaxPosNum(int samplerTrackMaxPosNum);
    /** # negative samples to use during tracking */
    public native int samplerTrackMaxNegNum(); public native Params samplerTrackMaxNegNum(int samplerTrackMaxNegNum);
    /** # features */
    public native int featureSetNumFeatures(); public native Params featureSetNumFeatures(int featureSetNumFeatures);

    public native void read( @Const @ByRef FileNode fn );
    public native void write( @ByRef FileStorage fs );
  }

  /** \brief Constructor
    @param parameters MIL parameters TrackerMIL::Params
     */
  public static native @Ptr TrackerMIL create(@Const @ByRef Params parameters);

  public static native @Ptr TrackerMIL create();
}