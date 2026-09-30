package se;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.av;
import kotlin.reflect.jvm.internal.impl.types.ax;
import of.C2259n;
import pe.AbstractC2340p;
import pe.C2339o;
import pe.InterfaceC2326b;
import pe.InterfaceC2335k;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public final class ag {
    public InterfaceC2335k alpha;
    public int bravo;
    public C2339o charlie;
    public int echo;
    public final C2871u hotel;
    public final Ne.f india;
    public final kotlin.reflect.jvm.internal.impl.types.y juliet;
    public final /* synthetic */ ah kilo;
    public pe.al delta = null;
    public av foxtrot = av.alpha;
    public boolean golf = true;

    public ag(ah ahVar) {
        this.kilo = ahVar;
        this.alpha = ahVar.lima();
        this.bravo = ahVar.golf();
        this.charlie = ahVar.getVisibility();
        this.echo = ahVar.november();
        this.hotel = ahVar.f13729m;
        this.india = ahVar.getName();
        this.juliet = ahVar.getType();
    }

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 5 && i4 != 7 && i4 != 9 && i4 != 11 && i4 != 19 && i4 != 13 && i4 != 14 && i4 != 16 && i4 != 17) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 5 && i4 != 7 && i4 != 9 && i4 != 11 && i4 != 19 && i4 != 13 && i4 != 14 && i4 != 16 && i4 != 17) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = Constants.KEY_TYPE;
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        if (i4 != 7) {
                            if (i4 != 9) {
                                if (i4 != 11) {
                                    if (i4 != 19) {
                                        if (i4 != 13) {
                                            if (i4 != 14) {
                                                if (i4 != 16) {
                                                    if (i4 != 17) {
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                                                    } else {
                                                        objArr[1] = "setCopyOverrides";
                                                    }
                                                } else {
                                                    objArr[1] = "setSubstitution";
                                                }
                                            } else {
                                                objArr[1] = "setDispatchReceiverParameter";
                                            }
                                        } else {
                                            objArr[1] = "setTypeParameters";
                                        }
                                    } else {
                                        objArr[1] = "setName";
                                    }
                                } else {
                                    objArr[1] = "setKind";
                                }
                            } else {
                                objArr[1] = "setVisibility";
                            }
                        } else {
                            objArr[1] = "setModality";
                        }
                    } else {
                        objArr[1] = "setReturnType";
                    }
                } else {
                    objArr[1] = "setPreserveSourceElement";
                }
            } else {
                objArr[1] = "setOriginal";
            }
        } else {
            objArr[1] = "setOwner";
        }
        switch (i4) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 5 || i4 == 7 || i4 == 9 || i4 == 11 || i4 == 19 || i4 == 13 || i4 == 14 || i4 == 16 || i4 == 17) {
            throw new IllegalStateException(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r8v0, types: [se.ah, pe.k, pe.al, pe.b] */
    public final ah bravo() {
        C2871u c2871u;
        C2871u c2871u2;
        ai bravo;
        ai aiVar;
        aj charlie;
        aj ajVar;
        ax axVar;
        C2868r c2868r;
        C2868r c2868r2;
        ?? r22;
        kotlin.reflect.jvm.internal.impl.types.y yVar;
        C2871u c2871u3;
        C2871u c2871u4;
        kotlin.reflect.jvm.internal.impl.types.y india;
        ah ahVar = this.kilo;
        ahVar.getClass();
        InterfaceC2335k interfaceC2335k = this.alpha;
        int i4 = this.bravo;
        C2339o c2339o = this.charlie;
        pe.al alVar = this.delta;
        int i5 = this.echo;
        pe.ao aoVar = pe.an.magenta;
        ?? b02 = ahVar.b0(interfaceC2335k, i4, c2339o, alVar, i5, this.india);
        List typeParameters = ahVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        ax uniform = kotlin.reflect.jvm.internal.impl.types.c.uniform(typeParameters, this.foxtrot, b02, arrayList);
        kotlin.reflect.jvm.internal.impl.types.y yVar2 = this.juliet;
        kotlin.reflect.jvm.internal.impl.types.y india2 = uniform.india(3, yVar2);
        C2871u c2871u5 = null;
        if (india2 != null) {
            kotlin.reflect.jvm.internal.impl.types.y india3 = uniform.india(2, yVar2);
            if (india3 != null) {
                b02.f0(india3);
            }
            C2871u c2871u6 = this.hotel;
            if (c2871u6 != null) {
                C2871u delta = c2871u6.delta(uniform);
                if (delta != null) {
                    c2871u = delta;
                }
            } else {
                c2871u = null;
            }
            C2871u c2871u7 = ahVar.f13730n;
            if (c2871u7 != null && (india = uniform.india(2, c2871u7.getType())) != null) {
                c2871u7.Z();
                c2871u2 = new C2871u(b02, new Ye.b(b02, india), c2871u7.getAnnotations());
            } else {
                c2871u2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (C2871u c2871u8 : ahVar.f13728l) {
                kotlin.reflect.jvm.internal.impl.types.y india4 = uniform.india(2, c2871u8.getType());
                if (india4 == null) {
                    c2871u3 = c2871u5;
                    c2871u4 = c2871u3;
                } else {
                    c2871u4 = c2871u5;
                    Ne.f X10 = ((Ye.a) c2871u8.Z()).X();
                    c2871u8.Z();
                    c2871u3 = new C2871u(b02, new Ye.a((InterfaceC2326b) b02, india4, X10), c2871u8.getAnnotations());
                }
                if (c2871u3 != null) {
                    arrayList2.add(c2871u3);
                }
                c2871u5 = c2871u4;
            }
            ?? r18 = c2871u5;
            b02.g0(india2, arrayList, c2871u, c2871u2, arrayList2);
            ai aiVar2 = ahVar.f13732p;
            if (aiVar2 == null) {
                aiVar = r18;
            } else {
                InterfaceC2472h annotations = aiVar2.getAnnotations();
                int i10 = this.bravo;
                C2339o visibility = ahVar.f13732p.getVisibility();
                if (this.echo == 2 && AbstractC2340p.echo(AbstractC2340p.foxtrot(visibility.alpha.charlie()))) {
                    visibility = AbstractC2340p.hotel;
                }
                C2339o c2339o2 = visibility;
                ai aiVar3 = ahVar.f13732p;
                boolean z2 = aiVar3.teal;
                int i11 = this.echo;
                pe.al alVar2 = this.delta;
                if (alVar2 == null) {
                    bravo = r18;
                } else {
                    bravo = alVar2.bravo();
                }
                aiVar = new ai(b02, annotations, i10, c2339o2, z2, aiVar3.white, aiVar3.f13715b, i11, bravo, aoVar);
            }
            if (aiVar != null) {
                ai aiVar4 = ahVar.f13732p;
                kotlin.reflect.jvm.internal.impl.types.y yVar3 = aiVar4.f13736f;
                aiVar.e = ah.c0(uniform, aiVar4);
                if (yVar3 != null) {
                    yVar = uniform.india(3, yVar3);
                } else {
                    yVar = r18;
                }
                aiVar.c0(yVar);
            }
            aj ajVar2 = ahVar.f13733q;
            if (ajVar2 == null) {
                ajVar = r18;
            } else {
                InterfaceC2472h annotations2 = ajVar2.getAnnotations();
                int i12 = this.bravo;
                C2339o visibility2 = ahVar.f13733q.getVisibility();
                if (this.echo == 2 && AbstractC2340p.echo(AbstractC2340p.foxtrot(visibility2.alpha.charlie()))) {
                    visibility2 = AbstractC2340p.hotel;
                }
                C2339o c2339o3 = visibility2;
                aj ajVar3 = ahVar.f13733q;
                boolean z10 = ajVar3.teal;
                int i13 = this.echo;
                pe.al alVar3 = this.delta;
                if (alVar3 == null) {
                    charlie = r18;
                } else {
                    charlie = alVar3.charlie();
                }
                ajVar = new aj(b02, annotations2, i12, c2339o3, z10, ajVar3.white, ajVar3.f13715b, i13, charlie, aoVar);
            }
            if (ajVar != null) {
                axVar = uniform;
                List d02 = AbstractC2870t.d0(ajVar, ahVar.f13733q.peach(), axVar, false, false, null);
                if (d02 == null) {
                    d02 = Collections.singletonList(aj.b0(ajVar, Ue.e.echo(this.alpha).mike(), ((aq) ahVar.f13733q.peach().get(0)).getAnnotations()));
                }
                if (d02.size() == 1) {
                    ajVar.e = ah.c0(axVar, ahVar.f13733q);
                    aq aqVar = (aq) d02.get(0);
                    if (aqVar != null) {
                        ajVar.f13738f = aqVar;
                    } else {
                        aj.D(6);
                        throw r18;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                axVar = uniform;
            }
            C2868r c2868r3 = ahVar.f13734r;
            if (c2868r3 == null) {
                c2868r = r18;
            } else {
                c2868r = new C2868r(c2868r3.getAnnotations(), b02);
            }
            C2868r c2868r4 = ahVar.f13735s;
            if (c2868r4 == null) {
                c2868r2 = r18;
            } else {
                c2868r2 = new C2868r(c2868r4.getAnnotations(), b02);
            }
            b02.d0(aiVar, ajVar, c2868r, c2868r2);
            if (this.golf) {
                C2259n c2259n = new C2259n();
                Iterator it = ahVar.mike().iterator();
                while (it.hasNext()) {
                    c2259n.add(((pe.al) it.next()).delta(axVar));
                }
                b02.f13721d = c2259n;
            }
            if (ahVar.whiskey() && (r22 = ahVar.f13718a) != 0) {
                b02.e0(ahVar.yellow, r22);
            }
            return b02;
        }
        return null;
    }
}
