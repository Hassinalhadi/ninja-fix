package t6;

import a2.C0386k;
import a2.C0387l;
import a2.C0388m;
import a2.C0389n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.constraintlayout.widget.ConstraintLayout;
import i7.C1901g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.E7;
import t0.AbstractC2913f0;

/* loaded from: classes2.dex */
public abstract class U2 {
    public static final void alpha(C0389n c0389n, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0389n c0389n2;
        C0585q c0585q;
        C0389n c0389n3 = c0389n;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(294589392);
        if (c0585q2.india(c0389n3)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        if (((i5 | i4) & 3) == 2 && c0585q2.bronze()) {
            c0585q2.ochre();
            c0389n2 = c0389n3;
            c0585q = c0585q2;
        } else {
            R.e foxtrot = R.l.foxtrot(c0585q2);
            androidx.compose.runtime.ax mike = C0564b.mike(c0389n3.bravo().echo, c0585q2, 0);
            List list = (List) mike.getValue();
            boolean booleanValue = ((Boolean) c0585q2.kilo(AbstractC2913f0.alpha)).booleanValue();
            boolean golf = c0585q2.golf(list);
            Object jade = c0585q2.jade();
            Object obj = C0580l.alpha;
            Object obj2 = jade;
            if (golf || jade == obj) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    Y1.l lVar = (Y1.l) obj3;
                    if (booleanValue || lVar.f2268a.kilo.delta.compareTo(androidx.lifecycle.ab.silver) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                snapshotStateList.addAll(arrayList);
                c0585q2.f(snapshotStateList);
                obj2 = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj2;
            bravo(snapshotStateList2, (List) mike.getValue(), c0585q2, 0);
            androidx.compose.runtime.ax mike2 = C0564b.mike(c0389n3.bravo().foxtrot, c0585q2, 0);
            Object jade2 = c0585q2.jade();
            if (jade2 == obj) {
                jade2 = new SnapshotStateList();
                c0585q2.f(jade2);
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) jade2;
            c0585q2.purple(-367418626);
            ListIterator listIterator = snapshotStateList2.listIterator();
            while (true) {
                Ld.a aVar = (Ld.a) listIterator;
                if (!aVar.hasNext()) {
                    break;
                }
                Y1.l lVar2 = (Y1.l) aVar.next();
                Y1.aa aaVar = lVar2.purple;
                Intrinsics.charlie(aaVar, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                C0388m c0388m = (C0388m) aaVar;
                boolean india = c0585q2.india(c0389n3) | c0585q2.india(lVar2);
                Object jade3 = c0585q2.jade();
                if (india || jade3 == obj) {
                    jade3 = new Yb.F(3, c0389n3, lVar2);
                    c0585q2.f(jade3);
                }
                Function0 function0 = (Function0) jade3;
                E7.alpha(function0, c0388m.yellow, P.e.echo(1129586364, new C0386k(lVar2, c0389n3, foxtrot, snapshotStateList3, c0388m, 0), c0585q2), c0585q2, 384, 0);
                c0389n3 = c0389n3;
                foxtrot = foxtrot;
                snapshotStateList3 = snapshotStateList3;
            }
            c0389n2 = c0389n3;
            SnapshotStateList snapshotStateList4 = snapshotStateList3;
            c0585q = c0585q2;
            c0585q.quebec(false);
            Set set = (Set) mike2.getValue();
            boolean golf2 = c0585q.golf(mike2) | c0585q.india(c0389n2);
            Object jade4 = c0585q.jade();
            if (golf2 || jade4 == obj) {
                jade4 = new C0387l(mike2, c0389n2, snapshotStateList4, null);
                c0585q.f(jade4);
            }
            C0564b.golf(set, snapshotStateList4, (Xd.l) jade4, c0585q);
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.k(c0389n2, i4, 21);
        }
    }

    public static final void bravo(SnapshotStateList snapshotStateList, List list, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1537894851);
        if (c0585q.india(snapshotStateList)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if (c0585q.india(list)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        if (((i11 | i10) & 19) == 18 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            boolean booleanValue = ((Boolean) c0585q.kilo(AbstractC2913f0.alpha)).booleanValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Y1.l lVar = (Y1.l) it.next();
                androidx.lifecycle.an anVar = lVar.f2268a.kilo;
                boolean hotel = c0585q.hotel(booleanValue) | c0585q.india(snapshotStateList) | c0585q.india(lVar);
                Object jade = c0585q.jade();
                if (hotel || jade == C0580l.alpha) {
                    jade = new Fc.g(1, lVar, snapshotStateList, booleanValue);
                    c0585q.f(jade);
                }
                C0564b.delta(anVar, (Function1) jade, c0585q);
            }
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Cb.a(i4, 18, snapshotStateList, list);
        }
    }

    public static View charlie(ViewGroup viewGroup, int i4) {
        Intrinsics.echo(viewGroup, "<this>");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup, false);
        Intrinsics.delta(inflate, "inflate(...)");
        return inflate;
    }

    public static void delta(ConstraintLayout constraintLayout, int i4) {
        Intrinsics.echo(constraintLayout, "<this>");
        int[] iArr = C1901g.beige;
        C1901g.hotel(constraintLayout, constraintLayout.getResources().getText(i4), 0).juliet();
    }
}
