package s6;

import android.os.Bundle;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: s6.m7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2717m7 {
    public static final ArrayList alpha(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p7.o oVar = (p7.o) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", oVar.alpha);
            bundle.putLong("event_timestamp", oVar.bravo);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final androidx.compose.runtime.ax bravo(yf.L l10, InterfaceC0581m interfaceC0581m, int i4) {
        androidx.lifecycle.al alVar = (androidx.lifecycle.al) ((C0585q) interfaceC0581m).kilo(R1.e.alpha);
        androidx.lifecycle.ab abVar = androidx.lifecycle.ab.alpha;
        int i5 = i4 & 14;
        int i10 = i4 << 3;
        return delta(l10, l10.getValue(), alVar.getLifecycle(), interfaceC0581m, (i10 & 57344) | i5 | (i10 & 7168));
    }

    public static final androidx.compose.runtime.ax charlie(yf.L l10, Boolean bool, InterfaceC0581m interfaceC0581m, int i4) {
        androidx.lifecycle.al alVar = (androidx.lifecycle.al) ((C0585q) interfaceC0581m).kilo(R1.e.alpha);
        androidx.lifecycle.ab abVar = androidx.lifecycle.ab.alpha;
        return delta(l10, bool, alVar.getLifecycle(), interfaceC0581m, (i4 & 57344) | (i4 & 14) | (((i4 >> 3) & 8) << 3) | (i4 & 112) | (i4 & 7168));
    }

    public static final androidx.compose.runtime.ax delta(yf.L l10, Object obj, androidx.lifecycle.ac acVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2 = true;
        Nd.i iVar = Nd.i.alpha;
        androidx.lifecycle.ab abVar = androidx.lifecycle.ab.silver;
        Object[] objArr = {l10, acVar, abVar, iVar};
        C0585q c0585q = (C0585q) interfaceC0581m;
        boolean india = c0585q.india(acVar);
        if ((((i4 & 7168) ^ 3072) <= 2048 || !c0585q.echo(abVar.ordinal())) && (i4 & 3072) != 2048) {
            z2 = false;
        }
        boolean india2 = india | z2 | c0585q.india(iVar) | c0585q.india(l10);
        Object jade = c0585q.jade();
        androidx.compose.runtime.as asVar = C0580l.alpha;
        if (india2 || jade == asVar) {
            jade = new R1.d(acVar, l10, null);
            c0585q.f(jade);
        }
        Xd.l lVar = (Xd.l) jade;
        Object jade2 = c0585q.jade();
        if (jade2 == asVar) {
            jade2 = C0564b.zulu(obj);
            c0585q.f(jade2);
        }
        androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean india3 = c0585q.india(lVar);
        Object jade3 = c0585q.jade();
        if (india3 || jade3 == asVar) {
            jade3 = new androidx.compose.runtime.y0(lVar, axVar, null);
            c0585q.f(jade3);
        }
        C0564b.india(copyOf, (Xd.l) jade3, c0585q);
        return axVar;
    }
}
