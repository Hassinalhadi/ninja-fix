package androidx.compose.ui.graphics;

import T.s;
import a0.AbstractC0343ac;
import a0.ao;
import a0.as;
import a0.aw;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class a {
    public static final s alpha(s sVar, Function1 function1) {
        return sVar.then(new BlockGraphicsLayerElement(function1));
    }

    public static s bravo(s sVar, float f5, float f10, float f11, float f12, as asVar, int i4) {
        float f13;
        float f14;
        float f15;
        float f16;
        as asVar2;
        if ((i4 & 1) != 0) {
            f13 = 1.0f;
        } else {
            f13 = f5;
        }
        if ((i4 & 2) != 0) {
            f14 = 1.0f;
        } else {
            f14 = f10;
        }
        if ((i4 & 4) != 0) {
            f15 = 1.0f;
        } else {
            f15 = f11;
        }
        if ((i4 & 32) != 0) {
            f16 = 0.0f;
        } else {
            f16 = f12;
        }
        long j5 = aw.bravo;
        if ((i4 & 2048) != 0) {
            asVar2 = ao.alpha;
        } else {
            asVar2 = asVar;
        }
        long j6 = AbstractC0343ac.alpha;
        return sVar.then(new GraphicsLayerElement(f13, f14, f15, f16, 0.0f, j5, asVar2, false, j6, j6, 0));
    }

    public static s charlie(s sVar, float f5, float f10, float f11, as asVar, int i4) {
        float f12;
        float f13;
        float f14;
        as asVar2;
        boolean z2;
        int i5;
        if ((i4 & 1) != 0) {
            f12 = 1.0f;
        } else {
            f12 = f5;
        }
        if ((i4 & 4) != 0) {
            f13 = 1.0f;
        } else {
            f13 = f10;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            f14 = 0.0f;
        } else {
            f14 = f11;
        }
        long j5 = aw.bravo;
        if ((i4 & 2048) != 0) {
            asVar2 = ao.alpha;
        } else {
            asVar2 = asVar;
        }
        if ((i4 & 4096) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        long j6 = AbstractC0343ac.alpha;
        if ((i4 & 65536) != 0) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        return sVar.then(new GraphicsLayerElement(f12, 1.0f, f13, 0.0f, f14, j5, asVar2, z2, j6, j6, i5));
    }
}
