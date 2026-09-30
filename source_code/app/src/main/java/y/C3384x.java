package y;

import android.util.JsonReader;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3042p3;

/* renamed from: y.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3384x implements InterfaceC3386z, S7.b {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, R7.D] */
    @Override // S7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object alpha(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case -1536268810:
                    if (nextName.equals("parameterKey")) {
                        c3 = 0;
                    }
                    switch (c3) {
                        case 0:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                obj.bravo = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null parameterKey");
                            }
                        case 1:
                            obj.delta = jsonReader.nextLong();
                            obj.echo = (byte) (obj.echo | 1);
                            break;
                        case 2:
                            jsonReader.beginObject();
                            String str = null;
                            String str2 = null;
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                nextName2.getClass();
                                if (!nextName2.equals("variantId")) {
                                    if (!nextName2.equals("rolloutId")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str = jsonReader.nextString();
                                        if (str == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    }
                                } else {
                                    str2 = jsonReader.nextString();
                                    if (str2 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                }
                            }
                            jsonReader.endObject();
                            if (str != null && str2 != null) {
                                obj.alpha = new R7.F(str, str2);
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                if (str == null) {
                                    sb2.append(" rolloutId");
                                }
                                if (str2 == null) {
                                    sb2.append(" variantId");
                                }
                                throw new IllegalStateException(A0.z.kilo(sb2, "Missing required properties:"));
                            }
                        case 3:
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 != null) {
                                obj.charlie = nextString2;
                                break;
                            } else {
                                throw new NullPointerException("Null parameterValue");
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                    break;
                case -1027290370:
                    if (nextName.equals("templateVersion")) {
                        c3 = 1;
                    }
                    switch (c3) {
                    }
                    break;
                case 1098747284:
                    if (nextName.equals("rolloutVariant")) {
                        c3 = 2;
                    }
                    switch (c3) {
                    }
                    break;
                case 1124454216:
                    if (nextName.equals("parameterValue")) {
                        c3 = 3;
                    }
                    switch (c3) {
                    }
                    break;
                default:
                    switch (c3) {
                    }
                    break;
            }
        }
        jsonReader.endObject();
        return obj.alpha();
    }

    @Override // y.InterfaceC3386z
    public C3383w bravo(R3.s sVar) {
        C3382v bravo;
        C3382v c3382v;
        boolean z2;
        C3382v c3382v2;
        int quebec;
        C3383w c3383w = (C3383w) sVar.red;
        if (c3383w == null) {
            return AbstractC3042p3.alpha(sVar, C3385y.charlie);
        }
        I.al alVar = (I.al) sVar.silver;
        boolean z10 = sVar.purple;
        C3382v c3382v3 = c3383w.bravo;
        C3382v c3382v4 = c3383w.alpha;
        if (z10) {
            bravo = AbstractC3042p3.bravo(sVar, alVar, c3382v4);
            c3382v = c3382v3;
            c3382v3 = c3382v4;
            c3382v4 = bravo;
        } else {
            bravo = AbstractC3042p3.bravo(sVar, alVar, c3382v3);
            c3382v = bravo;
        }
        if (Intrinsics.areEqual(bravo, c3382v3)) {
            return c3383w;
        }
        if (sVar.echo() != EnumC3370j.alpha && (sVar.echo() != EnumC3370j.red || c3382v4.bravo <= c3382v.bravo)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C3383w c3383w2 = new C3383w(c3382v4, c3382v, z2);
        I.al alVar2 = (I.al) sVar.silver;
        C3382v c3382v5 = c3383w2.alpha;
        long j5 = c3382v5.charlie;
        C3382v c3382v6 = c3383w2.bravo;
        if (j5 == c3382v6.charlie) {
            if (c3382v5.bravo != c3382v6.bravo) {
                return c3383w2;
            }
        } else {
            boolean z11 = c3383w2.charlie;
            if (z11) {
                c3382v2 = c3382v5;
            } else {
                c3382v2 = c3382v6;
            }
            if (c3382v2.bravo == 0) {
                if (z11) {
                    c3382v5 = c3382v6;
                }
                if (((D0.ak) alVar2.echo).alpha.alpha.purple.length() != c3382v5.bravo) {
                    return c3383w2;
                }
            } else {
                return c3383w2;
            }
        }
        String str = ((D0.ak) alVar2.echo).alpha.alpha.purple;
        C3383w c3383w3 = (C3383w) sVar.red;
        if (c3383w3 != null && str.length() != 0) {
            String str2 = ((D0.ak) alVar2.echo).alpha.alpha.purple;
            int length = str2.length();
            boolean z12 = false;
            boolean z13 = sVar.purple;
            int i4 = alVar2.bravo;
            if (i4 == 0) {
                int quebec2 = n.at.quebec(0, str2);
                if (z13) {
                    return C3383w.alpha(c3383w2, AbstractC3042p3.delta(c3383w2.alpha, alVar2, quebec2), null, true, 2);
                }
                return C3383w.alpha(c3383w2, null, AbstractC3042p3.delta(c3383w2.bravo, alVar2, quebec2), false, 1);
            }
            if (i4 == length) {
                int tango = n.at.tango(length, str2);
                if (z13) {
                    return C3383w.alpha(c3383w2, AbstractC3042p3.delta(c3383w2.alpha, alVar2, tango), null, false, 2);
                }
                return C3383w.alpha(c3383w2, null, AbstractC3042p3.delta(c3383w2.bravo, alVar2, tango), true, 1);
            }
            if (c3383w3.charlie) {
                z12 = true;
            }
            if (z13 ^ z12) {
                quebec = n.at.tango(i4, str2);
            } else {
                quebec = n.at.quebec(i4, str2);
            }
            if (z13) {
                return C3383w.alpha(c3383w2, AbstractC3042p3.delta(c3383w2.alpha, alVar2, quebec), null, z12, 2);
            }
            return C3383w.alpha(c3383w2, null, AbstractC3042p3.delta(c3383w2.bravo, alVar2, quebec), z12, 1);
        }
        return c3383w2;
    }
}
