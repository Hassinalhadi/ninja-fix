package com.clevertap.android.sdk.network.api;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/clevertap/android/sdk/network/api/EncryptedResponseBody;", "", "encryptedPayload", "", "iv", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEncryptedPayload", "()Ljava/lang/String;", "getIv", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EncryptedResponseBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String encryptedPayload;

    @NotNull
    private final String iv;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/network/api/EncryptedResponseBody$Companion;", "", "<init>", "()V", "fromJsonString", "Lcom/clevertap/android/sdk/network/api/EncryptedResponseBody;", "json", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EncryptedResponseBody fromJsonString(@NotNull String json) {
            Intrinsics.echo(json, "json");
            JSONObject jSONObject = new JSONObject(json);
            String string = jSONObject.getString("itp");
            Intrinsics.delta(string, "getString(...)");
            String string2 = jSONObject.getString("itv");
            Intrinsics.delta(string2, "getString(...)");
            return new EncryptedResponseBody(string, string2);
        }

        private Companion() {
        }
    }

    public EncryptedResponseBody(@NotNull String encryptedPayload, @NotNull String iv) {
        Intrinsics.echo(encryptedPayload, "encryptedPayload");
        Intrinsics.echo(iv, "iv");
        this.encryptedPayload = encryptedPayload;
        this.iv = iv;
    }

    public static /* synthetic */ EncryptedResponseBody copy$default(EncryptedResponseBody encryptedResponseBody, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = encryptedResponseBody.encryptedPayload;
        }
        if ((i4 & 2) != 0) {
            str2 = encryptedResponseBody.iv;
        }
        return encryptedResponseBody.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEncryptedPayload() {
        return this.encryptedPayload;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getIv() {
        return this.iv;
    }

    @NotNull
    public final EncryptedResponseBody copy(@NotNull String encryptedPayload, @NotNull String iv) {
        Intrinsics.echo(encryptedPayload, "encryptedPayload");
        Intrinsics.echo(iv, "iv");
        return new EncryptedResponseBody(encryptedPayload, iv);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedResponseBody)) {
            return false;
        }
        EncryptedResponseBody encryptedResponseBody = (EncryptedResponseBody) other;
        return Intrinsics.areEqual(this.encryptedPayload, encryptedResponseBody.encryptedPayload) && Intrinsics.areEqual(this.iv, encryptedResponseBody.iv);
    }

    @NotNull
    public final String getEncryptedPayload() {
        return this.encryptedPayload;
    }

    @NotNull
    public final String getIv() {
        return this.iv;
    }

    public int hashCode() {
        return this.iv.hashCode() + (this.encryptedPayload.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EncryptedResponseBody(encryptedPayload=");
        sb2.append(this.encryptedPayload);
        sb2.append(", iv=");
        return P0.fuchsia(sb2, this.iv, ')');
    }
}
