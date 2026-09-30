package com.checkout.components.core;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.risk.RiskFactory;
import kotlin.Result;

/* loaded from: classes3.dex */
public final class G extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RiskFactory f4630b;

    /* renamed from: c, reason: collision with root package name */
    public int f4631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(RiskFactory riskFactory, Nd.c cVar) {
        super(cVar);
        this.f4630b = riskFactory;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4629a = obj;
        this.f4631c |= RecyclerView.UNDEFINED_DURATION;
        Object m84buildIoAF18A$core_standardRelease = this.f4630b.m84buildIoAF18A$core_standardRelease(this);
        if (m84buildIoAF18A$core_standardRelease == Od.a.alpha) {
            return m84buildIoAF18A$core_standardRelease;
        }
        return new Result(m84buildIoAF18A$core_standardRelease);
    }
}
