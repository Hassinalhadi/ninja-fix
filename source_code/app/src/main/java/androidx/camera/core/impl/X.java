package androidx.camera.core.impl;

import androidx.appcompat.widget.P0;
import java.util.List;

/* loaded from: classes3.dex */
public final class X {
    public final P alpha;
    public final Z bravo;
    public final C0509g charlie;
    public final List delta;
    public boolean echo = false;
    public boolean foxtrot = false;

    public X(P p4, Z z2, C0509g c0509g, List list) {
        this.alpha = p4;
        this.bravo = z2;
        this.charlie = c0509g;
        this.delta = list;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
        sb2.append(this.alpha);
        sb2.append(", mUseCaseConfig=");
        sb2.append(this.bravo);
        sb2.append(", mStreamSpec=");
        sb2.append(this.charlie);
        sb2.append(", mCaptureTypes=");
        sb2.append(this.delta);
        sb2.append(", mAttached=");
        sb2.append(this.echo);
        sb2.append(", mActive=");
        return P0.gray(sb2, this.foxtrot, '}');
    }
}
