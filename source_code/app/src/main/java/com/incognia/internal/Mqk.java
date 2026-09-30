package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Mqk extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f9172b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mqk(Long l10) {
        super(1);
        this.f9172b = l10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).fI = this.f9172b;
        return Unit.INSTANCE;
    }
}
