package com.checkout.components.ui.model.style.view;

import D0.an;
import I0.ai;
import I0.aj;
import T.p;
import T.s;
import Xd.l;
import a0.as;
import androidx.compose.foundation.layout.V;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import com.checkout.components.ui.model.InputFieldColors;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n.av;
import n.aw;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0010\u00100\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b7\u00108J¾\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b>\u00101J\u001a\u0010@\u001a\u00020\u00042\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bF\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bH\u0010%R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010'R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bK\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bM\u0010*R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\bO\u0010,R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bQ\u0010.R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bR\u0010\"R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bT\u00101R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\bU\u00101R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010V\u001a\u0004\bW\u00104R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010X\u001a\u0004\bY\u00106R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010Z\u001a\u0004\b[\u00108¨\u0006\\"}, d2 = {"Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "", "LT/s;", "modifier", "", "enabled", "readOnly", "LD0/an;", "textStyle", "Lkotlin/Function0;", "", "label", "placeholder", "LI0/aj;", "visualTransformation", "Ln/aw;", "keyboardOptions", "Ln/av;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Lf/j;", "interactionSource", "La0/as;", "borderShape", "Lcom/checkout/components/ui/model/InputFieldColors;", "colors", "<init>", "(LT/s;ZZLD0/an;LXd/l;LXd/l;LI0/aj;Ln/aw;Ln/av;ZIILf/j;La0/as;Lcom/checkout/components/ui/model/InputFieldColors;)V", "component1", "()LT/s;", "component2", "()Z", "component3", "component4", "()LD0/an;", "component5", "()LXd/l;", "component6", "component7", "()LI0/aj;", "component8", "()Ln/aw;", "component9", "()Ln/av;", "component10", "component11", "()I", "component12", "component13", "()Lf/j;", "component14", "()La0/as;", "component15", "()Lcom/checkout/components/ui/model/InputFieldColors;", Constants.COPY_TYPE, "(LT/s;ZZLD0/an;LXd/l;LXd/l;LI0/aj;Ln/aw;Ln/av;ZIILf/j;La0/as;Lcom/checkout/components/ui/model/InputFieldColors;)Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "LT/s;", "getModifier", "Z", "getEnabled", "getReadOnly", "LD0/an;", "getTextStyle", "LXd/l;", "getLabel", "getPlaceholder", "LI0/aj;", "getVisualTransformation", "Ln/aw;", "getKeyboardOptions", "Ln/av;", "getKeyboardActions", "getSingleLine", "I", "getMaxLines", "getMinLines", "Lf/j;", "getInteractionSource", "La0/as;", "getBorderShape", "Lcom/checkout/components/ui/model/InputFieldColors;", "getColors", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputFieldViewStyle {
    public static final int $stable = 0;

    @Nullable
    private final as borderShape;

    @Nullable
    private final InputFieldColors colors;
    private final boolean enabled;

    @Nullable
    private final InterfaceC1673j interactionSource;

    @NotNull
    private final av keyboardActions;

    @NotNull
    private final aw keyboardOptions;

    @Nullable
    private final l label;
    private final int maxLines;
    private final int minLines;

    @NotNull
    private final s modifier;

    @Nullable
    private final l placeholder;
    private final boolean readOnly;
    private final boolean singleLine;

    @Nullable
    private final an textStyle;

    @NotNull
    private final aj visualTransformation;

    public InputFieldViewStyle() {
        this(null, false, false, null, null, null, null, null, null, false, 0, 0, null, null, null, 32767, null);
    }

    public static /* synthetic */ InputFieldViewStyle copy$default(InputFieldViewStyle inputFieldViewStyle, s sVar, boolean z2, boolean z10, an anVar, l lVar, l lVar2, aj ajVar, aw awVar, av avVar, boolean z11, int i4, int i5, InterfaceC1673j interfaceC1673j, as asVar, InputFieldColors inputFieldColors, int i10, Object obj) {
        s sVar2;
        boolean z12;
        boolean z13;
        an anVar2;
        l lVar3;
        l lVar4;
        aj ajVar2;
        aw awVar2;
        av avVar2;
        boolean z14;
        int i11;
        int i12;
        InterfaceC1673j interfaceC1673j2;
        as asVar2;
        InputFieldColors inputFieldColors2;
        if ((i10 & 1) != 0) {
            sVar2 = inputFieldViewStyle.modifier;
        } else {
            sVar2 = sVar;
        }
        if ((i10 & 2) != 0) {
            z12 = inputFieldViewStyle.enabled;
        } else {
            z12 = z2;
        }
        if ((i10 & 4) != 0) {
            z13 = inputFieldViewStyle.readOnly;
        } else {
            z13 = z10;
        }
        if ((i10 & 8) != 0) {
            anVar2 = inputFieldViewStyle.textStyle;
        } else {
            anVar2 = anVar;
        }
        if ((i10 & 16) != 0) {
            lVar3 = inputFieldViewStyle.label;
        } else {
            lVar3 = lVar;
        }
        if ((i10 & 32) != 0) {
            lVar4 = inputFieldViewStyle.placeholder;
        } else {
            lVar4 = lVar2;
        }
        if ((i10 & 64) != 0) {
            ajVar2 = inputFieldViewStyle.visualTransformation;
        } else {
            ajVar2 = ajVar;
        }
        if ((i10 & 128) != 0) {
            awVar2 = inputFieldViewStyle.keyboardOptions;
        } else {
            awVar2 = awVar;
        }
        if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
            avVar2 = inputFieldViewStyle.keyboardActions;
        } else {
            avVar2 = avVar;
        }
        if ((i10 & 512) != 0) {
            z14 = inputFieldViewStyle.singleLine;
        } else {
            z14 = z11;
        }
        if ((i10 & Barcode.FORMAT_UPC_E) != 0) {
            i11 = inputFieldViewStyle.maxLines;
        } else {
            i11 = i4;
        }
        if ((i10 & 2048) != 0) {
            i12 = inputFieldViewStyle.minLines;
        } else {
            i12 = i5;
        }
        if ((i10 & 4096) != 0) {
            interfaceC1673j2 = inputFieldViewStyle.interactionSource;
        } else {
            interfaceC1673j2 = interfaceC1673j;
        }
        if ((i10 & 8192) != 0) {
            asVar2 = inputFieldViewStyle.borderShape;
        } else {
            asVar2 = asVar;
        }
        if ((i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            inputFieldColors2 = inputFieldViewStyle.colors;
        } else {
            inputFieldColors2 = inputFieldColors;
        }
        return inputFieldViewStyle.copy(sVar2, z12, z13, anVar2, lVar3, lVar4, ajVar2, awVar2, avVar2, z14, i11, i12, interfaceC1673j2, asVar2, inputFieldColors2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final s getModifier() {
        return this.modifier;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    /* renamed from: component11, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component12, reason: from getter */
    public final int getMinLines() {
        return this.minLines;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final InterfaceC1673j getInteractionSource() {
        return this.interactionSource;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final as getBorderShape() {
        return this.borderShape;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final InputFieldColors getColors() {
        return this.colors;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final an getTextStyle() {
        return this.textStyle;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final l getLabel() {
        return this.label;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final l getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final aj getVisualTransformation() {
        return this.visualTransformation;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final aw getKeyboardOptions() {
        return this.keyboardOptions;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final av getKeyboardActions() {
        return this.keyboardActions;
    }

    @NotNull
    public final InputFieldViewStyle copy(@NotNull s modifier, boolean enabled, boolean readOnly, @Nullable an textStyle, @Nullable l label, @Nullable l placeholder, @NotNull aj visualTransformation, @NotNull aw keyboardOptions, @NotNull av keyboardActions, boolean singleLine, int maxLines, int minLines, @Nullable InterfaceC1673j interactionSource, @Nullable as borderShape, @Nullable InputFieldColors colors) {
        Intrinsics.echo(modifier, "modifier");
        Intrinsics.echo(visualTransformation, "visualTransformation");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        Intrinsics.echo(keyboardActions, "keyboardActions");
        return new InputFieldViewStyle(modifier, enabled, readOnly, textStyle, label, placeholder, visualTransformation, keyboardOptions, keyboardActions, singleLine, maxLines, minLines, interactionSource, borderShape, colors);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFieldViewStyle)) {
            return false;
        }
        InputFieldViewStyle inputFieldViewStyle = (InputFieldViewStyle) other;
        return Intrinsics.areEqual(this.modifier, inputFieldViewStyle.modifier) && this.enabled == inputFieldViewStyle.enabled && this.readOnly == inputFieldViewStyle.readOnly && Intrinsics.areEqual(this.textStyle, inputFieldViewStyle.textStyle) && Intrinsics.areEqual(this.label, inputFieldViewStyle.label) && Intrinsics.areEqual(this.placeholder, inputFieldViewStyle.placeholder) && Intrinsics.areEqual(this.visualTransformation, inputFieldViewStyle.visualTransformation) && Intrinsics.areEqual(this.keyboardOptions, inputFieldViewStyle.keyboardOptions) && Intrinsics.areEqual(this.keyboardActions, inputFieldViewStyle.keyboardActions) && this.singleLine == inputFieldViewStyle.singleLine && this.maxLines == inputFieldViewStyle.maxLines && this.minLines == inputFieldViewStyle.minLines && Intrinsics.areEqual(this.interactionSource, inputFieldViewStyle.interactionSource) && Intrinsics.areEqual(this.borderShape, inputFieldViewStyle.borderShape) && Intrinsics.areEqual(this.colors, inputFieldViewStyle.colors);
    }

    @Nullable
    public final as getBorderShape() {
        return this.borderShape;
    }

    @Nullable
    public final InputFieldColors getColors() {
        return this.colors;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final InterfaceC1673j getInteractionSource() {
        return this.interactionSource;
    }

    @NotNull
    public final av getKeyboardActions() {
        return this.keyboardActions;
    }

    @NotNull
    public final aw getKeyboardOptions() {
        return this.keyboardOptions;
    }

    @Nullable
    public final l getLabel() {
        return this.label;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinLines() {
        return this.minLines;
    }

    @NotNull
    public final s getModifier() {
        return this.modifier;
    }

    @Nullable
    public final l getPlaceholder() {
        return this.placeholder;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @Nullable
    public final an getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    public final aj getVisualTransformation() {
        return this.visualTransformation;
    }

    public int hashCode() {
        int i4;
        int i5;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.modifier.hashCode() * 31;
        int i10 = 1237;
        if (this.enabled) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = (i4 + hashCode6) * 31;
        if (this.readOnly) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i12 = (i5 + i11) * 31;
        an anVar = this.textStyle;
        int i13 = 0;
        if (anVar == null) {
            hashCode = 0;
        } else {
            hashCode = anVar.hashCode();
        }
        int i14 = (i12 + hashCode) * 31;
        l lVar = this.label;
        if (lVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = lVar.hashCode();
        }
        int i15 = (i14 + hashCode2) * 31;
        l lVar2 = this.placeholder;
        if (lVar2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar2.hashCode();
        }
        int hashCode7 = (this.keyboardActions.hashCode() + ((this.keyboardOptions.hashCode() + ((this.visualTransformation.hashCode() + ((i15 + hashCode3) * 31)) * 31)) * 31)) * 31;
        if (this.singleLine) {
            i10 = 1231;
        }
        int i16 = (this.minLines + ((this.maxLines + ((i10 + hashCode7) * 31)) * 31)) * 31;
        InterfaceC1673j interfaceC1673j = this.interactionSource;
        if (interfaceC1673j == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = interfaceC1673j.hashCode();
        }
        int i17 = (i16 + hashCode4) * 31;
        as asVar = this.borderShape;
        if (asVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = asVar.hashCode();
        }
        int i18 = (i17 + hashCode5) * 31;
        InputFieldColors inputFieldColors = this.colors;
        if (inputFieldColors != null) {
            i13 = inputFieldColors.hashCode();
        }
        return i18 + i13;
    }

    @NotNull
    public String toString() {
        return "InputFieldViewStyle(modifier=" + this.modifier + ", enabled=" + this.enabled + ", readOnly=" + this.readOnly + ", textStyle=" + this.textStyle + ", label=" + this.label + ", placeholder=" + this.placeholder + ", visualTransformation=" + this.visualTransformation + ", keyboardOptions=" + this.keyboardOptions + ", keyboardActions=" + this.keyboardActions + ", singleLine=" + this.singleLine + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", interactionSource=" + this.interactionSource + ", borderShape=" + this.borderShape + ", colors=" + this.colors + ")";
    }

    public InputFieldViewStyle(@NotNull s modifier, boolean z2, boolean z10, @Nullable an anVar, @Nullable l lVar, @Nullable l lVar2, @NotNull aj visualTransformation, @NotNull aw keyboardOptions, @NotNull av keyboardActions, boolean z11, int i4, int i5, @Nullable InterfaceC1673j interfaceC1673j, @Nullable as asVar, @Nullable InputFieldColors inputFieldColors) {
        Intrinsics.echo(modifier, "modifier");
        Intrinsics.echo(visualTransformation, "visualTransformation");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        Intrinsics.echo(keyboardActions, "keyboardActions");
        this.modifier = modifier;
        this.enabled = z2;
        this.readOnly = z10;
        this.textStyle = anVar;
        this.label = lVar;
        this.placeholder = lVar2;
        this.visualTransformation = visualTransformation;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActions = keyboardActions;
        this.singleLine = z11;
        this.maxLines = i4;
        this.minLines = i5;
        this.interactionSource = interfaceC1673j;
        this.borderShape = asVar;
        this.colors = inputFieldColors;
    }

    public InputFieldViewStyle(s sVar, boolean z2, boolean z10, an anVar, l lVar, l lVar2, aj ajVar, aw awVar, av avVar, boolean z11, int i4, int i5, InterfaceC1673j interfaceC1673j, as asVar, InputFieldColors inputFieldColors, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? V.charlie(p.alpha, 1.0f) : sVar, (i10 & 2) != 0 ? true : z2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : anVar, (i10 & 16) != 0 ? null : lVar, (i10 & 32) != 0 ? null : lVar2, (i10 & 64) != 0 ? ai.alpha : ajVar, (i10 & 128) != 0 ? aw.delta : awVar, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? av.bravo : avVar, (i10 & 512) == 0 ? z11 : true, (i10 & Barcode.FORMAT_UPC_E) != 0 ? LottieConstants.IterateForever : i4, (i10 & 2048) != 0 ? RecyclerView.UNDEFINED_DURATION : i5, (i10 & 4096) != 0 ? null : interfaceC1673j, (i10 & 8192) != 0 ? null : asVar, (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : inputFieldColors);
    }
}
