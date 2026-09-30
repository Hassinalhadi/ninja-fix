package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.usecase.CheckIsAccountAvailableUseCase;
import kotlin.Unit;

/* renamed from: com.checkout.components.rememberme.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0951j extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f5961a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CheckIsAccountAvailableUseCase f5963c;

    /* renamed from: d, reason: collision with root package name */
    public int f5964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0951j(CheckIsAccountAvailableUseCase checkIsAccountAvailableUseCase, Nd.c cVar) {
        super(cVar);
        this.f5963c = checkIsAccountAvailableUseCase;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5962b = obj;
        this.f5964d |= RecyclerView.UNDEFINED_DURATION;
        return this.f5963c.execute((String) null, (Nd.c<? super Unit>) this);
    }
}
