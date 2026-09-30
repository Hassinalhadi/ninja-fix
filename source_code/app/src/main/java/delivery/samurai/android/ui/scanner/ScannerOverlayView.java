package delivery.samurai.android.ui.scanner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldelivery/samurai/android/ui/scanner/ScannerOverlayView;", "Landroid/view/View;", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScannerOverlayView extends View {
    public final float alpha;
    public final float purple;
    public final Paint red;
    public final Paint silver;
    public final Paint teal;
    public final RectF white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannerOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.echo(context, "context");
        int parseColor = Color.parseColor("#77000000");
        this.alpha = getResources().getDisplayMetrics().density * 39.0f;
        float f5 = getResources().getDisplayMetrics().density * 4.0f;
        this.purple = 0.75f;
        Paint paint = new Paint(1);
        paint.setColor(parseColor);
        paint.setStyle(Paint.Style.FILL);
        this.red = paint;
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.silver = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(f5);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        this.teal = paint3;
        this.white = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.echo(canvas, "canvas");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.red);
        float min = Math.min(getWidth(), getHeight()) * this.purple;
        float width = (getWidth() - min) / 2.0f;
        float height = (getHeight() - min) / 2.0f;
        RectF rectF = this.white;
        rectF.set(width, height, width + min, min + height);
        canvas.drawRect(rectF, this.silver);
        canvas.restoreToCount(saveLayer);
        float f5 = rectF.left;
        float f10 = rectF.top;
        float f11 = rectF.right;
        float f12 = rectF.bottom;
        float f13 = this.alpha;
        float f14 = f10 + f13;
        Paint paint = this.teal;
        canvas.drawLine(f5, f14, f5, f10, paint);
        float f15 = f5 + f13;
        canvas.drawLine(f5, f10, f15, f10, paint);
        float f16 = f11 - f13;
        canvas.drawLine(f16, f10, f11, f10, paint);
        canvas.drawLine(f11, f10, f11, f14, paint);
        float f17 = f12 - f13;
        canvas.drawLine(f5, f17, f5, f12, paint);
        canvas.drawLine(f5, f12, f15, f12, paint);
        canvas.drawLine(f16, f12, f11, f12, paint);
        canvas.drawLine(f11, f12, f11, f17, paint);
    }
}
