package s6;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class Q4 {
    public static final byte[] alpha(CharsetEncoder charsetEncoder, String input, int i4, int i5) {
        Intrinsics.echo(charsetEncoder, "<this>");
        Intrinsics.echo(input, "input");
        if (i4 == 0 && i5 == input.length()) {
            byte[] bytes = input.getBytes(charsetEncoder.charset());
            Intrinsics.delta(bytes, "getBytes(...)");
            return bytes;
        }
        String substring = input.substring(i4, i5);
        Intrinsics.delta(substring, "substring(...)");
        byte[] bytes2 = substring.getBytes(charsetEncoder.charset());
        Intrinsics.delta(bytes2, "getBytes(...)");
        return bytes2;
    }

    public static final String charlie(Charset charset) {
        Intrinsics.echo(charset, "<this>");
        String name = charset.name();
        Intrinsics.delta(name, "name(...)");
        return name;
    }

    public abstract void bravo(g7.w wVar, float f5, float f10);
}
