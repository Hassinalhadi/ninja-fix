package com.incognia.internal;

import com.incognia.EventAddress;
import com.incognia.EventProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class X9 extends Lambda implements Function0 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ String f9895J;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f9896W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9897b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ EventAddress f9898f9;
    public final /* synthetic */ EventProperties gmP;
    public final /* synthetic */ String sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X9(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4) {
        super(0);
        this.f9897b = str;
        this.f9896W = str2;
        this.f9898f9 = eventAddress;
        this.sVU = str3;
        this.gmP = eventProperties;
        this.f9895J = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        rfS.b(this.f9897b, "accountId");
        rfS.b(this.f9896W, "externalId");
        zC b2 = X8.b();
        String str = this.f9897b;
        String str2 = this.f9896W;
        EventAddress eventAddress = this.f9898f9;
        String str3 = this.sVU;
        EventProperties eventProperties = this.gmP;
        String str4 = this.f9895J;
        b2.getClass();
        b2.b(m3v.f10875W, new DH(b2, str2, eventAddress, str3, eventProperties, str4, str));
        return Unit.INSTANCE;
    }
}
