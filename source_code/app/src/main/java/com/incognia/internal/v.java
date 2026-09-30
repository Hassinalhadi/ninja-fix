package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class v extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11511b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str) {
        super(1);
        this.f11511b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).n4S = this.f11511b;
        return Unit.INSTANCE;
    }
}
