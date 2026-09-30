package t6;

import android.util.TypedValue;
import com.clevertap.android.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;
import s6.Q4;

/* renamed from: t6.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2981d2 {
    public static final Charset alpha(sd.e eVar) {
        Intrinsics.echo(eVar, "<this>");
        String romeo = eVar.romeo("charset");
        if (romeo != null) {
            try {
                Charset charset = kotlin.text.a.alpha;
                Charset forName = Charset.forName(romeo);
                Intrinsics.delta(forName, "forName(...)");
                return forName;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return null;
    }

    public static Y1.aq bravo(TypedValue typedValue, Y1.aq aqVar, Y1.aq aqVar2, String str, String str2) {
        if (aqVar != null && aqVar != aqVar2) {
            StringBuilder india = av.q.india("Type is ", str, " but found ", str2, ": ");
            india.append(typedValue.data);
            throw new XmlPullParserException(india.toString());
        }
        if (aqVar == null) {
            return aqVar2;
        }
        return aqVar;
    }

    public static final sd.e charlie(sd.e eVar, Charset charset) {
        Intrinsics.echo(eVar, "<this>");
        Intrinsics.echo(charset, "charset");
        String lowerCase = eVar.silver.toLowerCase(Locale.ROOT);
        Intrinsics.delta(lowerCase, "toLowerCase(...)");
        if (!Intrinsics.areEqual(lowerCase, Constants.KEY_TEXT)) {
            return eVar;
        }
        return eVar.amber(Q4.charlie(charset));
    }
}
