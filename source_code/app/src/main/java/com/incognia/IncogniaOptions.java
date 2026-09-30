package com.incognia;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/incognia/IncogniaOptions;", "", "appId", "", "logEnabled", "", "locationEnabled", "backgroundWakeUpEnabled", "installedAppsCollectionEnabled", "(Ljava/lang/String;ZZZZ)V", "getAppId", "()Ljava/lang/String;", "getBackgroundWakeUpEnabled$annotations", "()V", "getBackgroundWakeUpEnabled", "()Z", "getInstalledAppsCollectionEnabled", "getLocationEnabled", "getLogEnabled", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "Builder", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IncogniaOptions {
    private final String appId;
    private final boolean backgroundWakeUpEnabled;
    private final boolean installedAppsCollectionEnabled;
    private final boolean locationEnabled;
    private final boolean logEnabled;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/incognia/IncogniaOptions$Builder;", "", "()V", "appId", "", "backgroundWakeUpEnabled", "", "installedAppsCollectionEnabled", "locationEnabled", "logEnabled", "build", "Lcom/incognia/IncogniaOptions;", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {
        private String appId;
        private boolean backgroundWakeUpEnabled;
        private boolean installedAppsCollectionEnabled;
        private boolean locationEnabled = true;
        private boolean logEnabled;

        public final Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        @c
        public final Builder backgroundWakeUpEnabled(boolean backgroundWakeUpEnabled) {
            this.backgroundWakeUpEnabled = backgroundWakeUpEnabled;
            return this;
        }

        public final IncogniaOptions build() {
            String str = this.appId;
            if (str == null) {
                str = null;
            }
            return new IncogniaOptions(str, this.logEnabled, this.locationEnabled, this.backgroundWakeUpEnabled, this.installedAppsCollectionEnabled);
        }

        public final Builder installedAppsCollectionEnabled(boolean installedAppsCollectionEnabled) {
            this.installedAppsCollectionEnabled = installedAppsCollectionEnabled;
            return this;
        }

        public final Builder locationEnabled(boolean locationEnabled) {
            this.locationEnabled = locationEnabled;
            return this;
        }

        public final Builder logEnabled(boolean logEnabled) {
            this.logEnabled = logEnabled;
            return this;
        }
    }

    public IncogniaOptions(String str, boolean z2, boolean z10, boolean z11, boolean z12) {
        this.appId = str;
        this.logEnabled = z2;
        this.locationEnabled = z10;
        this.backgroundWakeUpEnabled = z11;
        this.installedAppsCollectionEnabled = z12;
    }

    public static /* synthetic */ IncogniaOptions copy$default(IncogniaOptions incogniaOptions, String str, boolean z2, boolean z10, boolean z11, boolean z12, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = incogniaOptions.appId;
        }
        if ((i4 & 2) != 0) {
            z2 = incogniaOptions.logEnabled;
        }
        if ((i4 & 4) != 0) {
            z10 = incogniaOptions.locationEnabled;
        }
        if ((i4 & 8) != 0) {
            z11 = incogniaOptions.backgroundWakeUpEnabled;
        }
        if ((i4 & 16) != 0) {
            z12 = incogniaOptions.installedAppsCollectionEnabled;
        }
        boolean z13 = z12;
        boolean z14 = z10;
        return incogniaOptions.copy(str, z2, z14, z11, z13);
    }

    @c
    public static /* synthetic */ void getBackgroundWakeUpEnabled$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getLogEnabled() {
        return this.logEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getLocationEnabled() {
        return this.locationEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getBackgroundWakeUpEnabled() {
        return this.backgroundWakeUpEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getInstalledAppsCollectionEnabled() {
        return this.installedAppsCollectionEnabled;
    }

    public final IncogniaOptions copy(String appId, boolean logEnabled, boolean locationEnabled, boolean backgroundWakeUpEnabled, boolean installedAppsCollectionEnabled) {
        return new IncogniaOptions(appId, logEnabled, locationEnabled, backgroundWakeUpEnabled, installedAppsCollectionEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncogniaOptions)) {
            return false;
        }
        IncogniaOptions incogniaOptions = (IncogniaOptions) other;
        return Intrinsics.areEqual(this.appId, incogniaOptions.appId) && this.logEnabled == incogniaOptions.logEnabled && this.locationEnabled == incogniaOptions.locationEnabled && this.backgroundWakeUpEnabled == incogniaOptions.backgroundWakeUpEnabled && this.installedAppsCollectionEnabled == incogniaOptions.installedAppsCollectionEnabled;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final boolean getBackgroundWakeUpEnabled() {
        return this.backgroundWakeUpEnabled;
    }

    public final boolean getInstalledAppsCollectionEnabled() {
        return this.installedAppsCollectionEnabled;
    }

    public final boolean getLocationEnabled() {
        return this.locationEnabled;
    }

    public final boolean getLogEnabled() {
        return this.logEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.appId.hashCode() * 31;
        boolean z2 = this.logEnabled;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode + i4) * 31;
        boolean z10 = this.locationEnabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (i5 + i10) * 31;
        boolean z11 = this.backgroundWakeUpEnabled;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.installedAppsCollectionEnabled;
        return i13 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IncogniaOptions(appId=");
        sb2.append(this.appId);
        sb2.append(", logEnabled=");
        sb2.append(this.logEnabled);
        sb2.append(", locationEnabled=");
        sb2.append(this.locationEnabled);
        sb2.append(", backgroundWakeUpEnabled=");
        sb2.append(this.backgroundWakeUpEnabled);
        sb2.append(", installedAppsCollectionEnabled=");
        return P0.gray(sb2, this.installedAppsCollectionEnabled, ')');
    }

    public /* synthetic */ IncogniaOptions(String str, boolean z2, boolean z10, boolean z11, boolean z12, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? true : z10, (i4 & 8) != 0 ? false : z11, (i4 & 16) != 0 ? false : z12);
    }
}
