package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.identity.zzee;
import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.C1302c3;
import com.google.android.gms.internal.measurement.C1312e3;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.zzad;
import com.google.android.gms.tasks.OnFailureListener;
import i6.C1894c;
import i6.InterfaceC1892a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sc.EnumC2848c;

/* renamed from: com.google.android.gms.measurement.internal.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1471u implements aa, OnFailureListener, InterfaceC1892a, kotlin.time.i, T5.m, com.google.android.gms.location.e {
    public static final /* synthetic */ C1471u purple = new C1471u(13);
    public final /* synthetic */ int alpha;

    public /* synthetic */ C1471u(int i4) {
        this.alpha = i4;
    }

    public static EnumC2848c delta(String value) {
        Object obj;
        Intrinsics.echo(value, "value");
        Qd.b bVar = EnumC2848c.teal;
        bVar.getClass();
        kotlin.collections.w wVar = new kotlin.collections.w(bVar);
        while (true) {
            if (wVar.hasNext()) {
                obj = wVar.next();
                if (kotlin.text.r.hotel(((EnumC2848c) obj).name(), value, true)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EnumC2848c enumC2848c = (EnumC2848c) obj;
        if (enumC2848c == null) {
            return EnumC2848c.red;
        }
        return enumC2848c;
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        G6.h hVar = (G6.h) obj2;
        p6.q qVar = (p6.q) obj;
        zzad zzadVar = new zzad(false, null);
        if (qVar.black(com.google.android.gms.location.n.foxtrot)) {
            p6.ab abVar = (p6.ab) qVar.tango();
            zzee zzeeVar = new zzee(5, null, new p6.j(3, hVar), null, null);
            Parcel ivory = abVar.ivory();
            p6.e.bravo(ivory, zzadVar);
            p6.e.bravo(ivory, zzeeVar);
            abVar.lavender(ivory, 91);
            return;
        }
        p6.ab abVar2 = (p6.ab) qVar.tango();
        String packageName = qVar.charlie.getPackageName();
        Parcel ivory2 = abVar2.ivory();
        ivory2.writeString(packageName);
        Parcel jade = abVar2.jade(ivory2, 34);
        LocationAvailability locationAvailability = (LocationAvailability) p6.e.alpha(jade, LocationAvailability.CREATOR);
        jade.recycle();
        hVar.bravo(locationAvailability);
    }

    @Override // kotlin.time.i
    public kotlin.time.e alpha() {
        return null;
    }

    @Override // i6.InterfaceC1892a
    public int bravo(Context context, String str, boolean z2) {
        return C1894c.delta(context, str, z2);
    }

    @Override // i6.InterfaceC1892a
    public int charlie(Context context, String str) {
        return C1894c.alpha(context, str);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 0:
                List list = ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.whiskey.bravo();
                l10.getClass();
                return l10;
            case 1:
                List list2 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.f6691h.bravo()).longValue());
            case 2:
                List list3 = ac.alpha;
                C1302c3.purple.get();
                Boolean bool = (Boolean) C1312e3.alpha.bravo();
                bool.getClass();
                return bool;
            case 3:
                List list4 = ac.alpha;
                C1302c3.purple.get();
                Double d4 = (Double) C1312e3.charlie.bravo();
                d4.getClass();
                return d4;
            case 4:
                List list5 = ac.alpha;
                Boolean bool2 = (Boolean) A2.bravo.bravo();
                bool2.getClass();
                return bool2;
            case 5:
                List list6 = ac.alpha;
                C1362p2.purple.get();
                Long l11 = (Long) C1369r2.india.bravo();
                l11.getClass();
                return l11;
            case 6:
                List list7 = ac.alpha;
                C1362p2.purple.get();
                Long l12 = (Long) C1369r2.ochre.bravo();
                l12.getClass();
                return l12;
            default:
                List list8 = ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.zulu.bravo()).longValue());
        }
    }

    public C1471u(String error, String str) {
        this.alpha = 11;
        Intrinsics.echo(error, "error");
    }
}
