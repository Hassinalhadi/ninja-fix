package com.incognia.internal;

import android.util.Log;
import h9.ap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class vC extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ List f11535W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Me f11536b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ AZ f11537f9;
    public final /* synthetic */ jNy sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vC(Me me2, List list, AZ az, jNy jny) {
        super(1);
        this.f11536b = me2;
        this.f11535W = list;
        this.f11537f9 = az;
        this.sVU = jny;
    }

    public final void b(boolean z2) {
        Me me2 = this.f11536b;
        njO.b(me2, new ap(z2, this.f11535W, me2, this.f11537f9, this.sVU));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public static final void b(boolean z2, List list, Me me2, AZ az, jNy jny) {
        if (z2) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                U91 u91 = (U91) it.next();
                String str = Me.f9140K;
                me2.getClass();
                u91.getClass();
                if ((u91 instanceof dlT) || (u91 instanceof jU9) || (u91 instanceof eZh) || (u91 instanceof m3v) || (u91 instanceof U3g)) {
                    if (eSs.f10363b.get()) {
                        Log.i("Incognia", "Successfully sent " + u91.b());
                    }
                }
            }
            me2.f9154b.b(new Ri(Cc5.f8464f9));
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            U91 u912 = (U91) it2.next();
            String str2 = Me.f9140K;
            me2.getClass();
            u912.getClass();
            if ((u912 instanceof dlT) || (u912 instanceof jU9) || (u912 instanceof eZh) || (u912 instanceof m3v) || (u912 instanceof U3g)) {
                if (eSs.f10363b.get()) {
                    Log.w("Incognia", "Failed to send " + u912.b());
                }
            }
        }
        me2.getClass();
        kT kTVar = QHn.f9493f9;
        String str3 = Me.f9143s0;
        Long sVU = kTVar.sVU(str3);
        kTVar.b(str3, Long.valueOf((sVU != null ? sVU.longValue() : 0L) + 1));
        me2.f9154b.b(new Ri(HCj.f8829f9));
        me2.f9154b.b(new AZ(az.f8367b, az.f8366W, az.f8368f9, az.sVU, new jNy(jny.f10683b + 1, jny.f10682W, jny.f10684f9, jny.sVU, jny.gmP, jny.f10681J)));
    }
}
