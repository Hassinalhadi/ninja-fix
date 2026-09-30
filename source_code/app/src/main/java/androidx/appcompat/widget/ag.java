package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import id.C1915c;
import k1.AbstractC2000c;
import k1.InterfaceC1999b;

/* loaded from: classes3.dex */
public class ag {
    public static final int[] charlie = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final AbsSeekBar alpha;
    public Bitmap bravo;

    public ag(AbsSeekBar absSeekBar) {
        this.alpha = absSeekBar;
    }

    public void alpha(AttributeSet attributeSet, int i4) {
        AbsSeekBar absSeekBar = this.alpha;
        C1915c victor = C1915c.victor(absSeekBar.getContext(), attributeSet, charlie, i4);
        Drawable papa = victor.papa(0);
        if (papa != null) {
            if (papa instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) papa;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i5 = 0; i5 < numberOfFrames; i5++) {
                    Drawable bravo = bravo(animationDrawable.getFrame(i5), true);
                    bravo.setLevel(10000);
                    animationDrawable2.addFrame(bravo, animationDrawable.getDuration(i5));
                }
                animationDrawable2.setLevel(10000);
                papa = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(papa);
        }
        Drawable papa2 = victor.papa(1);
        if (papa2 != null) {
            absSeekBar.setProgressDrawable(bravo(papa2, false));
        }
        victor.xray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable bravo(Drawable drawable, boolean z2) {
        boolean z10;
        if (drawable instanceof InterfaceC1999b) {
            ((AbstractC2000c) ((InterfaceC1999b) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    int id2 = layerDrawable.getId(i4);
                    Drawable drawable2 = layerDrawable.getDrawable(i4);
                    if (id2 != 16908301 && id2 != 16908303) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    drawableArr[i4] = bravo(drawable2, z10);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i5 = 0; i5 < numberOfLayers; i5++) {
                    layerDrawable2.setId(i5, layerDrawable.getId(i5));
                    layerDrawable2.setLayerGravity(i5, layerDrawable.getLayerGravity(i5));
                    layerDrawable2.setLayerWidth(i5, layerDrawable.getLayerWidth(i5));
                    layerDrawable2.setLayerHeight(i5, layerDrawable.getLayerHeight(i5));
                    layerDrawable2.setLayerInsetLeft(i5, layerDrawable.getLayerInsetLeft(i5));
                    layerDrawable2.setLayerInsetRight(i5, layerDrawable.getLayerInsetRight(i5));
                    layerDrawable2.setLayerInsetTop(i5, layerDrawable.getLayerInsetTop(i5));
                    layerDrawable2.setLayerInsetBottom(i5, layerDrawable.getLayerInsetBottom(i5));
                    layerDrawable2.setLayerInsetStart(i5, layerDrawable.getLayerInsetStart(i5));
                    layerDrawable2.setLayerInsetEnd(i5, layerDrawable.getLayerInsetEnd(i5));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.bravo == null) {
                    this.bravo = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                if (z2) {
                    return new ClipDrawable(shapeDrawable, 3, 1);
                }
                return shapeDrawable;
            }
        }
        return drawable;
    }
}
