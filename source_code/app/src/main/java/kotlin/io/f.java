package kotlin.io;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends kotlin.collections.b {
    public final ArrayDeque red;
    public final /* synthetic */ h silver;

    public f(h hVar) {
        this.silver = hVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.red = arrayDeque;
        if (((File) hVar.bravo).isDirectory()) {
            arrayDeque.push(bravo((File) hVar.bravo));
        } else {
            if (((File) hVar.bravo).isFile()) {
                File rootFile = (File) hVar.bravo;
                Intrinsics.echo(rootFile, "rootFile");
                arrayDeque.push(new g(rootFile));
                return;
            }
            this.alpha = 2;
        }
    }

    @Override // kotlin.collections.b
    public final void alpha() {
        File file;
        File alpha;
        while (true) {
            ArrayDeque arrayDeque = this.red;
            g gVar = (g) arrayDeque.peek();
            if (gVar == null) {
                file = null;
                break;
            }
            alpha = gVar.alpha();
            if (alpha == null) {
                arrayDeque.pop();
            } else {
                if (Intrinsics.areEqual(alpha, gVar.alpha) || !alpha.isDirectory()) {
                    break;
                }
                int size = arrayDeque.size();
                this.silver.getClass();
                if (size >= Integer.MAX_VALUE) {
                    break;
                } else {
                    arrayDeque.push(bravo(alpha));
                }
            }
        }
        file = alpha;
        if (file != null) {
            this.purple = file;
            this.alpha = 1;
        } else {
            this.alpha = 2;
        }
    }

    public final b bravo(File file) {
        int ordinal = ((i) this.silver.charlie).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new c(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new e(this, file);
    }
}
