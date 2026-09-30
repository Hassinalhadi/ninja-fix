package com.incognia.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class QS3 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9498b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QS3(String str) {
        super(1);
        this.f9498b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).f8695u = this.f9498b;
        return Unit.INSTANCE;
    }
}
