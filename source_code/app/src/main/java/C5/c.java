package C5;

import B9.C0058p;
import D5.ab;
import D5.ac;
import D5.ad;
import D5.ae;
import D5.af;
import D5.ag;
import D5.ah;
import D5.ai;
import D5.aj;
import D5.e;
import D5.f;
import D5.g;
import D5.i;
import D5.j;
import D5.k;
import D5.l;
import D5.m;
import D5.n;
import D5.o;
import D5.p;
import D5.q;
import D5.r;
import D5.t;
import D5.u;
import D5.w;
import D5.x;
import D5.z;
import F5.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.material.internal.s;
import d8.d;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import s6.D5;

/* loaded from: classes3.dex */
public final class c implements h {
    public final s alpha;
    public final ConnectivityManager bravo;
    public final Context charlie;
    public final URL delta;
    public final N5.a echo;
    public final N5.a foxtrot;
    public final int golf;

    public c(Context context, N5.a aVar, N5.a aVar2) {
        d dVar = new d();
        D5.c cVar = D5.c.alpha;
        dVar.alpha(x.class, cVar);
        dVar.alpha(m.class, cVar);
        j jVar = j.alpha;
        dVar.alpha(ag.class, jVar);
        dVar.alpha(u.class, jVar);
        D5.d dVar2 = D5.d.alpha;
        dVar.alpha(z.class, dVar2);
        dVar.alpha(n.class, dVar2);
        D5.b bVar = D5.b.alpha;
        dVar.alpha(D5.a.class, bVar);
        dVar.alpha(l.class, bVar);
        i iVar = i.alpha;
        dVar.alpha(af.class, iVar);
        dVar.alpha(t.class, iVar);
        e eVar = e.alpha;
        dVar.alpha(ab.class, eVar);
        dVar.alpha(o.class, eVar);
        D5.h hVar = D5.h.alpha;
        dVar.alpha(ae.class, hVar);
        dVar.alpha(r.class, hVar);
        g gVar = g.alpha;
        dVar.alpha(ad.class, gVar);
        dVar.alpha(q.class, gVar);
        k kVar = k.alpha;
        dVar.alpha(aj.class, kVar);
        dVar.alpha(w.class, kVar);
        f fVar = f.alpha;
        dVar.alpha(ac.class, fVar);
        dVar.alpha(p.class, fVar);
        dVar.silver = true;
        this.alpha = new s(5, dVar);
        this.charlie = context;
        this.bravo = (ConnectivityManager) context.getSystemService("connectivity");
        this.delta = bravo(a.charlie);
        this.echo = aVar2;
        this.foxtrot = aVar;
        this.golf = 130000;
    }

    public static URL bravo(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(av.q.echo("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (((D5.ah) D5.ah.alpha.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E5.h alpha(E5.h hVar) {
        int type;
        int subtype;
        HashMap hashMap;
        NetworkInfo activeNetworkInfo = this.bravo.getActiveNetworkInfo();
        C0058p charlie = hVar.charlie();
        int i4 = Build.VERSION.SDK_INT;
        HashMap hashMap2 = (HashMap) charlie.delta;
        if (hashMap2 != null) {
            hashMap2.put("sdk-version", String.valueOf(i4));
            charlie.bravo("model", Build.MODEL);
            charlie.bravo("hardware", Build.HARDWARE);
            charlie.bravo("device", Build.DEVICE);
            charlie.bravo("product", Build.PRODUCT);
            charlie.bravo("os-uild", Build.ID);
            charlie.bravo("manufacturer", Build.MANUFACTURER);
            charlie.bravo("fingerprint", Build.FINGERPRINT);
            Calendar.getInstance();
            long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
            HashMap hashMap3 = (HashMap) charlie.delta;
            if (hashMap3 != null) {
                hashMap3.put("tz-offset", String.valueOf(offset));
                int i5 = -1;
                if (activeNetworkInfo == null) {
                    SparseArray sparseArray = ai.alpha;
                    type = -1;
                } else {
                    type = activeNetworkInfo.getType();
                }
                HashMap hashMap4 = (HashMap) charlie.delta;
                if (hashMap4 != null) {
                    hashMap4.put("net-type", String.valueOf(type));
                    if (activeNetworkInfo == null) {
                        SparseArray sparseArray2 = ah.alpha;
                    } else {
                        subtype = activeNetworkInfo.getSubtype();
                        if (subtype == -1) {
                            SparseArray sparseArray3 = ah.alpha;
                            subtype = 100;
                        }
                        hashMap = (HashMap) charlie.delta;
                        if (hashMap == null) {
                            hashMap.put("mobile-subtype", String.valueOf(subtype));
                            charlie.bravo("country", Locale.getDefault().getCountry());
                            charlie.bravo("locale", Locale.getDefault().getLanguage());
                            Context context = this.charlie;
                            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
                            if (simOperator == null) {
                                simOperator = "";
                            }
                            charlie.bravo("mcc_mnc", simOperator);
                            try {
                                i5 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                            } catch (PackageManager.NameNotFoundException e) {
                                D5.golf("CctTransportBackend", "Unable to find version code for package", e);
                            }
                            charlie.bravo("application_build", Integer.toString(i5));
                            return charlie.charlie();
                        }
                        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                    }
                    subtype = 0;
                    hashMap = (HashMap) charlie.delta;
                    if (hashMap == null) {
                    }
                } else {
                    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                }
            } else {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
        } else {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
    }
}
