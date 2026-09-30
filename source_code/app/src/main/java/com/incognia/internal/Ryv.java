package com.incognia.internal;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Ryv extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ryv(ArrayList arrayList) {
        super(1);
        this.f9568b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).f8699y = this.f9568b;
        return Unit.INSTANCE;
    }
}
