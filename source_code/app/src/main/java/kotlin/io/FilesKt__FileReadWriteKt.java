package kotlin.io;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2725n6;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes2.dex */
public class FilesKt__FileReadWriteKt extends AbstractC2725n6 {
    public static final void echo(FileOutputStream fileOutputStream, String text, Charset charset) {
        boolean z2;
        Intrinsics.echo(text, "text");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.delta(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder encoder = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        Intrinsics.checkNotNull(encoder);
        Intrinsics.echo(encoder, "encoder");
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.delta(allocate2, "allocate(...)");
        int i4 = 0;
        int i5 = 0;
        while (i4 < text.length()) {
            int min = Math.min(8192 - i5, text.length() - i4);
            int i10 = i4 + min;
            char[] array = allocate.array();
            Intrinsics.delta(array, "array(...)");
            text.getChars(i4, i10, array, i5);
            allocate.limit(min + i5);
            i5 = 1;
            if (i10 == text.length()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (encoder.encode(allocate, allocate2, z2).isUnderflow()) {
                fileOutputStream.write(allocate2.array(), 0, allocate2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i5 = 0;
                }
                allocate.clear();
                allocate2.clear();
                i4 = i10;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    public static /* synthetic */ String readText$default(File file, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = kotlin.text.a.alpha;
        }
        return FilesKt.juliet(file, charset);
    }
}
