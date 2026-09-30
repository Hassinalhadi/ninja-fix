package com.checkout.components.core.utils.constants;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\bÁ\u0002\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/core/utils/constants/ContainerConstants;", "", "LQ0/g;", "a", "F", "getDividerThickness-D9Ej5fM", "()F", "dividerThickness", "", "b", "J", "getBackgroundColor", "()J", "backgroundColor", "c", "getBorderColor", "borderColor", Constants.INAPP_DATA_TAG, "getPaddingStart-D9Ej5fM", "paddingStart", "e", "getPaddingEnd-D9Ej5fM", "paddingEnd", "f", "getCornerRadius-D9Ej5fM", "cornerRadius", "g", "getBorderStrokeWidth-D9Ej5fM", "borderStrokeWidth", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContainerConstants {
    public static final int $stable = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float paddingStart;

    /* renamed from: e, reason: from kotlin metadata */
    private static final float paddingEnd;

    @NotNull
    public static final ContainerConstants INSTANCE = new ContainerConstants();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final float dividerThickness = 2;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long backgroundColor = 4294967295L;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long borderColor = 4292730333L;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float cornerRadius = 4;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float borderStrokeWidth = 1;

    static {
        float f5 = 16;
        paddingStart = f5;
        paddingEnd = f5;
    }

    private ContainerConstants() {
    }

    public final long getBackgroundColor() {
        return backgroundColor;
    }

    public final long getBorderColor() {
        return borderColor;
    }

    /* renamed from: getBorderStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m100getBorderStrokeWidthD9Ej5fM() {
        return borderStrokeWidth;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m101getCornerRadiusD9Ej5fM() {
        return cornerRadius;
    }

    /* renamed from: getDividerThickness-D9Ej5fM, reason: not valid java name */
    public final float m102getDividerThicknessD9Ej5fM() {
        return dividerThickness;
    }

    /* renamed from: getPaddingEnd-D9Ej5fM, reason: not valid java name */
    public final float m103getPaddingEndD9Ej5fM() {
        return paddingEnd;
    }

    /* renamed from: getPaddingStart-D9Ej5fM, reason: not valid java name */
    public final float m104getPaddingStartD9Ej5fM() {
        return paddingStart;
    }
}
