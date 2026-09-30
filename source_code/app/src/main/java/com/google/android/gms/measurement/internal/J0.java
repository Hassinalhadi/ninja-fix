package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class J0 extends U0 {

    /* renamed from: a, reason: collision with root package name */
    public final aw f7534a;

    /* renamed from: b, reason: collision with root package name */
    public final aw f7535b;

    /* renamed from: c, reason: collision with root package name */
    public final aw f7536c;
    public final HashMap silver;
    public final aw teal;
    public final aw white;
    public final aw yellow;

    public J0(Z0 z02) {
        super(z02);
        this.silver = new HashMap();
        ax axVar = ((G) this.alpha).f7506a;
        G.delta(axVar);
        this.teal = new aw(axVar, "last_delete_stale", 0L);
        ax axVar2 = ((G) this.alpha).f7506a;
        G.delta(axVar2);
        this.white = new aw(axVar2, "last_delete_stale_batch", 0L);
        ax axVar3 = ((G) this.alpha).f7506a;
        G.delta(axVar3);
        this.yellow = new aw(axVar3, "backoff", 0L);
        ax axVar4 = ((G) this.alpha).f7506a;
        G.delta(axVar4);
        this.f7534a = new aw(axVar4, "last_upload", 0L);
        ax axVar5 = ((G) this.alpha).f7506a;
        G.delta(axVar5);
        this.f7535b = new aw(axVar5, "last_upload_attempt", 0L);
        ax axVar6 = ((G) this.alpha).f7506a;
        G.delta(axVar6);
        this.f7536c = new aw(axVar6, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.U0
    public final void Z() {
    }

    public final Pair a0(String str) {
        AdvertisingIdClient.Info info;
        I0 i02;
        W();
        G g2 = (G) this.alpha;
        g2.f7511g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.silver;
        I0 i03 = (I0) hashMap.get(str);
        if (i03 != null && elapsedRealtime < i03.charlie) {
            return new Pair(i03.alpha, Boolean.valueOf(i03.bravo));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        ab abVar = ac.bravo;
        C1440e c1440e = g2.yellow;
        long e02 = c1440e.e0(str, abVar) + elapsedRealtime;
        try {
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(g2.alpha);
            } catch (PackageManager.NameNotFoundException unused) {
                if (i03 != null && elapsedRealtime < i03.charlie + c1440e.e0(str, ac.charlie)) {
                    return new Pair(i03.alpha, Boolean.valueOf(i03.bravo));
                }
                info = null;
            }
        } catch (Exception e) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7635f.bravo(e, "Unable to get advertising id");
            i02 = new I0("", e02, false);
        }
        if (info == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = info.getId();
        if (id2 != null) {
            i02 = new I0(id2, e02, info.isLimitAdTrackingEnabled());
        } else {
            i02 = new I0("", e02, info.isLimitAdTrackingEnabled());
        }
        hashMap.put(str, i02);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(i02.alpha, Boolean.valueOf(i02.bravo));
    }

    public final String b0(String str, boolean z2) {
        String str2;
        W();
        if (z2) {
            str2 = (String) a0(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest h02 = d1.h0();
        if (h02 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, h02.digest(str2.getBytes())));
    }
}
