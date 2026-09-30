package com.checkout.components.card;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.operations.tokenisation.repository.TokenRepositoryImpl;
import com.checkout.components.interfaces.model.CardTokenDetails;

/* loaded from: classes3.dex */
public final class c0 extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f4000a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4001b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4002c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4003d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public CardTokenDetails f4004f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4005g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4006h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TokenRepositoryImpl f4007i;

    /* renamed from: j, reason: collision with root package name */
    public int f4008j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(TokenRepositoryImpl tokenRepositoryImpl, Nd.c cVar) {
        super(cVar);
        this.f4007i = tokenRepositoryImpl;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4006h = obj;
        this.f4008j |= RecyclerView.UNDEFINED_DURATION;
        return TokenRepositoryImpl.access$handleSuccess(this.f4007i, null, null, null, false, this);
    }
}
