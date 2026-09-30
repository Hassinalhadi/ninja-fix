package J3;

import java.io.File;

/* loaded from: classes3.dex */
public final class c implements r {
    public final /* synthetic */ int alpha;
    public final Object bravo;

    public /* synthetic */ c(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // J3.r
    public final q alpha(Object obj, int i4, int i5, E3.i iVar) {
        switch (this.alpha) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new q(new X3.d(bArr), new m(1, bArr, (ab) this.bravo));
            case 1:
                return new q(new X3.d(obj), new F3.b(1, obj.toString(), (ab) this.bravo));
            default:
                File file = (File) obj;
                return new q(new X3.d(file), new F3.b(2, file, (ab) this.bravo));
        }
    }

    @Override // J3.r
    public final boolean bravo(Object obj) {
        switch (this.alpha) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }
}
