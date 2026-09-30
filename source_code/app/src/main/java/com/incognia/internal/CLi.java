package com.incognia.internal;

import android.app.Application;
import com.incognia.IncogniaOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class CLi extends Lambda implements Function0 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ IncogniaOptions f8444W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f8445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLi(Application application, IncogniaOptions incogniaOptions) {
        super(0);
        this.f8445b = application;
        this.f8444W = incogniaOptions;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        pl2 pl2Var = RjL.f9562b;
        RjL.b(this.f8445b, this.f8444W);
        return Unit.INSTANCE;
    }
}
