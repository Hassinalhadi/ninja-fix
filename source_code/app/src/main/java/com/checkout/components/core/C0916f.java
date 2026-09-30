package com.checkout.components.core;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.ui.FlowComponent;

/* renamed from: com.checkout.components.core.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0916f extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowComponent f4790b;

    /* renamed from: c, reason: collision with root package name */
    public int f4791c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0916f(FlowComponent flowComponent, Nd.c cVar) {
        super(cVar);
        this.f4790b = flowComponent;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4789a = obj;
        this.f4791c |= RecyclerView.UNDEFINED_DURATION;
        return this.f4790b.isAvailable(this);
    }
}
