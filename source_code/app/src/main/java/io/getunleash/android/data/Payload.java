package io.getunleash.android.data;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\fHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0018"}, d2 = {"Lio/getunleash/android/data/Payload;", "", Constants.KEY_TYPE, "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getValue", "getValueAsString", "getValueAsInt", "", "getValueAsDouble", "", "getValueAsBoolean", "", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Payload {

    @NotNull
    private final String type;

    @NotNull
    private final String value;

    public Payload(@NotNull String type, @NotNull String value) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(value, "value");
        this.type = type;
        this.value = value;
    }

    public static /* synthetic */ Payload copy$default(Payload payload, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = payload.type;
        }
        if ((i4 & 2) != 0) {
            str2 = payload.value;
        }
        return payload.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final Payload copy(@NotNull String type, @NotNull String value) {
        Intrinsics.echo(type, "type");
        Intrinsics.echo(value, "value");
        return new Payload(type, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) other;
        return Intrinsics.areEqual(this.type, payload.type) && Intrinsics.areEqual(this.value, payload.value);
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final boolean getValueAsBoolean() {
        return Boolean.parseBoolean(this.value);
    }

    public final double getValueAsDouble() {
        return Double.parseDouble(this.value);
    }

    public final int getValueAsInt() {
        return Integer.parseInt(this.value);
    }

    @NotNull
    public final String getValueAsString() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Payload(type=");
        sb2.append(this.type);
        sb2.append(", value=");
        return P0.fuchsia(sb2, this.value, ')');
    }
}
