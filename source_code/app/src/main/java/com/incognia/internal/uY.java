package com.incognia.internal;

import com.incognia.EventLocation;
import com.incognia.EventProperties;
import com.incognia.Incognia;
import com.incognia.PaymentCoupon;
import com.incognia.PaymentValue;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class uY extends Lambda implements Function0 {
    public final /* synthetic */ String DOu;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ List f11481J;
    public final /* synthetic */ PaymentValue PqK;

    /* renamed from: R, reason: collision with root package name */
    public final /* synthetic */ EventProperties f11482R;

    /* renamed from: V, reason: collision with root package name */
    public final /* synthetic */ PaymentCoupon f11483V;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f11484W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11485b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ String f11486f9;
    public final /* synthetic */ EventLocation gmP;
    public final /* synthetic */ String olU;
    public final /* synthetic */ List sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uY(String str, String str2, EventLocation eventLocation, List list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List list2, String str3, String str4, EventProperties eventProperties, String str5) {
        super(0);
        this.f11485b = str;
        this.f11484W = str2;
        this.f11486f9 = str3;
        this.sVU = list;
        this.gmP = eventLocation;
        this.f11481J = list2;
        this.PqK = paymentValue;
        this.f11483V = paymentCoupon;
        this.olU = str4;
        this.f11482R = eventProperties;
        this.DOu = str5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Incognia incognia = Incognia.INSTANCE;
        String str = this.f11485b;
        String str2 = this.f11484W;
        String str3 = this.f11486f9;
        List list = this.sVU;
        incognia.runOnIncogniaThreadIfInitialized("sendPaymentEvent", new VvX(str, str2, this.gmP, list, this.PqK, this.f11483V, this.f11481J, str3, this.olU, this.f11482R, this.DOu));
        return Unit.INSTANCE;
    }
}
