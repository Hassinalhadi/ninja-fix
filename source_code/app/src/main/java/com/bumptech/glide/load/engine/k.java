package com.bumptech.glide.load.engine;

/* loaded from: classes3.dex */
public final class k {
    public static final k bravo = new k(0);
    public static final k charlie = new k(1);
    public static final k delta = new k(2);
    public final /* synthetic */ int alpha;

    public /* synthetic */ k(int i4) {
        this.alpha = i4;
    }

    public final boolean alpha(E3.a aVar) {
        switch (this.alpha) {
            case 0:
                return false;
            case 1:
                if (aVar != E3.a.red && aVar != E3.a.teal) {
                    return true;
                }
                return false;
            default:
                if (aVar == E3.a.purple) {
                    return true;
                }
                return false;
        }
    }
}
