package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.data.ConsumerRepository;
import kotlin.Result;

/* renamed from: com.checkout.components.rememberme.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0963n extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6146a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6147b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6148c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6149d;
    public /* synthetic */ Object e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ConsumerRepository f6150f;

    /* renamed from: g, reason: collision with root package name */
    public int f6151g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0963n(ConsumerRepository consumerRepository, Nd.c cVar) {
        super(cVar);
        this.f6150f = consumerRepository;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f6151g |= RecyclerView.UNDEFINED_DURATION;
        Object m127createMerchantTokenyxL6bBk = this.f6150f.m127createMerchantTokenyxL6bBk(null, null, null, null, this);
        if (m127createMerchantTokenyxL6bBk == Od.a.alpha) {
            return m127createMerchantTokenyxL6bBk;
        }
        return new Result(m127createMerchantTokenyxL6bBk);
    }
}
