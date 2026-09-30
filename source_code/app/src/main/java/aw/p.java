package aw;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import s6.T7;

/* loaded from: classes3.dex */
public final class p extends o {
    public p(int i4, Surface surface) {
        super(new OutputConfiguration(i4, surface));
    }

    @Override // aw.o, aw.m, aw.k, aw.r
    public final Object charlie() {
        Object obj = this.alpha;
        T7.charlie(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // aw.o, aw.m, aw.k, aw.r
    public final void golf(long j5) {
        ((OutputConfiguration) charlie()).setDynamicRangeProfile(j5);
    }

    @Override // aw.r
    public final void hotel(int i4) {
        ((OutputConfiguration) charlie()).setMirrorMode(i4);
    }

    @Override // aw.r
    public final void juliet(long j5) {
        if (j5 == -1) {
            return;
        }
        ((OutputConfiguration) charlie()).setStreamUseCase(j5);
    }
}
