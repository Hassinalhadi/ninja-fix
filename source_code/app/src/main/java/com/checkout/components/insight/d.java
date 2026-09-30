package com.checkout.components.insight;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.insight.usecase.SendLogsUseCase;

/* loaded from: classes3.dex */
public final class d extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f5133a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5134b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5135c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SendLogsUseCase f5136d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SendLogsUseCase sendLogsUseCase, Nd.c cVar) {
        super(cVar);
        this.f5136d = sendLogsUseCase;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5135c = obj;
        this.e |= RecyclerView.UNDEFINED_DURATION;
        return this.f5136d.invoke(null, null, this);
    }
}
