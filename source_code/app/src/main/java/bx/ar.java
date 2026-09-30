package bx;

import bz.AbstractC0779d;
import bz.g0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ar {
    public static final g0 alpha = new g0(w.yellow, w.f3430c);
    public static final bz.I bravo = AbstractC0779d.juliet(400.0f, null, 5);
    public static final bz.I charlie;
    public static final bz.I delta;

    static {
        long j5 = 1;
        long j6 = (j5 & 4294967295L) | (j5 << 32);
        charlie = AbstractC0779d.juliet(400.0f, new Q0.k(j6), 1);
        delta = AbstractC0779d.juliet(400.0f, new Q0.m(j6), 1);
    }

    public static ay alpha(bz.I i4, int i5) {
        T.k kVar;
        if ((i5 & 1) != 0) {
            long j5 = 1;
            i4 = AbstractC0779d.juliet(400.0f, new Q0.m((j5 & 4294967295L) | (j5 << 32)), 1);
        }
        T.j jVar = T.d.e;
        if (Intrinsics.areEqual(jVar, T.d.f2060c)) {
            kVar = T.d.purple;
        } else if (Intrinsics.areEqual(jVar, jVar)) {
            kVar = T.d.f2058a;
        } else {
            kVar = T.d.teal;
        }
        return new ay(new M((B) null, new ac(kVar, new aq(0, w.f3432f), i4), (E) null, (LinkedHashMap) null, 59));
    }

    public static ay bravo(bz.aa aaVar, int i4) {
        if ((i4 & 1) != 0) {
            aaVar = AbstractC0779d.juliet(400.0f, null, 5);
        }
        return new ay(new M(new B(aaVar), (ac) null, (E) null, (LinkedHashMap) null, 62));
    }

    public static A charlie(bz.aa aaVar, int i4) {
        if ((i4 & 1) != 0) {
            aaVar = AbstractC0779d.juliet(400.0f, null, 5);
        }
        return new A(new M(new B(aaVar), (ac) null, (E) null, (LinkedHashMap) null, 62));
    }

    public static A delta(bz.I i4, int i5) {
        T.k kVar;
        if ((i5 & 1) != 0) {
            long j5 = 1;
            i4 = AbstractC0779d.juliet(400.0f, new Q0.m((j5 & 4294967295L) | (j5 << 32)), 1);
        }
        T.j jVar = T.d.e;
        if (Intrinsics.areEqual(jVar, T.d.f2060c)) {
            kVar = T.d.purple;
        } else if (Intrinsics.areEqual(jVar, jVar)) {
            kVar = T.d.f2058a;
        } else {
            kVar = T.d.teal;
        }
        return new A(new M((B) null, new ac(kVar, new aq(1, w.f3434h), i4), (E) null, (LinkedHashMap) null, 59));
    }
}
