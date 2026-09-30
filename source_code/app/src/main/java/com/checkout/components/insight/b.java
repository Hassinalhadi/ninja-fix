package com.checkout.components.insight;

import Pd.i;
import Xd.l;
import com.checkout.components.insight.data.dto.ErrorDetails;
import com.checkout.components.insight.data.dto.Events;
import com.checkout.components.insight.data.dto.Properties;
import com.checkout.components.interfaces.insight.LogLevel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class b extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoggerManager f5125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LogLevel f5127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ErrorDetails f5128d;
    public final /* synthetic */ Properties e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LoggerManager loggerManager, LogLevel logLevel, String str, ErrorDetails errorDetails, Properties properties, Nd.c cVar) {
        super(2, cVar);
        this.f5125a = loggerManager;
        this.f5126b = str;
        this.f5127c = logLevel;
        this.f5128d = errorDetails;
        this.e = properties;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new b(this.f5125a, this.f5127c, this.f5126b, this.f5128d, this.e, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Events a6;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        a6 = this.f5125a.a(this.f5127c, this.f5126b, this.f5128d, this.e);
        this.f5125a.sendEvent(a6);
        return Unit.INSTANCE;
    }
}
