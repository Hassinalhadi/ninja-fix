package E0;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.text.LineBreakConfig;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.List;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ boolean amber(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig.Builder azure(LineBreakConfig.Builder builder, int i4) {
        return builder.setLineBreakWordStyle(i4);
    }

    public static /* bridge */ /* synthetic */ int bravo() {
        return MediaStore.getPickImagesMaxLimit();
    }

    public static /* bridge */ /* synthetic */ PackageInfo charlie(PackageManager packageManager, String str, PackageManager.PackageInfoFlags packageInfoFlags) {
        return packageManager.getPackageInfo(str, packageInfoFlags);
    }

    public static /* bridge */ /* synthetic */ PackageManager.PackageInfoFlags delta() {
        return PackageManager.PackageInfoFlags.of(0L);
    }

    public static /* bridge */ /* synthetic */ PackageManager.ResolveInfoFlags foxtrot(long j5) {
        return PackageManager.ResolveInfoFlags.of(j5);
    }

    public static /* synthetic */ LineBreakConfig.Builder golf() {
        return new LineBreakConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig.Builder hotel(LineBreakConfig.Builder builder, int i4) {
        return builder.setLineBreakStyle(i4);
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig india(LineBreakConfig.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ BoringLayout.Metrics juliet(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static /* synthetic */ BoringLayout kilo(CharSequence charSequence, TextPaint textPaint, int i4, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z2, TextUtils.TruncateAt truncateAt, int i5) {
        return new BoringLayout(charSequence, textPaint, i4, alignment, 1.0f, 0.0f, metrics, z2, truncateAt, i5, true);
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback lima(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher papa(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ List tango(PackageManager packageManager, Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        return packageManager.queryIntentActivities(intent, resolveInfoFlags);
    }

    public static /* bridge */ /* synthetic */ void uniform(StaticLayout.Builder builder, LineBreakConfig lineBreakConfig) {
        builder.setLineBreakConfig(lineBreakConfig);
    }

    public static /* bridge */ /* synthetic */ boolean zulu(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
