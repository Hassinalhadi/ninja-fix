package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.rememberme.usecase.SubmitSavedCardUseCase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.checkout.components.rememberme.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0974q1 extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6182a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6183b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6184c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6185d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6186f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6187g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6188h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6189i;

    /* renamed from: j, reason: collision with root package name */
    public Object f6190j;

    /* renamed from: k, reason: collision with root package name */
    public Object f6191k;

    /* renamed from: l, reason: collision with root package name */
    public Object f6192l;

    /* renamed from: m, reason: collision with root package name */
    public int f6193m;

    /* renamed from: n, reason: collision with root package name */
    public int f6194n;

    /* renamed from: o, reason: collision with root package name */
    public int f6195o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f6196p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ SubmitSavedCardUseCase f6197q;

    /* renamed from: r, reason: collision with root package name */
    public int f6198r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0974q1(SubmitSavedCardUseCase submitSavedCardUseCase, Nd.c cVar) {
        super(cVar);
        this.f6197q = submitSavedCardUseCase;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f6196p = obj;
        this.f6198r |= RecyclerView.UNDEFINED_DURATION;
        return this.f6197q.execute2((Function0<Unit>) null, (Nd.c<? super Unit>) this);
    }
}
