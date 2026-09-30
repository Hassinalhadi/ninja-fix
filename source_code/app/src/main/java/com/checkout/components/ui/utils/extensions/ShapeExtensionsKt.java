package com.checkout.components.ui.utils.extensions;

import a0.ao;
import a0.as;
import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.ui.model.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2088a;
import m.AbstractC2094g;
import m.C2091d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/ui/model/Shape;", "Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "borderRadius", "La0/as;", "toComposeShape", "(Lcom/checkout/components/ui/model/Shape;Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;)La0/as;", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShapeExtensionsKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Shape.values().length];
            try {
                iArr[Shape.Circle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shape.RoundCorner.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shape.CutCorner.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final as toComposeShape(@NotNull Shape shape, @NotNull BorderRadius borderRadius) {
        Intrinsics.echo(shape, "<this>");
        Intrinsics.echo(borderRadius, "borderRadius");
        int i4 = WhenMappings.$EnumSwitchMapping$0[shape.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    return ao.alpha;
                }
                return new AbstractC2088a(new C2091d(borderRadius.getTopStart()), new C2091d(borderRadius.getTopEnd()), new C2091d(borderRadius.getBottomEnd()), new C2091d(borderRadius.getBottomStart()));
            }
            return AbstractC2094g.charlie(borderRadius.getTopStart(), borderRadius.getTopEnd(), borderRadius.getBottomEnd(), borderRadius.getBottomStart());
        }
        return AbstractC2094g.alpha;
    }
}
