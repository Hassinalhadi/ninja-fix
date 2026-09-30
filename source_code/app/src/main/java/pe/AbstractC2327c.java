package pe;

import B9.C0058p;
import b8.C0732b;
import com.google.firebase.perf.util.Timer;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import p0.AbstractC2264a;
import q0.C2393l;
import q0.EnumC2403v;
import q0.EnumC2404w;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.O;
import s0.g0;
import s6.N;
import t6.C2963a;

/* renamed from: pe.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2327c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [T.r] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [T.r] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [r0.e, s0.n] */
    public static Object alpha(r0.e eVar, r0.g gVar) {
        C0058p c0058p;
        if (!((T.r) eVar).getNode().isAttached()) {
            AbstractC2264a.alpha("ModifierLocal accessed from an unattached node");
        }
        if (!eVar.getNode().isAttached()) {
            AbstractC2264a.bravo("visitAncestors called on an unattached node");
        }
        T.r parent$ui_release = eVar.getNode().getParent$ui_release();
        s0.al golf = AbstractC2555o.golf(eVar);
        while (golf != null) {
            if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & 32) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 32) != 0) {
                        AbstractC2556p abstractC2556p = parent$ui_release;
                        ?? r32 = 0;
                        while (abstractC2556p != 0) {
                            if (abstractC2556p instanceof r0.e) {
                                r0.e eVar2 = (r0.e) abstractC2556p;
                                if (eVar2.green().bravo(gVar)) {
                                    return eVar2.green().delta(gVar);
                                }
                            } else if ((abstractC2556p.getKindSet$ui_release() & 32) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                T.r rVar = abstractC2556p.purple;
                                int i4 = 0;
                                abstractC2556p = abstractC2556p;
                                r32 = r32;
                                while (rVar != null) {
                                    if ((rVar.getKindSet$ui_release() & 32) != 0) {
                                        i4++;
                                        r32 = r32;
                                        if (i4 == 1) {
                                            abstractC2556p = rVar;
                                        } else {
                                            if (r32 == 0) {
                                                r32 = new J.e(new T.r[16]);
                                            }
                                            if (abstractC2556p != 0) {
                                                r32.bravo(abstractC2556p);
                                                abstractC2556p = 0;
                                            }
                                            r32.bravo(rVar);
                                        }
                                    }
                                    rVar = rVar.getChild$ui_release();
                                    abstractC2556p = abstractC2556p;
                                    r32 = r32;
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC2556p = AbstractC2555o.bravo(r32);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            golf = golf.victor();
            if (golf != null && (c0058p = golf.f13305x) != null) {
                parent$ui_release = (g0) c0058p.golf;
            } else {
                parent$ui_release = null;
            }
        }
        return gVar.alpha.invoke();
    }

    public static KotlinNothingValueException amber(Object obj) {
        ResultKt.alpha(obj);
        return new KotlinNothingValueException();
    }

    public static N azure(HashMap hashMap, int i4) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new N(i4);
    }

    public static C2963a beige(HashMap hashMap, int i4) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new C2963a(i4);
    }

    public static void black(Timer timer, v8.d dVar, v8.d dVar2) {
        dVar.kilo(timer.charlie());
        x8.g.charlie(dVar2);
    }

    public static void blue(HashMap hashMap) {
        Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static boolean bravo(rg.b bVar, int i4) {
        char c3;
        String str;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 == 5) {
                            c3 = 0;
                        } else {
                            throw null;
                        }
                    } else {
                        c3 = '\n';
                    }
                } else {
                    c3 = 20;
                }
            } else {
                c3 = 30;
            }
        } else {
            c3 = '(';
        }
        if (c3 != 0) {
            if (c3 != '\n') {
                if (c3 != 20) {
                    if (c3 != 30) {
                        if (c3 == '(') {
                            return bVar.delta();
                        }
                        StringBuilder sb2 = new StringBuilder("Level [");
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 != 4) {
                                        if (i4 != 5) {
                                            str = BuildConfig.TRAVIS;
                                        } else {
                                            str = "TRACE";
                                        }
                                    } else {
                                        str = "DEBUG";
                                    }
                                } else {
                                    str = "INFO";
                                }
                            } else {
                                str = "WARN";
                            }
                        } else {
                            str = "ERROR";
                        }
                        sb2.append(str);
                        sb2.append("] not recognized.");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    return bVar.alpha();
                }
                return bVar.echo();
            }
            return bVar.bravo();
        }
        return bVar.foxtrot();
    }

    public static /* synthetic */ String bronze(int i4) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? BuildConfig.TRAVIS : "SYNTHESIZED" : "DELEGATION" : "FAKE_OVERRIDE" : "DECLARATION";
    }

    public static int charlie(q0.ab abVar, s0.at atVar, InterfaceC2401t interfaceC2401t, int i4) {
        return abVar.mo2measure3p2s80s(new q0.y(atVar, atVar.getLayoutDirection()), new C2393l(interfaceC2401t, q0.as.purple, q0.at.purple, 1), Q0.b.bravo(i4, 0, 13)).alpha();
    }

    public static int delta(q0.ap apVar, InterfaceC2402u interfaceC2402u, List list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new C2393l((InterfaceC2401t) list.get(i5), EnumC2403v.purple, EnumC2404w.purple, 0));
        }
        return apVar.delta(new q0.y(interfaceC2402u, interfaceC2402u.getLayoutDirection()), arrayList, Q0.b.bravo(i4, 0, 13)).alpha();
    }

    public static int echo(s0.ab abVar, InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return abVar.mo0measure3p2s80s(new q0.y(interfaceC2402u, interfaceC2402u.getLayoutDirection()), new C2393l(interfaceC2401t, s0.N.purple, O.purple, 2), Q0.b.bravo(i4, 0, 13)).alpha();
    }

    public static int foxtrot(q0.ab abVar, s0.at atVar, InterfaceC2401t interfaceC2401t, int i4) {
        return abVar.mo2measure3p2s80s(new q0.y(atVar, atVar.getLayoutDirection()), new C2393l(interfaceC2401t, q0.as.purple, q0.at.alpha, 1), Q0.b.bravo(0, i4, 7)).bravo();
    }

    public static int golf(q0.ap apVar, InterfaceC2402u interfaceC2402u, List list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new C2393l((InterfaceC2401t) list.get(i5), EnumC2403v.purple, EnumC2404w.alpha, 0));
        }
        return apVar.delta(new q0.y(interfaceC2402u, interfaceC2402u.getLayoutDirection()), arrayList, Q0.b.bravo(0, i4, 7)).bravo();
    }

    public static int hotel(s0.ab abVar, InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return abVar.mo0measure3p2s80s(new q0.y(interfaceC2402u, interfaceC2402u.getLayoutDirection()), new C2393l(interfaceC2401t, s0.N.purple, O.alpha, 2), Q0.b.bravo(0, i4, 7)).bravo();
    }

    public static int india(q0.ab abVar, s0.at atVar, InterfaceC2401t interfaceC2401t, int i4) {
        return abVar.mo2measure3p2s80s(new q0.y(atVar, atVar.getLayoutDirection()), new C2393l(interfaceC2401t, q0.as.alpha, q0.at.purple, 1), Q0.b.bravo(i4, 0, 13)).alpha();
    }

    public static int juliet(q0.ap apVar, InterfaceC2402u interfaceC2402u, List list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new C2393l((InterfaceC2401t) list.get(i5), EnumC2403v.alpha, EnumC2404w.purple, 0));
        }
        return apVar.delta(new q0.y(interfaceC2402u, interfaceC2402u.getLayoutDirection()), arrayList, Q0.b.bravo(i4, 0, 13)).alpha();
    }

    public static int kilo(s0.ab abVar, InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return abVar.mo0measure3p2s80s(new q0.y(interfaceC2402u, interfaceC2402u.getLayoutDirection()), new C2393l(interfaceC2401t, s0.N.alpha, O.purple, 2), Q0.b.bravo(i4, 0, 13)).alpha();
    }

    public static int lima(q0.ab abVar, s0.at atVar, InterfaceC2401t interfaceC2401t, int i4) {
        return abVar.mo2measure3p2s80s(new q0.y(atVar, atVar.getLayoutDirection()), new C2393l(interfaceC2401t, q0.as.alpha, q0.at.alpha, 1), Q0.b.bravo(0, i4, 7)).bravo();
    }

    public static int mike(q0.ap apVar, InterfaceC2402u interfaceC2402u, List list, int i4) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new C2393l((InterfaceC2401t) list.get(i5), EnumC2403v.alpha, EnumC2404w.alpha, 0));
        }
        return apVar.delta(new q0.y(interfaceC2402u, interfaceC2402u.getLayoutDirection()), arrayList, Q0.b.bravo(0, i4, 7)).bravo();
    }

    public static int november(s0.ab abVar, InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return abVar.mo0measure3p2s80s(new q0.y(interfaceC2402u, interfaceC2402u.getLayoutDirection()), new C2393l(interfaceC2401t, s0.N.alpha, O.alpha, 2), Q0.b.bravo(0, i4, 7)).bravo();
    }

    public static final boolean oscar(int i4) {
        if (i4 != 6 && i4 != 4) {
            return false;
        }
        return true;
    }

    public static int papa(int i4, int i5, int i10) {
        int i11 = (i4 * i5) + i10;
        return i11 * i11;
    }

    public static int quebec(int i4, int i5, int i10, int i11, int i12) {
        int i13 = (i4 * i5) + i10;
        return (i13 * i13 * i11) + i12;
    }

    public static int romeo(int i4, int i5, D0.an anVar) {
        return (anVar.hashCode() + i4) * i5;
    }

    public static int sierra(int i4, int i5, String str) {
        return (str.hashCode() + i4) * i5;
    }

    public static C0732b tango(int i4, J2.l lVar) {
        lVar.sierra(new N(i4));
        return lVar.foxtrot();
    }

    public static dagger.internal.d uniform(w9.p pVar, int i4) {
        return dagger.internal.a.bravo(new w9.o(pVar, i4, 0));
    }

    public static String victor(char c3, String str, String str2) {
        return str + str2 + c3;
    }

    public static String whiskey(Class cls, StringBuilder sb2) {
        sb2.append(cls.getCanonicalName());
        return sb2.toString();
    }

    public static String xray(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static HashMap yankee(Class cls, N n5) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, n5);
        return hashMap;
    }

    public static HashMap zulu(Class cls, C2963a c2963a) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, c2963a);
        return hashMap;
    }
}
