package com.checkout.components.rememberme.model;

import Xd.l;
import av.q;
import com.checkout.components.rememberme.I1;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b&\b\u0081\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010#J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b,\u0010-J¬\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001aJ\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b\b\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bA\u0010@\u001a\u0004\b\t\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bB\u0010@\u001a\u0004\b\n\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010#R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bF\u0010D\u001a\u0004\bG\u0010#R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010#R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010'R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bM\u0010D\u001a\u0004\bN\u0010#R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010*R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bR\u0010@\u001a\u0004\bS\u0010\u001fR\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010-¨\u0006W"}, d2 = {"Lcom/checkout/components/rememberme/model/WalletListItem;", "", "", Constants.KEY_ID, "bin", "Lcom/checkout/components/rememberme/model/SchemeImageStyle;", "cardImageStyles", "", "isDefault", "isSupported", "isExpired", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "expiredLabelViewItem", "defaultLabelViewItem", "textLabelItem", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "infoImageStyle", "infoLabelItem", "Lkotlin/Function0;", "", "onClick", "showCvvInputField", Constants.KEY_CONTENT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/rememberme/model/SchemeImageStyle;ZZZLcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/TextLabelViewItem;Lkotlin/jvm/functions/Function0;ZLXd/l;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/checkout/components/rememberme/model/SchemeImageStyle;", "component4", "()Z", "component5", "component6", "component7", "()Lcom/checkout/components/ui/model/TextLabelViewItem;", "component8", "component9", "component10", "()Lcom/checkout/components/ui/model/style/base/ImageStyle;", "component11", "component12", "()Lkotlin/jvm/functions/Function0;", "component13", "component14", "()LXd/l;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/components/rememberme/model/SchemeImageStyle;ZZZLcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/TextLabelViewItem;Lkotlin/jvm/functions/Function0;ZLXd/l;)Lcom/checkout/components/rememberme/model/WalletListItem;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getBin", "c", "Lcom/checkout/components/rememberme/model/SchemeImageStyle;", "getCardImageStyles", Constants.INAPP_DATA_TAG, "Z", "e", "f", "g", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "getExpiredLabelViewItem", "h", "getDefaultLabelViewItem", "i", "getTextLabelItem", "j", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "getInfoImageStyle", "k", "getInfoLabelItem", "l", "Lkotlin/jvm/functions/Function0;", "getOnClick", "m", "getShowCvvInputField", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "LXd/l;", "getContent", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WalletListItem {
    public static final int $stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String bin;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SchemeImageStyle cardImageStyles;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefault;

    /* renamed from: e, reason: from kotlin metadata */
    private final boolean isSupported;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isExpired;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem expiredLabelViewItem;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem defaultLabelViewItem;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem textLabelItem;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ImageStyle infoImageStyle;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem infoLabelItem;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Function0 onClick;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean showCvvInputField;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final l content;

    static {
        int i4 = TextLabelViewItem.$stable;
        int i5 = ImageStyle.$stable;
        $stable = i4 | i4 | i5 | i4 | i4 | i5 | i5;
    }

    public WalletListItem(@NotNull String id2, @Nullable String str, @NotNull SchemeImageStyle cardImageStyles, boolean z2, boolean z10, boolean z11, @NotNull TextLabelViewItem expiredLabelViewItem, @NotNull TextLabelViewItem defaultLabelViewItem, @NotNull TextLabelViewItem textLabelItem, @NotNull ImageStyle infoImageStyle, @NotNull TextLabelViewItem infoLabelItem, @NotNull Function0<Unit> onClick, boolean z12, @Nullable l lVar) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(cardImageStyles, "cardImageStyles");
        Intrinsics.echo(expiredLabelViewItem, "expiredLabelViewItem");
        Intrinsics.echo(defaultLabelViewItem, "defaultLabelViewItem");
        Intrinsics.echo(textLabelItem, "textLabelItem");
        Intrinsics.echo(infoImageStyle, "infoImageStyle");
        Intrinsics.echo(infoLabelItem, "infoLabelItem");
        Intrinsics.echo(onClick, "onClick");
        this.id = id2;
        this.bin = str;
        this.cardImageStyles = cardImageStyles;
        this.isDefault = z2;
        this.isSupported = z10;
        this.isExpired = z11;
        this.expiredLabelViewItem = expiredLabelViewItem;
        this.defaultLabelViewItem = defaultLabelViewItem;
        this.textLabelItem = textLabelItem;
        this.infoImageStyle = infoImageStyle;
        this.infoLabelItem = infoLabelItem;
        this.onClick = onClick;
        this.showCvvInputField = z12;
        this.content = lVar;
    }

    public static /* synthetic */ WalletListItem copy$default(WalletListItem walletListItem, String str, String str2, SchemeImageStyle schemeImageStyle, boolean z2, boolean z10, boolean z11, TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, ImageStyle imageStyle, TextLabelViewItem textLabelViewItem4, Function0 function0, boolean z12, l lVar, int i4, Object obj) {
        String str3;
        String str4;
        SchemeImageStyle schemeImageStyle2;
        boolean z13;
        boolean z14;
        boolean z15;
        TextLabelViewItem textLabelViewItem5;
        TextLabelViewItem textLabelViewItem6;
        TextLabelViewItem textLabelViewItem7;
        ImageStyle imageStyle2;
        TextLabelViewItem textLabelViewItem8;
        Function0 function02;
        boolean z16;
        l lVar2;
        if ((i4 & 1) != 0) {
            str3 = walletListItem.id;
        } else {
            str3 = str;
        }
        if ((i4 & 2) != 0) {
            str4 = walletListItem.bin;
        } else {
            str4 = str2;
        }
        if ((i4 & 4) != 0) {
            schemeImageStyle2 = walletListItem.cardImageStyles;
        } else {
            schemeImageStyle2 = schemeImageStyle;
        }
        if ((i4 & 8) != 0) {
            z13 = walletListItem.isDefault;
        } else {
            z13 = z2;
        }
        if ((i4 & 16) != 0) {
            z14 = walletListItem.isSupported;
        } else {
            z14 = z10;
        }
        if ((i4 & 32) != 0) {
            z15 = walletListItem.isExpired;
        } else {
            z15 = z11;
        }
        if ((i4 & 64) != 0) {
            textLabelViewItem5 = walletListItem.expiredLabelViewItem;
        } else {
            textLabelViewItem5 = textLabelViewItem;
        }
        if ((i4 & 128) != 0) {
            textLabelViewItem6 = walletListItem.defaultLabelViewItem;
        } else {
            textLabelViewItem6 = textLabelViewItem2;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            textLabelViewItem7 = walletListItem.textLabelItem;
        } else {
            textLabelViewItem7 = textLabelViewItem3;
        }
        if ((i4 & 512) != 0) {
            imageStyle2 = walletListItem.infoImageStyle;
        } else {
            imageStyle2 = imageStyle;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            textLabelViewItem8 = walletListItem.infoLabelItem;
        } else {
            textLabelViewItem8 = textLabelViewItem4;
        }
        if ((i4 & 2048) != 0) {
            function02 = walletListItem.onClick;
        } else {
            function02 = function0;
        }
        if ((i4 & 4096) != 0) {
            z16 = walletListItem.showCvvInputField;
        } else {
            z16 = z12;
        }
        if ((i4 & 8192) != 0) {
            lVar2 = walletListItem.content;
        } else {
            lVar2 = lVar;
        }
        return walletListItem.copy(str3, str4, schemeImageStyle2, z13, z14, z15, textLabelViewItem5, textLabelViewItem6, textLabelViewItem7, imageStyle2, textLabelViewItem8, function02, z16, lVar2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final ImageStyle getInfoImageStyle() {
        return this.infoImageStyle;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final TextLabelViewItem getInfoLabelItem() {
        return this.infoLabelItem;
    }

    @NotNull
    public final Function0<Unit> component12() {
        return this.onClick;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowCvvInputField() {
        return this.showCvvInputField;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final l getContent() {
        return this.content;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getBin() {
        return this.bin;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SchemeImageStyle getCardImageStyles() {
        return this.cardImageStyles;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSupported() {
        return this.isSupported;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
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
    public final TextLabelViewItem getTextLabelItem() {
        return this.textLabelItem;
    }

    @NotNull
    public final WalletListItem copy(@NotNull String id2, @Nullable String bin, @NotNull SchemeImageStyle cardImageStyles, boolean isDefault, boolean isSupported, boolean isExpired, @NotNull TextLabelViewItem expiredLabelViewItem, @NotNull TextLabelViewItem defaultLabelViewItem, @NotNull TextLabelViewItem textLabelItem, @NotNull ImageStyle infoImageStyle, @NotNull TextLabelViewItem infoLabelItem, @NotNull Function0<Unit> onClick, boolean showCvvInputField, @Nullable l content) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(cardImageStyles, "cardImageStyles");
        Intrinsics.echo(expiredLabelViewItem, "expiredLabelViewItem");
        Intrinsics.echo(defaultLabelViewItem, "defaultLabelViewItem");
        Intrinsics.echo(textLabelItem, "textLabelItem");
        Intrinsics.echo(infoImageStyle, "infoImageStyle");
        Intrinsics.echo(infoLabelItem, "infoLabelItem");
        Intrinsics.echo(onClick, "onClick");
        return new WalletListItem(id2, bin, cardImageStyles, isDefault, isSupported, isExpired, expiredLabelViewItem, defaultLabelViewItem, textLabelItem, infoImageStyle, infoLabelItem, onClick, showCvvInputField, content);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletListItem)) {
            return false;
        }
        WalletListItem walletListItem = (WalletListItem) other;
        return Intrinsics.areEqual(this.id, walletListItem.id) && Intrinsics.areEqual(this.bin, walletListItem.bin) && Intrinsics.areEqual(this.cardImageStyles, walletListItem.cardImageStyles) && this.isDefault == walletListItem.isDefault && this.isSupported == walletListItem.isSupported && this.isExpired == walletListItem.isExpired && Intrinsics.areEqual(this.expiredLabelViewItem, walletListItem.expiredLabelViewItem) && Intrinsics.areEqual(this.defaultLabelViewItem, walletListItem.defaultLabelViewItem) && Intrinsics.areEqual(this.textLabelItem, walletListItem.textLabelItem) && Intrinsics.areEqual(this.infoImageStyle, walletListItem.infoImageStyle) && Intrinsics.areEqual(this.infoLabelItem, walletListItem.infoLabelItem) && Intrinsics.areEqual(this.onClick, walletListItem.onClick) && this.showCvvInputField == walletListItem.showCvvInputField && Intrinsics.areEqual(this.content, walletListItem.content);
    }

    @Nullable
    public final String getBin() {
        return this.bin;
    }

    @NotNull
    public final SchemeImageStyle getCardImageStyles() {
        return this.cardImageStyles;
    }

    @Nullable
    public final l getContent() {
        return this.content;
    }

    @NotNull
    public final TextLabelViewItem getDefaultLabelViewItem() {
        return this.defaultLabelViewItem;
    }

    @NotNull
    public final TextLabelViewItem getExpiredLabelViewItem() {
        return this.expiredLabelViewItem;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final ImageStyle getInfoImageStyle() {
        return this.infoImageStyle;
    }

    @NotNull
    public final TextLabelViewItem getInfoLabelItem() {
        return this.infoLabelItem;
    }

    @NotNull
    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final boolean getShowCvvInputField() {
        return this.showCvvInputField;
    }

    @NotNull
    public final TextLabelViewItem getTextLabelItem() {
        return this.textLabelItem;
    }

    public final int hashCode() {
        int hashCode;
        int i4;
        int i5;
        int i10;
        int hashCode2 = this.id.hashCode() * 31;
        String str = this.bin;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (this.cardImageStyles.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        int i12 = 1237;
        if (this.isDefault) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i13 = (i4 + hashCode3) * 31;
        if (this.isSupported) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i14 = (i5 + i13) * 31;
        if (this.isExpired) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode4 = (this.onClick.hashCode() + I1.a(this.infoLabelItem, (this.infoImageStyle.hashCode() + I1.a(this.textLabelItem, I1.a(this.defaultLabelViewItem, I1.a(this.expiredLabelViewItem, (i10 + i14) * 31, 31), 31), 31)) * 31, 31)) * 31;
        if (this.showCvvInputField) {
            i12 = 1231;
        }
        int i15 = (i12 + hashCode4) * 31;
        l lVar = this.content;
        if (lVar != null) {
            i11 = lVar.hashCode();
        }
        return i15 + i11;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public final boolean isSupported() {
        return this.isSupported;
    }

    @NotNull
    public final String toString() {
        String str = this.id;
        String str2 = this.bin;
        SchemeImageStyle schemeImageStyle = this.cardImageStyles;
        boolean z2 = this.isDefault;
        boolean z10 = this.isSupported;
        boolean z11 = this.isExpired;
        TextLabelViewItem textLabelViewItem = this.expiredLabelViewItem;
        TextLabelViewItem textLabelViewItem2 = this.defaultLabelViewItem;
        TextLabelViewItem textLabelViewItem3 = this.textLabelItem;
        ImageStyle imageStyle = this.infoImageStyle;
        TextLabelViewItem textLabelViewItem4 = this.infoLabelItem;
        Function0 function0 = this.onClick;
        boolean z12 = this.showCvvInputField;
        l lVar = this.content;
        StringBuilder india = q.india("WalletListItem(id=", str, ", bin=", str2, ", cardImageStyles=");
        india.append(schemeImageStyle);
        india.append(", isDefault=");
        india.append(z2);
        india.append(", isSupported=");
        india.append(z10);
        india.append(", isExpired=");
        india.append(z11);
        india.append(", expiredLabelViewItem=");
        india.append(textLabelViewItem);
        india.append(", defaultLabelViewItem=");
        india.append(textLabelViewItem2);
        india.append(", textLabelItem=");
        india.append(textLabelViewItem3);
        india.append(", infoImageStyle=");
        india.append(imageStyle);
        india.append(", infoLabelItem=");
        india.append(textLabelViewItem4);
        india.append(", onClick=");
        india.append(function0);
        india.append(", showCvvInputField=");
        india.append(z12);
        india.append(", content=");
        india.append(lVar);
        india.append(")");
        return india.toString();
    }

    public /* synthetic */ WalletListItem(String str, String str2, SchemeImageStyle schemeImageStyle, boolean z2, boolean z10, boolean z11, TextLabelViewItem textLabelViewItem, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, ImageStyle imageStyle, TextLabelViewItem textLabelViewItem4, Function0 function0, boolean z12, l lVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2, schemeImageStyle, z2, z10, z11, textLabelViewItem, textLabelViewItem2, textLabelViewItem3, imageStyle, textLabelViewItem4, function0, z12, (i4 & 8192) != 0 ? null : lVar);
    }
}
