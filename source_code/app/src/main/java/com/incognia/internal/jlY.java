package com.incognia.internal;

import com.incognia.EventLocation;
import com.incognia.EventProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class jlY extends Lambda implements Function0 {

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ EventProperties f10706J;
    public final /* synthetic */ String PqK;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f10707W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zC f10708b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ EventLocation f10709f9;
    public final /* synthetic */ String gmP;
    public final /* synthetic */ String sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlY(zC zCVar, String str, EventLocation eventLocation, String str2, String str3, EventProperties eventProperties, String str4) {
        super(0);
        this.f10708b = zCVar;
        this.f10707W = str;
        this.f10709f9 = eventLocation;
        this.sVU = str2;
        this.gmP = str3;
        this.f10706J = eventProperties;
        this.PqK = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        zm zmVar;
        zC zCVar = this.f10708b;
        String str = this.f10707W;
        EventLocation eventLocation = this.f10709f9;
        String str2 = this.sVU;
        k7Q b2 = zCVar.olU.b(str, this.gmP, this.f10706J, str2, this.PqK);
        zCVar.DOu.getClass();
        if (eventLocation == null) {
            zmVar = null;
        } else {
            zmVar = new zm(eventLocation.getLatitude(), eventLocation.getLongitude(), eventLocation.getTimestamp());
        }
        this.f10708b.f11896f9.f10449W.set(new FzF(b2, zmVar));
        return Unit.INSTANCE;
    }
}
