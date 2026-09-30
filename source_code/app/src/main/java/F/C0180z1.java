package F;

import com.airbnb.lottie.compose.LottieConstants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import s6.AbstractC2797v7;

/* renamed from: F.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0180z1 implements q0.ap {
    public final Function1 alpha;
    public final boolean bravo;
    public final float charlie;
    public final androidx.compose.foundation.layout.M delta;

    public C0180z1(Function1 function1, boolean z2, float f5, androidx.compose.foundation.layout.M m4) {
        this.alpha = function1;
        this.bravo = z2;
        this.charlie = f5;
        this.delta = m4;
    }

    @Override // q0.ap
    public final int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return echo(interfaceC2402u, list, i4, T.f1066l);
    }

    @Override // q0.ap
    public final int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return charlie(interfaceC2402u, list, i4, T.f1065k);
    }

    public final int charlie(InterfaceC2402u interfaceC2402u, List list, int i4, Xd.l lVar) {
        Object obj;
        int i5;
        int i10;
        Object obj2;
        int i11;
        Object obj3;
        int i12;
        Object obj4;
        int i13;
        Object obj5;
        int i14;
        Object obj6;
        int i15;
        Object obj7;
        int i16;
        int size = list.size();
        int i17 = 0;
        while (true) {
            if (i17 < size) {
                obj = list.get(i17);
                if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj), "Leading")) {
                    break;
                }
                i17++;
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC2401t interfaceC2401t = (InterfaceC2401t) obj;
        if (interfaceC2401t != null) {
            int romeo = interfaceC2401t.romeo(LottieConstants.IterateForever);
            if (i4 == Integer.MAX_VALUE) {
                i5 = i4;
            } else {
                i5 = i4 - romeo;
            }
            i10 = ((Number) lVar.invoke(interfaceC2401t, Integer.valueOf(i4))).intValue();
        } else {
            i5 = i4;
            i10 = 0;
        }
        int size2 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 < size2) {
                obj2 = list.get(i18);
                if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj2), "Trailing")) {
                    break;
                }
                i18++;
            } else {
                obj2 = null;
                break;
            }
        }
        InterfaceC2401t interfaceC2401t2 = (InterfaceC2401t) obj2;
        if (interfaceC2401t2 != null) {
            int romeo2 = interfaceC2401t2.romeo(LottieConstants.IterateForever);
            if (i5 != Integer.MAX_VALUE) {
                i5 -= romeo2;
            }
            i11 = ((Number) lVar.invoke(interfaceC2401t2, Integer.valueOf(i4))).intValue();
        } else {
            i11 = 0;
        }
        int size3 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 < size3) {
                obj3 = list.get(i19);
                if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj3), "Label")) {
                    break;
                }
                i19++;
            } else {
                obj3 = null;
                break;
            }
        }
        Object obj8 = (InterfaceC2401t) obj3;
        if (obj8 != null) {
            i12 = ((Number) lVar.invoke(obj8, Integer.valueOf(AbstractC2797v7.foxtrot(i5, i4, this.charlie)))).intValue();
        } else {
            i12 = 0;
        }
        int size4 = list.size();
        int i20 = 0;
        while (true) {
            if (i20 < size4) {
                obj4 = list.get(i20);
                if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj4), "Prefix")) {
                    break;
                }
                i20++;
            } else {
                obj4 = null;
                break;
            }
        }
        InterfaceC2401t interfaceC2401t3 = (InterfaceC2401t) obj4;
        if (interfaceC2401t3 != null) {
            i13 = ((Number) lVar.invoke(interfaceC2401t3, Integer.valueOf(i5))).intValue();
            int romeo3 = interfaceC2401t3.romeo(LottieConstants.IterateForever);
            if (i5 != Integer.MAX_VALUE) {
                i5 -= romeo3;
            }
        } else {
            i13 = 0;
        }
        int size5 = list.size();
        int i21 = 0;
        while (true) {
            if (i21 < size5) {
                obj5 = list.get(i21);
                if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj5), "Suffix")) {
                    break;
                }
                i21++;
            } else {
                obj5 = null;
                break;
            }
        }
        InterfaceC2401t interfaceC2401t4 = (InterfaceC2401t) obj5;
        if (interfaceC2401t4 != null) {
            int intValue = ((Number) lVar.invoke(interfaceC2401t4, Integer.valueOf(i5))).intValue();
            int romeo4 = interfaceC2401t4.romeo(LottieConstants.IterateForever);
            if (i5 != Integer.MAX_VALUE) {
                i5 -= romeo4;
            }
            i14 = intValue;
        } else {
            i14 = 0;
        }
        int size6 = list.size();
        for (int i22 = 0; i22 < size6; i22++) {
            Object obj9 = list.get(i22);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj9), "TextField")) {
                int intValue2 = ((Number) lVar.invoke(obj9, Integer.valueOf(i5))).intValue();
                int size7 = list.size();
                int i23 = 0;
                while (true) {
                    if (i23 < size7) {
                        obj6 = list.get(i23);
                        if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj6), "Hint")) {
                            break;
                        }
                        i23++;
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                Object obj10 = (InterfaceC2401t) obj6;
                if (obj10 != null) {
                    i15 = ((Number) lVar.invoke(obj10, Integer.valueOf(i5))).intValue();
                } else {
                    i15 = 0;
                }
                int size8 = list.size();
                int i24 = 0;
                while (true) {
                    if (i24 < size8) {
                        Object obj11 = list.get(i24);
                        if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj11), "Supporting")) {
                            obj7 = obj11;
                            break;
                        }
                        i24++;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                Object obj12 = (InterfaceC2401t) obj7;
                if (obj12 != null) {
                    i16 = ((Number) lVar.invoke(obj12, Integer.valueOf(i4))).intValue();
                } else {
                    i16 = 0;
                }
                return AbstractC0174x1.charlie(i10, i11, i13, i14, intValue2, i12, i15, i16, this.charlie, androidx.compose.material3.internal.at.alpha, interfaceC2402u.alpha(), this.delta);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // q0.ap
    public final q0.aq delta(q0.ar arVar, List list, long j5) {
        Object obj;
        AbstractC2367C abstractC2367C;
        int i4;
        int i5;
        int i10;
        Object obj2;
        int i11;
        AbstractC2367C abstractC2367C2;
        int i12;
        int i13;
        Object obj3;
        AbstractC2367C abstractC2367C3;
        int i14;
        AbstractC2367C abstractC2367C4;
        int i15;
        int i16;
        Object obj4;
        int i17;
        AbstractC2367C abstractC2367C5;
        int i18;
        int i19;
        Object obj5;
        AbstractC2367C abstractC2367C6;
        long j6;
        int i20;
        Object obj6;
        int i21;
        int i22;
        Object obj7;
        AbstractC2367C abstractC2367C7;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        AbstractC2367C abstractC2367C8;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        C0180z1 c0180z1 = this;
        List list2 = list;
        int i40 = 1;
        androidx.compose.foundation.layout.M m4 = c0180z1.delta;
        int ochre = arVar.ochre(m4.delta);
        long alpha = Q0.a.alpha(j5, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i41 = 0;
        while (true) {
            if (i41 < size) {
                obj = list2.get(i41);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj), "Leading")) {
                    break;
                }
                i41++;
            } else {
                obj = null;
                break;
            }
        }
        q0.ao aoVar = (q0.ao) obj;
        if (aoVar != null) {
            abstractC2367C = aoVar.victor(alpha);
        } else {
            abstractC2367C = null;
        }
        float f5 = androidx.compose.material3.internal.at.bravo;
        if (abstractC2367C != null) {
            i4 = abstractC2367C.alpha;
        } else {
            i4 = 0;
        }
        if (abstractC2367C != null) {
            i5 = abstractC2367C.purple;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        int size2 = list2.size();
        int i42 = 0;
        while (true) {
            if (i42 < size2) {
                obj2 = list2.get(i42);
                i10 = i40;
                if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj2), "Trailing")) {
                    break;
                }
                i42++;
                i40 = i10;
            } else {
                i10 = i40;
                obj2 = null;
                break;
            }
        }
        q0.ao aoVar2 = (q0.ao) obj2;
        if (aoVar2 != null) {
            i11 = i4;
            abstractC2367C2 = aoVar2.victor(Q0.b.juliet(-i4, 0, 2, alpha));
        } else {
            i11 = i4;
            abstractC2367C2 = null;
        }
        if (abstractC2367C2 != null) {
            i12 = abstractC2367C2.alpha;
        } else {
            i12 = 0;
        }
        int i43 = i12 + i11;
        if (abstractC2367C2 != null) {
            i13 = abstractC2367C2.purple;
        } else {
            i13 = 0;
        }
        int max2 = Math.max(max, i13);
        int size3 = list2.size();
        int i44 = 0;
        while (true) {
            if (i44 < size3) {
                obj3 = list2.get(i44);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj3), "Prefix")) {
                    break;
                }
                i44++;
            } else {
                obj3 = null;
                break;
            }
        }
        q0.ao aoVar3 = (q0.ao) obj3;
        if (aoVar3 != null) {
            abstractC2367C3 = abstractC2367C2;
            i14 = i43;
            abstractC2367C4 = aoVar3.victor(Q0.b.juliet(-i43, 0, 2, alpha));
        } else {
            abstractC2367C3 = abstractC2367C2;
            i14 = i43;
            abstractC2367C4 = null;
        }
        if (abstractC2367C4 != null) {
            i15 = abstractC2367C4.alpha;
        } else {
            i15 = 0;
        }
        int i45 = i14 + i15;
        if (abstractC2367C4 != null) {
            i16 = abstractC2367C4.purple;
        } else {
            i16 = 0;
        }
        int max3 = Math.max(max2, i16);
        int size4 = list2.size();
        int i46 = 0;
        while (true) {
            if (i46 < size4) {
                obj4 = list2.get(i46);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj4), "Suffix")) {
                    break;
                }
                i46++;
            } else {
                obj4 = null;
                break;
            }
        }
        q0.ao aoVar4 = (q0.ao) obj4;
        if (aoVar4 != null) {
            i17 = i45;
            abstractC2367C5 = aoVar4.victor(Q0.b.juliet(-i45, 0, 2, alpha));
        } else {
            i17 = i45;
            abstractC2367C5 = null;
        }
        if (abstractC2367C5 != null) {
            i18 = abstractC2367C5.alpha;
        } else {
            i18 = 0;
        }
        int i47 = i18 + i17;
        if (abstractC2367C5 != null) {
            i19 = abstractC2367C5.purple;
        } else {
            i19 = 0;
        }
        int max4 = Math.max(max3, i19);
        int ochre2 = arVar.ochre(m4.delta(arVar.getLayoutDirection())) + arVar.ochre(m4.bravo(arVar.getLayoutDirection()));
        int i48 = -i47;
        int foxtrot = AbstractC2797v7.foxtrot(i48 - ochre2, -ochre2, c0180z1.charlie);
        int i49 = -ochre;
        long india = Q0.b.india(foxtrot, i49, alpha);
        int size5 = list2.size();
        int i50 = 0;
        while (true) {
            if (i50 < size5) {
                obj5 = list2.get(i50);
                int i51 = i50;
                int i52 = size5;
                if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj5), "Label")) {
                    break;
                }
                i50 = i51 + 1;
                size5 = i52;
            } else {
                obj5 = null;
                break;
            }
        }
        q0.ao aoVar5 = (q0.ao) obj5;
        if (aoVar5 != null) {
            abstractC2367C6 = aoVar5.victor(india);
        } else {
            abstractC2367C6 = null;
        }
        if (abstractC2367C6 != null) {
            j6 = t6.M2.alpha(abstractC2367C6.alpha, abstractC2367C6.purple);
        } else {
            j6 = 0;
        }
        c0180z1.alpha.invoke(new Z.e(j6));
        int size6 = list2.size();
        int i53 = 0;
        while (true) {
            if (i53 < size6) {
                obj6 = list2.get(i53);
                int i54 = size6;
                i20 = i49;
                if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj6), "Supporting")) {
                    break;
                }
                i53++;
                i49 = i20;
                size6 = i54;
            } else {
                i20 = i49;
                obj6 = null;
                break;
            }
        }
        q0.ao aoVar6 = (q0.ao) obj6;
        if (aoVar6 != null) {
            i21 = aoVar6.jade(Q0.a.juliet(j5));
        } else {
            i21 = 0;
        }
        if (abstractC2367C6 != null) {
            i22 = abstractC2367C6.purple;
        } else {
            i22 = 0;
        }
        int max5 = Math.max(i22 / 2, arVar.ochre(m4.bravo));
        long alpha2 = Q0.a.alpha(Q0.b.india(i48, (i20 - max5) - i21, j5), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i55 = 0;
        while (i55 < size7) {
            q0.ao aoVar7 = (q0.ao) list2.get(i55);
            int i56 = i55;
            int i57 = size7;
            if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha(aoVar7), "TextField")) {
                AbstractC2367C victor = aoVar7.victor(alpha2);
                long alpha3 = Q0.a.alpha(alpha2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i58 = 0;
                while (true) {
                    if (i58 < size8) {
                        obj7 = list2.get(i58);
                        int i59 = size8;
                        int i60 = i58;
                        if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj7), "Hint")) {
                            break;
                        }
                        i58 = i60 + 1;
                        size8 = i59;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                q0.ao aoVar8 = (q0.ao) obj7;
                if (aoVar8 != null) {
                    abstractC2367C7 = aoVar8.victor(alpha3);
                } else {
                    abstractC2367C7 = null;
                }
                int i61 = victor.purple;
                if (abstractC2367C7 != null) {
                    i23 = abstractC2367C7.purple;
                } else {
                    i23 = 0;
                }
                int max6 = Math.max(max4, Math.max(i61, i23) + max5 + ochre);
                if (abstractC2367C != null) {
                    i24 = abstractC2367C.alpha;
                } else {
                    i24 = 0;
                }
                AbstractC2367C abstractC2367C9 = abstractC2367C3;
                if (abstractC2367C3 != null) {
                    i25 = abstractC2367C9.alpha;
                } else {
                    i25 = 0;
                }
                if (abstractC2367C4 != null) {
                    i26 = abstractC2367C4.alpha;
                } else {
                    i26 = 0;
                }
                if (abstractC2367C5 != null) {
                    i27 = abstractC2367C5.alpha;
                } else {
                    i27 = 0;
                }
                int i62 = victor.alpha;
                if (abstractC2367C6 != null) {
                    i28 = abstractC2367C6.alpha;
                } else {
                    i28 = 0;
                }
                if (abstractC2367C7 != null) {
                    i29 = abstractC2367C7.alpha;
                } else {
                    i29 = 0;
                }
                int delta = AbstractC0174x1.delta(i24, i25, i26, i27, i62, i28, i29, c0180z1.charlie, j5, arVar.alpha(), c0180z1.delta);
                long alpha4 = Q0.a.alpha(Q0.b.juliet(0, -max6, i10, alpha), 0, delta, 0, 0, 9);
                if (aoVar6 != null) {
                    abstractC2367C8 = aoVar6.victor(alpha4);
                } else {
                    abstractC2367C8 = null;
                }
                if (abstractC2367C8 != null) {
                    i30 = abstractC2367C8.purple;
                } else {
                    i30 = 0;
                }
                if (abstractC2367C != null) {
                    i31 = abstractC2367C.purple;
                } else {
                    i31 = 0;
                }
                if (abstractC2367C9 != null) {
                    i32 = abstractC2367C9.purple;
                } else {
                    i32 = 0;
                }
                if (abstractC2367C4 != null) {
                    i33 = abstractC2367C4.purple;
                } else {
                    i33 = 0;
                }
                if (abstractC2367C5 != null) {
                    i34 = abstractC2367C5.purple;
                } else {
                    i34 = 0;
                }
                int i63 = victor.purple;
                if (abstractC2367C6 != null) {
                    i35 = abstractC2367C6.purple;
                } else {
                    i35 = 0;
                }
                if (abstractC2367C7 != null) {
                    i36 = abstractC2367C7.purple;
                } else {
                    i36 = 0;
                }
                if (abstractC2367C8 != null) {
                    i37 = abstractC2367C8.purple;
                } else {
                    i37 = 0;
                }
                int charlie = AbstractC0174x1.charlie(i31, i32, i33, i34, i63, i35, i36, i37, c0180z1.charlie, j5, arVar.alpha(), c0180z1.delta);
                int i64 = charlie - i30;
                int size9 = list2.size();
                int i65 = 0;
                while (i65 < size9) {
                    q0.ao aoVar9 = (q0.ao) list2.get(i65);
                    int i66 = charlie;
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha(aoVar9), "Container")) {
                        if (delta != Integer.MAX_VALUE) {
                            i38 = delta;
                        } else {
                            i38 = 0;
                        }
                        if (i64 != Integer.MAX_VALUE) {
                            i39 = i64;
                        } else {
                            i39 = 0;
                        }
                        return arVar.papa(delta, i66, kotlin.collections.t.alpha, new C0177y1(i66, delta, abstractC2367C, abstractC2367C9, abstractC2367C4, abstractC2367C5, victor, abstractC2367C6, abstractC2367C7, aoVar9.victor(Q0.b.alpha(i38, delta, i39, i64)), abstractC2367C8, c0180z1, arVar));
                    }
                    charlie = i66;
                    i65++;
                    abstractC2367C = abstractC2367C;
                    abstractC2367C6 = abstractC2367C6;
                    c0180z1 = this;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i55 = i56 + 1;
            abstractC2367C = abstractC2367C;
            abstractC2367C6 = abstractC2367C6;
            c0180z1 = this;
            size7 = i57;
            alpha2 = alpha2;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int echo(InterfaceC2402u interfaceC2402u, List list, int i4, Xd.l lVar) {
        Object obj;
        Object obj2;
        int i5;
        Object obj3;
        int i10;
        Object obj4;
        int i11;
        Object obj5;
        int i12;
        Object obj6;
        int i13;
        int size = list.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Object obj7 = list.get(i15);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj7), "TextField")) {
                int intValue = ((Number) lVar.invoke(obj7, Integer.valueOf(i4))).intValue();
                int size2 = list.size();
                int i16 = 0;
                while (true) {
                    obj = null;
                    if (i16 < size2) {
                        obj2 = list.get(i16);
                        if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj2), "Label")) {
                            break;
                        }
                        i16++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                InterfaceC2401t interfaceC2401t = (InterfaceC2401t) obj2;
                if (interfaceC2401t != null) {
                    i5 = ((Number) lVar.invoke(interfaceC2401t, Integer.valueOf(i4))).intValue();
                } else {
                    i5 = 0;
                }
                int size3 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size3) {
                        obj3 = list.get(i17);
                        if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj3), "Trailing")) {
                            break;
                        }
                        i17++;
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                InterfaceC2401t interfaceC2401t2 = (InterfaceC2401t) obj3;
                if (interfaceC2401t2 != null) {
                    i10 = ((Number) lVar.invoke(interfaceC2401t2, Integer.valueOf(i4))).intValue();
                } else {
                    i10 = 0;
                }
                int size4 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 < size4) {
                        obj4 = list.get(i18);
                        if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj4), "Leading")) {
                            break;
                        }
                        i18++;
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                InterfaceC2401t interfaceC2401t3 = (InterfaceC2401t) obj4;
                if (interfaceC2401t3 != null) {
                    i11 = ((Number) lVar.invoke(interfaceC2401t3, Integer.valueOf(i4))).intValue();
                } else {
                    i11 = 0;
                }
                int size5 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 < size5) {
                        obj5 = list.get(i19);
                        if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj5), "Prefix")) {
                            break;
                        }
                        i19++;
                    } else {
                        obj5 = null;
                        break;
                    }
                }
                InterfaceC2401t interfaceC2401t4 = (InterfaceC2401t) obj5;
                if (interfaceC2401t4 != null) {
                    i12 = ((Number) lVar.invoke(interfaceC2401t4, Integer.valueOf(i4))).intValue();
                } else {
                    i12 = 0;
                }
                int size6 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 < size6) {
                        obj6 = list.get(i20);
                        if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj6), "Suffix")) {
                            break;
                        }
                        i20++;
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                InterfaceC2401t interfaceC2401t5 = (InterfaceC2401t) obj6;
                if (interfaceC2401t5 != null) {
                    i13 = ((Number) lVar.invoke(interfaceC2401t5, Integer.valueOf(i4))).intValue();
                } else {
                    i13 = 0;
                }
                int size7 = list.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i21);
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i21++;
                }
                InterfaceC2401t interfaceC2401t6 = (InterfaceC2401t) obj;
                if (interfaceC2401t6 != null) {
                    i14 = ((Number) lVar.invoke(interfaceC2401t6, Integer.valueOf(i4))).intValue();
                }
                return AbstractC0174x1.delta(i11, i10, i12, i13, intValue, i5, i14, this.charlie, androidx.compose.material3.internal.at.alpha, interfaceC2402u.alpha(), this.delta);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // q0.ap
    public final int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return echo(interfaceC2402u, list, i4, T.f1064j);
    }

    @Override // q0.ap
    public final int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return charlie(interfaceC2402u, list, i4, T.f1063i);
    }
}
