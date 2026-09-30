package io.getunleash.android.data;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lio/getunleash/android/data/Toggle;", "", "name", "", "enabled", "", "impressionData", "variant", "Lio/getunleash/android/data/Variant;", "<init>", "(Ljava/lang/String;ZZLio/getunleash/android/data/Variant;)V", "getName", "()Ljava/lang/String;", "getEnabled", "()Z", "getImpressionData", "getVariant", "()Lio/getunleash/android/data/Variant;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Toggle {
    private final boolean enabled;
    private final boolean impressionData;

    @NotNull
    private final String name;

    @NotNull
    private final Variant variant;

    public Toggle(@NotNull String name, boolean z2, boolean z10, @NotNull Variant variant) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(variant, "variant");
        this.name = name;
        this.enabled = z2;
        this.impressionData = z10;
        this.variant = variant;
    }

    public static /* synthetic */ Toggle copy$default(Toggle toggle, String str, boolean z2, boolean z10, Variant variant, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = toggle.name;
        }
        if ((i4 & 2) != 0) {
            z2 = toggle.enabled;
        }
        if ((i4 & 4) != 0) {
            z10 = toggle.impressionData;
        }
        if ((i4 & 8) != 0) {
            variant = toggle.variant;
        }
        return toggle.copy(str, z2, z10, variant);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getImpressionData() {
        return this.impressionData;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Variant getVariant() {
        return this.variant;
    }

    @NotNull
    public final Toggle copy(@NotNull String name, boolean enabled, boolean impressionData, @NotNull Variant variant) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(variant, "variant");
        return new Toggle(name, enabled, impressionData, variant);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) other;
        return Intrinsics.areEqual(this.name, toggle.name) && this.enabled == toggle.enabled && this.impressionData == toggle.impressionData && Intrinsics.areEqual(this.variant, toggle.variant);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getImpressionData() {
        return this.impressionData;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Variant getVariant() {
        return this.variant;
    }

    public int hashCode() {
        int i4;
        int hashCode = this.name.hashCode() * 31;
        int i5 = 1237;
        if (this.enabled) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = (hashCode + i4) * 31;
        if (this.impressionData) {
            i5 = 1231;
        }
        return this.variant.hashCode() + ((i10 + i5) * 31);
    }

    @NotNull
    public String toString() {
        return "Toggle(name=" + this.name + ", enabled=" + this.enabled + ", impressionData=" + this.impressionData + ", variant=" + this.variant + ')';
    }

    public /* synthetic */ Toggle(String str, boolean z2, boolean z10, Variant variant, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z2, (i4 & 4) != 0 ? false : z10, (i4 & 8) != 0 ? new Variant("disabled", false, false, null, 14, null) : variant);
    }
}
