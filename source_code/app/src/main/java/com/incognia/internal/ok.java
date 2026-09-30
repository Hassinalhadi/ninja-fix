package com.incognia.internal;

import com.incognia.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class ok extends Lambda implements Function0 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ int f11033W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f11034b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ Callback f11035f9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(Long l10, int i4, Callback callback) {
        super(0);
        this.f11034b = l10;
        this.f11033W = i4;
        this.f11035f9 = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j5;
        int b2 = mXi.b("async_request_token_generation");
        Long l10 = this.f11034b;
        if (l10 != null) {
            j5 = l10.longValue();
        } else {
            j5 = 0;
        }
        EP.b("generateRequestTokenWithStatus", j5, false, new AeE(b2, this.f11033W, this.f11035f9));
        return Unit.INSTANCE;
    }
}
