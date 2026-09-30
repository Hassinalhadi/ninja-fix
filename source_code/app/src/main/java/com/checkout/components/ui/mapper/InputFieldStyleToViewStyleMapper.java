package com.checkout.components.ui.mapper;

import D0.an;
import Jc.i;
import P.d;
import Xd.l;
import a0.C0366t;
import a0.ao;
import a0.as;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.InputFieldColors;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.CursorStyle;
import com.checkout.components.ui.model.style.base.InputFieldBorderStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.base.TextStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.ShapeExtensionsKt;
import com.checkout.components.ui.utils.extensions.TextStyleExtensionsKt;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!¨\u0006\""}, d2 = {"Lcom/checkout/components/ui/mapper/InputFieldStyleToViewStyleMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "textLabelStyleMapper", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;)V", "", Constants.KEY_TEXT, "", "textId", "Lcom/checkout/components/ui/model/style/base/TextStyle;", "textStyle", "", "isPreparingLabel", "Lkotlin/Function0;", "", "provideTextLabel", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/checkout/components/ui/model/style/base/TextStyle;Z)LXd/l;", "Lcom/checkout/components/ui/model/style/base/InputFieldBorderStyle;", "borderStyle", "La0/as;", "provideBorderShape", "(Lcom/checkout/components/ui/model/style/base/InputFieldBorderStyle;)La0/as;", "style", "Lcom/checkout/components/ui/model/InputFieldColors;", "provideColors", "(Lcom/checkout/components/ui/model/style/base/InputFieldStyle;)Lcom/checkout/components/ui/model/InputFieldColors;", "from", "map", "(Lcom/checkout/components/ui/model/style/base/InputFieldStyle;)Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputFieldStyleToViewStyleMapper implements Mapper<InputFieldStyle, InputFieldViewStyle> {
    public static final int $stable = 8;

    @NotNull
    private final Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper;

    public InputFieldStyleToViewStyleMapper(@NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper) {
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        this.textLabelStyleMapper = textLabelStyleMapper;
    }

    private final as provideBorderShape(InputFieldBorderStyle borderStyle) {
        return ShapeExtensionsKt.toComposeShape(borderStyle.getShape(), borderStyle.getBorderRadius());
    }

    private final InputFieldColors provideColors(InputFieldStyle style) {
        long j5;
        long j6;
        C0366t c0366t;
        C0366t c0366t2;
        C0366t c0366t3;
        C0366t c0366t4;
        long delta = ao.delta(style.getTextStyle().getColor());
        long delta2 = ao.delta(style.getPlaceholderStyle().getColor());
        long delta3 = ao.delta(style.getBorderStyle().getFocusedBorderColor());
        long delta4 = ao.delta(style.getLabelTextStyle().getColor());
        long delta5 = ao.delta(style.getLabelTextStyle().getColor());
        long delta6 = ao.delta(style.getBorderStyle().getFocusedBorderColor());
        long delta7 = ao.delta(style.getBorderStyle().getUnfocusedBorderColor());
        long delta8 = ao.delta(style.getBorderStyle().getDisabledBorderColor());
        long delta9 = ao.delta(style.getBorderStyle().getErrorBorderColor());
        CursorStyle cursorStyle = style.getCursorStyle();
        if (cursorStyle != null) {
            j6 = delta9;
            j5 = delta7;
            c0366t = new C0366t(ao.delta(cursorStyle.getCursorColor()));
        } else {
            j5 = delta7;
            j6 = delta9;
            c0366t = null;
        }
        CursorStyle cursorStyle2 = style.getCursorStyle();
        if (cursorStyle2 != null) {
            c0366t2 = new C0366t(ao.delta(cursorStyle2.getErrorCursorColor()));
        } else {
            c0366t2 = null;
        }
        CursorStyle cursorStyle3 = style.getCursorStyle();
        if (cursorStyle3 != null) {
            c0366t3 = new C0366t(ao.delta(cursorStyle3.getCursorHandleColor()));
        } else {
            c0366t3 = null;
        }
        CursorStyle cursorStyle4 = style.getCursorStyle();
        if (cursorStyle4 != null) {
            c0366t4 = new C0366t(ao.delta(cursorStyle4.getCursorHighlightColor()));
        } else {
            c0366t4 = null;
        }
        return new InputFieldColors(new C0366t(delta), new C0366t(delta2), new C0366t(delta3), new C0366t(delta4), new C0366t(delta5), new C0366t(delta6), new C0366t(j5), new C0366t(delta8), new C0366t(j6), ao.delta(style.getContainerColor()), c0366t, c0366t2, c0366t3, c0366t4, null);
    }

    private final l provideTextLabel(String text, Integer textId, TextStyle textStyle, boolean isPreparingLabel) {
        return new d(new i(text, textId, textStyle, isPreparingLabel, this), -1337999486, true);
    }

    public static /* synthetic */ l provideTextLabel$default(InputFieldStyleToViewStyleMapper inputFieldStyleToViewStyleMapper, String str, Integer num, TextStyle textStyle, boolean z2, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z2 = false;
        }
        return inputFieldStyleToViewStyleMapper.provideTextLabel(str, num, textStyle, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideTextLabel$lambda$1(String str, Integer num, TextStyle textStyle, boolean z2, InputFieldStyleToViewStyleMapper inputFieldStyleToViewStyleMapper, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z10;
        if ((i4 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z10)) {
            TextLabelViewKt.TextLabelView(inputFieldStyleToViewStyleMapper.textLabelStyleMapper.map(new TextLabelStyle(str, num, textStyle, z2)), new TextLabelState(C0564b.zulu(str), C0564b.zulu(num), C0564b.zulu(Boolean.TRUE)), c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public InputFieldViewStyle map(@NotNull InputFieldStyle from) {
        Intrinsics.echo(from, "from");
        boolean enabled = from.getEnabled();
        an composeTextStyle$default = TextStyleExtensionsKt.toComposeTextStyle$default(from.getTextStyle(), false, 1, null);
        int maxLines = from.getTextStyle().getMaxLines();
        return new InputFieldViewStyle(null, enabled, false, composeTextStyle$default, provideTextLabel(from.getLabelText(), from.getLabelTextId(), from.getLabelTextStyle(), true), provideTextLabel$default(this, from.getPlaceholderText(), from.getPlaceholderTextId(), from.getPlaceholderStyle(), false, 8, null), null, from.getKeyboardOptions(), null, false, maxLines, 0, null, provideBorderShape(from.getBorderStyle()), provideColors(from), 6981, null);
    }
}
