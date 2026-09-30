package Y1;

import androidx.appcompat.widget.P0;
import com.google.android.gms.internal.measurement.T;
import com.google.android.gms.internal.measurement.W;
import d2.AbstractC1579d;
import ge.InterfaceC1772d;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2698k6;
import s6.T5;

/* loaded from: classes3.dex */
public abstract class ab {
    public final String alpha;
    public final int bravo;
    public Object charlie;
    public Serializable delta;
    public Serializable echo;
    public Serializable foxtrot;

    public ab(String str, int i4) {
        this.alpha = str;
        this.bravo = i4;
    }

    public static Boolean golf(BigDecimal bigDecimal, T t5, double d4) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        V5.x.hotel(t5);
        if (t5.sierra()) {
            boolean z2 = true;
            if (t5.xray() != 1 && (t5.xray() != 5 ? t5.tango() : t5.whiskey() && t5.victor())) {
                int xray = t5.xray();
                try {
                    if (t5.xray() == 5) {
                        if (com.google.android.gms.measurement.internal.au.a0(t5.quebec()) && com.google.android.gms.measurement.internal.au.a0(t5.papa())) {
                            BigDecimal bigDecimal5 = new BigDecimal(t5.quebec());
                            bigDecimal4 = new BigDecimal(t5.papa());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (com.google.android.gms.measurement.internal.au.a0(t5.oscar())) {
                        bigDecimal2 = new BigDecimal(t5.oscar());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (xray != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i4 = xray - 1;
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 == 4 && bigDecimal3 != null) {
                                        if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                            z2 = false;
                                        }
                                        return Boolean.valueOf(z2);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d4 != 0.0d) {
                                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d4).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d4).multiply(new BigDecimal(2)))) >= 0) {
                                            z2 = false;
                                        }
                                        return Boolean.valueOf(z2);
                                    }
                                    if (bigDecimal.compareTo(bigDecimal2) != 0) {
                                        z2 = false;
                                    }
                                    return Boolean.valueOf(z2);
                                }
                            } else if (bigDecimal2 != null) {
                                if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                                    z2 = false;
                                }
                                return Boolean.valueOf(z2);
                            }
                        } else if (bigDecimal2 != null) {
                            if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean hotel(String str, W w4, com.google.android.gms.measurement.internal.ar arVar) {
        String papa;
        List quebec;
        String str2;
        int i4;
        V5.x.hotel(w4);
        if (str != null && w4.uniform() && w4.victor() != 1 && (w4.victor() != 7 ? w4.tango() : w4.november() != 0)) {
            int victor = w4.victor();
            boolean romeo = w4.romeo();
            if (!romeo && victor != 2 && victor != 7) {
                papa = w4.papa().toUpperCase(Locale.ENGLISH);
            } else {
                papa = w4.papa();
            }
            if (w4.november() == 0) {
                quebec = null;
            } else {
                quebec = w4.quebec();
                if (!romeo) {
                    ArrayList arrayList = new ArrayList(quebec.size());
                    Iterator it = quebec.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    quebec = Collections.unmodifiableList(arrayList);
                }
            }
            if (victor == 2) {
                str2 = papa;
            } else {
                str2 = null;
            }
            if (victor != 7 ? papa != null : quebec != null && !quebec.isEmpty()) {
                if (!romeo && victor != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (victor - 1) {
                    case 1:
                        if (str2 != null) {
                            if (true != romeo) {
                                i4 = 66;
                            } else {
                                i4 = 0;
                            }
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, i4).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (arVar != null) {
                                    arVar.f7632b.bravo(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(papa));
                    case 3:
                        return Boolean.valueOf(str.endsWith(papa));
                    case 4:
                        return Boolean.valueOf(str.contains(papa));
                    case 5:
                        return Boolean.valueOf(str.equals(papa));
                    case 6:
                        if (quebec != null) {
                            return Boolean.valueOf(quebec.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean india(long j5, T t5) {
        try {
            return golf(new BigDecimal(j5), t5, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean juliet(Boolean bool, boolean z2) {
        boolean z10;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z2) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public aa alpha() {
        He.b bVar;
        aa charlie = charlie();
        charlie.silver = null;
        Iterator it = ((LinkedHashMap) this.delta).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            bVar = charlie.purple;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String argumentName = (String) entry.getKey();
            k argument = (k) entry.getValue();
            Intrinsics.echo(argumentName, "argumentName");
            Intrinsics.echo(argument, "argument");
            bVar.getClass();
            ((LinkedHashMap) bVar.foxtrot).put(argumentName, argument);
        }
        Iterator it2 = ((ArrayList) this.foxtrot).iterator();
        while (it2.hasNext()) {
            charlie.alpha((w) it2.next());
        }
        for (Map.Entry entry2 : ((LinkedHashMap) this.echo).entrySet()) {
            charlie.mike(((Number) entry2.getKey()).intValue(), (i) entry2.getValue());
        }
        String str = this.alpha;
        if (str != null) {
            charlie.november(str);
        }
        int i4 = this.bravo;
        if (i4 != -1) {
            bVar.charlie = i4;
            bVar.bravo = null;
        }
        return charlie;
    }

    public void bravo(w navDeepLink) {
        Intrinsics.echo(navDeepLink, "navDeepLink");
        ((ArrayList) this.foxtrot).add(navDeepLink);
    }

    public aa charlie() {
        return ((at) this.charlie).alpha();
    }

    public abstract int delta();

    public abstract boolean echo();

    public abstract boolean foxtrot();

    public ab(at atVar, int i4, String str) {
        this.charlie = atVar;
        this.bravo = i4;
        this.alpha = str;
        this.delta = new LinkedHashMap();
        this.foxtrot = new ArrayList();
        this.echo = new LinkedHashMap();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, Y1.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ab(at atVar, InterfaceC1772d interfaceC1772d, kotlin.collections.t typeMap) {
        this(atVar, r0, r3);
        Intrinsics.echo(typeMap, "typeMap");
        int charlie = interfaceC1772d != null ? AbstractC1579d.charlie(T5.bravo(interfaceC1772d)) : -1;
        if (interfaceC1772d != null) {
            KSerializer bravo = T5.bravo(interfaceC1772d);
            if (bravo instanceof Jf.b) {
                StringBuilder sb2 = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                InterfaceC1772d alpha = AbstractC2698k6.alpha(((Jf.b) bravo).getDescriptor());
                throw new IllegalArgumentException(P0.gold(sb2, alpha != null ? alpha.kilo() : null, ". Routes can only be generated from concrete classes or objects."));
            }
            com.google.firebase.messaging.o oVar = new com.google.firebase.messaging.o(bravo);
            Cb.d dVar = new Cb.d(16, oVar);
            int romeo = bravo.getDescriptor().romeo();
            for (int i4 = 0; i4 < romeo; i4++) {
                String sierra = bravo.getDescriptor().sierra(i4);
                aq alpha2 = AbstractC1579d.alpha(bravo.getDescriptor().uniform(i4), typeMap);
                if (alpha2 != null) {
                    dVar.invoke(Integer.valueOf(i4), sierra, alpha2);
                } else {
                    throw new IllegalArgumentException(AbstractC1579d.hotel(sierra, bravo.getDescriptor().uniform(i4).oscar(), bravo.getDescriptor().oscar(), "{}"));
                }
            }
            r3 = ((String) oVar.alpha) + ((String) oVar.charlie) + ((String) oVar.delta);
        }
        if (interfaceC1772d != null) {
            KSerializer bravo2 = T5.bravo(interfaceC1772d);
            if (!(bravo2 instanceof Jf.b)) {
                int romeo2 = bravo2.getDescriptor().romeo();
                ArrayList arrayList = new ArrayList(romeo2);
                for (int i5 = 0; i5 < romeo2; i5++) {
                    String name = bravo2.getDescriptor().sierra(i5);
                    Intrinsics.echo(name, "name");
                    ?? obj = new Object();
                    SerialDescriptor uniform = bravo2.getDescriptor().uniform(i5);
                    boolean papa = uniform.papa();
                    aq alpha3 = AbstractC1579d.alpha(uniform, typeMap);
                    if (alpha3 != null) {
                        obj.delta = alpha3;
                        obj.alpha = papa;
                        if (bravo2.getDescriptor().victor(i5)) {
                            obj.charlie = true;
                        }
                        arrayList.add(new h(name, obj.alpha()));
                    } else {
                        throw new IllegalArgumentException(AbstractC1579d.hotel(name, uniform.oscar(), bravo2.getDescriptor().oscar(), "{}"));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    ((LinkedHashMap) this.delta).put(hVar.alpha, hVar.bravo);
                }
                return;
            }
            throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + bravo2 + ". Arguments can only be generated from concrete classes or objects.");
        }
    }
}
