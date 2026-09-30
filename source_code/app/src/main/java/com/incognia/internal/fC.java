package com.incognia.internal;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class fC extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f10405b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fC(List list) {
        super(1);
        this.f10405b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FM4) obj).nMp = this.f10405b;
        return Unit.INSTANCE;
    }
}
