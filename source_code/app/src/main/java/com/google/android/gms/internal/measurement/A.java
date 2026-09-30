package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import h6.BinderC1814d;
import i6.C1894c;

/* loaded from: classes2.dex */
public final class A extends F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6672a;
    public final /* synthetic */ int teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(J j5, Object obj, Object obj2, int i4) {
        super(j5, true);
        this.teal = i4;
        this.yellow = obj;
        this.f6672a = obj2;
        this.white = j5;
    }

    @Override // com.google.android.gms.internal.measurement.F
    public final void alpha() {
        am amVar;
        boolean z2;
        Bundle bundle;
        switch (this.teal) {
            case 0:
                try {
                    J j5 = (J) this.white;
                    j5.getClass();
                    Context context = (Context) this.yellow;
                    V5.x.hotel(context);
                    try {
                        amVar = al.asInterface(C1894c.charlie(context, C1894c.delta, ModuleDescriptor.MODULE_ID).bravo("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (DynamiteModule$LoadingException e) {
                        j5.alpha(e, true, false);
                        amVar = null;
                    }
                    j5.hotel = amVar;
                    if (j5.hotel == null) {
                        Log.w(j5.alpha, "Failed to connect to measurement client.");
                        return;
                    }
                    int alpha = C1894c.alpha(context, ModuleDescriptor.MODULE_ID);
                    int delta = C1894c.delta(context, ModuleDescriptor.MODULE_ID, false);
                    int max = Math.max(alpha, delta);
                    if (delta < alpha) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzdh zzdhVar = new zzdh(119002L, max, z2, null, null, null, (Bundle) this.f6672a, com.google.android.gms.measurement.internal.W.bravo(context));
                    am amVar2 = j5.hotel;
                    V5.x.hotel(amVar2);
                    amVar2.initialize(new BinderC1814d(context), zzdhVar, this.alpha);
                    return;
                } catch (Exception e4) {
                    ((J) this.white).alpha(e4, true, false);
                    return;
                }
            case 1:
                am amVar3 = ((J) this.white).hotel;
                V5.x.hotel(amVar3);
                amVar3.getMaxUserProperties((String) this.yellow, (aj) this.f6672a);
                return;
            case 2:
                Bundle bundle2 = (Bundle) this.f6672a;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                am amVar4 = ((I) this.white).alpha.hotel;
                V5.x.hotel(amVar4);
                amVar4.onActivityCreatedByScionActivityInfo(zzdj.o((Activity) this.yellow), bundle, this.purple);
                return;
            default:
                am amVar5 = ((I) this.white).alpha.hotel;
                V5.x.hotel(amVar5);
                amVar5.onActivitySaveInstanceStateByScionActivityInfo(zzdj.o((Activity) this.yellow), (aj) this.f6672a, this.purple);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.F
    public void bravo() {
        switch (this.teal) {
            case 1:
                ((aj) this.f6672a).november(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(I i4, Activity activity, aj ajVar) {
        super(i4.alpha, true);
        this.teal = 3;
        this.yellow = activity;
        this.f6672a = ajVar;
        this.white = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(I i4, Bundle bundle, Activity activity) {
        super(i4.alpha, true);
        this.teal = 2;
        this.f6672a = bundle;
        this.yellow = activity;
        this.white = i4;
    }
}
