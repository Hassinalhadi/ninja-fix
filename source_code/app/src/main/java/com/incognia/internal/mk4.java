package com.incognia.internal;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class mk4 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk4(boolean z2) {
        super(0);
        this.f10918b = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        dGS dgs = ((Q6I) X8.W()).f9467K;
        boolean z2 = this.f10918b;
        if (!Intrinsics.areEqual(Boolean.valueOf(z2), (Boolean) dgs.f10305b.get())) {
            QHn.f9492b.b(dGS.sVU, Boolean.valueOf(z2));
            dgs.f10305b.set(Boolean.valueOf(z2));
            Iterator it = dgs.f10306f9.iterator();
            while (it.hasNext()) {
                ((YKm) it.next()).b(z2);
            }
        }
        return Unit.INSTANCE;
    }
}
