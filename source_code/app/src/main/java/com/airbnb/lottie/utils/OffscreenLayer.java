package com.airbnb.lottie.utils;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import androidx.appcompat.widget.J;
import com.airbnb.lottie.animation.LPaint;
import j1.AbstractC1930d;
import j1.EnumC1927a;

/* loaded from: classes3.dex */
public class OffscreenLayer {
    private static final Matrix IDENTITY_MATRIX = new Matrix();
    private Bitmap bitmap;
    private Canvas bitmapCanvas;
    private Rect bitmapSrcRect;
    private LPaint clearPaint;
    private Paint composePaint;
    private RenderStrategy currentStrategy;
    private Rect intRectIncludingShadow;
    private DropShadow lastRenderNodeShadow;
    private float lastShadowBlurRadius = 0.0f;
    private ComposeOp op;
    private Canvas parentCanvas;
    Matrix parentCanvasMatrix;
    float[] preExistingTransform;
    private RectF rectIncludingShadow;
    private RenderNode renderNode;
    private RectF scaledBounds;
    private RectF scaledRectIncludingShadow;
    private Bitmap shadowBitmap;
    private Canvas shadowBitmapCanvas;
    private Rect shadowBitmapSrcRect;
    private BlurMaskFilter shadowBlurFilter;
    private Bitmap shadowMaskBitmap;
    private Canvas shadowMaskBitmapCanvas;
    private LPaint shadowPaint;
    private RenderNode shadowRenderNode;
    private RectF targetRect;
    private RectF tmpRect;

    /* loaded from: classes3.dex */
    public static class ComposeOp {
        public int alpha;
        public EnumC1927a blendMode;
        public ColorFilter colorFilter;
        public DropShadow shadow;

        public ComposeOp() {
            reset();
        }

        public boolean hasBlendMode() {
            EnumC1927a enumC1927a = this.blendMode;
            if (enumC1927a != null && enumC1927a != EnumC1927a.alpha) {
                return true;
            }
            return false;
        }

        public boolean hasColorFilter() {
            if (this.colorFilter != null) {
                return true;
            }
            return false;
        }

        public boolean hasShadow() {
            if (this.shadow != null) {
                return true;
            }
            return false;
        }

        public boolean isNoop() {
            if (!isTranslucent() && !hasBlendMode() && !hasShadow() && !hasColorFilter()) {
                return true;
            }
            return false;
        }

        public boolean isTranslucent() {
            if (this.alpha < 255) {
                return true;
            }
            return false;
        }

        public void reset() {
            this.alpha = 255;
            this.blendMode = null;
            this.colorFilter = null;
            this.shadow = null;
        }
    }

    /* loaded from: classes3.dex */
    public enum RenderStrategy {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    private Bitmap allocateBitmap(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    private RectF calculateRectIncludingShadow(RectF rectF, DropShadow dropShadow) {
        if (this.rectIncludingShadow == null) {
            this.rectIncludingShadow = new RectF();
        }
        if (this.tmpRect == null) {
            this.tmpRect = new RectF();
        }
        this.rectIncludingShadow.set(rectF);
        this.rectIncludingShadow.offsetTo(dropShadow.getDx() + rectF.left, dropShadow.getDy() + rectF.top);
        this.rectIncludingShadow.inset(-dropShadow.getRadius(), -dropShadow.getRadius());
        this.tmpRect.set(rectF);
        this.rectIncludingShadow.union(this.tmpRect);
        return this.rectIncludingShadow;
    }

    private RenderStrategy chooseRenderStrategy(Canvas canvas, ComposeOp composeOp) {
        if (composeOp.isNoop()) {
            return RenderStrategy.DIRECT;
        }
        if (!composeOp.hasShadow()) {
            return RenderStrategy.SAVE_LAYER;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29 && canvas.isHardwareAccelerated()) {
            if (i4 <= 31) {
                return RenderStrategy.BITMAP;
            }
            return RenderStrategy.RENDER_NODE;
        }
        return RenderStrategy.BITMAP;
    }

    private void deallocateBitmap(Bitmap bitmap) {
        bitmap.recycle();
    }

    private boolean needNewBitmap(Bitmap bitmap, RectF rectF) {
        if (bitmap == null || rectF.width() >= bitmap.getWidth() || rectF.height() >= bitmap.getHeight() || rectF.width() < bitmap.getWidth() * 0.75f || rectF.height() < bitmap.getHeight() * 0.75f) {
            return true;
        }
        return false;
    }

    private void renderBitmapShadow(Canvas canvas, DropShadow dropShadow) {
        float f5;
        LPaint lPaint;
        RectF rectF = this.targetRect;
        if (rectF != null && this.bitmap != null) {
            RectF calculateRectIncludingShadow = calculateRectIncludingShadow(rectF, dropShadow);
            if (this.intRectIncludingShadow == null) {
                this.intRectIncludingShadow = new Rect();
            }
            this.intRectIncludingShadow.set((int) Math.floor(calculateRectIncludingShadow.left), (int) Math.floor(calculateRectIncludingShadow.top), (int) Math.ceil(calculateRectIncludingShadow.right), (int) Math.ceil(calculateRectIncludingShadow.bottom));
            float[] fArr = this.preExistingTransform;
            float f10 = 1.0f;
            if (fArr != null) {
                f5 = fArr[0];
            } else {
                f5 = 1.0f;
            }
            if (fArr != null) {
                f10 = fArr[4];
            }
            if (this.scaledRectIncludingShadow == null) {
                this.scaledRectIncludingShadow = new RectF();
            }
            this.scaledRectIncludingShadow.set(calculateRectIncludingShadow.left * f5, calculateRectIncludingShadow.top * f10, calculateRectIncludingShadow.right * f5, calculateRectIncludingShadow.bottom * f10);
            if (this.shadowBitmapSrcRect == null) {
                this.shadowBitmapSrcRect = new Rect();
            }
            this.shadowBitmapSrcRect.set(0, 0, Math.round(this.scaledRectIncludingShadow.width()), Math.round(this.scaledRectIncludingShadow.height()));
            if (needNewBitmap(this.shadowBitmap, this.scaledRectIncludingShadow)) {
                Bitmap bitmap = this.shadowBitmap;
                if (bitmap != null) {
                    deallocateBitmap(bitmap);
                }
                Bitmap bitmap2 = this.shadowMaskBitmap;
                if (bitmap2 != null) {
                    deallocateBitmap(bitmap2);
                }
                this.shadowBitmap = allocateBitmap(this.scaledRectIncludingShadow, Bitmap.Config.ARGB_8888);
                this.shadowMaskBitmap = allocateBitmap(this.scaledRectIncludingShadow, Bitmap.Config.ALPHA_8);
                this.shadowBitmapCanvas = new Canvas(this.shadowBitmap);
                this.shadowMaskBitmapCanvas = new Canvas(this.shadowMaskBitmap);
            } else {
                Canvas canvas2 = this.shadowBitmapCanvas;
                if (canvas2 != null && this.shadowMaskBitmapCanvas != null && (lPaint = this.clearPaint) != null) {
                    canvas2.drawRect(this.shadowBitmapSrcRect, lPaint);
                    this.shadowMaskBitmapCanvas.drawRect(this.shadowBitmapSrcRect, this.clearPaint);
                } else {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                }
            }
            if (this.shadowMaskBitmap != null) {
                if (this.shadowPaint == null) {
                    this.shadowPaint = new LPaint(1);
                }
                RectF rectF2 = this.targetRect;
                this.shadowMaskBitmapCanvas.drawBitmap(this.bitmap, Math.round((rectF2.left - calculateRectIncludingShadow.left) * f5), Math.round((rectF2.top - calculateRectIncludingShadow.top) * f10), (Paint) null);
                if (this.shadowBlurFilter == null || this.lastShadowBlurRadius != dropShadow.getRadius()) {
                    float radius = ((f5 + f10) * dropShadow.getRadius()) / 2.0f;
                    if (radius > 0.0f) {
                        this.shadowBlurFilter = new BlurMaskFilter(radius, BlurMaskFilter.Blur.NORMAL);
                    } else {
                        this.shadowBlurFilter = null;
                    }
                    this.lastShadowBlurRadius = dropShadow.getRadius();
                }
                this.shadowPaint.setColor(dropShadow.getColor());
                if (dropShadow.getRadius() > 0.0f) {
                    this.shadowPaint.setMaskFilter(this.shadowBlurFilter);
                } else {
                    this.shadowPaint.setMaskFilter(null);
                }
                this.shadowPaint.setFilterBitmap(true);
                this.shadowBitmapCanvas.drawBitmap(this.shadowMaskBitmap, Math.round(dropShadow.getDx() * f5), Math.round(dropShadow.getDy() * f10), this.shadowPaint);
                canvas.drawBitmap(this.shadowBitmap, this.shadowBitmapSrcRect, this.intRectIncludingShadow, this.composePaint);
                return;
            }
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
    }

    private void renderHardwareShadow(Canvas canvas, DropShadow dropShadow) {
        float f5;
        RenderEffect createColorFilterEffect;
        RecordingCanvas beginRecording;
        if (this.renderNode != null && this.shadowRenderNode != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                float[] fArr = this.preExistingTransform;
                float f10 = 1.0f;
                if (fArr != null) {
                    f5 = fArr[0];
                } else {
                    f5 = 1.0f;
                }
                if (fArr != null) {
                    f10 = fArr[4];
                }
                DropShadow dropShadow2 = this.lastRenderNodeShadow;
                if (dropShadow2 == null || !dropShadow.sameAs(dropShadow2)) {
                    createColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(dropShadow.getColor(), PorterDuff.Mode.SRC_IN));
                    if (dropShadow.getRadius() > 0.0f) {
                        float radius = ((f5 + f10) * dropShadow.getRadius()) / 2.0f;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        createColorFilterEffect = RenderEffect.createBlurEffect(radius, radius, createColorFilterEffect, Shader.TileMode.CLAMP);
                    }
                    this.shadowRenderNode.setRenderEffect(createColorFilterEffect);
                    this.lastRenderNodeShadow = dropShadow;
                }
                RectF calculateRectIncludingShadow = calculateRectIncludingShadow(this.targetRect, dropShadow);
                RectF rectF = new RectF(calculateRectIncludingShadow.left * f5, calculateRectIncludingShadow.top * f10, calculateRectIncludingShadow.right * f5, calculateRectIncludingShadow.bottom * f10);
                this.shadowRenderNode.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                beginRecording = this.shadowRenderNode.beginRecording((int) rectF.width(), (int) rectF.height());
                beginRecording.translate((dropShadow.getDx() * f5) + (-rectF.left), (dropShadow.getDy() * f10) + (-rectF.top));
                beginRecording.drawRenderNode(this.renderNode);
                this.shadowRenderNode.endRecording();
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.drawRenderNode(this.shadowRenderNode);
                canvas.restore();
                return;
            }
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
    }

    public void finish() {
        if (this.parentCanvas != null && this.op != null && this.preExistingTransform != null && this.targetRect != null) {
            int ordinal = this.currentStrategy.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            if (this.renderNode != null) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    this.parentCanvas.save();
                                    Canvas canvas = this.parentCanvas;
                                    float[] fArr = this.preExistingTransform;
                                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                                    this.renderNode.endRecording();
                                    if (this.op.hasShadow()) {
                                        renderHardwareShadow(this.parentCanvas, this.op.shadow);
                                    }
                                    this.parentCanvas.drawRenderNode(this.renderNode);
                                    this.parentCanvas.restore();
                                } else {
                                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                                }
                            } else {
                                throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                            }
                        }
                    } else if (this.bitmap != null) {
                        if (this.op.hasShadow()) {
                            renderBitmapShadow(this.parentCanvas, this.op.shadow);
                        }
                        if (this.bitmapSrcRect == null) {
                            this.bitmapSrcRect = new Rect();
                        }
                        this.bitmapSrcRect.set(0, 0, (int) (this.targetRect.width() * this.preExistingTransform[0]), (int) (this.targetRect.height() * this.preExistingTransform[4]));
                        this.parentCanvas.drawBitmap(this.bitmap, this.bitmapSrcRect, this.targetRect, this.composePaint);
                    } else {
                        throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                    }
                } else {
                    this.parentCanvas.restore();
                }
            } else {
                this.parentCanvas.restore();
            }
            this.parentCanvas = null;
            return;
        }
        throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
    }

    public boolean finishDecrementsCanvasSaveCount() {
        if (this.currentStrategy == RenderStrategy.RENDER_NODE) {
            return true;
        }
        return false;
    }

    public Canvas start(Canvas canvas, RectF rectF, ComposeOp composeOp) {
        RecordingCanvas beginRecording;
        if (this.parentCanvas == null) {
            if (this.preExistingTransform == null) {
                this.preExistingTransform = new float[9];
            }
            if (this.parentCanvasMatrix == null) {
                this.parentCanvasMatrix = new Matrix();
            }
            canvas.getMatrix(this.parentCanvasMatrix);
            this.parentCanvasMatrix.getValues(this.preExistingTransform);
            float[] fArr = this.preExistingTransform;
            float f5 = fArr[0];
            float f10 = fArr[4];
            if (this.scaledBounds == null) {
                this.scaledBounds = new RectF();
            }
            this.scaledBounds.set(rectF.left * f5, rectF.top * f10, rectF.right * f5, rectF.bottom * f10);
            this.parentCanvas = canvas;
            this.op = composeOp;
            this.currentStrategy = chooseRenderStrategy(canvas, composeOp);
            if (this.targetRect == null) {
                this.targetRect = new RectF();
            }
            this.targetRect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            if (this.composePaint == null) {
                this.composePaint = new LPaint();
            }
            this.composePaint.reset();
            int ordinal = this.currentStrategy.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            if (Build.VERSION.SDK_INT >= 29) {
                                if (this.renderNode == null) {
                                    this.renderNode = J.tango();
                                }
                                if (composeOp.hasShadow() && this.shadowRenderNode == null) {
                                    this.shadowRenderNode = J.yankee();
                                    this.lastRenderNodeShadow = null;
                                }
                                if (composeOp.hasBlendMode() || composeOp.hasColorFilter()) {
                                    if (this.composePaint == null) {
                                        this.composePaint = new LPaint();
                                    }
                                    this.composePaint.reset();
                                    AbstractC1930d.alpha(this.composePaint, composeOp.blendMode);
                                    this.composePaint.setColorFilter(composeOp.colorFilter);
                                    this.renderNode.setUseCompositingLayer(true, this.composePaint);
                                    if (composeOp.hasShadow()) {
                                        RenderNode renderNode = this.shadowRenderNode;
                                        if (renderNode != null) {
                                            renderNode.setUseCompositingLayer(true, this.composePaint);
                                        } else {
                                            throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                                        }
                                    }
                                }
                                this.renderNode.setAlpha(composeOp.alpha / 255.0f);
                                if (composeOp.hasShadow()) {
                                    RenderNode renderNode2 = this.shadowRenderNode;
                                    if (renderNode2 != null) {
                                        renderNode2.setAlpha(composeOp.alpha / 255.0f);
                                    } else {
                                        throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                                    }
                                }
                                this.renderNode.setHasOverlappingRendering(true);
                                RenderNode renderNode3 = this.renderNode;
                                RectF rectF2 = this.scaledBounds;
                                renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                beginRecording = this.renderNode.beginRecording((int) this.scaledBounds.width(), (int) this.scaledBounds.height());
                                beginRecording.setMatrix(IDENTITY_MATRIX);
                                beginRecording.scale(f5, f10);
                                beginRecording.translate(-rectF.left, -rectF.top);
                                return beginRecording;
                            }
                            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                        }
                        throw new RuntimeException("Invalid render strategy for OffscreenLayer");
                    }
                    if (this.clearPaint == null) {
                        LPaint lPaint = new LPaint();
                        this.clearPaint = lPaint;
                        lPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    if (needNewBitmap(this.bitmap, this.scaledBounds)) {
                        Bitmap bitmap = this.bitmap;
                        if (bitmap != null) {
                            deallocateBitmap(bitmap);
                        }
                        this.bitmap = allocateBitmap(this.scaledBounds, Bitmap.Config.ARGB_8888);
                        this.bitmapCanvas = new Canvas(this.bitmap);
                    } else {
                        Canvas canvas2 = this.bitmapCanvas;
                        if (canvas2 != null) {
                            canvas2.setMatrix(IDENTITY_MATRIX);
                            this.bitmapCanvas.drawRect(-1.0f, -1.0f, this.scaledBounds.width() + 1.0f, this.scaledBounds.height() + 1.0f, this.clearPaint);
                        } else {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                        }
                    }
                    AbstractC1930d.alpha(this.composePaint, composeOp.blendMode);
                    this.composePaint.setColorFilter(composeOp.colorFilter);
                    this.composePaint.setAlpha(composeOp.alpha);
                    Canvas canvas3 = this.bitmapCanvas;
                    canvas3.scale(f5, f10);
                    canvas3.translate(-rectF.left, -rectF.top);
                    return canvas3;
                }
                this.composePaint.setAlpha(composeOp.alpha);
                this.composePaint.setColorFilter(composeOp.colorFilter);
                if (composeOp.hasBlendMode()) {
                    AbstractC1930d.alpha(this.composePaint, composeOp.blendMode);
                }
                Utils.saveLayerCompat(canvas, rectF, this.composePaint);
                return canvas;
            }
            canvas.save();
            return canvas;
        }
        throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
    }
}
