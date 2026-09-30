package Tf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ad extends u {
    public static ArrayList charlie(ah ahVar, boolean z2) {
        File golf = ahVar.golf();
        String[] list = golf.list();
        if (list == null) {
            if (z2) {
                if (!golf.exists()) {
                    throw new FileNotFoundException(Q0.c.november(ahVar, "no such file: "));
                }
                throw new IOException(Q0.c.november(ahVar, "failed to list "));
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Intrinsics.checkNotNull(str);
            arrayList.add(ahVar.foxtrot(str));
        }
        kotlin.collections.p.quebec(arrayList);
        return arrayList;
    }

    @Override // Tf.u
    public ao appendingSink(ah file, boolean z2) {
        Intrinsics.echo(file, "file");
        if (z2 && !exists(file)) {
            throw new IOException(file + " doesn't exist.");
        }
        return b.hotel(new FileOutputStream(file.golf(), true));
    }

    @Override // Tf.u
    public void atomicMove(ah source, ah target) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        if (source.golf().renameTo(target.golf())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // Tf.u
    public ah canonicalize(ah path) {
        Intrinsics.echo(path, "path");
        File canonicalFile = path.golf().getCanonicalFile();
        if (canonicalFile.exists()) {
            String str = ah.purple;
            Intrinsics.checkNotNull(canonicalFile);
            return r6.u.charlie(canonicalFile);
        }
        throw new FileNotFoundException("no such file");
    }

    @Override // Tf.u
    public void createDirectory(ah dir, boolean z2) {
        Intrinsics.echo(dir, "dir");
        if (!dir.golf().mkdir()) {
            s metadataOrNull = metadataOrNull(dir);
            if (metadataOrNull != null && metadataOrNull.bravo) {
                if (z2) {
                    throw new IOException(dir + " already exists.");
                }
                return;
            }
            throw new IOException(Q0.c.november(dir, "failed to create directory: "));
        }
    }

    @Override // Tf.u
    public void createSymlink(ah source, ah target) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        throw new IOException("unsupported");
    }

    @Override // Tf.u
    public void delete(ah path, boolean z2) {
        Intrinsics.echo(path, "path");
        if (!Thread.interrupted()) {
            File golf = path.golf();
            if (!golf.delete()) {
                if (!golf.exists()) {
                    if (z2) {
                        throw new FileNotFoundException(Q0.c.november(path, "no such file: "));
                    }
                    return;
                }
                throw new IOException(Q0.c.november(path, "failed to delete "));
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // Tf.u
    public List list(ah dir) {
        Intrinsics.echo(dir, "dir");
        ArrayList charlie = charlie(dir, true);
        Intrinsics.checkNotNull(charlie);
        return charlie;
    }

    @Override // Tf.u
    public List listOrNull(ah dir) {
        Intrinsics.echo(dir, "dir");
        return charlie(dir, false);
    }

    @Override // Tf.u
    public s metadataOrNull(ah path) {
        Intrinsics.echo(path, "path");
        File golf = path.golf();
        boolean isFile = golf.isFile();
        boolean isDirectory = golf.isDirectory();
        long lastModified = golf.lastModified();
        long length = golf.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !golf.exists()) {
            return null;
        }
        return new s(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // Tf.u
    public r openReadOnly(ah file) {
        Intrinsics.echo(file, "file");
        return new ac(false, new RandomAccessFile(file.golf(), "r"));
    }

    @Override // Tf.u
    public r openReadWrite(ah file, boolean z2, boolean z10) {
        Intrinsics.echo(file, "file");
        if (z2 && z10) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z2 && exists(file)) {
            throw new IOException(file + " already exists.");
        }
        if (z10 && !exists(file)) {
            throw new IOException(file + " doesn't exist.");
        }
        return new ac(true, new RandomAccessFile(file.golf(), "rw"));
    }

    @Override // Tf.u
    public ao sink(ah file, boolean z2) {
        Intrinsics.echo(file, "file");
        if (z2 && exists(file)) {
            throw new IOException(file + " already exists.");
        }
        return b.hotel(new FileOutputStream(file.golf(), false));
    }

    @Override // Tf.u
    public ap source(ah file) {
        Intrinsics.echo(file, "file");
        return new f(new FileInputStream(file.golf()), as.NONE);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
