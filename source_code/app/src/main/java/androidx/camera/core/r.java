package androidx.camera.core;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.Y;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.b0;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class r implements Y, u {
    public final /* synthetic */ int alpha;
    public final androidx.camera.core.impl.aw bravo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(int i4) {
        this(androidx.camera.core.impl.aw.bravo());
        Object obj;
        this.alpha = i4;
        switch (i4) {
            case 1:
                return;
            case 2:
                this.bravo = androidx.camera.core.impl.aw.bravo();
                return;
            case 3:
                this.bravo = androidx.camera.core.impl.aw.bravo();
                return;
            default:
                androidx.camera.core.impl.aw bravo = androidx.camera.core.impl.aw.bravo();
                this.bravo = bravo;
                Object obj2 = null;
                try {
                    obj = bravo.quebec(bf.j.cyan);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                if (cls != null && !cls.equals(q.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                C0505c c0505c = bf.j.cyan;
                androidx.camera.core.impl.aw awVar = this.bravo;
                awVar.hotel(c0505c, q.class);
                try {
                    obj2 = awVar.quebec(bf.j.crimson);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 == null) {
                    awVar.hotel(bf.j.crimson, q.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    public static r delta(androidx.camera.core.impl.af afVar) {
        r rVar = new r(3);
        afVar.charlie(new A2.ao(17, rVar, afVar));
        return rVar;
    }

    @Override // androidx.camera.core.u
    public androidx.camera.core.impl.av alpha() {
        switch (this.alpha) {
            case 1:
                return this.bravo;
            case 2:
                throw null;
            default:
                throw null;
        }
    }

    @Override // androidx.camera.core.impl.Y
    public Z bravo() {
        return new androidx.camera.core.impl.am(androidx.camera.core.impl.B.alpha(this.bravo));
    }

    public av.ah charlie() {
        return new av.ah(6, androidx.camera.core.impl.B.alpha(this.bravo));
    }

    public void echo(CaptureRequest.Key key, Object obj) {
        androidx.camera.core.impl.ae aeVar = androidx.camera.core.impl.ae.purple;
        this.bravo.foxtrot(au.a.yellow(key), aeVar, obj);
    }

    public r(androidx.camera.core.impl.aw awVar) {
        Object obj;
        this.alpha = 1;
        this.bravo = awVar;
        Object obj2 = null;
        try {
            obj = awVar.quebec(bf.j.cyan);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls = (Class) obj;
        if (cls != null && !cls.equals(ao.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        this.bravo.hotel(Z.beige, b0.alpha);
        C0505c c0505c = bf.j.cyan;
        androidx.camera.core.impl.aw awVar2 = this.bravo;
        awVar2.hotel(c0505c, ao.class);
        try {
            obj2 = awVar2.quebec(bf.j.crimson);
        } catch (IllegalArgumentException unused2) {
        }
        if (obj2 == null) {
            this.bravo.hotel(bf.j.crimson, ao.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }
}
