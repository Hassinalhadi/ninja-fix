package com.checkout.components.core;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.risk.RiskManager;

/* loaded from: classes3.dex */
public final class K extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f4641a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RiskManager f4643c;

    /* renamed from: d, reason: collision with root package name */
    public int f4644d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(RiskManager riskManager, Nd.c cVar) {
        super(cVar);
        this.f4643c = riskManager;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4642b = obj;
        this.f4644d |= RecyclerView.UNDEFINED_DURATION;
        return this.f4643c.publishRiskData$core_standardRelease(null, this);
    }
}
