package Tf;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf.C2359i;
import pf.InterfaceC2358h;
import s6.AbstractC2689j6;
import s6.AbstractC2770s7;

/* loaded from: classes3.dex */
public abstract class u implements Closeable, AutoCloseable {

    @NotNull
    public static final t Companion = new Object();

    @NotNull
    public static final u RESOURCES;

    @NotNull
    public static final u SYSTEM;

    @NotNull
    public static final ah SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m4write$default(u uVar, ah file, boolean z2, Function1 writerAction, int i4, Object obj) throws IOException {
        ?? r32;
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z2 = false;
            }
            Intrinsics.echo(file, "file");
            Intrinsics.echo(writerAction, "writerAction");
            aj bravo = b.bravo(uVar.sink(file, z2));
            Object th = null;
            try {
                Object invoke = writerAction.invoke(bravo);
                try {
                    bravo.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                r32 = th;
                th = invoke;
            } catch (Throwable th3) {
                try {
                    bravo.close();
                    r32 = th3;
                } catch (Throwable th4) {
                    AbstractC2689j6.charlie(th3, th4);
                    r32 = th3;
                }
            }
            if (r32 == 0) {
                return th;
            }
            throw r32;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Tf.t] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Tf.u] */
    static {
        ?? r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        SYSTEM = r02;
        String str = ah.purple;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.delta(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = r6.u.bravo(property, false);
        ClassLoader classLoader = Uf.h.class.getClassLoader();
        Intrinsics.delta(classLoader, "getClassLoader(...)");
        RESOURCES = new Uf.h(classLoader);
    }

    public static /* synthetic */ ao appendingSink$default(u uVar, ah ahVar, boolean z2, int i4, Object obj) throws IOException {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z2 = false;
            }
            return uVar.appendingSink(ahVar, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
    }

    public static /* synthetic */ void createDirectories$default(u uVar, ah ahVar, boolean z2, int i4, Object obj) throws IOException {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z2 = false;
            }
            uVar.createDirectories(ahVar, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
    }

    public static /* synthetic */ void createDirectory$default(u uVar, ah ahVar, boolean z2, int i4, Object obj) throws IOException {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z2 = false;
            }
            uVar.createDirectory(ahVar, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
    }

    public static /* synthetic */ void delete$default(u uVar, ah ahVar, boolean z2, int i4, Object obj) throws IOException {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z2 = false;
            }
            uVar.delete(ahVar, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
    }

    public static /* synthetic */ void deleteRecursively$default(u uVar, ah ahVar, boolean z2, int i4, Object obj) throws IOException {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z2 = false;
            }
            uVar.deleteRecursively(ahVar, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
    }

    @NotNull
    public static final u get(@NotNull FileSystem fileSystem) {
        Companion.getClass();
        Intrinsics.echo(fileSystem, "<this>");
        return new ae(fileSystem);
    }

    public static /* synthetic */ InterfaceC2358h listRecursively$default(u uVar, ah ahVar, boolean z2, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z2 = false;
            }
            return uVar.listRecursively(ahVar, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
    }

    public static /* synthetic */ r openReadWrite$default(u uVar, ah ahVar, boolean z2, boolean z10, int i4, Object obj) throws IOException {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z2 = false;
            }
            if ((i4 & 4) != 0) {
                z10 = false;
            }
            return uVar.openReadWrite(ahVar, z2, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
    }

    public static /* synthetic */ ao sink$default(u uVar, ah ahVar, boolean z2, int i4, Object obj) throws IOException {
        if (obj == null) {
            if ((i4 & 2) != 0) {
                z2 = false;
            }
            return uVar.sink(ahVar, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* renamed from: -read, reason: not valid java name */
    public final <T> T m5read(@NotNull ah file, @NotNull Function1<? super m, ? extends T> readerAction) throws IOException {
        ?? r4;
        Intrinsics.echo(file, "file");
        Intrinsics.echo(readerAction, "readerAction");
        ak charlie = b.charlie(source(file));
        T th = null;
        try {
            T invoke = readerAction.invoke(charlie);
            try {
                charlie.close();
            } catch (Throwable th2) {
                th = th2;
            }
            T t5 = th;
            th = invoke;
            r4 = t5;
        } catch (Throwable th3) {
            try {
                charlie.close();
                r4 = th3;
            } catch (Throwable th4) {
                AbstractC2689j6.charlie(th3, th4);
                r4 = th3;
            }
        }
        if (r4 == 0) {
            return th;
        }
        throw r4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* renamed from: -write, reason: not valid java name */
    public final <T> T m6write(@NotNull ah file, boolean z2, @NotNull Function1<? super l, ? extends T> writerAction) throws IOException {
        ?? r5;
        Intrinsics.echo(file, "file");
        Intrinsics.echo(writerAction, "writerAction");
        aj bravo = b.bravo(sink(file, z2));
        T th = null;
        try {
            T invoke = writerAction.invoke(bravo);
            try {
                bravo.close();
            } catch (Throwable th2) {
                th = th2;
            }
            r5 = th;
            th = invoke;
        } catch (Throwable th3) {
            try {
                bravo.close();
                r5 = th3;
            } catch (Throwable th4) {
                AbstractC2689j6.charlie(th3, th4);
                r5 = th3;
            }
        }
        if (r5 == 0) {
            return th;
        }
        throw r5;
    }

    @NotNull
    public final ao appendingSink(@NotNull ah file) throws IOException {
        Intrinsics.echo(file, "file");
        return appendingSink(file, false);
    }

    public abstract ao appendingSink(ah ahVar, boolean z2);

    public abstract void atomicMove(ah ahVar, ah ahVar2);

    public abstract ah canonicalize(ah ahVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void copy(@NotNull ah source, @NotNull ah target) throws IOException {
        Throwable th;
        Long l10;
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        ap source2 = source(source);
        Throwable th2 = null;
        try {
            aj bravo = b.bravo(sink$default(this, target, false, 2, null));
            try {
                l10 = Long.valueOf(bravo.f(source2));
                try {
                    bravo.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    bravo.close();
                } catch (Throwable th5) {
                    AbstractC2689j6.charlie(th4, th5);
                }
                th = th4;
                l10 = null;
            }
        } catch (Throwable th6) {
            th2 = th6;
            if (source2 != null) {
                try {
                    source2.close();
                } catch (Throwable th7) {
                    AbstractC2689j6.charlie(th2, th7);
                }
            }
        }
        if (th == null) {
            l10.getClass();
            if (source2 != null) {
                try {
                    source2.close();
                } catch (Throwable th8) {
                    th2 = th8;
                }
            }
            if (th2 == null) {
                return;
            } else {
                throw th2;
            }
        }
        throw th;
    }

    public final void createDirectories(@NotNull ah dir, boolean z2) throws IOException {
        Intrinsics.echo(dir, "dir");
        kotlin.collections.l lVar = new kotlin.collections.l();
        for (ah ahVar = dir; ahVar != null && !exists(ahVar); ahVar = ahVar.charlie()) {
            lVar.addFirst(ahVar);
        }
        if (z2 && lVar.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = lVar.iterator();
        while (it.hasNext()) {
            createDirectory$default(this, (ah) it.next(), false, 2, null);
        }
    }

    public final void createDirectory(@NotNull ah dir) throws IOException {
        Intrinsics.echo(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(ah ahVar, boolean z2);

    public abstract void createSymlink(ah ahVar, ah ahVar2);

    public final void delete(@NotNull ah path) throws IOException {
        Intrinsics.echo(path, "path");
        delete(path, false);
    }

    public abstract void delete(ah ahVar, boolean z2);

    public void deleteRecursively(@NotNull ah fileOrDirectory, boolean z2) throws IOException {
        Intrinsics.echo(fileOrDirectory, "fileOrDirectory");
        C2359i bravo = AbstractC2770s7.bravo(new Uf.d(this, fileOrDirectory, null));
        while (bravo.hasNext()) {
            delete((ah) bravo.next(), z2 && !bravo.hasNext());
        }
    }

    public final boolean exists(@NotNull ah path) throws IOException {
        Intrinsics.echo(path, "path");
        if (metadataOrNull(path) != null) {
            return true;
        }
        return false;
    }

    public abstract List list(ah ahVar);

    public abstract List listOrNull(ah ahVar);

    @NotNull
    public final InterfaceC2358h listRecursively(@NotNull ah dir) {
        Intrinsics.echo(dir, "dir");
        return listRecursively(dir, false);
    }

    @NotNull
    public final s metadata(@NotNull ah path) throws IOException {
        Intrinsics.echo(path, "path");
        s metadataOrNull = metadataOrNull(path);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new FileNotFoundException(Q0.c.november(path, "no such file: "));
    }

    public abstract s metadataOrNull(ah ahVar);

    public abstract r openReadOnly(ah ahVar);

    @NotNull
    public final r openReadWrite(@NotNull ah file) throws IOException {
        Intrinsics.echo(file, "file");
        return openReadWrite(file, false, false);
    }

    public abstract r openReadWrite(ah ahVar, boolean z2, boolean z10);

    @NotNull
    public final ao sink(@NotNull ah file) throws IOException {
        Intrinsics.echo(file, "file");
        return sink(file, false);
    }

    public abstract ao sink(ah ahVar, boolean z2);

    public abstract ap source(ah ahVar);

    public InterfaceC2358h listRecursively(ah dir, boolean z2) {
        Intrinsics.echo(dir, "dir");
        return new kotlin.collections.o(new Uf.e(dir, this, z2, null));
    }

    public final void deleteRecursively(@NotNull ah fileOrDirectory) throws IOException {
        Intrinsics.echo(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    public final void createDirectories(@NotNull ah dir) throws IOException {
        Intrinsics.echo(dir, "dir");
        createDirectories(dir, false);
    }
}
