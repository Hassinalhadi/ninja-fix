package com.checkout.components.card;

import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.card.operations.network.repository.CardMetaDataRepositoryImpl;
import kotlin.Result;

/* renamed from: com.checkout.components.card.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0903s extends Pd.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f4391a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CardMetaDataRepositoryImpl f4393c;

    /* renamed from: d, reason: collision with root package name */
    public int f4394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0903s(CardMetaDataRepositoryImpl cardMetaDataRepositoryImpl, Nd.c cVar) {
        super(cVar);
        this.f4393c = cardMetaDataRepositoryImpl;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        this.f4392b = obj;
        this.f4394d |= RecyclerView.UNDEFINED_DURATION;
        Object mo76sendCardMetaDataRequestgIAlus = this.f4393c.mo76sendCardMetaDataRequestgIAlus(null, this);
        if (mo76sendCardMetaDataRequestgIAlus == Od.a.alpha) {
            return mo76sendCardMetaDataRequestgIAlus;
        }
        return new Result(mo76sendCardMetaDataRequestgIAlus);
    }
}
