package av;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class ak {
    public static final Size echo = new Size(1920, 1080);
    public static final Size foxtrot = new Size(320, 240);
    public static final Size golf = new Size(640, 480);
    public static final Object hotel = new Object();
    public static volatile ak india;
    public final DisplayManager alpha;
    public volatile Size bravo = null;
    public final androidx.core.widget.f charlie = new androidx.core.widget.f(8);
    public final androidx.core.widget.f delta = new androidx.core.widget.f(6);

    public ak(Context context) {
        this.alpha = (DisplayManager) context.getSystemService("display");
    }

    public static ak bravo(Context context) {
        if (india == null) {
            synchronized (hotel) {
                try {
                    if (india == null) {
                        india = new ak(context);
                    }
                } finally {
                }
            }
        }
        return india;
    }

    public static Display delta(Display[] displayArr, boolean z2) {
        Display display = null;
        int i4 = -1;
        for (Display display2 : displayArr) {
            if (!z2 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i5 = point.x * point.y;
                if (i5 > i4) {
                    display = display2;
                    i4 = i5;
                }
            }
        }
        return display;
    }

    public final Size alpha() {
        Size bravo;
        Size size;
        Point point = new Point();
        charlie(false).getRealSize(point);
        Size size2 = new Size(point.x, point.y);
        Size size3 = bi.b.alpha;
        if (size2.getHeight() * size2.getWidth() < bi.b.alpha(foxtrot)) {
            if (((SmallDisplaySizeQuirk) this.delta.purple) != null) {
                size = (Size) SmallDisplaySizeQuirk.alpha.get(Build.MODEL.toUpperCase(Locale.US));
            } else {
                size = null;
            }
            size2 = size;
            if (size2 == null) {
                size2 = golf;
            }
        }
        if (size2.getHeight() > size2.getWidth()) {
            size2 = new Size(size2.getHeight(), size2.getWidth());
        }
        int height = size2.getHeight() * size2.getWidth();
        Size size4 = echo;
        if (height > size4.getHeight() * size4.getWidth()) {
            size2 = size4;
        }
        if (((ExtraCroppingQuirk) this.charlie.purple) != null && (bravo = ExtraCroppingQuirk.bravo(1)) != null) {
            if (bravo.getHeight() * bravo.getWidth() > size2.getHeight() * size2.getWidth()) {
                return bravo;
            }
        }
        return size2;
    }

    public final Display charlie(boolean z2) {
        Display[] displays = this.alpha.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display delta = delta(displays, z2);
        if (delta == null && z2) {
            delta = delta(displays, false);
        }
        if (delta != null) {
            return delta;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size echo() {
        if (this.bravo != null) {
            return this.bravo;
        }
        this.bravo = alpha();
        return this.bravo;
    }
}
