package com.checkout.components.ui.style;

import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.ui.model.Padding;
import com.checkout.components.ui.model.Shape;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.utils.constants.ButtonStyleConstants;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0081\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/ui/style/DefaultButtonStyle;", "", "<init>", "()V", "solid", "Lcom/checkout/components/ui/model/style/base/ButtonStyle;", Constants.KEY_TEXT, "", "textId", "", "contentColor", "", "containerColor", "disabledContentColor", "disabledContainerColor", "successContainerColor", "borderRadius", "Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "buttonFont", "Lcom/checkout/components/interfaces/uicustomisation/font/Font;", "padding", "Lcom/checkout/components/ui/model/Padding;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;Lcom/checkout/components/interfaces/uicustomisation/font/Font;Lcom/checkout/components/ui/model/Padding;)Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultButtonStyle {
    public static final int $stable = 0;

    @NotNull
    public static final DefaultButtonStyle INSTANCE = new DefaultButtonStyle();

    private DefaultButtonStyle() {
    }

    public static /* synthetic */ ButtonStyle solid$default(DefaultButtonStyle defaultButtonStyle, String str, Integer num, Long l10, Long l11, Long l12, Long l13, Long l14, BorderRadius borderRadius, Font font, Padding padding, int i4, Object obj) {
        String str2;
        Integer num2;
        Long l15;
        Long l16;
        Long l17;
        Long l18;
        Long l19;
        BorderRadius borderRadius2;
        Padding padding2;
        if ((i4 & 1) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        Font font2 = null;
        if ((i4 & 2) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        if ((i4 & 4) != 0) {
            l15 = null;
        } else {
            l15 = l10;
        }
        if ((i4 & 8) != 0) {
            l16 = null;
        } else {
            l16 = l11;
        }
        if ((i4 & 16) != 0) {
            l17 = null;
        } else {
            l17 = l12;
        }
        if ((i4 & 32) != 0) {
            l18 = null;
        } else {
            l18 = l13;
        }
        if ((i4 & 64) != 0) {
            l19 = null;
        } else {
            l19 = l14;
        }
        if ((i4 & 128) != 0) {
            borderRadius2 = null;
        } else {
            borderRadius2 = borderRadius;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) == 0) {
            font2 = font;
        }
        if ((i4 & 512) != 0) {
            padding2 = new Padding(20, 12, 0, 0, 12, null);
        } else {
            padding2 = padding;
        }
        return defaultButtonStyle.solid(str2, num2, l15, l16, l17, l18, l19, borderRadius2, font2, padding2);
    }

    @NotNull
    public final ButtonStyle solid() {
        return solid$default(this, null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @NotNull
    public final ButtonStyle solid(@NotNull String text) {
        Intrinsics.echo(text, "text");
        return solid$default(this, text, null, null, null, null, null, null, null, null, null, 1022, null);
    }

    @NotNull
    public final ButtonStyle solid(@NotNull String text, @Nullable Integer num) {
        Intrinsics.echo(text, "text");
        return solid$default(this, text, num, null, null, null, null, null, null, null, null, 1020, null);
    }

    @NotNull
    public final ButtonStyle solid(@NotNull String text, @Nullable Integer num, @Nullable Long l10) {
        Intrinsics.echo(text, "text");
        return solid$default(this, text, num, l10, null, null, null, null, null, null, null, 1016, null);
    }

    @NotNull
    public final ButtonStyle solid(@NotNull String text, @Nullable Integer num, @Nullable Long l10, @Nullable Long l11) {
        Intrinsics.echo(text, "text");
        return solid$default(this, text, num, l10, l11, null, null, null, null, null, null, 1008, null);
    }

    @NotNull
    public final ButtonStyle solid(@NotNull String text, @Nullable Integer num, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12) {
        Intrinsics.echo(text, "text");
        return solid$default(this, text, num, l10, l11, l12, null, null, null, null, null, 992, null);
    }

    @NotNull
    public final ButtonStyle solid(@NotNull String text, @Nullable Integer num, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13) {
        Intrinsics.echo(text, "text");
        return solid$default(this, text, num, l10, l11, l12, l13, null, null, null, null, 960, null);
    }

    @NotNull
    public final ButtonStyle solid(@NotNull String text, @Nullable Integer num, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14) {
        Intrinsics.echo(text, "text");
        return solid$default(this, text, num, l10, l11, l12, l13, l14, null, null, null, 896, null);
    }

    @NotNull
    public final ButtonStyle solid(@NotNull String text, @Nullable Integer num, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable BorderRadius borderRadius) {
        Intrinsics.echo(text, "text");
        return solid$default(this, text, num, l10, l11, l12, l13, l14, borderRadius, null, null, 768, null);
    }

    @NotNull
    public final ButtonStyle solid(@NotNull String text, @Nullable Integer num, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable BorderRadius borderRadius, @Nullable Font font) {
        Intrinsics.echo(text, "text");
        return solid$default(this, text, num, l10, l11, l12, l13, l14, borderRadius, font, null, 512, null);
    }

    @NotNull
    public final ButtonStyle solid(@NotNull String r27, @Nullable Integer textId, @Nullable Long contentColor, @Nullable Long containerColor, @Nullable Long disabledContentColor, @Nullable Long disabledContainerColor, @Nullable Long successContainerColor, @Nullable BorderRadius borderRadius, @Nullable Font buttonFont, @NotNull Padding padding) {
        Intrinsics.echo(r27, "text");
        Intrinsics.echo(padding, "padding");
        long longValue = contentColor != null ? contentColor.longValue() : 4294967295L;
        long longValue2 = containerColor != null ? containerColor.longValue() : 4279790335L;
        long longValue3 = disabledContentColor != null ? disabledContentColor.longValue() : ButtonStyleConstants.INSTANCE.getCOLOR_TRANSPARENT();
        long longValue4 = disabledContainerColor != null ? disabledContainerColor.longValue() : 4289769648L;
        long longValue5 = successContainerColor != null ? successContainerColor.longValue() : 4278224234L;
        Shape shape = Shape.RoundCorner;
        ContainerStyle containerStyle = new ContainerStyle(0L, null, null, padding, 7, null);
        BorderRadius borderRadius2 = borderRadius == null ? new BorderRadius(4) : borderRadius;
        long j5 = 4294967295L;
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        if (contentColor != null) {
            j5 = contentColor.longValue();
        }
        return new ButtonStyle(longValue2, longValue4, longValue5, longValue, longValue3, shape, borderRadius2, DefaultStyle.textLabelStyle$default(defaultStyle, r27, textId, j5, buttonFont, null, null, null, null, 240, null), containerStyle);
    }
}
