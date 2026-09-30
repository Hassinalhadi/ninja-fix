package com.incognia.internal;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class i75 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f10606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i75(List list) {
        super(1);
        this.f10606b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).Btp = this.f10606b;
        return Unit.INSTANCE;
    }
}
