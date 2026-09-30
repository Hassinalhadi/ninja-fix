package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class ZAg extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10030b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZAg(String str) {
        super(1);
        this.f10030b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).f8674M = this.f10030b;
        return Unit.INSTANCE;
    }
}
