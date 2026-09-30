package com.checkout.components.ui.utils;

import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.interfaces.uicustomisation.font.FontName;
import com.checkout.components.interfaces.uicustomisation.font.FontWeight;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.style.DefaultStyle;
import com.checkout.components.ui.utils.extensions.Utils;
import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;", "", "designTokens", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "<init>", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)V", "viewStyle", "Lcom/checkout/components/ui/model/TopAppBarViewStyle;", Constants.KEY_TITLE, "", "textStyle", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", Constants.KEY_TEXT, "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenHeaderStyleUtils {
    public static final int $stable = DesignTokens.$stable;

    @Nullable
    private final DesignTokens designTokens;

    public ScreenHeaderStyleUtils(@Nullable DesignTokens designTokens) {
        this.designTokens = designTokens;
    }

    private final TextLabelStyle textStyle(String text) {
        Font font;
        Map<FontName, Font> fonts;
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        DesignTokens designTokens = this.designTokens;
        if (designTokens != null && (fonts = designTokens.getFonts()) != null) {
            font = fonts.get(FontName.Heading);
        } else {
            font = null;
        }
        return DefaultStyle.textLabelStyle$default(defaultStyle, text, null, Utils.INSTANCE.primaryColor(this.designTokens), font, 28, FontWeight.SemiBold, null, null, 194, null);
    }

    @NotNull
    public final TopAppBarViewStyle viewStyle(@NotNull String title) {
        Intrinsics.echo(title, "title");
        TextLabelStyle textStyle = textStyle(title);
        Utils utils = Utils.INSTANCE;
        return new TopAppBarViewStyle(textStyle, utils.backgroundColor(this.designTokens), utils.backgroundColor(this.designTokens), utils.primaryColor(this.designTokens), utils.primaryColor(this.designTokens));
    }
}
