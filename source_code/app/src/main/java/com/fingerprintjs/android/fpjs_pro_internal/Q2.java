package com.fingerprintjs.android.fpjs_pro_internal;

import android.app.ActivityManager;
import android.content.pm.ConfigurationInfo;
import android.os.Process;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "alpha", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Q2 extends Lambda implements Function0<String> {
    public static int purple = 0;
    public static int red = 1;
    public static int silver;
    public static int teal;
    public final /* synthetic */ av.ah alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(av.ah ahVar) {
        super(0);
        this.alpha = ahVar;
    }

    public static int D8871() {
        int i4 = silver;
        int i5 = i4 % 6546874;
        silver = i4 + 1;
        if (i5 != 0) {
            return teal;
        }
        int myTid = Process.myTid();
        teal = myTid;
        return myTid;
    }

    @NotNull
    public final String alpha() {
        int i4 = purple;
        red = ((i4 & 73) + (i4 | 73)) % 128;
        int i5 = av.ah.white;
        int i10 = (i5 & 61) + (i5 | 61);
        av.ah.yellow = i10 % 128;
        int i11 = i10 % 2;
        ActivityManager activityManager = (ActivityManager) this.alpha.purple;
        if (i11 == 0) {
            int i12 = 5 / 0;
        }
        Intrinsics.checkNotNull(activityManager);
        ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
        Intrinsics.checkNotNull(deviceConfigurationInfo);
        String glEsVersion = deviceConfigurationInfo.getGlEsVersion();
        Intrinsics.checkNotNull(glEsVersion);
        int i13 = red;
        purple = (((i13 | 89) << 1) - (i13 ^ 89)) % 128;
        return glEsVersion;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ String invoke() {
        int i4 = red;
        purple = ((i4 ^ 105) + ((i4 & 105) << 1)) % 128;
        String alpha = alpha();
        purple = (red + 85) % 128;
        return alpha;
    }
}
