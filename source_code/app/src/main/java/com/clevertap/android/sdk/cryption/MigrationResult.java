package com.clevertap.android.sdk.cryption;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/clevertap/android/sdk/cryption/MigrationResult;", "", Column.DATA, "", "migrationSuccessful", "", "<init>", "(Ljava/lang/String;Z)V", "getData", "()Ljava/lang/String;", "getMigrationSuccessful", "()Z", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MigrationResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String data;
    private final boolean migrationSuccessful;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/cryption/MigrationResult$Companion;", "", "<init>", "()V", "failure", "Lcom/clevertap/android/sdk/cryption/MigrationResult;", Column.DATA, "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MigrationResult failure(@Nullable String data) {
            return new MigrationResult(data, false);
        }

        private Companion() {
        }
    }

    public MigrationResult(@Nullable String str, boolean z2) {
        this.data = str;
        this.migrationSuccessful = z2;
    }

    public static /* synthetic */ MigrationResult copy$default(MigrationResult migrationResult, String str, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = migrationResult.data;
        }
        if ((i4 & 2) != 0) {
            z2 = migrationResult.migrationSuccessful;
        }
        return migrationResult.copy(str, z2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMigrationSuccessful() {
        return this.migrationSuccessful;
    }

    @NotNull
    public final MigrationResult copy(@Nullable String data, boolean migrationSuccessful) {
        return new MigrationResult(data, migrationSuccessful);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MigrationResult)) {
            return false;
        }
        MigrationResult migrationResult = (MigrationResult) other;
        return Intrinsics.areEqual(this.data, migrationResult.data) && this.migrationSuccessful == migrationResult.migrationSuccessful;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    public final boolean getMigrationSuccessful() {
        return this.migrationSuccessful;
    }

    public int hashCode() {
        String str = this.data;
        return ((str == null ? 0 : str.hashCode()) * 31) + (this.migrationSuccessful ? 1231 : 1237);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MigrationResult(data=");
        sb2.append(this.data);
        sb2.append(", migrationSuccessful=");
        return P0.gray(sb2, this.migrationSuccessful, ')');
    }
}
