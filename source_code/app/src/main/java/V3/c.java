package V3;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c {
    public static Integer delta;
    public final View alpha;
    public final ArrayList bravo = new ArrayList();
    public b charlie;

    public c(View view) {
        this.alpha = view;
    }

    public final int alpha(int i4, int i5, int i10) {
        int i11 = i5 - i10;
        if (i11 > 0) {
            return i11;
        }
        int i12 = i4 - i10;
        if (i12 > 0) {
            return i12;
        }
        View view = this.alpha;
        if (!view.isLayoutRequested() && i5 == -2) {
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            if (delta == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Y3.f.charlie(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                delta = Integer.valueOf(Math.max(point.x, point.y));
            }
            return delta.intValue();
        }
        return 0;
    }
}
