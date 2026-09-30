package i9;

import java.io.File;

/* loaded from: classes2.dex */
public final class d {
    public final String alpha;
    public final long[] bravo;
    public boolean charlie;
    public C1907c delta;
    public final /* synthetic */ f echo;

    public d(f fVar, String str) {
        this.echo = fVar;
        this.alpha = str;
        this.bravo = new long[fVar.yellow];
    }

    public final File alpha(int i4) {
        return new File(this.echo.alpha, this.alpha + "." + i4);
    }

    public final File bravo(int i4) {
        return new File(this.echo.alpha, this.alpha + "." + i4 + ".tmp");
    }

    public final String charlie() {
        StringBuilder sb2 = new StringBuilder();
        for (long j5 : this.bravo) {
            sb2.append(' ');
            sb2.append(j5);
        }
        return sb2.toString();
    }
}
