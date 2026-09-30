package com.checkout.components.kmp.rememberme.shared.model.customization;

import com.checkout.components.kmp.rememberme.utils.DefaultFonts;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/Fonts;", "", "heading", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;", "subheading", "footnote", "button", "input", "label", "<init>", "(Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;)V", "getHeading", "()Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;", "getSubheading", "getFootnote", "getButton", "getInput", "getLabel", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Fonts {
    public static final int $stable = 0;

    @NotNull
    private final Font button;

    @NotNull
    private final Font footnote;

    @NotNull
    private final Font heading;

    @NotNull
    private final Font input;

    @NotNull
    private final Font label;

    @NotNull
    private final Font subheading;

    public Fonts() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Fonts copy$default(Fonts fonts, Font font, Font font2, Font font3, Font font4, Font font5, Font font6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            font = fonts.heading;
        }
        if ((i4 & 2) != 0) {
            font2 = fonts.subheading;
        }
        if ((i4 & 4) != 0) {
            font3 = fonts.footnote;
        }
        if ((i4 & 8) != 0) {
            font4 = fonts.button;
        }
        if ((i4 & 16) != 0) {
            font5 = fonts.input;
        }
        if ((i4 & 32) != 0) {
            font6 = fonts.label;
        }
        Font font7 = font5;
        Font font8 = font6;
        return fonts.copy(font, font2, font3, font4, font7, font8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Font getHeading() {
        return this.heading;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Font getSubheading() {
        return this.subheading;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Font getFootnote() {
        return this.footnote;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Font getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Font getInput() {
        return this.input;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Font getLabel() {
        return this.label;
    }

    @NotNull
    public final Fonts copy(@NotNull Font heading, @NotNull Font subheading, @NotNull Font footnote, @NotNull Font button, @NotNull Font input, @NotNull Font label) {
        Intrinsics.echo(heading, "heading");
        Intrinsics.echo(subheading, "subheading");
        Intrinsics.echo(footnote, "footnote");
        Intrinsics.echo(button, "button");
        Intrinsics.echo(input, "input");
        Intrinsics.echo(label, "label");
        return new Fonts(heading, subheading, footnote, button, input, label);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fonts)) {
            return false;
        }
        Fonts fonts = (Fonts) other;
        return Intrinsics.areEqual(this.heading, fonts.heading) && Intrinsics.areEqual(this.subheading, fonts.subheading) && Intrinsics.areEqual(this.footnote, fonts.footnote) && Intrinsics.areEqual(this.button, fonts.button) && Intrinsics.areEqual(this.input, fonts.input) && Intrinsics.areEqual(this.label, fonts.label);
    }

    @NotNull
    public final Font getButton() {
        return this.button;
    }

    @NotNull
    public final Font getFootnote() {
        return this.footnote;
    }

    @NotNull
    public final Font getHeading() {
        return this.heading;
    }

    @NotNull
    public final Font getInput() {
        return this.input;
    }

    @NotNull
    public final Font getLabel() {
        return this.label;
    }

    @NotNull
    public final Font getSubheading() {
        return this.subheading;
    }

    public int hashCode() {
        return this.label.hashCode() + ((this.input.hashCode() + ((this.button.hashCode() + ((this.footnote.hashCode() + ((this.subheading.hashCode() + (this.heading.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Fonts(heading=" + this.heading + ", subheading=" + this.subheading + ", footnote=" + this.footnote + ", button=" + this.button + ", input=" + this.input + ", label=" + this.label + ")";
    }

    public Fonts(@NotNull Font heading, @NotNull Font subheading, @NotNull Font footnote, @NotNull Font button, @NotNull Font input, @NotNull Font label) {
        Intrinsics.echo(heading, "heading");
        Intrinsics.echo(subheading, "subheading");
        Intrinsics.echo(footnote, "footnote");
        Intrinsics.echo(button, "button");
        Intrinsics.echo(input, "input");
        Intrinsics.echo(label, "label");
        this.heading = heading;
        this.subheading = subheading;
        this.footnote = footnote;
        this.button = button;
        this.input = input;
        this.label = label;
    }

    public /* synthetic */ Fonts(Font font, Font font2, Font font3, Font font4, Font font5, Font font6, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? DefaultFonts.INSTANCE.getHEADLINE() : font, (i4 & 2) != 0 ? DefaultFonts.INSTANCE.getSUBHEADLINE() : font2, (i4 & 4) != 0 ? DefaultFonts.INSTANCE.getFOOTNOTE() : font3, (i4 & 8) != 0 ? DefaultFonts.INSTANCE.getBUTTON() : font4, (i4 & 16) != 0 ? DefaultFonts.INSTANCE.getINPUT() : font5, (i4 & 32) != 0 ? DefaultFonts.INSTANCE.getLABEL() : font6);
    }
}
