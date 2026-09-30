package com.incognia.internal;

import Xd.l;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class NEA extends Lambda implements l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Czx f9192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NEA(Czx czx) {
        super(2);
        this.f9192b = czx;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        List list = (List) obj2;
        Czx czx = this.f9192b;
        if (czx != null) {
            czx.b(booleanValue, list);
        }
        return Unit.INSTANCE;
    }
}
