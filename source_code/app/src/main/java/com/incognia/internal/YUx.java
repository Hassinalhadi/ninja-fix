package com.incognia.internal;

import com.incognia.EventLocation;
import com.incognia.EventProperties;
import com.incognia.Incognia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class YUx extends Lambda implements Function0 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ EventProperties f9993J;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f9994W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9995b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ EventLocation f9996f9;
    public final /* synthetic */ String gmP;
    public final /* synthetic */ String sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YUx(String str, String str2, EventLocation eventLocation, String str3, String str4, EventProperties eventProperties) {
        super(0);
        this.f9995b = str;
        this.f9994W = str2;
        this.f9996f9 = eventLocation;
        this.sVU = str3;
        this.gmP = str4;
        this.f9993J = eventProperties;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Incognia.INSTANCE.runOnIncogniaThreadIfInitialized("sendLoginEvent", new aR(this.f9995b, this.f9994W, this.f9996f9, this.sVU, this.gmP, this.f9993J));
        return Unit.INSTANCE;
    }
}
