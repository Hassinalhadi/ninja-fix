package com.checkout.components.ui.utils.constants;

import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.ui.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/ui/utils/constants/DesignConstants;", "", "<init>", "()V", "", "ERROR", "J", "", "ERROR_FONT_SIZE", "I", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "fontFamily", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "getFontFamily", "()Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "BACKGROUND_COLOR", "LQ0/g;", "errorMessagePadding", "F", "getErrorMessagePadding-D9Ej5fM", "()F", "errorLabelHeightSpacing", "getErrorLabelHeightSpacing-D9Ej5fM", "infoRowHeightSpacing", "getInfoRowHeightSpacing-D9Ej5fM", "infoContentRowPadding", "getInfoContentRowPadding-D9Ej5fM", "INPUT_TEXT_COLOR", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DesignConstants {
    public static final int $stable;
    public static final long BACKGROUND_COLOR = 0;
    public static final long ERROR = 4289538110L;
    public static final int ERROR_FONT_SIZE = 13;
    public static final long INPUT_TEXT_COLOR = 4278190080L;

    @NotNull
    public static final DesignConstants INSTANCE = new DesignConstants();
    private static final float errorLabelHeightSpacing;
    private static final float errorMessagePadding;

    @NotNull
    private static final FontFamily fontFamily;
    private static final float infoContentRowPadding;
    private static final float infoRowHeightSpacing;

    static {
        int i4 = R.font.cko_roboto_normal;
        Integer valueOf = Integer.valueOf(R.font.cko_roboto_italic);
        Integer valueOf2 = Integer.valueOf(R.font.cko_roboto_light);
        Integer valueOf3 = Integer.valueOf(R.font.cko_roboto_medium);
        Integer valueOf4 = Integer.valueOf(R.font.cko_roboto_semi_bold);
        int i5 = R.font.cko_roboto_bold;
        fontFamily = new FontFamily.Custom(i4, valueOf, valueOf2, valueOf3, valueOf4, Integer.valueOf(i5), Integer.valueOf(i5));
        float f5 = 4;
        errorMessagePadding = f5;
        float f10 = 16;
        errorLabelHeightSpacing = f10;
        infoRowHeightSpacing = f10;
        infoContentRowPadding = f5;
        $stable = FontFamily.$stable;
    }

    private DesignConstants() {
    }

    /* renamed from: getErrorLabelHeightSpacing-D9Ej5fM, reason: not valid java name */
    public final float m185getErrorLabelHeightSpacingD9Ej5fM() {
        return errorLabelHeightSpacing;
    }

    /* renamed from: getErrorMessagePadding-D9Ej5fM, reason: not valid java name */
    public final float m186getErrorMessagePaddingD9Ej5fM() {
        return errorMessagePadding;
    }

    @NotNull
    public final FontFamily getFontFamily() {
        return fontFamily;
    }

    /* renamed from: getInfoContentRowPadding-D9Ej5fM, reason: not valid java name */
    public final float m187getInfoContentRowPaddingD9Ej5fM() {
        return infoContentRowPadding;
    }

    /* renamed from: getInfoRowHeightSpacing-D9Ej5fM, reason: not valid java name */
    public final float m188getInfoRowHeightSpacingD9Ej5fM() {
        return infoRowHeightSpacing;
    }
}
