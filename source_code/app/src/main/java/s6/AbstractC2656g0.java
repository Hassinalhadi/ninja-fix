package s6;

import a0.C0366t;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import g0.C1725e;
import g0.C1726f;
import java.io.IOException;
import java.io.StringReader;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2656g0 {
    public static C1726f alpha;

    public static final C1726f alpha() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = g0.ah.alpha;
        a0.au auVar = new a0.au(C0366t.bravo);
        T3.b bVar = new T3.b(2, false);
        bVar.juliet(12.0f, 12.0f);
        bVar.echo(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        bVar.lima(-1.79f, -4.0f, -4.0f, -4.0f);
        bVar.lima(-4.0f, 1.79f, -4.0f, 4.0f);
        bVar.lima(1.79f, 4.0f, 4.0f, 4.0f);
        bVar.charlie();
        bVar.juliet(12.0f, 14.0f);
        bVar.echo(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        bVar.november(2.0f);
        bVar.golf(16.0f);
        bVar.november(-2.0f);
        bVar.echo(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        bVar.charlie();
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", bVar.alpha);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }

    public static com.google.gson.q bravo(S8.a aVar) {
        int i4 = aVar.f2047h;
        if (i4 == 2) {
            aVar.f2047h = 1;
        }
        try {
            try {
                return com.google.gson.internal.f.india(aVar);
            } finally {
                aVar.j(i4);
            }
        } catch (OutOfMemoryError | StackOverflowError e) {
            throw new JsonParseException("Failed parsing JSON source: " + aVar + " to Json", e);
        }
    }

    public static com.google.gson.q charlie(String str) {
        try {
            try {
                S8.a aVar = new S8.a(new StringReader(str));
                com.google.gson.q bravo = bravo(aVar);
                try {
                    bravo.getClass();
                    if (!(bravo instanceof com.google.gson.r) && aVar.white() != S8.b.f2050c) {
                        throw new JsonSyntaxException("Did not consume the entire document.");
                    }
                    return bravo;
                } catch (NumberFormatException e) {
                    e = e;
                    throw new JsonSyntaxException(e);
                }
            } catch (IOException e4) {
                throw new JsonIOException(e4);
            }
        } catch (MalformedJsonException | NumberFormatException e5) {
            e = e5;
        }
    }
}
