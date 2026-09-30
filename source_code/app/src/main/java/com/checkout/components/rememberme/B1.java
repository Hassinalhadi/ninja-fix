package com.checkout.components.rememberme;

import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.data.PrimitiveStateRepository;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.rememberme.data.ConsumerRepository;
import com.checkout.components.rememberme.data.TokeniseRepository;
import com.checkout.components.rememberme.di.UseCaseModule;
import com.checkout.components.rememberme.model.RememberMeCallback;
import com.checkout.components.rememberme.model.SubmitSavedCardUseCaseRequest;
import com.checkout.components.rememberme.ui.manager.RMStateManager;
import com.checkout.components.rememberme.utils.JWTDecoder;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2763s0;

/* loaded from: classes3.dex */
public final class B1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final UseCaseModule f5719a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f5720b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f5721c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f5722d;
    public final dagger.internal.d e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.d f5723f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.d f5724g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.d f5725h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.d f5726i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.d f5727j;

    /* renamed from: k, reason: collision with root package name */
    public final dagger.internal.d f5728k;

    /* renamed from: l, reason: collision with root package name */
    public final dagger.internal.d f5729l;

    /* renamed from: m, reason: collision with root package name */
    public final dagger.internal.d f5730m;

    /* renamed from: n, reason: collision with root package name */
    public final dagger.internal.d f5731n;

    /* renamed from: o, reason: collision with root package name */
    public final dagger.internal.d f5732o;

    public B1(UseCaseModule useCaseModule, C0975r c0975r, C0992w1 c0992w1, dagger.internal.d dVar, dagger.internal.b bVar, dagger.internal.b bVar2, dagger.internal.d dVar2, dagger.internal.d dVar3, C1 c12, dagger.internal.b bVar3, dagger.internal.b bVar4, dagger.internal.b bVar5, dagger.internal.d dVar4, dagger.internal.b bVar6, dagger.internal.d dVar5) {
        this.f5719a = useCaseModule;
        this.f5720b = c0975r;
        this.f5721c = c0992w1;
        this.f5722d = dVar;
        this.e = bVar;
        this.f5723f = bVar2;
        this.f5724g = dVar2;
        this.f5725h = dVar3;
        this.f5726i = c12;
        this.f5727j = bVar3;
        this.f5728k = bVar4;
        this.f5729l = bVar5;
        this.f5730m = dVar4;
        this.f5731n = bVar6;
        this.f5732o = dVar5;
    }

    @Override // Kd.a
    public final Object get() {
        SubmitSavedCardUseCaseRequest provideSubmitSavedCardUseCaseRequest = this.f5719a.provideSubmitSavedCardUseCaseRequest(new JWTDecoder(), (ConsumerRepository) this.f5720b.get(), (TokeniseRepository) this.f5721c.get(), (PrimitiveStateFlowRepository) this.f5722d.get(), (String) this.e.get(), (Xd.l) this.f5723f.get(), (PrimitiveStateFlowRepository) this.f5724g.get(), (PrimitiveStateFlowRepository) this.f5725h.get(), (Mapper) this.f5726i.get(), (Function1) this.f5727j.get(), (LogDetails) this.f5728k.get(), (RememberMeCallback) this.f5729l.get(), (RMStateManager) this.f5730m.get(), (Logger) this.f5731n.get(), (PrimitiveStateRepository) this.f5732o.get());
        AbstractC2763s0.delta(provideSubmitSavedCardUseCaseRequest);
        return provideSubmitSavedCardUseCaseRequest;
    }
}
