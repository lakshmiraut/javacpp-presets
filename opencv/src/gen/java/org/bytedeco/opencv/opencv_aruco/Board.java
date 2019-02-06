// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_aruco;

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

import static org.bytedeco.opencv.global.opencv_aruco.*;




/**
 * \brief Board of markers
 *
 * A board is a set of markers in the 3D space with a common cordinate system.
 * The common form of a board of marker is a planar (2D) board, however any 3D layout can be used.
 * A Board object is composed by:
 * - The object points of the marker corners, i.e. their coordinates respect to the board system.
 * - The dictionary which indicates the type of markers of the board
 * - The identifier of all the markers in the board.
 */
@Namespace("cv::aruco") @Properties(inherit = org.bytedeco.opencv.presets.opencv_aruco.class)
public class Board extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Board() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Board(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Board(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Board position(long position) {
        return (Board)super.position(position);
    }

    /**
    * \brief Provide way to create Board by passing nessesary data. Specially needed in Python.
    *
    * @param objPoints array of object points of all the marker corners in the board
    * @param dictionary the dictionary of markers employed for this board
    * @param ids vector of the identifiers of the markers in the board
    *
    */
    public static native @Ptr Board create(@ByVal MatVector objPoints, @Ptr Dictionary dictionary, @ByVal Mat ids);
    public static native @Ptr Board create(@ByVal UMatVector objPoints, @Ptr Dictionary dictionary, @ByVal Mat ids);
    public static native @Ptr Board create(@ByVal GpuMatVector objPoints, @Ptr Dictionary dictionary, @ByVal Mat ids);
    public static native @Ptr Board create(@ByVal MatVector objPoints, @Ptr Dictionary dictionary, @ByVal UMat ids);
    public static native @Ptr Board create(@ByVal UMatVector objPoints, @Ptr Dictionary dictionary, @ByVal UMat ids);
    public static native @Ptr Board create(@ByVal GpuMatVector objPoints, @Ptr Dictionary dictionary, @ByVal UMat ids);
    public static native @Ptr Board create(@ByVal MatVector objPoints, @Ptr Dictionary dictionary, @ByVal GpuMat ids);
    public static native @Ptr Board create(@ByVal UMatVector objPoints, @Ptr Dictionary dictionary, @ByVal GpuMat ids);
    public static native @Ptr Board create(@ByVal GpuMatVector objPoints, @Ptr Dictionary dictionary, @ByVal GpuMat ids);
    /** array of object points of all the marker corners in the board
     *  each marker include its 4 corners in CCW order. For M markers, the size is Mx4. */
    public native @ByRef Point3fVectorVector objPoints(); public native Board objPoints(Point3fVectorVector objPoints);

    /** the dictionary of markers employed for this board */
    public native @Ptr Dictionary dictionary(); public native Board dictionary(Dictionary dictionary);

    /** vector of the identifiers of the markers in the board (same size than objPoints)
     *  The identifiers refers to the board dictionary */
    public native @StdVector IntPointer ids(); public native Board ids(IntPointer ids);
}