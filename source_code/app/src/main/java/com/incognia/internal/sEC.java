package com.incognia.internal;

import com.incognia.Callback;
import com.incognia.Incognia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class sEC extends Lambda implements Function0 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ int f11283W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f11284b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ Callback f11285f9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sEC(Long l10, int i4, Callback callback) {
        super(0);
        this.f11284b = l10;
        this.f11283W = i4;
        this.f11285f9 = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThread(new ay(this.f11284b, this.f11283W, this.f11285f9));
        return Unit.INSTANCE;
    }
}
