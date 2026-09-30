package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.data.ConsumerRepository;
import kotlin.Result;

/* renamed from: com.checkout.components.rememberme.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0969p extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6170a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6171b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6172c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConsumerRepository f6173d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0969p(ConsumerRepository consumerRepository, Nd.c cVar) {
        super(cVar);
        this.f6173d = consumerRepository;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f6172c = obj;
        this.e |= RecyclerView.UNDEFINED_DURATION;
        Object m128getWallet0E7RQCE = this.f6173d.m128getWallet0E7RQCE(null, null, this);
        if (m128getWallet0E7RQCE == Od.a.alpha) {
            return m128getWallet0E7RQCE;
        }
        return new Result(m128getWallet0E7RQCE);
    }
}
