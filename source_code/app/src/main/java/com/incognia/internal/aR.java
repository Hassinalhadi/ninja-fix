package com.incognia.internal;

import com.incognia.EventLocation;
import com.incognia.EventProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class aR extends Lambda implements Function0 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ EventProperties f10098J;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f10099W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10100b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ EventLocation f10101f9;
    public final /* synthetic */ String gmP;
    public final /* synthetic */ String sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aR(String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties) {
        super(0);
        this.f10100b = str;
        this.f10099W = str2;
        this.f10101f9 = eventLocation;
        this.sVU = str3;
        this.gmP = str4;
        this.f10098J = eventProperties;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        rfS.b(this.f10100b, "accountId");
        rfS.b(this.f10099W, "externalId");
        zC b2 = X8.b();
        String str = this.f10100b;
        String str2 = this.f10099W;
        EventLocation eventLocation = this.f10101f9;
        String str3 = this.sVU;
        String str4 = this.gmP;
        EventProperties eventProperties = this.f10098J;
        b2.getClass();
        b2.b(eZh.f10376W, new jlY(b2, str2, eventLocation, str3, str4, eventProperties, str));
        return Unit.INSTANCE;
    }
}
