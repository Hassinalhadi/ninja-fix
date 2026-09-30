package Y1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.xmlpull.v1.XmlPullParserException;
import s6.S6;
import t6.AbstractC2981d2;

/* loaded from: classes3.dex */
public final class ah {
    public static final ThreadLocal charlie = new ThreadLocal();
    public final Context alpha;
    public final au bravo;

    public ah(Context context, au navigatorProvider) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(navigatorProvider, "navigatorProvider");
        this.alpha = context;
        this.bravo = navigatorProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02dc  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, Y1.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k charlie(TypedArray typedArray, Resources resources, int i4) {
        int i5;
        aq aqVar;
        j jVar;
        Object obj;
        boolean z2;
        Integer valueOf;
        String str;
        boolean z10;
        aq aqVar2;
        ?? obj2 = new Object();
        obj2.alpha = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = charlie;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        aq aqVar3 = aq.charlie;
        e eVar = aq.foxtrot;
        e eVar2 = aq.lima;
        e eVar3 = aq.oscar;
        e eVar4 = aq.india;
        e eVar5 = aq.bravo;
        Object obj3 = null;
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i4);
            if (Intrinsics.areEqual("integer", string)) {
                aqVar = eVar5;
            } else if (Intrinsics.areEqual("integer[]", string)) {
                aqVar = aq.delta;
            } else if (Intrinsics.areEqual("List<Int>", string)) {
                aqVar = aq.echo;
            } else if (Intrinsics.areEqual("long", string)) {
                aqVar = eVar;
            } else if (Intrinsics.areEqual("long[]", string)) {
                aqVar = aq.golf;
            } else if (Intrinsics.areEqual("List<Long>", string)) {
                aqVar = aq.hotel;
            } else if (Intrinsics.areEqual(CTVariableUtils.BOOLEAN, string)) {
                aqVar = eVar2;
            } else if (Intrinsics.areEqual("boolean[]", string)) {
                aqVar = aq.mike;
            } else if (Intrinsics.areEqual("List<Boolean>", string)) {
                aqVar = aq.november;
            } else if (Intrinsics.areEqual(CTVariableUtils.STRING, string)) {
                aqVar = eVar3;
            } else if (Intrinsics.areEqual("string[]", string)) {
                aqVar = aq.papa;
            } else if (Intrinsics.areEqual("List<String>", string)) {
                aqVar = aq.quebec;
            } else if (Intrinsics.areEqual("float", string)) {
                aqVar = eVar4;
            } else if (Intrinsics.areEqual("float[]", string)) {
                aqVar = aq.juliet;
            } else if (Intrinsics.areEqual("List<Float>", string)) {
                aqVar = aq.kilo;
            } else {
                aqVar = null;
            }
            if (aqVar == null) {
                if (Intrinsics.areEqual("reference", string)) {
                    i5 = 0;
                    aqVar = aqVar3;
                } else if (string.length() == 0) {
                    i5 = 0;
                    aqVar = eVar3;
                } else {
                    try {
                        if (kotlin.text.r.quebec(string, ".", false) && resourcePackageName != null) {
                            str = resourcePackageName.concat(string);
                        } else {
                            str = string;
                        }
                        boolean golf = kotlin.text.r.golf(string, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, false);
                        if (golf) {
                            z10 = golf;
                            str = str.substring(0, str.length() - 2);
                            Intrinsics.delta(str, "substring(...)");
                        } else {
                            z10 = golf;
                        }
                        Class<?> cls = Class.forName(str);
                        Intrinsics.checkNotNull(cls);
                        i5 = 0;
                        if (Parcelable.class.isAssignableFrom(cls)) {
                            if (z10) {
                                aqVar2 = new am(cls);
                            } else {
                                aqVar2 = new an(cls);
                            }
                        } else if (Enum.class.isAssignableFrom(cls) && !z10) {
                            aqVar2 = new al(cls);
                        } else if (Serializable.class.isAssignableFrom(cls)) {
                            if (z10) {
                                aqVar2 = new ao(cls);
                            } else {
                                aqVar2 = new ap(cls);
                            }
                        } else {
                            aqVar2 = null;
                        }
                        if (aqVar2 != null) {
                            aqVar = aqVar2;
                        } else {
                            throw new IllegalArgumentException((str + " is not Serializable or Parcelable.").toString());
                        }
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else {
                i5 = 0;
            }
        } else {
            i5 = 0;
            aqVar = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            jVar = obj2;
            if (aqVar == aqVar3) {
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    valueOf = Integer.valueOf(i10);
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    valueOf = Integer.valueOf(i5);
                } else {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + aqVar.bravo() + ". Must be a reference to a resource.");
                }
                obj3 = valueOf;
            } else {
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    if (aqVar == null) {
                        obj3 = Integer.valueOf(i11);
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + aqVar.bravo() + ". You must use a \"reference\" type to reference other resources.");
                    }
                } else if (aqVar == eVar3) {
                    obj3 = typedArray.getString(1);
                } else {
                    int i12 = typedValue.type;
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                if (i12 != 18) {
                                    if (i12 >= 16 && i12 <= 31) {
                                        if (aqVar == eVar4) {
                                            aqVar3 = AbstractC2981d2.bravo(typedValue, aqVar, eVar4, string, "float");
                                            obj3 = Float.valueOf(typedValue.data);
                                        } else {
                                            aqVar3 = AbstractC2981d2.bravo(typedValue, aqVar, eVar5, string, "integer");
                                            obj3 = Integer.valueOf(typedValue.data);
                                        }
                                    } else {
                                        throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                    }
                                } else {
                                    aqVar3 = AbstractC2981d2.bravo(typedValue, aqVar, eVar2, string, CTVariableUtils.BOOLEAN);
                                    if (typedValue.data != 0) {
                                        z2 = 1;
                                    } else {
                                        z2 = i5;
                                    }
                                    obj3 = Boolean.valueOf(z2);
                                }
                            } else {
                                aqVar3 = AbstractC2981d2.bravo(typedValue, aqVar, eVar5, string, "dimension");
                                obj3 = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                            }
                        } else {
                            aqVar3 = AbstractC2981d2.bravo(typedValue, aqVar, eVar4, string, "float");
                            obj3 = Float.valueOf(typedValue.getFloat());
                        }
                    } else {
                        String value = typedValue.string.toString();
                        if (aqVar == null) {
                            Intrinsics.echo(value, "value");
                            try {
                                try {
                                    try {
                                        try {
                                            eVar5.delta(value);
                                        } catch (IllegalArgumentException unused) {
                                            eVar = eVar3;
                                            eVar5 = eVar;
                                            aqVar3 = eVar5;
                                            obj3 = aqVar3.delta(value);
                                            obj = obj3;
                                            j jVar2 = jVar;
                                            if (obj != null) {
                                            }
                                            if (aqVar3 != null) {
                                            }
                                            return jVar2.alpha();
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        eVar.delta(value);
                                        eVar5 = eVar;
                                        aqVar3 = eVar5;
                                        obj3 = aqVar3.delta(value);
                                        obj = obj3;
                                        j jVar22 = jVar;
                                        if (obj != null) {
                                        }
                                        if (aqVar3 != null) {
                                        }
                                        return jVar22.alpha();
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    eVar2.delta(value);
                                    eVar = eVar2;
                                    eVar5 = eVar;
                                    aqVar3 = eVar5;
                                    obj3 = aqVar3.delta(value);
                                    obj = obj3;
                                    j jVar222 = jVar;
                                    if (obj != null) {
                                    }
                                    if (aqVar3 != null) {
                                    }
                                    return jVar222.alpha();
                                }
                            } catch (IllegalArgumentException unused4) {
                                eVar4.delta(value);
                                eVar = eVar4;
                                eVar5 = eVar;
                                aqVar3 = eVar5;
                                obj3 = aqVar3.delta(value);
                                obj = obj3;
                                j jVar2222 = jVar;
                                if (obj != null) {
                                }
                                if (aqVar3 != null) {
                                }
                                return jVar2222.alpha();
                            }
                            aqVar3 = eVar5;
                        } else {
                            aqVar3 = aqVar;
                        }
                        obj3 = aqVar3.delta(value);
                    }
                }
                obj = obj3;
                j jVar22222 = jVar;
                if (obj != null) {
                    jVar22222.echo = obj;
                    jVar22222.bravo = true;
                }
                if (aqVar3 != null) {
                    jVar22222.delta = aqVar3;
                }
                return jVar22222.alpha();
            }
        } else {
            jVar = obj2;
        }
        aqVar3 = aqVar;
        obj = obj3;
        j jVar222222 = jVar;
        if (obj != null) {
        }
        if (aqVar3 != null) {
        }
        return jVar222222.alpha();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0105, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0225, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aa alpha(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i4) {
        int depth;
        String str;
        String str2;
        Context context;
        int i5;
        TypedArray typedArray;
        Object obj;
        int i10 = i4;
        String name = xmlResourceParser.getName();
        Intrinsics.delta(name, "getName(...)");
        aa alpha = this.bravo.bravo(name).alpha();
        Context context2 = this.alpha;
        alpha.lima(context2, attributeSet);
        int i11 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i11 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean areEqual = Intrinsics.areEqual("argument", name2);
                int[] iArr = Z1.a.bravo;
                if (areEqual) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    Intrinsics.delta(obtainAttributes, "obtainAttributes(...)");
                    String string = obtainAttributes.getString(0);
                    if (string != null) {
                        k charlie2 = charlie(obtainAttributes, resources, i10);
                        He.b bVar = alpha.purple;
                        bVar.getClass();
                        ((LinkedHashMap) bVar.foxtrot).put(string, charlie2);
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else if (Intrinsics.areEqual("deepLink", name2)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, Z1.a.charlie);
                    Intrinsics.delta(obtainAttributes2, "obtainAttributes(...)");
                    String string2 = obtainAttributes2.getString(3);
                    String string3 = obtainAttributes2.getString(i11);
                    String string4 = obtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        break;
                    }
                    String str3 = null;
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        Intrinsics.delta(packageName, "getPackageName(...)");
                        str = kotlin.text.r.oscar(string2, "${applicationId}", packageName);
                    } else {
                        str = null;
                    }
                    if (string3 != null && string3.length() != 0) {
                        String packageName2 = context2.getPackageName();
                        Intrinsics.delta(packageName2, "getPackageName(...)");
                        str2 = kotlin.text.r.oscar(string3, "${applicationId}", packageName2);
                        if (str2.length() <= 0) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                        }
                    } else {
                        str2 = null;
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        Intrinsics.delta(packageName3, "getPackageName(...)");
                        str3 = kotlin.text.r.oscar(string4, "${applicationId}", packageName3);
                    }
                    alpha.alpha(new w(str, str2, str3));
                    obtainAttributes2.recycle();
                } else {
                    if (Intrinsics.areEqual(Constants.KEY_ACTION, name2)) {
                        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, Z1.a.alpha, 0, 0);
                        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                        int i12 = i11;
                        i iVar = new i(obtainStyledAttributes.getResourceId(i11, 0));
                        iVar.bravo = new aj(obtainStyledAttributes.getBoolean(4, false), obtainStyledAttributes.getBoolean(10, false), obtainStyledAttributes.getResourceId(7, -1), obtainStyledAttributes.getBoolean(8, false), obtainStyledAttributes.getBoolean(9, false), obtainStyledAttributes.getResourceId(2, -1), obtainStyledAttributes.getResourceId(3, -1), obtainStyledAttributes.getResourceId(5, -1), obtainStyledAttributes.getResourceId(6, -1));
                        Bundle charlie3 = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        context = context2;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            i5 = depth2;
                            if (next2 != i12) {
                                int depth4 = xmlResourceParser.getDepth();
                                typedArray = obtainStyledAttributes;
                                if (depth4 < depth3 && next2 == 3) {
                                    break;
                                }
                                if (next2 == 2 && depth4 <= depth3) {
                                    if (Intrinsics.areEqual("argument", xmlResourceParser.getName())) {
                                        TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                        Intrinsics.delta(obtainAttributes3, "obtainAttributes(...)");
                                        String string5 = obtainAttributes3.getString(0);
                                        if (string5 != null) {
                                            k charlie4 = charlie(obtainAttributes3, resources, i10);
                                            boolean z2 = charlie4.charlie;
                                            if (z2 && z2 && (obj = charlie4.echo) != null) {
                                                charlie4.alpha.echo(charlie3, string5, obj);
                                            }
                                            obtainAttributes3.recycle();
                                        } else {
                                            throw new XmlPullParserException("Arguments must have a name");
                                        }
                                    }
                                    i10 = i4;
                                }
                                depth2 = i5;
                                obtainStyledAttributes = typedArray;
                                i12 = 1;
                            } else {
                                typedArray = obtainStyledAttributes;
                                break;
                            }
                        }
                        if (!charlie3.isEmpty()) {
                            iVar.charlie = charlie3;
                        }
                        alpha.mike(resourceId, iVar);
                        typedArray.recycle();
                    } else {
                        context = context2;
                        i5 = depth2;
                        if (Intrinsics.areEqual("include", name2) && (alpha instanceof ac)) {
                            TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, aw.charlie);
                            Intrinsics.delta(obtainAttributes4, "obtainAttributes(...)");
                            ((ac) alpha).yellow.bravo(bravo(obtainAttributes4.getResourceId(0, 0)));
                            obtainAttributes4.recycle();
                        } else if (alpha instanceof ac) {
                            ((ac) alpha).yellow.bravo(alpha(resources, xmlResourceParser, attributeSet, i4));
                        }
                    }
                    i10 = i4;
                    context2 = context;
                    depth2 = i5;
                    i11 = 1;
                }
            }
        }
    }

    public final ac bravo(int i4) {
        int next;
        Resources resources = this.alpha.getResources();
        XmlResourceParser xml = resources.getXml(i4);
        Intrinsics.delta(xml, "getXml(...)");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i4) + " line " + xml.getLineNumber(), e);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            Intrinsics.checkNotNull(resources);
            Intrinsics.checkNotNull(asAttributeSet);
            aa alpha = alpha(resources, xml, asAttributeSet, i4);
            if (alpha instanceof ac) {
                return (ac) alpha;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
