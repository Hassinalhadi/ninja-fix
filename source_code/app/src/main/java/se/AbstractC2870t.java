package se;

import androidx.compose.runtime.G;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ax;
import pe.AbstractC2340p;
import pe.C2339o;
import pe.InterfaceC2317a;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2337m;
import pe.InterfaceC2338n;
import pe.InterfaceC2344t;
import pe.InterfaceC2345u;
import qe.InterfaceC2465a;
import qe.InterfaceC2472h;
import s6.F7;

/* renamed from: se.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2870t extends AbstractC2864n implements InterfaceC2345u {

    /* renamed from: a, reason: collision with root package name */
    public List f13776a;

    /* renamed from: b, reason: collision with root package name */
    public C2871u f13777b;

    /* renamed from: c, reason: collision with root package name */
    public C2871u f13778c;

    /* renamed from: d, reason: collision with root package name */
    public int f13779d;
    public C2339o e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13780f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13781g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13782h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13783i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13784j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13785k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13786l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13787m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13788n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13789o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13790p;

    /* renamed from: q, reason: collision with root package name */
    public Collection f13791q;

    /* renamed from: r, reason: collision with root package name */
    public volatile Ic.c f13792r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC2345u f13793s;

    /* renamed from: t, reason: collision with root package name */
    public final int f13794t;
    public List teal;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC2345u f13795u;

    /* renamed from: v, reason: collision with root package name */
    public Map f13796v;
    public List white;
    public kotlin.reflect.jvm.internal.impl.types.y yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2870t(int i4, Ne.f fVar, InterfaceC2335k interfaceC2335k, InterfaceC2345u interfaceC2345u, pe.an anVar, InterfaceC2472h interfaceC2472h) {
        super(interfaceC2335k, interfaceC2472h, fVar, anVar);
        if (interfaceC2335k != null) {
            if (interfaceC2472h != null) {
                if (fVar != null) {
                    if (i4 != 0) {
                        if (anVar != null) {
                            this.e = AbstractC2340p.india;
                            this.f13780f = false;
                            this.f13781g = false;
                            this.f13782h = false;
                            this.f13783i = false;
                            this.f13784j = false;
                            this.f13785k = false;
                            this.f13786l = false;
                            this.f13787m = false;
                            this.f13788n = false;
                            this.f13789o = true;
                            this.f13790p = false;
                            this.f13791q = null;
                            this.f13792r = null;
                            this.f13795u = null;
                            this.f13796v = null;
                            this.f13793s = interfaceC2345u == null ? this : interfaceC2345u;
                            this.f13794t = i4;
                            return;
                        }
                        D(4);
                        throw null;
                    }
                    D(3);
                    throw null;
                }
                D(2);
                throw null;
            }
            D(1);
            throw null;
        }
        D(0);
        throw null;
    }

    public static /* synthetic */ void D(int i4) {
        String str;
        int i5;
        switch (i4) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i5 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i4) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = Constants.COPY_TYPE;
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i4) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static ArrayList d0(InterfaceC2345u interfaceC2345u, List list, ax axVar, boolean z2, boolean z10, boolean[] zArr) {
        kotlin.reflect.jvm.internal.impl.types.y india;
        G g2;
        aq aqVar;
        pe.an source;
        InterfaceC2338n apVar;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aq aqVar2 = (aq) it.next();
                aq aqVar3 = aqVar2;
                kotlin.reflect.jvm.internal.impl.types.y india2 = axVar.india(2, aqVar3.getType());
                kotlin.reflect.jvm.internal.impl.types.y yVar = aqVar2.f13747c;
                if (yVar == null) {
                    india = null;
                } else {
                    india = axVar.india(2, yVar);
                }
                if (india2 == null) {
                    return null;
                }
                if ((india2 != aqVar3.getType() || yVar != india) && zArr != null) {
                    zArr[0] = true;
                }
                if (aqVar2 instanceof ap) {
                    g2 = new G(3, (List) ((ap) aqVar2).e.getValue());
                } else {
                    g2 = null;
                }
                if (z2) {
                    aqVar = null;
                } else {
                    aqVar = aqVar2;
                }
                InterfaceC2472h annotations = aqVar2.getAnnotations();
                Ne.f name = aqVar2.getName();
                boolean a02 = aqVar2.a0();
                if (z10) {
                    source = aqVar2.echo();
                } else {
                    source = pe.an.magenta;
                }
                Intrinsics.echo(annotations, "annotations");
                Intrinsics.echo(name, "name");
                Intrinsics.echo(source, "source");
                int i4 = aqVar2.white;
                boolean z11 = aqVar2.f13745a;
                boolean z12 = aqVar2.f13746b;
                if (g2 == null) {
                    apVar = new aq(interfaceC2345u, aqVar, i4, annotations, name, india2, a02, z11, z12, india, source);
                } else {
                    apVar = new ap(interfaceC2345u, aqVar, i4, annotations, name, india2, a02, z11, z12, india, source, g2);
                }
                arrayList.add(apVar);
            }
            return arrayList;
        }
        D(30);
        throw null;
    }

    public final InterfaceC2345u Z(InterfaceC2330f interfaceC2330f, int i4, C2339o c2339o) {
        InterfaceC2345u build = w().romeo(interfaceC2330f).uniform(i4).oscar(c2339o).delta(2).november().build();
        if (build != null) {
            return build;
        }
        D(26);
        throw null;
    }

    @Override // pe.InterfaceC2326b
    public final C2871u a() {
        return this.f13778c;
    }

    @Override // pe.InterfaceC2328d
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public ak A(InterfaceC2330f interfaceC2330f, int i4, C2339o c2339o) {
        return (ak) Z(interfaceC2330f, i4, c2339o);
    }

    @Override // se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    public InterfaceC2345u alpha() {
        InterfaceC2345u alpha;
        InterfaceC2345u interfaceC2345u = this.f13793s;
        if (interfaceC2345u == this) {
            alpha = this;
        } else {
            alpha = interfaceC2345u.alpha();
        }
        if (alpha != null) {
            return alpha;
        }
        D(20);
        throw null;
    }

    public abstract AbstractC2870t b0(int i4, Ne.f fVar, InterfaceC2335k interfaceC2335k, InterfaceC2345u interfaceC2345u, pe.an anVar, InterfaceC2472h interfaceC2472h);

    public boolean blue() {
        return this.f13790p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    public AbstractC2870t c0(C2869s c2869s) {
        InterfaceC2472h annotations;
        pe.an anVar;
        ?? r82;
        C2871u c2871u;
        C2871u c2871u2;
        kotlin.reflect.jvm.internal.impl.types.y india;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        InterfaceC2465a alpha;
        if (c2869s != null) {
            boolean[] zArr = new boolean[1];
            if (c2869s.f13770l != null) {
                annotations = F7.alpha(getAnnotations(), c2869s.f13770l);
            } else {
                annotations = getAnnotations();
            }
            InterfaceC2472h interfaceC2472h = annotations;
            InterfaceC2335k interfaceC2335k = c2869s.purple;
            InterfaceC2345u interfaceC2345u = c2869s.teal;
            int i4 = c2869s.white;
            Ne.f fVar = c2869s.e;
            if (c2869s.f13766h) {
                if (interfaceC2345u != null) {
                    alpha = interfaceC2345u;
                } else {
                    alpha = alpha();
                }
                anVar = ((AbstractC2864n) alpha).echo();
            } else {
                anVar = pe.an.magenta;
            }
            pe.an anVar2 = anVar;
            if (anVar2 != null) {
                AbstractC2870t b02 = b0(i4, fVar, interfaceC2335k, interfaceC2345u, anVar2, interfaceC2472h);
                List list = c2869s.f13769k;
                if (list == null) {
                    list = getTypeParameters();
                }
                zArr[0] = zArr[0] | (!list.isEmpty());
                ArrayList arrayList = new ArrayList(list.size());
                ax victor = kotlin.reflect.jvm.internal.impl.types.c.victor(list, c2869s.alpha, b02, arrayList, zArr);
                if (victor != null) {
                    ArrayList arrayList2 = new ArrayList();
                    if (!c2869s.f13760a.isEmpty()) {
                        int i5 = 0;
                        for (C2871u c2871u3 : c2869s.f13760a) {
                            kotlin.reflect.jvm.internal.impl.types.y india2 = victor.india(2, c2871u3.getType());
                            if (india2 != null) {
                                int i10 = i5 + 1;
                                arrayList2.add(Qe.l.echo(b02, india2, ((Ye.a) c2871u3.Z()).X(), c2871u3.getAnnotations(), i5));
                                boolean z14 = zArr[0];
                                if (india2 != c2871u3.getType()) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                zArr[0] = z14 | z13;
                                i5 = i10;
                            }
                        }
                    }
                    C2871u c2871u4 = c2869s.f13761b;
                    if (c2871u4 != null) {
                        kotlin.reflect.jvm.internal.impl.types.y india3 = victor.india(2, c2871u4.getType());
                        if (india3 == null) {
                            return null;
                        }
                        c2869s.f13761b.Z();
                        C2871u c2871u5 = new C2871u(b02, new Ye.b(b02, india3), c2869s.f13761b.getAnnotations());
                        boolean z15 = zArr[0];
                        if (india3 != c2869s.f13761b.getType()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zArr[0] = z12 | z15;
                        r82 = 0;
                        c2871u = c2871u5;
                    } else {
                        r82 = 0;
                        c2871u = null;
                    }
                    C2871u c2871u6 = c2869s.f13762c;
                    if (c2871u6 != null) {
                        C2871u delta = c2871u6.delta(victor);
                        if (delta == null) {
                            return null;
                        }
                        boolean z16 = zArr[r82];
                        if (delta != c2869s.f13762c) {
                            z11 = true;
                        } else {
                            z11 = r82;
                        }
                        zArr[r82] = z16 | z11;
                        c2871u2 = delta;
                    } else {
                        c2871u2 = null;
                    }
                    ArrayList d02 = d0(b02, c2869s.yellow, victor, c2869s.f13767i, c2869s.f13766h, zArr);
                    if (d02 == null || (india = victor.india(3, c2869s.f13763d)) == null) {
                        return null;
                    }
                    boolean z17 = zArr[r82];
                    if (india != c2869s.f13763d) {
                        z2 = true;
                    } else {
                        z2 = r82;
                    }
                    boolean z18 = z17 | z2;
                    zArr[r82] = z18;
                    if (!z18 && c2869s.f13774p) {
                        return this;
                    }
                    b02.e0(c2871u, c2871u2, arrayList2, arrayList, d02, india, c2869s.red, c2869s.silver);
                    b02.f13780f = this.f13780f;
                    b02.f13781g = this.f13781g;
                    b02.f13782h = this.f13782h;
                    b02.f13783i = this.f13783i;
                    b02.f13784j = this.f13784j;
                    b02.f13788n = this.f13788n;
                    b02.f13785k = this.f13785k;
                    b02.h0(this.f13789o);
                    b02.f13786l = c2869s.f13768j;
                    b02.f13787m = c2869s.f13771m;
                    Boolean bool = c2869s.f13773o;
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    } else {
                        z10 = this.f13790p;
                    }
                    b02.i0(z10);
                    if (!c2869s.f13772n.isEmpty() || this.f13796v != null) {
                        LinkedHashMap linkedHashMap = c2869s.f13772n;
                        Map map = this.f13796v;
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                        if (linkedHashMap.size() == 1) {
                            b02.f13796v = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                        } else {
                            b02.f13796v = linkedHashMap;
                        }
                    }
                    if (c2869s.f13765g || this.f13795u != null) {
                        InterfaceC2345u interfaceC2345u2 = this.f13795u;
                        if (interfaceC2345u2 == null) {
                            interfaceC2345u2 = this;
                        }
                        b02.f13795u = interfaceC2345u2.delta(victor);
                    }
                    if (c2869s.f13764f && !alpha().mike().isEmpty()) {
                        if (c2869s.alpha.echo()) {
                            Ic.c cVar = this.f13792r;
                            if (cVar != null) {
                                b02.f13792r = cVar;
                                return b02;
                            }
                            b02.r(mike());
                            return b02;
                        }
                        b02.f13792r = new Ic.c(this, victor, 5);
                    }
                    return b02;
                }
                return null;
            }
            D(27);
            throw null;
        }
        D(25);
        throw null;
    }

    public void e0(C2871u c2871u, C2871u c2871u2, List list, List list2, List list3, kotlin.reflect.jvm.internal.impl.types.y yVar, int i4, C2339o c2339o) {
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (c2339o != null) {
                        this.teal = CollectionsKt.z(list2);
                        this.white = CollectionsKt.z(list3);
                        this.yellow = yVar;
                        this.f13779d = i4;
                        this.e = c2339o;
                        this.f13777b = c2871u;
                        this.f13778c = c2871u2;
                        this.f13776a = list;
                        for (int i5 = 0; i5 < list2.size(); i5++) {
                            pe.aq aqVar = (pe.aq) list2.get(i5);
                            if (aqVar.getIndex() != i5) {
                                throw new IllegalStateException(aqVar + " index is " + aqVar.getIndex() + " but position is " + i5);
                            }
                        }
                        for (int i10 = 0; i10 < list3.size(); i10++) {
                            aq aqVar2 = (aq) list3.get(i10);
                            if (aqVar2.white != i10) {
                                throw new IllegalStateException(aqVar2 + "index is " + aqVar2.white + " but position is " + i10);
                            }
                        }
                        return;
                    }
                    D(8);
                    throw null;
                }
                D(7);
                throw null;
            }
            D(6);
            throw null;
        }
        D(5);
        throw null;
    }

    @Override // pe.InterfaceC2348x
    public final boolean emerald() {
        return this.f13785k;
    }

    public final C2869s f0(ax axVar) {
        if (axVar != null) {
            return new C2869s(this, axVar.foxtrot(), lima(), golf(), getVisibility(), november(), peach(), l(), this.f13777b, getReturnType());
        }
        D(24);
        throw null;
    }

    @Override // pe.InterfaceC2326b
    public final C2871u g() {
        return this.f13777b;
    }

    public final void g0(InterfaceC2317a interfaceC2317a, Object obj) {
        if (this.f13796v == null) {
            this.f13796v = new LinkedHashMap();
        }
        this.f13796v.put(interfaceC2317a, obj);
    }

    public kotlin.reflect.jvm.internal.impl.types.y getReturnType() {
        return this.yellow;
    }

    @Override // pe.InterfaceC2326b
    public final List getTypeParameters() {
        List list = this.teal;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // pe.InterfaceC2338n, pe.InterfaceC2348x
    public final C2339o getVisibility() {
        C2339o c2339o = this.e;
        if (c2339o != null) {
            return c2339o;
        }
        D(16);
        throw null;
    }

    @Override // pe.InterfaceC2348x
    public final int golf() {
        int i4 = this.f13779d;
        if (i4 != 0) {
            return i4;
        }
        D(15);
        throw null;
    }

    public void h0(boolean z2) {
        this.f13789o = z2;
    }

    public void i0(boolean z2) {
        this.f13790p = z2;
    }

    public boolean isExternal() {
        return this.f13782h;
    }

    @Override // pe.InterfaceC2345u
    public final boolean isInfix() {
        if (!this.f13781g) {
            Iterator it = alpha().mike().iterator();
            while (it.hasNext()) {
                if (((InterfaceC2345u) it.next()).isInfix()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public boolean isInline() {
        return this.f13783i;
    }

    @Override // pe.InterfaceC2345u
    public final boolean isOperator() {
        if (!this.f13780f) {
            Iterator it = alpha().mike().iterator();
            while (it.hasNext()) {
                if (((InterfaceC2345u) it.next()).isOperator()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public boolean isSuspend() {
        return this.f13788n;
    }

    public final void j0(kotlin.reflect.jvm.internal.impl.types.ae aeVar) {
        if (aeVar != null) {
            this.yellow = aeVar;
        } else {
            D(11);
            throw null;
        }
    }

    public boolean jade() {
        return this.f13784j;
    }

    @Override // pe.InterfaceC2326b
    public final List l() {
        List list = this.f13776a;
        if (list != null) {
            return list;
        }
        D(13);
        throw null;
    }

    public Collection mike() {
        Ic.c cVar = this.f13792r;
        if (cVar != null) {
            this.f13791q = (Collection) cVar.invoke();
            this.f13792r = null;
        }
        Collection collection = this.f13791q;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        D(14);
        throw null;
    }

    @Override // pe.InterfaceC2328d
    public final int november() {
        int i4 = this.f13794t;
        if (i4 != 0) {
            return i4;
        }
        D(21);
        throw null;
    }

    public Object orange(InterfaceC2317a interfaceC2317a) {
        Map map = this.f13796v;
        if (map == null) {
            return null;
        }
        return map.get(interfaceC2317a);
    }

    @Override // pe.InterfaceC2326b
    public final List peach() {
        List list = this.white;
        if (list != null) {
            return list;
        }
        D(19);
        throw null;
    }

    @Override // pe.InterfaceC2345u
    public final boolean q() {
        return this.f13786l;
    }

    public Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.amber(this, obj);
    }

    public void r(Collection collection) {
        if (collection != null) {
            this.f13791q = collection;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((InterfaceC2345u) it.next()).v()) {
                    this.f13787m = true;
                    return;
                }
            }
            return;
        }
        D(17);
        throw null;
    }

    @Override // pe.InterfaceC2345u
    public final boolean v() {
        return this.f13787m;
    }

    public InterfaceC2344t w() {
        return f0(ax.bravo);
    }

    @Override // pe.InterfaceC2348x
    public final boolean y() {
        return false;
    }

    @Override // pe.InterfaceC2345u
    public final InterfaceC2345u yellow() {
        return this.f13795u;
    }

    @Override // pe.ap
    public InterfaceC2345u delta(ax axVar) {
        if (axVar != null) {
            if (axVar.alpha.echo()) {
                return this;
            }
            C2869s f02 = f0(axVar);
            f02.teal = alpha();
            f02.f13766h = true;
            f02.f13774p = true;
            return f02.f13775q.c0(f02);
        }
        D(22);
        throw null;
    }
}
