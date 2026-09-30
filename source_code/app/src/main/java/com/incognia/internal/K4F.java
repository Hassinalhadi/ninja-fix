package com.incognia.internal;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import com.google.android.material.datepicker.j;
import h9.C1827e;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class K4F {

    /* renamed from: J, reason: collision with root package name */
    public NnB f8983J;

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f8984W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8985b;
    public hp gmP;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f8986f9 = LazyKt.lazy(new Ln(this));
    public final ny sVU = new ny();

    public K4F(Context context, pl2 pl2Var) {
        this.f8985b = context;
        this.f8984W = pl2Var;
    }

    public final void b(BGx bGx, ayg aygVar) {
        this.f8984W.b(new C1827e((Object) bGx, (Object) this, (Object) aygVar, 3));
    }

    public static final void b(BGx bGx, K4F k4f, Function1 function1) {
        double d4;
        double d9;
        hp hpVar;
        try {
            double d10 = bGx.f8409b;
            double d11 = bGx.f8408W;
            hp hpVar2 = new hp(d10, d11);
            if (k4f.f8983J == null || (hpVar = k4f.gmP) == null) {
                d4 = d10;
                d9 = d11;
            } else {
                float[] fArr = new float[3];
                d4 = d10;
                d9 = d11;
                Location.distanceBetween(d4, d9, hpVar.f10570b, hpVar.f10569W, fArr);
                if (fArr[0] < 10.0f) {
                    Result.Companion companion = Result.INSTANCE;
                    function1.invoke(new Result(Result.m206constructorimpl(k4f.f8983J)));
                    return;
                }
            }
            if (((Geocoder) k4f.f8986f9.getValue()) == null) {
                Result.Companion companion2 = Result.INSTANCE;
                function1.invoke(new Result(Result.m206constructorimpl(ResultKt.createFailure(new Ju()))));
            } else {
                if (CnH.b(CnH.f8484b, 33, 0, 2)) {
                    ((Geocoder) k4f.f8986f9.getValue()).getFromLocation(d4, d9, 1, new LoK(k4f, hpVar2, function1));
                    return;
                }
                List<Address> fromLocation = ((Geocoder) k4f.f8986f9.getValue()).getFromLocation(d4, d9, 1);
                if (fromLocation != null) {
                    k4f.b(fromLocation, hpVar2, function1);
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    function1.invoke(new Result(Result.m206constructorimpl(ResultKt.createFailure(new KWv("synchronous geocoding error")))));
                }
            }
        } catch (Throwable th) {
            Result.Companion companion4 = Result.INSTANCE;
            String message = th.getMessage();
            if (message == null) {
                message = "geocoding error";
            }
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new KWv(message))), function1);
        }
    }

    public final void b(List list, hp hpVar, Function1 function1) {
        if (list.isEmpty()) {
            Result.Companion companion = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new KWv("no available addresses for location"))), function1);
            return;
        }
        Address address = (Address) list.get(0);
        address.setLatitude(hpVar.f10570b);
        address.setLongitude(hpVar.f10569W);
        this.sVU.getClass();
        NnB b2 = ny.b(address);
        this.gmP = hpVar;
        this.f8983J = b2;
        j.quebec(Result.m206constructorimpl(b2), function1);
    }
}
