package com.checkout.components.kmp.rememberme.di;

import Db.c;
import F.AbstractC0141o0;
import Xd.l;
import android.view.ViewGroup;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import com.checkout.address.ui.edit.ComposableSingletons$AddressEditScreenKt;
import com.checkout.components.kmp.rememberme.view.authentication.ComposableSingletons$AuthenticationViewKt;
import com.checkout.components.kmp.rememberme.view.otp.OTPViewKt;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlCoverFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlFooterFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlHeaderFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverImageFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeFooterFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHeaderFragment;
import d5.C1589a;
import db.C1603c;
import db.m;
import db.n;
import db.o;
import delivery.samurai.android.R;
import j1.C1929c;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.functions.Function0;
import l3.AbstractC2056a;
import s6.G4;
import t6.AbstractC3086y3;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int alpha;

    public /* synthetic */ b(int i4) {
        this.alpha = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean OTPViewPreview$lambda$31$lambda$30$lambda$29$lambda$26$lambda$25;
        Unit view$lambda$0;
        Unit onCreateView$lambda$1;
        Unit onCreateView$lambda$12;
        boolean z2;
        Unit a6;
        Unit a8;
        as asVar = C0580l.alpha;
        boolean z10 = false;
        switch (this.alpha) {
            case 0:
                return KoinModulesKt.delta((og.a) obj, (kg.a) obj2);
            case 1:
                return KoinModulesKt.echo((og.a) obj, (kg.a) obj2);
            case 2:
                return KoinModulesKt.sierra((og.a) obj, (kg.a) obj2);
            case 3:
                return KoinModulesKt.foxtrot((og.a) obj, (kg.a) obj2);
            case 4:
                return KoinModulesKt.lima((og.a) obj, (kg.a) obj2);
            case 5:
                return KoinModulesKt.alpha((og.a) obj, (kg.a) obj2);
            case 6:
                return KoinModulesKt.hotel((og.a) obj, (kg.a) obj2);
            case 7:
                return KoinModulesKt.india((og.a) obj, (kg.a) obj2);
            case 8:
                return ComposableSingletons$AuthenticationViewKt.bravo((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 9:
                OTPViewPreview$lambda$31$lambda$30$lambda$29$lambda$26$lambda$25 = OTPViewKt.OTPViewPreview$lambda$31$lambda$30$lambda$29$lambda$26$lambda$25(((Integer) obj).intValue(), (String) obj2);
                return Boolean.valueOf(OTPViewPreview$lambda$31$lambda$30$lambda$29$lambda$26$lambda$25);
            case 10:
                return CTInAppHtmlCoverFragment.kilo((C1929c) obj, (ViewGroup.MarginLayoutParams) obj2);
            case 11:
                view$lambda$0 = CTInAppHtmlFooterFragment.getView$lambda$0((C1929c) obj, (ViewGroup.MarginLayoutParams) obj2);
                return view$lambda$0;
            case 12:
                return CTInAppHtmlHalfInterstitialFragment.kilo((C1929c) obj, (ViewGroup.MarginLayoutParams) obj2);
            case 13:
                return CTInAppHtmlHeaderFragment.juliet((C1929c) obj, (ViewGroup.MarginLayoutParams) obj2);
            case 14:
                return CTInAppHtmlInterstitialFragment.kilo((C1929c) obj, (ViewGroup.MarginLayoutParams) obj2);
            case 15:
                return CTInAppNativeCoverFragment.kilo((C1929c) obj, (ViewGroup.MarginLayoutParams) obj2);
            case 16:
                return CTInAppNativeCoverImageFragment.kilo((C1929c) obj, (ViewGroup.MarginLayoutParams) obj2);
            case 17:
                onCreateView$lambda$1 = CTInAppNativeFooterFragment.onCreateView$lambda$1((C1929c) obj, (ViewGroup.MarginLayoutParams) obj2);
                return onCreateView$lambda$1;
            case 18:
                onCreateView$lambda$12 = CTInAppNativeHeaderFragment.onCreateView$lambda$1((C1929c) obj, (ViewGroup.MarginLayoutParams) obj2);
                return onCreateView$lambda$12;
            case 19:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z10)) {
                    List list = db.l.echo;
                    Object jade = c0585q.jade();
                    if (jade == asVar) {
                        jade = new C1589a(7);
                        c0585q.f(jade);
                    }
                    Function0 function0 = (Function0) jade;
                    Object jade2 = c0585q.jade();
                    if (jade2 == asVar) {
                        jade2 = new C1589a(8);
                        c0585q.f(jade2);
                    }
                    db.l.bravo(list, function0, null, (Function0) jade2, "من فضلك بدون بصل ومع صلصة إضافية. شكرًا!", c0585q, 27696, 4);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 20:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    List list2 = db.l.echo;
                    Object jade3 = c0585q2.jade();
                    if (jade3 == asVar) {
                        jade3 = new C1589a(9);
                        c0585q2.f(jade3);
                    }
                    db.l.bravo(list2, (Function0) jade3, null, null, null, c0585q2, 48, 28);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 21:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z10 = true;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z10)) {
                    AbstractC0141o0.bravo(AbstractC2056a.alpha(), AbstractC3086y3.bravo(c0585q3, R.string.cd_close_cashier_list), null, c.bronze, c0585q3, 3072, 4);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 22:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z10 = true;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z10)) {
                    List list3 = db.l.echo;
                    Object jade4 = c0585q4.jade();
                    if (jade4 == asVar) {
                        jade4 = new C1589a(10);
                        c0585q4.f(jade4);
                    }
                    Function0 function02 = (Function0) jade4;
                    Object jade5 = c0585q4.jade();
                    if (jade5 == asVar) {
                        jade5 = new C1589a(11);
                        c0585q4.f(jade5);
                    }
                    db.l.bravo(list3, function02, null, (Function0) jade5, null, c0585q4, 3120, 20);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 23:
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(intValue5 & 1, z2)) {
                    List juliet = ab.juliet(new C1603c("Margherita Pizza", "بيتزا مارجريتا", 1, CollectionsKt.listOf(new m(1, "Thin Crust", "عجينة رفيعة"), new m(1, "Extra Cheese", "جبنة إضافية"))));
                    Object jade6 = c0585q5.jade();
                    if (jade6 == asVar) {
                        jade6 = new C1589a(12);
                        c0585q5.f(jade6);
                    }
                    Function0 function03 = (Function0) jade6;
                    Object jade7 = c0585q5.jade();
                    if (jade7 == asVar) {
                        jade7 = new C1589a(13);
                        c0585q5.f(jade7);
                    }
                    db.l.bravo(juliet, function03, null, (Function0) jade7, null, c0585q5, 3120, 20);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                o.alpha((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                n.india((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                n.alpha((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 27:
                a6 = ComposableSingletons$AddressEditScreenKt.a(((Integer) obj).intValue(), (String) obj2);
                return a6;
            case 28:
                a8 = ComposableSingletons$AddressEditScreenKt.a((InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return a8;
            default:
                ((Integer) obj2).getClass();
                G4.alpha((InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(int i4, int i5) {
        this.alpha = i5;
    }
}
