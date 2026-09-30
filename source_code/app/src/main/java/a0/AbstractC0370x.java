package a0;

import android.graphics.ColorSpace;
import android.os.Build;
import b0.AbstractC0713c;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a0.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0370x {
    public static final ColorSpace alpha(AbstractC0713c abstractC0713c) {
        ColorSpace colorSpace;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        if (Intrinsics.areEqual(abstractC0713c, b0.d.echo)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.quebec)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.romeo)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.oscar)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.juliet)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.india)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.tango)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.sierra)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.kilo)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.lima)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.golf)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.hotel)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.foxtrot)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.mike)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.papa)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (Intrinsics.areEqual(abstractC0713c, b0.d.november)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        ColorSpace.Rgb.TransferParameters transferParameters = null;
        if (Build.VERSION.SDK_INT >= 34) {
            if (Intrinsics.areEqual(abstractC0713c, b0.d.victor)) {
                named2 = ColorSpace.Named.BT2020_HLG;
                colorSpace = ColorSpace.get(named2);
            } else if (Intrinsics.areEqual(abstractC0713c, b0.d.whiskey)) {
                named = ColorSpace.Named.BT2020_PQ;
                colorSpace = ColorSpace.get(named);
            } else {
                colorSpace = null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (abstractC0713c instanceof b0.q) {
            b0.q qVar = (b0.q) abstractC0713c;
            float[] alpha = qVar.delta.alpha();
            b0.r rVar = qVar.golf;
            if (rVar != null) {
                transferParameters = new ColorSpace.Rgb.TransferParameters(rVar.bravo, rVar.charlie, rVar.delta, rVar.echo, rVar.foxtrot, rVar.golf, rVar.alpha);
            }
            if (transferParameters != null) {
                return new ColorSpace.Rgb(abstractC0713c.alpha, qVar.hotel, alpha, transferParameters);
            }
            String str = abstractC0713c.alpha;
            final b0.p pVar = qVar.lima;
            final int i4 = 0;
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: a0.w
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d4) {
                    switch (i4) {
                        case 0:
                            return ((Number) ((b0.p) pVar).invoke(Double.valueOf(d4))).doubleValue();
                        default:
                            return ((Number) ((b0.p) pVar).invoke(Double.valueOf(d4))).doubleValue();
                    }
                }
            };
            final b0.p pVar2 = qVar.oscar;
            final int i5 = 1;
            return new ColorSpace.Rgb(str, qVar.hotel, alpha, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: a0.w
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d4) {
                    switch (i5) {
                        case 0:
                            return ((Number) ((b0.p) pVar2).invoke(Double.valueOf(d4))).doubleValue();
                        default:
                            return ((Number) ((b0.p) pVar2).invoke(Double.valueOf(d4))).doubleValue();
                    }
                }
            }, qVar.echo, qVar.foxtrot);
        }
        return ColorSpace.get(ColorSpace.Named.SRGB);
    }
}
