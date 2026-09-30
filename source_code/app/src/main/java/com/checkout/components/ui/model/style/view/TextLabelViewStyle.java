package com.checkout.components.ui.model.style.view;

import D0.ak;
import D0.an;
import Q0.c;
import T.p;
import T.s;
import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Constants;
import hd.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.D6;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019Jd\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0016J\u001a\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b0\u0010\u0016R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b5\u0010\u0019¨\u00066"}, d2 = {"Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "", "LT/s;", "modifier", "Ls6/D6;", "overflow", "", "softWrap", "", "maxLines", "Lkotlin/Function1;", "LD0/ak;", "", "onTextLayout", "LD0/an;", "style", "textMaxWidth", "<init>", "(LT/s;IZILkotlin/jvm/functions/Function1;LD0/an;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()LT/s;", "component2-gIe3tQ8", "()I", "component2", "component3", "()Z", "component4", "component5", "()Lkotlin/jvm/functions/Function1;", "component6", "()LD0/an;", "component7", "copy-QstMH_w", "(LT/s;IZILkotlin/jvm/functions/Function1;LD0/an;Z)Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", Constants.COPY_TYPE, "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "LT/s;", "getModifier", "I", "getOverflow-gIe3tQ8", "Z", "getSoftWrap", "getMaxLines", "Lkotlin/jvm/functions/Function1;", "getOnTextLayout", "LD0/an;", "getStyle", "getTextMaxWidth", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextLabelViewStyle {
    public static final int $stable = 0;
    private final int maxLines;

    @NotNull
    private final s modifier;

    @NotNull
    private final Function1<ak, Unit> onTextLayout;
    private final int overflow;
    private final boolean softWrap;

    @Nullable
    private final an style;
    private final boolean textMaxWidth;

    public /* synthetic */ TextLabelViewStyle(s sVar, int i4, boolean z2, int i5, Function1 function1, an anVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sVar, i4, z2, i5, function1, anVar, z10);
    }

    public static final Unit _init_$lambda$0(ak it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: copy-QstMH_w$default */
    public static /* synthetic */ TextLabelViewStyle m180copyQstMH_w$default(TextLabelViewStyle textLabelViewStyle, s sVar, int i4, boolean z2, int i5, Function1 function1, an anVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sVar = textLabelViewStyle.modifier;
        }
        if ((i10 & 2) != 0) {
            i4 = textLabelViewStyle.overflow;
        }
        if ((i10 & 4) != 0) {
            z2 = textLabelViewStyle.softWrap;
        }
        if ((i10 & 8) != 0) {
            i5 = textLabelViewStyle.maxLines;
        }
        if ((i10 & 16) != 0) {
            function1 = textLabelViewStyle.onTextLayout;
        }
        if ((i10 & 32) != 0) {
            anVar = textLabelViewStyle.style;
        }
        if ((i10 & 64) != 0) {
            z10 = textLabelViewStyle.textMaxWidth;
        }
        an anVar2 = anVar;
        boolean z11 = z10;
        Function1 function12 = function1;
        boolean z12 = z2;
        return textLabelViewStyle.m182copyQstMH_w(sVar, i4, z12, i5, function12, anVar2, z11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final s getModifier() {
        return this.modifier;
    }

    /* renamed from: component2-gIe3tQ8, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    @NotNull
    public final Function1<ak, Unit> component5() {
        return this.onTextLayout;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final an getStyle() {
        return this.style;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getTextMaxWidth() {
        return this.textMaxWidth;
    }

    @NotNull
    /* renamed from: copy-QstMH_w */
    public final TextLabelViewStyle m182copyQstMH_w(@NotNull s modifier, int overflow, boolean softWrap, int maxLines, @NotNull Function1<? super ak, Unit> onTextLayout, @Nullable an style, boolean textMaxWidth) {
        Intrinsics.echo(modifier, "modifier");
        Intrinsics.echo(onTextLayout, "onTextLayout");
        return new TextLabelViewStyle(modifier, overflow, softWrap, maxLines, onTextLayout, style, textMaxWidth, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLabelViewStyle)) {
            return false;
        }
        TextLabelViewStyle textLabelViewStyle = (TextLabelViewStyle) other;
        if (Intrinsics.areEqual(this.modifier, textLabelViewStyle.modifier) && this.overflow == textLabelViewStyle.overflow && this.softWrap == textLabelViewStyle.softWrap && this.maxLines == textLabelViewStyle.maxLines && Intrinsics.areEqual(this.onTextLayout, textLabelViewStyle.onTextLayout) && Intrinsics.areEqual(this.style, textLabelViewStyle.style) && this.textMaxWidth == textLabelViewStyle.textMaxWidth) {
            return true;
        }
        return false;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @NotNull
    public final s getModifier() {
        return this.modifier;
    }

    @NotNull
    public final Function1<ak, Unit> getOnTextLayout() {
        return this.onTextLayout;
    }

    /* renamed from: getOverflow-gIe3tQ8 */
    public final int m183getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    @Nullable
    public final an getStyle() {
        return this.style;
    }

    public final boolean getTextMaxWidth() {
        return this.textMaxWidth;
    }

    public int hashCode() {
        int i4;
        int hashCode;
        int hashCode2 = (this.overflow + (this.modifier.hashCode() * 31)) * 31;
        int i5 = 1237;
        if (this.softWrap) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int hashCode3 = (this.onTextLayout.hashCode() + ((this.maxLines + ((i4 + hashCode2) * 31)) * 31)) * 31;
        an anVar = this.style;
        if (anVar == null) {
            hashCode = 0;
        } else {
            hashCode = anVar.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        if (this.textMaxWidth) {
            i5 = 1231;
        }
        return i5 + i10;
    }

    @NotNull
    public String toString() {
        s sVar = this.modifier;
        String juliet = D6.juliet(this.overflow);
        boolean z2 = this.softWrap;
        int i4 = this.maxLines;
        Function1<ak, Unit> function1 = this.onTextLayout;
        an anVar = this.style;
        boolean z10 = this.textMaxWidth;
        StringBuilder sb2 = new StringBuilder("TextLabelViewStyle(modifier=");
        sb2.append(sVar);
        sb2.append(", overflow=");
        sb2.append(juliet);
        sb2.append(", softWrap=");
        sb2.append(z2);
        sb2.append(", maxLines=");
        sb2.append(i4);
        sb2.append(", onTextLayout=");
        sb2.append(function1);
        sb2.append(", style=");
        sb2.append(anVar);
        sb2.append(", textMaxWidth=");
        return c.romeo(sb2, z10, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextLabelViewStyle(s modifier, int i4, boolean z2, int i5, Function1<? super ak, Unit> onTextLayout, an anVar, boolean z10) {
        Intrinsics.echo(modifier, "modifier");
        Intrinsics.echo(onTextLayout, "onTextLayout");
        this.modifier = modifier;
        this.overflow = i4;
        this.softWrap = z2;
        this.maxLines = i5;
        this.onTextLayout = onTextLayout;
        this.style = anVar;
        this.textMaxWidth = z10;
    }

    public /* synthetic */ TextLabelViewStyle(s sVar, int i4, boolean z2, int i5, Function1 function1, an anVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? p.alpha : sVar, (i10 & 2) != 0 ? 1 : i4, (i10 & 4) == 0 ? z2 : true, (i10 & 8) != 0 ? LottieConstants.IterateForever : i5, (i10 & 16) != 0 ? new l(20) : function1, (i10 & 32) != 0 ? null : anVar, (i10 & 64) != 0 ? false : z10, null);
    }
}
