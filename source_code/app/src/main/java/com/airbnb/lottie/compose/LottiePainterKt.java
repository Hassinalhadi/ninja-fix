package com.airbnb.lottie.compose;

import Z.e;
import android.graphics.Typeface;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.RenderMode;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.AbstractC2372H;
import s6.AbstractC2627c7;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0099\u0001\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001e\u001a\u00020\u001b*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "", "progress", "", "outlineMasksAndMattes", "applyOpacityToLayers", "enableMergePaths", "Lcom/airbnb/lottie/RenderMode;", "renderMode", "maintainOriginalImageBounds", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "dynamicProperties", "clipToCompositionBounds", "clipTextToBoundingBox", "", "", "Landroid/graphics/Typeface;", "fontMap", "Lcom/airbnb/lottie/AsyncUpdates;", "asyncUpdates", "Lcom/airbnb/lottie/compose/LottiePainter;", "rememberLottiePainter", "(Lcom/airbnb/lottie/LottieComposition;FZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/m;III)Lcom/airbnb/lottie/compose/LottiePainter;", "LZ/e;", "Lq0/H;", "scale", "LQ0/m;", "times-UQTWf7w", "(JJ)J", "times", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottiePainterKt {
    @NotNull
    public static final LottiePainter rememberLottiePainter(@Nullable LottieComposition lottieComposition, float f5, boolean z2, boolean z10, boolean z11, @Nullable RenderMode renderMode, boolean z12, @Nullable LottieDynamicProperties lottieDynamicProperties, boolean z13, boolean z14, @Nullable Map<String, ? extends Typeface> map, @Nullable AsyncUpdates asyncUpdates, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5, int i10) {
        LottieComposition lottieComposition2;
        float f10;
        boolean z15;
        boolean z16;
        boolean z17;
        RenderMode renderMode2;
        boolean z18;
        LottieDynamicProperties lottieDynamicProperties2;
        boolean z19;
        boolean z20;
        AsyncUpdates asyncUpdates2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(-1760390310);
        Map<String, ? extends Typeface> map2 = null;
        if ((i10 & 1) != 0) {
            lottieComposition2 = null;
        } else {
            lottieComposition2 = lottieComposition;
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        } else {
            f10 = f5;
        }
        if ((i10 & 4) != 0) {
            z15 = false;
        } else {
            z15 = z2;
        }
        if ((i10 & 8) != 0) {
            z16 = false;
        } else {
            z16 = z10;
        }
        if ((i10 & 16) != 0) {
            z17 = false;
        } else {
            z17 = z11;
        }
        if ((i10 & 32) != 0) {
            renderMode2 = RenderMode.AUTOMATIC;
        } else {
            renderMode2 = renderMode;
        }
        if ((i10 & 64) != 0) {
            z18 = false;
        } else {
            z18 = z12;
        }
        if ((i10 & 128) != 0) {
            lottieDynamicProperties2 = null;
        } else {
            lottieDynamicProperties2 = lottieDynamicProperties;
        }
        if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
            z19 = true;
        } else {
            z19 = z13;
        }
        if ((i10 & 512) != 0) {
            z20 = false;
        } else {
            z20 = z14;
        }
        if ((i10 & Barcode.FORMAT_UPC_E) == 0) {
            map2 = map;
        }
        if ((i10 & 2048) != 0) {
            asyncUpdates2 = AsyncUpdates.AUTOMATIC;
        } else {
            asyncUpdates2 = asyncUpdates;
        }
        c0585q.red(1356844528);
        Object jade = c0585q.jade();
        if (jade == C0580l.alpha) {
            jade = new LottiePainter(null, 0.0f, false, false, false, null, false, null, false, false, null, null, 4095, null);
            c0585q.f(jade);
        }
        LottiePainter lottiePainter = (LottiePainter) jade;
        c0585q.quebec(false);
        lottiePainter.setComposition$lottie_compose_release(lottieComposition2);
        lottiePainter.setProgress$lottie_compose_release(f10);
        lottiePainter.setOutlineMasksAndMattes$lottie_compose_release(z15);
        lottiePainter.setApplyOpacityToLayers$lottie_compose_release(z16);
        lottiePainter.setEnableMergePaths$lottie_compose_release(z17);
        lottiePainter.setRenderMode$lottie_compose_release(renderMode2);
        lottiePainter.setMaintainOriginalImageBounds$lottie_compose_release(z18);
        lottiePainter.setDynamicProperties$lottie_compose_release(lottieDynamicProperties2);
        lottiePainter.setClipToCompositionBounds$lottie_compose_release(z19);
        lottiePainter.setClipTextToBoundingBox$lottie_compose_release(z20);
        lottiePainter.setFontMap$lottie_compose_release(map2);
        lottiePainter.setAsyncUpdates$lottie_compose_release(asyncUpdates2);
        c0585q.quebec(false);
        return lottiePainter;
    }

    /* renamed from: times-UQTWf7w, reason: not valid java name */
    private static final long m57timesUQTWf7w(long j5, long j6) {
        float delta = e.delta(j5);
        int i4 = AbstractC2372H.alpha;
        return AbstractC2627c7.alpha((int) (Float.intBitsToFloat((int) (j6 >> 32)) * delta), (int) (Float.intBitsToFloat((int) (j6 & 4294967295L)) * e.bravo(j5)));
    }
}
