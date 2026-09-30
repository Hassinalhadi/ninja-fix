package com.clevertap.android.sdk.bitmap;

import Q0.c;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001BI\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003JK\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010+\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\rHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006/"}, d2 = {"Lcom/clevertap/android/sdk/bitmap/BitmapDownloadRequest;", "", "bitmapPath", "", "fallbackToAppIcon", "", "context", "Landroid/content/Context;", "instanceConfig", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "downloadTimeLimitInMillis", "", "downloadSizeLimitInBytes", "", "<init>", "(Ljava/lang/String;ZLandroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;JI)V", "getBitmapPath", "()Ljava/lang/String;", "setBitmapPath", "(Ljava/lang/String;)V", "getFallbackToAppIcon", "()Z", "setFallbackToAppIcon", "(Z)V", "getContext", "()Landroid/content/Context;", "getInstanceConfig", "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "getDownloadTimeLimitInMillis", "()J", "setDownloadTimeLimitInMillis", "(J)V", "getDownloadSizeLimitInBytes", "()I", "setDownloadSizeLimitInBytes", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BitmapDownloadRequest {

    @Nullable
    private String bitmapPath;

    @Nullable
    private final Context context;
    private int downloadSizeLimitInBytes;
    private long downloadTimeLimitInMillis;
    private boolean fallbackToAppIcon;

    @Nullable
    private final CleverTapInstanceConfig instanceConfig;

    public BitmapDownloadRequest(@Nullable String str) {
        this(str, false, null, null, 0L, 0, 62, null);
    }

    public static /* synthetic */ BitmapDownloadRequest copy$default(BitmapDownloadRequest bitmapDownloadRequest, String str, boolean z2, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j5, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = bitmapDownloadRequest.bitmapPath;
        }
        if ((i5 & 2) != 0) {
            z2 = bitmapDownloadRequest.fallbackToAppIcon;
        }
        if ((i5 & 4) != 0) {
            context = bitmapDownloadRequest.context;
        }
        if ((i5 & 8) != 0) {
            cleverTapInstanceConfig = bitmapDownloadRequest.instanceConfig;
        }
        if ((i5 & 16) != 0) {
            j5 = bitmapDownloadRequest.downloadTimeLimitInMillis;
        }
        if ((i5 & 32) != 0) {
            i4 = bitmapDownloadRequest.downloadSizeLimitInBytes;
        }
        int i10 = i4;
        long j6 = j5;
        return bitmapDownloadRequest.copy(str, z2, context, cleverTapInstanceConfig, j6, i10);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getBitmapPath() {
        return this.bitmapPath;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFallbackToAppIcon() {
        return this.fallbackToAppIcon;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final CleverTapInstanceConfig getInstanceConfig() {
        return this.instanceConfig;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDownloadTimeLimitInMillis() {
        return this.downloadTimeLimitInMillis;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDownloadSizeLimitInBytes() {
        return this.downloadSizeLimitInBytes;
    }

    @NotNull
    public final BitmapDownloadRequest copy(@Nullable String bitmapPath, boolean fallbackToAppIcon, @Nullable Context context, @Nullable CleverTapInstanceConfig instanceConfig, long downloadTimeLimitInMillis, int downloadSizeLimitInBytes) {
        return new BitmapDownloadRequest(bitmapPath, fallbackToAppIcon, context, instanceConfig, downloadTimeLimitInMillis, downloadSizeLimitInBytes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitmapDownloadRequest)) {
            return false;
        }
        BitmapDownloadRequest bitmapDownloadRequest = (BitmapDownloadRequest) other;
        return Intrinsics.areEqual(this.bitmapPath, bitmapDownloadRequest.bitmapPath) && this.fallbackToAppIcon == bitmapDownloadRequest.fallbackToAppIcon && Intrinsics.areEqual(this.context, bitmapDownloadRequest.context) && Intrinsics.areEqual(this.instanceConfig, bitmapDownloadRequest.instanceConfig) && this.downloadTimeLimitInMillis == bitmapDownloadRequest.downloadTimeLimitInMillis && this.downloadSizeLimitInBytes == bitmapDownloadRequest.downloadSizeLimitInBytes;
    }

    @Nullable
    public final String getBitmapPath() {
        return this.bitmapPath;
    }

    @Nullable
    public final Context getContext() {
        return this.context;
    }

    public final int getDownloadSizeLimitInBytes() {
        return this.downloadSizeLimitInBytes;
    }

    public final long getDownloadTimeLimitInMillis() {
        return this.downloadTimeLimitInMillis;
    }

    public final boolean getFallbackToAppIcon() {
        return this.fallbackToAppIcon;
    }

    @Nullable
    public final CleverTapInstanceConfig getInstanceConfig() {
        return this.instanceConfig;
    }

    public int hashCode() {
        int hashCode;
        int i4;
        int hashCode2;
        String str = this.bitmapPath;
        int i5 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        if (this.fallbackToAppIcon) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = (i10 + i4) * 31;
        Context context = this.context;
        if (context == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = context.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.instanceConfig;
        if (cleverTapInstanceConfig != null) {
            i5 = cleverTapInstanceConfig.hashCode();
        }
        int i13 = (i12 + i5) * 31;
        long j5 = this.downloadTimeLimitInMillis;
        return ((i13 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.downloadSizeLimitInBytes;
    }

    public final void setBitmapPath(@Nullable String str) {
        this.bitmapPath = str;
    }

    public final void setDownloadSizeLimitInBytes(int i4) {
        this.downloadSizeLimitInBytes = i4;
    }

    public final void setDownloadTimeLimitInMillis(long j5) {
        this.downloadTimeLimitInMillis = j5;
    }

    public final void setFallbackToAppIcon(boolean z2) {
        this.fallbackToAppIcon = z2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapDownloadRequest(bitmapPath=");
        sb2.append(this.bitmapPath);
        sb2.append(", fallbackToAppIcon=");
        sb2.append(this.fallbackToAppIcon);
        sb2.append(", context=");
        sb2.append(this.context);
        sb2.append(", instanceConfig=");
        sb2.append(this.instanceConfig);
        sb2.append(", downloadTimeLimitInMillis=");
        sb2.append(this.downloadTimeLimitInMillis);
        sb2.append(", downloadSizeLimitInBytes=");
        return c.quebec(sb2, this.downloadSizeLimitInBytes, ')');
    }

    public BitmapDownloadRequest(@Nullable String str, boolean z2) {
        this(str, z2, null, null, 0L, 0, 60, null);
    }

    public BitmapDownloadRequest(@Nullable String str, boolean z2, @Nullable Context context) {
        this(str, z2, context, null, 0L, 0, 56, null);
    }

    public BitmapDownloadRequest(@Nullable String str, boolean z2, @Nullable Context context, @Nullable CleverTapInstanceConfig cleverTapInstanceConfig) {
        this(str, z2, context, cleverTapInstanceConfig, 0L, 0, 48, null);
    }

    public BitmapDownloadRequest(@Nullable String str, boolean z2, @Nullable Context context, @Nullable CleverTapInstanceConfig cleverTapInstanceConfig, long j5) {
        this(str, z2, context, cleverTapInstanceConfig, j5, 0, 32, null);
    }

    public BitmapDownloadRequest(@Nullable String str, boolean z2, @Nullable Context context, @Nullable CleverTapInstanceConfig cleverTapInstanceConfig, long j5, int i4) {
        this.bitmapPath = str;
        this.fallbackToAppIcon = z2;
        this.context = context;
        this.instanceConfig = cleverTapInstanceConfig;
        this.downloadTimeLimitInMillis = j5;
        this.downloadSizeLimitInBytes = i4;
    }

    public /* synthetic */ BitmapDownloadRequest(String str, boolean z2, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j5, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? false : z2, (i5 & 4) != 0 ? null : context, (i5 & 8) == 0 ? cleverTapInstanceConfig : null, (i5 & 16) != 0 ? -1L : j5, (i5 & 32) != 0 ? -1 : i4);
    }
}
