package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.util.SparseIntArray;
import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.C1302c3;
import com.google.android.gms.internal.measurement.C1312e3;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import i6.InterfaceC1892a;
import i6.InterfaceC1893b;
import java.util.List;

/* loaded from: classes2.dex */
public /* synthetic */ class r implements aa, p7.l, InterfaceC1893b, com.google.android.gms.location.a, T5.m {
    public static final /* synthetic */ r purple = new r(14);
    public final /* synthetic */ int alpha;

    public /* synthetic */ r(int i4) {
        this.alpha = i4;
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        p6.ab abVar = (p6.ab) ((p6.q) obj).tango();
        p6.i iVar = new p6.i((Boolean) null, (G6.h) obj2);
        Parcel ivory = abVar.ivory();
        int i4 = p6.e.alpha;
        ivory.writeStrongBinder(iVar);
        abVar.lavender(ivory, 67);
    }

    @Override // i6.InterfaceC1893b
    public H3.e alpha(Context context, String str, InterfaceC1892a interfaceC1892a) {
        int bravo;
        H3.e eVar = new H3.e();
        int charlie = interfaceC1892a.charlie(context, str);
        eVar.alpha = charlie;
        int i4 = 1;
        int i5 = 0;
        if (charlie != 0) {
            bravo = interfaceC1892a.bravo(context, str, false);
            eVar.bravo = bravo;
        } else {
            bravo = interfaceC1892a.bravo(context, str, true);
            eVar.bravo = bravo;
        }
        int i10 = eVar.alpha;
        if (i10 == 0) {
            if (bravo == 0) {
                i4 = 0;
                eVar.charlie = i4;
                return eVar;
            }
        } else {
            i5 = i10;
        }
        if (i5 >= bravo) {
            i4 = -1;
        }
        eVar.charlie = i4;
        return eVar;
    }

    @Override // p7.m
    public /* synthetic */ Object bravo() {
        return new p7.t("StandardIntegrity");
    }

    public void charlie(Activity activity) {
    }

    public SparseIntArray[] delta() {
        return null;
    }

    public SparseIntArray[] echo(Activity activity) {
        return null;
    }

    public SparseIntArray[] foxtrot() {
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 0:
                List list = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.beige.bravo();
                l10.getClass();
                return l10;
            case 1:
                List list2 = ac.alpha;
                C1362p2.purple.get();
                Long l11 = (Long) C1369r2.echo.bravo();
                l11.getClass();
                return l11;
            case 2:
                List list3 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.romeo.bravo()).longValue());
            case 3:
                List list4 = ac.alpha;
                C1302c3.purple.get();
                Long l12 = (Long) C1312e3.echo.bravo();
                l12.getClass();
                return l12;
            case 4:
                List list5 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.delta.bravo()).longValue());
            case 5:
                List list6 = ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.peach.bravo();
            case 6:
                List list7 = ac.alpha;
                Boolean bool = (Boolean) A2.alpha.bravo();
                bool.getClass();
                return bool;
            default:
                List list8 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.tango.bravo()).longValue());
        }
    }
}
