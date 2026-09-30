package com.incognia.internal;

import com.incognia.RequestTokenStatus;
import com.incognia.RequestTokenWithStatus;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Tt6 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f9687b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tt6(long j5) {
        super(0);
        this.f9687b = j5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RequestTokenWithStatus b2 = EP.b("generateRequestTokenSync", this.f9687b, true);
        if (b2.getStatus() == RequestTokenStatus.SUCCESS) {
            return b2.getToken();
        }
        return null;
    }
}
