package com.incognia.internal;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.collections.ab;

/* loaded from: classes2.dex */
public final class L7E {

    /* renamed from: W, reason: collision with root package name */
    public final ccL f9042W;

    /* renamed from: b, reason: collision with root package name */
    public final String f9043b;

    /* renamed from: f9, reason: collision with root package name */
    public final W6 f9044f9;
    public final De0 sVU;

    public L7E(String str, ccL ccl, W6 w62) {
        De0 de0 = new De0(str);
        this.f9043b = str;
        this.f9042W = ccl;
        this.f9044f9 = w62;
        this.sVU = de0;
    }

    public final boolean W(List list) {
        boolean z2;
        ArrayList arrayList;
        if (list != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                U91 u91 = (U91) it.next();
                Lazy lazy = U91.f9697b;
                AI b2 = this.f9042W.b(this.f9043b);
                List list2 = null;
                if (b2 != null) {
                    arrayList = b2.sVU;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        try {
                            arrayList2.add(kBc.b((String) obj));
                        } catch (Throwable unused) {
                        }
                    }
                    list2 = arrayList2;
                }
                if (list2 == null) {
                    list2 = ab.juliet(LUA.f9060W);
                }
                if (list2.contains(u91)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(List list) {
        Boolean bool;
        Boolean bool2;
        AI b2 = this.f9042W.b(this.f9043b);
        if ((b2 == null || (bool2 = b2.f8349f9) == null) ? true : bool2.booleanValue()) {
            AI b4 = this.f9042W.b(this.f9043b);
            if (((b4 == null || (bool = b4.f8347W) == null) ? false : bool.booleanValue()) || b() || W(list)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        Long l10;
        De0 de0 = this.sVU;
        de0.getClass();
        Long sVU = QHn.f9492b.sVU(de0.f8552b);
        this.f9044f9.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (sVU != null && elapsedRealtime >= sVU.longValue()) {
            long longValue = sVU.longValue();
            AI b2 = this.f9042W.b(this.f9043b);
            if (elapsedRealtime - longValue < ((b2 == null || (l10 = b2.f8348b) == null) ? TimeUnit.DAYS.toMillis(1L) : l10.longValue())) {
                return false;
            }
        }
        return true;
    }
}
