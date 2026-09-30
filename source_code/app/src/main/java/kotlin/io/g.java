package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class g {
    public final File alpha;

    public g(File root) {
        Intrinsics.echo(root, "root");
        this.alpha = root;
    }

    public abstract File alpha();
}
