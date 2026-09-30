package Y1;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import s6.S6;
import s6.Z6;
import t6.AbstractC2971b2;

/* loaded from: classes3.dex */
public final class w {
    public static final Regex quebec = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Regex romeo = new Regex("\\{(.+?)\\}");
    public static final Regex sierra = new Regex("http[s]?://");
    public static final Regex tango = new Regex(".*");
    public static final Regex uniform = new Regex("([^/]*?|)");
    public static final Regex victor = new Regex("^[^?#]+\\?([^#]*).*");
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final ArrayList delta;
    public final String echo;
    public final Lazy foxtrot;
    public final Lazy golf;
    public final Object hotel;
    public boolean india;
    public final Object juliet;
    public final Object kilo;
    public final Object lima;
    public final Lazy mike;
    public final String november;
    public final Lazy oscar;
    public final boolean papa;

    public w(String str, String str2, String str3) {
        List emptyList;
        boolean z2;
        this.alpha = str;
        this.bravo = str2;
        this.charlie = str3;
        ArrayList arrayList = new ArrayList();
        this.delta = arrayList;
        final int i4 = 0;
        this.foxtrot = LazyKt.lazy(new Function0(this) { // from class: Y1.t
            public final /* synthetic */ w purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z10;
                List list;
                ?? r12 = 1;
                int i5 = 0;
                Object obj = null;
                w wVar = this.purple;
                switch (i4) {
                    case 0:
                        String str4 = wVar.echo;
                        if (str4 != null) {
                            kotlin.text.m[] mVarArr = kotlin.text.m.alpha;
                            return new Regex(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = wVar.alpha;
                        if (str5 != null && w.victor.echo(str5)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 2:
                        wVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) wVar.golf.getValue()).booleanValue()) {
                            String uriString = wVar.alpha;
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.echo(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.delta(parse, "parse(...)");
                            for (String str6 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str6);
                                if (queryParameters.size() <= r12) {
                                    String str7 = (String) CollectionsKt.green(queryParameters);
                                    if (str7 == null) {
                                        wVar.india = r12;
                                        str7 = str6;
                                    }
                                    MatchResult find$default = Regex.find$default(w.romeo, str7, i5, 2, obj);
                                    v vVar = new v();
                                    int i10 = i5;
                                    int i11 = r12;
                                    while (find$default != null) {
                                        kotlin.text.i bravo = find$default.alpha().bravo(i11);
                                        Intrinsics.checkNotNull(bravo);
                                        int i12 = i11;
                                        vVar.bravo.add(bravo.alpha);
                                        if (find$default.bravo().alpha > i10) {
                                            String substring = str7.substring(i10, find$default.bravo().alpha);
                                            Intrinsics.delta(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            Intrinsics.delta(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i10 = find$default.bravo().purple + 1;
                                        find$default = find$default.next();
                                        i11 = i12;
                                    }
                                    int i13 = i11;
                                    if (i10 < str7.length()) {
                                        String substring2 = str7.substring(i10);
                                        Intrinsics.delta(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        Intrinsics.delta(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    Intrinsics.delta(sb3, "toString(...)");
                                    vVar.alpha = w.hotel(sb3);
                                    linkedHashMap.put(str6, vVar);
                                    r12 = i13;
                                    i5 = 0;
                                    obj = null;
                                } else {
                                    throw new IllegalArgumentException(av.q.golf("Query parameter ", str6, " must only be present once in ", uriString, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str8 = wVar.alpha;
                        if (str8 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str8);
                        Intrinsics.delta(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str8);
                        Intrinsics.delta(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        Intrinsics.checkNotNull(fragment);
                        w.alpha(fragment, arrayList2, sb4);
                        return new Pair(arrayList2, sb4.toString());
                    case 4:
                        Pair pair = (Pair) wVar.juliet.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) wVar.juliet.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str9 = (String) wVar.lima.getValue();
                        if (str9 == null) {
                            return null;
                        }
                        kotlin.text.m[] mVarArr2 = kotlin.text.m.alpha;
                        return new Regex(str9, 0);
                    default:
                        String str10 = wVar.november;
                        if (str10 == null) {
                            return null;
                        }
                        return new Regex(str10);
                }
            }
        });
        final int i5 = 1;
        this.golf = LazyKt.lazy(new Function0(this) { // from class: Y1.t
            public final /* synthetic */ w purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z10;
                List list;
                ?? r12 = 1;
                int i52 = 0;
                Object obj = null;
                w wVar = this.purple;
                switch (i5) {
                    case 0:
                        String str4 = wVar.echo;
                        if (str4 != null) {
                            kotlin.text.m[] mVarArr = kotlin.text.m.alpha;
                            return new Regex(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = wVar.alpha;
                        if (str5 != null && w.victor.echo(str5)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 2:
                        wVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) wVar.golf.getValue()).booleanValue()) {
                            String uriString = wVar.alpha;
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.echo(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.delta(parse, "parse(...)");
                            for (String str6 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str6);
                                if (queryParameters.size() <= r12) {
                                    String str7 = (String) CollectionsKt.green(queryParameters);
                                    if (str7 == null) {
                                        wVar.india = r12;
                                        str7 = str6;
                                    }
                                    MatchResult find$default = Regex.find$default(w.romeo, str7, i52, 2, obj);
                                    v vVar = new v();
                                    int i10 = i52;
                                    int i11 = r12;
                                    while (find$default != null) {
                                        kotlin.text.i bravo = find$default.alpha().bravo(i11);
                                        Intrinsics.checkNotNull(bravo);
                                        int i12 = i11;
                                        vVar.bravo.add(bravo.alpha);
                                        if (find$default.bravo().alpha > i10) {
                                            String substring = str7.substring(i10, find$default.bravo().alpha);
                                            Intrinsics.delta(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            Intrinsics.delta(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i10 = find$default.bravo().purple + 1;
                                        find$default = find$default.next();
                                        i11 = i12;
                                    }
                                    int i13 = i11;
                                    if (i10 < str7.length()) {
                                        String substring2 = str7.substring(i10);
                                        Intrinsics.delta(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        Intrinsics.delta(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    Intrinsics.delta(sb3, "toString(...)");
                                    vVar.alpha = w.hotel(sb3);
                                    linkedHashMap.put(str6, vVar);
                                    r12 = i13;
                                    i52 = 0;
                                    obj = null;
                                } else {
                                    throw new IllegalArgumentException(av.q.golf("Query parameter ", str6, " must only be present once in ", uriString, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str8 = wVar.alpha;
                        if (str8 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str8);
                        Intrinsics.delta(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str8);
                        Intrinsics.delta(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        Intrinsics.checkNotNull(fragment);
                        w.alpha(fragment, arrayList2, sb4);
                        return new Pair(arrayList2, sb4.toString());
                    case 4:
                        Pair pair = (Pair) wVar.juliet.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) wVar.juliet.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str9 = (String) wVar.lima.getValue();
                        if (str9 == null) {
                            return null;
                        }
                        kotlin.text.m[] mVarArr2 = kotlin.text.m.alpha;
                        return new Regex(str9, 0);
                    default:
                        String str10 = wVar.november;
                        if (str10 == null) {
                            return null;
                        }
                        return new Regex(str10);
                }
            }
        });
        kotlin.i iVar = kotlin.i.purple;
        final int i10 = 2;
        this.hotel = LazyKt.alpha(iVar, new Function0(this) { // from class: Y1.t
            public final /* synthetic */ w purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z10;
                List list;
                ?? r12 = 1;
                int i52 = 0;
                Object obj = null;
                w wVar = this.purple;
                switch (i10) {
                    case 0:
                        String str4 = wVar.echo;
                        if (str4 != null) {
                            kotlin.text.m[] mVarArr = kotlin.text.m.alpha;
                            return new Regex(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = wVar.alpha;
                        if (str5 != null && w.victor.echo(str5)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 2:
                        wVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) wVar.golf.getValue()).booleanValue()) {
                            String uriString = wVar.alpha;
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.echo(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.delta(parse, "parse(...)");
                            for (String str6 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str6);
                                if (queryParameters.size() <= r12) {
                                    String str7 = (String) CollectionsKt.green(queryParameters);
                                    if (str7 == null) {
                                        wVar.india = r12;
                                        str7 = str6;
                                    }
                                    MatchResult find$default = Regex.find$default(w.romeo, str7, i52, 2, obj);
                                    v vVar = new v();
                                    int i102 = i52;
                                    int i11 = r12;
                                    while (find$default != null) {
                                        kotlin.text.i bravo = find$default.alpha().bravo(i11);
                                        Intrinsics.checkNotNull(bravo);
                                        int i12 = i11;
                                        vVar.bravo.add(bravo.alpha);
                                        if (find$default.bravo().alpha > i102) {
                                            String substring = str7.substring(i102, find$default.bravo().alpha);
                                            Intrinsics.delta(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            Intrinsics.delta(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i102 = find$default.bravo().purple + 1;
                                        find$default = find$default.next();
                                        i11 = i12;
                                    }
                                    int i13 = i11;
                                    if (i102 < str7.length()) {
                                        String substring2 = str7.substring(i102);
                                        Intrinsics.delta(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        Intrinsics.delta(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    Intrinsics.delta(sb3, "toString(...)");
                                    vVar.alpha = w.hotel(sb3);
                                    linkedHashMap.put(str6, vVar);
                                    r12 = i13;
                                    i52 = 0;
                                    obj = null;
                                } else {
                                    throw new IllegalArgumentException(av.q.golf("Query parameter ", str6, " must only be present once in ", uriString, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str8 = wVar.alpha;
                        if (str8 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str8);
                        Intrinsics.delta(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str8);
                        Intrinsics.delta(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        Intrinsics.checkNotNull(fragment);
                        w.alpha(fragment, arrayList2, sb4);
                        return new Pair(arrayList2, sb4.toString());
                    case 4:
                        Pair pair = (Pair) wVar.juliet.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) wVar.juliet.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str9 = (String) wVar.lima.getValue();
                        if (str9 == null) {
                            return null;
                        }
                        kotlin.text.m[] mVarArr2 = kotlin.text.m.alpha;
                        return new Regex(str9, 0);
                    default:
                        String str10 = wVar.november;
                        if (str10 == null) {
                            return null;
                        }
                        return new Regex(str10);
                }
            }
        });
        final int i11 = 3;
        this.juliet = LazyKt.alpha(iVar, new Function0(this) { // from class: Y1.t
            public final /* synthetic */ w purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z10;
                List list;
                ?? r12 = 1;
                int i52 = 0;
                Object obj = null;
                w wVar = this.purple;
                switch (i11) {
                    case 0:
                        String str4 = wVar.echo;
                        if (str4 != null) {
                            kotlin.text.m[] mVarArr = kotlin.text.m.alpha;
                            return new Regex(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = wVar.alpha;
                        if (str5 != null && w.victor.echo(str5)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 2:
                        wVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) wVar.golf.getValue()).booleanValue()) {
                            String uriString = wVar.alpha;
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.echo(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.delta(parse, "parse(...)");
                            for (String str6 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str6);
                                if (queryParameters.size() <= r12) {
                                    String str7 = (String) CollectionsKt.green(queryParameters);
                                    if (str7 == null) {
                                        wVar.india = r12;
                                        str7 = str6;
                                    }
                                    MatchResult find$default = Regex.find$default(w.romeo, str7, i52, 2, obj);
                                    v vVar = new v();
                                    int i102 = i52;
                                    int i112 = r12;
                                    while (find$default != null) {
                                        kotlin.text.i bravo = find$default.alpha().bravo(i112);
                                        Intrinsics.checkNotNull(bravo);
                                        int i12 = i112;
                                        vVar.bravo.add(bravo.alpha);
                                        if (find$default.bravo().alpha > i102) {
                                            String substring = str7.substring(i102, find$default.bravo().alpha);
                                            Intrinsics.delta(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            Intrinsics.delta(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i102 = find$default.bravo().purple + 1;
                                        find$default = find$default.next();
                                        i112 = i12;
                                    }
                                    int i13 = i112;
                                    if (i102 < str7.length()) {
                                        String substring2 = str7.substring(i102);
                                        Intrinsics.delta(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        Intrinsics.delta(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    Intrinsics.delta(sb3, "toString(...)");
                                    vVar.alpha = w.hotel(sb3);
                                    linkedHashMap.put(str6, vVar);
                                    r12 = i13;
                                    i52 = 0;
                                    obj = null;
                                } else {
                                    throw new IllegalArgumentException(av.q.golf("Query parameter ", str6, " must only be present once in ", uriString, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str8 = wVar.alpha;
                        if (str8 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str8);
                        Intrinsics.delta(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str8);
                        Intrinsics.delta(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        Intrinsics.checkNotNull(fragment);
                        w.alpha(fragment, arrayList2, sb4);
                        return new Pair(arrayList2, sb4.toString());
                    case 4:
                        Pair pair = (Pair) wVar.juliet.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) wVar.juliet.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str9 = (String) wVar.lima.getValue();
                        if (str9 == null) {
                            return null;
                        }
                        kotlin.text.m[] mVarArr2 = kotlin.text.m.alpha;
                        return new Regex(str9, 0);
                    default:
                        String str10 = wVar.november;
                        if (str10 == null) {
                            return null;
                        }
                        return new Regex(str10);
                }
            }
        });
        final int i12 = 4;
        this.kilo = LazyKt.alpha(iVar, new Function0(this) { // from class: Y1.t
            public final /* synthetic */ w purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z10;
                List list;
                ?? r12 = 1;
                int i52 = 0;
                Object obj = null;
                w wVar = this.purple;
                switch (i12) {
                    case 0:
                        String str4 = wVar.echo;
                        if (str4 != null) {
                            kotlin.text.m[] mVarArr = kotlin.text.m.alpha;
                            return new Regex(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = wVar.alpha;
                        if (str5 != null && w.victor.echo(str5)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 2:
                        wVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) wVar.golf.getValue()).booleanValue()) {
                            String uriString = wVar.alpha;
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.echo(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.delta(parse, "parse(...)");
                            for (String str6 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str6);
                                if (queryParameters.size() <= r12) {
                                    String str7 = (String) CollectionsKt.green(queryParameters);
                                    if (str7 == null) {
                                        wVar.india = r12;
                                        str7 = str6;
                                    }
                                    MatchResult find$default = Regex.find$default(w.romeo, str7, i52, 2, obj);
                                    v vVar = new v();
                                    int i102 = i52;
                                    int i112 = r12;
                                    while (find$default != null) {
                                        kotlin.text.i bravo = find$default.alpha().bravo(i112);
                                        Intrinsics.checkNotNull(bravo);
                                        int i122 = i112;
                                        vVar.bravo.add(bravo.alpha);
                                        if (find$default.bravo().alpha > i102) {
                                            String substring = str7.substring(i102, find$default.bravo().alpha);
                                            Intrinsics.delta(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            Intrinsics.delta(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i102 = find$default.bravo().purple + 1;
                                        find$default = find$default.next();
                                        i112 = i122;
                                    }
                                    int i13 = i112;
                                    if (i102 < str7.length()) {
                                        String substring2 = str7.substring(i102);
                                        Intrinsics.delta(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        Intrinsics.delta(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    Intrinsics.delta(sb3, "toString(...)");
                                    vVar.alpha = w.hotel(sb3);
                                    linkedHashMap.put(str6, vVar);
                                    r12 = i13;
                                    i52 = 0;
                                    obj = null;
                                } else {
                                    throw new IllegalArgumentException(av.q.golf("Query parameter ", str6, " must only be present once in ", uriString, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str8 = wVar.alpha;
                        if (str8 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str8);
                        Intrinsics.delta(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str8);
                        Intrinsics.delta(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        Intrinsics.checkNotNull(fragment);
                        w.alpha(fragment, arrayList2, sb4);
                        return new Pair(arrayList2, sb4.toString());
                    case 4:
                        Pair pair = (Pair) wVar.juliet.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) wVar.juliet.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str9 = (String) wVar.lima.getValue();
                        if (str9 == null) {
                            return null;
                        }
                        kotlin.text.m[] mVarArr2 = kotlin.text.m.alpha;
                        return new Regex(str9, 0);
                    default:
                        String str10 = wVar.november;
                        if (str10 == null) {
                            return null;
                        }
                        return new Regex(str10);
                }
            }
        });
        final int i13 = 5;
        this.lima = LazyKt.alpha(iVar, new Function0(this) { // from class: Y1.t
            public final /* synthetic */ w purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z10;
                List list;
                ?? r12 = 1;
                int i52 = 0;
                Object obj = null;
                w wVar = this.purple;
                switch (i13) {
                    case 0:
                        String str4 = wVar.echo;
                        if (str4 != null) {
                            kotlin.text.m[] mVarArr = kotlin.text.m.alpha;
                            return new Regex(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = wVar.alpha;
                        if (str5 != null && w.victor.echo(str5)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 2:
                        wVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) wVar.golf.getValue()).booleanValue()) {
                            String uriString = wVar.alpha;
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.echo(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.delta(parse, "parse(...)");
                            for (String str6 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str6);
                                if (queryParameters.size() <= r12) {
                                    String str7 = (String) CollectionsKt.green(queryParameters);
                                    if (str7 == null) {
                                        wVar.india = r12;
                                        str7 = str6;
                                    }
                                    MatchResult find$default = Regex.find$default(w.romeo, str7, i52, 2, obj);
                                    v vVar = new v();
                                    int i102 = i52;
                                    int i112 = r12;
                                    while (find$default != null) {
                                        kotlin.text.i bravo = find$default.alpha().bravo(i112);
                                        Intrinsics.checkNotNull(bravo);
                                        int i122 = i112;
                                        vVar.bravo.add(bravo.alpha);
                                        if (find$default.bravo().alpha > i102) {
                                            String substring = str7.substring(i102, find$default.bravo().alpha);
                                            Intrinsics.delta(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            Intrinsics.delta(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i102 = find$default.bravo().purple + 1;
                                        find$default = find$default.next();
                                        i112 = i122;
                                    }
                                    int i132 = i112;
                                    if (i102 < str7.length()) {
                                        String substring2 = str7.substring(i102);
                                        Intrinsics.delta(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        Intrinsics.delta(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    Intrinsics.delta(sb3, "toString(...)");
                                    vVar.alpha = w.hotel(sb3);
                                    linkedHashMap.put(str6, vVar);
                                    r12 = i132;
                                    i52 = 0;
                                    obj = null;
                                } else {
                                    throw new IllegalArgumentException(av.q.golf("Query parameter ", str6, " must only be present once in ", uriString, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str8 = wVar.alpha;
                        if (str8 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str8);
                        Intrinsics.delta(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str8);
                        Intrinsics.delta(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        Intrinsics.checkNotNull(fragment);
                        w.alpha(fragment, arrayList2, sb4);
                        return new Pair(arrayList2, sb4.toString());
                    case 4:
                        Pair pair = (Pair) wVar.juliet.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) wVar.juliet.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str9 = (String) wVar.lima.getValue();
                        if (str9 == null) {
                            return null;
                        }
                        kotlin.text.m[] mVarArr2 = kotlin.text.m.alpha;
                        return new Regex(str9, 0);
                    default:
                        String str10 = wVar.november;
                        if (str10 == null) {
                            return null;
                        }
                        return new Regex(str10);
                }
            }
        });
        final int i14 = 6;
        this.mike = LazyKt.lazy(new Function0(this) { // from class: Y1.t
            public final /* synthetic */ w purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z10;
                List list;
                ?? r12 = 1;
                int i52 = 0;
                Object obj = null;
                w wVar = this.purple;
                switch (i14) {
                    case 0:
                        String str4 = wVar.echo;
                        if (str4 != null) {
                            kotlin.text.m[] mVarArr = kotlin.text.m.alpha;
                            return new Regex(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = wVar.alpha;
                        if (str5 != null && w.victor.echo(str5)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 2:
                        wVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) wVar.golf.getValue()).booleanValue()) {
                            String uriString = wVar.alpha;
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.echo(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.delta(parse, "parse(...)");
                            for (String str6 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str6);
                                if (queryParameters.size() <= r12) {
                                    String str7 = (String) CollectionsKt.green(queryParameters);
                                    if (str7 == null) {
                                        wVar.india = r12;
                                        str7 = str6;
                                    }
                                    MatchResult find$default = Regex.find$default(w.romeo, str7, i52, 2, obj);
                                    v vVar = new v();
                                    int i102 = i52;
                                    int i112 = r12;
                                    while (find$default != null) {
                                        kotlin.text.i bravo = find$default.alpha().bravo(i112);
                                        Intrinsics.checkNotNull(bravo);
                                        int i122 = i112;
                                        vVar.bravo.add(bravo.alpha);
                                        if (find$default.bravo().alpha > i102) {
                                            String substring = str7.substring(i102, find$default.bravo().alpha);
                                            Intrinsics.delta(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            Intrinsics.delta(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i102 = find$default.bravo().purple + 1;
                                        find$default = find$default.next();
                                        i112 = i122;
                                    }
                                    int i132 = i112;
                                    if (i102 < str7.length()) {
                                        String substring2 = str7.substring(i102);
                                        Intrinsics.delta(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        Intrinsics.delta(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    Intrinsics.delta(sb3, "toString(...)");
                                    vVar.alpha = w.hotel(sb3);
                                    linkedHashMap.put(str6, vVar);
                                    r12 = i132;
                                    i52 = 0;
                                    obj = null;
                                } else {
                                    throw new IllegalArgumentException(av.q.golf("Query parameter ", str6, " must only be present once in ", uriString, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str8 = wVar.alpha;
                        if (str8 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str8);
                        Intrinsics.delta(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str8);
                        Intrinsics.delta(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        Intrinsics.checkNotNull(fragment);
                        w.alpha(fragment, arrayList2, sb4);
                        return new Pair(arrayList2, sb4.toString());
                    case 4:
                        Pair pair = (Pair) wVar.juliet.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) wVar.juliet.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str9 = (String) wVar.lima.getValue();
                        if (str9 == null) {
                            return null;
                        }
                        kotlin.text.m[] mVarArr2 = kotlin.text.m.alpha;
                        return new Regex(str9, 0);
                    default:
                        String str10 = wVar.november;
                        if (str10 == null) {
                            return null;
                        }
                        return new Regex(str10);
                }
            }
        });
        final int i15 = 7;
        this.oscar = LazyKt.lazy(new Function0(this) { // from class: Y1.t
            public final /* synthetic */ w purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z10;
                List list;
                ?? r12 = 1;
                int i52 = 0;
                Object obj = null;
                w wVar = this.purple;
                switch (i15) {
                    case 0:
                        String str4 = wVar.echo;
                        if (str4 != null) {
                            kotlin.text.m[] mVarArr = kotlin.text.m.alpha;
                            return new Regex(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = wVar.alpha;
                        if (str5 != null && w.victor.echo(str5)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    case 2:
                        wVar.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) wVar.golf.getValue()).booleanValue()) {
                            String uriString = wVar.alpha;
                            Intrinsics.checkNotNull(uriString);
                            Intrinsics.echo(uriString, "uriString");
                            Uri parse = Uri.parse(uriString);
                            Intrinsics.delta(parse, "parse(...)");
                            for (String str6 : parse.getQueryParameterNames()) {
                                StringBuilder sb2 = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str6);
                                if (queryParameters.size() <= r12) {
                                    String str7 = (String) CollectionsKt.green(queryParameters);
                                    if (str7 == null) {
                                        wVar.india = r12;
                                        str7 = str6;
                                    }
                                    MatchResult find$default = Regex.find$default(w.romeo, str7, i52, 2, obj);
                                    v vVar = new v();
                                    int i102 = i52;
                                    int i112 = r12;
                                    while (find$default != null) {
                                        kotlin.text.i bravo = find$default.alpha().bravo(i112);
                                        Intrinsics.checkNotNull(bravo);
                                        int i122 = i112;
                                        vVar.bravo.add(bravo.alpha);
                                        if (find$default.bravo().alpha > i102) {
                                            String substring = str7.substring(i102, find$default.bravo().alpha);
                                            Intrinsics.delta(substring, "substring(...)");
                                            String quote = Pattern.quote(substring);
                                            Intrinsics.delta(quote, "quote(...)");
                                            sb2.append(quote);
                                        }
                                        sb2.append("([\\s\\S]+?)?");
                                        i102 = find$default.bravo().purple + 1;
                                        find$default = find$default.next();
                                        i112 = i122;
                                    }
                                    int i132 = i112;
                                    if (i102 < str7.length()) {
                                        String substring2 = str7.substring(i102);
                                        Intrinsics.delta(substring2, "substring(...)");
                                        String quote2 = Pattern.quote(substring2);
                                        Intrinsics.delta(quote2, "quote(...)");
                                        sb2.append(quote2);
                                    }
                                    sb2.append("$");
                                    String sb3 = sb2.toString();
                                    Intrinsics.delta(sb3, "toString(...)");
                                    vVar.alpha = w.hotel(sb3);
                                    linkedHashMap.put(str6, vVar);
                                    r12 = i132;
                                    i52 = 0;
                                    obj = null;
                                } else {
                                    throw new IllegalArgumentException(av.q.golf("Query parameter ", str6, " must only be present once in ", uriString, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str8 = wVar.alpha;
                        if (str8 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str8);
                        Intrinsics.delta(parse2, "parse(...)");
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str8);
                        Intrinsics.delta(parse3, "parse(...)");
                        String fragment = parse3.getFragment();
                        StringBuilder sb4 = new StringBuilder();
                        Intrinsics.checkNotNull(fragment);
                        w.alpha(fragment, arrayList2, sb4);
                        return new Pair(arrayList2, sb4.toString());
                    case 4:
                        Pair pair = (Pair) wVar.juliet.getValue();
                        if (pair == null || (list = (List) pair.getFirst()) == null) {
                            return new ArrayList();
                        }
                        return list;
                    case 5:
                        Pair pair2 = (Pair) wVar.juliet.getValue();
                        if (pair2 == null) {
                            return null;
                        }
                        return (String) pair2.getSecond();
                    case 6:
                        String str9 = (String) wVar.lima.getValue();
                        if (str9 == null) {
                            return null;
                        }
                        kotlin.text.m[] mVarArr2 = kotlin.text.m.alpha;
                        return new Regex(str9, 0);
                    default:
                        String str10 = wVar.november;
                        if (str10 == null) {
                            return null;
                        }
                        return new Regex(str10);
                }
            }
        });
        if (str != null) {
            StringBuilder sb2 = new StringBuilder("^");
            if (!quebec.alpha(str)) {
                String pattern = sierra.alpha.pattern();
                Intrinsics.delta(pattern, "pattern(...)");
                sb2.append(pattern);
            }
            MatchResult find$default = Regex.find$default(new Regex("(\\?|#|$)"), str, 0, 2, null);
            if (find$default != null) {
                String substring = str.substring(0, find$default.bravo().alpha);
                Intrinsics.delta(substring, "substring(...)");
                alpha(substring, arrayList, sb2);
                if (!tango.alpha(sb2) && !uniform.alpha(sb2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.papa = z2;
                sb2.append("($|(\\?(.)*)|(#(.)*))");
            }
            String sb3 = sb2.toString();
            Intrinsics.delta(sb3, "toString(...)");
            this.echo = hotel(sb3);
        }
        if (str3 == null) {
            return;
        }
        if (new Regex("^[\\s\\S]+/[\\s\\S]+$").echo(str3)) {
            List hotel = new Regex("/").hotel(str3);
            if (!hotel.isEmpty()) {
                ListIterator listIterator = hotel.listIterator(hotel.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        emptyList = CollectionsKt.r(hotel, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            this.november = kotlin.text.r.oscar(av.q.golf("^(", (String) emptyList.get(0), "|[*]+)/(", (String) emptyList.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]");
            return;
        }
        throw new IllegalArgumentException(ao.ad.gray("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
    }

    public static void alpha(String str, ArrayList arrayList, StringBuilder sb2) {
        int i4 = 0;
        for (MatchResult find$default = Regex.find$default(romeo, str, 0, 2, null); find$default != null; find$default = find$default.next()) {
            kotlin.text.i bravo = find$default.alpha().bravo(1);
            Intrinsics.checkNotNull(bravo);
            arrayList.add(bravo.alpha);
            if (find$default.bravo().alpha > i4) {
                String substring = str.substring(i4, find$default.bravo().alpha);
                Intrinsics.delta(substring, "substring(...)");
                String quote = Pattern.quote(substring);
                Intrinsics.delta(quote, "quote(...)");
                sb2.append(quote);
            }
            String pattern = uniform.alpha.pattern();
            Intrinsics.delta(pattern, "pattern(...)");
            sb2.append(pattern);
            i4 = find$default.bravo().purple + 1;
        }
        if (i4 < str.length()) {
            String substring2 = str.substring(i4);
            Intrinsics.delta(substring2, "substring(...)");
            String quote2 = Pattern.quote(substring2);
            Intrinsics.delta(quote2, "quote(...)");
            sb2.append(quote2);
        }
    }

    public static void golf(Bundle bundle, String key, String str, k kVar) {
        if (kVar != null) {
            aq aqVar = kVar.alpha;
            Intrinsics.echo(key, "key");
            aqVar.echo(bundle, key, aqVar.delta(str));
            return;
        }
        Z6.echo(key, str, bundle);
    }

    public static String hotel(String str) {
        if (StringsKt.beige(str, "\\Q", false) && StringsKt.beige(str, "\\E", false)) {
            return kotlin.text.r.oscar(str, ".*", "\\E.*\\Q");
        }
        if (StringsKt.beige(str, "\\.\\*", false)) {
            return kotlin.text.r.oscar(str, "\\.\\*", ".*");
        }
        return str;
    }

    public final int bravo(Uri uri) {
        String str;
        if (uri != null && (str = this.alpha) != null) {
            List<String> pathSegments = uri.getPathSegments();
            Uri parse = Uri.parse(str);
            Intrinsics.delta(parse, "parse(...)");
            return CollectionsKt.lime(pathSegments, parse.getPathSegments()).size();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    public final ArrayList charlie() {
        ArrayList arrayList = this.delta;
        Collection values = ((Map) this.hotel.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, ((v) it.next()).bravo);
        }
        return CollectionsKt.a(CollectionsKt.a(arrayList, arrayList2), (List) this.kilo.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
    public final Bundle delta(Uri deepLink, LinkedHashMap arguments) {
        kotlin.text.k delta;
        kotlin.text.k delta2;
        int collectionSizeOrDefault;
        String str;
        Intrinsics.echo(deepLink, "deepLink");
        Intrinsics.echo(arguments, "arguments");
        Regex regex = (Regex) this.foxtrot.getValue();
        if (regex != null && (delta = regex.delta(deepLink.toString())) != null) {
            int i4 = 0;
            Bundle charlie = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
            if (echo(delta, charlie, arguments) && (!((Boolean) this.golf.getValue()).booleanValue() || foxtrot(deepLink, charlie, arguments))) {
                String fragment = deepLink.getFragment();
                Regex regex2 = (Regex) this.mike.getValue();
                if (regex2 != null && (delta2 = regex2.delta(String.valueOf(fragment))) != null) {
                    List list = (List) this.kilo.getValue();
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        String str2 = (String) obj;
                        kotlin.text.i bravo = delta2.charlie.bravo(i5);
                        if (bravo != null) {
                            str = Uri.decode(bravo.alpha);
                            Intrinsics.delta(str, "decode(...)");
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        try {
                            golf(charlie, str2, str, (k) arguments.get(str2));
                            arrayList.add(Unit.INSTANCE);
                            i4 = i5;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (AbstractC2971b2.alpha(arguments, new u(0, charlie)).isEmpty()) {
                    return charlie;
                }
            }
        }
        return null;
    }

    public final boolean echo(kotlin.text.k kVar, Bundle bundle, LinkedHashMap linkedHashMap) {
        int collectionSizeOrDefault;
        String str;
        ArrayList arrayList = this.delta;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) next;
            kotlin.text.i bravo = kVar.charlie.bravo(i5);
            if (bravo != null) {
                str = Uri.decode(bravo.alpha);
                Intrinsics.delta(str, "decode(...)");
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            try {
                golf(bundle, str2, str, (k) linkedHashMap.get(str2));
                arrayList2.add(Unit.INSTANCE);
                i4 = i5;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof w)) {
            w wVar = (w) obj;
            if (Intrinsics.areEqual(this.alpha, wVar.alpha) && Intrinsics.areEqual(this.bravo, wVar.bravo) && Intrinsics.areEqual(this.charlie, wVar.charlie)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean foxtrot(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        kotlin.text.k kVar;
        int collectionSizeOrDefault;
        String str;
        Object obj;
        boolean z2;
        String query;
        loop0: for (Map.Entry entry : ((Map) this.hotel.getValue()).entrySet()) {
            String str2 = (String) entry.getKey();
            v vVar = (v) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str2);
            if (this.india && (query = uri.getQuery()) != null && !Intrinsics.areEqual(query, uri.toString())) {
                queryParameters = kotlin.collections.ab.juliet(query);
            }
            boolean z10 = false;
            Bundle charlie = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Iterator it = vVar.bravo.iterator();
            while (true) {
                aq aqVar = null;
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                k kVar2 = (k) linkedHashMap.get(str3);
                if (kVar2 != null) {
                    aqVar = kVar2.alpha;
                }
                if ((aqVar instanceof f) && !kVar2.charlie) {
                    f fVar = (f) aqVar;
                    fVar.echo(charlie, str3, fVar.golf());
                }
            }
            for (String str4 : queryParameters) {
                String str5 = vVar.alpha;
                if (str5 != null) {
                    kVar = new Regex(str5).delta(str4);
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    return z10;
                }
                ArrayList arrayList = vVar.bravo;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                Iterator it2 = arrayList.iterator();
                ?? r13 = z10;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i4 = r13 + 1;
                    if (r13 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String key = (String) next;
                    kotlin.text.i bravo = kVar.charlie.bravo(i4);
                    if (bravo != null) {
                        str = bravo.alpha;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    k kVar3 = (k) linkedHashMap.get(key);
                    try {
                        Intrinsics.echo(key, "key");
                        if (!charlie.containsKey(key)) {
                            golf(charlie, key, str, kVar3);
                            obj = Unit.INSTANCE;
                        } else {
                            if (!charlie.containsKey(key)) {
                                z2 = true;
                            } else {
                                if (kVar3 != null) {
                                    aq aqVar2 = kVar3.alpha;
                                    Object alpha = aqVar2.alpha(charlie, key);
                                    if (charlie.containsKey(key)) {
                                        aqVar2.echo(charlie, key, aqVar2.charlie(alpha, str));
                                    } else {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                        break loop0;
                                    }
                                }
                                z2 = false;
                            }
                            obj = Boolean.valueOf(z2);
                        }
                    } catch (IllegalArgumentException unused) {
                        obj = Unit.INSTANCE;
                    }
                    arrayList2.add(obj);
                    r13 = i4;
                    z10 = false;
                }
            }
            bundle.putAll(charlie);
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int i5;
        int i10 = 0;
        String str = this.alpha;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = i4 * 31;
        String str2 = this.bravo;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        String str3 = this.charlie;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i12 + i10;
    }
}
