package E0;

import a0.AbstractC0340a;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import com.airbnb.lottie.compose.LottieConstants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends Canvas {
    public Canvas alpha;

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        boolean clipOutPath;
        Canvas canvas = this.alpha;
        if (canvas != null) {
            clipOutPath = canvas.clipOutPath(path);
            return clipOutPath;
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        boolean clipOutRect;
        Canvas canvas = this.alpha;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(rectF);
            return clipOutRect;
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.clipPath(path, op);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.clipRect(rectF, op);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.concat(matrix);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            AbstractC0340a.kilo(canvas);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i4, int i5, int i10, int i11) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawARGB(i4, i5, i10, i11);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f5, float f10, boolean z2, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawArc(rectF, f5, f10, z2, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f5, float f10, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, f5, f10, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i4, int i5, float[] fArr, int i10, int[] iArr, int i11, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawBitmapMesh(bitmap, i4, i5, fArr, i10, iArr, i11, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f5, float f10, float f11, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawCircle(f5, f10, f11, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i4) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawColor(i4);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f5, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, f5, f10, rectF2, f11, f12, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i4, float[] fArr, int i5, int i10, Font font, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawGlyphs(iArr, i4, fArr, i5, i10, font, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f5, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawLine(f5, f10, f11, f12, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i4, int i5, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawLines(fArr, i4, i5, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawOval(rectF, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawPaint(paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rect, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawPath(path, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawPicture(picture);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f5, float f10, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawPoint(f5, f10, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i4, int i5, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawPoints(fArr, i4, i5, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i4, int i5, float[] fArr, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawPosText(cArr, i4, i5, fArr, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i4, int i5, int i10) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawRGB(i4, i5, i10);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawRect(rectF, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawRenderNode(renderNode);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f5, float f10, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawRoundRect(rectF, f5, f10, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i4, int i5, float f5, float f10, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawText(cArr, i4, i5, f5, f10, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i4, int i5, Path path, float f5, float f10, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawTextOnPath(cArr, i4, i5, path, f5, f10, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i4, int i5, int i10, int i11, float f5, float f10, boolean z2, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawTextRun(cArr, i4, i5, i10, i11, f5, f10, z2, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i4, float[] fArr, int i5, float[] fArr2, int i10, int[] iArr, int i11, short[] sArr, int i12, int i13, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawVertices(vertexMode, i4, fArr, i5, fArr2, i10, iArr, i11, sArr, i12, i13, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            AbstractC0340a.foxtrot(canvas);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            boolean clipBounds = canvas.getClipBounds(rect);
            if (clipBounds) {
                rect.set(0, 0, rect.width(), LottieConstants.IterateForever);
            }
            return clipBounds;
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.getDensity();
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.getDrawFilter();
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.getHeight();
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.getMatrix(matrix);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.getMaximumBitmapHeight();
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.getMaximumBitmapWidth();
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.getSaveCount();
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.getWidth();
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.isOpaque();
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.quickReject(rectF, edgeType);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.restore();
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i4) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.restoreToCount(i4);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f5) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.rotate(f5);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int save() {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.save();
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i4) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint, i4);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i4, int i5) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i4, i5);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void scale(float f5, float f10) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.scale(f5, f10);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.setBitmap(bitmap);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i4) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.setDensity(i4);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.setDrawFilter(drawFilter);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.setMatrix(matrix);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void skew(float f5, float f10) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.skew(f5, f10);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void translate(float f5, float f10) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.translate(f5, f10);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.clipPath(path);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.clipRect(rect, op);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f5, float f10, float f11, float f12, float f13, float f14, boolean z2, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawArc(f5, f10, f11, f12, f13, f14, z2, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rectF, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j5) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawColor(j5);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawLines(fArr, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f5, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawOval(f5, f10, f11, f12, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawPicture(picture, rectF);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawPoints(fArr, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawPosText(str, fArr, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawRect(rect, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f5, float f10, float f11, float f12, float f13, float f14, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawRoundRect(f5, f10, f11, f12, f13, f14, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f5, float f10, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawText(str, f5, f10, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f5, float f10, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawTextOnPath(str, path, f5, f10, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        boolean quickReject;
        Canvas canvas = this.alpha;
        if (canvas != null) {
            quickReject = canvas.quickReject(rectF);
            return quickReject;
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.saveLayer(rectF, paint);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i4) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.saveLayerAlpha(rectF, i4);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.clipRect(rectF);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, rect, rect2, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawPicture(picture, rect);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f5, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawRect(f5, f10, f11, f12, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i4, int i5, float f5, float f10, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawText(str, i4, i5, f5, f10, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f5, float f10, float f11, float f12, Paint paint, int i4) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.saveLayer(f5, f10, f11, f12, paint, i4);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f5, float f10, float f11, float f12, int i4, int i5) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f5, f10, f11, f12, i4, i5);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        boolean clipOutRect;
        Canvas canvas = this.alpha;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(rect);
            return clipOutRect;
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.clipRect(rect);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i4, int i5, float f5, float f10, int i10, int i11, boolean z2, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i4, i5, f5, f10, i10, i11, z2, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawPatch(ninePatch, rectF, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i4, int i5, float f5, float f10, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawText(charSequence, i4, i5, f5, f10, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i4, int i5, int i10, int i11, float f5, float f10, boolean z2, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawTextRun(charSequence, i4, i5, i10, i11, f5, f10, z2, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f5, float f10, float f11, float f12, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.saveLayer(f5, f10, f11, f12, paint);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f5, float f10, float f11, float f12, int i4) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.saveLayerAlpha(f5, f10, f11, f12, i4);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f5, float f10, float f11, float f12, Region.Op op) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.clipRect(f5, f10, f11, f12, op);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i4, int i5, int i10, int i11, int i12, int i13, boolean z2, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawBitmap(iArr, i4, i5, i10, i11, i12, i13, z2, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i4, PorterDuff.Mode mode) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawColor(i4, mode);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.quickReject(path, edgeType);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f5, float f10, float f11, float f12) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.clipRect(f5, f10, f11, f12);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawBitmap(bitmap, matrix, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i4, BlendMode blendMode) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawColor(i4, blendMode);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        boolean quickReject;
        Canvas canvas = this.alpha;
        if (canvas != null) {
            quickReject = canvas.quickReject(path);
            return quickReject;
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f5, float f10, float f11, float f12) {
        boolean clipOutRect;
        Canvas canvas = this.alpha;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(f5, f10, f11, f12);
            return clipOutRect;
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i4, int i5, int i10, int i11) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.clipRect(i4, i5, i10, i11);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i4, int i5, int i10, int i11, float f5, float f10, boolean z2, Paint paint) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawTextRun(measuredText, i4, i5, i10, i11, f5, f10, z2, paint);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j5, BlendMode blendMode) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            canvas.drawColor(j5, blendMode);
        } else {
            Intrinsics.lima("nativeCanvas");
            throw null;
        }
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f5, float f10, float f11, float f12, Canvas.EdgeType edgeType) {
        Canvas canvas = this.alpha;
        if (canvas != null) {
            return canvas.quickReject(f5, f10, f11, f12, edgeType);
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i4, int i5, int i10, int i11) {
        boolean clipOutRect;
        Canvas canvas = this.alpha;
        if (canvas != null) {
            clipOutRect = canvas.clipOutRect(i4, i5, i10, i11);
            return clipOutRect;
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f5, float f10, float f11, float f12) {
        boolean quickReject;
        Canvas canvas = this.alpha;
        if (canvas != null) {
            quickReject = canvas.quickReject(f5, f10, f11, f12);
            return quickReject;
        }
        Intrinsics.lima("nativeCanvas");
        throw null;
    }
}
