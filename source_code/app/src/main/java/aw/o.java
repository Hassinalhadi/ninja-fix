package aw;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import s6.T7;

/* loaded from: classes3.dex */
public class o extends m {
    public o(int i4, Surface surface) {
        super(new n(new OutputConfiguration(i4, surface)));
    }

    @Override // aw.m, aw.k, aw.r
    public Object charlie() {
        Object obj = this.alpha;
        T7.charlie(obj instanceof n);
        return ((n) obj).alpha;
    }

    @Override // aw.m, aw.k, aw.r
    public final String delta() {
        return null;
    }

    @Override // aw.m, aw.k, aw.r
    public void golf(long j5) {
        ((n) this.alpha).bravo = j5;
    }

    @Override // aw.m, aw.k, aw.r
    public final void india(String str) {
        ((OutputConfiguration) charlie()).setPhysicalCameraId(str);
    }
}
