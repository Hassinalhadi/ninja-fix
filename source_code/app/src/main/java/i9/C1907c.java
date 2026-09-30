package i9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: i9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1907c {
    public final d alpha;
    public final boolean[] bravo;
    public boolean charlie;
    public final /* synthetic */ f delta;

    public C1907c(f fVar, d dVar) {
        boolean[] zArr;
        this.delta = fVar;
        this.alpha = dVar;
        if (dVar.charlie) {
            zArr = null;
        } else {
            zArr = new boolean[fVar.yellow];
        }
        this.bravo = zArr;
    }

    public final void alpha() {
        f.charlie(this.delta, this, false);
    }

    public final OutputStream bravo(int i4) {
        FileOutputStream fileOutputStream;
        C1906b c1906b;
        synchronized (this.delta) {
            try {
                d dVar = this.alpha;
                if (dVar.delta == this) {
                    if (!dVar.charlie) {
                        this.bravo[i4] = true;
                    }
                    File bravo = dVar.bravo(i4);
                    try {
                        fileOutputStream = new FileOutputStream(bravo);
                    } catch (FileNotFoundException unused) {
                        this.delta.alpha.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(bravo);
                        } catch (FileNotFoundException unused2) {
                            return f.f12768i;
                        }
                    }
                    c1906b = new C1906b(this, fileOutputStream);
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1906b;
    }
}
