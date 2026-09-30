package Ce;

import android.hardware.camera2.CameraCaptureSession;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y {
    public final boolean alpha;
    public final List bravo;

    public y(boolean z2) {
        this.bravo = Collections.synchronizedList(new ArrayList());
        this.alpha = z2;
    }

    public CameraCaptureSession.CaptureCallback alpha(CameraCaptureSession.CaptureCallback captureCallback) {
        if (this.alpha) {
            androidx.camera.camera2.internal.compat.e eVar = new androidx.camera.camera2.internal.compat.e(3);
            List list = this.bravo;
            V0.k kVar = (V0.k) eVar.charlie;
            list.add(kVar);
            Log.d("RequestMonitor", "RequestListener " + eVar + " monitoring " + this);
            kVar.purple.foxtrot(new A2.s(this, eVar, kVar, 17), tg.k.bravo());
            return new av.v(Arrays.asList(eVar, captureCallback));
        }
        return captureCallback;
    }

    public com.google.common.util.concurrent.e bravo() {
        List list = this.bravo;
        if (list.isEmpty()) {
            return be.j.red;
        }
        be.k kVar = new be.k(new ArrayList(new ArrayList(list)), false, tg.k.bravo());
        S7.a aVar = new S7.a(13);
        return be.h.delta(be.h.foxtrot(kVar, new androidx.core.widget.f(11, aVar), tg.k.bravo()));
    }

    public void charlie() {
        LinkedList linkedList = new LinkedList(this.bravo);
        while (!linkedList.isEmpty()) {
            com.google.common.util.concurrent.e eVar = (com.google.common.util.concurrent.e) linkedList.poll();
            Objects.requireNonNull(eVar);
            eVar.cancel(true);
        }
    }

    public y(List descriptors, boolean z2) {
        Intrinsics.echo(descriptors, "descriptors");
        this.bravo = descriptors;
        this.alpha = z2;
    }
}
