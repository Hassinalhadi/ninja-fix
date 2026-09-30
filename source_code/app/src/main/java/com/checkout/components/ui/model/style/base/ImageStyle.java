package com.checkout.components.ui.model.style.base;

import T.p;
import T.s;
import com.checkout.components.ui.model.Padding;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bm\b\u0007\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jt\u0010!\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001cR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010 ¨\u0006:"}, d2 = {"Lcom/checkout/components/ui/model/style/base/ImageStyle;", "", "", "image", "", "tinColor", "height", "width", "Lcom/checkout/components/ui/model/Padding;", "padding", "", "opacity", "Lkotlin/Function0;", "", "onClick", "LT/s;", "modifier", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/checkout/components/ui/model/Padding;Ljava/lang/Float;Lkotlin/jvm/functions/Function0;LT/s;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Long;", "component3", "component4", "component5", "()Lcom/checkout/components/ui/model/Padding;", "component6", "()Ljava/lang/Float;", "component7", "()Lkotlin/jvm/functions/Function0;", "component8", "()LT/s;", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/checkout/components/ui/model/Padding;Ljava/lang/Float;Lkotlin/jvm/functions/Function0;LT/s;)Lcom/checkout/components/ui/model/style/base/ImageStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getImage", "Ljava/lang/Long;", "getTinColor", "getHeight", "getWidth", "Lcom/checkout/components/ui/model/Padding;", "getPadding", "Ljava/lang/Float;", "getOpacity", "Lkotlin/jvm/functions/Function0;", "getOnClick", "LT/s;", "getModifier", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ImageStyle {
    public static final int $stable = 0;

    @Nullable
    private final Integer height;

    @Nullable
    private final Integer image;

    @NotNull
    private final s modifier;

    @Nullable
    private final Function0<Unit> onClick;

    @Nullable
    private final Float opacity;

    @Nullable
    private final Padding padding;

    @Nullable
    private final Long tinColor;

    @Nullable
    private final Integer width;

    public ImageStyle() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ ImageStyle copy$default(ImageStyle imageStyle, Integer num, Long l10, Integer num2, Integer num3, Padding padding, Float f5, Function0 function0, s sVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            num = imageStyle.image;
        }
        if ((i4 & 2) != 0) {
            l10 = imageStyle.tinColor;
        }
        if ((i4 & 4) != 0) {
            num2 = imageStyle.height;
        }
        if ((i4 & 8) != 0) {
            num3 = imageStyle.width;
        }
        if ((i4 & 16) != 0) {
            padding = imageStyle.padding;
        }
        if ((i4 & 32) != 0) {
            f5 = imageStyle.opacity;
        }
        if ((i4 & 64) != 0) {
            function0 = imageStyle.onClick;
        }
        if ((i4 & 128) != 0) {
            sVar = imageStyle.modifier;
        }
        Function0 function02 = function0;
        s sVar2 = sVar;
        Padding padding2 = padding;
        Float f10 = f5;
        return imageStyle.copy(num, l10, num2, num3, padding2, f10, function02, sVar2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getImage() {
        return this.image;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Long getTinColor() {
        return this.tinColor;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Padding getPadding() {
        return this.padding;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getOpacity() {
        return this.opacity;
    }

    @Nullable
    public final Function0<Unit> component7() {
        return this.onClick;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final s getModifier() {
        return this.modifier;
    }

    @NotNull
    public final ImageStyle copy(@Nullable Integer image, @Nullable Long tinColor, @Nullable Integer height, @Nullable Integer width, @Nullable Padding padding, @Nullable Float opacity, @Nullable Function0<Unit> onClick, @NotNull s modifier) {
        Intrinsics.echo(modifier, "modifier");
        return new ImageStyle(image, tinColor, height, width, padding, opacity, onClick, modifier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageStyle)) {
            return false;
        }
        ImageStyle imageStyle = (ImageStyle) other;
        return Intrinsics.areEqual(this.image, imageStyle.image) && Intrinsics.areEqual(this.tinColor, imageStyle.tinColor) && Intrinsics.areEqual(this.height, imageStyle.height) && Intrinsics.areEqual(this.width, imageStyle.width) && Intrinsics.areEqual(this.padding, imageStyle.padding) && Intrinsics.areEqual(this.opacity, imageStyle.opacity) && Intrinsics.areEqual(this.onClick, imageStyle.onClick) && Intrinsics.areEqual(this.modifier, imageStyle.modifier);
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final Integer getImage() {
        return this.image;
    }

    @NotNull
    public final s getModifier() {
        return this.modifier;
    }

    @Nullable
    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @Nullable
    public final Float getOpacity() {
        return this.opacity;
    }

    @Nullable
    public final Padding getPadding() {
        return this.padding;
    }

    @Nullable
    public final Long getTinColor() {
        return this.tinColor;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.image;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l10 = this.tinColor;
        int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.width;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Padding padding = this.padding;
        int hashCode5 = (hashCode4 + (padding == null ? 0 : padding.hashCode())) * 31;
        Float f5 = this.opacity;
        int hashCode6 = (hashCode5 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Function0<Unit> function0 = this.onClick;
        return this.modifier.hashCode() + ((hashCode6 + (function0 != null ? function0.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ImageStyle(image=" + this.image + ", tinColor=" + this.tinColor + ", height=" + this.height + ", width=" + this.width + ", padding=" + this.padding + ", opacity=" + this.opacity + ", onClick=" + this.onClick + ", modifier=" + this.modifier + ")";
    }

    public ImageStyle(@Nullable Integer num) {
        this(num, null, null, null, null, null, null, null, 254, null);
    }

    public ImageStyle(@Nullable Integer num, @Nullable Long l10) {
        this(num, l10, null, null, null, null, null, null, 252, null);
    }

    public ImageStyle(@Nullable Integer num, @Nullable Long l10, @Nullable Integer num2) {
        this(num, l10, num2, null, null, null, null, null, 248, null);
    }

    public ImageStyle(@Nullable Integer num, @Nullable Long l10, @Nullable Integer num2, @Nullable Integer num3) {
        this(num, l10, num2, num3, null, null, null, null, 240, null);
    }

    public ImageStyle(@Nullable Integer num, @Nullable Long l10, @Nullable Integer num2, @Nullable Integer num3, @Nullable Padding padding) {
        this(num, l10, num2, num3, padding, null, null, null, 224, null);
    }

    public ImageStyle(@Nullable Integer num, @Nullable Long l10, @Nullable Integer num2, @Nullable Integer num3, @Nullable Padding padding, @Nullable Float f5) {
        this(num, l10, num2, num3, padding, f5, null, null, 192, null);
    }

    public ImageStyle(@Nullable Integer num, @Nullable Long l10, @Nullable Integer num2, @Nullable Integer num3, @Nullable Padding padding, @Nullable Float f5, @Nullable Function0<Unit> function0) {
        this(num, l10, num2, num3, padding, f5, function0, null, 128, null);
    }

    public ImageStyle(@Nullable Integer num, @Nullable Long l10, @Nullable Integer num2, @Nullable Integer num3, @Nullable Padding padding, @Nullable Float f5, @Nullable Function0<Unit> function0, @NotNull s modifier) {
        Intrinsics.echo(modifier, "modifier");
        this.image = num;
        this.tinColor = l10;
        this.height = num2;
        this.width = num3;
        this.padding = padding;
        this.opacity = f5;
        this.onClick = function0;
        this.modifier = modifier;
    }

    public /* synthetic */ ImageStyle(Integer num, Long l10, Integer num2, Integer num3, Padding padding, Float f5, Function0 function0, s sVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : num, (i4 & 2) != 0 ? null : l10, (i4 & 4) != 0 ? null : num2, (i4 & 8) != 0 ? null : num3, (i4 & 16) != 0 ? null : padding, (i4 & 32) != 0 ? null : f5, (i4 & 64) != 0 ? null : function0, (i4 & 128) != 0 ? p.alpha : sVar);
    }
}
