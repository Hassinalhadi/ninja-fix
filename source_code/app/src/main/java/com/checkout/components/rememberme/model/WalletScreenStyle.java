package com.checkout.components.rememberme.model;

import com.checkout.components.rememberme.I1;
import com.checkout.components.ui.model.ButtonItem;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ~\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010-\u001a\u0004\b<\u0010\u0013R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b>\u0010\u0013R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b@\u0010\u0013R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010\u0013R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bC\u00109\u001a\u0004\bD\u0010\u001a¨\u0006E"}, d2 = {"Lcom/checkout/components/rememberme/model/WalletScreenStyle;", "", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "emailItem", "errorLabelViewItem", "logoutItem", "defaultPaymentItem", "Lcom/checkout/components/ui/model/ButtonItem;", "buttonItem", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "overflowImageStyle", "expiredLabelViewItem", "defaultLabelViewItem", "textLabelViewItem", "infoLabelViewItem", "infoImageStyle", "<init>", "(Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/ButtonItem;Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/style/base/ImageStyle;)V", "component1", "()Lcom/checkout/components/ui/model/TextLabelViewItem;", "component2", "component3", "component4", "component5", "()Lcom/checkout/components/ui/model/ButtonItem;", "component6", "()Lcom/checkout/components/ui/model/style/base/ImageStyle;", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "(Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/ButtonItem;Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/style/base/ImageStyle;)Lcom/checkout/components/rememberme/model/WalletScreenStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "getEmailItem", "b", "getErrorLabelViewItem", "c", "getLogoutItem", Constants.INAPP_DATA_TAG, "getDefaultPaymentItem", "e", "Lcom/checkout/components/ui/model/ButtonItem;", "getButtonItem", "f", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "getOverflowImageStyle", "g", "getExpiredLabelViewItem", "h", "getDefaultLabelViewItem", "i", "getTextLabelViewItem", "j", "getInfoLabelViewItem", "k", "getInfoImageStyle", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WalletScreenStyle {
    public static final int $stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem emailItem;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem errorLabelViewItem;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem logoutItem;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem defaultPaymentItem;

    /* renamed from: e, reason: from kotlin metadata */
    private final ButtonItem buttonItem;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ImageStyle overflowImageStyle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem expiredLabelViewItem;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem defaultLabelViewItem;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem textLabelViewItem;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem infoLabelViewItem;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ImageStyle infoImageStyle;

    static {
        int i4 = ImageStyle.$stable;
        int i5 = TextLabelViewItem.$stable;
        $stable = i4 | i4 | i5 | i5 | i5 | i5 | ButtonItem.$stable | i5 | i5 | i5 | i5;
    }

    public WalletScreenStyle(@NotNull TextLabelViewItem emailItem, @NotNull TextLabelViewItem errorLabelViewItem, @NotNull TextLabelViewItem logoutItem, @NotNull TextLabelViewItem defaultPaymentItem, @NotNull ButtonItem buttonItem, @NotNull ImageStyle overflowImageStyle, @NotNull TextLabelViewItem expiredLabelViewItem, @NotNull TextLabelViewItem defaultLabelViewItem, @NotNull TextLabelViewItem textLabelViewItem, @NotNull TextLabelViewItem infoLabelViewItem, @NotNull ImageStyle infoImageStyle) {
        Intrinsics.echo(emailItem, "emailItem");
        Intrinsics.echo(errorLabelViewItem, "errorLabelViewItem");
        Intrinsics.echo(logoutItem, "logoutItem");
        Intrinsics.echo(defaultPaymentItem, "defaultPaymentItem");
        Intrinsics.echo(buttonItem, "buttonItem");
        Intrinsics.echo(overflowImageStyle, "overflowImageStyle");
        Intrinsics.echo(expiredLabelViewItem, "expiredLabelViewItem");
        Intrinsics.echo(defaultLabelViewItem, "defaultLabelViewItem");
        Intrinsics.echo(textLabelViewItem, "textLabelViewItem");
        Intrinsics.echo(infoLabelViewItem, "infoLabelViewItem");
        Intrinsics.echo(infoImageStyle, "infoImageStyle");
        this.emailItem = emailItem;
        this.errorLabelViewItem = errorLabelViewItem;
        this.logoutItem = logoutItem;
        this.defaultPaymentItem = defaultPaymentItem;
        this.buttonItem = buttonItem;
        this.overflowImageStyle = overflowImageStyle;
        this.expiredLabelViewItem = expiredLabelViewItem;
        this.defaultLabelViewItem = defaultLabelViewItem;
        this.textLabelViewItem = textLabelViewItem;
        this.infoLabelViewItem = infoLabelViewItem;
        this.infoImageStyle = infoImageStyle;
    }

    public static /* synthetic */ WalletScreenStyle copy$default(WalletScreenStyle walletScreenStyle, TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, TextLabelViewItem textLabelViewItem4, ButtonItem buttonItem, ImageStyle imageStyle, TextLabelViewItem textLabelViewItem5, TextLabelViewItem textLabelViewItem6, TextLabelViewItem textLabelViewItem7, TextLabelViewItem textLabelViewItem8, ImageStyle imageStyle2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            textLabelViewItem = walletScreenStyle.emailItem;
        }
        if ((i4 & 2) != 0) {
            textLabelViewItem2 = walletScreenStyle.errorLabelViewItem;
        }
        if ((i4 & 4) != 0) {
            textLabelViewItem3 = walletScreenStyle.logoutItem;
        }
        if ((i4 & 8) != 0) {
            textLabelViewItem4 = walletScreenStyle.defaultPaymentItem;
        }
        if ((i4 & 16) != 0) {
            buttonItem = walletScreenStyle.buttonItem;
        }
        if ((i4 & 32) != 0) {
            imageStyle = walletScreenStyle.overflowImageStyle;
        }
        if ((i4 & 64) != 0) {
            textLabelViewItem5 = walletScreenStyle.expiredLabelViewItem;
        }
        if ((i4 & 128) != 0) {
            textLabelViewItem6 = walletScreenStyle.defaultLabelViewItem;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            textLabelViewItem7 = walletScreenStyle.textLabelViewItem;
        }
        if ((i4 & 512) != 0) {
            textLabelViewItem8 = walletScreenStyle.infoLabelViewItem;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            imageStyle2 = walletScreenStyle.infoImageStyle;
        }
        TextLabelViewItem textLabelViewItem9 = textLabelViewItem8;
        ImageStyle imageStyle3 = imageStyle2;
        TextLabelViewItem textLabelViewItem10 = textLabelViewItem6;
        TextLabelViewItem textLabelViewItem11 = textLabelViewItem7;
        ImageStyle imageStyle4 = imageStyle;
        TextLabelViewItem textLabelViewItem12 = textLabelViewItem5;
        ButtonItem buttonItem2 = buttonItem;
        TextLabelViewItem textLabelViewItem13 = textLabelViewItem3;
        return walletScreenStyle.copy(textLabelViewItem, textLabelViewItem2, textLabelViewItem13, textLabelViewItem4, buttonItem2, imageStyle4, textLabelViewItem12, textLabelViewItem10, textLabelViewItem11, textLabelViewItem9, imageStyle3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextLabelViewItem getEmailItem() {
        return this.emailItem;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final TextLabelViewItem getInfoLabelViewItem() {
        return this.infoLabelViewItem;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final ImageStyle getInfoImageStyle() {
        return this.infoImageStyle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelViewItem getErrorLabelViewItem() {
        return this.errorLabelViewItem;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextLabelViewItem getLogoutItem() {
        return this.logoutItem;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextLabelViewItem getDefaultPaymentItem() {
        return this.defaultPaymentItem;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonItem getButtonItem() {
        return this.buttonItem;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ImageStyle getOverflowImageStyle() {
        return this.overflowImageStyle;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TextLabelViewItem getExpiredLabelViewItem() {
        return this.expiredLabelViewItem;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final TextLabelViewItem getDefaultLabelViewItem() {
        return this.defaultLabelViewItem;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final TextLabelViewItem getTextLabelViewItem() {
        return this.textLabelViewItem;
    }

    @NotNull
    public final WalletScreenStyle copy(@NotNull TextLabelViewItem emailItem, @NotNull TextLabelViewItem errorLabelViewItem, @NotNull TextLabelViewItem logoutItem, @NotNull TextLabelViewItem defaultPaymentItem, @NotNull ButtonItem buttonItem, @NotNull ImageStyle overflowImageStyle, @NotNull TextLabelViewItem expiredLabelViewItem, @NotNull TextLabelViewItem defaultLabelViewItem, @NotNull TextLabelViewItem textLabelViewItem, @NotNull TextLabelViewItem infoLabelViewItem, @NotNull ImageStyle infoImageStyle) {
        Intrinsics.echo(emailItem, "emailItem");
        Intrinsics.echo(errorLabelViewItem, "errorLabelViewItem");
        Intrinsics.echo(logoutItem, "logoutItem");
        Intrinsics.echo(defaultPaymentItem, "defaultPaymentItem");
        Intrinsics.echo(buttonItem, "buttonItem");
        Intrinsics.echo(overflowImageStyle, "overflowImageStyle");
        Intrinsics.echo(expiredLabelViewItem, "expiredLabelViewItem");
        Intrinsics.echo(defaultLabelViewItem, "defaultLabelViewItem");
        Intrinsics.echo(textLabelViewItem, "textLabelViewItem");
        Intrinsics.echo(infoLabelViewItem, "infoLabelViewItem");
        Intrinsics.echo(infoImageStyle, "infoImageStyle");
        return new WalletScreenStyle(emailItem, errorLabelViewItem, logoutItem, defaultPaymentItem, buttonItem, overflowImageStyle, expiredLabelViewItem, defaultLabelViewItem, textLabelViewItem, infoLabelViewItem, infoImageStyle);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletScreenStyle)) {
            return false;
        }
        WalletScreenStyle walletScreenStyle = (WalletScreenStyle) other;
        return Intrinsics.areEqual(this.emailItem, walletScreenStyle.emailItem) && Intrinsics.areEqual(this.errorLabelViewItem, walletScreenStyle.errorLabelViewItem) && Intrinsics.areEqual(this.logoutItem, walletScreenStyle.logoutItem) && Intrinsics.areEqual(this.defaultPaymentItem, walletScreenStyle.defaultPaymentItem) && Intrinsics.areEqual(this.buttonItem, walletScreenStyle.buttonItem) && Intrinsics.areEqual(this.overflowImageStyle, walletScreenStyle.overflowImageStyle) && Intrinsics.areEqual(this.expiredLabelViewItem, walletScreenStyle.expiredLabelViewItem) && Intrinsics.areEqual(this.defaultLabelViewItem, walletScreenStyle.defaultLabelViewItem) && Intrinsics.areEqual(this.textLabelViewItem, walletScreenStyle.textLabelViewItem) && Intrinsics.areEqual(this.infoLabelViewItem, walletScreenStyle.infoLabelViewItem) && Intrinsics.areEqual(this.infoImageStyle, walletScreenStyle.infoImageStyle);
    }

    @NotNull
    public final ButtonItem getButtonItem() {
        return this.buttonItem;
    }

    @NotNull
    public final TextLabelViewItem getDefaultLabelViewItem() {
        return this.defaultLabelViewItem;
    }

    @NotNull
    public final TextLabelViewItem getDefaultPaymentItem() {
        return this.defaultPaymentItem;
    }

    @NotNull
    public final TextLabelViewItem getEmailItem() {
        return this.emailItem;
    }

    @NotNull
    public final TextLabelViewItem getErrorLabelViewItem() {
        return this.errorLabelViewItem;
    }

    @NotNull
    public final TextLabelViewItem getExpiredLabelViewItem() {
        return this.expiredLabelViewItem;
    }

    @NotNull
    public final ImageStyle getInfoImageStyle() {
        return this.infoImageStyle;
    }

    @NotNull
    public final TextLabelViewItem getInfoLabelViewItem() {
        return this.infoLabelViewItem;
    }

    @NotNull
    public final TextLabelViewItem getLogoutItem() {
        return this.logoutItem;
    }

    @NotNull
    public final ImageStyle getOverflowImageStyle() {
        return this.overflowImageStyle;
    }

    @NotNull
    public final TextLabelViewItem getTextLabelViewItem() {
        return this.textLabelViewItem;
    }

    public final int hashCode() {
        return this.infoImageStyle.hashCode() + I1.a(this.infoLabelViewItem, I1.a(this.textLabelViewItem, I1.a(this.defaultLabelViewItem, I1.a(this.expiredLabelViewItem, (this.overflowImageStyle.hashCode() + ((this.buttonItem.hashCode() + I1.a(this.defaultPaymentItem, I1.a(this.logoutItem, I1.a(this.errorLabelViewItem, this.emailItem.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        return "WalletScreenStyle(emailItem=" + this.emailItem + ", errorLabelViewItem=" + this.errorLabelViewItem + ", logoutItem=" + this.logoutItem + ", defaultPaymentItem=" + this.defaultPaymentItem + ", buttonItem=" + this.buttonItem + ", overflowImageStyle=" + this.overflowImageStyle + ", expiredLabelViewItem=" + this.expiredLabelViewItem + ", defaultLabelViewItem=" + this.defaultLabelViewItem + ", textLabelViewItem=" + this.textLabelViewItem + ", infoLabelViewItem=" + this.infoLabelViewItem + ", infoImageStyle=" + this.infoImageStyle + ")";
    }
}
