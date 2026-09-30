package androidx.core.widget;

/* loaded from: classes3.dex */
public abstract class e {
    public static void alpha(NestedScrollView nestedScrollView, float f5) {
        try {
            nestedScrollView.setFrameContentVelocity(f5);
        } catch (LinkageError unused) {
        }
    }
}
