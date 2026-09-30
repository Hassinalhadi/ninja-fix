package P2;

import java.io.Closeable;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class c implements Closeable, AutoCloseable {
    public final b alpha;
    public boolean purple;
    public final /* synthetic */ f red;

    public c(f fVar, b bVar) {
        this.red = fVar;
        this.alpha = bVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.purple) {
            this.purple = true;
            f fVar = this.red;
            synchronized (fVar) {
                b bVar = this.alpha;
                int i4 = bVar.hotel - 1;
                bVar.hotel = i4;
                if (i4 == 0 && bVar.foxtrot) {
                    Regex regex = f.f1887j;
                    fVar.azure(bVar);
                }
            }
        }
    }
}
