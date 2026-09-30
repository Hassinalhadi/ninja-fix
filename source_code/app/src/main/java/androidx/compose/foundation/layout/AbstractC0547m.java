package androidx.compose.foundation.layout;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: androidx.compose.foundation.layout.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0547m {
    public static final bv.al alpha = charlie(true);
    public static final bv.al bravo = charlie(false);
    public static final C0546l charlie;

    static {
        new C0549o(T.d.alpha, false);
        charlie = C0546l.bravo;
    }

    public static final void alpha(T.s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-211209833);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            long j5 = c0585q.magenta;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            T.s charlie2 = T.a.charlie(sVar, c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, charlie);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ao.ad.blue(i11, c0585q, i11, c2549i);
            }
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0545k(sVar, i4);
        }
    }

    public static final void bravo(AbstractC2366B abstractC2366B, AbstractC2367C abstractC2367C, q0.ao aoVar, Q0.n nVar, int i4, int i5, T.f fVar) {
        C0544j c0544j;
        T.f fVar2;
        T.k kVar;
        Object yankee = aoVar.yankee();
        if (yankee instanceof C0544j) {
            c0544j = (C0544j) yankee;
        } else {
            c0544j = null;
        }
        if (c0544j != null && (kVar = c0544j.alpha) != null) {
            fVar2 = kVar;
        } else {
            fVar2 = fVar;
        }
        AbstractC2366B.india(abstractC2366B, abstractC2367C, fVar2.alpha((abstractC2367C.alpha << 32) | (abstractC2367C.purple & 4294967295L), (i4 << 32) | (i5 & 4294967295L), nVar));
    }

    public static final bv.al charlie(boolean z2) {
        bv.al alVar = new bv.al(9);
        T.k kVar = T.d.alpha;
        alVar.mike(kVar, new C0549o(kVar, z2));
        T.k kVar2 = T.d.purple;
        alVar.mike(kVar2, new C0549o(kVar2, z2));
        T.k kVar3 = T.d.red;
        alVar.mike(kVar3, new C0549o(kVar3, z2));
        T.k kVar4 = T.d.silver;
        alVar.mike(kVar4, new C0549o(kVar4, z2));
        T.k kVar5 = T.d.teal;
        alVar.mike(kVar5, new C0549o(kVar5, z2));
        T.k kVar6 = T.d.white;
        alVar.mike(kVar6, new C0549o(kVar6, z2));
        T.k kVar7 = T.d.yellow;
        alVar.mike(kVar7, new C0549o(kVar7, z2));
        T.k kVar8 = T.d.f2058a;
        alVar.mike(kVar8, new C0549o(kVar8, z2));
        T.k kVar9 = T.d.f2059b;
        alVar.mike(kVar9, new C0549o(kVar9, z2));
        return alVar;
    }

    public static final q0.ap delta(T.f fVar, boolean z2) {
        bv.al alVar;
        if (z2) {
            alVar = alpha;
        } else {
            alVar = bravo;
        }
        q0.ap apVar = (q0.ap) alVar.golf(fVar);
        if (apVar == null) {
            return new C0549o(fVar, z2);
        }
        return apVar;
    }
}
