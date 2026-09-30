package aw;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import s6.T7;

/* loaded from: classes3.dex */
public class k extends r {
    public k(int i4, Surface surface) {
        super(new j(new OutputConfiguration(i4, surface)));
    }

    @Override // aw.r
    public void bravo() {
        ((j) this.alpha).charlie = true;
    }

    @Override // aw.r
    public Object charlie() {
        Object obj = this.alpha;
        T7.charlie(obj instanceof j);
        return ((j) obj).alpha;
    }

    @Override // aw.r
    public String delta() {
        return ((j) this.alpha).bravo;
    }

    @Override // aw.r
    public final Surface echo() {
        return ((OutputConfiguration) charlie()).getSurface();
    }

    @Override // aw.r
    public boolean foxtrot() {
        return ((j) this.alpha).charlie;
    }

    @Override // aw.r
    public void golf(long j5) {
        ((j) this.alpha).delta = j5;
    }

    @Override // aw.r
    public void india(String str) {
        ((j) this.alpha).bravo = str;
    }
}
