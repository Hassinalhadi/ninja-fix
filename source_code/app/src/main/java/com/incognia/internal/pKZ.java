package com.incognia.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class pKZ implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final KDK f11067W;

    /* renamed from: b, reason: collision with root package name */
    public final Ssq f11068b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11069f9 = LazyKt.lazy(R4A.f9534b);
    public final SXL sVU = new SXL();

    public pKZ(Ssq ssq, KDK kdk) {
        this.f11068b = ssq;
        this.f11067W = kdk;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11069f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[Catch: all -> 0x000f, TryCatch #0 {all -> 0x000f, blocks: (B:3:0x0002, B:5:0x000c, B:6:0x0013, B:8:0x0021, B:9:0x0029, B:11:0x002f, B:13:0x003b, B:15:0x003e, B:18:0x0042, B:20:0x0066, B:22:0x0073, B:26:0x0086, B:28:0x008b, B:30:0x0090, B:31:0x0093, B:39:0x006e), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[Catch: all -> 0x000f, TryCatch #0 {all -> 0x000f, blocks: (B:3:0x0002, B:5:0x000c, B:6:0x0013, B:8:0x0021, B:9:0x0029, B:11:0x002f, B:13:0x003b, B:15:0x003e, B:18:0x0042, B:20:0x0066, B:22:0x0073, B:26:0x0086, B:28:0x008b, B:30:0x0090, B:31:0x0093, B:39:0x006e), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[Catch: all -> 0x000f, TryCatch #0 {all -> 0x000f, blocks: (B:3:0x0002, B:5:0x000c, B:6:0x0013, B:8:0x0021, B:9:0x0029, B:11:0x002f, B:13:0x003b, B:15:0x003e, B:18:0x0042, B:20:0x0066, B:22:0x0073, B:26:0x0086, B:28:0x008b, B:30:0x0090, B:31:0x0093, B:39:0x006e), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    @Override // com.incognia.internal.P0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(yE yEVar, WA wa2) {
        Object m206constructorimpl;
        List list;
        boolean z2;
        long j5;
        SXL sxl;
        boolean b2;
        boolean b4;
        KDK kdk;
        boolean contains;
        boolean b6;
        try {
            Result.Companion companion = Result.INSTANCE;
            r3 b10 = this.f11068b.b();
            list = b10 != null ? b10.f11197V : null;
            this.sVU.getClass();
            z2 = false;
            if (list != null) {
                Iterator it = SXL.f9603b.iterator();
                j5 = 0;
                int i4 = 0;
                while (it.hasNext()) {
                    if (list.contains((String) it.next())) {
                        j5 |= 1 << i4;
                    }
                    i4++;
                }
            } else {
                j5 = 0;
            }
            sxl = this.sVU;
            b2 = this.f11067W.b("android.permission.ACCESS_FINE_LOCATION");
            b4 = this.f11067W.b("android.permission.ACCESS_COARSE_LOCATION");
            kdk = this.f11067W;
            kdk.getClass();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (CnH.b(CnH.f8484b, 29, 0, 2)) {
            contains = kdk.b("android.permission.ACCESS_BACKGROUND_LOCATION");
        } else {
            if (list != null) {
                contains = list.contains("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            b6 = this.f11067W.b("android.permission.READ_PHONE_STATE");
            sxl.getClass();
            long j6 = !b2 ? 1L : 0L;
            if (b4) {
                j6 |= 2;
            }
            if (z2) {
                j6 |= 4;
            }
            if (b6) {
                j6 |= 8;
            }
            m206constructorimpl = Result.m206constructorimpl(new CSC((String) this.f11069f9.getValue(), new LA0(j5, j6)));
            Bo7.b(m206constructorimpl, wa2);
        }
        z2 = contains;
        b6 = this.f11067W.b("android.permission.READ_PHONE_STATE");
        sxl.getClass();
        if (!b2) {
        }
        if (b4) {
        }
        if (z2) {
        }
        if (b6) {
        }
        m206constructorimpl = Result.m206constructorimpl(new CSC((String) this.f11069f9.getValue(), new LA0(j5, j6)));
        Bo7.b(m206constructorimpl, wa2);
    }
}
