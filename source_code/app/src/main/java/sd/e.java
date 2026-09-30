package sd;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends K3.b {
    public static final e white;
    public final String silver;
    public final String teal;

    static {
        String str = "*";
        white = new e(str, str);
    }

    public e(String str, String str2, String str3, List list) {
        super(str3, list);
        this.silver = str;
        this.teal = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (kotlin.text.r.hotel(r1.bravo, r7, true) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e amber(String str) {
        List<j> list = (List) this.red;
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                if (!list.isEmpty()) {
                    for (j jVar : list) {
                        if (kotlin.text.r.hotel(jVar.alpha, "charset", true) && kotlin.text.r.hotel(jVar.bravo, str, true)) {
                            return this;
                        }
                    }
                }
            } else {
                j jVar2 = (j) list.get(0);
                if (kotlin.text.r.hotel(jVar2.alpha, "charset", true)) {
                }
            }
        }
        List plus = CollectionsKt.plus(list, new j("charset", str));
        return new e(this.silver, this.teal, (String) this.purple, plus);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (kotlin.text.r.hotel(this.silver, eVar.silver, true) && kotlin.text.r.hotel(this.teal, eVar.teal, true)) {
                if (Intrinsics.areEqual((List) this.red, (List) eVar.red)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.silver.toLowerCase(locale);
        Intrinsics.delta(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.teal.toLowerCase(locale);
        Intrinsics.delta(lowerCase2, "toLowerCase(...)");
        return (((List) this.red).hashCode() * 31) + lowerCase2.hashCode() + (hashCode * 31) + hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r2 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zulu(e pattern) {
        boolean hotel;
        Intrinsics.echo(pattern, "pattern");
        String str = pattern.silver;
        if (Intrinsics.areEqual(str, "*") || kotlin.text.r.hotel(str, this.silver, true)) {
            String str2 = pattern.teal;
            if (Intrinsics.areEqual(str2, "*") || kotlin.text.r.hotel(str2, this.teal, true)) {
                for (j jVar : (List) pattern.red) {
                    String str3 = jVar.alpha;
                    boolean areEqual = Intrinsics.areEqual(str3, "*");
                    String str4 = jVar.bravo;
                    if (areEqual) {
                        if (!Intrinsics.areEqual(str4, "*")) {
                            List list = (List) this.red;
                            if (list == null || !list.isEmpty()) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    if (kotlin.text.r.hotel(((j) it.next()).bravo, str4, true)) {
                                    }
                                }
                            }
                            hotel = false;
                        }
                        hotel = true;
                        break;
                    }
                    String romeo = romeo(str3);
                    if (!Intrinsics.areEqual(str4, "*")) {
                        hotel = kotlin.text.r.hotel(romeo, str4, true);
                    }
                    if (!hotel) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ e(String str, String str2) {
        this(str, str2, CollectionsKt.emptyList());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String contentType, String contentSubtype, List parameters) {
        this(contentType, contentSubtype, contentType + '/' + contentSubtype, parameters);
        Intrinsics.echo(contentType, "contentType");
        Intrinsics.echo(contentSubtype, "contentSubtype");
        Intrinsics.echo(parameters, "parameters");
    }
}
