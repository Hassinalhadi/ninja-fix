package com.clevertap.android.sdk.network.api;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/clevertap/android/sdk/network/api/EncryptionSuccess;", "Lcom/clevertap/android/sdk/network/api/EncryptionResult;", Column.DATA, "", "iv", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getIv", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EncryptionSuccess extends EncryptionResult {

    @NotNull
    private final String data;

    @NotNull
    private final String iv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptionSuccess(@NotNull String data, @NotNull String iv) {
        super(null);
        Intrinsics.echo(data, "data");
        Intrinsics.echo(iv, "iv");
        this.data = data;
        this.iv = iv;
    }

    public static /* synthetic */ EncryptionSuccess copy$default(EncryptionSuccess encryptionSuccess, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = encryptionSuccess.data;
        }
        if ((i4 & 2) != 0) {
            str2 = encryptionSuccess.iv;
        }
        return encryptionSuccess.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIv() {
        return this.iv;
    }

    @NotNull
    public final EncryptionSuccess copy(@NotNull String data, @NotNull String iv) {
        Intrinsics.echo(data, "data");
        Intrinsics.echo(iv, "iv");
        return new EncryptionSuccess(data, iv);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptionSuccess)) {
            return false;
        }
        EncryptionSuccess encryptionSuccess = (EncryptionSuccess) other;
        return Intrinsics.areEqual(this.data, encryptionSuccess.data) && Intrinsics.areEqual(this.iv, encryptionSuccess.iv);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getIv() {
        return this.iv;
    }

    public int hashCode() {
        return this.iv.hashCode() + (this.data.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EncryptionSuccess(data=");
        sb2.append(this.data);
        sb2.append(", iv=");
        return P0.fuchsia(sb2, this.iv, ')');
    }
}
