package Ge;

import Ie.aq;
import androidx.appcompat.widget.P0;
import cf.InterfaceC0855k;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ab;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class f implements InterfaceC0855k {
    public static final f bravo = new Object();
    public static final f charlie = new Object();
    public static final f delta = new Object();

    public static String[] bravo(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static k charlie(String representation) {
        Ve.c cVar;
        Intrinsics.echo(representation, "representation");
        char charAt = representation.charAt(0);
        Ve.c[] values = Ve.c.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                cVar = values[i4];
                if (cVar.charlie().charAt(0) == charAt) {
                    break;
                }
                i4++;
            } else {
                cVar = null;
                break;
            }
        }
        if (cVar != null) {
            return new j(cVar);
        }
        if (charAt == 'V') {
            return new j(null);
        }
        if (charAt == '[') {
            String substring = representation.substring(1);
            Intrinsics.delta(substring, "this as java.lang.String).substring(startIndex)");
            return new h(charlie(substring));
        }
        if (charAt == 'L') {
            StringsKt.coral(representation, ';');
        }
        String substring2 = representation.substring(1, representation.length() - 1);
        Intrinsics.delta(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return new i(substring2);
    }

    public static i delta(String internalName) {
        Intrinsics.echo(internalName, "internalName");
        return new i(internalName);
    }

    public static LinkedHashSet echo(String internalName, String... signatures) {
        Intrinsics.echo(internalName, "internalName");
        Intrinsics.echo(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet foxtrot(String str, String... signatures) {
        Intrinsics.echo(signatures, "signatures");
        return echo("java/lang/".concat(str), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public static LinkedHashSet golf(String str, String... strArr) {
        return echo("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String hotel(k type) {
        String charlie2;
        Intrinsics.echo(type, "type");
        if (type instanceof h) {
            return Constants.AES_PREFIX + hotel(((h) type).india);
        }
        if (type instanceof j) {
            Ve.c cVar = ((j) type).india;
            if (cVar != null && (charlie2 = cVar.charlie()) != null) {
                return charlie2;
            }
            return "V";
        }
        if (type instanceof i) {
            return P0.fuchsia(new StringBuilder("L"), ((i) type).india, ';');
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cf.InterfaceC0855k
    public y alpha(aq proto, String flexibleId, ae lowerBound, ae upperBound) {
        Intrinsics.echo(proto, "proto");
        Intrinsics.echo(flexibleId, "flexibleId");
        Intrinsics.echo(lowerBound, "lowerBound");
        Intrinsics.echo(upperBound, "upperBound");
        if (!Intrinsics.areEqual(flexibleId, "kotlin.jvm.PlatformType")) {
            return hf.i.charlie(hf.h.f12726f, flexibleId, lowerBound.toString(), upperBound.toString());
        }
        if (proto.lima(Le.k.golf)) {
            return new De.f(lowerBound, upperBound);
        }
        return ab.alpha(lowerBound, upperBound);
    }
}
