package bp;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.M;
import t6.AbstractC3066u3;
import t6.Z3;

/* loaded from: classes3.dex */
public abstract class i {
    public Size alpha;
    public final FrameLayout bravo;
    public final d charlie;
    public boolean delta = false;

    public i(FrameLayout frameLayout, d dVar) {
        this.bravo = frameLayout;
        this.charlie = dVar;
    }

    public abstract View alpha();

    public abstract Bitmap bravo();

    public abstract void charlie();

    public abstract void delta();

    public abstract void echo(M m4, A2.p pVar);

    public final void foxtrot() {
        boolean z2;
        int i4;
        View alpha = alpha();
        if (alpha != null && this.delta) {
            FrameLayout frameLayout = this.bravo;
            Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
            int layoutDirection = frameLayout.getLayoutDirection();
            d dVar = this.charlie;
            dVar.getClass();
            if (size.getHeight() != 0 && size.getWidth() != 0) {
                if (dVar.foxtrot()) {
                    if (alpha instanceof TextureView) {
                        ((TextureView) alpha).setTransform(dVar.delta());
                    } else {
                        Display display = alpha.getDisplay();
                        boolean z10 = false;
                        if (dVar.golf && display != null && display.getRotation() != dVar.echo) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean z11 = dVar.golf;
                        if (!z11) {
                            if (!z11) {
                                i4 = dVar.charlie;
                            } else {
                                i4 = -Z3.bravo(dVar.echo);
                            }
                            if (i4 != 0) {
                                z10 = true;
                            }
                        }
                        if (z2 || z10) {
                            AbstractC3066u3.charlie("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                        }
                    }
                    RectF echo = dVar.echo(size, layoutDirection);
                    alpha.setPivotX(0.0f);
                    alpha.setPivotY(0.0f);
                    alpha.setScaleX(echo.width() / dVar.alpha.getWidth());
                    alpha.setScaleY(echo.height() / dVar.alpha.getHeight());
                    alpha.setTranslationX(echo.left - alpha.getLeft());
                    alpha.setTranslationY(echo.top - alpha.getTop());
                    return;
                }
                return;
            }
            AbstractC3066u3.india("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
        }
    }

    public abstract com.google.common.util.concurrent.e golf();
}
