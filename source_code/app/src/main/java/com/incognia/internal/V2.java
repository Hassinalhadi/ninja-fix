package com.incognia.internal;

import G6.l;
import android.content.Context;
import bd.ExecutorC0753f;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import g9.a;
import h9.C1824b;
import h9.C1827e;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class V2 implements Gg {

    /* renamed from: E, reason: collision with root package name */
    public static final String f9749E = (String) wGk.f11636N.getValue();
    public FusedLocationProviderClient DOu;
    public N8B IB;

    /* renamed from: J, reason: collision with root package name */
    public final Oqz f9750J;
    public final lI PqK;

    /* renamed from: R, reason: collision with root package name */
    public G6.b f9751R;

    /* renamed from: W, reason: collision with root package name */
    public final S0A f9753W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9754b;

    /* renamed from: f9, reason: collision with root package name */
    public final pl2 f9755f9;
    public final k8E gmP;
    public final mg olU;
    public final L8H sVU;

    /* renamed from: V, reason: collision with root package name */
    public D5f f9752V = aNe.f10097b;
    public final Lazy Qs = LazyKt.lazy(new q6(this));

    public V2(Context context, S0A s0a, pl2 pl2Var, L8H l8h, k8E k8e, Oqz oqz, lI lIVar) {
        this.f9754b = context;
        this.f9753W = s0a;
        this.f9755f9 = pl2Var;
        this.sVU = l8h;
        this.gmP = k8e;
        this.f9750J = oqz;
        this.PqK = lIVar;
        this.olU = new mg(oqz);
    }

    public static final void W(V2 v22, toE toe) {
        njO.b(v22, new a(12, toe));
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.f9752V = tOI.f11377b;
        if (((Boolean) this.Qs.getValue()).booleanValue()) {
            this.DOu = LocationServices.getFusedLocationProviderClient(this.f9754b);
            this.IB = new N8B(this.f9754b);
        }
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f9755f9;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.f9752V = b66.f10146b;
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.f9752V;
    }

    public final boolean b(kVL kvl) {
        if (((Boolean) this.Qs.getValue()).booleanValue() && this.DOu != null && this.IB != null && ((Boolean) this.gmP.olU.getValue()).booleanValue() && this.f9750J.W()) {
            return njO.b(this, new C1824b(19, this, kvl));
        }
        return false;
    }

    public static final void b(V2 v22, Function0 function0) {
        G6.b bVar;
        if (((Boolean) v22.Qs.getValue()).booleanValue() && (bVar = v22.f9751R) != null) {
            bVar.alpha();
        }
        v22.f9752V = L4.f9041b;
        function0.invoke();
    }

    public static final void b(V2 v22, toE toe) {
        Task task;
        G6.b bVar = new G6.b();
        v22.f9751R = bVar;
        try {
            FusedLocationProviderClient fusedLocationProviderClient = v22.DOu;
            if (fusedLocationProviderClient == null) {
                fusedLocationProviderClient = null;
            }
            task = fusedLocationProviderClient.getCurrentLocation(100, bVar.alpha);
        } catch (Throwable unused) {
            N8B n8b = v22.IB;
            if (n8b == null) {
                n8b = null;
            }
            l lVar = v22.f9751R.alpha;
            n8b.getClass();
            try {
                Object invoke = n8b.f9186b.getClass().getMethod((String) wGk.Nmf.getValue(), Integer.TYPE, G6.a.class).invoke(n8b.f9186b, 100, lVar);
                if (invoke instanceof Task) {
                    task = (Task) invoke;
                }
            } catch (Throwable unused2) {
            }
            task = null;
        }
        if (task == null) {
            toe.b(null);
            return;
        }
        a4.u uVar = new a4.u(28, new QYW(v22, toe));
        G6.q qVar = (G6.q) task;
        ExecutorC0753f executorC0753f = G6.i.alpha;
        qVar.echo(executorC0753f, uVar);
        qVar.delta(executorC0753f, new h9.x(v22, toe));
        qVar.alpha(executorC0753f, new h9.x(v22, toe));
    }

    public static final void b(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void b(V2 v22, toE toe, Exception exc) {
        njO.b(v22, new C1827e(v22, exc, toe, 5));
    }

    public static final void b(V2 v22, Exception exc, toE toe) {
        int statusCode;
        v22.getClass();
        ApiException apiException = exc instanceof ApiException ? (ApiException) exc : null;
        if (apiException == null || ((statusCode = apiException.getStatusCode()) != 17 && statusCode != 20 && statusCode != 22)) {
            v22.sVU.b((Throwable) exc, false);
        }
        toe.b(null);
    }

    public static final void b(toE toe) {
        toe.b(null);
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new C1824b(20, this, cj0));
    }
}
