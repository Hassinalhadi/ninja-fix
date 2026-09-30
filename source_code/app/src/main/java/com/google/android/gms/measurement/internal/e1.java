package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1364q0;
import com.google.android.gms.internal.measurement.C1367r0;
import com.google.android.gms.internal.measurement.C1371s0;
import com.google.android.gms.internal.measurement.C1375t0;
import com.google.android.gms.internal.measurement.E2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class e1 {
    public final String alpha;
    public final boolean bravo;
    public final com.google.android.gms.internal.measurement.G0 charlie;
    public final BitSet delta;
    public final BitSet echo;
    public final bv.e foxtrot;
    public final bv.e golf;
    public final /* synthetic */ C1436c hotel;

    /* JADX WARN: Type inference failed for: r1v4, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r1v5, types: [bv.e, bv.aw] */
    public e1(C1436c c1436c, String str) {
        this.hotel = c1436c;
        this.alpha = str;
        this.bravo = true;
        this.delta = new BitSet();
        this.echo = new BitSet();
        this.foxtrot = new bv.aw(0);
        this.golf = new bv.aw(0);
    }

    public final C1367r0 alpha(int i4) {
        ArrayList arrayList;
        List list;
        C1364q0 oscar = C1367r0.oscar();
        oscar.golf();
        C1367r0.romeo((C1367r0) oscar.purple, i4);
        oscar.golf();
        C1367r0.tango((C1367r0) oscar.purple, this.bravo);
        com.google.android.gms.internal.measurement.G0 g02 = this.charlie;
        if (g02 != null) {
            oscar.golf();
            C1367r0.uniform((C1367r0) oscar.purple, g02);
        }
        com.google.android.gms.internal.measurement.F0 romeo = com.google.android.gms.internal.measurement.G0.romeo();
        ArrayList G02 = au.G0(this.delta);
        romeo.golf();
        com.google.android.gms.internal.measurement.G0.yankee((com.google.android.gms.internal.measurement.G0) romeo.purple, G02);
        ArrayList G03 = au.G0(this.echo);
        romeo.golf();
        com.google.android.gms.internal.measurement.G0.amber((com.google.android.gms.internal.measurement.G0) romeo.purple, G03);
        bv.e eVar = this.foxtrot;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.red);
            Iterator it = ((bv.b) eVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l10 = (Long) eVar.get(num);
                if (l10 != null) {
                    C1371s0 papa = C1375t0.papa();
                    papa.golf();
                    C1375t0.romeo((C1375t0) papa.purple, intValue);
                    long longValue = l10.longValue();
                    papa.golf();
                    C1375t0.quebec((C1375t0) papa.purple, longValue);
                    arrayList2.add((C1375t0) papa.echo());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            romeo.golf();
            com.google.android.gms.internal.measurement.G0.xray((com.google.android.gms.internal.measurement.G0) romeo.purple, arrayList);
        }
        bv.e eVar2 = this.golf;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.red);
            Iterator it2 = ((bv.b) eVar2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                com.google.android.gms.internal.measurement.H0 quebec = com.google.android.gms.internal.measurement.I0.quebec();
                int intValue2 = num2.intValue();
                quebec.golf();
                com.google.android.gms.internal.measurement.I0.tango((com.google.android.gms.internal.measurement.I0) quebec.purple, intValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    quebec.golf();
                    com.google.android.gms.internal.measurement.I0.sierra((com.google.android.gms.internal.measurement.I0) quebec.purple, list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.I0) quebec.echo());
            }
            list = arrayList3;
        }
        romeo.golf();
        com.google.android.gms.internal.measurement.G0.zulu((com.google.android.gms.internal.measurement.G0) romeo.purple, list);
        oscar.golf();
        C1367r0.sierra((C1367r0) oscar.purple, (com.google.android.gms.internal.measurement.G0) romeo.echo());
        return (C1367r0) oscar.echo();
    }

    public final void bravo(Y1.ab abVar) {
        int delta = abVar.delta();
        if (((Boolean) abVar.charlie) != null) {
            this.echo.set(delta, true);
        }
        Boolean bool = (Boolean) abVar.delta;
        if (bool != null) {
            this.delta.set(delta, bool.booleanValue());
        }
        if (((Long) abVar.echo) != null) {
            Integer valueOf = Integer.valueOf(delta);
            bv.e eVar = this.foxtrot;
            Long l10 = (Long) eVar.get(valueOf);
            long longValue = ((Long) abVar.echo).longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                eVar.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (((Long) abVar.foxtrot) != null) {
            bv.e eVar2 = this.golf;
            Integer valueOf2 = Integer.valueOf(delta);
            List list = (List) eVar2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                eVar2.put(valueOf2, list);
            }
            if (abVar.foxtrot()) {
                list.clear();
            }
            E2.alpha();
            G g2 = (G) this.hotel.alpha;
            C1440e c1440e = g2.yellow;
            ab abVar2 = ac.f7618x;
            String str = this.alpha;
            if (c1440e.j0(str, abVar2) && abVar.echo()) {
                list.clear();
            }
            E2.alpha();
            if (g2.yellow.j0(str, abVar2)) {
                Long valueOf3 = Long.valueOf(((Long) abVar.foxtrot).longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(((Long) abVar.foxtrot).longValue() / 1000));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [bv.e, bv.aw] */
    public e1(C1436c c1436c, String str, com.google.android.gms.internal.measurement.G0 g02, BitSet bitSet, BitSet bitSet2, bv.e eVar, bv.e eVar2) {
        this.hotel = c1436c;
        this.alpha = str;
        this.delta = bitSet;
        this.echo = bitSet2;
        this.foxtrot = eVar;
        this.golf = new bv.aw(0);
        Iterator it = ((bv.b) eVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.golf.put(num, arrayList);
        }
        this.bravo = false;
        this.charlie = g02;
    }
}
