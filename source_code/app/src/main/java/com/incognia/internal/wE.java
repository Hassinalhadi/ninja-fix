package com.incognia.internal;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.k;

/* loaded from: classes2.dex */
public final class wE {

    /* renamed from: W, reason: collision with root package name */
    public final KDK f11603W;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11604b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11605f9 = LazyKt.lazy(new FT0(this));
    public final t1 sVU = new t1();

    public wE(Context context, KDK kdk) {
        this.f11604b = context;
        this.f11603W = kdk;
    }

    public final List b() {
        Object m206constructorimpl;
        BluetoothAdapter bluetoothAdapter;
        boolean b2;
        Set<BluetoothDevice> bondedDevices;
        int collectionSizeOrDefault;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            bluetoothAdapter = (BluetoothAdapter) this.f11605f9.getValue();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (bluetoothAdapter != null) {
            KDK kdk = this.f11603W;
            kdk.getClass();
            if (CnH.b(CnH.f8484b, 31, 0, 2)) {
                b2 = kdk.b("android.permission.BLUETOOTH_CONNECT");
            } else {
                b2 = kdk.b("android.permission.BLUETOOTH");
            }
            if (b2 && (bondedDevices = bluetoothAdapter.getBondedDevices()) != null) {
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bondedDevices, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    this.sVU.getClass();
                    arrayList.add(t1.b(bluetoothDevice));
                }
                m206constructorimpl = Result.m206constructorimpl(arrayList);
                if (!(m206constructorimpl instanceof k)) {
                    obj = m206constructorimpl;
                }
                return (List) obj;
            }
        }
        return null;
    }
}
