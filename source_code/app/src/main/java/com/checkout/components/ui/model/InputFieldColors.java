package com.checkout.components.ui.model;

import a0.C0366t;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0014J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0014J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0014J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u0014J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u0014J¶\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b@\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\bA\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\bB\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\bC\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bD\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bE\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bF\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\bG\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bI\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bJ\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bK\u0010\u0014R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bL\u0010\u0014R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bM\u0010\u0014¨\u0006N"}, d2 = {"Lcom/checkout/components/ui/model/InputFieldColors;", "", "La0/t;", "textColor", "placeholderColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "containerColor", "cursorColor", "errorCursorColor", "cursorHandleColor", "cursorHighlightColor", "<init>", "(La0/t;La0/t;La0/t;La0/t;La0/t;La0/t;La0/t;La0/t;La0/t;JLa0/t;La0/t;La0/t;La0/t;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-QN2ZGVo", "()La0/t;", "component1", "component2-QN2ZGVo", "component2", "component3-QN2ZGVo", "component3", "component4-QN2ZGVo", "component4", "component5-QN2ZGVo", "component5", "component6-QN2ZGVo", "component6", "component7-QN2ZGVo", "component7", "component8-QN2ZGVo", "component8", "component9-QN2ZGVo", "component9", "component10-0d7_KjU", "()J", "component10", "component11-QN2ZGVo", "component11", "component12-QN2ZGVo", "component12", "component13-QN2ZGVo", "component13", "component14-QN2ZGVo", "component14", "copy-OjBk2YA", "(La0/t;La0/t;La0/t;La0/t;La0/t;La0/t;La0/t;La0/t;La0/t;JLa0/t;La0/t;La0/t;La0/t;)Lcom/checkout/components/ui/model/InputFieldColors;", Constants.COPY_TYPE, "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "La0/t;", "getTextColor-QN2ZGVo", "getPlaceholderColor-QN2ZGVo", "getFocusedLabelColor-QN2ZGVo", "getUnfocusedLabelColor-QN2ZGVo", "getDisabledLabelColor-QN2ZGVo", "getFocusedIndicatorColor-QN2ZGVo", "getUnfocusedIndicatorColor-QN2ZGVo", "getDisabledIndicatorColor-QN2ZGVo", "getErrorIndicatorColor-QN2ZGVo", "J", "getContainerColor-0d7_KjU", "getCursorColor-QN2ZGVo", "getErrorCursorColor-QN2ZGVo", "getCursorHandleColor-QN2ZGVo", "getCursorHighlightColor-QN2ZGVo", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputFieldColors {
    public static final int $stable = 0;
    private final long containerColor;

    @Nullable
    private final C0366t cursorColor;

    @Nullable
    private final C0366t cursorHandleColor;

    @Nullable
    private final C0366t cursorHighlightColor;

    @Nullable
    private final C0366t disabledIndicatorColor;

    @Nullable
    private final C0366t disabledLabelColor;

    @Nullable
    private final C0366t errorCursorColor;

    @Nullable
    private final C0366t errorIndicatorColor;

    @Nullable
    private final C0366t focusedIndicatorColor;

    @Nullable
    private final C0366t focusedLabelColor;

    @Nullable
    private final C0366t placeholderColor;

    @Nullable
    private final C0366t textColor;

    @Nullable
    private final C0366t unfocusedIndicatorColor;

    @Nullable
    private final C0366t unfocusedLabelColor;

    public /* synthetic */ InputFieldColors(C0366t c0366t, C0366t c0366t2, C0366t c0366t3, C0366t c0366t4, C0366t c0366t5, C0366t c0366t6, C0366t c0366t7, C0366t c0366t8, C0366t c0366t9, long j5, C0366t c0366t10, C0366t c0366t11, C0366t c0366t12, C0366t c0366t13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0366t, c0366t2, c0366t3, c0366t4, c0366t5, c0366t6, c0366t7, c0366t8, c0366t9, j5, c0366t10, c0366t11, c0366t12, c0366t13);
    }

    /* renamed from: copy-OjBk2YA$default, reason: not valid java name */
    public static /* synthetic */ InputFieldColors m138copyOjBk2YA$default(InputFieldColors inputFieldColors, C0366t c0366t, C0366t c0366t2, C0366t c0366t3, C0366t c0366t4, C0366t c0366t5, C0366t c0366t6, C0366t c0366t7, C0366t c0366t8, C0366t c0366t9, long j5, C0366t c0366t10, C0366t c0366t11, C0366t c0366t12, C0366t c0366t13, int i4, Object obj) {
        C0366t c0366t14;
        C0366t c0366t15;
        C0366t c0366t16;
        C0366t c0366t17;
        C0366t c0366t18;
        C0366t c0366t19;
        C0366t c0366t20;
        C0366t c0366t21;
        C0366t c0366t22;
        long j6;
        C0366t c0366t23;
        C0366t c0366t24;
        C0366t c0366t25;
        C0366t c0366t26;
        if ((i4 & 1) != 0) {
            c0366t14 = inputFieldColors.textColor;
        } else {
            c0366t14 = c0366t;
        }
        if ((i4 & 2) != 0) {
            c0366t15 = inputFieldColors.placeholderColor;
        } else {
            c0366t15 = c0366t2;
        }
        if ((i4 & 4) != 0) {
            c0366t16 = inputFieldColors.focusedLabelColor;
        } else {
            c0366t16 = c0366t3;
        }
        if ((i4 & 8) != 0) {
            c0366t17 = inputFieldColors.unfocusedLabelColor;
        } else {
            c0366t17 = c0366t4;
        }
        if ((i4 & 16) != 0) {
            c0366t18 = inputFieldColors.disabledLabelColor;
        } else {
            c0366t18 = c0366t5;
        }
        if ((i4 & 32) != 0) {
            c0366t19 = inputFieldColors.focusedIndicatorColor;
        } else {
            c0366t19 = c0366t6;
        }
        if ((i4 & 64) != 0) {
            c0366t20 = inputFieldColors.unfocusedIndicatorColor;
        } else {
            c0366t20 = c0366t7;
        }
        if ((i4 & 128) != 0) {
            c0366t21 = inputFieldColors.disabledIndicatorColor;
        } else {
            c0366t21 = c0366t8;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            c0366t22 = inputFieldColors.errorIndicatorColor;
        } else {
            c0366t22 = c0366t9;
        }
        if ((i4 & 512) != 0) {
            j6 = inputFieldColors.containerColor;
        } else {
            j6 = j5;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            c0366t23 = inputFieldColors.cursorColor;
        } else {
            c0366t23 = c0366t10;
        }
        if ((i4 & 2048) != 0) {
            c0366t24 = inputFieldColors.errorCursorColor;
        } else {
            c0366t24 = c0366t11;
        }
        if ((i4 & 4096) != 0) {
            c0366t25 = inputFieldColors.cursorHandleColor;
        } else {
            c0366t25 = c0366t12;
        }
        if ((i4 & 8192) != 0) {
            c0366t26 = inputFieldColors.cursorHighlightColor;
        } else {
            c0366t26 = c0366t13;
        }
        return inputFieldColors.m153copyOjBk2YA(c0366t14, c0366t15, c0366t16, c0366t17, c0366t18, c0366t19, c0366t20, c0366t21, c0366t22, j6, c0366t23, c0366t24, c0366t25, c0366t26);
    }

    @Nullable
    /* renamed from: component1-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getTextColor() {
        return this.textColor;
    }

    /* renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    @Nullable
    /* renamed from: component11-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getCursorColor() {
        return this.cursorColor;
    }

    @Nullable
    /* renamed from: component12-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getErrorCursorColor() {
        return this.errorCursorColor;
    }

    @Nullable
    /* renamed from: component13-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getCursorHandleColor() {
        return this.cursorHandleColor;
    }

    @Nullable
    /* renamed from: component14-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getCursorHighlightColor() {
        return this.cursorHighlightColor;
    }

    @Nullable
    /* renamed from: component2-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getPlaceholderColor() {
        return this.placeholderColor;
    }

    @Nullable
    /* renamed from: component3-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getFocusedLabelColor() {
        return this.focusedLabelColor;
    }

    @Nullable
    /* renamed from: component4-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getUnfocusedLabelColor() {
        return this.unfocusedLabelColor;
    }

    @Nullable
    /* renamed from: component5-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getDisabledLabelColor() {
        return this.disabledLabelColor;
    }

    @Nullable
    /* renamed from: component6-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getFocusedIndicatorColor() {
        return this.focusedIndicatorColor;
    }

    @Nullable
    /* renamed from: component7-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getUnfocusedIndicatorColor() {
        return this.unfocusedIndicatorColor;
    }

    @Nullable
    /* renamed from: component8-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getDisabledIndicatorColor() {
        return this.disabledIndicatorColor;
    }

    @Nullable
    /* renamed from: component9-QN2ZGVo, reason: not valid java name and from getter */
    public final C0366t getErrorIndicatorColor() {
        return this.errorIndicatorColor;
    }

    @NotNull
    /* renamed from: copy-OjBk2YA, reason: not valid java name */
    public final InputFieldColors m153copyOjBk2YA(@Nullable C0366t textColor, @Nullable C0366t placeholderColor, @Nullable C0366t focusedLabelColor, @Nullable C0366t unfocusedLabelColor, @Nullable C0366t disabledLabelColor, @Nullable C0366t focusedIndicatorColor, @Nullable C0366t unfocusedIndicatorColor, @Nullable C0366t disabledIndicatorColor, @Nullable C0366t errorIndicatorColor, long containerColor, @Nullable C0366t cursorColor, @Nullable C0366t errorCursorColor, @Nullable C0366t cursorHandleColor, @Nullable C0366t cursorHighlightColor) {
        return new InputFieldColors(textColor, placeholderColor, focusedLabelColor, unfocusedLabelColor, disabledLabelColor, focusedIndicatorColor, unfocusedIndicatorColor, disabledIndicatorColor, errorIndicatorColor, containerColor, cursorColor, errorCursorColor, cursorHandleColor, cursorHighlightColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFieldColors)) {
            return false;
        }
        InputFieldColors inputFieldColors = (InputFieldColors) other;
        return Intrinsics.areEqual(this.textColor, inputFieldColors.textColor) && Intrinsics.areEqual(this.placeholderColor, inputFieldColors.placeholderColor) && Intrinsics.areEqual(this.focusedLabelColor, inputFieldColors.focusedLabelColor) && Intrinsics.areEqual(this.unfocusedLabelColor, inputFieldColors.unfocusedLabelColor) && Intrinsics.areEqual(this.disabledLabelColor, inputFieldColors.disabledLabelColor) && Intrinsics.areEqual(this.focusedIndicatorColor, inputFieldColors.focusedIndicatorColor) && Intrinsics.areEqual(this.unfocusedIndicatorColor, inputFieldColors.unfocusedIndicatorColor) && Intrinsics.areEqual(this.disabledIndicatorColor, inputFieldColors.disabledIndicatorColor) && Intrinsics.areEqual(this.errorIndicatorColor, inputFieldColors.errorIndicatorColor) && C0366t.charlie(this.containerColor, inputFieldColors.containerColor) && Intrinsics.areEqual(this.cursorColor, inputFieldColors.cursorColor) && Intrinsics.areEqual(this.errorCursorColor, inputFieldColors.errorCursorColor) && Intrinsics.areEqual(this.cursorHandleColor, inputFieldColors.cursorHandleColor) && Intrinsics.areEqual(this.cursorHighlightColor, inputFieldColors.cursorHighlightColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m154getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    @Nullable
    /* renamed from: getCursorColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m155getCursorColorQN2ZGVo() {
        return this.cursorColor;
    }

    @Nullable
    /* renamed from: getCursorHandleColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m156getCursorHandleColorQN2ZGVo() {
        return this.cursorHandleColor;
    }

    @Nullable
    /* renamed from: getCursorHighlightColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m157getCursorHighlightColorQN2ZGVo() {
        return this.cursorHighlightColor;
    }

    @Nullable
    /* renamed from: getDisabledIndicatorColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m158getDisabledIndicatorColorQN2ZGVo() {
        return this.disabledIndicatorColor;
    }

    @Nullable
    /* renamed from: getDisabledLabelColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m159getDisabledLabelColorQN2ZGVo() {
        return this.disabledLabelColor;
    }

    @Nullable
    /* renamed from: getErrorCursorColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m160getErrorCursorColorQN2ZGVo() {
        return this.errorCursorColor;
    }

    @Nullable
    /* renamed from: getErrorIndicatorColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m161getErrorIndicatorColorQN2ZGVo() {
        return this.errorIndicatorColor;
    }

    @Nullable
    /* renamed from: getFocusedIndicatorColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m162getFocusedIndicatorColorQN2ZGVo() {
        return this.focusedIndicatorColor;
    }

    @Nullable
    /* renamed from: getFocusedLabelColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m163getFocusedLabelColorQN2ZGVo() {
        return this.focusedLabelColor;
    }

    @Nullable
    /* renamed from: getPlaceholderColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m164getPlaceholderColorQN2ZGVo() {
        return this.placeholderColor;
    }

    @Nullable
    /* renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m165getTextColorQN2ZGVo() {
        return this.textColor;
    }

    @Nullable
    /* renamed from: getUnfocusedIndicatorColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m166getUnfocusedIndicatorColorQN2ZGVo() {
        return this.unfocusedIndicatorColor;
    }

    @Nullable
    /* renamed from: getUnfocusedLabelColor-QN2ZGVo, reason: not valid java name */
    public final C0366t m167getUnfocusedLabelColorQN2ZGVo() {
        return this.unfocusedLabelColor;
    }

    public int hashCode() {
        int alpha;
        int alpha2;
        int alpha3;
        int alpha4;
        int alpha5;
        int alpha6;
        int alpha7;
        int alpha8;
        int alpha9;
        int alpha10;
        int alpha11;
        int alpha12;
        C0366t c0366t = this.textColor;
        int i4 = 0;
        if (c0366t == null) {
            alpha = 0;
        } else {
            alpha = p.alpha(c0366t.alpha);
        }
        int i5 = alpha * 31;
        C0366t c0366t2 = this.placeholderColor;
        if (c0366t2 == null) {
            alpha2 = 0;
        } else {
            alpha2 = p.alpha(c0366t2.alpha);
        }
        int i10 = (i5 + alpha2) * 31;
        C0366t c0366t3 = this.focusedLabelColor;
        if (c0366t3 == null) {
            alpha3 = 0;
        } else {
            alpha3 = p.alpha(c0366t3.alpha);
        }
        int i11 = (i10 + alpha3) * 31;
        C0366t c0366t4 = this.unfocusedLabelColor;
        if (c0366t4 == null) {
            alpha4 = 0;
        } else {
            alpha4 = p.alpha(c0366t4.alpha);
        }
        int i12 = (i11 + alpha4) * 31;
        C0366t c0366t5 = this.disabledLabelColor;
        if (c0366t5 == null) {
            alpha5 = 0;
        } else {
            alpha5 = p.alpha(c0366t5.alpha);
        }
        int i13 = (i12 + alpha5) * 31;
        C0366t c0366t6 = this.focusedIndicatorColor;
        if (c0366t6 == null) {
            alpha6 = 0;
        } else {
            alpha6 = p.alpha(c0366t6.alpha);
        }
        int i14 = (i13 + alpha6) * 31;
        C0366t c0366t7 = this.unfocusedIndicatorColor;
        if (c0366t7 == null) {
            alpha7 = 0;
        } else {
            alpha7 = p.alpha(c0366t7.alpha);
        }
        int i15 = (i14 + alpha7) * 31;
        C0366t c0366t8 = this.disabledIndicatorColor;
        if (c0366t8 == null) {
            alpha8 = 0;
        } else {
            alpha8 = p.alpha(c0366t8.alpha);
        }
        int i16 = (i15 + alpha8) * 31;
        C0366t c0366t9 = this.errorIndicatorColor;
        if (c0366t9 == null) {
            alpha9 = 0;
        } else {
            alpha9 = p.alpha(c0366t9.alpha);
        }
        int i17 = (i16 + alpha9) * 31;
        long j5 = this.containerColor;
        int i18 = C0366t.lima;
        int whiskey = ad.whiskey(i17, 31, j5);
        C0366t c0366t10 = this.cursorColor;
        if (c0366t10 == null) {
            alpha10 = 0;
        } else {
            alpha10 = p.alpha(c0366t10.alpha);
        }
        int i19 = (whiskey + alpha10) * 31;
        C0366t c0366t11 = this.errorCursorColor;
        if (c0366t11 == null) {
            alpha11 = 0;
        } else {
            alpha11 = p.alpha(c0366t11.alpha);
        }
        int i20 = (i19 + alpha11) * 31;
        C0366t c0366t12 = this.cursorHandleColor;
        if (c0366t12 == null) {
            alpha12 = 0;
        } else {
            alpha12 = p.alpha(c0366t12.alpha);
        }
        int i21 = (i20 + alpha12) * 31;
        C0366t c0366t13 = this.cursorHighlightColor;
        if (c0366t13 != null) {
            i4 = p.alpha(c0366t13.alpha);
        }
        return i21 + i4;
    }

    @NotNull
    public String toString() {
        return "InputFieldColors(textColor=" + this.textColor + ", placeholderColor=" + this.placeholderColor + ", focusedLabelColor=" + this.focusedLabelColor + ", unfocusedLabelColor=" + this.unfocusedLabelColor + ", disabledLabelColor=" + this.disabledLabelColor + ", focusedIndicatorColor=" + this.focusedIndicatorColor + ", unfocusedIndicatorColor=" + this.unfocusedIndicatorColor + ", disabledIndicatorColor=" + this.disabledIndicatorColor + ", errorIndicatorColor=" + this.errorIndicatorColor + ", containerColor=" + C0366t.india(this.containerColor) + ", cursorColor=" + this.cursorColor + ", errorCursorColor=" + this.errorCursorColor + ", cursorHandleColor=" + this.cursorHandleColor + ", cursorHighlightColor=" + this.cursorHighlightColor + ")";
    }

    private InputFieldColors(C0366t c0366t, C0366t c0366t2, C0366t c0366t3, C0366t c0366t4, C0366t c0366t5, C0366t c0366t6, C0366t c0366t7, C0366t c0366t8, C0366t c0366t9, long j5, C0366t c0366t10, C0366t c0366t11, C0366t c0366t12, C0366t c0366t13) {
        this.textColor = c0366t;
        this.placeholderColor = c0366t2;
        this.focusedLabelColor = c0366t3;
        this.unfocusedLabelColor = c0366t4;
        this.disabledLabelColor = c0366t5;
        this.focusedIndicatorColor = c0366t6;
        this.unfocusedIndicatorColor = c0366t7;
        this.disabledIndicatorColor = c0366t8;
        this.errorIndicatorColor = c0366t9;
        this.containerColor = j5;
        this.cursorColor = c0366t10;
        this.errorCursorColor = c0366t11;
        this.cursorHandleColor = c0366t12;
        this.cursorHighlightColor = c0366t13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputFieldColors(C0366t c0366t, C0366t c0366t2, C0366t c0366t3, C0366t c0366t4, C0366t c0366t5, C0366t c0366t6, C0366t c0366t7, C0366t c0366t8, C0366t c0366t9, long j5, C0366t c0366t10, C0366t c0366t11, C0366t c0366t12, C0366t c0366t13, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, (i4 & 8192) == 0 ? c0366t13 : null, null);
        long j6;
        C0366t c0366t14 = (i4 & 1) != 0 ? null : c0366t;
        C0366t c0366t15 = (i4 & 2) != 0 ? null : c0366t2;
        C0366t c0366t16 = (i4 & 4) != 0 ? null : c0366t3;
        C0366t c0366t17 = (i4 & 8) != 0 ? null : c0366t4;
        C0366t c0366t18 = (i4 & 16) != 0 ? null : c0366t5;
        C0366t c0366t19 = (i4 & 32) != 0 ? null : c0366t6;
        C0366t c0366t20 = (i4 & 64) != 0 ? null : c0366t7;
        C0366t c0366t21 = (i4 & 128) != 0 ? null : c0366t8;
        C0366t c0366t22 = (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : c0366t9;
        if ((i4 & 512) != 0) {
            int i5 = C0366t.lima;
            j6 = C0366t.juliet;
        } else {
            j6 = j5;
        }
        C0366t c0366t23 = (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : c0366t10;
        C0366t c0366t24 = (i4 & 2048) != 0 ? null : c0366t11;
        C0366t c0366t25 = (i4 & 4096) != 0 ? null : c0366t12;
    }
}
