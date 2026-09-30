package kotlin.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.AbstractC2707l6;
import s6.AbstractC2716m6;
import s6.AbstractC2734o6;

@Metadata(d1 = {"s6/n6", "kotlin/io/FilesKt__FileReadWriteKt", "kotlin/io/FilesKt", "kotlin/io/FilesKt"}, d2 = {}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes2.dex */
public final class FilesKt extends FilesKt__FileReadWriteKt {
    private FilesKt() {
    }

    public static void foxtrot(File file, String text) {
        Charset charset = kotlin.text.a.alpha;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            FilesKt__FileReadWriteKt.echo(fileOutputStream, text, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static void golf(File file, File file2) {
        Intrinsics.echo(file, "<this>");
        if (file.exists()) {
            if (file2.exists() && !file2.delete()) {
                throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
            if (file.isDirectory()) {
                if (file2.mkdirs()) {
                    return;
                } else {
                    throw new FileSystemException(file, file2, "Failed to create target directory.");
                }
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    AbstractC2707l6.echo(fileInputStream, fileOutputStream);
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            } finally {
            }
        } else {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
    }

    public static boolean hotel(File file) {
        Intrinsics.echo(file, "<this>");
        i iVar = i.alpha;
        f fVar = new f(new h(file));
        while (true) {
            boolean z2 = true;
            while (fVar.hasNext()) {
                File file2 = (File) fVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z2) {
                        break;
                    }
                }
                z2 = false;
            }
            return z2;
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, kotlin.io.a] */
    public static byte[] india(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i4 = (int) length;
                byte[] bArr = new byte[i4];
                int i5 = i4;
                int i10 = 0;
                while (i5 > 0) {
                    int read = fileInputStream.read(bArr, i10, i5);
                    if (read < 0) {
                        break;
                    }
                    i5 -= read;
                    i10 += read;
                }
                if (i5 > 0) {
                    bArr = Arrays.copyOf(bArr, i10);
                    Intrinsics.delta(bArr, "copyOf(...)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        ?? byteArrayOutputStream = new ByteArrayOutputStream(8193);
                        byteArrayOutputStream.write(read2);
                        AbstractC2707l6.echo(fileInputStream, byteArrayOutputStream);
                        int size = byteArrayOutputStream.size() + i4;
                        if (size >= 0) {
                            byte[] charlie = byteArrayOutputStream.charlie();
                            bArr = Arrays.copyOf(bArr, size);
                            Intrinsics.delta(bArr, "copyOf(...)");
                            ArraysKt.xray(i4, 0, byteArrayOutputStream.size(), charlie, bArr);
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                fileInputStream.close();
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2716m6.alpha(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String juliet(File file, Charset charset) {
        Intrinsics.echo(file, "<this>");
        Intrinsics.echo(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String delta = AbstractC2734o6.delta(inputStreamReader);
            inputStreamReader.close();
            return delta;
        } finally {
        }
    }

    public static File lima(File file, String relative) {
        int i4;
        boolean z2;
        int emerald;
        Intrinsics.echo(file, "<this>");
        Intrinsics.echo(relative, "relative");
        File file2 = new File(relative);
        String path = file2.getPath();
        Intrinsics.delta(path, "getPath(...)");
        char c3 = File.separatorChar;
        boolean z10 = false;
        int emerald2 = StringsKt.emerald(path, c3, 0, 4);
        if (emerald2 == 0) {
            if (path.length() > 1 && path.charAt(1) == c3 && (emerald = StringsKt.emerald(path, c3, 2, 4)) >= 0) {
                int emerald3 = StringsKt.emerald(path, c3, emerald + 1, 4);
                if (emerald3 >= 0) {
                    i4 = emerald3 + 1;
                } else {
                    i4 = path.length();
                }
            } else {
                i4 = 1;
            }
        } else if (emerald2 > 0 && path.charAt(emerald2 - 1) == ':') {
            i4 = emerald2 + 1;
        } else if (emerald2 == -1 && StringsKt.coral(path, ':')) {
            i4 = path.length();
        } else {
            i4 = 0;
        }
        if (i4 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return file2;
        }
        String file3 = file.toString();
        Intrinsics.delta(file3, "toString(...)");
        if (file3.length() == 0) {
            z10 = true;
        }
        if (!z10 && !StringsKt.coral(file3, c3)) {
            return new File(file3 + c3 + file2);
        }
        return new File(file3 + file2);
    }

    public static void mike(File file, byte[] array) {
        Intrinsics.echo(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            fileOutputStream.close();
        } finally {
        }
    }

    public static void november(File file, String text) {
        Charset charset = kotlin.text.a.alpha;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            FilesKt__FileReadWriteKt.echo(fileOutputStream, text, charset);
            fileOutputStream.close();
        } finally {
        }
    }
}
