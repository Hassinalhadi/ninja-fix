package com.airbnb.lottie.compose;

import Z.e;
import Zd.a;
import a0.AbstractC0349c;
import a0.InterfaceC0364r;
import android.graphics.Matrix;
import android.graphics.Typeface;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.aw;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.n0;
import c0.d;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.RenderMode;
import com.google.mlkit.vision.barcode.common.Barcode;
import f0.AbstractC1680b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2627c7;
import t6.M2;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR/\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u0010\b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R+\u0010\t\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R+\u0010\f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010,\"\u0004\b<\u0010.R/\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010\u001f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010\u001f\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.RG\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u001f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010\u001f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR+\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010\u001f\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010.R\u0018\u0010R\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010]\u001a\u00020Z8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b[\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Lcom/airbnb/lottie/compose/LottiePainter;", "Lf0/b;", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "progress", "", "outlineMasksAndMattes", "applyOpacityToLayers", "enableMergePaths", "Lcom/airbnb/lottie/RenderMode;", "renderMode", "maintainOriginalImageBounds", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "dynamicProperties", "clipToCompositionBounds", "clipTextToBoundingBox", "", "", "Landroid/graphics/Typeface;", "fontMap", "Lcom/airbnb/lottie/AsyncUpdates;", "asyncUpdates", "<init>", "(Lcom/airbnb/lottie/LottieComposition;FZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;)V", "Lc0/d;", "", "onDraw", "(Lc0/d;)V", "<set-?>", "composition$delegate", "Landroidx/compose/runtime/ax;", "getComposition$lottie_compose_release", "()Lcom/airbnb/lottie/LottieComposition;", "setComposition$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)V", "progress$delegate", "Landroidx/compose/runtime/aw;", "getProgress$lottie_compose_release", "()F", "setProgress$lottie_compose_release", "(F)V", "outlineMasksAndMattes$delegate", "getOutlineMasksAndMattes$lottie_compose_release", "()Z", "setOutlineMasksAndMattes$lottie_compose_release", "(Z)V", "applyOpacityToLayers$delegate", "getApplyOpacityToLayers$lottie_compose_release", "setApplyOpacityToLayers$lottie_compose_release", "enableMergePaths$delegate", "getEnableMergePaths$lottie_compose_release", "setEnableMergePaths$lottie_compose_release", "renderMode$delegate", "getRenderMode$lottie_compose_release", "()Lcom/airbnb/lottie/RenderMode;", "setRenderMode$lottie_compose_release", "(Lcom/airbnb/lottie/RenderMode;)V", "maintainOriginalImageBounds$delegate", "getMaintainOriginalImageBounds$lottie_compose_release", "setMaintainOriginalImageBounds$lottie_compose_release", "dynamicProperties$delegate", "getDynamicProperties$lottie_compose_release", "()Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "setDynamicProperties$lottie_compose_release", "(Lcom/airbnb/lottie/compose/LottieDynamicProperties;)V", "clipToCompositionBounds$delegate", "getClipToCompositionBounds$lottie_compose_release", "setClipToCompositionBounds$lottie_compose_release", "fontMap$delegate", "getFontMap$lottie_compose_release", "()Ljava/util/Map;", "setFontMap$lottie_compose_release", "(Ljava/util/Map;)V", "asyncUpdates$delegate", "getAsyncUpdates$lottie_compose_release", "()Lcom/airbnb/lottie/AsyncUpdates;", "setAsyncUpdates$lottie_compose_release", "(Lcom/airbnb/lottie/AsyncUpdates;)V", "clipTextToBoundingBox$delegate", "getClipTextToBoundingBox$lottie_compose_release", "setClipTextToBoundingBox$lottie_compose_release", "setDynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "Lcom/airbnb/lottie/LottieDrawable;", "drawable", "Lcom/airbnb/lottie/LottieDrawable;", "Landroid/graphics/Matrix;", "matrix", "Landroid/graphics/Matrix;", "LZ/e;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottiePainter extends AbstractC1680b {
    public static final int $stable = 8;

    /* renamed from: applyOpacityToLayers$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax applyOpacityToLayers;

    /* renamed from: asyncUpdates$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax asyncUpdates;

    /* renamed from: clipTextToBoundingBox$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax clipTextToBoundingBox;

    /* renamed from: clipToCompositionBounds$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax clipToCompositionBounds;

    /* renamed from: composition$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax composition;

    @NotNull
    private final LottieDrawable drawable;

    /* renamed from: dynamicProperties$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax dynamicProperties;

    /* renamed from: enableMergePaths$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax enableMergePaths;

    /* renamed from: fontMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax fontMap;

    /* renamed from: maintainOriginalImageBounds$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax maintainOriginalImageBounds;

    @NotNull
    private final Matrix matrix;

    /* renamed from: outlineMasksAndMattes$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax outlineMasksAndMattes;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    @NotNull
    private final aw progress;

    /* renamed from: renderMode$delegate, reason: from kotlin metadata */
    @NotNull
    private final ax renderMode;

    @Nullable
    private LottieDynamicProperties setDynamicProperties;

    public LottiePainter() {
        this(null, 0.0f, false, false, false, null, false, null, false, false, null, null, 4095, null);
    }

    public final boolean getApplyOpacityToLayers$lottie_compose_release() {
        return ((Boolean) this.applyOpacityToLayers.getValue()).booleanValue();
    }

    @NotNull
    public final AsyncUpdates getAsyncUpdates$lottie_compose_release() {
        return (AsyncUpdates) this.asyncUpdates.getValue();
    }

    public final boolean getClipTextToBoundingBox$lottie_compose_release() {
        return ((Boolean) this.clipTextToBoundingBox.getValue()).booleanValue();
    }

    public final boolean getClipToCompositionBounds$lottie_compose_release() {
        return ((Boolean) this.clipToCompositionBounds.getValue()).booleanValue();
    }

    @Nullable
    public final LottieComposition getComposition$lottie_compose_release() {
        return (LottieComposition) this.composition.getValue();
    }

    @Nullable
    public final LottieDynamicProperties getDynamicProperties$lottie_compose_release() {
        return (LottieDynamicProperties) this.dynamicProperties.getValue();
    }

    public final boolean getEnableMergePaths$lottie_compose_release() {
        return ((Boolean) this.enableMergePaths.getValue()).booleanValue();
    }

    @Nullable
    public final Map<String, Typeface> getFontMap$lottie_compose_release() {
        return (Map) this.fontMap.getValue();
    }

    @Override // f0.AbstractC1680b
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo1getIntrinsicSizeNHjbRc() {
        if (getComposition$lottie_compose_release() == null) {
            return 9205357640488583168L;
        }
        return M2.alpha(r0.getBounds().width(), r0.getBounds().height());
    }

    public final boolean getMaintainOriginalImageBounds$lottie_compose_release() {
        return ((Boolean) this.maintainOriginalImageBounds.getValue()).booleanValue();
    }

    public final boolean getOutlineMasksAndMattes$lottie_compose_release() {
        return ((Boolean) this.outlineMasksAndMattes.getValue()).booleanValue();
    }

    public final float getProgress$lottie_compose_release() {
        return ((n0) this.progress).juliet();
    }

    @NotNull
    public final RenderMode getRenderMode$lottie_compose_release() {
        return (RenderMode) this.renderMode.getValue();
    }

    @Override // f0.AbstractC1680b
    public void onDraw(@NotNull d dVar) {
        Intrinsics.echo(dVar, "<this>");
        LottieComposition composition$lottie_compose_release = getComposition$lottie_compose_release();
        if (composition$lottie_compose_release == null) {
            return;
        }
        InterfaceC0364r mike = dVar.lime().mike();
        long alpha = M2.alpha(composition$lottie_compose_release.getBounds().width(), composition$lottie_compose_release.getBounds().height());
        long alpha2 = AbstractC2627c7.alpha(a.delta(e.delta(dVar.bravo())), a.delta(e.bravo(dVar.bravo())));
        this.matrix.reset();
        this.matrix.preScale(((int) (alpha2 >> 32)) / e.delta(alpha), ((int) (alpha2 & 4294967295L)) / e.bravo(alpha));
        this.drawable.enableFeatureFlag(LottieFeatureFlag.MergePathsApi19, getEnableMergePaths$lottie_compose_release());
        this.drawable.setRenderMode(getRenderMode$lottie_compose_release());
        this.drawable.setAsyncUpdates(getAsyncUpdates$lottie_compose_release());
        this.drawable.setComposition(composition$lottie_compose_release);
        this.drawable.setFontMap(getFontMap$lottie_compose_release());
        LottieDynamicProperties dynamicProperties$lottie_compose_release = getDynamicProperties$lottie_compose_release();
        LottieDynamicProperties lottieDynamicProperties = this.setDynamicProperties;
        if (dynamicProperties$lottie_compose_release != lottieDynamicProperties) {
            if (lottieDynamicProperties != null) {
                lottieDynamicProperties.removeFrom$lottie_compose_release(this.drawable);
            }
            LottieDynamicProperties dynamicProperties$lottie_compose_release2 = getDynamicProperties$lottie_compose_release();
            if (dynamicProperties$lottie_compose_release2 != null) {
                dynamicProperties$lottie_compose_release2.addTo$lottie_compose_release(this.drawable);
            }
            this.setDynamicProperties = getDynamicProperties$lottie_compose_release();
        }
        this.drawable.setOutlineMasksAndMattes(getOutlineMasksAndMattes$lottie_compose_release());
        this.drawable.setApplyingOpacityToLayersEnabled(getApplyOpacityToLayers$lottie_compose_release());
        this.drawable.setMaintainOriginalImageBounds(getMaintainOriginalImageBounds$lottie_compose_release());
        this.drawable.setClipToCompositionBounds(getClipToCompositionBounds$lottie_compose_release());
        this.drawable.setClipTextToBoundingBox(getClipTextToBoundingBox$lottie_compose_release());
        this.drawable.setProgress(getProgress$lottie_compose_release());
        this.drawable.setBounds(0, 0, composition$lottie_compose_release.getBounds().width(), composition$lottie_compose_release.getBounds().height());
        this.drawable.draw(AbstractC0349c.alpha(mike), this.matrix);
    }

    public final void setApplyOpacityToLayers$lottie_compose_release(boolean z2) {
        this.applyOpacityToLayers.setValue(Boolean.valueOf(z2));
    }

    public final void setAsyncUpdates$lottie_compose_release(@NotNull AsyncUpdates asyncUpdates) {
        Intrinsics.echo(asyncUpdates, "<set-?>");
        this.asyncUpdates.setValue(asyncUpdates);
    }

    public final void setClipTextToBoundingBox$lottie_compose_release(boolean z2) {
        this.clipTextToBoundingBox.setValue(Boolean.valueOf(z2));
    }

    public final void setClipToCompositionBounds$lottie_compose_release(boolean z2) {
        this.clipToCompositionBounds.setValue(Boolean.valueOf(z2));
    }

    public final void setComposition$lottie_compose_release(@Nullable LottieComposition lottieComposition) {
        this.composition.setValue(lottieComposition);
    }

    public final void setDynamicProperties$lottie_compose_release(@Nullable LottieDynamicProperties lottieDynamicProperties) {
        this.dynamicProperties.setValue(lottieDynamicProperties);
    }

    public final void setEnableMergePaths$lottie_compose_release(boolean z2) {
        this.enableMergePaths.setValue(Boolean.valueOf(z2));
    }

    public final void setFontMap$lottie_compose_release(@Nullable Map<String, ? extends Typeface> map) {
        this.fontMap.setValue(map);
    }

    public final void setMaintainOriginalImageBounds$lottie_compose_release(boolean z2) {
        this.maintainOriginalImageBounds.setValue(Boolean.valueOf(z2));
    }

    public final void setOutlineMasksAndMattes$lottie_compose_release(boolean z2) {
        this.outlineMasksAndMattes.setValue(Boolean.valueOf(z2));
    }

    public final void setProgress$lottie_compose_release(float f5) {
        ((n0) this.progress).kilo(f5);
    }

    public final void setRenderMode$lottie_compose_release(@NotNull RenderMode renderMode) {
        Intrinsics.echo(renderMode, "<set-?>");
        this.renderMode.setValue(renderMode);
    }

    public /* synthetic */ LottiePainter(LottieComposition lottieComposition, float f5, boolean z2, boolean z10, boolean z11, RenderMode renderMode, boolean z12, LottieDynamicProperties lottieDynamicProperties, boolean z13, boolean z14, Map map, AsyncUpdates asyncUpdates, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : lottieComposition, (i4 & 2) != 0 ? 0.0f : f5, (i4 & 4) != 0 ? false : z2, (i4 & 8) != 0 ? false : z10, (i4 & 16) != 0 ? false : z11, (i4 & 32) != 0 ? RenderMode.AUTOMATIC : renderMode, (i4 & 64) != 0 ? false : z12, (i4 & 128) != 0 ? null : lottieDynamicProperties, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? true : z13, (i4 & 512) == 0 ? z14 : false, (i4 & Barcode.FORMAT_UPC_E) == 0 ? map : null, (i4 & 2048) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates);
    }

    public LottiePainter(@Nullable LottieComposition lottieComposition, float f5, boolean z2, boolean z10, boolean z11, @NotNull RenderMode renderMode, boolean z12, @Nullable LottieDynamicProperties lottieDynamicProperties, boolean z13, boolean z14, @Nullable Map<String, ? extends Typeface> map, @NotNull AsyncUpdates asyncUpdates) {
        Intrinsics.echo(renderMode, "renderMode");
        Intrinsics.echo(asyncUpdates, "asyncUpdates");
        this.composition = C0564b.zulu(lottieComposition);
        this.progress = C0564b.victor(f5);
        this.outlineMasksAndMattes = C0564b.zulu(Boolean.valueOf(z2));
        this.applyOpacityToLayers = C0564b.zulu(Boolean.valueOf(z10));
        this.enableMergePaths = C0564b.zulu(Boolean.valueOf(z11));
        this.renderMode = C0564b.zulu(renderMode);
        this.maintainOriginalImageBounds = C0564b.zulu(Boolean.valueOf(z12));
        this.dynamicProperties = C0564b.zulu(lottieDynamicProperties);
        this.clipToCompositionBounds = C0564b.zulu(Boolean.valueOf(z13));
        this.fontMap = C0564b.zulu(map);
        this.asyncUpdates = C0564b.zulu(asyncUpdates);
        this.clipTextToBoundingBox = C0564b.zulu(Boolean.valueOf(z14));
        this.drawable = new LottieDrawable();
        this.matrix = new Matrix();
    }
}
