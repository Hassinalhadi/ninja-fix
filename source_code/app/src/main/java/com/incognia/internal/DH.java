package com.incognia.internal;

import com.incognia.EventAddress;
import com.incognia.EventProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class DH extends Lambda implements Function0 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ String f8525J;
    public final /* synthetic */ String PqK;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f8526W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zC f8527b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ EventAddress f8528f9;
    public final /* synthetic */ EventProperties gmP;
    public final /* synthetic */ String sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH(zC zCVar, String str, EventAddress eventAddress, String str2, EventProperties eventProperties, String str3, String str4) {
        super(0);
        this.f8527b = zCVar;
        this.f8526W = str;
        this.f8528f9 = eventAddress;
        this.sVU = str2;
        this.gmP = eventProperties;
        this.f8525J = str3;
        this.PqK = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        zC zCVar = this.f8527b;
        String str = this.f8526W;
        EventAddress eventAddress = this.f8528f9;
        k7Q b2 = zCVar.olU.b(str, this.sVU, this.gmP, this.f8525J, this.PqK);
        zCVar.f11892R.getClass();
        this.f8527b.gmP.f10401W.set(new OH(b2, l66.b(eventAddress)));
        return Unit.INSTANCE;
    }
}
