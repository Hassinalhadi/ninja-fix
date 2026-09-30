package io.getunleash.android.backup;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import io.getunleash.android.UnleashConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lio/getunleash/android/backup/LocalStorageConfig;", "", "enabled", "", "dir", "", "<init>", "(ZLjava/lang/String;)V", "getEnabled", "()Z", "getDir", "()Ljava/lang/String;", "newBuilder", "Lio/getunleash/android/backup/LocalStorageConfig$Builder;", "parent", "Lio/getunleash/android/UnleashConfig$Builder;", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "Builder", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LocalStorageConfig {

    @Nullable
    private final String dir;
    private final boolean enabled;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lio/getunleash/android/backup/LocalStorageConfig$Builder;", "", "parent", "Lio/getunleash/android/UnleashConfig$Builder;", "enabled", "", "dir", "", "<init>", "(Lio/getunleash/android/UnleashConfig$Builder;ZLjava/lang/String;)V", "getParent", "()Lio/getunleash/android/UnleashConfig$Builder;", "getEnabled", "()Z", "setEnabled", "(Z)V", "getDir", "()Ljava/lang/String;", "setDir", "(Ljava/lang/String;)V", "build", "Lio/getunleash/android/backup/LocalStorageConfig;", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Builder {

        @Nullable
        private String dir;
        private boolean enabled;

        @NotNull
        private final UnleashConfig.Builder parent;

        public Builder(@NotNull UnleashConfig.Builder parent, boolean z2, @Nullable String str) {
            Intrinsics.echo(parent, "parent");
            this.parent = parent;
            this.enabled = z2;
            this.dir = str;
        }

        @NotNull
        public final LocalStorageConfig build() {
            return new LocalStorageConfig(this.enabled, this.dir);
        }

        @NotNull
        public final UnleashConfig.Builder dir(@NotNull String dir) {
            Intrinsics.echo(dir, "dir");
            this.dir = dir;
            return this.parent;
        }

        @NotNull
        public final UnleashConfig.Builder enabled(boolean enabled) {
            this.enabled = enabled;
            return this.parent;
        }

        @Nullable
        public final String getDir() {
            return this.dir;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final UnleashConfig.Builder getParent() {
            return this.parent;
        }

        public final void setDir(@Nullable String str) {
            this.dir = str;
        }

        public final void setEnabled(boolean z2) {
            this.enabled = z2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalStorageConfig() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LocalStorageConfig copy$default(LocalStorageConfig localStorageConfig, boolean z2, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = localStorageConfig.enabled;
        }
        if ((i4 & 2) != 0) {
            str = localStorageConfig.dir;
        }
        return localStorageConfig.copy(z2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDir() {
        return this.dir;
    }

    @NotNull
    public final LocalStorageConfig copy(boolean enabled, @Nullable String dir) {
        return new LocalStorageConfig(enabled, dir);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalStorageConfig)) {
            return false;
        }
        LocalStorageConfig localStorageConfig = (LocalStorageConfig) other;
        return this.enabled == localStorageConfig.enabled && Intrinsics.areEqual(this.dir, localStorageConfig.dir);
    }

    @Nullable
    public final String getDir() {
        return this.dir;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        int i4;
        int hashCode;
        if (this.enabled) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = i4 * 31;
        String str = this.dir;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i5 + hashCode;
    }

    @NotNull
    public final Builder newBuilder(@NotNull UnleashConfig.Builder parent) {
        Intrinsics.echo(parent, "parent");
        return new Builder(parent, this.enabled, this.dir);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LocalStorageConfig(enabled=");
        sb2.append(this.enabled);
        sb2.append(", dir=");
        return P0.fuchsia(sb2, this.dir, ')');
    }

    public LocalStorageConfig(boolean z2, @Nullable String str) {
        this.enabled = z2;
        this.dir = str;
    }

    public /* synthetic */ LocalStorageConfig(boolean z2, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z2, (i4 & 2) != 0 ? null : str);
    }
}
