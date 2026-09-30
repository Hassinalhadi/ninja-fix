package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.C1302c3;
import com.google.android.gms.internal.measurement.C1312e3;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s1.InterfaceC2591y;

/* renamed from: com.google.android.gms.measurement.internal.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1467s implements aa, Nd.g, com.google.android.gms.location.c, T5.m, InterfaceC2591y {
    public static final /* synthetic */ C1467s purple = new C1467s(14);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C1467s(int i4) {
        this.alpha = i4;
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        G6.h hVar = (G6.h) obj2;
        p6.q qVar = (p6.q) obj;
        if (qVar.black(com.google.android.gms.location.n.delta)) {
            p6.ab abVar = (p6.ab) qVar.tango();
            p6.l lVar = new p6.l(null, hVar);
            Parcel ivory = abVar.ivory();
            int i4 = p6.e.alpha;
            ivory.writeInt(1);
            ivory.writeStrongBinder(lVar);
            abVar.lavender(ivory, 84);
            return;
        }
        p6.ab abVar2 = (p6.ab) qVar.tango();
        Parcel ivory2 = abVar2.ivory();
        int i5 = p6.e.alpha;
        ivory2.writeInt(1);
        abVar2.lavender(ivory2, 12);
        hVar.bravo(null);
    }

    @Override // s1.InterfaceC2591y
    public void alpha(int i4, int i5, int i10, boolean z2) {
    }

    @Override // s1.InterfaceC2591y
    public void bravo(int i4, int i5, int i10, int i11) {
    }

    public void charlie(String msg) {
        Intrinsics.echo(msg, "msg");
        delta(ig.a.alpha, msg);
    }

    public void delta(ig.a aVar, String msg) {
        Intrinsics.echo(msg, "msg");
        ig.a.teal.compareTo(aVar);
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 0:
                List list = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.hotel.bravo();
                l10.getClass();
                return l10;
            case 1:
                List list2 = ac.alpha;
                C1362p2.purple.get();
                Long l11 = (Long) C1369r2.f6692i.bravo();
                l11.getClass();
                return l11;
            case 2:
                List list3 = ac.alpha;
                C1362p2.purple.get();
                Long l12 = (Long) C1369r2.blue.bravo();
                l12.getClass();
                return l12;
            case 3:
                List list4 = ac.alpha;
                C1302c3.purple.get();
                Long l13 = (Long) C1312e3.bravo.bravo();
                l13.getClass();
                return l13;
            case 4:
                List list5 = ac.alpha;
                C1362p2.purple.get();
                Long l14 = (Long) C1369r2.pink.bravo();
                l14.getClass();
                return l14;
            case 5:
                List list6 = ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.navy.bravo();
            case 6:
                List list7 = ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.orange.bravo();
            default:
                List list8 = ac.alpha;
                C1362p2.purple.get();
                Boolean bool = (Boolean) C1369r2.charlie.bravo();
                bool.getClass();
                return bool;
        }
    }
}
