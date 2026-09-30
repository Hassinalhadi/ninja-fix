package Tf;

import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.AbstractC2360j;
import pf.InterfaceC2358h;

/* loaded from: classes3.dex */
public abstract class v extends u {

    @NotNull
    private final u delegate;

    public v(u delegate) {
        Intrinsics.echo(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // Tf.u
    @NotNull
    public ao appendingSink(@NotNull ah file, boolean z2) throws IOException {
        Intrinsics.echo(file, "file");
        return this.delegate.appendingSink(onPathParameter(file, "appendingSink", CTVariableUtils.FILE), z2);
    }

    @Override // Tf.u
    public void atomicMove(@NotNull ah source, @NotNull ah target) throws IOException {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        this.delegate.atomicMove(onPathParameter(source, "atomicMove", "source"), onPathParameter(target, "atomicMove", "target"));
    }

    @Override // Tf.u
    @NotNull
    public ah canonicalize(@NotNull ah path) throws IOException {
        Intrinsics.echo(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // Tf.u, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // Tf.u
    public void createDirectory(@NotNull ah dir, boolean z2) throws IOException {
        Intrinsics.echo(dir, "dir");
        this.delegate.createDirectory(onPathParameter(dir, "createDirectory", "dir"), z2);
    }

    @Override // Tf.u
    public void createSymlink(@NotNull ah source, @NotNull ah target) throws IOException {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        this.delegate.createSymlink(onPathParameter(source, "createSymlink", "source"), onPathParameter(target, "createSymlink", "target"));
    }

    @NotNull
    public final u delegate() {
        return this.delegate;
    }

    @Override // Tf.u
    public void delete(@NotNull ah path, boolean z2) throws IOException {
        Intrinsics.echo(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), z2);
    }

    @Override // Tf.u
    @NotNull
    public List<ah> list(@NotNull ah dir) throws IOException {
        Intrinsics.echo(dir, "dir");
        List list = this.delegate.list(onPathParameter(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((ah) it.next(), "list"));
        }
        kotlin.collections.p.quebec(arrayList);
        return arrayList;
    }

    @Override // Tf.u
    @Nullable
    public List<ah> listOrNull(@NotNull ah dir) {
        Intrinsics.echo(dir, "dir");
        List listOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
        if (listOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((ah) it.next(), "listOrNull"));
        }
        kotlin.collections.p.quebec(arrayList);
        return arrayList;
    }

    @Override // Tf.u
    @NotNull
    public InterfaceC2358h listRecursively(@NotNull ah dir, boolean z2) {
        Intrinsics.echo(dir, "dir");
        return AbstractC2360j.oscar(this.delegate.listRecursively(onPathParameter(dir, "listRecursively", "dir"), z2), new Aa.l(23, this));
    }

    @Override // Tf.u
    @Nullable
    public s metadataOrNull(@NotNull ah path) throws IOException {
        Intrinsics.echo(path, "path");
        s metadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (metadataOrNull == null) {
            return null;
        }
        ah ahVar = metadataOrNull.charlie;
        if (ahVar == null) {
            return metadataOrNull;
        }
        ah onPathResult = onPathResult(ahVar, "metadataOrNull");
        Map extras = metadataOrNull.hotel;
        Intrinsics.echo(extras, "extras");
        return new s(metadataOrNull.alpha, metadataOrNull.bravo, onPathResult, metadataOrNull.delta, metadataOrNull.echo, metadataOrNull.foxtrot, metadataOrNull.golf, extras);
    }

    @NotNull
    public ah onPathParameter(@NotNull ah path, @NotNull String functionName, @NotNull String parameterName) {
        Intrinsics.echo(path, "path");
        Intrinsics.echo(functionName, "functionName");
        Intrinsics.echo(parameterName, "parameterName");
        return path;
    }

    @NotNull
    public ah onPathResult(@NotNull ah path, @NotNull String functionName) {
        Intrinsics.echo(path, "path");
        Intrinsics.echo(functionName, "functionName");
        return path;
    }

    @Override // Tf.u
    @NotNull
    public r openReadOnly(@NotNull ah file) throws IOException {
        Intrinsics.echo(file, "file");
        return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", CTVariableUtils.FILE));
    }

    @Override // Tf.u
    @NotNull
    public r openReadWrite(@NotNull ah file, boolean z2, boolean z10) throws IOException {
        Intrinsics.echo(file, "file");
        return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", CTVariableUtils.FILE), z2, z10);
    }

    @Override // Tf.u
    public ao sink(ah file, boolean z2) {
        Intrinsics.echo(file, "file");
        return this.delegate.sink(onPathParameter(file, "sink", CTVariableUtils.FILE), z2);
    }

    @Override // Tf.u
    @NotNull
    public ap source(@NotNull ah file) throws IOException {
        Intrinsics.echo(file, "file");
        return this.delegate.source(onPathParameter(file, "source", CTVariableUtils.FILE));
    }

    @NotNull
    public String toString() {
        return kotlin.jvm.internal.u.alpha.bravo(getClass()).kilo() + '(' + this.delegate + ')';
    }
}
