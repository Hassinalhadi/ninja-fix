package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Process;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/hardware/SensorManager;", "alpha", "()Landroid/hardware/SensorManager;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class at extends Lambda implements Function0<SensorManager> {
    public static int purple;
    public static int red;
    public final /* synthetic */ Context alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(Context context) {
        super(0);
        this.alpha = context;
    }

    public static int component9() {
        int i4 = purple;
        int i5 = i4 % 9678267;
        purple = i4 + 1;
        if (i5 != 0) {
            return red;
        }
        int myUid = Process.myUid();
        red = myUid;
        return myUid;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final SensorManager invoke() {
        int identityHashCode = System.identityHashCode(this);
        int i4 = 1871413993 - (~(-(-((((-405776480) ^ identityHashCode) | ((-405776480) & identityHashCode)) * (-859)))));
        int i5 = ~identityHashCode;
        int i10 = (((~((identityHashCode & 1518333567) | (1518333567 ^ identityHashCode))) | (~(((-405776480) & i5) | (i5 ^ (-405776480))))) * 859) + i4;
        int i11 = ((~((1114719784 & i5) | (1114719784 ^ i5))) | 403613783) * 859;
        int i12 = (i10 & i11) + (i10 | i11);
        int alpha = U0.alpha();
        int i13 = ~alpha;
        int i14 = (510799295 & i13) | (i13 ^ 510799295);
        int i15 = -(-((~((1549943296 & i14) | (i14 ^ 1549943296))) * 52));
        int i16 = (~((~alpha) | (-1549943297))) | 1073758720;
        int i17 = ~i14;
        int i18 = (((261655795 ^ i15) + ((i15 & 261655795) << 1)) - (~(((i16 & i17) | (i16 ^ i17)) * (-52)))) - 1;
        int i19 = ~((-510799296) | i13);
        int i20 = (((i19 & 34614719) | (i19 ^ 34614719)) * 52) + i18;
        Context context = this.alpha;
        if (i12 <= i20) {
            return (SensorManager) context.getSystemService("sensor");
        }
        throw null;
    }
}
