// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;



/** \brief Warper that maps an image onto the unit sphere located at the origin.
 <p>
 Projects image onto unit sphere with origin at (0, 0, 0) and radius scale, measured in pixels.
 A 360 panorama would therefore have a resulting width of 2 * scale * PI pixels.
 Poles are located at (0, -1, 0) and (0, 1, 0) points.
*/
@Name("cv::detail::SphericalWarper") @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class DetailSphericalWarper extends RotationWarper {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetailSphericalWarper(Pointer p) { super(p); }

    /** \brief Construct an instance of the spherical warper class.
    <p>
    @param scale Radius of the projected sphere, in pixels. An image spanning the
                 whole sphere will have a width of 2 * scale * PI pixels.
     */
    public DetailSphericalWarper(float scale) { super((Pointer)null); allocate(scale); }
    private native void allocate(float scale);

    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal Mat K, @ByVal Mat R, @ByVal Mat xmap, @ByVal Mat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal UMat K, @ByVal UMat R, @ByVal UMat xmap, @ByVal UMat ymap);
    public native @ByVal Rect buildMaps(@ByVal Size src_size, @ByVal GpuMat K, @ByVal GpuMat R, @ByVal GpuMat xmap, @ByVal GpuMat ymap);
    public native @ByVal Point warp(@ByVal Mat src, @ByVal Mat K, @ByVal Mat R, int interp_mode, int border_mode, @ByVal Mat dst);
    public native @ByVal Point warp(@ByVal UMat src, @ByVal UMat K, @ByVal UMat R, int interp_mode, int border_mode, @ByVal UMat dst);
    public native @ByVal Point warp(@ByVal GpuMat src, @ByVal GpuMat K, @ByVal GpuMat R, int interp_mode, int border_mode, @ByVal GpuMat dst);
}