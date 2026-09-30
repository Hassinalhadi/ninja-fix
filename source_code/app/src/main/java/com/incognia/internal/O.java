package com.incognia.internal;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class O extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ HN f9280W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WA f9281b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(WA wa2, HN hn) {
        super(1);
        this.f9281b = wa2;
        this.f9280W = hn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WA wa2 = this.f9281b;
        Result.Companion companion = Result.INSTANCE;
        wa2.b(Result.m206constructorimpl(new b((String) this.f9280W.f8838W.getValue(), (N6W) obj)));
        return Unit.INSTANCE;
    }
}
