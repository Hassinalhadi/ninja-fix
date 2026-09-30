package zendesk.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import av.q;
import com.squareup.picasso.Transformation;
import java.util.Locale;

/* loaded from: classes.dex */
public class PicassoTransformations {

    /* loaded from: classes.dex */
    public static class BlurTransformation implements Transformation {
        private final RenderScript rs;

        public BlurTransformation(Context context) {
            this.rs = RenderScript.create(context);
        }

        @Override // com.squareup.picasso.Transformation
        public String key() {
            return "blur";
        }

        @Override // com.squareup.picasso.Transformation
        public Bitmap transform(Bitmap bitmap) {
            Allocation allocation;
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            RenderScript renderScript = this.rs;
            ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            Allocation allocation2 = null;
            try {
                Allocation createFromBitmap = Allocation.createFromBitmap(this.rs, copy, Allocation.MipmapControl.MIPMAP_FULL, 128);
                try {
                    allocation2 = Allocation.createTyped(this.rs, createFromBitmap.getType());
                    create.setInput(createFromBitmap);
                    create.setRadius(25.0f);
                    create.forEach(allocation2);
                    allocation2.copyTo(copy);
                    bitmap.recycle();
                    this.rs.destroy();
                    create.destroy();
                    createFromBitmap.destroy();
                    allocation2.destroy();
                    return copy;
                } catch (Throwable th) {
                    th = th;
                    allocation = allocation2;
                    allocation2 = createFromBitmap;
                    bitmap.recycle();
                    this.rs.destroy();
                    create.destroy();
                    if (allocation2 != null) {
                        allocation2.destroy();
                    }
                    if (allocation != null) {
                        allocation.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                allocation = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class RoundedTransformation implements Transformation {
        private final int radius;
        private final int strokeColor;
        private final int strokeWidth;

        public RoundedTransformation(int i4) {
            this(i4, 0, -1);
        }

        private RectF getMask(int i4, int i5, int i10) {
            float f5 = i10;
            return new RectF(f5, f5, i4 - i10, i5 - i10);
        }

        private Paint shapePaint(Bitmap bitmap) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            return paint;
        }

        private Paint strokePaint() {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.strokeColor);
            return paint;
        }

        @Override // com.squareup.picasso.Transformation
        public String key() {
            Locale locale = Locale.US;
            int i4 = this.radius;
            int i5 = this.strokeColor;
            int i10 = this.strokeWidth;
            StringBuilder hotel = q.hotel(i4, i5, "rounded-", "-", "-");
            hotel.append(i10);
            return hotel.toString();
        }

        @Override // com.squareup.picasso.Transformation
        public Bitmap transform(Bitmap bitmap) {
            if (this.strokeWidth > 0) {
                if (!bitmap.isMutable()) {
                    Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                    if (copy != bitmap) {
                        bitmap.recycle();
                    }
                    bitmap = copy;
                }
                Canvas canvas = new Canvas(bitmap);
                Paint strokePaint = strokePaint();
                Path path = new Path();
                path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
                RectF mask = getMask(bitmap.getWidth(), bitmap.getHeight(), this.strokeWidth);
                int i4 = this.radius;
                path.addRoundRect(mask, i4, i4, Path.Direction.CW);
                canvas.drawPath(path, strokePaint);
            }
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            Paint shapePaint = shapePaint(bitmap);
            RectF mask2 = getMask(bitmap.getWidth(), bitmap.getHeight(), 0);
            int i5 = this.radius;
            canvas2.drawRoundRect(mask2, i5, i5, shapePaint);
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            return createBitmap;
        }

        public RoundedTransformation(int i4, int i5, int i10) {
            this.radius = i4;
            this.strokeColor = i5;
            this.strokeWidth = i10;
        }
    }

    private PicassoTransformations() {
    }

    public static Transformation getBlurTransformation(Context context) {
        return new BlurTransformation(context);
    }

    public static Transformation getRoundWithBorderTransformation(int i4, int i5, int i10) {
        return new RoundedTransformation(i4, i5, i10);
    }

    public static Transformation getRoundedTransformation(int i4) {
        return new RoundedTransformation(i4);
    }
}
