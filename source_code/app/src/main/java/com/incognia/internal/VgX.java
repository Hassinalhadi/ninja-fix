package com.incognia.internal;

import com.incognia.EventAddress;
import com.incognia.EventProperties;
import com.incognia.Incognia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class VgX extends Lambda implements Function0 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ String f9790J;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f9791W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9792b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ EventAddress f9793f9;
    public final /* synthetic */ EventProperties gmP;
    public final /* synthetic */ String sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VgX(String str, String str2, EventAddress eventAddress, String str3, EventProperties eventProperties, String str4) {
        super(0);
        this.f9792b = str;
        this.f9791W = str2;
        this.f9793f9 = eventAddress;
        this.sVU = str3;
        this.gmP = eventProperties;
        this.f9790J = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThreadIfInitialized("sendOnboardingEvent", new X9(this.f9792b, this.f9791W, this.f9793f9, this.sVU, this.gmP, this.f9790J));
        return Unit.INSTANCE;
    }
}
