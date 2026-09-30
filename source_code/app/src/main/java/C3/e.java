package C3;

import java.io.File;

/* loaded from: classes3.dex */
public final class e {
    public final String alpha;
    public final long[] bravo;
    public final File[] charlie;
    public final File[] delta;
    public boolean echo;
    public d foxtrot;
    public final /* synthetic */ f golf;

    public e(f fVar, String str) {
        this.golf = fVar;
        this.alpha = str;
        int i4 = fVar.yellow;
        this.bravo = new long[i4];
        this.charlie = new File[i4];
        this.delta = new File[i4];
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i5 = 0; i5 < fVar.yellow; i5++) {
            sb2.append(i5);
            File[] fileArr = this.charlie;
            String sb3 = sb2.toString();
            File file = fVar.alpha;
            fileArr[i5] = new File(file, sb3);
            sb2.append(".tmp");
            this.delta[i5] = new File(file, sb2.toString());
            sb2.setLength(length);
        }
    }

    public final String alpha() {
        StringBuilder sb2 = new StringBuilder();
        for (long j5 : this.bravo) {
            sb2.append(' ');
            sb2.append(j5);
        }
        return sb2.toString();
    }
}
