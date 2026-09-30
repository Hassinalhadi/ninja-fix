package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Process;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.CollectionsKt;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1224j2 implements SensorEventListener {
    public static int charlie = 0;
    public static int delta = 1;
    public static int echo;
    public static int foxtrot;
    public /* synthetic */ CountDownLatch alpha;
    public /* synthetic */ LinkedList bravo;

    public static int alpha() {
        int i4 = echo;
        int i5 = i4 % 7493607;
        echo = i4 + 1;
        if (i5 != 0) {
            return foxtrot;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        foxtrot = elapsedCpuTime;
        return elapsedCpuTime;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
        int i5 = delta;
        int i10 = (i5 ^ 29) + ((i5 & 29) << 1);
        charlie = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 86 / 0;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        int i4 = charlie;
        delta = ((i4 & 9) + (i4 | 9)) % 128;
        this.alpha.countDown();
        if (sensorEvent != null) {
            int i5 = charlie;
            int i10 = ((i5 & 99) + (i5 | 99)) % 128;
            delta = i10;
            fArr = sensorEvent.values;
            charlie = (i10 + 117) % 128;
        } else {
            fArr = null;
        }
        if (fArr == null) {
            int i11 = charlie + 77;
            delta = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 83 / 0;
                return;
            }
            return;
        }
        this.bravo.add(CollectionsKt.listOf(Float.valueOf(fArr[0]), Float.valueOf(fArr[1]), Float.valueOf(fArr[2])));
        int i13 = delta;
        int i14 = ((i13 | 47) << 1) - (i13 ^ 47);
        charlie = i14 % 128;
        if (i14 % 2 == 0) {
        } else {
            throw null;
        }
    }
}
