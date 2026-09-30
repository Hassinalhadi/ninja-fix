package t6;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2316H;
import pe.AbstractC2340p;
import pe.C2339o;

/* loaded from: classes2.dex */
public abstract class L3 {
    public static boolean alpha(androidx.camera.camera2.internal.compat.q qVar, String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) qVar.bravo(str).alpha(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i4 : iArr) {
                    if (i4 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(N3.bravo(e));
        }
    }

    public static final C2339o bravo(AbstractC2316H abstractC2316H) {
        Intrinsics.echo(abstractC2316H, "<this>");
        C2339o c2339o = (C2339o) ye.s.delta.get(abstractC2316H);
        if (c2339o == null) {
            return AbstractC2340p.foxtrot(abstractC2316H);
        }
        return c2339o;
    }
}
