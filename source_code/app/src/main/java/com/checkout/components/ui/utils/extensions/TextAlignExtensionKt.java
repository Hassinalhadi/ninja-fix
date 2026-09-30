package com.checkout.components.ui.utils.extensions;

import com.checkout.components.ui.model.TextAlign;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/checkout/components/ui/model/TextAlign;", "LO0/k;", "toComposeTextAlign", "(Lcom/checkout/components/ui/model/TextAlign;)I", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextAlignExtensionKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextAlign.values().length];
            try {
                iArr[TextAlign.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextAlign.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextAlign.End.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toComposeTextAlign(@NotNull TextAlign textAlign) {
        Intrinsics.echo(textAlign, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[textAlign.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return 3;
            }
            if (i4 == 3) {
                return 6;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 5;
    }
}
