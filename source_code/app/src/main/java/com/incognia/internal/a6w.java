package com.incognia.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class a6w extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10086b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6w(String str) {
        super(1);
        this.f10086b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(Intrinsics.areEqual(((sD) obj).f11281b, this.f10086b));
    }
}
