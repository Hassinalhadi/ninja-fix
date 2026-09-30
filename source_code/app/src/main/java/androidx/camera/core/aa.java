package androidx.camera.core;

import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.Y;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.b0;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class aa implements Y {
    public final /* synthetic */ int alpha;
    public final androidx.camera.core.impl.aw bravo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aa(int i4) {
        this(androidx.camera.core.impl.aw.bravo(), 0);
        this.alpha = i4;
        switch (i4) {
            case 1:
                this(androidx.camera.core.impl.aw.bravo(), 1);
                return;
            default:
                return;
        }
    }

    @Override // androidx.camera.core.u
    public final androidx.camera.core.impl.av alpha() {
        switch (this.alpha) {
            case 0:
                return this.bravo;
            case 1:
                return this.bravo;
            default:
                return this.bravo;
        }
    }

    @Override // androidx.camera.core.impl.Y
    public final Z bravo() {
        switch (this.alpha) {
            case 0:
                return new androidx.camera.core.impl.al(androidx.camera.core.impl.B.alpha(this.bravo));
            case 1:
                return new androidx.camera.core.impl.C(androidx.camera.core.impl.B.alpha(this.bravo));
            default:
                return new bn.d(androidx.camera.core.impl.B.alpha(this.bravo));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.camera.core.O, androidx.camera.core.az] */
    public az charlie() {
        androidx.camera.core.impl.C c3 = new androidx.camera.core.impl.C(androidx.camera.core.impl.B.alpha(this.bravo));
        androidx.camera.core.impl.ao.echo(c3);
        ?? o5 = new O(c3);
        o5.papa = az.whiskey;
        return o5;
    }

    public aa(androidx.camera.core.impl.aw awVar, int i4) {
        Object obj;
        Object obj2;
        Object obj3;
        this.alpha = i4;
        switch (i4) {
            case 1:
                this.bravo = awVar;
                Object obj4 = null;
                try {
                    obj = awVar.quebec(bf.j.cyan);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                if (cls != null && !cls.equals(az.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                this.bravo.hotel(Z.beige, b0.purple);
                C0505c c0505c = bf.j.cyan;
                androidx.camera.core.impl.aw awVar2 = this.bravo;
                awVar2.hotel(c0505c, az.class);
                try {
                    obj4 = awVar2.quebec(bf.j.crimson);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj4 == null) {
                    this.bravo.hotel(bf.j.crimson, az.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                Object obj5 = -1;
                try {
                    obj5 = awVar.quebec(androidx.camera.core.impl.ap.november);
                } catch (IllegalArgumentException unused3) {
                }
                if (((Integer) obj5).intValue() == -1) {
                    awVar.hotel(androidx.camera.core.impl.ap.november, 2);
                    return;
                }
                return;
            case 2:
                this.bravo = awVar;
                Object obj6 = null;
                try {
                    obj2 = awVar.quebec(bf.j.cyan);
                } catch (IllegalArgumentException unused4) {
                    obj2 = null;
                }
                Class cls2 = (Class) obj2;
                if (cls2 != null && !cls2.equals(bn.c.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                this.bravo.hotel(Z.beige, b0.teal);
                C0505c c0505c2 = bf.j.cyan;
                androidx.camera.core.impl.aw awVar3 = this.bravo;
                awVar3.hotel(c0505c2, bn.c.class);
                try {
                    obj6 = awVar3.quebec(bf.j.crimson);
                } catch (IllegalArgumentException unused5) {
                }
                if (obj6 == null) {
                    awVar3.hotel(bf.j.crimson, bn.c.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.bravo = awVar;
                Object obj7 = null;
                try {
                    obj3 = awVar.quebec(bf.j.cyan);
                } catch (IllegalArgumentException unused6) {
                    obj3 = null;
                }
                Class cls3 = (Class) obj3;
                if (cls3 != null && !cls3.equals(ad.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls3);
                }
                this.bravo.hotel(Z.beige, b0.red);
                C0505c c0505c3 = bf.j.cyan;
                androidx.camera.core.impl.aw awVar4 = this.bravo;
                awVar4.hotel(c0505c3, ad.class);
                try {
                    obj7 = awVar4.quebec(bf.j.crimson);
                } catch (IllegalArgumentException unused7) {
                }
                if (obj7 == null) {
                    awVar4.hotel(bf.j.crimson, ad.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }
}
