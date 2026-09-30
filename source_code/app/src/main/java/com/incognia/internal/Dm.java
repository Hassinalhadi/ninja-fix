package com.incognia.internal;

import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes2.dex */
public final class Dm {

    /* renamed from: f9, reason: collision with root package name */
    public static final ArrayList f8565f9 = CollectionsKt.azure((String) wGk.ESK.getValue(), (String) wGk.JOo.getValue(), (String) wGk.yzp.getValue(), (String) wGk.Kp.getValue(), (String) wGk.abb.getValue(), (String) wGk.OF.getValue(), (String) wGk.x63.getValue(), (String) wGk.bO.getValue(), (String) wGk.wSb.getValue(), (String) wGk.Yx7.getValue());

    /* renamed from: W, reason: collision with root package name */
    public final S0A f8566W;

    /* renamed from: b, reason: collision with root package name */
    public final FW f8567b;

    public Dm(S0A s0a, FW fw) {
        this.f8567b = fw;
        this.f8566W = s0a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00be A[Catch: all -> 0x00cd, TRY_ENTER, TryCatch #2 {all -> 0x00cd, blocks: (B:13:0x008f, B:18:0x00a2, B:25:0x00be, B:28:0x00c7), top: B:12:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Set b() {
        int collectionSizeOrDefault;
        Z1e z1e;
        boolean z2;
        Long l10;
        long lastModified;
        List<String> b2 = this.f8566W.b((String) wGk.tRh.getValue(), f8565f9);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(b2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str : b2) {
            this.f8567b.getClass();
            arrayList.add((Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data") + '/' + str);
        }
        try {
            Set<String> D10 = CollectionsKt.D(CollectionsKt.a(arrayList, this.f8566W.b((String) wGk.oL.getValue(), CollectionsKt.emptyList())));
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : D10) {
                try {
                    this.f8567b.getClass();
                    try {
                        z2 = new File(str2).exists();
                    } catch (Throwable unused) {
                        z2 = false;
                    }
                } catch (Throwable unused2) {
                }
                if (z2) {
                    this.f8567b.getClass();
                    try {
                        lastModified = new File(str2).lastModified();
                    } catch (Throwable unused3) {
                    }
                    if (lastModified > 0) {
                        l10 = Long.valueOf(lastModified);
                        if (l10 != null) {
                            long longValue = l10.longValue();
                            if (longValue > 0) {
                                z1e = new Z1e(str2, longValue);
                                if (z1e == null) {
                                    arrayList2.add(z1e);
                                }
                            }
                        }
                    }
                    l10 = null;
                    if (l10 != null) {
                    }
                }
                z1e = null;
                if (z1e == null) {
                }
            }
            return CollectionsKt.D(arrayList2);
        } catch (Throwable unused4) {
            return null;
        }
    }
}
