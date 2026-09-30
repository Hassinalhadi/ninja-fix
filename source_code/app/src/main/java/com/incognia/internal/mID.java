package com.incognia.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class mID {

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10895f9 = (String) wGk.Rk.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final S0A f10896W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10897b;

    public mID(Context context, S0A s0a) {
        this.f10897b = context;
        this.f10896W = s0a;
    }

    public final Mh b() {
        Intent b2;
        int i4;
        int i5;
        int i10;
        double d4;
        int i11;
        Integer num;
        int intExtra;
        boolean z2 = true;
        if (!((JSONObject) this.f10896W.f9574b.get()).optBoolean(f10895f9, true)) {
            b2 = null;
        } else {
            b2 = wD.b(this.f10897b, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
        }
        if (b2 == null) {
            return null;
        }
        boolean booleanExtra = b2.getBooleanExtra("present", false);
        int intExtra2 = b2.getIntExtra("status", -1);
        if (intExtra2 != 2 && intExtra2 != 5) {
            z2 = false;
        }
        int intExtra3 = b2.getIntExtra("plugged", 0);
        int intExtra4 = b2.getIntExtra("health", 0);
        int intExtra5 = b2.getIntExtra("level", -1);
        int intExtra6 = b2.getIntExtra("scale", -1);
        double intExtra7 = b2.getIntExtra("temperature", 0) / 10.0d;
        int intExtra8 = b2.getIntExtra("voltage", 0);
        String stringExtra = b2.getStringExtra("technology");
        if (CnH.b(CnH.f8484b, 34, 0, 2) && (intExtra = b2.getIntExtra("android.os.extra.CYCLE_COUNT", -1)) != -1) {
            i4 = intExtra4;
            i5 = intExtra5;
            i10 = intExtra6;
            d4 = intExtra7;
            i11 = intExtra8;
            num = Integer.valueOf(intExtra);
        } else {
            i4 = intExtra4;
            i5 = intExtra5;
            i10 = intExtra6;
            d4 = intExtra7;
            i11 = intExtra8;
            num = null;
        }
        return new Mh(booleanExtra, z2, intExtra3, i4, i5, i10, d4, i11, stringExtra, num);
    }
}
