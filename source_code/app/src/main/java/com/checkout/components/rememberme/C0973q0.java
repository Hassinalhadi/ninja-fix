package com.checkout.components.rememberme;

import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.utils.NavControllerWrapper;
import kotlin.Unit;
import yf.InterfaceC3440j;

/* renamed from: com.checkout.components.rememberme.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0973q0 implements InterfaceC3440j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavControllerWrapper f6181a;

    public C0973q0(NavControllerWrapper navControllerWrapper) {
        this.f6181a = navControllerWrapper;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        this.f6181a.navigate((RememberMeScreen) obj);
        return Unit.INSTANCE;
    }
}
