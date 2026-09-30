package com.checkout.components.rememberme.model;

import androidx.appcompat.widget.P0;
import com.checkout.components.rememberme.I1;
import com.checkout.components.ui.model.ButtonItem;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\"\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0017J\u0084\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0017J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\"R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010$R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bH\u0010@\u001a\u0004\bI\u0010 R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\bK\u0010\u0017¨\u0006L"}, d2 = {"Lcom/checkout/components/rememberme/model/WalletScreenViewState;", "", "", "selectedMethodId", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "emailItem", "errorLabelViewItem", "logoutItem", "Lcom/checkout/components/ui/model/ButtonItem;", "buttonItem", "defaultPaymentItem", "", "defaultPaymentChecked", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "overflowImageStyle", "", "Lcom/checkout/components/rememberme/model/WalletListItem;", "walletListItems", "showPayButton", "cvvInput", "<init>", "(Ljava/lang/String;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/ButtonItem;Lcom/checkout/components/ui/model/TextLabelViewItem;ZLcom/checkout/components/ui/model/style/base/ImageStyle;Ljava/util/List;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/ui/model/TextLabelViewItem;", "component3", "component4", "component5", "()Lcom/checkout/components/ui/model/ButtonItem;", "component6", "component7", "()Z", "component8", "()Lcom/checkout/components/ui/model/style/base/ImageStyle;", "component9", "()Ljava/util/List;", "component10", "component11", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/ButtonItem;Lcom/checkout/components/ui/model/TextLabelViewItem;ZLcom/checkout/components/ui/model/style/base/ImageStyle;Ljava/util/List;ZLjava/lang/String;)Lcom/checkout/components/rememberme/model/WalletScreenViewState;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSelectedMethodId", "b", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "getEmailItem", "c", "getErrorLabelViewItem", Constants.INAPP_DATA_TAG, "getLogoutItem", "e", "Lcom/checkout/components/ui/model/ButtonItem;", "getButtonItem", "f", "getDefaultPaymentItem", "g", "Z", "getDefaultPaymentChecked", "h", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "getOverflowImageStyle", "i", "Ljava/util/List;", "getWalletListItems", "j", "getShowPayButton", "k", "getCvvInput", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WalletScreenViewState {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String selectedMethodId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem emailItem;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem errorLabelViewItem;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem logoutItem;

    /* renamed from: e, reason: from kotlin metadata */
    private final ButtonItem buttonItem;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem defaultPaymentItem;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean defaultPaymentChecked;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ImageStyle overflowImageStyle;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List walletListItems;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean showPayButton;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String cvvInput;

    public WalletScreenViewState(@NotNull String selectedMethodId, @NotNull TextLabelViewItem emailItem, @NotNull TextLabelViewItem errorLabelViewItem, @NotNull TextLabelViewItem logoutItem, @NotNull ButtonItem buttonItem, @NotNull TextLabelViewItem defaultPaymentItem, boolean z2, @NotNull ImageStyle overflowImageStyle, @NotNull List<WalletListItem> walletListItems, boolean z10, @NotNull String cvvInput) {
        Intrinsics.echo(selectedMethodId, "selectedMethodId");
        Intrinsics.echo(emailItem, "emailItem");
        Intrinsics.echo(errorLabelViewItem, "errorLabelViewItem");
        Intrinsics.echo(logoutItem, "logoutItem");
        Intrinsics.echo(buttonItem, "buttonItem");
        Intrinsics.echo(defaultPaymentItem, "defaultPaymentItem");
        Intrinsics.echo(overflowImageStyle, "overflowImageStyle");
        Intrinsics.echo(walletListItems, "walletListItems");
        Intrinsics.echo(cvvInput, "cvvInput");
        this.selectedMethodId = selectedMethodId;
        this.emailItem = emailItem;
        this.errorLabelViewItem = errorLabelViewItem;
        this.logoutItem = logoutItem;
        this.buttonItem = buttonItem;
        this.defaultPaymentItem = defaultPaymentItem;
        this.defaultPaymentChecked = z2;
        this.overflowImageStyle = overflowImageStyle;
        this.walletListItems = walletListItems;
        this.showPayButton = z10;
        this.cvvInput = cvvInput;
    }

    public static /* synthetic */ WalletScreenViewState copy$default(WalletScreenViewState walletScreenViewState, String str, TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, ButtonItem buttonItem, TextLabelViewItem textLabelViewItem4, boolean z2, ImageStyle imageStyle, List list, boolean z10, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = walletScreenViewState.selectedMethodId;
        }
        if ((i4 & 2) != 0) {
            textLabelViewItem = walletScreenViewState.emailItem;
        }
        if ((i4 & 4) != 0) {
            textLabelViewItem2 = walletScreenViewState.errorLabelViewItem;
        }
        if ((i4 & 8) != 0) {
            textLabelViewItem3 = walletScreenViewState.logoutItem;
        }
        if ((i4 & 16) != 0) {
            buttonItem = walletScreenViewState.buttonItem;
        }
        if ((i4 & 32) != 0) {
            textLabelViewItem4 = walletScreenViewState.defaultPaymentItem;
        }
        if ((i4 & 64) != 0) {
            z2 = walletScreenViewState.defaultPaymentChecked;
        }
        if ((i4 & 128) != 0) {
            imageStyle = walletScreenViewState.overflowImageStyle;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            list = walletScreenViewState.walletListItems;
        }
        if ((i4 & 512) != 0) {
            z10 = walletScreenViewState.showPayButton;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            str2 = walletScreenViewState.cvvInput;
        }
        boolean z11 = z10;
        String str3 = str2;
        ImageStyle imageStyle2 = imageStyle;
        List list2 = list;
        TextLabelViewItem textLabelViewItem5 = textLabelViewItem4;
        boolean z12 = z2;
        ButtonItem buttonItem2 = buttonItem;
        TextLabelViewItem textLabelViewItem6 = textLabelViewItem2;
        return walletScreenViewState.copy(str, textLabelViewItem, textLabelViewItem6, textLabelViewItem3, buttonItem2, textLabelViewItem5, z12, imageStyle2, list2, z11, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSelectedMethodId() {
        return this.selectedMethodId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowPayButton() {
        return this.showPayButton;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getCvvInput() {
        return this.cvvInput;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelViewItem getEmailItem() {
        return this.emailItem;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextLabelViewItem getErrorLabelViewItem() {
        return this.errorLabelViewItem;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextLabelViewItem getLogoutItem() {
        return this.logoutItem;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonItem getButtonItem() {
        return this.buttonItem;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextLabelViewItem getDefaultPaymentItem() {
        return this.defaultPaymentItem;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDefaultPaymentChecked() {
        return this.defaultPaymentChecked;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final ImageStyle getOverflowImageStyle() {
        return this.overflowImageStyle;
    }

    @NotNull
    public final List<WalletListItem> component9() {
        return this.walletListItems;
    }

    @NotNull
    public final WalletScreenViewState copy(@NotNull String selectedMethodId, @NotNull TextLabelViewItem emailItem, @NotNull TextLabelViewItem errorLabelViewItem, @NotNull TextLabelViewItem logoutItem, @NotNull ButtonItem buttonItem, @NotNull TextLabelViewItem defaultPaymentItem, boolean defaultPaymentChecked, @NotNull ImageStyle overflowImageStyle, @NotNull List<WalletListItem> walletListItems, boolean showPayButton, @NotNull String cvvInput) {
        Intrinsics.echo(selectedMethodId, "selectedMethodId");
        Intrinsics.echo(emailItem, "emailItem");
        Intrinsics.echo(errorLabelViewItem, "errorLabelViewItem");
        Intrinsics.echo(logoutItem, "logoutItem");
        Intrinsics.echo(buttonItem, "buttonItem");
        Intrinsics.echo(defaultPaymentItem, "defaultPaymentItem");
        Intrinsics.echo(overflowImageStyle, "overflowImageStyle");
        Intrinsics.echo(walletListItems, "walletListItems");
        Intrinsics.echo(cvvInput, "cvvInput");
        return new WalletScreenViewState(selectedMethodId, emailItem, errorLabelViewItem, logoutItem, buttonItem, defaultPaymentItem, defaultPaymentChecked, overflowImageStyle, walletListItems, showPayButton, cvvInput);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletScreenViewState)) {
            return false;
        }
        WalletScreenViewState walletScreenViewState = (WalletScreenViewState) other;
        return Intrinsics.areEqual(this.selectedMethodId, walletScreenViewState.selectedMethodId) && Intrinsics.areEqual(this.emailItem, walletScreenViewState.emailItem) && Intrinsics.areEqual(this.errorLabelViewItem, walletScreenViewState.errorLabelViewItem) && Intrinsics.areEqual(this.logoutItem, walletScreenViewState.logoutItem) && Intrinsics.areEqual(this.buttonItem, walletScreenViewState.buttonItem) && Intrinsics.areEqual(this.defaultPaymentItem, walletScreenViewState.defaultPaymentItem) && this.defaultPaymentChecked == walletScreenViewState.defaultPaymentChecked && Intrinsics.areEqual(this.overflowImageStyle, walletScreenViewState.overflowImageStyle) && Intrinsics.areEqual(this.walletListItems, walletScreenViewState.walletListItems) && this.showPayButton == walletScreenViewState.showPayButton && Intrinsics.areEqual(this.cvvInput, walletScreenViewState.cvvInput);
    }

    @NotNull
    public final ButtonItem getButtonItem() {
        return this.buttonItem;
    }

    @NotNull
    public final String getCvvInput() {
        return this.cvvInput;
    }

    public final boolean getDefaultPaymentChecked() {
        return this.defaultPaymentChecked;
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
    public final TextLabelViewItem getLogoutItem() {
        return this.logoutItem;
    }

    @NotNull
    public final ImageStyle getOverflowImageStyle() {
        return this.overflowImageStyle;
    }

    @NotNull
    public final String getSelectedMethodId() {
        return this.selectedMethodId;
    }

    public final boolean getShowPayButton() {
        return this.showPayButton;
    }

    @NotNull
    public final List<WalletListItem> getWalletListItems() {
        return this.walletListItems;
    }

    public final int hashCode() {
        int i4;
        int a6 = I1.a(this.defaultPaymentItem, (this.buttonItem.hashCode() + I1.a(this.logoutItem, I1.a(this.errorLabelViewItem, I1.a(this.emailItem, this.selectedMethodId.hashCode() * 31, 31), 31), 31)) * 31, 31);
        int i5 = 1237;
        if (this.defaultPaymentChecked) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int golf = j.golf((this.overflowImageStyle.hashCode() + ((i4 + a6) * 31)) * 31, 31, this.walletListItems);
        if (this.showPayButton) {
            i5 = 1231;
        }
        return this.cvvInput.hashCode() + ((i5 + golf) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.selectedMethodId;
        TextLabelViewItem textLabelViewItem = this.emailItem;
        TextLabelViewItem textLabelViewItem2 = this.errorLabelViewItem;
        TextLabelViewItem textLabelViewItem3 = this.logoutItem;
        ButtonItem buttonItem = this.buttonItem;
        TextLabelViewItem textLabelViewItem4 = this.defaultPaymentItem;
        boolean z2 = this.defaultPaymentChecked;
        ImageStyle imageStyle = this.overflowImageStyle;
        List list = this.walletListItems;
        boolean z10 = this.showPayButton;
        String str2 = this.cvvInput;
        StringBuilder sb2 = new StringBuilder("WalletScreenViewState(selectedMethodId=");
        sb2.append(str);
        sb2.append(", emailItem=");
        sb2.append(textLabelViewItem);
        sb2.append(", errorLabelViewItem=");
        sb2.append(textLabelViewItem2);
        sb2.append(", logoutItem=");
        sb2.append(textLabelViewItem3);
        sb2.append(", buttonItem=");
        sb2.append(buttonItem);
        sb2.append(", defaultPaymentItem=");
        sb2.append(textLabelViewItem4);
        sb2.append(", defaultPaymentChecked=");
        sb2.append(z2);
        sb2.append(", overflowImageStyle=");
        sb2.append(imageStyle);
        sb2.append(", walletListItems=");
        sb2.append(list);
        sb2.append(", showPayButton=");
        sb2.append(z10);
        sb2.append(", cvvInput=");
        return P0.gold(sb2, str2, ")");
    }
}
