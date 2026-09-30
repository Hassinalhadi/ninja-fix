package com.checkout.components.rememberme.model;

import com.checkout.components.ui.model.style.base.ImageStyle;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/rememberme/model/SchemeImageStyle;", "", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "defaultScheme", "localScheme", "<init>", "(Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/style/base/ImageStyle;)V", "component1", "()Lcom/checkout/components/ui/model/style/base/ImageStyle;", "component2", Constants.COPY_TYPE, "(Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/style/base/ImageStyle;)Lcom/checkout/components/rememberme/model/SchemeImageStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "getDefaultScheme", "b", "getLocalScheme", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SchemeImageStyle {
    public static final int $stable = ImageStyle.$stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ImageStyle defaultScheme;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ImageStyle localScheme;

    public SchemeImageStyle(@NotNull ImageStyle defaultScheme, @Nullable ImageStyle imageStyle) {
        Intrinsics.echo(defaultScheme, "defaultScheme");
        this.defaultScheme = defaultScheme;
        this.localScheme = imageStyle;
    }

    public static SchemeImageStyle copy$default(SchemeImageStyle schemeImageStyle, ImageStyle defaultScheme, ImageStyle imageStyle, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            defaultScheme = schemeImageStyle.defaultScheme;
        }
        if ((i4 & 2) != 0) {
            imageStyle = schemeImageStyle.localScheme;
        }
        schemeImageStyle.getClass();
        Intrinsics.echo(defaultScheme, "defaultScheme");
        return new SchemeImageStyle(defaultScheme, imageStyle);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageStyle getDefaultScheme() {
        return this.defaultScheme;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ImageStyle getLocalScheme() {
        return this.localScheme;
    }

    @NotNull
    public final SchemeImageStyle copy(@NotNull ImageStyle defaultScheme, @Nullable ImageStyle localScheme) {
        Intrinsics.echo(defaultScheme, "defaultScheme");
        return new SchemeImageStyle(defaultScheme, localScheme);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchemeImageStyle)) {
            return false;
        }
        SchemeImageStyle schemeImageStyle = (SchemeImageStyle) other;
        return Intrinsics.areEqual(this.defaultScheme, schemeImageStyle.defaultScheme) && Intrinsics.areEqual(this.localScheme, schemeImageStyle.localScheme);
    }

    @NotNull
    public final ImageStyle getDefaultScheme() {
        return this.defaultScheme;
    }

    @Nullable
    public final ImageStyle getLocalScheme() {
        return this.localScheme;
    }

    public final int hashCode() {
        int hashCode = this.defaultScheme.hashCode() * 31;
        ImageStyle imageStyle = this.localScheme;
        return hashCode + (imageStyle == null ? 0 : imageStyle.hashCode());
    }

    @NotNull
    public final String toString() {
        return "SchemeImageStyle(defaultScheme=" + this.defaultScheme + ", localScheme=" + this.localScheme + ")";
    }

    public /* synthetic */ SchemeImageStyle(ImageStyle imageStyle, ImageStyle imageStyle2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageStyle, (i4 & 2) != 0 ? null : imageStyle2);
    }
}
