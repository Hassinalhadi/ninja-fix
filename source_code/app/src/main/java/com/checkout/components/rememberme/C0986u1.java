package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.data.TokeniseRepository;
import kotlin.Result;

/* renamed from: com.checkout.components.rememberme.u1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0986u1 extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6320a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6321b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TokeniseRepository f6323d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0986u1(TokeniseRepository tokeniseRepository, Nd.c cVar) {
        super(cVar);
        this.f6323d = tokeniseRepository;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f6322c = obj;
        this.e |= RecyclerView.UNDEFINED_DURATION;
        Object m129createCvvToken0E7RQCE = this.f6323d.m129createCvvToken0E7RQCE(null, null, this);
        if (m129createCvvToken0E7RQCE == Od.a.alpha) {
            return m129createCvvToken0E7RQCE;
        }
        return new Result(m129createCvvToken0E7RQCE);
    }
}
