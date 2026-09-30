package Tf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2716m6;

/* loaded from: classes3.dex */
public final class ae extends af {
    public final FileSystem alpha;

    public ae(FileSystem fileSystem) {
        this.alpha = fileSystem;
    }

    @Override // Tf.ad, Tf.u
    public final ao appendingSink(ah file, boolean z2) {
        Intrinsics.echo(file, "file");
        Ld.c hotel = kotlin.collections.ab.hotel();
        hotel.add(StandardOpenOption.APPEND);
        if (!z2) {
            hotel.add(StandardOpenOption.CREATE);
        }
        Ld.c alpha = kotlin.collections.ab.alpha(hotel);
        Path juliet = juliet(file);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) alpha.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream newOutputStream = Files.newOutputStream(juliet, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.delta(newOutputStream, "newOutputStream(...)");
        return b.hotel(newOutputStream);
    }

    @Override // Tf.af, Tf.ad, Tf.u
    public final void atomicMove(ah source, ah target) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        try {
            Intrinsics.delta(Files.move(juliet(source), juliet(target), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)), "move(...)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // Tf.ad, Tf.u
    public final ah canonicalize(ah path) {
        Intrinsics.echo(path, "path");
        try {
            String str = ah.purple;
            Path realPath = juliet(path).toRealPath(new LinkOption[0]);
            Intrinsics.delta(realPath, "toRealPath(...)");
            return r6.u.delta(realPath);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(Q0.c.november(path, "no such file: "));
        }
    }

    @Override // Tf.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.alpha.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0.bravo == true) goto L8;
     */
    @Override // Tf.ad, Tf.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void createDirectory(ah dir, boolean z2) {
        boolean z10;
        Intrinsics.echo(dir, "dir");
        s metadataOrNull = metadataOrNull(dir);
        if (metadataOrNull != null) {
            z10 = true;
        }
        z10 = false;
        if (z10 && z2) {
            throw new IOException(dir + " already exists.");
        }
        try {
            Intrinsics.delta(Files.createDirectory(juliet(dir), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createDirectory(...)");
        } catch (IOException e) {
            if (z10) {
            } else {
                throw new IOException(Q0.c.november(dir, "failed to create directory: "), e);
            }
        }
    }

    @Override // Tf.af, Tf.ad, Tf.u
    public final void createSymlink(ah source, ah target) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        Intrinsics.delta(Files.createSymbolicLink(juliet(source), juliet(target), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createSymbolicLink(...)");
    }

    @Override // Tf.ad, Tf.u
    public final void delete(ah path, boolean z2) {
        Intrinsics.echo(path, "path");
        if (!Thread.interrupted()) {
            Path juliet = juliet(path);
            try {
                Files.delete(juliet);
                return;
            } catch (NoSuchFileException unused) {
                if (!z2) {
                    return;
                } else {
                    throw new FileNotFoundException(Q0.c.november(path, "no such file: "));
                }
            } catch (IOException unused2) {
                if (Files.exists(juliet, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw new IOException(Q0.c.november(path, "failed to delete "));
                }
                return;
            }
        }
        throw new InterruptedIOException("interrupted");
    }

    public final ArrayList golf(ah ahVar, boolean z2) {
        Path juliet = juliet(ahVar);
        try {
            DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(juliet, "*");
            try {
                Intrinsics.checkNotNull(newDirectoryStream);
                List<Path> z10 = CollectionsKt.z(newDirectoryStream);
                AbstractC2716m6.alpha(newDirectoryStream, null);
                ArrayList arrayList = new ArrayList();
                for (Path path : z10) {
                    String str = ah.purple;
                    arrayList.add(r6.u.delta(path));
                }
                kotlin.collections.p.quebec(arrayList);
                return arrayList;
            } finally {
            }
        } catch (Exception unused) {
            if (!z2) {
                return null;
            }
            if (!Files.exists(juliet, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new FileNotFoundException(Q0.c.november(ahVar, "no such file: "));
            }
            throw new IOException(Q0.c.november(ahVar, "failed to list "));
        }
    }

    public final Path juliet(ah ahVar) {
        Path path;
        path = this.alpha.getPath(ahVar.alpha.romeo(), new String[0]);
        Intrinsics.delta(path, "getPath(...)");
        return path;
    }

    @Override // Tf.ad, Tf.u
    public final List list(ah dir) {
        Intrinsics.echo(dir, "dir");
        ArrayList golf = golf(dir, true);
        Intrinsics.checkNotNull(golf);
        return golf;
    }

    @Override // Tf.ad, Tf.u
    public final List listOrNull(ah dir) {
        Intrinsics.echo(dir, "dir");
        return golf(dir, false);
    }

    @Override // Tf.af, Tf.ad, Tf.u
    public final s metadataOrNull(ah path) {
        Intrinsics.echo(path, "path");
        return af.echo(juliet(path));
    }

    @Override // Tf.ad, Tf.u
    public final r openReadOnly(ah file) {
        Intrinsics.echo(file, "file");
        try {
            FileChannel open = FileChannel.open(juliet(file), StandardOpenOption.READ);
            Intrinsics.checkNotNull(open);
            return new ac(false, open);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(Q0.c.november(file, "no such file: "));
        }
    }

    @Override // Tf.ad, Tf.u
    public final r openReadWrite(ah file, boolean z2, boolean z10) {
        Intrinsics.echo(file, "file");
        if (z2 && z10) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        Ld.c hotel = kotlin.collections.ab.hotel();
        hotel.add(StandardOpenOption.READ);
        hotel.add(StandardOpenOption.WRITE);
        if (z2) {
            hotel.add(StandardOpenOption.CREATE_NEW);
        } else if (!z10) {
            hotel.add(StandardOpenOption.CREATE);
        }
        Ld.c alpha = kotlin.collections.ab.alpha(hotel);
        try {
            Path juliet = juliet(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) alpha.toArray(new StandardOpenOption[0]);
            FileChannel open = FileChannel.open(juliet, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            Intrinsics.checkNotNull(open);
            return new ac(true, open);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(Q0.c.november(file, "no such file: "));
        }
    }

    @Override // Tf.ad, Tf.u
    public final ao sink(ah file, boolean z2) {
        Intrinsics.echo(file, "file");
        Ld.c hotel = kotlin.collections.ab.hotel();
        if (z2) {
            hotel.add(StandardOpenOption.CREATE_NEW);
        }
        Ld.c alpha = kotlin.collections.ab.alpha(hotel);
        try {
            Path juliet = juliet(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) alpha.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream newOutputStream = Files.newOutputStream(juliet, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            Intrinsics.delta(newOutputStream, "newOutputStream(...)");
            return b.hotel(newOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(Q0.c.november(file, "no such file: "));
        }
    }

    @Override // Tf.ad, Tf.u
    public final ap source(ah file) {
        Intrinsics.echo(file, "file");
        try {
            InputStream newInputStream = Files.newInputStream(juliet(file), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            Intrinsics.delta(newInputStream, "newInputStream(...)");
            return b.juliet(newInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(Q0.c.november(file, "no such file: "));
        }
    }

    @Override // Tf.af, Tf.ad
    public final String toString() {
        String kilo = kotlin.jvm.internal.u.alpha.bravo(this.alpha.getClass()).kilo();
        Intrinsics.checkNotNull(kilo);
        return kilo;
    }
}
