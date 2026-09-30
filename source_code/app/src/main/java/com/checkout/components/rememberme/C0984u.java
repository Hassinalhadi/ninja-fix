package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.utils.ExtensionsKt;

/* renamed from: com.checkout.components.rememberme.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0984u extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6315a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6316b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6317c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6318d;
    public int e;

    public C0984u(Nd.c cVar) {
        super(cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f6318d = obj;
        this.e |= RecyclerView.UNDEFINED_DURATION;
        return ExtensionsKt.isAccountAvailableForEmail(null, null, this);
    }
}
