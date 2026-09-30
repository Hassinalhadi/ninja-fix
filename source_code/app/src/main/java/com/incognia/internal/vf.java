package com.incognia.internal;

import com.incognia.EventAddress;
import com.incognia.EventProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class vf extends Lambda implements Function0 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ String f11558J;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f11559W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11560b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ EventAddress f11561f9;
    public final /* synthetic */ EventProperties gmP;
    public final /* synthetic */ String sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4) {
        super(0);
        this.f11560b = str;
        this.f11559W = str2;
        this.f11561f9 = eventAddress;
        this.sVU = str3;
        this.gmP = eventProperties;
        this.f11558J = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        rfS.b(this.f11560b, "accountId");
        rfS.b(this.f11559W, "externalId");
        zC b2 = X8.b();
        String str = this.f11560b;
        String str2 = this.f11559W;
        EventAddress eventAddress = this.f11561f9;
        String str3 = this.sVU;
        EventProperties eventProperties = this.gmP;
        String str4 = this.f11558J;
        b2.getClass();
        b2.b(jU9.f10689W, new D1(b2, str2, eventAddress, str3, eventProperties, str4, str));
        return Unit.INSTANCE;
    }
}
