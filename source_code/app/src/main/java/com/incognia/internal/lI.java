package com.incognia.internal;

import android.location.Location;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.k;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class lI {

    /* renamed from: b, reason: collision with root package name */
    public final S0A f10821b;

    public lI(fJi fji, S0A s0a) {
        this.f10821b = s0a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a1 b(Location location) {
        Object m206constructorimpl;
        String str;
        Integer num;
        Integer num2 = null;
        if (location == null) {
            return null;
        }
        if (((JSONObject) this.f10821b.f9574b.get()).optBoolean((String) wGk.q1O.getValue(), true)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(location.toString());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (m206constructorimpl instanceof k) {
                m206constructorimpl = null;
            }
            str = (String) m206constructorimpl;
        } else {
            str = null;
        }
        if (((JSONObject) this.f10821b.f9574b.get()).optBoolean((String) wGk.oMV.getValue(), true)) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                num = Result.m206constructorimpl(fJi.b(location));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                num = Result.m206constructorimpl(ResultKt.createFailure(th2));
            }
            if (!(num instanceof k)) {
                num2 = num;
            }
            num2 = num2;
        }
        return new a1(str, num2);
    }
}
