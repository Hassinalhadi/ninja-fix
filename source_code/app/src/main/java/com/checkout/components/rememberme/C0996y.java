package com.checkout.components.rememberme;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Result;

/* renamed from: com.checkout.components.rememberme.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0996y extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f6415a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6416b;

    /* renamed from: c, reason: collision with root package name */
    public int f6417c;

    public C0996y(Pd.c cVar) {
        super(cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f6416b = obj;
        this.f6417c |= RecyclerView.UNDEFINED_DURATION;
        Object a6 = AbstractC0999z.a(null, this);
        if (a6 == Od.a.alpha) {
            return a6;
        }
        return new Result(a6);
    }
}
