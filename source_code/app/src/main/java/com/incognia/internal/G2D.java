package com.incognia.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class G2D extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r9 f8746b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G2D(r9 r9Var) {
        super(1);
        this.f8746b = r9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        D5f d5f = this.f8746b.sVU;
        d5f.getClass();
        if (!(d5f instanceof L4)) {
            for (Map.Entry entry : this.f8746b.gmP.entrySet()) {
                String str = (String) entry.getKey();
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(str);
                }
            }
            Iterator it2 = this.f8746b.gmP.entrySet().iterator();
            while (it2.hasNext()) {
                ((List) ((Map.Entry) it2.next()).getValue()).clear();
            }
        }
        return Unit.INSTANCE;
    }
}
