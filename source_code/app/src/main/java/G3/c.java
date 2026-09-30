package G3;

/* loaded from: classes3.dex */
public final class c {
    public final /* synthetic */ int alpha;

    public final int alpha(Object obj) {
        switch (this.alpha) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final int bravo() {
        switch (this.alpha) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final String charlie() {
        switch (this.alpha) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
