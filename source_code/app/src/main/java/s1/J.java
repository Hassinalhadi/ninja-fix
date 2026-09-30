package s1;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import j1.C1929c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class J extends O {
    public static Field echo;
    public static boolean foxtrot;
    public static Constructor golf;
    public static boolean hotel;
    public WindowInsets charlie;
    public C1929c delta;

    public J() {
        this.charlie = india();
    }

    private static WindowInsets india() {
        if (!foxtrot) {
            try {
                echo = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            foxtrot = true;
        }
        Field field = echo;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
            }
        }
        if (!hotel) {
            try {
                golf = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
            }
            hotel = true;
        }
        Constructor constructor = golf;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
            }
        }
        return null;
    }

    @Override // s1.O
    public a0 bravo() {
        alpha();
        a0 hotel2 = a0.hotel(null, this.charlie);
        C1929c[] c1929cArr = this.bravo;
        X x4 = hotel2.alpha;
        x4.romeo(c1929cArr);
        x4.uniform(this.delta);
        return hotel2;
    }

    @Override // s1.O
    public void echo(C1929c c1929c) {
        this.delta = c1929c;
    }

    @Override // s1.O
    public void golf(C1929c c1929c) {
        WindowInsets windowInsets = this.charlie;
        if (windowInsets != null) {
            this.charlie = windowInsets.replaceSystemWindowInsets(c1929c.alpha, c1929c.bravo, c1929c.charlie, c1929c.delta);
        }
    }

    public J(a0 a0Var) {
        super(a0Var);
        this.charlie = a0Var.golf();
    }
}
