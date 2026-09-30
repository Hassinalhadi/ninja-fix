package com.incognia.internal;

import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class hIA extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f10533b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hIA(O o5) {
        super(1);
        this.f10533b = o5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        this.f10533b.invoke(new N6W(appSetIdInfo.getId(), appSetIdInfo.getScope()));
        return Unit.INSTANCE;
    }
}
