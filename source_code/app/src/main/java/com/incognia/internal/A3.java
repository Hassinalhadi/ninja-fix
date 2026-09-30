package com.incognia.internal;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class A3 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8335b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(ArrayList arrayList) {
        super(1);
        this.f8335b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).f8675O = this.f8335b;
        return Unit.INSTANCE;
    }
}
