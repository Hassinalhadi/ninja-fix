package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.usecase.CheckIsAccountAvailablePrefilledUseCase;
import kotlin.Unit;

/* renamed from: com.checkout.components.rememberme.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0945h extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f5936a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CheckIsAccountAvailablePrefilledUseCase f5938c;

    /* renamed from: d, reason: collision with root package name */
    public int f5939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0945h(CheckIsAccountAvailablePrefilledUseCase checkIsAccountAvailablePrefilledUseCase, Nd.c cVar) {
        super(cVar);
        this.f5938c = checkIsAccountAvailablePrefilledUseCase;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f5937b = obj;
        this.f5939d |= RecyclerView.UNDEFINED_DURATION;
        return this.f5938c.execute((String) null, (Nd.c<? super Unit>) this);
    }
}
