package aw;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;
import s6.T7;

/* loaded from: classes3.dex */
public final class e implements c {
    public static final androidx.core.widget.f alpha = new androidx.core.widget.f(5, new Object());
    public static final Set bravo = Collections.singleton(androidx.camera.core.t.delta);

    @Override // aw.c
    public final DynamicRangeProfiles alpha() {
        return null;
    }

    @Override // aw.c
    public final Set bravo() {
        return bravo;
    }

    @Override // aw.c
    public final Set charlie(androidx.camera.core.t tVar) {
        T7.bravo("DynamicRange is not supported: " + tVar, androidx.camera.core.t.delta.equals(tVar));
        return bravo;
    }
}
