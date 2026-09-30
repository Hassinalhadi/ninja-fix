package com.incognia.internal;

import com.incognia.EventAddress;
import com.incognia.EventProperties;
import com.incognia.Incognia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class qR extends Lambda implements Function0 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ String f11143J;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f11144W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11145b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ EventAddress f11146f9;
    public final /* synthetic */ EventProperties gmP;
    public final /* synthetic */ String sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qR(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4) {
        super(0);
        this.f11145b = str;
        this.f11144W = str2;
        this.f11146f9 = eventAddress;
        this.sVU = str3;
        this.gmP = eventProperties;
        this.f11143J = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThreadIfInitialized("sendCustomEvent", new vf(this.f11145b, this.f11144W, this.f11146f9, this.sVU, this.gmP, this.f11143J));
        return Unit.INSTANCE;
    }
}
