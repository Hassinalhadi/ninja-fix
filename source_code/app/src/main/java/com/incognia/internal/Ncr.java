package com.incognia.internal;

import com.incognia.Callback;
import com.incognia.Incognia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Ncr extends Lambda implements Function0 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ int f9239W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f9240b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ Callback f9241f9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ncr(Long l10, int i4, Callback callback) {
        super(0);
        this.f9240b = l10;
        this.f9239W = i4;
        this.f9241f9 = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThread(new ok(this.f9240b, this.f9239W, this.f9241f9));
        return Unit.INSTANCE;
    }
}
