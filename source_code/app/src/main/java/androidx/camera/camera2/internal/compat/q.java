package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;

/* loaded from: classes3.dex */
public final class q {
    public final J2.e alpha;
    public final ArrayMap bravo = new ArrayMap(4);

    public q(J2.e eVar) {
        this.alpha = eVar;
    }

    public static q alpha(Context context, Handler handler) {
        J2.e eVar;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            eVar = new J2.e(context, (J2.c) null);
        } else if (i4 >= 29) {
            eVar = new J2.e(context, (J2.c) null);
        } else if (i4 >= 28) {
            eVar = new J2.e(context, (J2.c) null);
        } else {
            eVar = new J2.e(context, new J2.c(handler));
        }
        return new q(eVar);
    }

    public final j bravo(String str) {
        j jVar;
        synchronized (this.bravo) {
            jVar = (j) this.bravo.get(str);
            if (jVar == null) {
                try {
                    j jVar2 = new j(this.alpha.C(str), str);
                    this.bravo.put(str, jVar2);
                    jVar = jVar2;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(CameraAccessExceptionCompat.CAMERA_CHARACTERISTICS_CREATION_ERROR, e.getMessage(), e);
                }
            }
        }
        return jVar;
    }
}
