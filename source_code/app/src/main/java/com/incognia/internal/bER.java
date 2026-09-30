package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class bER extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10164b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bER(String str) {
        super(1);
        this.f10164b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).wcf = this.f10164b;
        return Unit.INSTANCE;
    }
}
