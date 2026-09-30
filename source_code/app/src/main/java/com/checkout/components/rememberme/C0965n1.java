package com.checkout.components.rememberme;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.di.DefaultStyleProvider;
import com.checkout.components.rememberme.di.StyleModule;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import s6.AbstractC2763s0;

/* renamed from: com.checkout.components.rememberme.n1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0965n1 implements dagger.internal.b {

    /* renamed from: a, reason: collision with root package name */
    public final StyleModule f6154a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.d f6155b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.d f6156c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.d f6157d;
    public final dagger.internal.d e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.d f6158f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.d f6159g;

    public C0965n1(StyleModule styleModule, dagger.internal.d dVar, dagger.internal.d dVar2, dagger.internal.d dVar3, dagger.internal.d dVar4, dagger.internal.d dVar5, dagger.internal.b bVar) {
        this.f6154a = styleModule;
        this.f6155b = dVar;
        this.f6156c = dVar2;
        this.f6157d = dVar3;
        this.e = dVar4;
        this.f6158f = dVar5;
        this.f6159g = bVar;
    }

    @Override // Kd.a
    public final Object get() {
        DefaultStyleProvider styleProvider = this.f6154a.styleProvider((ResourceProvider) this.f6155b.get(), (Mapper) this.f6156c.get(), (Mapper) this.f6157d.get(), (Mapper) this.e.get(), (TextLabelStyleToStateMapper) this.f6158f.get(), (DesignTokens) this.f6159g.get());
        AbstractC2763s0.delta(styleProvider);
        return styleProvider;
    }
}
