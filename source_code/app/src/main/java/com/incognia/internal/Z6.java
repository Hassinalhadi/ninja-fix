package com.incognia.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class Z6 {

    /* renamed from: W, reason: collision with root package name */
    public final Bym f10023W = new Bym();

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f10024b;

    public Z6(Context context) {
        this.f10024b = (SensorManager) context.getSystemService("sensor");
    }

    public final ArrayList b() {
        try {
            List<Sensor> sensorList = this.f10024b.getSensorList(-1);
            this.f10023W.getClass();
            return Bym.b(sensorList);
        } catch (Throwable unused) {
            return null;
        }
    }
}
