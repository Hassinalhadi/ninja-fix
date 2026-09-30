package s6;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;
import pf.C2351a;

/* renamed from: s6.o6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2734o6 {
    public static void alpha(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] bravo(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i4 = 0; i4 < iArr.length; i4++) {
                jArr[i4] = iArr[i4];
            }
            return jArr;
        }
        if (serializable instanceof long[]) {
            return (long[]) serializable;
        }
        return null;
    }

    public static final void charlie(BufferedReader bufferedReader, Function1 function1) {
        try {
            Iterator it = ((C2351a) AbstractC2360j.delta(new kotlin.collections.o(2, bufferedReader))).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2716m6.alpha(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static final String delta(Reader reader) {
        Intrinsics.echo(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        Intrinsics.delta(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
