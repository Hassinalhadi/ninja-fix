package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Ov extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9373b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ov(String str) {
        super(1);
        this.f9373b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).olU = this.f9373b;
        return Unit.INSTANCE;
    }
}
