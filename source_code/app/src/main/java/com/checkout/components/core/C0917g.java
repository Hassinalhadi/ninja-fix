package com.checkout.components.core;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.ui.FlowComponent;

/* renamed from: com.checkout.components.core.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0917g extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowComponent f4806b;

    /* renamed from: c, reason: collision with root package name */
    public int f4807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0917g(FlowComponent flowComponent, Nd.c cVar) {
        super(cVar);
        this.f4806b = flowComponent;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4805a = obj;
        this.f4807c |= RecyclerView.UNDEFINED_DURATION;
        return this.f4806b.isValid(this);
    }
}
