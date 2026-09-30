package bi;

import android.util.Size;

/* loaded from: classes3.dex */
public abstract class b {
    public static final Size alpha = new Size(0, 0);
    public static final Size bravo;
    public static final Size charlie;
    public static final Size delta;
    public static final Size echo;
    public static final Size foxtrot;

    static {
        new Size(320, 240);
        bravo = new Size(640, 480);
        charlie = new Size(720, 480);
        delta = new Size(1280, 720);
        echo = new Size(1920, 1080);
        foxtrot = new Size(1920, 1440);
    }

    public static int alpha(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
