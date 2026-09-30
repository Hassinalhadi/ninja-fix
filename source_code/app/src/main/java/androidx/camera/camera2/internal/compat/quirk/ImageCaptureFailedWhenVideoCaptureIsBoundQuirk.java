package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.D;

/* loaded from: classes3.dex */
public class ImageCaptureFailedWhenVideoCaptureIsBoundQuirk implements CaptureIntentPreviewQuirk, D {
    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public final boolean alpha() {
        String str = Build.BRAND;
        if (!"blu".equalsIgnoreCase(str) || !"studio x10".equalsIgnoreCase(Build.MODEL)) {
            if (!"itel".equalsIgnoreCase(str) || !"itel w6004".equalsIgnoreCase(Build.MODEL)) {
                if (!"vivo".equalsIgnoreCase(str) || !"vivo 1805".equalsIgnoreCase(Build.MODEL)) {
                    if ("positivo".equalsIgnoreCase(str) && "twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
