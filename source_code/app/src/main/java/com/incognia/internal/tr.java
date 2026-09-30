package com.incognia.internal;

import Xd.l;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class tr extends Lambda implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LTK f11423b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tr(LTK ltk) {
        super(2);
        this.f11423b = ltk;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        Boolean bool = (Boolean) obj2;
        bool.getClass();
        this.f11423b.f9057W.invoke(bool);
        return Unit.INSTANCE;
    }
}
