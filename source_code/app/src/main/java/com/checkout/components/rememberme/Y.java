package com.checkout.components.rememberme;

import kotlin.Unit;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class Y implements InterfaceC3439i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3439i f5836a;

    public Y(yf.L l10) {
        this.f5836a = l10;
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        Object collect = this.f5836a.collect(new X(interfaceC3440j), cVar);
        if (collect == Od.a.alpha) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
