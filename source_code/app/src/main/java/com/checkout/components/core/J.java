package com.checkout.components.core;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.risk.RiskManager;

/* loaded from: classes3.dex */
public final class J extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f4637a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RiskManager f4639c;

    /* renamed from: d, reason: collision with root package name */
    public int f4640d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(RiskManager riskManager, Nd.c cVar) {
        super(cVar);
        this.f4639c = riskManager;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4638b = obj;
        this.f4640d |= RecyclerView.UNDEFINED_DURATION;
        return this.f4639c.publishAndHandleRiskResult$core_standardRelease(null, this);
    }
}
