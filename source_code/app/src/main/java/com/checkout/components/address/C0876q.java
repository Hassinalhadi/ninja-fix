package com.checkout.components.address;

import kotlin.Unit;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;
import yf.at;

/* renamed from: com.checkout.components.address.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0876q implements InterfaceC3439i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3439i f3904a;

    public C0876q(at atVar) {
        this.f3904a = atVar;
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        Object collect = this.f3904a.collect(new C0875p(interfaceC3440j), cVar);
        if (collect == Od.a.alpha) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
