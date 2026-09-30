package com.incognia.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.incognia.internal.fmh;
import com.incognia.internal.tNn;
import g9.a;
import h9.am;
import h9.az;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class tNn implements Gg {
    public final Executor PqK;

    /* renamed from: V, reason: collision with root package name */
    public final LocationManager f11373V;

    /* renamed from: W, reason: collision with root package name */
    public final L8H f11374W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f11375b;

    /* renamed from: f9, reason: collision with root package name */
    public final Oqz f11376f9;
    public final lI gmP;
    public final mg olU;
    public final S0A sVU;
    public static final long IB = TimeUnit.MINUTES.toMillis(5);
    public static final String Qs = (String) wGk.C44.getValue();

    /* renamed from: E, reason: collision with root package name */
    public static final String f11370E = (String) wGk.mX.getValue();

    /* renamed from: J, reason: collision with root package name */
    public D5f f11371J = aNe.f10097b;

    /* renamed from: R, reason: collision with root package name */
    public final LinkedHashSet f11372R = new LinkedHashSet();
    public final w5J DOu = new w5J(this);

    public tNn(Context context, pl2 pl2Var, L8H l8h, Oqz oqz, S0A s0a, lI lIVar) {
        this.f11375b = pl2Var;
        this.f11374W = l8h;
        this.f11376f9 = oqz;
        this.sVU = s0a;
        this.gmP = lIVar;
        this.PqK = Q4n.b(pl2Var);
        this.f11373V = (LocationManager) context.getSystemService("location");
        this.olU = new mg(oqz);
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.f11371J = tOI.f11377b;
    }

    public final void PqK() {
        if (W("passive")) {
            this.f11373V.requestLocationUpdates("passive", ((JSONObject) this.sVU.f9574b.get()).optLong(Qs, IB), (float) ((JSONObject) this.sVU.f9574b.get()).optDouble(f11370E, 200.0f), this.DOu, this.f11375b.f11091W.getLooper());
        }
    }

    public final void V() {
        this.f11373V.removeTestProvider("gps");
    }

    public final void W(wKp wkp) {
        njO.b(this, new az(this, wkp, 0));
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f11375b;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.f11371J = b66.f10146b;
        njO.b(this, new a(20, this));
    }

    public final boolean gmP() {
        boolean isLocationEnabled;
        if (CnH.b(CnH.f8484b, 28, 0, 2)) {
            isLocationEnabled = this.f11373V.isLocationEnabled();
            return isLocationEnabled;
        }
        if (!W("gps") && !W("network")) {
            return false;
        }
        return true;
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.f11371J;
    }

    public static final void W(tNn tnn, toE toe) {
        tnn.f11372R.remove(toe);
        if (tnn.f11372R.isEmpty() && tnn.f11376f9.W()) {
            tnn.f11373V.removeUpdates(tnn.DOu);
        }
    }

    public final BGx b(String str) {
        if (!W(str)) {
            return null;
        }
        try {
            Location lastKnownLocation = this.f11373V.getLastKnownLocation(str);
            a1 b2 = this.gmP.b(lastKnownLocation);
            if (lastKnownLocation != null) {
                return this.olU.b(new Pair(lastKnownLocation, b2));
            }
            return null;
        } catch (Throwable th) {
            this.f11374W.b(th, false);
            return null;
        }
    }

    public final void W() {
        this.f11373V.addTestProvider("gps", false, false, false, false, true, true, true, 1, 1);
    }

    public final boolean W(String str) {
        if (Intrinsics.areEqual("passive", str)) {
            return this.f11376f9.W();
        }
        return Intrinsics.areEqual("gps", str) ? this.f11376f9.W() && this.f11373V.isProviderEnabled(str) : this.f11376f9.b() && this.f11373V.isProviderEnabled(str);
    }

    public final void b(wKp wkp) {
        njO.b(this, new az(this, wkp, 1));
    }

    public static final void b(tNn tnn, toE toe) {
        if (tnn.f11372R.isEmpty()) {
            tnn.PqK();
        }
        tnn.f11372R.add(toe);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h9.ay] */
    public final boolean b(String str, kVL kvl) {
        if (!W(str)) {
            return false;
        }
        final fmh fmhVar = new fmh(kvl, this);
        if (CnH.b(CnH.f8484b, 30, 0, 2)) {
            this.f11373V.getCurrentLocation(str, null, this.PqK, new Consumer() { // from class: h9.ay
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    tNn.b(fmh.this, (Location) obj);
                }
            });
            return true;
        }
        this.f11373V.requestSingleUpdate(str, new PRU(fmhVar), this.f11375b.f11091W.getLooper());
        return true;
    }

    public static final void b(Function1 function1, Location location) {
        function1.invoke(location);
    }

    public static final void b(tNn tnn) {
        if (tnn.f11372R.isEmpty() || !tnn.W("passive")) {
            return;
        }
        tnn.PqK();
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new am(15, this, cj0));
    }

    public static final void b(tNn tnn, Function0 function0) {
        tnn.f11372R.clear();
        if (tnn.f11376f9.W()) {
            tnn.f11373V.removeUpdates(tnn.DOu);
        }
        tnn.f11371J = L4.f9041b;
        function0.invoke();
    }
}
