package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import g6.C1754b;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1440e extends G3.a {
    public Boolean purple;
    public String red;
    public InterfaceC1438d silver;
    public Boolean teal;

    public final boolean X() {
        ((G) this.alpha).getClass();
        Boolean h02 = h0("firebase_analytics_collection_deactivated");
        if (h02 != null && h02.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean Y(String str) {
        return "1".equals(this.silver.d(str, "measurement.event_sampling_enabled"));
    }

    public final boolean Z() {
        if (this.purple == null) {
            Boolean h02 = h0("app_measurement_lite");
            this.purple = h02;
            if (h02 == null) {
                this.purple = Boolean.FALSE;
            }
        }
        if (!this.purple.booleanValue() && ((G) this.alpha).teal) {
            return false;
        }
        return true;
    }

    public final String a0(String str) {
        G g2 = (G) this.alpha;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            V5.x.hotel(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.white.bravo(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e4) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.white.bravo(e4, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e5) {
            ar arVar3 = g2.f7507b;
            G.foxtrot(arVar3);
            arVar3.white.bravo(e5, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e10) {
            ar arVar4 = g2.f7507b;
            G.foxtrot(arVar4);
            arVar4.white.bravo(e10, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final double b0(String str, ab abVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) abVar.alpha(null)).doubleValue();
        }
        String d4 = this.silver.d(str, abVar.alpha);
        if (TextUtils.isEmpty(d4)) {
            return ((Double) abVar.alpha(null)).doubleValue();
        }
        try {
            return ((Double) abVar.alpha(Double.valueOf(Double.parseDouble(d4)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) abVar.alpha(null)).doubleValue();
        }
    }

    public final int c0(String str, ab abVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) abVar.alpha(null)).intValue();
        }
        String d4 = this.silver.d(str, abVar.alpha);
        if (TextUtils.isEmpty(d4)) {
            return ((Integer) abVar.alpha(null)).intValue();
        }
        try {
            return ((Integer) abVar.alpha(Integer.valueOf(Integer.parseInt(d4)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) abVar.alpha(null)).intValue();
        }
    }

    public final long d0() {
        ((G) this.alpha).getClass();
        return 119002L;
    }

    public final long e0(String str, ab abVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) abVar.alpha(null)).longValue();
        }
        String d4 = this.silver.d(str, abVar.alpha);
        if (TextUtils.isEmpty(d4)) {
            return ((Long) abVar.alpha(null)).longValue();
        }
        try {
            return ((Long) abVar.alpha(Long.valueOf(Long.parseLong(d4)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) abVar.alpha(null)).longValue();
        }
    }

    public final Bundle f0() {
        G g2 = (G) this.alpha;
        try {
            Context context = g2.alpha;
            Context context2 = g2.alpha;
            PackageManager packageManager = context.getPackageManager();
            ar arVar = g2.f7507b;
            if (packageManager == null) {
                G.foxtrot(arVar);
                arVar.white.alpha("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo bravo = C1754b.alpha(context2).bravo(128, context2.getPackageName());
            if (bravo == null) {
                G.foxtrot(arVar);
                arVar.white.alpha("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return bravo.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.white.bravo(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final S g0(String str, boolean z2) {
        Object obj;
        V5.x.echo(str);
        Bundle f02 = f0();
        G g2 = (G) this.alpha;
        if (f02 == null) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.white.alpha("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = f02.get(str);
        }
        S s3 = S.UNINITIALIZED;
        if (obj == null) {
            return s3;
        }
        if (Boolean.TRUE.equals(obj)) {
            return S.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return S.DENIED;
        }
        if (z2 && "eu_consent_policy".equals(obj)) {
            return S.POLICY;
        }
        ar arVar2 = g2.f7507b;
        G.foxtrot(arVar2);
        arVar2.f7632b.bravo(str, "Invalid manifest metadata for");
        return s3;
    }

    public final Boolean h0(String str) {
        V5.x.echo(str);
        Bundle f02 = f0();
        if (f02 == null) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.white.alpha("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!f02.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(f02.getBoolean(str));
    }

    public final String i0(String str, ab abVar) {
        if (TextUtils.isEmpty(str)) {
            return (String) abVar.alpha(null);
        }
        return (String) abVar.alpha(this.silver.d(str, abVar.alpha));
    }

    public final boolean j0(String str, ab abVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) abVar.alpha(null)).booleanValue();
        }
        String d4 = this.silver.d(str, abVar.alpha);
        if (TextUtils.isEmpty(d4)) {
            return ((Boolean) abVar.alpha(null)).booleanValue();
        }
        return ((Boolean) abVar.alpha(Boolean.valueOf("1".equals(d4)))).booleanValue();
    }

    public final boolean k0() {
        Boolean h02 = h0("google_analytics_automatic_screen_reporting_enabled");
        if (h02 != null && !h02.booleanValue()) {
            return false;
        }
        return true;
    }
}
