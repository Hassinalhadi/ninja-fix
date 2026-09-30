package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class j {
    public final O7.l bravo;
    public final String charlie;
    public final HashMap alpha = new HashMap();
    public J2.t delta = null;

    public j(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.bravo = new O7.l(22, cameraCharacteristics);
        } else {
            this.bravo = new O7.l(22, cameraCharacteristics);
        }
        this.charlie = str;
    }

    public final Object alpha(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.bravo.purple).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.alpha.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.bravo.purple).get(key);
                if (obj2 != null) {
                    this.alpha.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, J2.t] */
    public final J2.t bravo() {
        if (this.delta == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) alpha(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap != null) {
                    J2.c cVar = new J2.c(this.charlie, 23);
                    ?? obj = new Object();
                    obj.red = new HashMap();
                    new HashMap();
                    new HashMap();
                    obj.alpha = new O7.j(25, streamConfigurationMap);
                    obj.purple = cVar;
                    this.delta = obj;
                } else {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
            } catch (AssertionError | NullPointerException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.delta;
    }
}
