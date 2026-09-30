package com.checkout.components.card;

import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.ui.model.CardScheme;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: com.checkout.components.card.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0910z extends Pd.i implements Xd.m {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ CardScheme f4614a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ CardMetadata f4615b;

    public C0910z(Nd.c cVar) {
        super(3, cVar);
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0910z c0910z = new C0910z((Nd.c) obj3);
        c0910z.f4614a = (CardScheme) obj;
        c0910z.f4615b = (CardMetadata) obj2;
        return c0910z.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        CardScheme cardScheme = this.f4614a;
        CardMetadata cardMetadata = this.f4615b;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        return new Pair(cardScheme, cardMetadata);
    }
}
