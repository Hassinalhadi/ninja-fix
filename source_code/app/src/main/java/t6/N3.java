package t6;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import m.C2093f;
import z.AbstractC3450d;
import z.C3449c;

/* loaded from: classes2.dex */
public abstract class N3 {
    public static final void alpha(T.s sVar, C2093f c2093f, float f5, P.d dVar, InterfaceC0581m interfaceC0581m) {
        long charlie = ((C3449c) ((C0585q) interfaceC0581m).kilo(AbstractC3450d.alpha)).charlie();
        P3.alpha(sVar, c2093f, charlie, AbstractC3450d.alpha(charlie, interfaceC0581m), f5, dVar, interfaceC0581m, 1769472, 0);
    }

    public static CameraUnavailableException bravo(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int reason = cameraAccessExceptionCompat.getReason();
        int i4 = 1;
        if (reason != 1) {
            i4 = 2;
            if (reason != 2) {
                i4 = 3;
                if (reason != 3) {
                    i4 = 4;
                    if (reason != 4) {
                        i4 = 5;
                        if (reason != 5) {
                            if (reason != 10001) {
                                i4 = 0;
                            } else {
                                i4 = 6;
                            }
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i4, cameraAccessExceptionCompat);
    }
}
