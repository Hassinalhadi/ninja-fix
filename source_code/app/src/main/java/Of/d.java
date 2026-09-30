package Of;

import Pf.ag;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.internal.C1473v;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public abstract class d {
    public static final c delta = new d(new k(false, false, false, false, true, "    ", Constants.KEY_TYPE, false, true, a.purple), kotlinx.serialization.modules.a.alpha);
    public final k alpha;
    public final C1473v bravo;
    public final O7.j charlie = new O7.j(3);

    public d(k kVar, C1473v c1473v) {
        this.alpha = kVar;
        this.bravo = c1473v;
    }

    public final String alpha(KSerializer serializer, Object obj) {
        char[] cArr;
        Object removeLast;
        Intrinsics.echo(serializer, "serializer");
        Fe.c cVar = new Fe.c(2, false);
        Pf.f fVar = Pf.f.red;
        synchronized (fVar) {
            kotlin.collections.l lVar = (kotlin.collections.l) fVar.purple;
            cArr = null;
            if (lVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = lVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                fVar.alpha -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        cVar.red = cArr;
        try {
            new Pf.ac(new Pf.j(0, cVar), this, ag.red, new Pf.ac[ag.f1911a.alpha()]).oscar(serializer, obj);
            return cVar.toString();
        } finally {
            cVar.india();
        }
    }
}
