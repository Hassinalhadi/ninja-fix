package com.incognia.internal;

import com.incognia.CardInfo;
import com.incognia.EventLocation;
import com.incognia.EventProperties;
import com.incognia.PaymentAddress;
import com.incognia.PaymentCoupon;
import com.incognia.PaymentMethod;
import com.incognia.PaymentValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Jj extends Lambda implements Function0 {
    public final /* synthetic */ String DOu;
    public final /* synthetic */ String IB;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ PaymentCoupon f8957J;
    public final /* synthetic */ List PqK;

    /* renamed from: R, reason: collision with root package name */
    public final /* synthetic */ EventProperties f8958R;

    /* renamed from: V, reason: collision with root package name */
    public final /* synthetic */ String f8959V;

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ String f8960W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zC f8961b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ EventLocation f8962f9;
    public final /* synthetic */ PaymentValue gmP;
    public final /* synthetic */ String olU;
    public final /* synthetic */ List sVU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jj(zC zCVar, String str, EventLocation eventLocation, List list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List list2, String str2, String str3, EventProperties eventProperties, String str4, String str5) {
        super(0);
        this.f8961b = zCVar;
        this.f8960W = str;
        this.f8962f9 = eventLocation;
        this.sVU = list;
        this.gmP = paymentValue;
        this.f8957J = paymentCoupon;
        this.PqK = list2;
        this.f8959V = str2;
        this.olU = str3;
        this.f8958R = eventProperties;
        this.DOu = str4;
        this.IB = str5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ArrayList arrayList;
        ArrayList arrayList2;
        zm zmVar;
        JCV jcv;
        Xh xh;
        int collectionSizeOrDefault;
        i3p i3pVar;
        i3p i3pVar2;
        int collectionSizeOrDefault2;
        zC zCVar = this.f8961b;
        String str = this.f8960W;
        EventLocation eventLocation = this.f8962f9;
        List<PaymentAddress> list = this.sVU;
        PaymentValue paymentValue = this.gmP;
        PaymentCoupon paymentCoupon = this.f8957J;
        List<PaymentMethod> list2 = this.PqK;
        String str2 = this.f8959V;
        k7Q b2 = zCVar.olU.b(str, this.olU, this.f8958R, this.DOu, this.IB);
        if (list != null) {
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
            for (PaymentAddress paymentAddress : list) {
                zCVar.IB.getClass();
                arrayList3.add(new n52(paymentAddress.getType(), l66.b(paymentAddress.getAddress())));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (list2 != null) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault);
            for (PaymentMethod paymentMethod : list2) {
                zCVar.Qs.getClass();
                String type = paymentMethod.getType();
                String identifier = paymentMethod.getIdentifier();
                String brand = paymentMethod.getBrand();
                CardInfo creditCardInfo = paymentMethod.getCreditCardInfo();
                if (creditCardInfo == null) {
                    i3pVar = null;
                } else {
                    i3pVar = new i3p(creditCardInfo.getBin(), creditCardInfo.getLastFourDigits(), creditCardInfo.getExpiryYear(), creditCardInfo.getExpiryMonth());
                }
                CardInfo debitCardInfo = paymentMethod.getDebitCardInfo();
                if (debitCardInfo == null) {
                    i3pVar2 = null;
                } else {
                    i3pVar2 = new i3p(debitCardInfo.getBin(), debitCardInfo.getLastFourDigits(), debitCardInfo.getExpiryYear(), debitCardInfo.getExpiryMonth());
                }
                arrayList4.add(new Xqi(type, i3pVar, i3pVar2, identifier, brand));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        zCVar.DOu.getClass();
        if (eventLocation == null) {
            zmVar = null;
        } else {
            zmVar = new zm(eventLocation.getLatitude(), eventLocation.getLongitude(), eventLocation.getTimestamp());
        }
        zCVar.f11897n9.getClass();
        if (paymentValue == null) {
            jcv = null;
        } else {
            jcv = new JCV(paymentValue.getAmount(), paymentValue.getCurrency(), paymentValue.getInstallments(), paymentValue.getDiscountAmount());
        }
        zCVar.f11890E.getClass();
        if (paymentCoupon == null) {
            xh = null;
        } else {
            xh = new Xh(paymentCoupon.getType(), paymentCoupon.getValue(), paymentCoupon.getMaxDiscount(), paymentCoupon.getId(), paymentCoupon.getName());
        }
        this.f8961b.f11891J.f10656W.set(new EG7(b2, zmVar, arrayList, jcv, arrayList2, xh, str2));
        return Unit.INSTANCE;
    }
}
