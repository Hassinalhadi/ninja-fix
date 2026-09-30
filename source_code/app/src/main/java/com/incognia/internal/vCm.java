package com.incognia.internal;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class vCm implements P0 {
    public static final String sVU = (String) wGk.f11615F.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final lBB f11538W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f11539b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11540f9 = LazyKt.lazy(L0K.f9038b);

    public vCm(S0A s0a, lBB lbb) {
        this.f11539b = s0a;
        this.f11538W = lbb;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11540f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        XOw xOw;
        List list;
        ivf ivfVar;
        try {
            Result.Companion companion = Result.INSTANCE;
            int optInt = ((JSONObject) this.f11539b.f9574b.get()).optInt(sVU, 5);
            if (optInt <= 0) {
                ivfVar = new ivf((String) this.f11540f9.getValue(), null);
            } else {
                lBB lbb = this.f11538W;
                try {
                    if (lbb.f10809J.b()) {
                        lbb.f10809J.b(lbb.b());
                    }
                    xOw = (XOw) lbb.f10809J.sVU;
                } catch (Throwable unused) {
                    xOw = null;
                }
                List list2 = xOw != null ? xOw.f9923b : null;
                if (list2 != null) {
                    int size = list2.size();
                    if (optInt > size) {
                        optInt = size;
                    }
                    list = list2.subList(0, optInt);
                } else {
                    list = null;
                }
                ivfVar = new ivf((String) this.f11540f9.getValue(), new XOw(list, xOw != null ? xOw.f9922W : null));
            }
            m206constructorimpl = Result.m206constructorimpl(ivfVar);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
