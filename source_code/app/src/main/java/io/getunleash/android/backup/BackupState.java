package io.getunleash.android.backup;

import com.clevertap.android.sdk.Constants;
import io.getunleash.android.data.Toggle;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lio/getunleash/android/backup/BackupState;", "", "contextId", "", "toggles", "", "Lio/getunleash/android/data/Toggle;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getContextId", "()Ljava/lang/String;", "getToggles", "()Ljava/util/Map;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BackupState {

    @NotNull
    private final String contextId;

    @NotNull
    private final Map<String, Toggle> toggles;

    public BackupState(@NotNull String contextId, @NotNull Map<String, Toggle> toggles) {
        Intrinsics.echo(contextId, "contextId");
        Intrinsics.echo(toggles, "toggles");
        this.contextId = contextId;
        this.toggles = toggles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BackupState copy$default(BackupState backupState, String str, Map map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = backupState.contextId;
        }
        if ((i4 & 2) != 0) {
            map = backupState.toggles;
        }
        return backupState.copy(str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getContextId() {
        return this.contextId;
    }

    @NotNull
    public final Map<String, Toggle> component2() {
        return this.toggles;
    }

    @NotNull
    public final BackupState copy(@NotNull String contextId, @NotNull Map<String, Toggle> toggles) {
        Intrinsics.echo(contextId, "contextId");
        Intrinsics.echo(toggles, "toggles");
        return new BackupState(contextId, toggles);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackupState)) {
            return false;
        }
        BackupState backupState = (BackupState) other;
        return Intrinsics.areEqual(this.contextId, backupState.contextId) && Intrinsics.areEqual(this.toggles, backupState.toggles);
    }

    @NotNull
    public final String getContextId() {
        return this.contextId;
    }

    @NotNull
    public final Map<String, Toggle> getToggles() {
        return this.toggles;
    }

    public int hashCode() {
        return this.toggles.hashCode() + (this.contextId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BackupState(contextId=" + this.contextId + ", toggles=" + this.toggles + ')';
    }
}
