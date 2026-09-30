package androidx.compose.foundation.lazy.layout;

import Lb.F;
import a2.C0393r;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.vision.barcode.common.Barcode;
import d.K;
import fe.C1713e;
import fe.C1715g;
import g.AbstractC1719b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2365A;
import s6.J4;

/* loaded from: classes3.dex */
public abstract class j {
    public static final E0.k alpha = new E0.k(7);

    public static final void alpha(ge.s sVar, T.s sVar2, ai aiVar, y yVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1055276397);
        if (c0585q.india(sVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i5 | i4;
        if (c0585q.golf(sVar2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q.golf(aiVar)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q.golf(yVar)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i12;
        if ((i16 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i16 & 1, z2)) {
            charlie(P.e.echo(-933153643, new x(aiVar, sVar2, yVar, C0564b.black(sVar, c0585q)), c0585q), c0585q, 6);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.h(sVar, sVar2, aiVar, yVar, i4);
        }
    }

    public static final void bravo(Object obj, int i4, ae aeVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        boolean z2;
        Function1 function1;
        int i11;
        int i12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(872548579);
        if ((i5 & 6) == 0) {
            if (c0585q.india(obj)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q.echo(i4)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i5 & 384) == 0) {
            if (c0585q.india(aeVar)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i5 & 3072) == 0) {
            if (c0585q.india(dVar)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            boolean golf = c0585q.golf(obj) | c0585q.golf(aeVar);
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (golf || jade == asVar) {
                jade = new ad(obj, aeVar);
                c0585q.f(jade);
            }
            ad adVar = (ad) jade;
            adVar.charlie = i4;
            androidx.compose.runtime.aa aaVar = AbstractC2365A.alpha;
            ad adVar2 = (ad) c0585q.kilo(aaVar);
            S.g echo = r6.u.echo();
            if (echo != null) {
                function1 = echo.echo();
            } else {
                function1 = null;
            }
            S.g foxtrot = r6.u.foxtrot(echo);
            androidx.compose.runtime.ax axVar = adVar.golf;
            try {
                if (adVar2 != ((ad) ((t0) axVar).getValue())) {
                    ((t0) axVar).setValue(adVar2);
                    if (adVar.delta > 0) {
                        ad adVar3 = adVar.echo;
                        if (adVar3 != null) {
                            adVar3.bravo();
                        }
                        if (adVar2 != null) {
                            adVar2.alpha();
                        } else {
                            adVar2 = null;
                        }
                        adVar.echo = adVar2;
                    }
                }
                r6.u.juliet(echo, foxtrot, function1);
                boolean golf2 = c0585q.golf(adVar);
                Object jade2 = c0585q.jade();
                if (golf2 || jade2 == asVar) {
                    jade2 = new Ya.c(9, adVar);
                    c0585q.f(jade2);
                }
                C0564b.delta(adVar, (Function1) jade2, c0585q);
                C0564b.alpha(aaVar.alpha(adVar), dVar, c0585q, ((i10 >> 6) & 112) | 8);
            } catch (Throwable th) {
                r6.u.juliet(echo, foxtrot, function1);
                throw th;
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new F(obj, i4, aeVar, dVar, i5);
        }
    }

    public static final void charlie(P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        int i5 = 1;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-709502251);
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            E0 e02 = R.i.alpha;
            R.g gVar = (R.g) c0585q.kilo(e02);
            R.e foxtrot = R.l.foxtrot(c0585q);
            Object[] objArr = {gVar};
            J2.l lVar = new J2.l(new S4.b(24), new C0393r(9, gVar, foxtrot));
            boolean india = c0585q.india(gVar) | c0585q.india(foxtrot);
            Object jade = c0585q.jade();
            if (india || jade == C0580l.alpha) {
                jade = new Yb.F(5, gVar, foxtrot);
                c0585q.f(jade);
            }
            ar arVar = (ar) R.l.charlie(objArr, lVar, (Function0) jade, c0585q, 0);
            C0564b.alpha(e02.alpha(arVar), P.e.echo(-412824043, new P0.b(6, dVar, arVar), c0585q), c0585q, 56);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Db.b(dVar, i4, i5);
        }
    }

    public static final void delta(w wVar, Object obj, int i4, Object obj2, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1439843069);
        if (c0585q.golf(wVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i10 | i5;
        if (c0585q.golf(obj)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (c0585q.echo(i4)) {
            i12 = Barcode.FORMAT_QR_CODE;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if (c0585q.golf(obj2)) {
            i13 = 2048;
        } else {
            i13 = Barcode.FORMAT_UPC_E;
        }
        int i17 = i16 | i13;
        if ((i17 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i17 & 1, z2)) {
            ((R.c) obj).alpha(obj2, P.e.echo(980966366, new v(i4, wVar, obj2), c0585q), c0585q, 48);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.al(wVar, obj, i4, obj2, i5);
        }
    }

    public static final int echo(int i4, J.e eVar) {
        int i5 = eVar.red - 1;
        int i10 = 0;
        while (i10 < i5) {
            int i11 = ((i5 - i10) / 2) + i10;
            Object[] objArr = eVar.alpha;
            int i12 = ((g) objArr[i11]).alpha;
            if (i12 != i4) {
                if (i12 < i4) {
                    i10 = i11 + 1;
                    if (i4 < ((g) objArr[i10]).alpha) {
                    }
                } else {
                    i5 = i11 - 1;
                }
            }
            return i11;
        }
        return i10;
    }

    public static final List foxtrot(ab abVar, int i4, int i5, ArrayList arrayList, bv.z zVar, int i10, int i11, int i12, Function1 function1) {
        int i13;
        bv.z zVar2;
        aa aaVar;
        char c3;
        long j5;
        int i14;
        Object obj;
        int i15;
        int max;
        long j6;
        boolean z2;
        boolean z10 = true;
        if (abVar != null && !arrayList.isEmpty() && (i13 = zVar.bravo) != 0) {
            int i16 = -1;
            if (i5 - i4 >= 0 && i13 != 0) {
                C1715g hotel = J4.hotel(0, i13);
                int i17 = hotel.alpha;
                int i18 = hotel.purple;
                int i19 = -1;
                if (i17 <= i18) {
                    while (zVar.alpha(i17) <= i4) {
                        i19 = zVar.alpha(i17);
                        if (i17 == i18) {
                            break;
                        }
                        i17++;
                    }
                }
                if (i19 == -1) {
                    zVar2 = bv.m.alpha;
                } else {
                    bv.z zVar3 = bv.m.alpha;
                    zVar2 = new bv.z(1);
                    zVar2.charlie(i19);
                }
            } else {
                zVar2 = bv.m.alpha;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i20 = 0;
            while (i20 < size) {
                Object obj2 = arrayList.get(i20);
                int index = ((aa) obj2).getIndex();
                int[] iArr = zVar.alpha;
                int i21 = zVar.bravo;
                int i22 = 0;
                while (true) {
                    if (i22 < i21) {
                        z2 = z10;
                        if (iArr[i22] == index) {
                            arrayList3.add(obj2);
                            break;
                        }
                        i22++;
                        z10 = z2;
                    } else {
                        z2 = z10;
                        break;
                    }
                }
                i20++;
                z10 = z2;
            }
            int[] iArr2 = zVar2.alpha;
            int i23 = zVar2.bravo;
            int i24 = 0;
            while (i24 < i23) {
                int i25 = iArr2[i24];
                Iterator it = arrayList.iterator();
                int i26 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (((aa) it.next()).getIndex() == i25) {
                            break;
                        }
                        i26++;
                    } else {
                        i26 = i16;
                        break;
                    }
                }
                if (i26 == i16) {
                    aaVar = (aa) function1.invoke(Integer.valueOf(i25));
                } else {
                    aaVar = (aa) arrayList.remove(i26);
                }
                int bravo = aaVar.bravo();
                if (i26 == i16) {
                    c3 = ' ';
                    i14 = RecyclerView.UNDEFINED_DURATION;
                } else {
                    long hotel2 = aaVar.hotel(0);
                    if (aaVar.echo()) {
                        c3 = ' ';
                        j5 = hotel2 & 4294967295L;
                    } else {
                        c3 = ' ';
                        j5 = hotel2 >> 32;
                    }
                    i14 = (int) j5;
                }
                int size2 = arrayList3.size();
                int i27 = 0;
                while (true) {
                    if (i27 < size2) {
                        obj = arrayList3.get(i27);
                        if (((aa) obj).getIndex() != i25) {
                            break;
                        }
                        i27++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                aa aaVar2 = (aa) obj;
                if (aaVar2 != null) {
                    long hotel3 = aaVar2.hotel(0);
                    if (aaVar2.echo()) {
                        j6 = hotel3 & 4294967295L;
                    } else {
                        j6 = hotel3 >> c3;
                    }
                    i15 = (int) j6;
                } else {
                    i15 = RecyclerView.UNDEFINED_DURATION;
                }
                if (i14 == Integer.MIN_VALUE) {
                    max = -i10;
                } else {
                    max = Math.max(-i10, i14);
                }
                if (i15 != Integer.MIN_VALUE) {
                    max = Math.min(max, i15 - bravo);
                }
                aaVar.foxtrot();
                aaVar.golf(max, i11, i12);
                arrayList2.add(aaVar);
                i24++;
                i16 = -1;
            }
            return arrayList2;
        }
        return CollectionsKt.emptyList();
    }

    public static final List golf(w wVar, ae aeVar, i iVar) {
        boolean z2;
        C1713e c1713e;
        if (iVar.alpha.red == 0 && aeVar.alpha.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        J.e eVar = iVar.alpha;
        if (eVar.red != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int i4 = eVar.red;
            if (i4 != 0) {
                Object[] objArr = eVar.alpha;
                int i5 = ((h) objArr[0]).alpha;
                for (int i10 = 0; i10 < i4; i10++) {
                    int i11 = ((h) objArr[i10]).alpha;
                    if (i11 < i5) {
                        i5 = i11;
                    }
                }
                if (i5 < 0) {
                    AbstractC1719b.alpha("negative minIndex");
                }
                int i12 = eVar.red;
                if (i12 != 0) {
                    Object[] objArr2 = eVar.alpha;
                    int i13 = ((h) objArr2[0]).bravo;
                    for (int i14 = 0; i14 < i12; i14++) {
                        int i15 = ((h) objArr2[i14]).bravo;
                        if (i15 > i13) {
                            i13 = i15;
                        }
                    }
                    c1713e = new C1713e(i5, Math.min(i13, wVar.getItemCount() - 1), 1);
                } else {
                    throw new NoSuchElementException("MutableVector is empty.");
                }
            } else {
                throw new NoSuchElementException("MutableVector is empty.");
            }
        } else {
            c1713e = C1715g.silver;
        }
        int size = aeVar.alpha.size();
        for (int i16 = 0; i16 < size; i16++) {
            ad adVar = (ad) aeVar.get(i16);
            int india = india(adVar.charlie, wVar, adVar.alpha);
            int i17 = c1713e.alpha;
            if ((india > c1713e.purple || i17 > india) && india >= 0 && india < wVar.getItemCount()) {
                arrayList.add(Integer.valueOf(india));
            }
        }
        int i18 = c1713e.alpha;
        int i19 = c1713e.purple;
        if (i18 <= i19) {
            while (true) {
                arrayList.add(Integer.valueOf(i18));
                if (i18 == i19) {
                    break;
                }
                i18++;
            }
        }
        return arrayList;
    }

    public static androidx.compose.runtime.ax hotel() {
        return C0564b.yankee(Unit.INSTANCE, androidx.compose.runtime.as.red);
    }

    public static final int india(int i4, w wVar, Object obj) {
        int charlie;
        if (obj != null && wVar.getItemCount() != 0 && ((i4 >= wVar.getItemCount() || !Intrinsics.areEqual(obj, wVar.alpha(i4))) && (charlie = wVar.charlie(obj)) != -1)) {
            return charlie;
        }
        return i4;
    }

    public static final T.s mike(o oVar, i iVar, K k6) {
        return new LazyLayoutBeyondBoundsModifierElement(oVar, iVar, k6);
    }

    public static final T.s november(T.s sVar, ge.s sVar2, am amVar, K k6, boolean z2) {
        return sVar.then(new LazyLayoutSemanticsModifier(sVar2, amVar, k6, z2));
    }

    public static final List oscar(int i4, int i5, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList B = CollectionsKt.B(list);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            aa aaVar = (aa) arrayList.get(i10);
            int index = aaVar.getIndex();
            if (i4 <= index && index <= i5) {
                B.add(aaVar);
            }
        }
        kotlin.collections.p.romeo(B, alpha);
        return B;
    }

    public Object juliet(int i4) {
        g bravo = kilo().bravo(i4);
        return bravo.charlie.getType().invoke(Integer.valueOf(i4 - bravo.alpha));
    }

    public abstract as kilo();

    public Object lima(int i4) {
        Object invoke;
        g bravo = kilo().bravo(i4);
        int i5 = i4 - bravo.alpha;
        Function1 key = bravo.charlie.getKey();
        if (key != null && (invoke = key.invoke(Integer.valueOf(i5))) != null) {
            return invoke;
        }
        return new DefaultLazyKey(i4);
    }
}
