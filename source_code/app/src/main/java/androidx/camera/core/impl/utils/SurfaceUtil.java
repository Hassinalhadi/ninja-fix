package androidx.camera.core.impl.utils;

import android.view.Surface;
import g8.d;

/* loaded from: classes3.dex */
public abstract class SurfaceUtil {
    static {
        System.loadLibrary("surface_util_jni");
    }

    public static d alpha(Surface surface) {
        int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        d dVar = new d(17);
        int i4 = nativeGetSurfaceInfo[0];
        int i5 = nativeGetSurfaceInfo[1];
        int i10 = nativeGetSurfaceInfo[2];
        return dVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
