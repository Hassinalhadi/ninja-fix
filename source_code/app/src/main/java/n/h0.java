package n;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.p0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import java.util.ArrayList;
import java.util.List;
import k4.C2007a;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t0.AbstractC2901T;
import t0.C2883A;

/* loaded from: classes3.dex */
public final class h0 {
    public final androidx.compose.runtime.ax alpha = C0564b.zulu(null);
    public D0.g bravo;
    public final SnapshotStateList charlie;

    public h0(D0.g gVar) {
        kd.l lVar = new kd.l(22);
        gVar.getClass();
        D0.d dVar = new D0.d(gVar);
        ArrayList arrayList = dVar.red;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            List list = (List) lVar.invoke(((D0.c) arrayList.get(i4)).alpha(RecyclerView.UNDEFINED_DURATION));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                D0.e eVar = (D0.e) list.get(i5);
                Object obj = eVar.alpha;
                arrayList3.add(new D0.c(eVar.delta, eVar.bravo, eVar.charlie, obj));
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.bravo = dVar.foxtrot();
        this.charlie = new SnapshotStateList();
    }

    public static D0.e charlie(D0.e eVar, D0.ak akVar) {
        int charlie = akVar.bravo.charlie(r3.foxtrot - 1, false);
        if (eVar.bravo >= charlie) {
            return null;
        }
        return D0.e.alpha(eVar, null, Math.min(eVar.charlie, charlie), 11);
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void alpha(InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        char c3;
        int i10;
        boolean z11;
        Object obj;
        boolean z12;
        boolean z13;
        boolean z14;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ?? r32 = 0;
        char c4 = 2;
        int i11 = 3;
        boolean z15 = true;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1154651354);
        if (c0585q.india(this)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i5 | i4;
        if ((i12 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            C2883A c2883a = (C2883A) c0585q.kilo(AbstractC2901T.romeo);
            D0.g gVar = this.bravo;
            List alpha = gVar.alpha(gVar.purple.length());
            int size = alpha.size();
            int i13 = 0;
            while (i13 < size) {
                D0.e eVar = (D0.e) alpha.get(i13);
                if (eVar.bravo != eVar.charlie) {
                    c0585q.purple(725478935);
                    Object jade = c0585q.jade();
                    androidx.compose.runtime.as asVar = C0580l.alpha;
                    Object obj6 = jade;
                    if (jade == asVar) {
                        obj6 = ao.ad.xray(c0585q);
                    }
                    InterfaceC1673j interfaceC1673j = (InterfaceC1673j) obj6;
                    c3 = c4;
                    T.s alpha2 = androidx.compose.ui.graphics.a.alpha(T.p.alpha, new C2007a(i11, this, eVar));
                    Object jade2 = c0585q.jade();
                    if (jade2 == asVar) {
                        i10 = i11;
                        kd.l lVar = new kd.l(23);
                        c0585q.f(lVar);
                        obj = lVar;
                    } else {
                        i10 = i11;
                        obj = jade2;
                    }
                    T.s hotel = androidx.compose.foundation.a.hotel(A0.o.bravo(alpha2, r32, (Function1) obj).then(new i0(new h9.an(this, eVar))), interfaceC1673j);
                    m0.o.alpha.getClass();
                    T.s foxtrot = m0.q.foxtrot(hotel, m0.q.charlie);
                    boolean india = c0585q.india(this) | c0585q.golf(eVar) | c0585q.india(c2883a);
                    Object jade3 = c0585q.jade();
                    Object obj7 = jade3;
                    if (india || jade3 == asVar) {
                        Ac.l lVar2 = new Ac.l(this, eVar, c2883a, 16);
                        c0585q.f(lVar2);
                        obj7 = lVar2;
                    }
                    AbstractC0547m.alpha(androidx.compose.foundation.a.foxtrot(foxtrot, interfaceC1673j, (Function0) obj7), c0585q, r32);
                    D0.m mVar = (D0.m) eVar.alpha;
                    D0.al alpha3 = mVar.alpha();
                    if (alpha3 == null || (alpha3.alpha == null && alpha3.bravo == null && alpha3.charlie == null && alpha3.delta == null)) {
                        z10 = r32;
                        z11 = z15;
                        c0585q.purple(728331710);
                        c0585q.quebec(z10);
                    } else {
                        c0585q.purple(726303039);
                        Object jade4 = c0585q.jade();
                        Object obj8 = jade4;
                        if (jade4 == asVar) {
                            ay ayVar = new ay(interfaceC1673j);
                            c0585q.f(ayVar);
                            obj8 = ayVar;
                        }
                        ay ayVar2 = (ay) obj8;
                        Unit unit = Unit.INSTANCE;
                        Object jade5 = c0585q.jade();
                        z11 = z15;
                        Object obj9 = jade5;
                        if (jade5 == asVar) {
                            f0 f0Var = new f0(ayVar2, null);
                            c0585q.f(f0Var);
                            obj9 = f0Var;
                        }
                        C0564b.foxtrot((Xd.l) obj9, c0585q, unit);
                        if ((ayVar2.bravo.juliet() & 2) != 0) {
                            z12 = z11 ? 1 : 0;
                        } else {
                            z12 = r32;
                        }
                        Object valueOf = Boolean.valueOf(z12);
                        p0 p0Var = ayVar2.bravo;
                        if ((p0Var.juliet() & 1) != 0) {
                            z13 = z11 ? 1 : 0;
                        } else {
                            z13 = r32;
                        }
                        Object valueOf2 = Boolean.valueOf(z13);
                        if ((p0Var.juliet() & 4) != 0) {
                            z14 = z11 ? 1 : 0;
                        } else {
                            z14 = r32;
                        }
                        Object valueOf3 = Boolean.valueOf(z14);
                        D0.al alpha4 = mVar.alpha();
                        if (alpha4 != null) {
                            obj2 = alpha4.alpha;
                        } else {
                            obj2 = null;
                        }
                        boolean z16 = r32;
                        D0.al alpha5 = mVar.alpha();
                        if (alpha5 != null) {
                            obj3 = alpha5.bravo;
                        } else {
                            obj3 = null;
                        }
                        D0.al alpha6 = mVar.alpha();
                        if (alpha6 != null) {
                            obj4 = alpha6.charlie;
                        } else {
                            obj4 = null;
                        }
                        D0.al alpha7 = mVar.alpha();
                        if (alpha7 != null) {
                            obj5 = alpha7.delta;
                        } else {
                            obj5 = null;
                        }
                        Object obj10 = obj4;
                        Object[] objArr = new Object[7];
                        objArr[z16 ? 1 : 0] = valueOf;
                        objArr[z11 ? 1 : 0] = valueOf2;
                        objArr[c3] = valueOf3;
                        objArr[i10] = obj2;
                        objArr[4] = obj3;
                        objArr[5] = obj10;
                        objArr[6] = obj5;
                        boolean india2 = c0585q.india(this) | c0585q.golf(eVar);
                        Object jade6 = c0585q.jade();
                        Object obj11 = jade6;
                        if (india2 || jade6 == asVar) {
                            Cb.ac acVar = new Cb.ac(this, eVar, ayVar2, 25);
                            c0585q.f(acVar);
                            obj11 = acVar;
                        }
                        bravo(objArr, (Function1) obj11, c0585q, (i12 << 6) & 896);
                        z10 = z16 ? 1 : 0;
                        c0585q.quebec(z10);
                    }
                    c0585q.quebec(z10);
                } else {
                    z10 = r32;
                    c3 = c4;
                    i10 = i11;
                    z11 = z15;
                    c0585q.purple(728345598);
                    c0585q.quebec(z10);
                }
                i13++;
                r32 = z10;
                c4 = c3;
                i11 = i10;
                z15 = z11;
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new bz.af(this, i4, 17);
        }
    }

    public final void bravo(Object[] objArr, Function1 function1, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2083052099);
        if ((i4 & 48) == 0) {
            if (c0585q.india(function1)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(this)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        }
        c0585q.pink(-358305778, Integer.valueOf(objArr.length));
        boolean z10 = false;
        if (c0585q.echo(objArr.length)) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        int i14 = i5 | i10;
        for (Object obj : objArr) {
            if (c0585q.india(obj)) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            i14 |= i11;
        }
        c0585q.quebec(false);
        if ((i14 & 14) == 0) {
            i14 |= 2;
        }
        if ((i14 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            T3.b bVar = new T3.b(2);
            bVar.alpha(function1);
            bVar.bravo(objArr);
            ArrayList arrayList = bVar.alpha;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean india = c0585q.india(this);
            if ((i14 & 112) == 32) {
                z10 = true;
            }
            boolean z11 = india | z10;
            Object jade = c0585q.jade();
            if (z11 || jade == C0580l.alpha) {
                jade = new C2140o(this, function1, 1);
                c0585q.f(jade);
            }
            C0564b.echo(array, (Function1) jade, c0585q);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.al(this, objArr, function1, i4, 20);
        }
    }
}
