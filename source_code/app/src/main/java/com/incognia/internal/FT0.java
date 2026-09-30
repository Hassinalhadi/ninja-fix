package com.incognia.internal;

import android.bluetooth.BluetoothManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class FT0 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wE f8705b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FT0(wE wEVar) {
        super(0);
        this.f8705b = wEVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BluetoothManager bluetoothManager;
        Object systemService = this.f8705b.f11604b.getSystemService("bluetooth");
        if (systemService instanceof BluetoothManager) {
            bluetoothManager = (BluetoothManager) systemService;
        } else {
            bluetoothManager = null;
        }
        if (bluetoothManager == null) {
            return null;
        }
        return bluetoothManager.getAdapter();
    }
}
