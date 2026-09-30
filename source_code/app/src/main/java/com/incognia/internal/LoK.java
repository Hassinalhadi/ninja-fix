package com.incognia.internal;

import android.location.Geocoder$GeocodeListener;
import com.google.android.material.datepicker.j;
import h9.C1824b;
import h9.C1834l;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class LoK implements Geocoder$GeocodeListener {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ hp f9079W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K4F f9080b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ Function1 f9081f9;

    public LoK(K4F k4f, hp hpVar, Function1 function1) {
        this.f9080b = k4f;
        this.f9079W = hpVar;
        this.f9081f9 = function1;
    }

    public static final void b(K4F k4f, List list, hp hpVar, Function1 function1) {
        k4f.b(list, hpVar, function1);
    }

    public final void onError(String str) {
        super.onError(str);
        this.f9080b.f8984W.b(new C1824b(9, this.f9081f9, str));
    }

    public final void onGeocode(List list) {
        K4F k4f = this.f9080b;
        k4f.f8984W.b(new C1834l(k4f, list, this.f9079W, this.f9081f9, 0));
    }

    public static final void b(Function1 function1, String str) {
        Result.Companion companion = Result.INSTANCE;
        if (str == null) {
            str = "unknown geocoding error";
        }
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new KWv(str))), function1);
    }
}
