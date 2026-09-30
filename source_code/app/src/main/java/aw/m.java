package aw;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import s6.T7;

/* loaded from: classes3.dex */
public class m extends k {
    public m(int i4, Surface surface) {
        super(new l(new OutputConfiguration(i4, surface)));
    }

    @Override // aw.r
    public final void alpha(Surface surface) {
        ((OutputConfiguration) charlie()).addSurface(surface);
    }

    @Override // aw.k, aw.r
    public final void bravo() {
        ((OutputConfiguration) charlie()).enableSurfaceSharing();
    }

    @Override // aw.k, aw.r
    public Object charlie() {
        Object obj = this.alpha;
        T7.charlie(obj instanceof l);
        return ((l) obj).alpha;
    }

    @Override // aw.k, aw.r
    public String delta() {
        return ((l) this.alpha).bravo;
    }

    @Override // aw.k, aw.r
    public final boolean foxtrot() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // aw.k, aw.r
    public void golf(long j5) {
        ((l) this.alpha).charlie = j5;
    }

    @Override // aw.k, aw.r
    public void india(String str) {
        ((l) this.alpha).bravo = str;
    }
}
