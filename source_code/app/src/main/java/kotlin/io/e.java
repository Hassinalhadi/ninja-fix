package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends b {
    public boolean bravo;
    public File[] charlie;
    public int delta;
    public final /* synthetic */ f echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, File rootDir) {
        super(rootDir);
        Intrinsics.echo(rootDir, "rootDir");
        this.echo = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r0.length == 0) goto L22;
     */
    @Override // kotlin.io.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final File alpha() {
        boolean z2 = this.bravo;
        f fVar = this.echo;
        File file = this.alpha;
        if (!z2) {
            fVar.silver.getClass();
            this.bravo = true;
            return file;
        }
        File[] fileArr = this.charlie;
        if (fileArr != null) {
            int i4 = this.delta;
            Intrinsics.checkNotNull(fileArr);
            if (i4 >= fileArr.length) {
                fVar.silver.getClass();
                return null;
            }
        }
        if (this.charlie == null) {
            File[] listFiles = file.listFiles();
            this.charlie = listFiles;
            if (listFiles == null) {
                fVar.silver.getClass();
            }
            File[] fileArr2 = this.charlie;
            if (fileArr2 != null) {
                Intrinsics.checkNotNull(fileArr2);
            }
            fVar.silver.getClass();
            return null;
        }
        File[] fileArr3 = this.charlie;
        Intrinsics.checkNotNull(fileArr3);
        int i5 = this.delta;
        this.delta = i5 + 1;
        return fileArr3[i5];
    }
}
