package com.incognia.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.Task;
import h9.aq;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.k;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.n;

/* loaded from: classes2.dex */
public final class k8E {

    /* renamed from: J, reason: collision with root package name */
    public final Lazy f10740J;
    public final Lazy PqK;

    /* renamed from: V, reason: collision with root package name */
    public final Lazy f10741V;

    /* renamed from: W, reason: collision with root package name */
    public String f10742W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10743b;

    /* renamed from: f9, reason: collision with root package name */
    public final Nkf f10744f9;
    public final Lazy gmP;
    public final Lazy olU;
    public final Nkf sVU;

    /* renamed from: R, reason: collision with root package name */
    public static final long f10739R = TimeUnit.SECONDS.toMillis(10);
    public static final Uri DOu = Uri.parse((String) wGk.bI.getValue());
    public static final String IB = (String) wGk.COP.getValue();

    public k8E(Context context, W6 w62) {
        this.f10743b = context;
        long j5 = f10739R;
        this.f10744f9 = new Nkf(w62, j5);
        this.sVU = new Nkf(w62, j5);
        this.gmP = LazyKt.lazy(new Ppm(this));
        this.f10740J = LazyKt.lazy(new Yz(this));
        this.PqK = LazyKt.lazy(new i8U(this));
        this.f10741V = LazyKt.lazy(new se(this));
        this.olU = LazyKt.lazy(new bkG(this));
    }

    public static final boolean b(k8E k8e, String str) {
        k8e.getClass();
        if (StringsKt.b(str).toString().length() == 0) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final synchronized String W() {
        String str;
        boolean z2;
        String str2 = this.f10742W;
        if (str2 != null) {
            return str2;
        }
        if (((Boolean) this.f10740J.getValue()).booleanValue()) {
            String str3 = CnH.DOu;
            if (str3 != null) {
                z2 = new Regex("[Nn]exus.*5[xX]").echo(str3);
            } else {
                z2 = false;
            }
            if (!z2) {
                try {
                    str = AdvertisingIdClient.getAdvertisingIdInfo(this.f10743b).getId();
                } catch (Throwable th) {
                    if (eSs.f10363b.get()) {
                        Log.w("Incognia", n.delta("GooglePlayServices access error: \n                        |Unable to obtain AdvertisingIdClient.getAdvertisingIdInfo(): \n                        |" + th.getMessage()));
                    }
                }
                this.f10742W = str;
                return str;
            }
        }
        str = null;
        this.f10742W = str;
        return str;
    }

    public final synchronized Integer f9() {
        int i4;
        try {
            if (this.sVU.b()) {
                Nkf nkf = this.sVU;
                if (((Boolean) this.gmP.getValue()).booleanValue()) {
                    i4 = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                } else {
                    i4 = -1;
                }
                nkf.b(Integer.valueOf(i4));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Integer) this.sVU.sVU;
    }

    public final String sVU() {
        Object m206constructorimpl;
        String str;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor query = this.f10743b.getContentResolver().query(DOu, null, null, new String[]{IB}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst() && query.getColumnCount() > 1) {
                        str = query.getString(1);
                    } else {
                        str = null;
                    }
                    query.close();
                } finally {
                }
            } else {
                str = null;
            }
            m206constructorimpl = Result.m206constructorimpl(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m206constructorimpl instanceof k)) {
            obj = m206constructorimpl;
        }
        return (String) obj;
    }

    public static final boolean b(k8E k8e, Class... clsArr) {
        k8e.getClass();
        if (StringsKt.b("com.google.android.gms.location.FusedLocationProviderClient").toString().length() == 0 || StringsKt.b("getCurrentLocation").toString().length() == 0) {
            return false;
        }
        try {
            FusedLocationProviderClient.class.getMethod("getCurrentLocation", (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            return true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    public final void b(O o5) {
        if (((Boolean) this.PqK.getValue()).booleanValue()) {
            Context context = OQ.f9304b;
            if (context != null) {
                Task appSetIdInfo = AppSet.getClient(context).getAppSetIdInfo();
                aq aqVar = new aq(1, new hIA(o5));
                G6.q qVar = (G6.q) appSetIdInfo;
                qVar.getClass();
                qVar.echo(G6.i.alpha, aqVar);
                qVar.lima(new aq(2, o5));
                return;
            }
            throw new NullPointerException("Using SDK context before initialization");
        }
        o5.invoke(null);
    }

    public final synchronized Boolean b() {
        Boolean bool;
        if (this.f10744f9.b()) {
            if (((Boolean) this.f10740J.getValue()).booleanValue()) {
                String str = CnH.DOu;
                if (!(str != null ? new Regex("[Nn]exus.*5[xX]").echo(str) : false)) {
                    try {
                        bool = Boolean.valueOf(!AdvertisingIdClient.getAdvertisingIdInfo(this.f10743b).isLimitAdTrackingEnabled());
                    } catch (Throwable th) {
                        if (eSs.f10363b.get()) {
                            Log.w("Incognia", n.delta("GooglePlayServices access error: \n                        |Unable to obtain AdvertisingIdClient.getAdvertisingIdInfo(): \n                        |" + th.getMessage()));
                        }
                    }
                    this.f10744f9.b(bool);
                }
            }
            bool = null;
            this.f10744f9.b(bool);
        }
        return (Boolean) this.f10744f9.sVU;
    }

    public static final void b(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void b(Function1 function1, Exception exc) {
        function1.invoke(null);
    }
}
