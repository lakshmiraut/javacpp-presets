// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class MatStep extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatStep(Pointer p) { super(p); }

    public MatStep() { super((Pointer)null); allocate(); }
    private native void allocate();
    public MatStep(@Cast("size_t") long s) { super((Pointer)null); allocate(s); }
    private native void allocate(@Cast("size_t") long s);
    public native @Cast("size_t*") @ByRef @Name("operator []") SizeTPointer get(int i);
    public native @Cast("size_t") @Name("operator size_t") long asLong();
    public native @ByRef @Name("operator =") MatStep put(@Cast("size_t") long s);

    public native @Cast("size_t*") SizeTPointer p(); public native MatStep p(SizeTPointer p);
    public native @Cast("size_t") long buf(int i); public native MatStep buf(int i, long buf);
    @MemberGetter public native @Cast("size_t*") SizeTPointer buf();
}