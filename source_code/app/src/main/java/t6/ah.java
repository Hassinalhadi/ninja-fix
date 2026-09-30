package t6;

/* loaded from: classes2.dex */
public abstract class ah {
    public static final /* synthetic */ int alpha = 0;

    public static int alpha(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (int) (Integer.rotateLeft((int) (hashCode * (-862048943)), 15) * 461845907);
    }
}
