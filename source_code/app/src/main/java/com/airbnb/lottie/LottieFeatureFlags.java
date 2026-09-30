package com.airbnb.lottie;

import android.annotation.SuppressLint;
import android.os.Build;
import com.airbnb.lottie.utils.Logger;
import java.util.HashSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class LottieFeatureFlags {
    private final HashSet<LottieFeatureFlag> enabledFlags = new HashSet<>();

    @SuppressLint({"DefaultLocale"})
    public boolean enableFlag(LottieFeatureFlag lottieFeatureFlag, boolean z2) {
        if (z2) {
            if (Build.VERSION.SDK_INT < lottieFeatureFlag.minRequiredSdkVersion) {
                Logger.warning(String.format("%s is not supported pre SDK %d", lottieFeatureFlag.name(), Integer.valueOf(lottieFeatureFlag.minRequiredSdkVersion)));
                return false;
            }
            return this.enabledFlags.add(lottieFeatureFlag);
        }
        return this.enabledFlags.remove(lottieFeatureFlag);
    }

    public boolean isFlagEnabled(LottieFeatureFlag lottieFeatureFlag) {
        return this.enabledFlags.contains(lottieFeatureFlag);
    }
}
