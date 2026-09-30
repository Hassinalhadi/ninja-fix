package com.incognia.internal;

import ao.ad;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class GQ extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lhI f8768b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GQ(lhI lhi) {
        super(1);
        this.f8768b = lhi;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        D5f d5f = this.f8768b.DOu;
        d5f.getClass();
        if (!(d5f instanceof L4)) {
            Iterator it = this.f8768b.gmP.iterator();
            if (it.hasNext()) {
                throw ad.yankee(it);
            }
        }
        return Unit.INSTANCE;
    }
}
