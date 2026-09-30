package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends b {
    public boolean bravo;
    public File[] charlie;
    public int delta;
    public boolean echo;
    public final /* synthetic */ f foxtrot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, File rootDir) {
        super(rootDir);
        Intrinsics.echo(rootDir, "rootDir");
        this.foxtrot = fVar;
    }

    @Override // kotlin.io.g
    public final File alpha() {
        boolean z2 = this.echo;
        f fVar = this.foxtrot;
        File file = this.alpha;
        if (!z2 && this.charlie == null) {
            fVar.silver.getClass();
            File[] listFiles = file.listFiles();
            this.charlie = listFiles;
            if (listFiles == null) {
                fVar.silver.getClass();
                this.echo = true;
            }
        }
        File[] fileArr = this.charlie;
        if (fileArr != null) {
            int i4 = this.delta;
            Intrinsics.checkNotNull(fileArr);
            if (i4 < fileArr.length) {
                File[] fileArr2 = this.charlie;
                Intrinsics.checkNotNull(fileArr2);
                int i5 = this.delta;
                this.delta = i5 + 1;
                return fileArr2[i5];
            }
        }
        if (!this.bravo) {
            this.bravo = true;
            return file;
        }
        fVar.silver.getClass();
        return null;
    }
}
