package vg;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.MediaType;

/* loaded from: classes2.dex */
public final class ao {
    public static final Pattern yankee = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    public static final Pattern zulu = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public final at alpha;
    public final Class bravo;
    public final Method charlie;
    public final Annotation[] delta;
    public final Annotation[][] echo;
    public final Type[] foxtrot;
    public boolean golf;
    public boolean hotel;
    public boolean india;
    public boolean juliet;
    public boolean kilo;
    public boolean lima;
    public boolean mike;
    public boolean november;
    public String oscar;
    public boolean papa;
    public boolean quebec;
    public boolean romeo;
    public String sierra;
    public Headers tango;
    public MediaType uniform;
    public LinkedHashSet victor;
    public A[] whiskey;
    public boolean xray;

    public ao(at atVar, Class cls, Method method) {
        this.alpha = atVar;
        this.bravo = cls;
        this.charlie = method;
        this.delta = method.getAnnotations();
        this.foxtrot = method.getGenericParameterTypes();
        this.echo = method.getParameterAnnotations();
    }

    public static Class alpha(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }

    public final void bravo(String str, String str2, boolean z2) {
        String str3 = this.oscar;
        Method method = this.charlie;
        if (str3 == null) {
            this.oscar = str;
            this.papa = z2;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            Pattern pattern = yankee;
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (pattern.matcher(substring).find()) {
                    throw A.november(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.sierra = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.victor = linkedHashSet;
            return;
        }
        throw A.november(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }

    public final void charlie(int i4, Type type) {
        if (!A.juliet(type)) {
        } else {
            throw A.oscar(this.charlie, i4, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
