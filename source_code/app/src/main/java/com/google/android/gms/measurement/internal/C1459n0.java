package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.internal.measurement.EnumC1330i1;
import com.google.android.gms.internal.measurement.EnumC1335j1;
import com.google.android.gms.internal.measurement.zzdj;
import com.google.maps.android.BuildConfig;
import e6.C1629a;
import h2.C1803d;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1459n0 extends AbstractC1481z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7673a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7674b;

    /* renamed from: c, reason: collision with root package name */
    public int f7675c;

    /* renamed from: d, reason: collision with root package name */
    public C1443f0 f7676d;
    public C1443f0 e;

    /* renamed from: f, reason: collision with root package name */
    public PriorityQueue f7677f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7678g;

    /* renamed from: h, reason: collision with root package name */
    public V f7679h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f7680i;

    /* renamed from: j, reason: collision with root package name */
    public long f7681j;

    /* renamed from: k, reason: collision with root package name */
    public final F f7682k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7683l;

    /* renamed from: m, reason: collision with root package name */
    public C1443f0 f7684m;

    /* renamed from: n, reason: collision with root package name */
    public SharedPreferencesOnSharedPreferenceChangeListenerC1441e0 f7685n;

    /* renamed from: o, reason: collision with root package name */
    public C1443f0 f7686o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.core.widget.f f7687p;
    public C1457m0 red;
    public w.o silver;
    public final CopyOnWriteArraySet teal;
    public boolean white;
    public final AtomicReference yellow;

    public C1459n0(G g2) {
        super(g2);
        this.teal = new CopyOnWriteArraySet();
        this.f7673a = new Object();
        this.f7674b = false;
        this.f7675c = 1;
        this.f7683l = true;
        this.f7687p = new androidx.core.widget.f(25, this);
        this.yellow = new AtomicReference();
        this.f7679h = V.charlie;
        this.f7681j = -1L;
        this.f7680i = new AtomicLong(0L);
        this.f7682k = new F(g2);
    }

    public static void a0(C1459n0 c1459n0, V v4, long j5, boolean z2) {
        c1459n0.W();
        c1459n0.X();
        G g2 = (G) c1459n0.alpha;
        ax axVar = g2.f7506a;
        G.delta(axVar);
        V d02 = axVar.d0();
        long j6 = c1459n0.f7681j;
        int i4 = v4.bravo;
        ar arVar = g2.f7507b;
        if (j5 <= j6 && V.lima(d02.bravo, i4)) {
            G.foxtrot(arVar);
            arVar.e.bravo(v4, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        ax axVar2 = g2.f7506a;
        G.delta(axVar2);
        axVar2.W();
        if (V.lima(i4, axVar2.b0().getInt("consent_source", 100))) {
            SharedPreferences.Editor edit = axVar2.b0().edit();
            edit.putString("consent_settings", v4.juliet());
            edit.putInt("consent_source", i4);
            edit.apply();
            G.foxtrot(arVar);
            arVar.f7636g.bravo(v4, "Setting storage consent(FE)");
            c1459n0.f7681j = j5;
            if (g2.mike().i0()) {
                H0 mike = g2.mike();
                mike.W();
                mike.X();
                mike.n0(new RunnableC1482z0(mike, 0));
            } else {
                H0 mike2 = g2.mike();
                mike2.W();
                mike2.X();
                if (mike2.h0()) {
                    mike2.n0(new E0(mike2, mike2.k0(false), 1));
                }
            }
            if (z2) {
                g2.mike().c0(new AtomicReference());
                return;
            }
            return;
        }
        G.foxtrot(arVar);
        arVar.e.bravo(Integer.valueOf(i4), "Lower precedence consent source ignored, proposed source");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1481z
    public final boolean Z() {
        return false;
    }

    public final void b0() {
        W();
        X();
        G g2 = (G) this.alpha;
        if (g2.bravo()) {
            C1440e c1440e = g2.yellow;
            ((G) c1440e.alpha).getClass();
            Boolean h02 = c1440e.h0("google_analytics_deferred_deep_link_enabled");
            if (h02 != null && h02.booleanValue()) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7635f.alpha("Deferred Deep Link feature enabled.");
                E e = g2.f7508c;
                G.foxtrot(e);
                e.g0(new RunnableC1439d0(this, 0));
            }
            H0 mike = g2.mike();
            mike.W();
            mike.X();
            zzr k02 = mike.k0(true);
            mike.o0();
            G g5 = (G) mike.alpha;
            g5.yellow.j0(null, ac.f7593e0);
            g5.juliet().d0(3, new byte[0]);
            mike.n0(new D0(mike, k02, 0));
            this.f7683l = false;
            ax axVar = g2.f7506a;
            G.delta(axVar);
            axVar.W();
            String string = axVar.b0().getString("previous_os_version", null);
            ((G) axVar.alpha).hotel().Y();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = axVar.b0().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                g2.hotel().Y();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    h0("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void c0(String str, String str2, Bundle bundle) {
        G g2 = (G) this.alpha;
        g2.f7511g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        V5.x.echo(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        E e = g2.f7508c;
        G.foxtrot(e);
        e.g0(new s6.E(10, this, bundle2, false));
    }

    public final void d0() {
        G g2 = (G) this.alpha;
        if ((g2.alpha.getApplicationContext() instanceof Application) && this.red != null) {
            ((Application) g2.alpha.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.red);
        }
    }

    public final void e0() {
        C1317f3.bravo();
        G g2 = (G) this.alpha;
        if (g2.yellow.j0(null, ac.f7575P)) {
            E e = g2.f7508c;
            G.foxtrot(e);
            boolean i02 = e.i0();
            ar arVar = g2.f7507b;
            if (!i02) {
                if (!r6.u.mike()) {
                    X();
                    G.foxtrot(arVar);
                    arVar.f7636g.alpha("Getting trigger URIs (FE)");
                    AtomicReference atomicReference = new AtomicReference();
                    G.foxtrot(e);
                    e.b0(atomicReference, 10000L, "get trigger URIs", new RunnableC1433a0(this, atomicReference, 0));
                    List list = (List) atomicReference.get();
                    if (list == null) {
                        G.foxtrot(arVar);
                        arVar.white.alpha("Timed out waiting for get trigger URIs");
                        return;
                    } else {
                        G.foxtrot(e);
                        e.g0(new be.g(11, this, list));
                        return;
                    }
                }
                G.foxtrot(arVar);
                arVar.white.alpha("Cannot get trigger URIs from main thread");
                return;
            }
            G.foxtrot(arVar);
            arVar.white.alpha("Cannot get trigger URIs from analytics worker thread");
        }
    }

    public final void f0() {
        G g2;
        String str;
        P0 p02;
        P0 p03;
        C1459n0 c1459n0;
        String str2;
        String str3;
        boolean z2;
        int i4;
        String str4;
        int i5;
        EnumC1335j1 enumC1335j1;
        boolean z10;
        boolean z11;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int alpha;
        int alpha2;
        int alpha3;
        int alpha4;
        Object obj6;
        Object obj7;
        EnumC1330i1 enumC1330i1;
        Object obj8;
        Object obj9;
        W();
        G g5 = (G) this.alpha;
        ar arVar = g5.f7507b;
        G.foxtrot(arVar);
        arVar.f7635f.alpha("Handle tcf update.");
        ax axVar = g5.f7506a;
        G.delta(axVar);
        SharedPreferences a02 = axVar.a0();
        HashMap hashMap = new HashMap();
        ab abVar = ac.f7590c0;
        int i10 = 2;
        int i11 = 1;
        if (((Boolean) abVar.alpha(null)).booleanValue()) {
            com.google.common.collect.h hVar = R0.alpha;
            EnumC1330i1 enumC1330i12 = EnumC1330i1.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            Q0 q02 = Q0.alpha;
            g2 = g5;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(enumC1330i12, q02);
            EnumC1330i1 enumC1330i13 = EnumC1330i1.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            Q0 q03 = Q0.purple;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(enumC1330i13, q03);
            EnumC1330i1 enumC1330i14 = EnumC1330i1.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(enumC1330i14, q02);
            EnumC1330i1 enumC1330i15 = EnumC1330i1.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(enumC1330i15, q02);
            EnumC1330i1 enumC1330i16 = EnumC1330i1.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List asList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, new AbstractMap.SimpleImmutableEntry(enumC1330i16, q03), new AbstractMap.SimpleImmutableEntry(EnumC1330i1.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, q03), new AbstractMap.SimpleImmutableEntry(EnumC1330i1.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, q03));
            if (asList != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i4 = asList.size();
            } else {
                i4 = 4;
            }
            B0.a aVar = new B0.a(i4, 5);
            aVar.mike(asList);
            com.google.common.collect.m bravo = aVar.bravo();
            int i12 = com.google.common.collect.f.red;
            com.google.common.collect.o oVar = new com.google.common.collect.o("CH");
            char[] cArr = new char[5];
            int alpha5 = R0.alpha(a02, "IABTCF_CmpSdkID");
            int alpha6 = R0.alpha(a02, "IABTCF_PolicyVersion");
            int alpha7 = R0.alpha(a02, "IABTCF_gdprApplies");
            int alpha8 = R0.alpha(a02, "IABTCF_PurposeOneTreatment");
            int alpha9 = R0.alpha(a02, "IABTCF_EnableAdvertiserConsentMode");
            String bravo2 = R0.bravo(a02, "IABTCF_PublisherCC");
            B0.a aVar2 = new B0.a(4, 5);
            com.google.common.collect.k kVar = bravo.purple;
            if (kVar == null) {
                str4 = bravo2;
                i5 = alpha8;
                com.google.common.collect.k kVar2 = new com.google.common.collect.k(bravo, new com.google.common.collect.l(0, bravo.teal, bravo.white));
                bravo.purple = kVar2;
                kVar = kVar2;
            } else {
                str4 = bravo2;
                i5 = alpha8;
            }
            com.google.common.collect.p it = kVar.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                enumC1335j1 = EnumC1335j1.PURPOSE_RESTRICTION_UNDEFINED;
                if (!hasNext) {
                    break;
                }
                EnumC1330i1 enumC1330i17 = (EnumC1330i1) it.next();
                com.google.common.collect.p pVar = it;
                com.google.common.collect.m mVar = bravo;
                String bravo3 = R0.bravo(a02, "IABTCF_PublisherRestrictions" + enumC1330i17.alpha());
                if (!TextUtils.isEmpty(bravo3) && bravo3.length() >= 755) {
                    int digit = Character.digit(bravo3.charAt(754), 10);
                    EnumC1335j1 enumC1335j12 = EnumC1335j1.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    if (digit >= 0 && digit <= EnumC1335j1.values().length && digit != 0) {
                        if (digit != i11) {
                            if (digit == i10) {
                                enumC1335j1 = EnumC1335j1.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                            }
                        } else {
                            enumC1335j1 = EnumC1335j1.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                        }
                    } else {
                        enumC1335j1 = enumC1335j12;
                    }
                }
                aVar2.lima(enumC1330i17, enumC1335j1);
                it = pVar;
                bravo = mVar;
                i10 = 2;
                i11 = 1;
            }
            com.google.common.collect.m mVar2 = bravo;
            com.google.common.collect.m bravo4 = aVar2.bravo();
            String bravo5 = R0.bravo(a02, "IABTCF_PurposeConsents");
            String bravo6 = R0.bravo(a02, "IABTCF_VendorConsents");
            if (!TextUtils.isEmpty(bravo6) && bravo6.length() >= 755 && bravo6.charAt(754) == '1') {
                z10 = true;
            } else {
                z10 = false;
            }
            String bravo7 = R0.bravo(a02, "IABTCF_PurposeLegitimateInterests");
            String bravo8 = R0.bravo(a02, "IABTCF_VendorLegitimateInterests");
            if (!TextUtils.isEmpty(bravo8) && bravo8.length() >= 755 && bravo8.charAt(754) == '1') {
                z11 = true;
            } else {
                z11 = false;
            }
            cArr[0] = ExpiryDateConstantsKt.EXPIRY_DATE_VALID_TEEN_MONTH_SUFFIX_CHECK;
            EnumC1335j1 enumC1335j13 = (EnumC1335j1) bravo4.get(enumC1330i12);
            EnumC1335j1 enumC1335j14 = (EnumC1335j1) bravo4.get(enumC1330i14);
            EnumC1335j1 enumC1335j15 = (EnumC1335j1) bravo4.get(enumC1330i15);
            EnumC1335j1 enumC1335j16 = (EnumC1335j1) bravo4.get(enumC1330i16);
            B0.a aVar3 = new B0.a(4, 5);
            aVar3.lima(Constants.CLTAP_APP_VERSION, "2");
            if (true == z10) {
                obj = "1";
            } else {
                obj = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
            }
            boolean z12 = z10;
            aVar3.lima("VendorConsent", obj);
            if (true == z11) {
                obj2 = "1";
            } else {
                obj2 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
            }
            aVar3.lima("VendorLegitimateInterest", obj2);
            if (alpha7 == 1) {
                obj3 = "1";
            } else {
                obj3 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
            }
            aVar3.lima("gdprApplies", obj3);
            if (alpha9 == 1) {
                obj4 = "1";
            } else {
                obj4 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
            }
            aVar3.lima("EnableAdvertiserConsentMode", obj4);
            aVar3.lima("PolicyVersion", String.valueOf(alpha6));
            aVar3.lima("CmpSdkID", String.valueOf(alpha5));
            int i13 = i5;
            if (i13 == 1) {
                obj5 = "1";
            } else {
                obj5 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
            }
            aVar3.lima("PurposeOneTreatment", obj5);
            String str5 = str4;
            aVar3.lima("PublisherCC", str5);
            if (enumC1335j13 != null) {
                alpha = enumC1335j13.alpha();
            } else {
                alpha = enumC1335j1.alpha();
            }
            aVar3.lima("PublisherRestrictions1", String.valueOf(alpha));
            if (enumC1335j14 != null) {
                alpha2 = enumC1335j14.alpha();
            } else {
                alpha2 = enumC1335j1.alpha();
            }
            aVar3.lima("PublisherRestrictions3", String.valueOf(alpha2));
            if (enumC1335j15 != null) {
                alpha3 = enumC1335j15.alpha();
            } else {
                alpha3 = enumC1335j1.alpha();
            }
            aVar3.lima("PublisherRestrictions4", String.valueOf(alpha3));
            if (enumC1335j16 != null) {
                alpha4 = enumC1335j16.alpha();
            } else {
                alpha4 = enumC1335j1.alpha();
            }
            aVar3.lima("PublisherRestrictions7", String.valueOf(alpha4));
            String foxtrot = R0.foxtrot(enumC1330i12, bravo5, bravo7);
            String foxtrot2 = R0.foxtrot(enumC1330i14, bravo5, bravo7);
            String foxtrot3 = R0.foxtrot(enumC1330i15, bravo5, bravo7);
            String foxtrot4 = R0.foxtrot(enumC1330i16, bravo5, bravo7);
            s6.V.alpha("Purpose1", foxtrot);
            s6.V.alpha("Purpose3", foxtrot2);
            s6.V.alpha("Purpose4", foxtrot3);
            s6.V.alpha("Purpose7", foxtrot4);
            aVar3.mike(com.google.common.collect.m.alpha(4, new Object[]{"Purpose1", foxtrot, "Purpose3", foxtrot2, "Purpose4", foxtrot3, "Purpose7", foxtrot4}, null).entrySet());
            boolean z13 = z11;
            if (true == R0.charlie(enumC1330i12, mVar2, bravo4, oVar, cArr, alpha9, alpha7, i13, str5, bravo5, bravo7, z12, z13)) {
                obj6 = "1";
            } else {
                obj6 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
            }
            if (true == R0.charlie(enumC1330i14, mVar2, bravo4, oVar, cArr, alpha9, alpha7, i13, str5, bravo5, bravo7, z12, z13)) {
                obj7 = "1";
            } else {
                obj7 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
            }
            if (true != R0.charlie(enumC1330i15, mVar2, bravo4, oVar, cArr, alpha9, alpha7, i13, str5, bravo5, bravo7, z12, z13)) {
                enumC1330i1 = enumC1330i16;
                obj8 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
            } else {
                enumC1330i1 = enumC1330i16;
                obj8 = "1";
            }
            if (true == R0.charlie(enumC1330i1, mVar2, bravo4, oVar, cArr, alpha9, alpha7, i13, str5, bravo5, bravo7, z12, z13)) {
                obj9 = "1";
            } else {
                obj9 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
            }
            aVar3.mike(com.google.common.collect.m.alpha(5, new Object[]{"AuthorizePurpose1", obj6, "AuthorizePurpose3", obj7, "AuthorizePurpose4", obj8, "AuthorizePurpose7", obj9, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
            p02 = new P0(aVar3.bravo());
            str = "";
        } else {
            g2 = g5;
            String bravo9 = R0.bravo(a02, "IABTCF_VendorConsents");
            str = "";
            if (!str.equals(bravo9) && bravo9.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(bravo9.charAt(754)));
            }
            int alpha10 = R0.alpha(a02, "IABTCF_gdprApplies");
            if (alpha10 != -1) {
                hashMap.put("gdprApplies", String.valueOf(alpha10));
            }
            int alpha11 = R0.alpha(a02, "IABTCF_EnableAdvertiserConsentMode");
            if (alpha11 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(alpha11));
            }
            int alpha12 = R0.alpha(a02, "IABTCF_PolicyVersion");
            if (alpha12 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(alpha12));
            }
            String bravo10 = R0.bravo(a02, "IABTCF_PurposeConsents");
            if (!str.equals(bravo10)) {
                hashMap.put("PurposeConsents", bravo10);
            }
            int alpha13 = R0.alpha(a02, "IABTCF_CmpSdkID");
            if (alpha13 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(alpha13));
            }
            p02 = new P0(hashMap);
        }
        G g10 = g2;
        ar arVar2 = g10.f7507b;
        G.foxtrot(arVar2);
        a4.j jVar = arVar2.f7636g;
        jVar.bravo(p02, "Tcf preferences read");
        boolean j02 = g10.yellow.j0(null, abVar);
        C1629a c1629a = g10.f7511g;
        if (j02) {
            axVar.W();
            String string = axVar.b0().getString("stored_tcf_param", str);
            HashMap hashMap2 = new HashMap();
            if (TextUtils.isEmpty(string)) {
                p03 = new P0(hashMap2);
            } else {
                for (String str6 : string.split(";")) {
                    String[] split = str6.split("=");
                    if (split.length >= 2 && R0.alpha.contains(split[0])) {
                        hashMap2.put(split[0], split[1]);
                    }
                }
                p03 = new P0(hashMap2);
            }
            if (axVar.g0(p02)) {
                Bundle alpha14 = p02.alpha();
                G.foxtrot(arVar2);
                jVar.bravo(alpha14, "Consent generated from Tcf");
                if (alpha14 != Bundle.EMPTY) {
                    c1629a.getClass();
                    c1459n0 = this;
                    c1459n0.m0(alpha14, -30, System.currentTimeMillis());
                } else {
                    c1459n0 = this;
                }
                Bundle bundle = new Bundle();
                HashMap hashMap3 = p03.alpha;
                if (!hashMap3.isEmpty() && ((String) hashMap3.get(Constants.CLTAP_APP_VERSION)) == null) {
                    str2 = "1";
                } else {
                    str2 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
                }
                Bundle alpha15 = p02.alpha();
                Bundle alpha16 = p03.alpha();
                if (alpha15.size() != alpha16.size() || !Objects.equals(alpha15.getString("ad_storage"), alpha16.getString("ad_storage")) || !Objects.equals(alpha15.getString("ad_personalization"), alpha16.getString("ad_personalization")) || !Objects.equals(alpha15.getString("ad_user_data"), alpha16.getString("ad_user_data"))) {
                    str3 = "1";
                } else {
                    str3 = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
                }
                bundle.putString("_tcfm", str2.concat(str3));
                String str7 = (String) p02.alpha.get("PurposeDiagnostics");
                if (TextUtils.isEmpty(str7)) {
                    str7 = "200000";
                }
                bundle.putString("_tcfd2", str7);
                bundle.putString("_tcfd", p02.bravo());
                c1459n0.h0("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        if (axVar.g0(p02)) {
            Bundle alpha17 = p02.alpha();
            G.foxtrot(arVar2);
            jVar.bravo(alpha17, "Consent generated from Tcf");
            if (alpha17 != Bundle.EMPTY) {
                c1629a.getClass();
                m0(alpha17, -30, System.currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfd", p02.bravo());
            h0("auto", "_tcf", bundle2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r0 > 500) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r5 > 500) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(String str, String str2, Bundle bundle, boolean z2, boolean z10, long j5) {
        Bundle bundle2;
        boolean z11;
        String str3;
        String str4;
        C1474v0 c1474v0;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        if (Objects.equals(str2, "screen_view")) {
            C1480y0 c1480y0 = ((G) this.alpha).f7512h;
            G.echo(c1480y0);
            synchronized (c1480y0.e) {
                try {
                    if (!c1480y0.f7692d) {
                        ar arVar = ((G) c1480y0.alpha).f7507b;
                        G.foxtrot(arVar);
                        arVar.f7634d.alpha("Cannot log screen view event when the app is in the background.");
                        return;
                    }
                    String string = bundle2.getString("screen_name");
                    if (string != null) {
                        if (string.length() > 0) {
                            int length = string.length();
                            ((G) c1480y0.alpha).yellow.getClass();
                        }
                        ar arVar2 = ((G) c1480y0.alpha).f7507b;
                        G.foxtrot(arVar2);
                        arVar2.f7634d.bravo(Integer.valueOf(string.length()), "Invalid screen name length for screen view. Length");
                        return;
                    }
                    String string2 = bundle2.getString("screen_class");
                    if (string2 != null) {
                        if (string2.length() > 0) {
                            int length2 = string2.length();
                            ((G) c1480y0.alpha).yellow.getClass();
                        }
                        ar arVar3 = ((G) c1480y0.alpha).f7507b;
                        G.foxtrot(arVar3);
                        arVar3.f7634d.bravo(Integer.valueOf(string2.length()), "Invalid screen class length for screen view. Length");
                        return;
                    }
                    if (string2 == null) {
                        zzdj zzdjVar = c1480y0.yellow;
                        if (zzdjVar != null) {
                            string2 = c1480y0.e0(zzdjVar.purple);
                        } else {
                            string2 = "Activity";
                        }
                    }
                    String str5 = string2;
                    C1474v0 c1474v02 = c1480y0.red;
                    if (c1480y0.f7689a && c1474v02 != null) {
                        c1480y0.f7689a = false;
                        boolean equals = Objects.equals(c1474v02.bravo, str5);
                        boolean equals2 = Objects.equals(c1474v02.alpha, string);
                        if (equals && equals2) {
                            ar arVar4 = ((G) c1480y0.alpha).f7507b;
                            G.foxtrot(arVar4);
                            arVar4.f7634d.alpha("Ignoring call to log screen view event with duplicate parameters.");
                            return;
                        }
                    }
                    G g2 = (G) c1480y0.alpha;
                    ar arVar5 = g2.f7507b;
                    G.foxtrot(arVar5);
                    a4.j jVar = arVar5.f7636g;
                    if (string == null) {
                        str3 = BuildConfig.TRAVIS;
                    } else {
                        str3 = string;
                    }
                    if (str5 == null) {
                        str4 = BuildConfig.TRAVIS;
                    } else {
                        str4 = str5;
                    }
                    jVar.charlie(str3, str4, "Logging screen view with name, class");
                    if (c1480y0.red == null) {
                        c1474v0 = c1480y0.silver;
                    } else {
                        c1474v0 = c1480y0.red;
                    }
                    d1 d1Var = g2.e;
                    G.delta(d1Var);
                    C1474v0 c1474v03 = new C1474v0(string, str5, d1Var.h1(), true, j5);
                    c1480y0.red = c1474v03;
                    c1480y0.silver = c1474v0;
                    c1480y0.f7690b = c1474v03;
                    g2.f7511g.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    E e = g2.f7508c;
                    G.foxtrot(e);
                    e.g0(new L(c1480y0, bundle2, c1474v03, c1474v0, elapsedRealtime, 2));
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!z10 || this.silver == null || d1.Q0(str2)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (str == null) {
            str = "app";
        }
        String str6 = str;
        Bundle bundle3 = new Bundle(bundle2);
        for (String str7 : bundle3.keySet()) {
            Object obj = bundle3.get(str7);
            if (obj instanceof Bundle) {
                bundle3.putBundle(str7, new Bundle((Bundle) obj));
            } else if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                for (int i4 = 0; i4 < parcelableArr.length; i4++) {
                    Parcelable parcelable = parcelableArr[i4];
                    if (parcelable instanceof Bundle) {
                        parcelableArr[i4] = new Bundle((Bundle) parcelable);
                    }
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    Object obj2 = list.get(i5);
                    if (obj2 instanceof Bundle) {
                        list.set(i5, new Bundle((Bundle) obj2));
                    }
                }
            }
        }
        E e4 = ((G) this.alpha).f7508c;
        G.foxtrot(e4);
        e4.g0(new RunnableC1447h0(this, str6, str2, j5, bundle3, z10, z11, z2));
    }

    public final void h0(String str, String str2, Bundle bundle) {
        W();
        ((G) this.alpha).f7511g.getClass();
        i0(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void i0(long j5, Bundle bundle, String str, String str2) {
        W();
        boolean z2 = true;
        if (this.silver != null && !d1.Q0(str2)) {
            z2 = false;
        }
        j0(str, str2, j5, bundle, true, z2, true);
    }

    public final void j0(String str, String str2, long j5, Bundle bundle, boolean z2, boolean z10, boolean z11) {
        C1459n0 c1459n0;
        C1629a c1629a;
        boolean z12;
        boolean z13;
        Bundle bundle2;
        long j6;
        boolean charlie;
        C1459n0 c1459n02;
        String str3;
        G g2;
        long j7;
        long j10;
        String str4;
        boolean d02;
        Bundle[] bundleArr;
        int i4;
        int i5;
        Class<?> cls;
        String str5 = str;
        V5.x.echo(str5);
        V5.x.hotel(bundle);
        W();
        X();
        G g5 = (G) this.alpha;
        boolean alpha = g5.alpha();
        ar arVar = g5.f7507b;
        if (alpha) {
            List list = g5.india().f7624d;
            if (list != null && !list.contains(str2)) {
                G.foxtrot(arVar);
                arVar.f7635f.charlie(str2, str5, "Dropping non-safelisted event. event name, origin");
                return;
            }
            if (!this.white) {
                this.white = true;
                try {
                    boolean z14 = g5.teal;
                    Context context = g5.alpha;
                    if (!z14) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, context);
                    } catch (Exception e) {
                        G.foxtrot(arVar);
                        arVar.f7632b.bravo(e, "Failed to invoke Tag Manager's initialize() method");
                    }
                } catch (ClassNotFoundException unused) {
                    G.foxtrot(arVar);
                    arVar.e.alpha("Tag Manager is not found and thus will not be used");
                }
            }
            boolean equals = "_cmp".equals(str2);
            C1629a c1629a2 = g5.f7511g;
            if (equals && bundle.containsKey("gclid")) {
                String string = bundle.getString("gclid");
                c1629a2.getClass();
                c1629a = c1629a2;
                r0(System.currentTimeMillis(), string, "auto", "_lgclid");
                c1459n0 = this;
            } else {
                c1459n0 = this;
                c1629a = c1629a2;
            }
            d1 d1Var = g5.e;
            ax axVar = g5.f7506a;
            if (z2 && !d1.f7658c[0].equals(str2)) {
                G.delta(d1Var);
                G.delta(axVar);
                d1Var.n0(bundle, axVar.f7655s.tango());
            }
            androidx.core.widget.f fVar = c1459n0.f7687p;
            am amVar = g5.f7510f;
            if (!z11 && !"_iap".equals(str2)) {
                G.delta(d1Var);
                int i10 = 2;
                if (d1Var.K0(com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, str2)) {
                    if (!d1Var.H0(com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, W.alpha, W.bravo, str2)) {
                        i10 = 13;
                    } else {
                        ((G) d1Var.alpha).getClass();
                        if (d1Var.G0(40, com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, str2)) {
                            i10 = 0;
                        }
                    }
                }
                if (i10 != 0) {
                    G.foxtrot(arVar);
                    arVar.f7631a.bravo(amVar.delta(str2), "Invalid public event name. Event will not be logged (FE)");
                    G.delta(d1Var);
                    String g02 = d1.g0(str2, 40, true);
                    if (str2 != null) {
                        i5 = str2.length();
                    } else {
                        i5 = 0;
                    }
                    d1.q0(fVar, null, i10, "_ev", g02, i5);
                    return;
                }
            }
            C1480y0 c1480y0 = g5.f7512h;
            G.echo(c1480y0);
            C1474v0 d03 = c1480y0.d0(false);
            if (d03 != null && !bundle.containsKey("_sc")) {
                d03.delta = true;
            }
            if (z2 && !z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            d1.m0(d03, bundle, z12);
            boolean equals2 = "am".equals(str5);
            boolean Q02 = d1.Q0(str2);
            if (z2 && c1459n0.silver != null && !Q02) {
                if (equals2) {
                    bundle2 = bundle;
                    z13 = true;
                } else {
                    G.foxtrot(arVar);
                    arVar.f7635f.charlie(amVar.delta(str2), amVar.bravo(bundle), "Passing event to registered event handler (FE)");
                    V5.x.hotel(c1459n0.silver);
                    w.o oVar = c1459n0.silver;
                    oVar.getClass();
                    try {
                        ((com.google.android.gms.internal.measurement.as) oVar.purple).mike(j5, bundle, str5, str2);
                        return;
                    } catch (RemoteException e4) {
                        G g10 = ((AppMeasurementDynamiteService) oVar.red).golf;
                        if (g10 != null) {
                            ar arVar2 = g10.f7507b;
                            G.foxtrot(arVar2);
                            arVar2.f7632b.bravo(e4, "Event interceptor threw exception");
                            return;
                        }
                        return;
                    }
                }
            } else {
                z13 = equals2;
                bundle2 = bundle;
            }
            if (g5.bravo()) {
                G.delta(d1Var);
                int a12 = d1Var.a1(str2);
                if (a12 != 0) {
                    G.foxtrot(arVar);
                    arVar.f7631a.bravo(amVar.delta(str2), "Invalid event name. Event will not be logged (FE)");
                    String g03 = d1.g0(str2, 40, true);
                    if (str2 != null) {
                        i4 = str2.length();
                    } else {
                        i4 = 0;
                    }
                    G.delta(d1Var);
                    d1.q0(fVar, null, a12, "_ev", g03, i4);
                    return;
                }
                Bundle a02 = d1Var.a0(str2, bundle2, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z11);
                V5.x.hotel(a02);
                G.echo(c1480y0);
                C1474v0 d04 = c1480y0.d0(false);
                O0 o02 = g5.f7509d;
                boolean z15 = z13;
                if (d04 != null && "_ae".equals(str2)) {
                    G.echo(o02);
                    bz.m0 m0Var = o02.white;
                    ((G) ((O0) m0Var.silver).alpha).f7511g.getClass();
                    j6 = 0;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j11 = elapsedRealtime - m0Var.purple;
                    m0Var.purple = elapsedRealtime;
                    if (j11 > 0) {
                        d1Var.k0(a02, j11);
                    }
                } else {
                    j6 = 0;
                }
                boolean equals3 = "auto".equals(str5);
                G g11 = (G) d1Var.alpha;
                if (!equals3 && "_ssr".equals(str2)) {
                    String string2 = a02.getString("_ffr");
                    int i11 = e6.d.alpha;
                    if (string2 != null && !string2.trim().isEmpty()) {
                        if (string2 != null) {
                            string2 = string2.trim();
                        }
                    } else {
                        string2 = null;
                    }
                    ax axVar2 = g11.f7506a;
                    G.delta(axVar2);
                    if (!Objects.equals(string2, axVar2.f7652p.november())) {
                        ax axVar3 = g11.f7506a;
                        G.delta(axVar3);
                        axVar3.f7652p.oscar(string2);
                    } else {
                        ar arVar3 = g11.f7507b;
                        G.foxtrot(arVar3);
                        arVar3.f7635f.alpha("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                } else if ("_ae".equals(str2)) {
                    ax axVar4 = g11.f7506a;
                    G.delta(axVar4);
                    String november = axVar4.f7652p.november();
                    if (!TextUtils.isEmpty(november)) {
                        a02.putString("_ffr", november);
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(a02);
                if (g5.yellow.j0(null, ac.f7578T)) {
                    G.echo(o02);
                    o02.W();
                    charlie = o02.silver;
                } else {
                    G.delta(axVar);
                    charlie = axVar.f7649m.charlie();
                }
                G.delta(axVar);
                if (axVar.f7646j.alpha() > j6) {
                    if (axVar.f0(j5) && charlie) {
                        G.foxtrot(arVar);
                        arVar.f7636g.alpha("Current session is expired, remove the session number, ID, and engagement time");
                        c1629a.getClass();
                        g2 = g5;
                        str3 = "_ae";
                        j10 = j5;
                        r0(System.currentTimeMillis(), null, "auto", "_sid");
                        c1629a.getClass();
                        r0(System.currentTimeMillis(), null, "auto", "_sno");
                        c1629a.getClass();
                        r0(System.currentTimeMillis(), null, "auto", "_se");
                        c1459n02 = this;
                        j7 = j6;
                        axVar.f7647k.bravo(j7);
                    } else {
                        c1459n02 = this;
                        str3 = "_ae";
                        g2 = g5;
                        j10 = j5;
                        j7 = j6;
                    }
                } else {
                    c1459n02 = this;
                    str3 = "_ae";
                    g2 = g5;
                    j7 = j6;
                    j10 = j5;
                }
                if (a02.getLong("extend_session", j7) == 1) {
                    G.foxtrot(arVar);
                    arVar.f7636g.alpha("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    G.echo(o02);
                    o02.teal.coral(j10);
                }
                ArrayList arrayList2 = new ArrayList(a02.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    String str6 = (String) arrayList2.get(i12);
                    if (str6 != null) {
                        G.delta(d1Var);
                        Object obj = a02.get(str6);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            a02.putParcelableArray(str6, bundleArr);
                        }
                    }
                }
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    Bundle bundle3 = (Bundle) arrayList.get(i13);
                    if (i13 != 0) {
                        str4 = "_ep";
                    } else {
                        str4 = str2;
                    }
                    bundle3.putString("_o", str5);
                    if (z10) {
                        bundle3 = d1Var.j1(bundle3);
                    }
                    Bundle bundle4 = bundle3;
                    d1 d1Var2 = d1Var;
                    zzbh zzbhVar = new zzbh(str4, new zzbf(bundle4), str5, j10);
                    H0 mike = g2.mike();
                    mike.getClass();
                    mike.W();
                    mike.X();
                    mike.o0();
                    al juliet = ((G) mike.alpha).juliet();
                    juliet.getClass();
                    Parcel obtain = Parcel.obtain();
                    Y5.a.alpha(zzbhVar, obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    if (marshall.length > 131072) {
                        ar arVar4 = ((G) juliet.alpha).f7507b;
                        G.foxtrot(arVar4);
                        arVar4.yellow.alpha("Event is too long for local database. Sending event directly to service");
                        d02 = false;
                    } else {
                        d02 = juliet.d0(0, marshall);
                    }
                    mike.n0(new S5.g(mike, mike.k0(true), d02, zzbhVar, 2));
                    if (!z15) {
                        Iterator it = c1459n02.teal.iterator();
                        while (it.hasNext()) {
                            ((X) it.next()).alpha(j5, new Bundle(bundle4), str, str2);
                        }
                    }
                    i13++;
                    j10 = j5;
                    d1Var = d1Var2;
                    str5 = str;
                }
                G.echo(c1480y0);
                if (c1480y0.d0(false) != null && str3.equals(str2)) {
                    G.echo(o02);
                    c1629a.getClass();
                    o02.white.echo(SystemClock.elapsedRealtime(), true, true);
                    return;
                }
                return;
            }
            return;
        }
        G.foxtrot(arVar);
        arVar.f7635f.alpha("Event not sent since app measurement is disabled");
    }

    public final void k0() {
        zzov zzovVar;
        W();
        this.f7678g = false;
        if (!u0().isEmpty() && !this.f7674b && (zzovVar = (zzov) u0().poll()) != null) {
            G g2 = (G) this.alpha;
            d1 d1Var = g2.e;
            G.delta(d1Var);
            C1803d b02 = d1Var.b0();
            if (b02 != null) {
                this.f7674b = true;
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                a4.j jVar = arVar.f7636g;
                String str = zzovVar.alpha;
                jVar.bravo(str, "Registering trigger URI");
                com.google.common.util.concurrent.e echo = b02.echo(Uri.parse(str));
                if (echo == null) {
                    this.f7674b = false;
                    u0().add(zzovVar);
                } else {
                    echo.foxtrot(new com.google.common.util.concurrent.d(0, echo, new J2.e(29, (Object) this, (Object) zzovVar, false)), new L2.b(1, this));
                }
            }
        }
    }

    public final void l0(Bundle bundle, long j5) {
        V5.x.hotel(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean isEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        G g2 = (G) this.alpha;
        if (!isEmpty) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.alpha("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        W.alpha(bundle2, "app_id", String.class, null);
        W.alpha(bundle2, "origin", String.class, null);
        W.alpha(bundle2, "name", String.class, null);
        W.alpha(bundle2, "value", Object.class, null);
        W.alpha(bundle2, "trigger_event_name", String.class, null);
        W.alpha(bundle2, "trigger_timeout", Long.class, 0L);
        W.alpha(bundle2, "timed_out_event_name", String.class, null);
        W.alpha(bundle2, "timed_out_event_params", Bundle.class, null);
        W.alpha(bundle2, "triggered_event_name", String.class, null);
        W.alpha(bundle2, "triggered_event_params", Bundle.class, null);
        W.alpha(bundle2, "time_to_live", Long.class, 0L);
        W.alpha(bundle2, "expired_event_name", String.class, null);
        W.alpha(bundle2, "expired_event_params", Bundle.class, null);
        V5.x.echo(bundle2.getString("name"));
        V5.x.echo(bundle2.getString("origin"));
        V5.x.hotel(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j5);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        d1 d1Var = g2.e;
        G.delta(d1Var);
        int d12 = d1Var.d1(string);
        am amVar = g2.f7510f;
        ar arVar2 = g2.f7507b;
        if (d12 == 0) {
            d1 d1Var2 = g2.e;
            G.delta(d1Var2);
            if (d1Var2.Z0(obj, string) == 0) {
                Object e02 = d1Var2.e0(obj, string);
                if (e02 == null) {
                    G.foxtrot(arVar2);
                    arVar2.white.charlie(amVar.foxtrot(string), obj, "Unable to normalize conditional user property value");
                    return;
                }
                W.echo(bundle2, e02);
                long j6 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j6 > 15552000000L || j6 < 1)) {
                    G.foxtrot(arVar2);
                    arVar2.white.charlie(amVar.foxtrot(string), Long.valueOf(j6), "Invalid conditional user property timeout");
                    return;
                }
                long j7 = bundle2.getLong("time_to_live");
                if (j7 <= 15552000000L && j7 >= 1) {
                    E e = g2.f7508c;
                    G.foxtrot(e);
                    e.g0(new RunnableC1435b0(this, bundle2, 1));
                    return;
                } else {
                    G.foxtrot(arVar2);
                    arVar2.white.charlie(amVar.foxtrot(string), Long.valueOf(j7), "Invalid conditional user property time to live");
                    return;
                }
            }
            G.foxtrot(arVar2);
            arVar2.white.charlie(amVar.foxtrot(string), obj, "Invalid conditional user property value");
            return;
        }
        G.foxtrot(arVar2);
        arVar2.white.bravo(amVar.foxtrot(string), "Invalid conditional user property name");
    }

    public final void m0(Bundle bundle, int i4, long j5) {
        Object obj;
        S s3;
        String str;
        String string;
        X();
        V v4 = V.charlie;
        U[] uArr = T.STORAGE.alpha;
        int length = uArr.length;
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= length) {
                break;
            }
            String str2 = uArr[i5].alpha;
            if (bundle.containsKey(str2) && (string = bundle.getString(str2)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i5++;
        }
        G g2 = (G) this.alpha;
        if (obj != null) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7634d.bravo(obj, "Ignoring invalid consent setting");
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.f7634d.alpha("Valid consent values are 'granted', 'denied'");
        }
        E e = g2.f7508c;
        G.foxtrot(e);
        boolean i02 = e.i0();
        V delta = V.delta(i4, bundle);
        Iterator it = delta.alpha.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            s3 = S.UNINITIALIZED;
            if (!hasNext) {
                break;
            } else if (((S) it.next()) != s3) {
                p0(delta, i02);
                break;
            }
        }
        C1454l alpha = C1454l.alpha(i4, bundle);
        Iterator it2 = alpha.echo.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((S) it2.next()) != s3) {
                n0(alpha, i02);
                break;
            }
        }
        Boolean delta2 = C1454l.delta(bundle);
        if (delta2 != null) {
            if (i4 == -30) {
                str = "tcf";
            } else {
                str = "app";
            }
            String str3 = str;
            if (i02) {
                r0(j5, delta2.toString(), str3, "allow_personalized_ads");
            } else {
                q0(str3, "allow_personalized_ads", delta2.toString(), false, j5);
            }
        }
    }

    public final void n0(C1454l c1454l, boolean z2) {
        be.g gVar = new be.g(13, this, c1454l, false);
        if (z2) {
            W();
            gVar.run();
        } else {
            E e = ((G) this.alpha).f7508c;
            G.foxtrot(e);
            e.g0(gVar);
        }
    }

    public final void o0(V v4) {
        boolean z2;
        Boolean bool;
        W();
        if ((v4.kilo(U.ANALYTICS_STORAGE) && v4.kilo(U.AD_STORAGE)) || ((G) this.alpha).mike().h0()) {
            z2 = true;
        } else {
            z2 = false;
        }
        G g2 = (G) this.alpha;
        E e = g2.f7508c;
        G.foxtrot(e);
        e.W();
        if (z2 != g2.f7526v) {
            E e4 = g2.f7508c;
            G.foxtrot(e4);
            e4.W();
            g2.f7526v = z2;
            ax axVar = ((G) this.alpha).f7506a;
            G.delta(axVar);
            axVar.W();
            if (axVar.b0().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(axVar.b0().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z2 || bool == null || bool.booleanValue()) {
                s0(Boolean.valueOf(z2), false);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:75:0x0116
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public final void p0(com.google.android.gms.measurement.internal.V r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1459n0.p0(com.google.android.gms.measurement.internal.V, boolean):void");
    }

    public final void q0(String str, String str2, Object obj, boolean z2, long j5) {
        int i4;
        String str3;
        int i5 = 0;
        G g2 = (G) this.alpha;
        if (z2) {
            d1 d1Var = g2.e;
            G.delta(d1Var);
            i4 = d1Var.d1(str2);
        } else {
            d1 d1Var2 = g2.e;
            G.delta(d1Var2);
            if (d1Var2.K0("user property", str2)) {
                if (!d1Var2.H0("user property", W.india, null, str2)) {
                    i4 = 15;
                } else {
                    ((G) d1Var2.alpha).getClass();
                    if (d1Var2.G0(24, "user property", str2)) {
                        i4 = 0;
                    }
                }
            }
            i4 = 6;
        }
        androidx.core.widget.f fVar = this.f7687p;
        if (i4 != 0) {
            G.delta(g2.e);
            String g02 = d1.g0(str2, 24, true);
            if (str2 != null) {
                i5 = str2.length();
            }
            G.delta(g2.e);
            d1.q0(fVar, null, i4, "_ev", g02, i5);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            d1 d1Var3 = g2.e;
            G.delta(d1Var3);
            int Z02 = d1Var3.Z0(obj, str2);
            d1 d1Var4 = g2.e;
            if (Z02 != 0) {
                G.delta(d1Var4);
                String g03 = d1.g0(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i5 = obj.toString().length();
                }
                G.delta(d1Var4);
                d1.q0(fVar, null, Z02, "_ev", g03, i5);
                return;
            }
            G.delta(d1Var4);
            Object e02 = d1Var4.e0(obj, str2);
            if (e02 != null) {
                E e = g2.f7508c;
                G.foxtrot(e);
                e.g0(new L(this, str3, str2, e02, j5, 1));
                return;
            }
            return;
        }
        E e4 = g2.f7508c;
        G.foxtrot(e4);
        e4.g0(new L(this, str3, str2, null, j5, 1));
    }

    public final void r0(long j5, Object obj, String str, String str2) {
        String str3;
        boolean d02;
        long j6;
        Object obj2 = obj;
        V5.x.echo(str);
        V5.x.echo(str2);
        W();
        X();
        boolean equals = "allow_personalized_ads".equals(str2);
        G g2 = (G) this.alpha;
        if (equals) {
            String str4 = "_npa";
            if (obj2 instanceof String) {
                String str5 = (String) obj2;
                if (!TextUtils.isEmpty(str5)) {
                    String lowerCase = str5.toLowerCase(Locale.ENGLISH);
                    String str6 = "false";
                    if (true != "false".equals(lowerCase)) {
                        j6 = 0;
                    } else {
                        j6 = 1;
                    }
                    obj2 = Long.valueOf(j6);
                    ax axVar = g2.f7506a;
                    G.delta(axVar);
                    if (j6 == 1) {
                        str6 = "true";
                    }
                    axVar.f7643g.oscar(str6);
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.f7636g.charlie("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
                    str3 = str4;
                }
            }
            if (obj2 == null) {
                ax axVar2 = g2.f7506a;
                G.delta(axVar2);
                axVar2.f7643g.oscar("unset");
            } else {
                str4 = str2;
            }
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.f7636g.charlie("non_personalized_ads(_npa)", obj2, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj3 = obj2;
        if (!g2.alpha()) {
            ar arVar3 = g2.f7507b;
            G.foxtrot(arVar3);
            arVar3.f7636g.alpha("User property not set since app measurement is disabled");
            return;
        }
        if (!g2.bravo()) {
            return;
        }
        zzqb zzqbVar = new zzqb(j5, obj3, str3, str);
        H0 mike = g2.mike();
        mike.W();
        mike.X();
        mike.o0();
        al juliet = ((G) mike.alpha).juliet();
        juliet.getClass();
        Parcel obtain = Parcel.obtain();
        Y5.b.alpha(zzqbVar, obtain);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            ar arVar4 = ((G) juliet.alpha).f7507b;
            G.foxtrot(arVar4);
            arVar4.yellow.alpha("User property too long for local database. Sending directly to service");
            d02 = false;
        } else {
            d02 = juliet.d0(1, marshall);
        }
        mike.n0(new S5.g(mike, mike.k0(true), d02, zzqbVar, 1));
    }

    public final void s0(Boolean bool, boolean z2) {
        W();
        X();
        G g2 = (G) this.alpha;
        ar arVar = g2.f7507b;
        G.foxtrot(arVar);
        arVar.f7635f.bravo(bool, "Setting app measurement enabled (FE)");
        ax axVar = g2.f7506a;
        G.delta(axVar);
        axVar.W();
        SharedPreferences.Editor edit = axVar.b0().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
        if (z2) {
            axVar.W();
            SharedPreferences.Editor edit2 = axVar.b0().edit();
            if (bool != null) {
                edit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit2.remove("measurement_enabled_from_api");
            }
            edit2.apply();
        }
        E e = g2.f7508c;
        G.foxtrot(e);
        e.W();
        if (!g2.f7526v && (bool == null || bool.booleanValue())) {
            return;
        }
        t0();
    }

    public final void t0() {
        long j5;
        W();
        G g2 = (G) this.alpha;
        ax axVar = g2.f7506a;
        G.delta(axVar);
        String november = axVar.f7643g.november();
        if (november != null) {
            boolean equals = "unset".equals(november);
            C1629a c1629a = g2.f7511g;
            if (equals) {
                c1629a.getClass();
                r0(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                if (true != "true".equals(november)) {
                    j5 = 0;
                } else {
                    j5 = 1;
                }
                Long valueOf = Long.valueOf(j5);
                c1629a.getClass();
                r0(System.currentTimeMillis(), valueOf, "app", "_npa");
            }
        }
        boolean alpha = g2.alpha();
        ar arVar = g2.f7507b;
        if (alpha && this.f7683l) {
            G.foxtrot(arVar);
            arVar.f7635f.alpha("Recording app launch after enabling measurement for the first time (FE)");
            b0();
            O0 o02 = g2.f7509d;
            G.echo(o02);
            o02.teal.blue();
            E e = g2.f7508c;
            G.foxtrot(e);
            e.g0(new RunnableC1439d0(this, 2));
            return;
        }
        G.foxtrot(arVar);
        arVar.f7635f.alpha("Updating Scion state (FE)");
        H0 mike = g2.mike();
        mike.W();
        mike.X();
        mike.n0(new D0(mike, mike.k0(true), 1));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.measurement.internal.Z, java.lang.Object] */
    public final PriorityQueue u0() {
        Comparator comparing;
        if (this.f7677f == null) {
            comparing = Comparator.comparing(new Object(), new Sb.k(13));
            this.f7677f = Rf.a.oscar(comparing);
        }
        return this.f7677f;
    }
}
