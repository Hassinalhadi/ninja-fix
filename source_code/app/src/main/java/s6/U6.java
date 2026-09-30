package s6;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class U6 {
    public static Handler alpha(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return E2.e.bravo(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e5) {
            e = e5;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final String bravo(Ne.f fVar) {
        Intrinsics.echo(fVar, "<this>");
        String bravo = fVar.bravo();
        Intrinsics.delta(bravo, "asString()");
        if (!Pe.ab.alpha.contains(bravo)) {
            for (int i4 = 0; i4 < bravo.length(); i4++) {
                char charAt = bravo.charAt(i4);
                if (Character.isLetterOrDigit(charAt) || charAt == '_') {
                }
            }
            String bravo2 = fVar.bravo();
            Intrinsics.delta(bravo2, "asString()");
            return bravo2;
        }
        StringBuilder sb2 = new StringBuilder();
        String bravo3 = fVar.bravo();
        Intrinsics.delta(bravo3, "asString()");
        sb2.append("`".concat(bravo3));
        sb2.append('`');
        return sb2.toString();
    }

    public static final String charlie(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Ne.f fVar = (Ne.f) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(bravo(fVar));
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String delta(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        Intrinsics.echo(lowerRendered, "lowerRendered");
        Intrinsics.echo(lowerPrefix, "lowerPrefix");
        Intrinsics.echo(upperRendered, "upperRendered");
        Intrinsics.echo(upperPrefix, "upperPrefix");
        Intrinsics.echo(foldedPrefix, "foldedPrefix");
        if (kotlin.text.r.quebec(lowerRendered, lowerPrefix, false) && kotlin.text.r.quebec(upperRendered, upperPrefix, false)) {
            String substring = lowerRendered.substring(lowerPrefix.length());
            Intrinsics.delta(substring, "this as java.lang.String).substring(startIndex)");
            String substring2 = upperRendered.substring(upperPrefix.length());
            Intrinsics.delta(substring2, "this as java.lang.String).substring(startIndex)");
            String concat = foldedPrefix.concat(substring);
            if (Intrinsics.areEqual(substring, substring2)) {
                return concat;
            }
            if (echo(substring, substring2)) {
                return concat + '!';
            }
            return null;
        }
        return null;
    }

    public static final boolean echo(String lower, String upper) {
        Intrinsics.echo(lower, "lower");
        Intrinsics.echo(upper, "upper");
        if (!Intrinsics.areEqual(lower, kotlin.text.r.oscar(upper, "?", ""))) {
            if (!kotlin.text.r.golf(upper, "?", false) || !Intrinsics.areEqual(lower.concat("?"), upper)) {
                if (!Intrinsics.areEqual("(" + lower + ")?", upper)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
