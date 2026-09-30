package com.fingerprintjs.android.fpjs_pro_internal;

import android.hardware.input.InputManager;
import android.os.SystemClock;
import android.view.InputDevice;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/fingerprintjs/android/fpjs_pro_internal/c;", "alpha", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class N0 extends Lambda implements Function0<List<? extends C1193c>> {
    public static int purple = 0;
    public static int red = 1;
    public static int silver;
    public static int teal;
    public final /* synthetic */ O0 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N0(O0 o02) {
        super(0);
        this.alpha = o02;
    }

    public static int D8871() {
        int i4 = silver;
        int i5 = i4 % 9384174;
        silver = i4 + 1;
        if (i5 != 0) {
            return teal;
        }
        int uptimeMillis = (int) SystemClock.uptimeMillis();
        teal = uptimeMillis;
        return uptimeMillis;
    }

    @NotNull
    public final List<C1193c> alpha() {
        O0 o02 = this.alpha;
        InputManager alpha = O0.alpha(o02);
        Intrinsics.checkNotNull(alpha);
        int[] inputDeviceIds = alpha.getInputDeviceIds();
        Intrinsics.checkNotNull(inputDeviceIds);
        ArrayList arrayList = new ArrayList(inputDeviceIds.length);
        for (int i4 : inputDeviceIds) {
            InputDevice inputDevice = O0.alpha(o02).getInputDevice(i4);
            Intrinsics.checkNotNull(inputDevice);
            String valueOf = String.valueOf(inputDevice.getVendorId());
            String name = inputDevice.getName();
            Intrinsics.checkNotNull(name);
            arrayList.add(new C1193c(name, valueOf));
        }
        red = (purple + 33) % 128;
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ List<? extends C1193c> invoke() {
        int i4 = red;
        purple = ((i4 ^ 117) + ((i4 & 117) << 1)) % 128;
        List<C1193c> alpha = alpha();
        int i5 = red;
        int i10 = (i5 ^ 73) + ((i5 & 73) << 1);
        purple = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 44 / 0;
        }
        return alpha;
    }
}
