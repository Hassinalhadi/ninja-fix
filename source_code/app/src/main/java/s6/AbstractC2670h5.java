package s6;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: s6.h5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2670h5 {
    public static final Object alpha(Object possiblyPrimitiveType, boolean z2) {
        Ve.c cVar;
        Intrinsics.echo(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (z2) {
            Ge.k kVar = (Ge.k) possiblyPrimitiveType;
            if ((kVar instanceof Ge.j) && (cVar = ((Ge.j) kVar).india) != null) {
                String echo = Ve.b.charlie(cVar.echo()).echo();
                Intrinsics.delta(echo, "byFqNameWithoutInnerClas…apperFqName).internalName");
                return Ge.f.delta(echo);
            }
            return kVar;
        }
        return possiblyPrimitiveType;
    }

    public static final String bravo(int i4, Context context) {
        InputStream openRawResource = context.getResources().openRawResource(i4);
        Intrinsics.delta(openRawResource, "openRawResource(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource));
        StringBuilder sb2 = new StringBuilder();
        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
            sb2.append(readLine);
        }
        return sb2.toString();
    }

    public static final String charlie(String str) {
        Intrinsics.echo(str, "<this>");
        try {
            String foxtrot = new Regex(":(\\d\\d)$").foxtrot(str, "$1");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date parse = simpleDateFormat.parse(foxtrot);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
            Intrinsics.checkNotNull(parse);
            String format = simpleDateFormat2.format(parse);
            Intrinsics.checkNotNull(format);
            return format;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String delta(String str) {
        Date parse;
        try {
            String foxtrot = new Regex(":(\\d\\d)(?=[+-]|Z|$)").foxtrot(str, "$1");
            for (SimpleDateFormat simpleDateFormat : CollectionsKt.listOf(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault()), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault()))) {
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                try {
                    parse = simpleDateFormat.parse(foxtrot);
                } catch (Exception unused) {
                }
                if (parse != null) {
                    String format = new SimpleDateFormat("h:mma", Locale.getDefault()).format(parse);
                    Intrinsics.delta(format, "format(...)");
                    String upperCase = format.toUpperCase(Locale.ROOT);
                    Intrinsics.delta(upperCase, "toUpperCase(...)");
                    return upperCase;
                }
                continue;
            }
            return "";
        } catch (Exception unused2) {
            return "";
        }
    }
}
