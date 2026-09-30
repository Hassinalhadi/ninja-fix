package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.Z;

/* loaded from: classes3.dex */
public final class ab {
    public static final androidx.camera.core.impl.al alpha;

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, bm.c] */
    static {
        Object size = new Size(640, 480);
        t tVar = t.delta;
        bm.a aVar = bm.a.alpha;
        Size size2 = bi.b.bravo;
        ?? obj = new Object();
        obj.alpha = size2;
        obj.bravo = 1;
        Object bVar = new bm.b(aVar, obj, null);
        aa aaVar = new aa(0);
        C0505c c0505c = androidx.camera.core.impl.ap.papa;
        androidx.camera.core.impl.aw awVar = aaVar.bravo;
        awVar.hotel(c0505c, size);
        awVar.hotel(Z.yankee, 1);
        awVar.hotel(androidx.camera.core.impl.ap.kilo, 0);
        awVar.hotel(androidx.camera.core.impl.ap.sierra, bVar);
        if (tVar.equals(tVar)) {
            awVar.hotel(androidx.camera.core.impl.an.juliet, tVar);
            alpha = new androidx.camera.core.impl.al(androidx.camera.core.impl.B.alpha(awVar));
            return;
        }
        throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
    }
}
