package Pf;

import com.google.android.gms.measurement.internal.C1473v;
import ge.InterfaceC1772d;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import s6.AbstractC2698k6;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public abstract class r {
    public static final s alpha = new Object();

    public static final JsonDecodingException alpha(Number number, String key, String output) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(output, "output");
        return echo(-1, "Unexpected special floating-point value " + number + " with key " + key + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) mike(output, -1)));
    }

    public static final JsonEncodingException bravo(String str, Number number) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) mike(str, -1)));
    }

    public static final JsonEncodingException charlie(SerialDescriptor serialDescriptor) {
        return new JsonEncodingException("Value of type '" + serialDescriptor.oscar() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.november() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException delta(int i4, CharSequence input, String message) {
        Intrinsics.echo(message, "message");
        Intrinsics.echo(input, "input");
        return echo(i4, message + "\nJSON input: " + ((Object) mike(input, i4)));
    }

    public static final JsonDecodingException echo(int i4, String message) {
        Intrinsics.echo(message, "message");
        if (i4 >= 0) {
            message = "Unexpected JSON token at offset " + i4 + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    public static final SerialDescriptor foxtrot(SerialDescriptor serialDescriptor, C1473v module) {
        Intrinsics.echo(serialDescriptor, "<this>");
        Intrinsics.echo(module, "module");
        if (Intrinsics.areEqual(serialDescriptor.november(), Lf.j.bravo)) {
            InterfaceC1772d alpha2 = AbstractC2698k6.alpha(serialDescriptor);
            if (alpha2 != null) {
                C1473v.bravo(module, alpha2);
                return serialDescriptor;
            }
            return serialDescriptor;
        }
        if (serialDescriptor.isInline()) {
            return foxtrot(serialDescriptor.uniform(0), module);
        }
        return serialDescriptor;
    }

    public static final byte golf(char c3) {
        if (c3 < '~') {
            return h.bravo[c3];
        }
        return (byte) 0;
    }

    public static final String hotel(Of.d json, SerialDescriptor serialDescriptor) {
        Intrinsics.echo(serialDescriptor, "<this>");
        Intrinsics.echo(json, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof Of.j) {
                return ((Of.j) annotation).discriminator();
            }
        }
        return json.alpha.golf;
    }

    public static final int india(SerialDescriptor serialDescriptor, Of.d json, String name) {
        Intrinsics.echo(serialDescriptor, "<this>");
        Intrinsics.echo(json, "json");
        Intrinsics.echo(name, "name");
        november(json, serialDescriptor);
        int quebec = serialDescriptor.quebec(name);
        if (quebec != -3 || !json.alpha.india) {
            return quebec;
        }
        s sVar = alpha;
        Ac.g gVar = new Ac.g(18, serialDescriptor, json);
        O7.j jVar = json.charlie;
        jVar.getClass();
        Object charlie = jVar.charlie(serialDescriptor, sVar);
        if (charlie == null) {
            charlie = gVar.invoke();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jVar.purple;
            Object obj = concurrentHashMap.get(serialDescriptor);
            if (obj == null) {
                obj = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, obj);
            }
            ((Map) obj).put(sVar, charlie);
        }
        Integer num = (Integer) ((Map) charlie).get(name);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int juliet(SerialDescriptor serialDescriptor, Of.d json, String name, String suffix) {
        Intrinsics.echo(serialDescriptor, "<this>");
        Intrinsics.echo(json, "json");
        Intrinsics.echo(name, "name");
        Intrinsics.echo(suffix, "suffix");
        int india = india(serialDescriptor, json, name);
        if (india != -3) {
            return india;
        }
        throw new SerializationException(serialDescriptor.oscar() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final boolean kilo(Of.d json, SerialDescriptor serialDescriptor) {
        Intrinsics.echo(serialDescriptor, "<this>");
        Intrinsics.echo(json, "json");
        if (!json.alpha.bravo) {
            List annotations = serialDescriptor.getAnnotations();
            if (annotations == null || !annotations.isEmpty()) {
                Iterator it = annotations.iterator();
                while (it.hasNext()) {
                    if (((Annotation) it.next()) instanceof Of.s) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final void lima(a aVar, String str) {
        aVar.quebec(aVar.alpha - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence mike(CharSequence charSequence, int i4) {
        String str;
        Intrinsics.echo(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i4 == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    return "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i5 = i4 - 30;
                int i10 = i4 + 30;
                if (i5 > 0) {
                    str = ".....";
                } else {
                    str = "";
                }
                if (i10 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder tango = Q0.c.tango(str);
                if (i5 < 0) {
                    i5 = 0;
                }
                int length2 = charSequence.length();
                if (i10 > length2) {
                    i10 = length2;
                }
                tango.append(charSequence.subSequence(i5, i10).toString());
                tango.append(str2);
                return tango.toString();
            }
        }
        return charSequence;
    }

    public static final void november(Of.d json, SerialDescriptor serialDescriptor) {
        Intrinsics.echo(serialDescriptor, "<this>");
        Intrinsics.echo(json, "json");
        Intrinsics.areEqual(serialDescriptor.november(), Lf.l.bravo);
    }

    public static final Object oscar(Of.d dVar, String discriminator, Of.aa aaVar, KSerializer kSerializer) {
        Intrinsics.echo(dVar, "<this>");
        Intrinsics.echo(discriminator, "discriminator");
        return new v(dVar, aaVar, discriminator, kSerializer.getDescriptor()).tango(kSerializer);
    }

    public static final ag papa(Of.d dVar, SerialDescriptor desc) {
        Intrinsics.echo(dVar, "<this>");
        Intrinsics.echo(desc, "desc");
        AbstractC2716m6 november = desc.november();
        if (november instanceof Lf.d) {
            return ag.white;
        }
        if (Intrinsics.areEqual(november, Lf.l.charlie)) {
            return ag.silver;
        }
        if (Intrinsics.areEqual(november, Lf.l.delta)) {
            SerialDescriptor foxtrot = foxtrot(desc.uniform(0), dVar.bravo);
            AbstractC2716m6 november2 = foxtrot.november();
            if (!(november2 instanceof Lf.f) && !Intrinsics.areEqual(november2, Lf.k.bravo)) {
                if (dVar.alpha.delta) {
                    return ag.silver;
                }
                throw charlie(foxtrot);
            }
            return ag.teal;
        }
        return ag.red;
    }

    public static final void quebec(a aVar, Number number) {
        a.romeo(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String romeo(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        if (b2 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }
}
