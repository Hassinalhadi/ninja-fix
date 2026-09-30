package com.checkout.components.core;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.risk.RiskManager;
import kotlin.Result;

/* loaded from: classes3.dex */
public final class I extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RiskManager f4635b;

    /* renamed from: c, reason: collision with root package name */
    public int f4636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(RiskManager riskManager, Nd.c cVar) {
        super(cVar);
        this.f4635b = riskManager;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4634a = obj;
        this.f4636c |= RecyclerView.UNDEFINED_DURATION;
        Object m85performInitializeIoAF18A$core_standardRelease = this.f4635b.m85performInitializeIoAF18A$core_standardRelease(this);
        if (m85performInitializeIoAF18A$core_standardRelease == Od.a.alpha) {
            return m85performInitializeIoAF18A$core_standardRelease;
        }
        return new Result(m85performInitializeIoAF18A$core_standardRelease);
    }
}
