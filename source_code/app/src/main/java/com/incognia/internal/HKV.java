package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class HKV extends Lambda implements Function0 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f8833W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zC f8834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HKV(zC zCVar, String str) {
        super(0);
        this.f8834b = zCVar;
        this.f8833W = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f8834b.f11894W.b(this.f8833W);
        this.f8834b.PqK.f9();
        return Unit.INSTANCE;
    }
}
