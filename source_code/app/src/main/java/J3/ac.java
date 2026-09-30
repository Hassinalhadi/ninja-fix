package J3;

import java.io.File;

/* loaded from: classes3.dex */
public final class ac implements r {
    public static final ac bravo = new ac(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ ac(int i4) {
        this.alpha = i4;
    }

    @Override // J3.r
    public final q alpha(Object obj, int i4, int i5, E3.i iVar) {
        switch (this.alpha) {
            case 0:
                return new q(new X3.d(obj), new d(1, obj));
            case 1:
                File file = (File) obj;
                return new q(new X3.d(file), new d(0, file));
            default:
                return null;
        }
    }

    @Override // J3.r
    public final boolean bravo(Object obj) {
        switch (this.alpha) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
