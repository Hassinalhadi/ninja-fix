package com.checkout.components.card;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Result;

/* renamed from: com.checkout.components.card.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0898n extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f4251a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CardComponent f4253c;

    /* renamed from: d, reason: collision with root package name */
    public int f4254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0898n(CardComponent cardComponent, Nd.c cVar) {
        super(cVar);
        this.f4253c = cardComponent;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4252b = obj;
        this.f4254d |= RecyclerView.UNDEFINED_DURATION;
        Object m67onSendCardMetaDataRequestgIAlus = this.f4253c.m67onSendCardMetaDataRequestgIAlus(null, this);
        if (m67onSendCardMetaDataRequestgIAlus == Od.a.alpha) {
            return m67onSendCardMetaDataRequestgIAlus;
        }
        return new Result(m67onSendCardMetaDataRequestgIAlus);
    }
}
