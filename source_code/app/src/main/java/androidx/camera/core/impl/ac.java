package androidx.camera.core.impl;

import ae.AbstractC0422a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.C0533o;
import java.util.LinkedHashSet;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public abstract class ac {
    public static final C0533o alpha;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new as(2));
        alpha = new C0533o(linkedHashSet);
    }

    public static void alpha(Context context, J2.l lVar, C0533o c0533o) {
        Integer bravo;
        int i4 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && AbstractC0422a.foxtrot(context) != 0) {
            LinkedHashSet india = lVar.india();
            if (!india.isEmpty()) {
                AbstractC3066u3.bravo("CameraValidator", "Virtual device with ID: " + AbstractC0422a.foxtrot(context) + " has " + india.size() + " cameras. Skipping validation.");
                return;
            }
            throw new CameraValidator$CameraIdListIncorrectException("No cameras available", 0, null);
        }
        if (c0533o != null) {
            try {
                bravo = c0533o.bravo();
                if (bravo == null) {
                    AbstractC3066u3.india("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                AbstractC3066u3.delta("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            bravo = null;
        }
        AbstractC3066u3.bravo("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + bravo);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                if (c0533o != null) {
                    if (bravo.intValue() == 1) {
                    }
                }
                C0533o.charlie.charlie(lVar.india());
                i4 = 1;
            }
        } catch (IllegalArgumentException e4) {
            illegalArgumentException = e4;
            AbstractC3066u3.juliet("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (c0533o != null) {
                    if (bravo.intValue() == 0) {
                    }
                }
                C0533o.bravo.charlie(lVar.india());
                i4++;
            }
        } catch (IllegalArgumentException e5) {
            illegalArgumentException = e5;
            AbstractC3066u3.juliet("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            alpha.charlie(lVar.india());
            AbstractC3066u3.bravo("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i4++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        AbstractC3066u3.charlie("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + lVar.india());
        throw new CameraValidator$CameraIdListIncorrectException("Expected camera missing from device.", i4, illegalArgumentException);
    }
}
