package com.incognia.internal;

import android.util.Log;
import com.incognia.EventLocation;
import com.incognia.EventProperties;
import com.incognia.PaymentCoupon;
import com.incognia.PaymentMethod;
import com.incognia.PaymentValue;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class VvX extends Lambda implements Function0 {
    public final /* synthetic */ String DOu;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ List f9805J;
    public final /* synthetic */ PaymentValue PqK;

    /* renamed from: R, reason: collision with root package name */
    public final /* synthetic */ EventProperties f9806R;

    /* renamed from: V, reason: collision with root package name */
    public final /* synthetic */ PaymentCoupon f9807V;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f9808W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9809b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ String f9810f9;
    public final /* synthetic */ EventLocation gmP;
    public final /* synthetic */ String olU;
    public final /* synthetic */ List sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VvX(String str, String str2, EventLocation eventLocation, List list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List list2, String str3, String str4, EventProperties eventProperties, String str5) {
        super(0);
        this.f9809b = str;
        this.f9808W = str2;
        this.f9810f9 = str3;
        this.sVU = list;
        this.gmP = eventLocation;
        this.f9805J = list2;
        this.PqK = paymentValue;
        this.f9807V = paymentCoupon;
        this.olU = str4;
        this.f9806R = eventProperties;
        this.DOu = str5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        rfS.b(this.f9809b, "accountId");
        rfS.b(this.f9808W, "externalId");
        rfS.b(this.f9810f9, "storeId");
        List<PaymentMethod> list = this.sVU;
        if (list != null) {
            for (PaymentMethod paymentMethod : list) {
                String str = KC.f8995b;
                if (!KC.b(paymentMethod.getCreditCardInfo()) || !KC.b(paymentMethod.getDebitCardInfo())) {
                    if (eSs.f10363b.get()) {
                        Log.e("Incognia", "Invalid payment method information received: \n                    make sure that the card information is valid.");
                    }
                }
            }
        }
        zC b2 = X8.b();
        String str2 = this.f9809b;
        String str3 = this.f9808W;
        EventLocation eventLocation = this.gmP;
        List list2 = this.f9805J;
        PaymentValue paymentValue = this.PqK;
        PaymentCoupon paymentCoupon = this.f9807V;
        List list3 = this.sVU;
        String str4 = this.f9810f9;
        String str5 = this.olU;
        EventProperties eventProperties = this.f9806R;
        String str6 = this.DOu;
        b2.getClass();
        b2.b(U3g.f9691W, new Jj(b2, str3, eventLocation, list2, paymentValue, paymentCoupon, list3, str4, str5, eventProperties, str6, str2));
        return Unit.INSTANCE;
    }
}
