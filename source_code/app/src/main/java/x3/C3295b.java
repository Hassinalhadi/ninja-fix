package x3;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.squareup.picasso.Transformation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x3.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3295b implements Transformation {
    @Override // com.squareup.picasso.Transformation
    public final String key() {
        return "rounded";
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap transform(Bitmap source) {
        Intrinsics.echo(source, "source");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(source, tileMode, tileMode));
        Bitmap createBitmap = Bitmap.createBitmap(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.delta(createBitmap, "createBitmap(...)");
        float f5 = 4;
        float f10 = 50;
        new Canvas(createBitmap).drawRoundRect(new RectF(f5, f5, source.getWidth() - 4, source.getHeight() - 4), f10, f10, paint);
        if (!Intrinsics.areEqual(source, createBitmap)) {
            source.recycle();
        }
        return createBitmap;
    }
}
