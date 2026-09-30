package com.checkout.components.core.mapper;

import D0.an;
import H0.k;
import H0.r;
import H0.v;
import a0.ao;
import com.checkout.components.core.ui.model.ComponentColors;
import com.checkout.components.core.ui.model.ComposeStyle;
import com.checkout.components.core.utils.constants.TextLabelConstants;
import com.checkout.components.core.utils.extension.ComposeExtensionKt;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.ui.utils.extensions.Utils;
import kotlin.Metadata;
import m.AbstractC2094g;
import m.C2093f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2636d7;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/checkout/components/core/mapper/DesignTokensToCoreComposeStyleMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "Lcom/checkout/components/core/ui/model/ComposeStyle;", "<init>", "()V", "map", "from", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DesignTokensToCoreComposeStyleMapper implements Mapper<DesignTokens, ComposeStyle> {
    public static final int $stable = 0;

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public final ComposeStyle map(@Nullable DesignTokens from) {
        long delta;
        long delta2;
        C2093f bravo;
        ColorTokens colorTokens;
        ColorTokens colorTokens2;
        Utils utils = Utils.INSTANCE;
        Font subheadingFont = utils.subheadingFont(from);
        Font footnoteFont = utils.footnoteFont(from);
        long charlie = AbstractC2636d7.charlie(subheadingFont.getFontSize());
        int composeFontStyle = ComposeExtensionKt.toComposeFontStyle(subheadingFont.getFontStyle());
        v composeFontWeight = ComposeExtensionKt.toComposeFontWeight(subheadingFont.getFontWeight());
        k composeFontFamily = ComposeExtensionKt.toComposeFontFamily(subheadingFont.getFontFamily());
        Integer letterSpacing = subheadingFont.getLetterSpacing();
        long charlie2 = letterSpacing != null ? AbstractC2636d7.charlie(letterSpacing.intValue()) : TextLabelConstants.INSTANCE.m114getLetterSpacingXSAIIZE();
        Integer lineHeight = subheadingFont.getLineHeight();
        long charlie3 = lineHeight != null ? AbstractC2636d7.charlie(lineHeight.intValue()) : TextLabelConstants.INSTANCE.m115getLineHeightXSAIIZE();
        if (from != null && (colorTokens2 = from.getColorTokens()) != null) {
            delta = ao.delta(colorTokens2.getColorPrimary());
        } else {
            delta = ao.delta(4278190080L);
        }
        an anVar = new an(delta, charlie, composeFontWeight, new r(composeFontStyle), composeFontFamily, charlie2, 0, charlie3, 0, 16645968);
        long charlie4 = AbstractC2636d7.charlie(footnoteFont.getFontSize());
        int composeFontStyle2 = ComposeExtensionKt.toComposeFontStyle(footnoteFont.getFontStyle());
        v composeFontWeight2 = ComposeExtensionKt.toComposeFontWeight(footnoteFont.getFontWeight());
        k composeFontFamily2 = ComposeExtensionKt.toComposeFontFamily(footnoteFont.getFontFamily());
        Integer letterSpacing2 = footnoteFont.getLetterSpacing();
        long charlie5 = letterSpacing2 != null ? AbstractC2636d7.charlie(letterSpacing2.intValue()) : TextLabelConstants.INSTANCE.m114getLetterSpacingXSAIIZE();
        Integer lineHeight2 = footnoteFont.getLineHeight();
        long charlie6 = lineHeight2 != null ? AbstractC2636d7.charlie(lineHeight2.intValue()) : TextLabelConstants.INSTANCE.m115getLineHeightXSAIIZE();
        if (from != null && (colorTokens = from.getColorTokens()) != null) {
            delta2 = ao.delta(colorTokens.getColorSecondary());
        } else {
            delta2 = ao.delta(4285690482L);
        }
        an anVar2 = new an(delta2, charlie4, composeFontWeight2, new r(composeFontStyle2), composeFontFamily2, charlie5, 0, charlie6, 0, 16645968);
        if (from == null || (bravo = utils.toFormShape(from)) == null) {
            bravo = AbstractC2094g.bravo(0);
        }
        return new ComposeStyle(anVar, anVar2, bravo, new ComponentColors(ao.delta(utils.borderColor(from)), ao.delta(utils.primaryColor(from)), ao.delta(utils.actionColor(from)), ao.delta(utils.backgroundColor(from)), ao.delta(utils.successColor(from)), null));
    }
}
