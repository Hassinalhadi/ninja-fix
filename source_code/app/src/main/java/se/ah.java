package se;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.av;
import kotlin.reflect.jvm.internal.impl.types.ax;
import pe.C2339o;
import pe.InterfaceC2317a;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2337m;
import pe.InterfaceC2345u;
import qe.C2470f;
import qe.C2471g;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public class ah extends ar implements pe.al {

    /* renamed from: a, reason: collision with root package name */
    public Lambda f13718a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13719b;

    /* renamed from: c, reason: collision with root package name */
    public C2339o f13720c;

    /* renamed from: d, reason: collision with root package name */
    public Collection f13721d;
    public final pe.al e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13722f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13723g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13724h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f13725i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f13726j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f13727k;

    /* renamed from: l, reason: collision with root package name */
    public List f13728l;

    /* renamed from: m, reason: collision with root package name */
    public C2871u f13729m;

    /* renamed from: n, reason: collision with root package name */
    public C2871u f13730n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f13731o;

    /* renamed from: p, reason: collision with root package name */
    public ai f13732p;

    /* renamed from: q, reason: collision with root package name */
    public aj f13733q;

    /* renamed from: r, reason: collision with root package name */
    public C2868r f13734r;

    /* renamed from: s, reason: collision with root package name */
    public C2868r f13735s;
    public final boolean white;
    public ff.h yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(InterfaceC2335k interfaceC2335k, pe.al alVar, InterfaceC2472h interfaceC2472h, int i4, C2339o c2339o, boolean z2, Ne.f fVar, int i5, pe.an anVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(interfaceC2335k, interfaceC2472h, fVar, null, anVar);
        if (interfaceC2335k != null) {
            if (interfaceC2472h != null) {
                if (i4 != 0) {
                    if (c2339o != null) {
                        if (fVar != null) {
                            if (i5 != 0) {
                                if (anVar != null) {
                                    this.white = z2;
                                    this.f13721d = null;
                                    this.f13728l = Collections.EMPTY_LIST;
                                    this.f13719b = i4;
                                    this.f13720c = c2339o;
                                    this.e = alVar == null ? this : alVar;
                                    this.f13722f = i5;
                                    this.f13723g = z10;
                                    this.f13724h = z11;
                                    this.f13725i = z12;
                                    this.f13726j = z13;
                                    this.f13727k = z14;
                                    return;
                                }
                                D(6);
                                throw null;
                            }
                            D(5);
                            throw null;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void D(int i4) {
        String str;
        int i5;
        if (i4 != 28 && i4 != 38 && i4 != 39 && i4 != 41 && i4 != 42) {
            switch (i4) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i4 != 28 && i4 != 38 && i4 != 39 && i4 != 41 && i4 != 42) {
                switch (i4) {
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        break;
                    default:
                        i5 = 3;
                        break;
                }
                Object[] objArr = new Object[i5];
                switch (i4) {
                    case 1:
                    case 8:
                        objArr[0] = "annotations";
                        break;
                    case 2:
                    case 9:
                        objArr[0] = "modality";
                        break;
                    case 3:
                    case 10:
                    case 20:
                        objArr[0] = "visibility";
                        break;
                    case 4:
                    case 11:
                        objArr[0] = "name";
                        break;
                    case 5:
                    case 12:
                    case 35:
                        objArr[0] = "kind";
                        break;
                    case 6:
                    case 13:
                    case 37:
                        objArr[0] = "source";
                        break;
                    case 7:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 14:
                        objArr[0] = "inType";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "outType";
                        break;
                    case 16:
                    case 18:
                        objArr[0] = "typeParameters";
                        break;
                    case 19:
                        objArr[0] = "contextReceiverParameters";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                        break;
                    case 27:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 29:
                        objArr[0] = "copyConfiguration";
                        break;
                    case 30:
                        objArr[0] = "substitutor";
                        break;
                    case 31:
                        objArr[0] = "accessorDescriptor";
                        break;
                    case 32:
                        objArr[0] = "newOwner";
                        break;
                    case 33:
                        objArr[0] = "newModality";
                        break;
                    case 34:
                        objArr[0] = "newVisibility";
                        break;
                    case 36:
                        objArr[0] = "newName";
                        break;
                    case 40:
                        objArr[0] = "overriddenDescriptors";
                        break;
                }
                if (i4 == 28) {
                    if (i4 != 38) {
                        if (i4 != 39) {
                            if (i4 != 41) {
                                if (i4 != 42) {
                                    switch (i4) {
                                        case 21:
                                            objArr[1] = "getTypeParameters";
                                            break;
                                        case 22:
                                            objArr[1] = "getContextReceiverParameters";
                                            break;
                                        case 23:
                                            objArr[1] = "getReturnType";
                                            break;
                                        case 24:
                                            objArr[1] = "getModality";
                                            break;
                                        case 25:
                                            objArr[1] = "getVisibility";
                                            break;
                                        case 26:
                                            objArr[1] = "getAccessors";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                                            break;
                                    }
                                } else {
                                    objArr[1] = Constants.COPY_TYPE;
                                }
                            } else {
                                objArr[1] = "getOverriddenDescriptors";
                            }
                        } else {
                            objArr[1] = "getKind";
                        }
                    } else {
                        objArr[1] = "getOriginal";
                    }
                } else {
                    objArr[1] = "getSourceToUseForCopy";
                }
                switch (i4) {
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        objArr[2] = "create";
                        break;
                    case 14:
                        objArr[2] = "setInType";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[2] = "setType";
                        break;
                    case 20:
                        objArr[2] = "setVisibility";
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 28:
                    case 38:
                    case 39:
                    case 41:
                    case 42:
                        break;
                    case 27:
                        objArr[2] = "substitute";
                        break;
                    case 29:
                        objArr[2] = "doSubstitute";
                        break;
                    case 30:
                    case 31:
                        objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                        break;
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    case 40:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 28 && i4 != 38 && i4 != 39 && i4 != 41 && i4 != 42) {
                    switch (i4) {
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i5 = 2;
            Object[] objArr2 = new Object[i5];
            switch (i4) {
            }
            if (i4 == 28) {
            }
            switch (i4) {
            }
            String format2 = String.format(str, objArr2);
            if (i4 != 28) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 28) {
            switch (i4) {
            }
            Object[] objArr22 = new Object[i5];
            switch (i4) {
            }
            if (i4 == 28) {
            }
            switch (i4) {
            }
            String format22 = String.format(str, objArr22);
            if (i4 != 28) {
            }
            throw new IllegalStateException(format22);
        }
        i5 = 2;
        Object[] objArr222 = new Object[i5];
        switch (i4) {
        }
        if (i4 == 28) {
        }
        switch (i4) {
        }
        String format222 = String.format(str, objArr222);
        if (i4 != 28) {
        }
        throw new IllegalStateException(format222);
    }

    public static ah a0(InterfaceC2330f interfaceC2330f, int i4, C2339o c2339o, boolean z2, Ne.f fVar, int i5, pe.an anVar) {
        C2470f c2470f = C2471g.alpha;
        if (interfaceC2330f != null) {
            if (i4 != 0) {
                if (c2339o != null) {
                    if (fVar != null) {
                        if (i5 != 0) {
                            if (anVar != null) {
                                return new ah(interfaceC2330f, null, c2470f, i4, c2339o, z2, fVar, i5, anVar, false, false, false, false, false);
                            }
                            D(13);
                            throw null;
                        }
                        D(12);
                        throw null;
                    }
                    D(11);
                    throw null;
                }
                D(10);
                throw null;
            }
            D(9);
            throw null;
        }
        D(7);
        throw null;
    }

    public static InterfaceC2345u c0(ax axVar, pe.ak akVar) {
        if (akVar != null) {
            InterfaceC2345u interfaceC2345u = ((af) akVar).e;
            if (interfaceC2345u == null) {
                return null;
            }
            return interfaceC2345u.delta(axVar);
        }
        D(31);
        throw null;
    }

    @Override // pe.InterfaceC2328d
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final ah A(InterfaceC2330f interfaceC2330f, int i4, C2339o c2339o) {
        ag agVar = new ag(this);
        if (interfaceC2330f != null) {
            agVar.alpha = interfaceC2330f;
            agVar.delta = null;
            if (i4 != 0) {
                agVar.bravo = i4;
                if (c2339o != null) {
                    agVar.charlie = c2339o;
                    agVar.echo = 2;
                    agVar.golf = false;
                    ah bravo = agVar.bravo();
                    if (bravo != null) {
                        return bravo;
                    }
                    D(42);
                    throw null;
                }
                ag.alpha(8);
                throw null;
            }
            ag.alpha(6);
            throw null;
        }
        ag.alpha(0);
        throw null;
    }

    @Override // se.ar, pe.InterfaceC2326b
    public final C2871u a() {
        return this.f13729m;
    }

    public ah b0(InterfaceC2335k interfaceC2335k, int i4, C2339o c2339o, pe.al alVar, int i5, Ne.f fVar) {
        pe.ao aoVar = pe.an.magenta;
        if (interfaceC2335k != null) {
            if (i4 != 0) {
                if (c2339o != null) {
                    if (i5 != 0) {
                        if (fVar != null) {
                            InterfaceC2472h annotations = getAnnotations();
                            boolean whiskey = whiskey();
                            boolean isExternal = isExternal();
                            return new ah(interfaceC2335k, alVar, annotations, i4, c2339o, this.white, fVar, i5, aoVar, this.f13723g, whiskey, this.f13725i, isExternal, this.f13727k);
                        }
                        D(36);
                        throw null;
                    }
                    D(35);
                    throw null;
                }
                D(34);
                throw null;
            }
            D(33);
            throw null;
        }
        D(32);
        throw null;
    }

    @Override // pe.al
    public final ai bravo() {
        return this.f13732p;
    }

    @Override // pe.al
    public final aj charlie() {
        return this.f13733q;
    }

    public final void d0(ai aiVar, aj ajVar, C2868r c2868r, C2868r c2868r2) {
        this.f13732p = aiVar;
        this.f13733q = ajVar;
        this.f13734r = c2868r;
        this.f13735s = c2868r2;
    }

    @Override // pe.aw
    public final boolean e() {
        return this.white;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e0(ff.h hVar, Function0 function0) {
        if (function0 != 0) {
            this.f13718a = (Lambda) function0;
            if (hVar == null) {
                hVar = (ff.h) function0.invoke();
            }
            this.yellow = hVar;
            return;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
    }

    @Override // pe.InterfaceC2348x
    public final boolean emerald() {
        return this.f13725i;
    }

    public void f0(kotlin.reflect.jvm.internal.impl.types.y yVar) {
    }

    @Override // se.ar, pe.InterfaceC2326b
    public final C2871u g() {
        return this.f13730n;
    }

    public final void g0(kotlin.reflect.jvm.internal.impl.types.y yVar, List list, C2871u c2871u, C2871u c2871u2, List list2) {
        if (yVar != null) {
            if (list != null) {
                if (list2 != null) {
                    this.teal = yVar;
                    this.f13731o = new ArrayList(list);
                    this.f13730n = c2871u2;
                    this.f13729m = c2871u;
                    this.f13728l = list2;
                    return;
                }
                D(19);
                throw null;
            }
            D(18);
            throw null;
        }
        D(17);
        throw null;
    }

    @Override // se.ar, pe.InterfaceC2326b
    public final kotlin.reflect.jvm.internal.impl.types.y getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.y type = getType();
        if (type != null) {
            return type;
        }
        D(23);
        throw null;
    }

    @Override // se.ar, pe.InterfaceC2326b
    public final List getTypeParameters() {
        ArrayList arrayList = this.f13731o;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for ".concat(AbstractC2863m.X(this)));
    }

    @Override // pe.InterfaceC2338n, pe.InterfaceC2348x
    public final C2339o getVisibility() {
        C2339o c2339o = this.f13720c;
        if (c2339o != null) {
            return c2339o;
        }
        D(25);
        throw null;
    }

    @Override // pe.InterfaceC2348x
    public final int golf() {
        int i4 = this.f13719b;
        if (i4 != 0) {
            return i4;
        }
        D(24);
        throw null;
    }

    @Override // pe.al
    public final boolean gray() {
        return this.f13727k;
    }

    @Override // pe.al
    public final C2868r h() {
        return this.f13735s;
    }

    public boolean isExternal() {
        return this.f13726j;
    }

    @Override // pe.al
    public final C2868r k() {
        return this.f13734r;
    }

    @Override // pe.InterfaceC2326b
    public final List l() {
        List list = this.f13728l;
        if (list != null) {
            return list;
        }
        D(22);
        throw null;
    }

    @Override // pe.InterfaceC2326b
    public final Collection mike() {
        Collection collection = this.f13721d;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        D(41);
        throw null;
    }

    @Override // pe.aw
    public final boolean n() {
        return this.f13723g;
    }

    @Override // pe.aw
    public final Se.g navy() {
        ff.h hVar = this.yellow;
        if (hVar != null) {
            return (Se.g) hVar.invoke();
        }
        return null;
    }

    @Override // pe.InterfaceC2328d
    public final int november() {
        int i4 = this.f13722f;
        if (i4 != 0) {
            return i4;
        }
        D(39);
        throw null;
    }

    public Object orange(InterfaceC2317a interfaceC2317a) {
        return null;
    }

    @Override // pe.InterfaceC2335k
    public final Object quebec(InterfaceC2337m interfaceC2337m, Object obj) {
        return interfaceC2337m.ochre(this, obj);
    }

    @Override // pe.InterfaceC2328d
    public final void r(Collection collection) {
        if (collection != null) {
            this.f13721d = collection;
        } else {
            D(40);
            throw null;
        }
    }

    @Override // pe.al
    public final ArrayList romeo() {
        ArrayList arrayList = new ArrayList(2);
        ai aiVar = this.f13732p;
        if (aiVar != null) {
            arrayList.add(aiVar);
        }
        aj ajVar = this.f13733q;
        if (ajVar != null) {
            arrayList.add(ajVar);
        }
        return arrayList;
    }

    public boolean whiskey() {
        return this.f13724h;
    }

    @Override // pe.InterfaceC2348x
    public final boolean y() {
        return false;
    }

    @Override // pe.ap
    public final pe.al delta(ax axVar) {
        if (axVar != null) {
            if (axVar.alpha.echo()) {
                return this;
            }
            ag agVar = new ag(this);
            av foxtrot = axVar.foxtrot();
            if (foxtrot != null) {
                agVar.foxtrot = foxtrot;
                agVar.delta = alpha();
                return agVar.bravo();
            }
            ag.alpha(15);
            throw null;
        }
        D(27);
        throw null;
    }

    @Override // se.AbstractC2864n, se.AbstractC2863m, pe.InterfaceC2335k, pe.InterfaceC2332h
    public final pe.al alpha() {
        pe.al alVar = this.e;
        pe.al alpha = alVar == this ? this : alVar.alpha();
        if (alpha != null) {
            return alpha;
        }
        D(38);
        throw null;
    }
}
