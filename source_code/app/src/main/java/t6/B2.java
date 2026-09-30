package t6;

import a0.AbstractC0362p;
import a0.C0346af;
import a0.C0366t;
import android.view.View;
import android.view.ViewParent;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import delivery.samurai.android.R;
import g0.C1725e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Node;
import pf.AbstractC2360j;
import pf.C2355e;

/* loaded from: classes2.dex */
public abstract class B2 {
    public static final Zf.a alpha(Zf.a aVar, String str) {
        Zf.a aVar2 = aVar;
        aVar2.getClass();
        String lookupPrefix = ((Node) aVar2.purple).lookupPrefix("http://schemas.android.com/apk/res/android");
        Intrinsics.delta(lookupPrefix, "lookupPrefix(...)");
        Object obj = null;
        C2355e c2355e = new C2355e(AbstractC2360j.golf(new kotlin.collections.o(new Yf.c(aVar, null)), Yf.b.purple));
        while (true) {
            if (!c2355e.hasNext()) {
                break;
            }
            Object next = c2355e.next();
            Zf.a aVar3 = (Zf.a) next;
            Zf.a aVar4 = aVar3;
            String namespaceURI = ((Node) aVar4.purple).getNamespaceURI();
            Intrinsics.delta(namespaceURI, "getNamespaceURI(...)");
            if (Intrinsics.areEqual(namespaceURI, "http://schemas.android.com/aapt")) {
                String localName = ((Node) aVar4.purple).getLocalName();
                Intrinsics.delta(localName, "getLocalName(...)");
                if (Intrinsics.areEqual(localName, "attr")) {
                    String attribute = aVar3.red.getAttribute("name");
                    Intrinsics.delta(attribute, "getAttribute(...)");
                    if (Intrinsics.areEqual(attribute, lookupPrefix + ":" + str)) {
                        obj = next;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return (Zf.a) obj;
    }

    public static final String bravo(Zf.a aVar, String str) {
        aVar.getClass();
        String attributeNS = aVar.red.getAttributeNS("http://schemas.android.com/apk/res/android", str);
        Intrinsics.delta(attributeNS, "getAttributeNS(...)");
        if (!StringsKt.gray(attributeNS)) {
            return attributeNS;
        }
        return null;
    }

    public static final ViewParent charlie(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final Pair[] delta(Zf.a aVar) {
        Integer num;
        Integer num2;
        Pair pair;
        Integer num3 = null;
        List quebec = AbstractC2360j.quebec(AbstractC2360j.golf(AbstractC2360j.golf(new kotlin.collections.o(new Yf.c(aVar, null)), Yf.b.red), new X9.i(18)));
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (Object obj : quebec) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Zf.a aVar2 = (Zf.a) obj;
            float f5 = i4;
            int ivory = CollectionsKt.ivory(quebec);
            if (ivory < 1) {
                ivory = 1;
            }
            float f10 = f5 / ivory;
            String bravo = bravo(aVar2, "offset");
            if (bravo != null) {
                f10 = Float.parseFloat(bravo);
            }
            String bravo2 = bravo(aVar2, Constants.KEY_COLOR);
            if (bravo2 != null) {
                pair = new Pair(Float.valueOf(f10), new C0366t(a0.ao.charlie(A2.delta(bravo2))));
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
            i4 = i5;
        }
        if (arrayList.isEmpty()) {
            String bravo3 = bravo(aVar, "startColor");
            if (bravo3 != null) {
                num = Integer.valueOf(A2.delta(bravo3));
            } else {
                num = null;
            }
            String bravo4 = bravo(aVar, "centerColor");
            if (bravo4 != null) {
                num2 = Integer.valueOf(A2.delta(bravo4));
            } else {
                num2 = null;
            }
            String bravo5 = bravo(aVar, "endColor");
            if (bravo5 != null) {
                num3 = Integer.valueOf(A2.delta(bravo5));
            }
            if (num != null) {
                arrayList.add(new Pair(Float.valueOf(0.0f), new C0366t(a0.ao.charlie(num.intValue()))));
            }
            if (num2 != null) {
                arrayList.add(new Pair(Float.valueOf(0.5f), new C0366t(a0.ao.charlie(num2.intValue()))));
            }
            if (num3 != null) {
                arrayList.add(new Pair(Float.valueOf(1.0f), new C0366t(a0.ao.charlie(num3.intValue()))));
            }
        }
        return (Pair[]) arrayList.toArray(new Pair[0]);
    }

    public static final a0.aq echo(Zf.a aVar) {
        Object obj;
        String bravo;
        float f5;
        float f10;
        float f11;
        int i4;
        float f12;
        float f13;
        int i5;
        float f14;
        C2355e c2355e = new C2355e(AbstractC2360j.golf(new kotlin.collections.o(new Yf.c(aVar, null)), Yf.b.silver));
        while (true) {
            if (c2355e.hasNext()) {
                obj = c2355e.next();
                String nodeName = ((Node) ((Zf.a) obj).purple).getNodeName();
                Intrinsics.delta(nodeName, "getNodeName(...)");
                if (Intrinsics.areEqual(nodeName, "gradient")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Zf.a aVar2 = (Zf.a) obj;
        if (aVar2 != null && (bravo = bravo(aVar2, Constants.KEY_TYPE)) != null) {
            int hashCode = bravo.hashCode();
            int i10 = 0;
            float f15 = 0.0f;
            if (hashCode != -1102672091) {
                if (hashCode != -938579425) {
                    if (hashCode == 109850348 && bravo.equals("sweep")) {
                        Pair[] delta = delta(aVar2);
                        Pair[] pairArr = (Pair[]) Arrays.copyOf(delta, delta.length);
                        String bravo2 = bravo(aVar2, "centerX");
                        if (bravo2 != null) {
                            f14 = Float.parseFloat(bravo2);
                        } else {
                            f14 = 0.0f;
                        }
                        String bravo3 = bravo(aVar2, "centerY");
                        if (bravo3 != null) {
                            f15 = Float.parseFloat(bravo3);
                        }
                        long floatToRawIntBits = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L);
                        ArrayList arrayList = new ArrayList(pairArr.length);
                        for (Pair pair : pairArr) {
                            arrayList.add(new C0366t(((C0366t) pair.getSecond()).alpha));
                        }
                        int length = pairArr.length;
                        ArrayList arrayList2 = new ArrayList(length);
                        while (i10 < length) {
                            arrayList2.add(Float.valueOf(((Number) pairArr[i10].getFirst()).floatValue()));
                            i10++;
                        }
                        return new a0.av(floatToRawIntBits, arrayList, arrayList2);
                    }
                } else if (bravo.equals("radial")) {
                    Pair[] delta2 = delta(aVar2);
                    Pair[] pairArr2 = (Pair[]) Arrays.copyOf(delta2, delta2.length);
                    String bravo4 = bravo(aVar2, "centerX");
                    if (bravo4 != null) {
                        f12 = Float.parseFloat(bravo4);
                    } else {
                        f12 = 0.0f;
                    }
                    String bravo5 = bravo(aVar2, "centerY");
                    if (bravo5 != null) {
                        f13 = Float.parseFloat(bravo5);
                    } else {
                        f13 = 0.0f;
                    }
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L);
                    String bravo6 = bravo(aVar2, "gradientRadius");
                    if (bravo6 != null) {
                        f15 = Float.parseFloat(bravo6);
                    }
                    float f16 = f15;
                    String bravo7 = bravo(aVar2, "tileMode");
                    if (bravo7 != null) {
                        i5 = A2.foxtrot(bravo7);
                    } else {
                        i5 = 0;
                    }
                    ArrayList arrayList3 = new ArrayList(pairArr2.length);
                    for (Pair pair2 : pairArr2) {
                        arrayList3.add(new C0366t(((C0366t) pair2.getSecond()).alpha));
                    }
                    int length2 = pairArr2.length;
                    ArrayList arrayList4 = new ArrayList(length2);
                    while (i10 < length2) {
                        arrayList4.add(Float.valueOf(((Number) pairArr2[i10].getFirst()).floatValue()));
                        i10++;
                    }
                    return new a0.am(arrayList3, arrayList4, floatToRawIntBits2, f16, i5);
                }
            } else if (bravo.equals("linear")) {
                Pair[] delta3 = delta(aVar2);
                Pair[] pairArr3 = (Pair[]) Arrays.copyOf(delta3, delta3.length);
                String bravo8 = bravo(aVar2, "startX");
                if (bravo8 != null) {
                    f5 = Float.parseFloat(bravo8);
                } else {
                    f5 = 0.0f;
                }
                String bravo9 = bravo(aVar2, "startY");
                if (bravo9 != null) {
                    f10 = Float.parseFloat(bravo9);
                } else {
                    f10 = 0.0f;
                }
                long floatToRawIntBits3 = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
                String bravo10 = bravo(aVar2, "endX");
                if (bravo10 != null) {
                    f11 = Float.parseFloat(bravo10);
                } else {
                    f11 = 0.0f;
                }
                String bravo11 = bravo(aVar2, "endY");
                if (bravo11 != null) {
                    f15 = Float.parseFloat(bravo11);
                }
                long floatToRawIntBits4 = (Float.floatToRawIntBits(f11) << 32) | (4294967295L & Float.floatToRawIntBits(f15));
                String bravo12 = bravo(aVar2, "tileMode");
                if (bravo12 != null) {
                    i4 = A2.foxtrot(bravo12);
                } else {
                    i4 = 0;
                }
                ArrayList arrayList5 = new ArrayList(pairArr3.length);
                for (Pair pair3 : pairArr3) {
                    arrayList5.add(new C0366t(((C0366t) pair3.getSecond()).alpha));
                }
                int length3 = pairArr3.length;
                ArrayList arrayList6 = new ArrayList(length3);
                while (i10 < length3) {
                    arrayList6.add(Float.valueOf(((Number) pairArr3[i10].getFirst()).floatValue()));
                    i10++;
                }
                return new C0346af(arrayList5, arrayList6, floatToRawIntBits3, floatToRawIntBits4, i4);
            }
        }
        return null;
    }

    public static final void foxtrot(Zf.a aVar, C1725e c1725e, T3.b bVar) {
        AbstractC0362p abstractC0362p;
        C2355e c2355e;
        int i4;
        String str;
        AbstractC0362p abstractC0362p2;
        float f5;
        AbstractC0362p abstractC0362p3;
        float f10;
        float f11;
        int i5;
        AbstractC0362p abstractC0362p4;
        int i10;
        float f12;
        float f13;
        float f14;
        float f15;
        C1725e c1725e2;
        float f16;
        float f17;
        int i11;
        int i12;
        int i13;
        String str2;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        Yf.a aVar2;
        AbstractC0362p abstractC0362p5 = null;
        C2355e c2355e2 = new C2355e(AbstractC2360j.golf(new kotlin.collections.o(new Yf.c(aVar, null)), Yf.b.teal));
        while (c2355e2.hasNext()) {
            Zf.a aVar3 = (Zf.a) c2355e2.next();
            String nodeName = ((Node) aVar3.purple).getNodeName();
            Intrinsics.delta(nodeName, "getNodeName(...)");
            int hashCode = nodeName.hashCode();
            ArrayList arrayList = bVar.alpha;
            String str3 = "";
            if (hashCode != -1649314686) {
                if (hashCode != 3433509) {
                    if (hashCode == 98629247 && nodeName.equals(CTVariableUtils.DICTIONARY)) {
                        String bravo = bravo(aVar3, "name");
                        if (bravo == null) {
                            str2 = "";
                        } else {
                            str2 = bravo;
                        }
                        String bravo2 = bravo(aVar3, "rotation");
                        if (bravo2 != null) {
                            f18 = Float.parseFloat(bravo2);
                        } else {
                            f18 = 0.0f;
                        }
                        String bravo3 = bravo(aVar3, "pivotX");
                        if (bravo3 != null) {
                            f19 = Float.parseFloat(bravo3);
                        } else {
                            f19 = 0.0f;
                        }
                        String bravo4 = bravo(aVar3, "pivotY");
                        if (bravo4 != null) {
                            f20 = Float.parseFloat(bravo4);
                        } else {
                            f20 = 0.0f;
                        }
                        String bravo5 = bravo(aVar3, "scaleX");
                        if (bravo5 != null) {
                            f21 = Float.parseFloat(bravo5);
                        } else {
                            f21 = 1.0f;
                        }
                        String bravo6 = bravo(aVar3, "scaleY");
                        if (bravo6 != null) {
                            f22 = Float.parseFloat(bravo6);
                        } else {
                            f22 = 1.0f;
                        }
                        String bravo7 = bravo(aVar3, "translateX");
                        if (bravo7 != null) {
                            f23 = Float.parseFloat(bravo7);
                        } else {
                            f23 = 0.0f;
                        }
                        String bravo8 = bravo(aVar3, "translateY");
                        if (bravo8 != null) {
                            f24 = Float.parseFloat(bravo8);
                        } else {
                            f24 = 0.0f;
                        }
                        c1725e.alpha(str2, f18, f19, f20, f21, f22, f23, f24, g0.ah.alpha);
                        arrayList.add(Yf.a.alpha);
                        foxtrot(aVar3, c1725e, bVar);
                        do {
                            aVar2 = (Yf.a) CollectionsKt.g(arrayList);
                            c1725e.foxtrot();
                        } while (aVar2 == Yf.a.purple);
                    }
                } else if (nodeName.equals("path")) {
                    List alpha = g0.ah.alpha(bravo(aVar3, "pathData"));
                    String bravo9 = bravo(aVar3, "fillType");
                    if (bravo9 != null) {
                        if (Intrinsics.areEqual(bravo9, "nonZero")) {
                            i13 = 0;
                        } else if (Intrinsics.areEqual(bravo9, "evenOdd")) {
                            i13 = 1;
                        } else {
                            throw new UnsupportedOperationException("unknown fillType: ".concat(bravo9));
                        }
                        i4 = i13;
                    } else {
                        i4 = 0;
                    }
                    String bravo10 = bravo(aVar3, "name");
                    if (bravo10 == null) {
                        str = "";
                    } else {
                        str = bravo10;
                    }
                    String bravo11 = bravo(aVar3, "fillColor");
                    if (bravo11 != null) {
                        abstractC0362p2 = new a0.au(a0.ao.charlie(A2.delta(bravo11)));
                    } else {
                        Zf.a alpha2 = alpha(aVar3, "fillColor");
                        if (alpha2 != null) {
                            abstractC0362p2 = echo(alpha2);
                        } else {
                            abstractC0362p2 = abstractC0362p5;
                        }
                    }
                    String bravo12 = bravo(aVar3, "fillAlpha");
                    if (bravo12 != null) {
                        f5 = Float.parseFloat(bravo12);
                    } else {
                        f5 = 1.0f;
                    }
                    String bravo13 = bravo(aVar3, "strokeColor");
                    if (bravo13 != null) {
                        abstractC0362p3 = new a0.au(a0.ao.charlie(A2.delta(bravo13)));
                    } else {
                        Zf.a alpha3 = alpha(aVar3, "strokeColor");
                        if (alpha3 != null) {
                            abstractC0362p3 = echo(alpha3);
                        } else {
                            abstractC0362p3 = abstractC0362p5;
                        }
                    }
                    String bravo14 = bravo(aVar3, "strokeAlpha");
                    if (bravo14 != null) {
                        f10 = Float.parseFloat(bravo14);
                    } else {
                        f10 = 1.0f;
                    }
                    String bravo15 = bravo(aVar3, "strokeWidth");
                    if (bravo15 != null) {
                        f11 = Float.parseFloat(bravo15);
                    } else {
                        f11 = 1.0f;
                    }
                    String bravo16 = bravo(aVar3, "strokeLineCap");
                    if (bravo16 != null) {
                        int hashCode2 = bravo16.hashCode();
                        if (hashCode2 != -894674659) {
                            if (hashCode2 != 3035667) {
                                if (hashCode2 == 108704142 && bravo16.equals("round")) {
                                    i12 = 1;
                                    i5 = i12;
                                }
                                throw new UnsupportedOperationException("unknown strokeCap: ".concat(bravo16));
                            }
                            if (bravo16.equals("butt")) {
                                i12 = 0;
                                i5 = i12;
                            } else {
                                throw new UnsupportedOperationException("unknown strokeCap: ".concat(bravo16));
                            }
                        } else if (bravo16.equals("square")) {
                            i12 = 2;
                            i5 = i12;
                        } else {
                            throw new UnsupportedOperationException("unknown strokeCap: ".concat(bravo16));
                        }
                    } else {
                        i5 = 0;
                    }
                    String bravo17 = bravo(aVar3, "strokeLineJoin");
                    if (bravo17 != null) {
                        int hashCode3 = bravo17.hashCode();
                        abstractC0362p4 = abstractC0362p2;
                        if (hashCode3 != 93630586) {
                            if (hashCode3 != 103906565) {
                                if (hashCode3 == 108704142 && bravo17.equals("round")) {
                                    i11 = 1;
                                    i10 = i11;
                                }
                                throw new UnsupportedOperationException("unknown strokeJoin: ".concat(bravo17));
                            }
                            if (bravo17.equals("miter")) {
                                i11 = 0;
                                i10 = i11;
                            } else {
                                throw new UnsupportedOperationException("unknown strokeJoin: ".concat(bravo17));
                            }
                        } else if (bravo17.equals("bevel")) {
                            i11 = 2;
                            i10 = i11;
                        } else {
                            throw new UnsupportedOperationException("unknown strokeJoin: ".concat(bravo17));
                        }
                    } else {
                        abstractC0362p4 = abstractC0362p2;
                        i10 = 0;
                    }
                    String bravo18 = bravo(aVar3, "strokeMiterLimit");
                    if (bravo18 != null) {
                        f12 = Float.parseFloat(bravo18);
                    } else {
                        f12 = 1.0f;
                    }
                    String bravo19 = bravo(aVar3, "trimPathStart");
                    if (bravo19 != null) {
                        f13 = Float.parseFloat(bravo19);
                    } else {
                        f13 = 0.0f;
                    }
                    String bravo20 = bravo(aVar3, "trimPathEnd");
                    if (bravo20 != null) {
                        f14 = Float.parseFloat(bravo20);
                    } else {
                        f14 = 1.0f;
                    }
                    String bravo21 = bravo(aVar3, "trimPathOffset");
                    if (bravo21 != null) {
                        f17 = Float.parseFloat(bravo21);
                        float f25 = f5;
                        f15 = f12;
                        c1725e2 = c1725e;
                        f16 = f25;
                    } else {
                        float f26 = f5;
                        f15 = f12;
                        c1725e2 = c1725e;
                        f16 = f26;
                        f17 = 0.0f;
                    }
                    c2355e = c2355e2;
                    abstractC0362p = null;
                    c1725e2.charlie(f16, f10, f11, f15, f13, f14, f17, i4, i5, i10, abstractC0362p4, abstractC0362p3, str, alpha);
                }
                abstractC0362p = abstractC0362p5;
                c2355e = c2355e2;
            } else {
                abstractC0362p = abstractC0362p5;
                c2355e = c2355e2;
                if (nodeName.equals("clip-path")) {
                    String bravo22 = bravo(aVar3, "name");
                    if (bravo22 != null) {
                        str3 = bravo22;
                    }
                    C1725e.bravo(c1725e, str3, g0.ah.alpha(bravo(aVar3, "pathData")));
                    arrayList.add(Yf.a.purple);
                }
            }
            c2355e2 = c2355e;
            abstractC0362p5 = abstractC0362p;
        }
    }
}
