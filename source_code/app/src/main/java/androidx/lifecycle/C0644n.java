package androidx.lifecycle;

import java.util.ArrayDeque;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0644n {
    public boolean bravo;
    public boolean charlie;
    public boolean alpha = true;
    public final ArrayDeque delta = new ArrayDeque();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0020 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0007, B:9:0x000b, B:11:0x0011, B:13:0x0015, B:18:0x0020, B:21:0x0028), top: B:6:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha() {
        boolean z2;
        if (this.charlie) {
            return;
        }
        try {
            this.charlie = true;
            while (true) {
                ArrayDeque arrayDeque = this.delta;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                if (!this.bravo && this.alpha) {
                    z2 = false;
                    if (z2) {
                        break;
                    }
                    Runnable runnable = (Runnable) arrayDeque.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                z2 = true;
                if (z2) {
                }
            }
        } finally {
            this.charlie = false;
        }
    }
}
