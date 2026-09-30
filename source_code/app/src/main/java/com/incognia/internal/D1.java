package com.incognia.internal;

import com.incognia.EventAddress;
import com.incognia.EventProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class D1 extends Lambda implements Function0 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ String f8512J;
    public final /* synthetic */ String PqK;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f8513W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zC f8514b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ EventAddress f8515f9;
    public final /* synthetic */ EventProperties gmP;
    public final /* synthetic */ String sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(zC zCVar, String str, EventAddress eventAddress, String str2, EventProperties eventProperties, String str3, String str4) {
        super(0);
        this.f8514b = zCVar;
        this.f8513W = str;
        this.f8515f9 = eventAddress;
        this.sVU = str2;
        this.gmP = eventProperties;
        this.f8512J = str3;
        this.PqK = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        zC zCVar = this.f8514b;
        String str = this.f8513W;
        EventAddress eventAddress = this.f8515f9;
        k7Q b2 = zCVar.olU.b(str, this.sVU, this.gmP, this.f8512J, this.PqK);
        zCVar.f11892R.getClass();
        this.f8514b.sVU.f10849W.set(new ao(b2, l66.b(eventAddress)));
        return Unit.INSTANCE;
    }
}
