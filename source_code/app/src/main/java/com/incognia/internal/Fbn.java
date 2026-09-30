package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Fbn extends Lambda implements Function0 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f8716W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zC f8717b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fbn(zC zCVar, String str) {
        super(0);
        this.f8717b = zCVar;
        this.f8716W = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f8717b.PqK.b(this.f8716W);
        return Unit.INSTANCE;
    }
}
