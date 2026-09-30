package com.checkout.components.rememberme.savecard;

import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.rememberme.I1;
import com.checkout.components.ui.model.InputComponentViewItem;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0016J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0092\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0003\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\bB\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u00104\u001a\u0004\bD\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u0010\u0018R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\bH\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bJ\u0010\u0016R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010%¨\u0006N"}, d2 = {"Lcom/checkout/components/rememberme/savecard/SaveCardViewState;", "", "", "isChecked", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "saveCardLabelItem", "Lcom/checkout/components/ui/model/InputComponentViewItem;", "emailViewItem", "phoneNumberViewItem", "countryCodeViewItem", "prefilledEmailLabelViewItem", "prefilledEmailTextViewItem", "prefilledPhoneLabelViewItem", "prefilledPhoneTextViewItem", "editLabelViewItem", "showPrefilledEmailView", "showPrefilledPhoneView", "Lcom/checkout/components/interfaces/model/contact/Country;", "country", "<init>", "(ZLcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/InputComponentViewItem;Lcom/checkout/components/ui/model/InputComponentViewItem;Lcom/checkout/components/ui/model/InputComponentViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;ZZLcom/checkout/components/interfaces/model/contact/Country;)V", "component1", "()Z", "component2", "()Lcom/checkout/components/ui/model/TextLabelViewItem;", "component3", "()Lcom/checkout/components/ui/model/InputComponentViewItem;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Lcom/checkout/components/interfaces/model/contact/Country;", Constants.COPY_TYPE, "(ZLcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/InputComponentViewItem;Lcom/checkout/components/ui/model/InputComponentViewItem;Lcom/checkout/components/ui/model/InputComponentViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;Lcom/checkout/components/ui/model/TextLabelViewItem;ZZLcom/checkout/components/interfaces/model/contact/Country;)Lcom/checkout/components/rememberme/savecard/SaveCardViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "getSaveCardLabelItem", "c", "Lcom/checkout/components/ui/model/InputComponentViewItem;", "getEmailViewItem", Constants.INAPP_DATA_TAG, "getPhoneNumberViewItem", "e", "getCountryCodeViewItem", "f", "getPrefilledEmailLabelViewItem", "g", "getPrefilledEmailTextViewItem", "h", "getPrefilledPhoneLabelViewItem", "i", "getPrefilledPhoneTextViewItem", "j", "getEditLabelViewItem", "k", "getShowPrefilledEmailView", "l", "getShowPrefilledPhoneView", "m", "Lcom/checkout/components/interfaces/model/contact/Country;", "getCountry", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaveCardViewState {
    public static final int $stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isChecked;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem saveCardLabelItem;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InputComponentViewItem emailViewItem;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InputComponentViewItem phoneNumberViewItem;

    /* renamed from: e, reason: from kotlin metadata */
    private final InputComponentViewItem countryCodeViewItem;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem prefilledEmailLabelViewItem;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem prefilledEmailTextViewItem;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem prefilledPhoneLabelViewItem;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem prefilledPhoneTextViewItem;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final TextLabelViewItem editLabelViewItem;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean showPrefilledEmailView;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean showPrefilledPhoneView;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Country country;

    static {
        int i4 = TextLabelViewItem.$stable;
        int i5 = InputComponentViewItem.$stable;
        $stable = i4 | i5 | i4 | i5 | i5;
    }

    public SaveCardViewState(boolean z2, @NotNull TextLabelViewItem saveCardLabelItem, @NotNull InputComponentViewItem emailViewItem, @NotNull InputComponentViewItem phoneNumberViewItem, @NotNull InputComponentViewItem countryCodeViewItem, @NotNull TextLabelViewItem prefilledEmailLabelViewItem, @NotNull TextLabelViewItem prefilledEmailTextViewItem, @NotNull TextLabelViewItem prefilledPhoneLabelViewItem, @NotNull TextLabelViewItem prefilledPhoneTextViewItem, @NotNull TextLabelViewItem editLabelViewItem, boolean z10, boolean z11, @NotNull Country country) {
        Intrinsics.echo(saveCardLabelItem, "saveCardLabelItem");
        Intrinsics.echo(emailViewItem, "emailViewItem");
        Intrinsics.echo(phoneNumberViewItem, "phoneNumberViewItem");
        Intrinsics.echo(countryCodeViewItem, "countryCodeViewItem");
        Intrinsics.echo(prefilledEmailLabelViewItem, "prefilledEmailLabelViewItem");
        Intrinsics.echo(prefilledEmailTextViewItem, "prefilledEmailTextViewItem");
        Intrinsics.echo(prefilledPhoneLabelViewItem, "prefilledPhoneLabelViewItem");
        Intrinsics.echo(prefilledPhoneTextViewItem, "prefilledPhoneTextViewItem");
        Intrinsics.echo(editLabelViewItem, "editLabelViewItem");
        Intrinsics.echo(country, "country");
        this.isChecked = z2;
        this.saveCardLabelItem = saveCardLabelItem;
        this.emailViewItem = emailViewItem;
        this.phoneNumberViewItem = phoneNumberViewItem;
        this.countryCodeViewItem = countryCodeViewItem;
        this.prefilledEmailLabelViewItem = prefilledEmailLabelViewItem;
        this.prefilledEmailTextViewItem = prefilledEmailTextViewItem;
        this.prefilledPhoneLabelViewItem = prefilledPhoneLabelViewItem;
        this.prefilledPhoneTextViewItem = prefilledPhoneTextViewItem;
        this.editLabelViewItem = editLabelViewItem;
        this.showPrefilledEmailView = z10;
        this.showPrefilledPhoneView = z11;
        this.country = country;
    }

    public static /* synthetic */ SaveCardViewState copy$default(SaveCardViewState saveCardViewState, boolean z2, TextLabelViewItem textLabelViewItem, InputComponentViewItem inputComponentViewItem, InputComponentViewItem inputComponentViewItem2, InputComponentViewItem inputComponentViewItem3, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, TextLabelViewItem textLabelViewItem4, TextLabelViewItem textLabelViewItem5, TextLabelViewItem textLabelViewItem6, boolean z10, boolean z11, Country country, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z2 = saveCardViewState.isChecked;
        }
        return saveCardViewState.copy(z2, (i4 & 2) != 0 ? saveCardViewState.saveCardLabelItem : textLabelViewItem, (i4 & 4) != 0 ? saveCardViewState.emailViewItem : inputComponentViewItem, (i4 & 8) != 0 ? saveCardViewState.phoneNumberViewItem : inputComponentViewItem2, (i4 & 16) != 0 ? saveCardViewState.countryCodeViewItem : inputComponentViewItem3, (i4 & 32) != 0 ? saveCardViewState.prefilledEmailLabelViewItem : textLabelViewItem2, (i4 & 64) != 0 ? saveCardViewState.prefilledEmailTextViewItem : textLabelViewItem3, (i4 & 128) != 0 ? saveCardViewState.prefilledPhoneLabelViewItem : textLabelViewItem4, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? saveCardViewState.prefilledPhoneTextViewItem : textLabelViewItem5, (i4 & 512) != 0 ? saveCardViewState.editLabelViewItem : textLabelViewItem6, (i4 & Barcode.FORMAT_UPC_E) != 0 ? saveCardViewState.showPrefilledEmailView : z10, (i4 & 2048) != 0 ? saveCardViewState.showPrefilledPhoneView : z11, (i4 & 4096) != 0 ? saveCardViewState.country : country);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final TextLabelViewItem getEditLabelViewItem() {
        return this.editLabelViewItem;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShowPrefilledEmailView() {
        return this.showPrefilledEmailView;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getShowPrefilledPhoneView() {
        return this.showPrefilledPhoneView;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextLabelViewItem getSaveCardLabelItem() {
        return this.saveCardLabelItem;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InputComponentViewItem getEmailViewItem() {
        return this.emailViewItem;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final InputComponentViewItem getPhoneNumberViewItem() {
        return this.phoneNumberViewItem;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final InputComponentViewItem getCountryCodeViewItem() {
        return this.countryCodeViewItem;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextLabelViewItem getPrefilledEmailLabelViewItem() {
        return this.prefilledEmailLabelViewItem;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TextLabelViewItem getPrefilledEmailTextViewItem() {
        return this.prefilledEmailTextViewItem;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final TextLabelViewItem getPrefilledPhoneLabelViewItem() {
        return this.prefilledPhoneLabelViewItem;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final TextLabelViewItem getPrefilledPhoneTextViewItem() {
        return this.prefilledPhoneTextViewItem;
    }

    @NotNull
    public final SaveCardViewState copy(boolean isChecked, @NotNull TextLabelViewItem saveCardLabelItem, @NotNull InputComponentViewItem emailViewItem, @NotNull InputComponentViewItem phoneNumberViewItem, @NotNull InputComponentViewItem countryCodeViewItem, @NotNull TextLabelViewItem prefilledEmailLabelViewItem, @NotNull TextLabelViewItem prefilledEmailTextViewItem, @NotNull TextLabelViewItem prefilledPhoneLabelViewItem, @NotNull TextLabelViewItem prefilledPhoneTextViewItem, @NotNull TextLabelViewItem editLabelViewItem, boolean showPrefilledEmailView, boolean showPrefilledPhoneView, @NotNull Country country) {
        Intrinsics.echo(saveCardLabelItem, "saveCardLabelItem");
        Intrinsics.echo(emailViewItem, "emailViewItem");
        Intrinsics.echo(phoneNumberViewItem, "phoneNumberViewItem");
        Intrinsics.echo(countryCodeViewItem, "countryCodeViewItem");
        Intrinsics.echo(prefilledEmailLabelViewItem, "prefilledEmailLabelViewItem");
        Intrinsics.echo(prefilledEmailTextViewItem, "prefilledEmailTextViewItem");
        Intrinsics.echo(prefilledPhoneLabelViewItem, "prefilledPhoneLabelViewItem");
        Intrinsics.echo(prefilledPhoneTextViewItem, "prefilledPhoneTextViewItem");
        Intrinsics.echo(editLabelViewItem, "editLabelViewItem");
        Intrinsics.echo(country, "country");
        return new SaveCardViewState(isChecked, saveCardLabelItem, emailViewItem, phoneNumberViewItem, countryCodeViewItem, prefilledEmailLabelViewItem, prefilledEmailTextViewItem, prefilledPhoneLabelViewItem, prefilledPhoneTextViewItem, editLabelViewItem, showPrefilledEmailView, showPrefilledPhoneView, country);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveCardViewState)) {
            return false;
        }
        SaveCardViewState saveCardViewState = (SaveCardViewState) other;
        return this.isChecked == saveCardViewState.isChecked && Intrinsics.areEqual(this.saveCardLabelItem, saveCardViewState.saveCardLabelItem) && Intrinsics.areEqual(this.emailViewItem, saveCardViewState.emailViewItem) && Intrinsics.areEqual(this.phoneNumberViewItem, saveCardViewState.phoneNumberViewItem) && Intrinsics.areEqual(this.countryCodeViewItem, saveCardViewState.countryCodeViewItem) && Intrinsics.areEqual(this.prefilledEmailLabelViewItem, saveCardViewState.prefilledEmailLabelViewItem) && Intrinsics.areEqual(this.prefilledEmailTextViewItem, saveCardViewState.prefilledEmailTextViewItem) && Intrinsics.areEqual(this.prefilledPhoneLabelViewItem, saveCardViewState.prefilledPhoneLabelViewItem) && Intrinsics.areEqual(this.prefilledPhoneTextViewItem, saveCardViewState.prefilledPhoneTextViewItem) && Intrinsics.areEqual(this.editLabelViewItem, saveCardViewState.editLabelViewItem) && this.showPrefilledEmailView == saveCardViewState.showPrefilledEmailView && this.showPrefilledPhoneView == saveCardViewState.showPrefilledPhoneView && this.country == saveCardViewState.country;
    }

    @NotNull
    public final Country getCountry() {
        return this.country;
    }

    @NotNull
    public final InputComponentViewItem getCountryCodeViewItem() {
        return this.countryCodeViewItem;
    }

    @NotNull
    public final TextLabelViewItem getEditLabelViewItem() {
        return this.editLabelViewItem;
    }

    @NotNull
    public final InputComponentViewItem getEmailViewItem() {
        return this.emailViewItem;
    }

    @NotNull
    public final InputComponentViewItem getPhoneNumberViewItem() {
        return this.phoneNumberViewItem;
    }

    @NotNull
    public final TextLabelViewItem getPrefilledEmailLabelViewItem() {
        return this.prefilledEmailLabelViewItem;
    }

    @NotNull
    public final TextLabelViewItem getPrefilledEmailTextViewItem() {
        return this.prefilledEmailTextViewItem;
    }

    @NotNull
    public final TextLabelViewItem getPrefilledPhoneLabelViewItem() {
        return this.prefilledPhoneLabelViewItem;
    }

    @NotNull
    public final TextLabelViewItem getPrefilledPhoneTextViewItem() {
        return this.prefilledPhoneTextViewItem;
    }

    @NotNull
    public final TextLabelViewItem getSaveCardLabelItem() {
        return this.saveCardLabelItem;
    }

    public final boolean getShowPrefilledEmailView() {
        return this.showPrefilledEmailView;
    }

    public final boolean getShowPrefilledPhoneView() {
        return this.showPrefilledPhoneView;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10 = 1237;
        if (this.isChecked) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int a6 = I1.a(this.editLabelViewItem, I1.a(this.prefilledPhoneTextViewItem, I1.a(this.prefilledPhoneLabelViewItem, I1.a(this.prefilledEmailTextViewItem, I1.a(this.prefilledEmailLabelViewItem, (this.countryCodeViewItem.hashCode() + ((this.phoneNumberViewItem.hashCode() + ((this.emailViewItem.hashCode() + I1.a(this.saveCardLabelItem, i4 * 31, 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31);
        if (this.showPrefilledEmailView) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i11 = (i5 + a6) * 31;
        if (this.showPrefilledPhoneView) {
            i10 = 1231;
        }
        return this.country.hashCode() + ((i10 + i11) * 31);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    @NotNull
    public final String toString() {
        return "SaveCardViewState(isChecked=" + this.isChecked + ", saveCardLabelItem=" + this.saveCardLabelItem + ", emailViewItem=" + this.emailViewItem + ", phoneNumberViewItem=" + this.phoneNumberViewItem + ", countryCodeViewItem=" + this.countryCodeViewItem + ", prefilledEmailLabelViewItem=" + this.prefilledEmailLabelViewItem + ", prefilledEmailTextViewItem=" + this.prefilledEmailTextViewItem + ", prefilledPhoneLabelViewItem=" + this.prefilledPhoneLabelViewItem + ", prefilledPhoneTextViewItem=" + this.prefilledPhoneTextViewItem + ", editLabelViewItem=" + this.editLabelViewItem + ", showPrefilledEmailView=" + this.showPrefilledEmailView + ", showPrefilledPhoneView=" + this.showPrefilledPhoneView + ", country=" + this.country + ")";
    }

    public /* synthetic */ SaveCardViewState(boolean z2, TextLabelViewItem textLabelViewItem, InputComponentViewItem inputComponentViewItem, InputComponentViewItem inputComponentViewItem2, InputComponentViewItem inputComponentViewItem3, TextLabelViewItem textLabelViewItem2, TextLabelViewItem textLabelViewItem3, TextLabelViewItem textLabelViewItem4, TextLabelViewItem textLabelViewItem5, TextLabelViewItem textLabelViewItem6, boolean z10, boolean z11, Country country, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, textLabelViewItem, inputComponentViewItem, inputComponentViewItem2, inputComponentViewItem3, textLabelViewItem2, textLabelViewItem3, textLabelViewItem4, textLabelViewItem5, textLabelViewItem6, (i4 & Barcode.FORMAT_UPC_E) != 0 ? false : z10, (i4 & 2048) != 0 ? false : z11, country);
    }
}
