package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.hardware.input.InputManager;
import android.os.Process;
import com.fingerprintjs.android.fpjs_pro_internal.getRightG17489;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/hardware/input/InputManager;", "alpha", "()Landroid/hardware/input/InputManager;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class aq extends Lambda implements Function0<InputManager> {
    public static int purple;
    public static int red;
    public final /* synthetic */ Context alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(Context context) {
        super(0);
        this.alpha = context;
    }

    public static int D8871() {
        int i4 = purple;
        int i5 = i4 % 5687299;
        purple = i4 + 1;
        if (i5 != 0) {
            return red;
        }
        int myTid = Process.myTid();
        red = myTid;
        return myTid;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final InputManager invoke() {
        int i4;
        int identityHashCode = System.identityHashCode(this);
        int i5 = ~identityHashCode;
        int i10 = -(-(((~((i5 & (-195727415)) | ((-195727415) ^ i5))) | 2103357183) * 519));
        int i11 = ((-1219880254) ^ i10) + ((i10 & (-1219880254)) << 1);
        int i12 = (~identityHashCode) | (-195727415);
        int i13 = ((~((i12 & 2103357183) | (i12 ^ 2103357183))) | (~((2147401471 & identityHashCode) | (2147401471 ^ identityHashCode)))) * (-519);
        int i14 = (i11 & i13) + (i13 | i11);
        int i15 = ~(identityHashCode | 2103357183);
        int i16 = -(-(((i15 & 195727414) | (195727414 ^ i15)) * 519));
        int i17 = (i14 & i16) + (i16 | i14);
        int i18 = getRightG17489.c.purple;
        int i19 = i18 % 5279285;
        getRightG17489.c.purple = i18 + 1;
        if (i19 != 0) {
            i4 = getRightG17489.c.red;
        } else {
            i4 = (int) Runtime.getRuntime().totalMemory();
            getRightG17489.c.red = i4;
        }
        int i20 = ~i4;
        int i21 = ~((i20 & (-1502232853)) | ((-1502232853) ^ i20));
        int i22 = ~(((-799978839) ^ i4) | ((-799978839) & i4));
        int i23 = ~(((-1502232853) & i4) | ((-1502232853) ^ i4));
        int i24 = ~i4;
        int i25 = ~((i24 & (-799978839)) | (i24 ^ (-799978839)));
        int i26 = (((((i21 & i22) | (i21 ^ i22)) * 333) - 1430060069) - (~(-(-(((i25 & i23) | (i23 ^ i25)) * 333))))) - 1;
        InputManager inputManager = (InputManager) this.alpha.getSystemService("input");
        if (i17 > i26) {
            int i27 = 73 / 0;
        }
        return inputManager;
    }
}
