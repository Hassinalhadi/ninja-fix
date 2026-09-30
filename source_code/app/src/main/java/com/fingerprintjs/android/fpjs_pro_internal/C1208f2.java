package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/fingerprintjs/android/fpjs_pro_internal/a2;", "alpha", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.f2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1208f2 extends Lambda implements Function0<List<? extends C1188a2>> {
    public static int purple;
    public static int red;
    public final /* synthetic */ C1212g2 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1208f2(C1212g2 c1212g2) {
        super(0);
        this.alpha = c1212g2;
    }

    public static int vD14832N6715() {
        int i4 = purple;
        int i5 = i4 % 6758084;
        purple = i4 + 1;
        if (i5 != 0) {
            return red;
        }
        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
        red = elapsedRealtime;
        return elapsedRealtime;
    }

    @NotNull
    public final List<C1188a2> alpha() {
        int collectionSizeOrDefault;
        int i4 = C1212g2.charlie;
        int i5 = (i4 ^ 19) + ((i4 & 19) << 1);
        int i10 = i5 % 128;
        C1212g2.bravo = i10;
        int i11 = i5 % 2;
        C1212g2 c1212g2 = this.alpha;
        if (i11 == 0) {
            SensorManager sensorManager = c1212g2.alpha;
            int i12 = i10 + 15;
            C1212g2.charlie = i12 % 128;
            if (i12 % 2 != 0) {
                Intrinsics.checkNotNull(sensorManager);
                List<Sensor> sensorList = sensorManager.getSensorList(-1);
                Intrinsics.checkNotNull(sensorList);
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sensorList, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (Sensor sensor : sensorList) {
                    Intrinsics.checkNotNull(sensor);
                    String name = sensor.getName();
                    Intrinsics.checkNotNull(name);
                    String vendor = sensor.getVendor();
                    Intrinsics.checkNotNull(vendor);
                    arrayList.add(new C1188a2(name, vendor));
                }
                return arrayList;
            }
            throw null;
        }
        SensorManager sensorManager2 = c1212g2.alpha;
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ List<? extends C1188a2> invoke() {
        w.o.papa();
        System.identityHashCode(this);
        return alpha();
    }
}
