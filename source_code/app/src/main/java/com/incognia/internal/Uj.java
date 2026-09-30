package com.incognia.internal;

import android.location.Location;
import g3.z;
import java.security.SecureRandom;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class Uj implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final tNn f9726W;

    /* renamed from: b, reason: collision with root package name */
    public final SecureRandom f9727b;

    /* renamed from: f9, reason: collision with root package name */
    public final aoW f9728f9;
    public final Lazy gmP = LazyKt.lazy(ghe.f10489b);
    public final fJi sVU;

    public Uj(SecureRandom secureRandom, tNn tnn, aoW aow, fJi fji) {
        this.f9727b = secureRandom;
        this.f9726W = tnn;
        this.f9728f9 = aow;
        this.sVU = fji;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.gmP.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    public final boolean f9() {
        Location location = new Location("");
        double nextDouble = this.f9727b.nextDouble();
        double nextDouble2 = this.f9727b.nextDouble();
        location.setLatitude(nextDouble);
        location.setLongitude(nextDouble2);
        if (CnH.b(CnH.f8484b, 31, 0, 2)) {
            z.sierra(location);
            this.sVU.getClass();
            if (!z.zulu(location)) {
                return true;
            }
        }
        if (location.getLatitude() == nextDouble && location.getLongitude() == nextDouble2) {
            return false;
        }
        return true;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        Boolean bool;
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = (String) this.gmP.getValue();
            Boolean valueOf = Boolean.valueOf(f9());
            try {
                boolean z2 = false;
                if (!this.f9728f9.b()) {
                    try {
                        this.f9726W.W();
                        z2 = true;
                        this.f9726W.V();
                    } catch (SecurityException unused) {
                    }
                }
                bool = Boolean.valueOf(z2);
            } catch (Throwable unused2) {
                bool = null;
            }
            m206constructorimpl = Result.m206constructorimpl(new xZI(str, new JBP(valueOf, bool)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        Bo7.b(m206constructorimpl, wa2);
    }
}
