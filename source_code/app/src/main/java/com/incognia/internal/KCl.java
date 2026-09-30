package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class KCl extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f8997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCl(Long l10) {
        super(1);
        this.f8997b = l10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).WdK = this.f8997b;
        return Unit.INSTANCE;
    }
}
