package F;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2367C;
import q0.InterfaceC2380P;

/* loaded from: classes3.dex */
public final class N1 extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1041c;
    public final /* synthetic */ int purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(int i4, P.d dVar, P.d dVar2, P.d dVar3, P.d dVar4, androidx.compose.material3.internal.ag agVar, P.d dVar5) {
        super(2);
        this.purple = i4;
        this.red = dVar;
        this.silver = dVar2;
        this.teal = dVar3;
        this.white = dVar4;
        this.f1041c = agVar;
        this.yellow = dVar5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        float crimson;
        float alpha;
        Integer num;
        Object obj3;
        int i4;
        Object obj4;
        int i5;
        Object obj5;
        int i10;
        int i11;
        C0121j0 c0121j0;
        Object obj6;
        Integer num2;
        Integer num3;
        ArrayList arrayList;
        int i12;
        int charlie;
        int ochre;
        int charlie2;
        Object obj7;
        Object obj8;
        int i13;
        int ochre2;
        int ochre3;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q = (C0585q) interfaceC0581m;
                    if (c0585q.bronze()) {
                        c0585q.ochre();
                        return Unit.INSTANCE;
                    }
                }
                Q1.bravo(this.purple, this.red, (P.d) this.silver, (P.d) this.teal, (P.d) this.white, (androidx.compose.material3.internal.ag) this.f1041c, (P.d) this.yellow, interfaceC0581m, 0);
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q2 = (C0585q) interfaceC0581m2;
                    if (c0585q2.bronze()) {
                        c0585q2.ochre();
                        return Unit.INSTANCE;
                    }
                }
                androidx.compose.foundation.layout.a0 a0Var = (androidx.compose.foundation.layout.a0) this.silver;
                InterfaceC2380P interfaceC2380P = (InterfaceC2380P) this.teal;
                androidx.compose.foundation.layout.ay ayVar = new androidx.compose.foundation.layout.ay(a0Var, interfaceC2380P);
                if (((ArrayList) this.white).isEmpty()) {
                    crimson = ayVar.charlie();
                } else {
                    crimson = interfaceC2380P.crimson(this.purple);
                }
                if (!((ArrayList) this.yellow).isEmpty() && (num = (Integer) this.f1041c) != null) {
                    alpha = interfaceC2380P.crimson(num.intValue());
                } else {
                    alpha = ayVar.alpha();
                }
                this.red.invoke(new androidx.compose.foundation.layout.M(AbstractC0538d.india(ayVar, interfaceC2380P.getLayoutDirection()), crimson, AbstractC0538d.hotel(ayVar, interfaceC2380P.getLayoutDirection()), alpha), interfaceC0581m2, 0);
                return Unit.INSTANCE;
            case 2:
                InterfaceC2380P interfaceC2380P2 = (InterfaceC2380P) obj;
                long j5 = ((Q0.a) obj2).alpha;
                int hotel = Q0.a.hotel(j5);
                int golf = Q0.a.golf(j5);
                long alpha2 = Q0.a.alpha(j5, 0, 0, 0, 0, 10);
                List pink = interfaceC2380P2.pink(R1.alpha, this.red);
                ArrayList arrayList2 = new ArrayList(pink.size());
                int size = pink.size();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList2.add(((q0.ao) pink.get(i14)).victor(alpha2));
                }
                if (arrayList2.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList2.get(0);
                    int i15 = ((AbstractC2367C) obj3).purple;
                    int ivory = CollectionsKt.ivory(arrayList2);
                    if (1 <= ivory) {
                        int i16 = 1;
                        while (true) {
                            Object obj9 = arrayList2.get(i16);
                            int i17 = ((AbstractC2367C) obj9).purple;
                            if (i15 < i17) {
                                obj3 = obj9;
                                i15 = i17;
                            }
                            if (i16 != ivory) {
                                i16++;
                            }
                        }
                    }
                }
                AbstractC2367C abstractC2367C = (AbstractC2367C) obj3;
                if (abstractC2367C != null) {
                    i4 = abstractC2367C.purple;
                } else {
                    i4 = 0;
                }
                List pink2 = interfaceC2380P2.pink(R1.red, (P.d) this.silver);
                ArrayList arrayList3 = new ArrayList(pink2.size());
                int size2 = pink2.size();
                int i18 = 0;
                while (true) {
                    androidx.compose.foundation.layout.a0 a0Var2 = (androidx.compose.foundation.layout.a0) this.f1041c;
                    if (i18 < size2) {
                        arrayList3.add(((q0.ao) pink2.get(i18)).victor(Q0.b.india((-a0Var2.bravo(interfaceC2380P2, interfaceC2380P2.getLayoutDirection())) - a0Var2.delta(interfaceC2380P2, interfaceC2380P2.getLayoutDirection()), -a0Var2.charlie(interfaceC2380P2), alpha2)));
                        i18++;
                    } else {
                        if (arrayList3.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList3.get(0);
                            int i19 = ((AbstractC2367C) obj4).purple;
                            int ivory2 = CollectionsKt.ivory(arrayList3);
                            if (1 <= ivory2) {
                                Object obj10 = obj4;
                                int i20 = i19;
                                int i21 = 1;
                                while (true) {
                                    Object obj11 = arrayList3.get(i21);
                                    int i22 = ((AbstractC2367C) obj11).purple;
                                    if (i20 < i22) {
                                        obj10 = obj11;
                                        i20 = i22;
                                    }
                                    if (i21 != ivory2) {
                                        i21++;
                                    } else {
                                        obj4 = obj10;
                                    }
                                }
                            }
                        }
                        AbstractC2367C abstractC2367C2 = (AbstractC2367C) obj4;
                        if (abstractC2367C2 != null) {
                            i5 = abstractC2367C2.purple;
                        } else {
                            i5 = 0;
                        }
                        if (arrayList3.isEmpty()) {
                            i10 = hotel;
                            obj5 = null;
                        } else {
                            obj5 = arrayList3.get(0);
                            int i23 = ((AbstractC2367C) obj5).alpha;
                            int ivory3 = CollectionsKt.ivory(arrayList3);
                            if (1 <= ivory3) {
                                Object obj12 = obj5;
                                int i24 = i23;
                                int i25 = 1;
                                while (true) {
                                    Object obj13 = arrayList3.get(i25);
                                    i10 = hotel;
                                    int i26 = ((AbstractC2367C) obj13).alpha;
                                    if (i24 < i26) {
                                        i24 = i26;
                                        obj12 = obj13;
                                    }
                                    if (i25 != ivory3) {
                                        i25++;
                                        hotel = i10;
                                    } else {
                                        obj5 = obj12;
                                    }
                                }
                            } else {
                                i10 = hotel;
                            }
                        }
                        AbstractC2367C abstractC2367C3 = (AbstractC2367C) obj5;
                        if (abstractC2367C3 != null) {
                            i11 = abstractC2367C3.alpha;
                        } else {
                            i11 = 0;
                        }
                        List pink3 = interfaceC2380P2.pink(R1.silver, (P.d) this.teal);
                        ArrayList arrayList4 = new ArrayList(pink3.size());
                        int size3 = pink3.size();
                        int i27 = 0;
                        while (i27 < size3) {
                            int i28 = i11;
                            int i29 = i5;
                            AbstractC2367C victor = ((q0.ao) pink3.get(i27)).victor(Q0.b.india((-a0Var2.bravo(interfaceC2380P2, interfaceC2380P2.getLayoutDirection())) - a0Var2.delta(interfaceC2380P2, interfaceC2380P2.getLayoutDirection()), -a0Var2.charlie(interfaceC2380P2), alpha2));
                            if (victor.purple == 0 || victor.alpha == 0) {
                                victor = null;
                            }
                            if (victor != null) {
                                arrayList4.add(victor);
                            }
                            i27++;
                            i11 = i28;
                            i5 = i29;
                        }
                        int i30 = i11;
                        int i31 = i5;
                        boolean isEmpty = arrayList4.isEmpty();
                        int i32 = this.purple;
                        if (!isEmpty) {
                            if (arrayList4.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList4.get(0);
                                int i33 = ((AbstractC2367C) obj7).alpha;
                                int ivory4 = CollectionsKt.ivory(arrayList4);
                                if (1 <= ivory4) {
                                    Object obj14 = obj7;
                                    int i34 = i33;
                                    int i35 = 1;
                                    while (true) {
                                        Object obj15 = arrayList4.get(i35);
                                        int i36 = ((AbstractC2367C) obj15).alpha;
                                        if (i34 < i36) {
                                            i34 = i36;
                                            obj14 = obj15;
                                        }
                                        if (i35 != ivory4) {
                                            i35++;
                                        } else {
                                            obj7 = obj14;
                                        }
                                    }
                                }
                            }
                            Intrinsics.checkNotNull(obj7);
                            int i37 = ((AbstractC2367C) obj7).alpha;
                            if (arrayList4.isEmpty()) {
                                i13 = i37;
                                obj8 = null;
                            } else {
                                obj8 = arrayList4.get(0);
                                int i38 = ((AbstractC2367C) obj8).purple;
                                int ivory5 = CollectionsKt.ivory(arrayList4);
                                if (1 <= ivory5) {
                                    Object obj16 = obj8;
                                    int i39 = i38;
                                    int i40 = 1;
                                    while (true) {
                                        Object obj17 = arrayList4.get(i40);
                                        i13 = i37;
                                        int i41 = ((AbstractC2367C) obj17).purple;
                                        if (i39 < i41) {
                                            i39 = i41;
                                            obj16 = obj17;
                                        }
                                        if (i40 != ivory5) {
                                            i40++;
                                            i37 = i13;
                                        } else {
                                            obj8 = obj16;
                                        }
                                    }
                                } else {
                                    i13 = i37;
                                }
                            }
                            Intrinsics.checkNotNull(obj8);
                            int i42 = ((AbstractC2367C) obj8).purple;
                            if (i32 == 0) {
                                if (interfaceC2380P2.getLayoutDirection() == Q0.n.alpha) {
                                    ochre2 = interfaceC2380P2.ochre(Q1.alpha);
                                    c0121j0 = new C0121j0(ochre2, i42, 0);
                                } else {
                                    ochre3 = interfaceC2380P2.ochre(Q1.alpha);
                                    ochre2 = (i10 - ochre3) - i13;
                                    c0121j0 = new C0121j0(ochre2, i42, 0);
                                }
                            } else {
                                if (i32 == 2 || i32 == 3) {
                                    if (interfaceC2380P2.getLayoutDirection() == Q0.n.alpha) {
                                        ochre3 = interfaceC2380P2.ochre(Q1.alpha);
                                        ochre2 = (i10 - ochre3) - i13;
                                    } else {
                                        ochre2 = interfaceC2380P2.ochre(Q1.alpha);
                                    }
                                } else {
                                    ochre2 = (i10 - i13) / 2;
                                }
                                c0121j0 = new C0121j0(ochre2, i42, 0);
                            }
                        } else {
                            c0121j0 = null;
                        }
                        List pink4 = interfaceC2380P2.pink(R1.teal, new P.d(new C0096d((P.d) this.white, 6, (byte) 0), -2146438447, true));
                        ArrayList arrayList5 = new ArrayList(pink4.size());
                        int size4 = pink4.size();
                        for (int i43 = 0; i43 < size4; i43++) {
                            arrayList5.add(((q0.ao) pink4.get(i43)).victor(alpha2));
                        }
                        if (arrayList5.isEmpty()) {
                            obj6 = null;
                        } else {
                            obj6 = arrayList5.get(0);
                            int i44 = ((AbstractC2367C) obj6).purple;
                            int ivory6 = CollectionsKt.ivory(arrayList5);
                            if (1 <= ivory6) {
                                int i45 = 1;
                                while (true) {
                                    Object obj18 = arrayList5.get(i45);
                                    Object obj19 = obj6;
                                    int i46 = ((AbstractC2367C) obj18).purple;
                                    if (i44 < i46) {
                                        i44 = i46;
                                        obj6 = obj18;
                                    } else {
                                        obj6 = obj19;
                                    }
                                    if (i45 != ivory6) {
                                        i45++;
                                    }
                                }
                            }
                        }
                        AbstractC2367C abstractC2367C4 = (AbstractC2367C) obj6;
                        if (abstractC2367C4 != null) {
                            num2 = Integer.valueOf(abstractC2367C4.purple);
                        } else {
                            num2 = null;
                        }
                        if (c0121j0 != null) {
                            int i47 = c0121j0.charlie;
                            if (num2 != null && i32 != 3) {
                                ochre = num2.intValue() + i47;
                                charlie2 = interfaceC2380P2.ochre(Q1.alpha);
                            } else {
                                ochre = interfaceC2380P2.ochre(Q1.alpha) + i47;
                                charlie2 = a0Var2.charlie(interfaceC2380P2);
                            }
                            num3 = Integer.valueOf(charlie2 + ochre);
                        } else {
                            num3 = null;
                        }
                        if (i31 != 0) {
                            if (num3 != null) {
                                charlie = num3.intValue();
                            } else if (num2 != null) {
                                charlie = num2.intValue();
                            } else {
                                charlie = a0Var2.charlie(interfaceC2380P2);
                            }
                            int i48 = i31 + charlie;
                            arrayList = arrayList3;
                            i12 = i48;
                        } else {
                            arrayList = arrayList3;
                            i12 = 0;
                        }
                        Integer num4 = num2;
                        List pink5 = interfaceC2380P2.pink(R1.purple, new P.d(new N1((androidx.compose.foundation.layout.a0) this.f1041c, interfaceC2380P2, arrayList2, i4, arrayList5, num4, (P.d) this.yellow), -1213360416, true));
                        ArrayList arrayList6 = new ArrayList(pink5.size());
                        int size5 = pink5.size();
                        for (int i49 = 0; i49 < size5; i49++) {
                            arrayList6.add(((q0.ao) pink5.get(i49)).victor(alpha2));
                        }
                        int i50 = i10;
                        return interfaceC2380P2.papa(i50, golf, kotlin.collections.t.alpha, new P1(arrayList6, arrayList2, arrayList, arrayList5, c0121j0, i50, i30, (androidx.compose.foundation.layout.a0) this.f1041c, interfaceC2380P2, golf, i12, num4, arrayList4, num3));
                    }
                }
                break;
            default:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(this.purple | 1);
                androidx.compose.animation.a.alpha((bz.a0) this.silver, (T.s) this.teal, (Function1) this.white, (T.f) this.yellow, (Function1) this.f1041c, this.red, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(P.d dVar, P.d dVar2, P.d dVar3, int i4, androidx.compose.foundation.layout.a0 a0Var, P.d dVar4, P.d dVar5) {
        super(2);
        this.red = dVar;
        this.silver = dVar2;
        this.teal = dVar3;
        this.purple = i4;
        this.f1041c = a0Var;
        this.white = dVar4;
        this.yellow = dVar5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(androidx.compose.foundation.layout.a0 a0Var, InterfaceC2380P interfaceC2380P, ArrayList arrayList, int i4, ArrayList arrayList2, Integer num, P.d dVar) {
        super(2);
        this.silver = a0Var;
        this.teal = interfaceC2380P;
        this.white = arrayList;
        this.purple = i4;
        this.yellow = arrayList2;
        this.f1041c = num;
        this.red = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(bz.a0 a0Var, T.s sVar, Function1 function1, T.f fVar, Function1 function12, P.d dVar, int i4) {
        super(2);
        this.silver = a0Var;
        this.teal = sVar;
        this.white = function1;
        this.yellow = fVar;
        this.f1041c = function12;
        this.red = dVar;
        this.purple = i4;
    }
}
