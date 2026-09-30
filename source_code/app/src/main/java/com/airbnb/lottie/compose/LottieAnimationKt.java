package com.airbnb.lottie.compose;

import T.d;
import T.f;
import T.p;
import T.s;
import Xd.l;
import Z.e;
import Zd.a;
import a0.AbstractC0349c;
import a0.InterfaceC0364r;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.model.Marker;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.AbstractC2372H;
import q0.C2391j;
import q0.InterfaceC2392k;
import s6.AbstractC2627c7;
import t6.M2;
import t6.T3;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÍ\u0001\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a§\u0001\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010!\u001aý\u0001\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010*\u001aÃ\u0001\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010+\u001a\u001f\u00102\u001a\u00020/*\u00020,2\u0006\u0010.\u001a\u00020-H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064²\u0006\u0010\u00103\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "Lkotlin/Function0;", "", "progress", "LT/s;", "modifier", "", "outlineMasksAndMattes", "applyOpacityToLayers", "applyShadowToLayers", "enableMergePaths", "Lcom/airbnb/lottie/RenderMode;", "renderMode", "maintainOriginalImageBounds", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "dynamicProperties", "LT/f;", "alignment", "Lq0/k;", "contentScale", "clipToCompositionBounds", "clipTextToBoundingBox", "", "", "Landroid/graphics/Typeface;", "fontMap", "Lcom/airbnb/lottie/AsyncUpdates;", "asyncUpdates", "safeMode", "", "LottieAnimation", "(Lcom/airbnb/lottie/LottieComposition;Lkotlin/jvm/functions/Function0;LT/s;ZZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;LT/f;Lq0/k;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;ZLandroidx/compose/runtime/m;III)V", "(Lcom/airbnb/lottie/LottieComposition;FLT/s;ZZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;LT/f;Lq0/k;ZZLcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/m;III)V", "isPlaying", "restartOnPlay", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "speed", "", "iterations", "reverseOnRepeat", "(Lcom/airbnb/lottie/LottieComposition;LT/s;ZZLcom/airbnb/lottie/compose/LottieClipSpec;FIZZZZLcom/airbnb/lottie/RenderMode;ZZLcom/airbnb/lottie/compose/LottieDynamicProperties;LT/f;Lq0/k;ZZLjava/util/Map;ZLcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/m;IIII)V", "(Lcom/airbnb/lottie/LottieComposition;Lkotlin/jvm/functions/Function0;LT/s;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;LT/f;Lq0/k;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;ZLandroidx/compose/runtime/m;III)V", "LZ/e;", "Lq0/H;", "scale", "LQ0/m;", "times-UQTWf7w", "(JJ)J", "times", "setDynamicProperties", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimationKt {
    public static final void LottieAnimation(@Nullable final LottieComposition lottieComposition, @NotNull final Function0<Float> progress, @Nullable s sVar, boolean z2, boolean z10, boolean z11, boolean z12, @Nullable RenderMode renderMode, boolean z13, @Nullable LottieDynamicProperties lottieDynamicProperties, @Nullable f fVar, @Nullable InterfaceC2392k interfaceC2392k, boolean z14, boolean z15, @Nullable Map<String, ? extends Typeface> map, @Nullable AsyncUpdates asyncUpdates, boolean z16, @Nullable InterfaceC0581m interfaceC0581m, final int i4, final int i5, final int i10) {
        Intrinsics.echo(progress, "progress");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(382909894);
        s sVar2 = (i10 & 4) != 0 ? p.alpha : sVar;
        final boolean z17 = (i10 & 8) != 0 ? false : z2;
        final boolean z18 = (i10 & 16) != 0 ? false : z10;
        final boolean z19 = (i10 & 32) != 0 ? true : z11;
        final boolean z20 = (i10 & 64) != 0 ? false : z12;
        RenderMode renderMode2 = (i10 & 128) != 0 ? RenderMode.AUTOMATIC : renderMode;
        final boolean z21 = (i10 & Barcode.FORMAT_QR_CODE) != 0 ? false : z13;
        final LottieDynamicProperties lottieDynamicProperties2 = (i10 & 512) != 0 ? null : lottieDynamicProperties;
        f fVar2 = (i10 & Barcode.FORMAT_UPC_E) != 0 ? d.teal : fVar;
        InterfaceC2392k interfaceC2392k2 = (i10 & 2048) != 0 ? C2391j.bravo : interfaceC2392k;
        final boolean z22 = (i10 & 4096) != 0 ? true : z14;
        final boolean z23 = (i10 & 8192) != 0 ? false : z15;
        Map<String, ? extends Typeface> map2 = (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (i10 & 32768) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        boolean z24 = (i10 & 65536) != 0 ? false : z16;
        c0585q.red(185152185);
        Object jade = c0585q.jade();
        as asVar = C0580l.alpha;
        if (jade == asVar) {
            jade = new LottieDrawable();
            c0585q.f(jade);
        }
        final LottieDrawable lottieDrawable = (LottieDrawable) jade;
        c0585q.quebec(false);
        c0585q.red(185152232);
        Object jade2 = c0585q.jade();
        if (jade2 == asVar) {
            jade2 = new Matrix();
            c0585q.f(jade2);
        }
        final Matrix matrix = (Matrix) jade2;
        c0585q.quebec(false);
        c0585q.red(185152312);
        boolean golf = c0585q.golf(lottieComposition);
        Object jade3 = c0585q.jade();
        if (golf || jade3 == asVar) {
            jade3 = C0564b.zulu(null);
            c0585q.f(jade3);
        }
        final ax axVar = (ax) jade3;
        c0585q.quebec(false);
        c0585q.red(185152364);
        if (lottieComposition != null && lottieComposition.getDuration() != 0.0f) {
            c0585q.quebec(false);
            final Rect bounds = lottieComposition.getBounds();
            final Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            s lottieSize = LottieAnimationSizeNodeKt.lottieSize(sVar2, bounds.width(), bounds.height());
            final s sVar3 = sVar2;
            final InterfaceC2392k interfaceC2392k3 = interfaceC2392k2;
            final boolean z25 = z18;
            final Map<String, ? extends Typeface> map3 = map2;
            final RenderMode renderMode3 = renderMode2;
            final AsyncUpdates asyncUpdates3 = asyncUpdates2;
            final boolean z26 = z20;
            final boolean z27 = z24;
            final f fVar3 = fVar2;
            final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
            Function1<c0.d, Unit> function1 = new Function1<c0.d, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(c0.d dVar) {
                    invoke2(dVar);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull c0.d Canvas) {
                    long m13timesUQTWf7w;
                    LottieDynamicProperties LottieAnimation$lambda$3;
                    LottieDynamicProperties LottieAnimation$lambda$32;
                    Intrinsics.echo(Canvas, "$this$Canvas");
                    Rect rect = bounds;
                    InterfaceC2392k interfaceC2392k4 = interfaceC2392k3;
                    f fVar4 = fVar3;
                    Matrix matrix2 = matrix;
                    LottieDrawable lottieDrawable2 = lottieDrawable;
                    boolean z28 = z26;
                    boolean z29 = z27;
                    RenderMode renderMode4 = renderMode3;
                    AsyncUpdates asyncUpdates4 = asyncUpdates3;
                    LottieComposition lottieComposition2 = lottieComposition;
                    Map<String, Typeface> map4 = map3;
                    LottieDynamicProperties lottieDynamicProperties4 = lottieDynamicProperties3;
                    boolean z30 = z17;
                    boolean z31 = z25;
                    boolean z32 = z19;
                    boolean z33 = z21;
                    boolean z34 = z22;
                    boolean z35 = z23;
                    Context context2 = context;
                    Function0<Float> function0 = progress;
                    ax axVar2 = axVar;
                    InterfaceC0364r mike = Canvas.lime().mike();
                    long alpha = M2.alpha(rect.width(), rect.height());
                    long alpha2 = AbstractC2627c7.alpha(a.delta(e.delta(Canvas.bravo())), a.delta(e.bravo(Canvas.bravo())));
                    long alpha3 = interfaceC2392k4.alpha(alpha, Canvas.bravo());
                    m13timesUQTWf7w = LottieAnimationKt.m13timesUQTWf7w(alpha, alpha3);
                    long alpha4 = fVar4.alpha(m13timesUQTWf7w, alpha2, Canvas.getLayoutDirection());
                    matrix2.reset();
                    matrix2.preTranslate((int) (alpha4 >> 32), (int) (alpha4 & 4294967295L));
                    int i11 = AbstractC2372H.alpha;
                    matrix2.preScale(Float.intBitsToFloat((int) (alpha3 >> 32)), Float.intBitsToFloat((int) (alpha3 & 4294967295L)));
                    lottieDrawable2.enableFeatureFlag(LottieFeatureFlag.MergePathsApi19, z28);
                    lottieDrawable2.setSafeMode(z29);
                    lottieDrawable2.setRenderMode(renderMode4);
                    lottieDrawable2.setAsyncUpdates(asyncUpdates4);
                    lottieDrawable2.setComposition(lottieComposition2);
                    lottieDrawable2.setFontMap(map4);
                    LottieAnimation$lambda$3 = LottieAnimationKt.LottieAnimation$lambda$3(axVar2);
                    if (lottieDynamicProperties4 != LottieAnimation$lambda$3) {
                        LottieAnimation$lambda$32 = LottieAnimationKt.LottieAnimation$lambda$3(axVar2);
                        if (LottieAnimation$lambda$32 != null) {
                            LottieAnimation$lambda$32.removeFrom$lottie_compose_release(lottieDrawable2);
                        }
                        if (lottieDynamicProperties4 != null) {
                            lottieDynamicProperties4.addTo$lottie_compose_release(lottieDrawable2);
                        }
                        axVar2.setValue(lottieDynamicProperties4);
                    }
                    lottieDrawable2.setOutlineMasksAndMattes(z30);
                    lottieDrawable2.setApplyingOpacityToLayersEnabled(z31);
                    lottieDrawable2.setApplyingShadowToLayersEnabled(z32);
                    lottieDrawable2.setMaintainOriginalImageBounds(z33);
                    lottieDrawable2.setClipToCompositionBounds(z34);
                    lottieDrawable2.setClipTextToBoundingBox(z35);
                    Marker markerForAnimationsDisabled = lottieDrawable2.getMarkerForAnimationsDisabled();
                    if (!lottieDrawable2.animationsEnabled(context2) && markerForAnimationsDisabled != null) {
                        lottieDrawable2.setProgress(markerForAnimationsDisabled.startFrame);
                    } else {
                        lottieDrawable2.setProgress(function0.invoke().floatValue());
                    }
                    lottieDrawable2.setBounds(0, 0, rect.width(), rect.height());
                    lottieDrawable2.draw(AbstractC0349c.alpha(mike), matrix2);
                }
            };
            final boolean z28 = z21;
            final boolean z29 = z17;
            final boolean z30 = z22;
            final boolean z31 = z23;
            final boolean z32 = z19;
            T3.alpha(lottieSize, function1, c0585q, 0);
            Q uniform = c0585q.uniform();
            if (uniform != null) {
                uniform.delta = new l() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Xd.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((InterfaceC0581m) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable InterfaceC0581m interfaceC0581m2, int i11) {
                        LottieAnimationKt.LottieAnimation(LottieComposition.this, progress, sVar3, z29, z25, z32, z26, renderMode3, z28, lottieDynamicProperties3, fVar3, interfaceC2392k3, z30, z31, map3, asyncUpdates3, z27, interfaceC0581m2, C0564b.cyan(i4 | 1), C0564b.cyan(i5), i10);
                    }
                };
                return;
            }
            return;
        }
        final s sVar4 = sVar2;
        final f fVar4 = fVar2;
        final boolean z33 = z17;
        final InterfaceC2392k interfaceC2392k4 = interfaceC2392k2;
        final boolean z34 = z19;
        final boolean z35 = z22;
        final boolean z36 = z23;
        final boolean z37 = z24;
        final Map<String, ? extends Typeface> map4 = map2;
        final RenderMode renderMode4 = renderMode2;
        final boolean z38 = z21;
        final AsyncUpdates asyncUpdates4 = asyncUpdates2;
        AbstractC0547m.alpha(sVar4, c0585q, (i4 >> 6) & 14);
        c0585q.quebec(false);
        Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new l() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Xd.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC0581m) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable InterfaceC0581m interfaceC0581m2, int i11) {
                    LottieAnimationKt.LottieAnimation(LottieComposition.this, progress, sVar4, z33, z18, z34, z20, renderMode4, z38, lottieDynamicProperties2, fVar4, interfaceC2392k4, z35, z36, map4, asyncUpdates4, z37, interfaceC0581m2, C0564b.cyan(i4 | 1), C0564b.cyan(i5), i10);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieDynamicProperties LottieAnimation$lambda$3(ax axVar) {
        return (LottieDynamicProperties) axVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LottieAnimation$lambda$6(LottieAnimationState lottieAnimationState) {
        return ((Number) lottieAnimationState.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m13timesUQTWf7w(long j5, long j6) {
        float delta = e.delta(j5);
        int i4 = AbstractC2372H.alpha;
        return AbstractC2627c7.alpha((int) (Float.intBitsToFloat((int) (j6 >> 32)) * delta), (int) (Float.intBitsToFloat((int) (j6 & 4294967295L)) * e.bravo(j5)));
    }

    @c
    public static final void LottieAnimation(@Nullable final LottieComposition lottieComposition, final float f5, @Nullable s sVar, boolean z2, boolean z10, boolean z11, boolean z12, @Nullable RenderMode renderMode, boolean z13, @Nullable LottieDynamicProperties lottieDynamicProperties, @Nullable f fVar, @Nullable InterfaceC2392k interfaceC2392k, boolean z14, boolean z15, @Nullable AsyncUpdates asyncUpdates, @Nullable InterfaceC0581m interfaceC0581m, final int i4, final int i5, final int i10) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1170781710);
        s sVar2 = (i10 & 4) != 0 ? p.alpha : sVar;
        boolean z16 = (i10 & 8) != 0 ? false : z2;
        boolean z17 = (i10 & 16) != 0 ? false : z10;
        boolean z18 = (i10 & 32) != 0 ? true : z11;
        boolean z19 = (i10 & 64) != 0 ? false : z12;
        RenderMode renderMode2 = (i10 & 128) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z20 = (i10 & Barcode.FORMAT_QR_CODE) != 0 ? false : z13;
        LottieDynamicProperties lottieDynamicProperties2 = (i10 & 512) != 0 ? null : lottieDynamicProperties;
        f fVar2 = (i10 & Barcode.FORMAT_UPC_E) != 0 ? d.teal : fVar;
        InterfaceC2392k interfaceC2392k2 = (i10 & 2048) != 0 ? C2391j.bravo : interfaceC2392k;
        boolean z21 = (i10 & 4096) != 0 ? true : z14;
        boolean z22 = (i10 & 8192) != 0 ? false : z15;
        AsyncUpdates asyncUpdates2 = (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        c0585q.red(185155711);
        boolean z23 = (((i4 & 112) ^ 48) > 32 && c0585q.delta(f5)) || (i4 & 48) == 32;
        Object jade = c0585q.jade();
        if (z23 || jade == C0580l.alpha) {
            jade = new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(f5);
                }
            };
            c0585q.f(jade);
        }
        c0585q.quebec(false);
        final boolean z24 = z16;
        final f fVar3 = fVar2;
        final InterfaceC2392k interfaceC2392k3 = interfaceC2392k2;
        final boolean z25 = z19;
        final RenderMode renderMode3 = renderMode2;
        final boolean z26 = z20;
        final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
        LottieAnimation(lottieComposition, (Function0) jade, sVar2, z24, z17, z18, z25, renderMode3, z26, lottieDynamicProperties3, fVar3, interfaceC2392k3, z21, false, null, asyncUpdates2, z22, c0585q, (i4 & 7168) | (i4 & 896) | 1073741832 | (57344 & i4) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024), (i5 & 1022) | ((i5 << 3) & 458752) | ((i5 << 9) & 3670016), 24576);
        final s sVar3 = sVar2;
        final boolean z27 = z17;
        final boolean z28 = z18;
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            final boolean z29 = z21;
            final AsyncUpdates asyncUpdates3 = asyncUpdates2;
            final boolean z30 = z22;
            uniform.delta = new l() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Xd.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC0581m) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable InterfaceC0581m interfaceC0581m2, int i11) {
                    LottieAnimationKt.LottieAnimation(LottieComposition.this, f5, sVar3, z24, z27, z28, z25, renderMode3, z26, lottieDynamicProperties3, fVar3, interfaceC2392k3, z29, z30, asyncUpdates3, interfaceC0581m2, C0564b.cyan(i4 | 1), C0564b.cyan(i5), i10);
                }
            };
        }
    }

    public static final void LottieAnimation(@Nullable final LottieComposition lottieComposition, @Nullable s sVar, boolean z2, boolean z10, @Nullable LottieClipSpec lottieClipSpec, float f5, int i4, boolean z11, boolean z12, boolean z13, boolean z14, @Nullable RenderMode renderMode, boolean z15, boolean z16, @Nullable LottieDynamicProperties lottieDynamicProperties, @Nullable f fVar, @Nullable InterfaceC2392k interfaceC2392k, boolean z17, boolean z18, @Nullable Map<String, ? extends Typeface> map, boolean z19, @Nullable AsyncUpdates asyncUpdates, @Nullable InterfaceC0581m interfaceC0581m, final int i5, final int i10, final int i11, final int i12) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1331239405);
        s sVar2 = (i12 & 2) != 0 ? p.alpha : sVar;
        boolean z20 = (i12 & 4) != 0 ? true : z2;
        boolean z21 = (i12 & 8) != 0 ? true : z10;
        LottieClipSpec lottieClipSpec2 = (i12 & 16) != 0 ? null : lottieClipSpec;
        float f10 = (i12 & 32) != 0 ? 1.0f : f5;
        int i13 = (i12 & 64) != 0 ? 1 : i4;
        boolean z22 = (i12 & 128) != 0 ? false : z11;
        boolean z23 = (i12 & Barcode.FORMAT_QR_CODE) != 0 ? false : z12;
        boolean z24 = (i12 & 512) != 0 ? true : z13;
        boolean z25 = (i12 & Barcode.FORMAT_UPC_E) != 0 ? false : z14;
        RenderMode renderMode2 = (i12 & 2048) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z26 = (i12 & 4096) != 0 ? false : z15;
        boolean z27 = (i12 & 8192) != 0 ? false : z16;
        LottieDynamicProperties lottieDynamicProperties2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : lottieDynamicProperties;
        f fVar2 = (i12 & 32768) != 0 ? d.teal : fVar;
        InterfaceC2392k interfaceC2392k2 = (i12 & 65536) != 0 ? C2391j.bravo : interfaceC2392k;
        boolean z28 = (i12 & 131072) != 0 ? true : z17;
        boolean z29 = (i12 & 262144) != 0 ? false : z18;
        Map<String, ? extends Typeface> map2 = (i12 & 524288) != 0 ? null : map;
        boolean z30 = (i12 & 1048576) != 0 ? false : z19;
        AsyncUpdates asyncUpdates2 = (i12 & 2097152) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        int i14 = i5 >> 3;
        final boolean z31 = z26;
        final boolean z32 = z21;
        final LottieClipSpec lottieClipSpec3 = lottieClipSpec2;
        final float f11 = f10;
        final int i15 = i13;
        final LottieAnimationState animateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(lottieComposition, z20, z32, z31, lottieClipSpec3, f11, i15, null, false, false, c0585q, (i14 & 112) | 8 | (i14 & 896) | ((i10 << 3) & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016), 896);
        final s sVar3 = sVar2;
        final boolean z33 = z27;
        final boolean z34 = z24;
        c0585q.red(185157769);
        boolean golf = c0585q.golf(animateLottieCompositionAsState);
        Object jade = c0585q.jade();
        final boolean z35 = z20;
        if (golf || jade == C0580l.alpha) {
            jade = new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$6$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    float LottieAnimation$lambda$6;
                    LottieAnimation$lambda$6 = LottieAnimationKt.LottieAnimation$lambda$6(LottieAnimationState.this);
                    return Float.valueOf(LottieAnimation$lambda$6);
                }
            };
            c0585q.f(jade);
        }
        c0585q.quebec(false);
        int i16 = i5 >> 12;
        int i17 = ((i5 << 3) & 896) | 1073741832 | (i16 & 7168) | (i16 & 57344) | (i16 & 458752);
        int i18 = i10 << 18;
        int i19 = i17 | (i18 & 3670016) | (i18 & 29360128) | ((i10 << 15) & 234881024);
        int i20 = i10 >> 15;
        final boolean z36 = z22;
        final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
        final boolean z37 = z23;
        final boolean z38 = z25;
        final RenderMode renderMode3 = renderMode2;
        final f fVar3 = fVar2;
        final InterfaceC2392k interfaceC2392k3 = interfaceC2392k2;
        final boolean z39 = z28;
        final boolean z40 = z29;
        final Map<String, ? extends Typeface> map3 = map2;
        final boolean z41 = z30;
        final AsyncUpdates asyncUpdates3 = asyncUpdates2;
        LottieAnimation(lottieComposition, (Function0) jade, sVar3, z36, z37, z34, z38, renderMode3, z33, lottieDynamicProperties3, fVar3, interfaceC2392k3, z39, z40, map3, asyncUpdates3, z41, c0585q, i19, (i20 & 14) | 32768 | (i20 & 112) | (i20 & 896) | (i20 & 7168) | ((i11 << 12) & 458752) | ((i11 << 18) & 3670016), 0);
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new l() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Xd.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC0581m) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable InterfaceC0581m interfaceC0581m2, int i21) {
                    LottieAnimationKt.LottieAnimation(LottieComposition.this, sVar3, z35, z32, lottieClipSpec3, f11, i15, z36, z37, z34, z38, renderMode3, z31, z33, lottieDynamicProperties3, fVar3, interfaceC2392k3, z39, z40, map3, z41, asyncUpdates3, interfaceC0581m2, C0564b.cyan(i5 | 1), C0564b.cyan(i10), C0564b.cyan(i11), i12);
                }
            };
        }
    }

    @c
    public static final void LottieAnimation(final LottieComposition lottieComposition, final Function0 progress, s sVar, boolean z2, boolean z10, boolean z11, RenderMode renderMode, boolean z12, LottieDynamicProperties lottieDynamicProperties, f fVar, InterfaceC2392k interfaceC2392k, boolean z13, boolean z14, Map map, AsyncUpdates asyncUpdates, boolean z15, InterfaceC0581m interfaceC0581m, final int i4, final int i5, final int i10) {
        Intrinsics.echo(progress, "progress");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-674272918);
        s sVar2 = (i10 & 4) != 0 ? p.alpha : sVar;
        boolean z16 = (i10 & 8) != 0 ? false : z2;
        boolean z17 = (i10 & 16) != 0 ? false : z10;
        boolean z18 = (i10 & 32) != 0 ? false : z11;
        RenderMode renderMode2 = (i10 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z19 = (i10 & 128) != 0 ? false : z12;
        LottieDynamicProperties lottieDynamicProperties2 = (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : lottieDynamicProperties;
        f fVar2 = (i10 & 512) != 0 ? d.teal : fVar;
        InterfaceC2392k interfaceC2392k2 = (i10 & Barcode.FORMAT_UPC_E) != 0 ? C2391j.bravo : interfaceC2392k;
        boolean z20 = (i10 & 2048) != 0 ? true : z13;
        boolean z21 = (i10 & 4096) != 0 ? false : z14;
        Map map2 = (i10 & 8192) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (i10 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        boolean z22 = (i10 & 32768) != 0 ? false : z15;
        int i11 = i4 << 3;
        int i12 = (i4 & 896) | (i4 & 112) | 1073938440 | (i4 & 7168) | (57344 & i4) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024);
        int i13 = i5 << 3;
        int i14 = (i13 & 896) | ((i4 >> 27) & 14) | 32768 | (i13 & 112) | (i13 & 7168) | (458752 & i13) | (i13 & 3670016);
        final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
        final boolean z23 = z19;
        final boolean z24 = z16;
        final s sVar3 = sVar2;
        LottieAnimation(lottieComposition, progress, sVar3, z24, z17, false, z18, renderMode2, z23, lottieDynamicProperties3, fVar2, interfaceC2392k2, z20, z21, map2, asyncUpdates2, z22, c0585q, i12, i14, 0);
        final boolean z25 = z17;
        final boolean z26 = z18;
        final RenderMode renderMode3 = renderMode2;
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            final f fVar3 = fVar2;
            final InterfaceC2392k interfaceC2392k3 = interfaceC2392k2;
            final boolean z27 = z20;
            final boolean z28 = z21;
            final Map map3 = map2;
            final AsyncUpdates asyncUpdates3 = asyncUpdates2;
            final boolean z29 = z22;
            uniform.delta = new l() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Xd.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC0581m) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable InterfaceC0581m interfaceC0581m2, int i15) {
                    LottieAnimationKt.LottieAnimation(LottieComposition.this, progress, sVar3, z24, z25, z26, renderMode3, z23, lottieDynamicProperties3, fVar3, interfaceC2392k3, z27, z28, map3, asyncUpdates3, z29, interfaceC0581m2, C0564b.cyan(i4 | 1), C0564b.cyan(i5), i10);
                }
            };
        }
    }
}
