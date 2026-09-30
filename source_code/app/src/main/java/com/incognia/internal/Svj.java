package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Svj extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d94 f9630b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Svj(d94 d94Var) {
        super(0);
        this.f9630b = d94Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ArrayList W5 = this.f9630b.W();
        Iterator it = this.f9630b.f10285E.iterator();
        while (it.hasNext()) {
            ((pYm) it.next()).b(W5);
        }
        Iterator it2 = this.f9630b.Qs.iterator();
        while (it2.hasNext()) {
            ((pYm) it2.next()).b(W5);
        }
        this.f9630b.f10285E.clear();
        if (this.f9630b.Qs.isEmpty()) {
            d94 d94Var = this.f9630b;
            if (d94Var.f10293n9) {
                d94Var.f10291b.unregisterReceiver(d94Var.f10290Y);
                d94Var.f10293n9 = false;
            }
        }
        return Unit.INSTANCE;
    }
}
