package Tf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class af extends ad {
    public static s echo(Path path) {
        Path path2;
        ah ahVar;
        Long l10;
        Long l11;
        Long l12 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            if (readAttributes.isSymbolicLink()) {
                path2 = Files.readSymbolicLink(path);
            } else {
                path2 = null;
            }
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (path2 != null) {
                String str = ah.purple;
                ahVar = r6.u.delta(path2);
            } else {
                ahVar = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l10 = foxtrot(creationTime);
            } else {
                l10 = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l11 = foxtrot(lastModifiedTime);
            } else {
                l11 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l12 = foxtrot(lastAccessTime);
            }
            return new s(isRegularFile, isDirectory, ahVar, valueOf, l10, l11, l12);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    public static Long foxtrot(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // Tf.ad, Tf.u
    public void atomicMove(ah source, ah target) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        try {
            Files.move(source.hotel(), target.hotel(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // Tf.ad, Tf.u
    public void createSymlink(ah source, ah target) {
        Intrinsics.echo(source, "source");
        Intrinsics.echo(target, "target");
        Files.createSymbolicLink(source.hotel(), target.hotel(), new FileAttribute[0]);
    }

    @Override // Tf.ad, Tf.u
    public s metadataOrNull(ah path) {
        Intrinsics.echo(path, "path");
        return echo(path.hotel());
    }

    @Override // Tf.ad
    public String toString() {
        return "NioSystemFileSystem";
    }
}
