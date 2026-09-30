package com.checkout.address.model;

import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0013¨\u0006*"}, d2 = {"Lcom/checkout/address/model/AddressEditScreenStyle;", "", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "topAppBarViewStyle", "", "containerColor", "Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "buttonStyle", "", "statePickerFieldDefaultText", "<init>", "(Lcom/checkout/components/ui/model/TopAppBarViewStyle;JLcom/checkout/components/ui/model/style/base/ButtonStyle;Ljava/lang/String;)V", "component1", "()Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "component2", "()J", "component3", "()Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "component4", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Lcom/checkout/components/ui/model/TopAppBarViewStyle;JLcom/checkout/components/ui/model/style/base/ButtonStyle;Ljava/lang/String;)Lcom/checkout/address/model/AddressEditScreenStyle;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", "getTopAppBarViewStyle", "b", "J", "getContainerColor", "c", "Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "getButtonStyle", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "getStatePickerFieldDefaultText", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AddressEditScreenStyle {
    public static final int $stable = ButtonStyle.$stable | TopAppBarViewStyle.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TopAppBarViewStyle topAppBarViewStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long containerColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ButtonStyle buttonStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String statePickerFieldDefaultText;

    public AddressEditScreenStyle() {
        this(null, 0L, null, null, 15, null);
    }

    public static /* synthetic */ AddressEditScreenStyle copy$default(AddressEditScreenStyle addressEditScreenStyle, TopAppBarViewStyle topAppBarViewStyle, long j5, ButtonStyle buttonStyle, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            topAppBarViewStyle = addressEditScreenStyle.topAppBarViewStyle;
        }
        if ((i4 & 2) != 0) {
            j5 = addressEditScreenStyle.containerColor;
        }
        if ((i4 & 4) != 0) {
            buttonStyle = addressEditScreenStyle.buttonStyle;
        }
        if ((i4 & 8) != 0) {
            str = addressEditScreenStyle.statePickerFieldDefaultText;
        }
        return addressEditScreenStyle.copy(topAppBarViewStyle, j5, buttonStyle, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TopAppBarViewStyle getTopAppBarViewStyle() {
        return this.topAppBarViewStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonStyle getButtonStyle() {
        return this.buttonStyle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getStatePickerFieldDefaultText() {
        return this.statePickerFieldDefaultText;
    }

    @NotNull
    public final AddressEditScreenStyle copy(@NotNull TopAppBarViewStyle topAppBarViewStyle, long containerColor, @NotNull ButtonStyle buttonStyle, @NotNull String statePickerFieldDefaultText) {
        Intrinsics.echo(topAppBarViewStyle, "topAppBarViewStyle");
        Intrinsics.echo(buttonStyle, "buttonStyle");
        Intrinsics.echo(statePickerFieldDefaultText, "statePickerFieldDefaultText");
        return new AddressEditScreenStyle(topAppBarViewStyle, containerColor, buttonStyle, statePickerFieldDefaultText);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditScreenStyle)) {
            return false;
        }
        AddressEditScreenStyle addressEditScreenStyle = (AddressEditScreenStyle) other;
        return Intrinsics.areEqual(this.topAppBarViewStyle, addressEditScreenStyle.topAppBarViewStyle) && this.containerColor == addressEditScreenStyle.containerColor && Intrinsics.areEqual(this.buttonStyle, addressEditScreenStyle.buttonStyle) && Intrinsics.areEqual(this.statePickerFieldDefaultText, addressEditScreenStyle.statePickerFieldDefaultText);
    }

    @NotNull
    public final ButtonStyle getButtonStyle() {
        return this.buttonStyle;
    }

    public final long getContainerColor() {
        return this.containerColor;
    }

    @NotNull
    public final String getStatePickerFieldDefaultText() {
        return this.statePickerFieldDefaultText;
    }

    @NotNull
    public final TopAppBarViewStyle getTopAppBarViewStyle() {
        return this.topAppBarViewStyle;
    }

    public final int hashCode() {
        int hashCode = this.topAppBarViewStyle.hashCode() * 31;
        long j5 = this.containerColor;
        return this.statePickerFieldDefaultText.hashCode() + ((this.buttonStyle.hashCode() + ((((int) (j5 ^ (j5 >>> 32))) + hashCode) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AddressEditScreenStyle(topAppBarViewStyle=" + this.topAppBarViewStyle + ", containerColor=" + this.containerColor + ", buttonStyle=" + this.buttonStyle + ", statePickerFieldDefaultText=" + this.statePickerFieldDefaultText + ")";
    }

    public AddressEditScreenStyle(@NotNull TopAppBarViewStyle topAppBarViewStyle, long j5, @NotNull ButtonStyle buttonStyle, @NotNull String statePickerFieldDefaultText) {
        Intrinsics.echo(topAppBarViewStyle, "topAppBarViewStyle");
        Intrinsics.echo(buttonStyle, "buttonStyle");
        Intrinsics.echo(statePickerFieldDefaultText, "statePickerFieldDefaultText");
        this.topAppBarViewStyle = topAppBarViewStyle;
        this.containerColor = j5;
        this.buttonStyle = buttonStyle;
        this.statePickerFieldDefaultText = statePickerFieldDefaultText;
    }

    public /* synthetic */ AddressEditScreenStyle(TopAppBarViewStyle topAppBarViewStyle, long j5, ButtonStyle buttonStyle, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new TopAppBarViewStyle(null, 0L, 0L, 0L, 0L, 31, null) : topAppBarViewStyle, (i4 & 2) != 0 ? 4294967295L : j5, (i4 & 4) != 0 ? new ButtonStyle(0L, 0L, 0L, 0L, 0L, null, null, null, null, 511, null) : buttonStyle, (i4 & 8) != 0 ? "" : str);
    }
}
