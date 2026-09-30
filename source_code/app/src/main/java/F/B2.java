package F;

import com.airbnb.lottie.compose.LottieConstants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public final class B2 implements q0.ap {
    public final boolean alpha;
    public final float bravo;
    public final androidx.compose.foundation.layout.M charlie;

    public B2(boolean z2, float f5, androidx.compose.foundation.layout.M m4) {
        this.alpha = z2;
        this.bravo = f5;
        this.charlie = m4;
    }

    public static int echo(List list, int i4, Xd.l lVar) {
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
                        if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj4), "Prefix")) {
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
                        if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj5), "Suffix")) {
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
                        if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj6), "Leading")) {
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
                long j5 = androidx.compose.material3.internal.at.alpha;
                float f5 = z2.alpha;
                int i22 = i11 + i12;
                return Math.max(Math.max(intValue + i22, Math.max(i14 + i22, i5)) + i13 + i10, Q0.a.juliet(j5));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // q0.ap
    public final int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return echo(list, i4, T.f1071q);
    }

    @Override // q0.ap
    public final int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return charlie(interfaceC2402u, list, i4, T.f1070p);
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
            i12 = ((Number) lVar.invoke(obj8, Integer.valueOf(i5))).intValue();
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
            int intValue = ((Number) lVar.invoke(interfaceC2401t3, Integer.valueOf(i5))).intValue();
            int romeo3 = interfaceC2401t3.romeo(LottieConstants.IterateForever);
            if (i5 != Integer.MAX_VALUE) {
                i5 -= romeo3;
            }
            i13 = intValue;
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
            int intValue2 = ((Number) lVar.invoke(interfaceC2401t4, Integer.valueOf(i5))).intValue();
            int romeo4 = interfaceC2401t4.romeo(LottieConstants.IterateForever);
            if (i5 != Integer.MAX_VALUE) {
                i5 -= romeo4;
            }
            i14 = intValue2;
        } else {
            i14 = 0;
        }
        int size6 = list.size();
        for (int i22 = 0; i22 < size6; i22++) {
            Object obj9 = list.get(i22);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.at.echo((InterfaceC2401t) obj9), "TextField")) {
                int intValue3 = ((Number) lVar.invoke(obj9, Integer.valueOf(i5))).intValue();
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
                return z2.charlie(intValue3, i12, i10, i11, i13, i14, i15, i16, this.bravo, androidx.compose.material3.internal.at.alpha, interfaceC2402u.alpha(), this.charlie);
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
        AbstractC2367C abstractC2367C2;
        int i11;
        int i12;
        Object obj3;
        int i13;
        AbstractC2367C abstractC2367C3;
        int i14;
        int i15;
        Object obj4;
        AbstractC2367C abstractC2367C4;
        int i16;
        int i17;
        int i18;
        Object obj5;
        AbstractC2367C abstractC2367C5;
        Object obj6;
        int i19;
        int i20;
        Object obj7;
        AbstractC2367C abstractC2367C6;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        AbstractC2367C abstractC2367C7;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        B2 b2 = this;
        List list2 = list;
        int i39 = 1;
        androidx.compose.foundation.layout.M m4 = b2.charlie;
        int ochre = arVar.ochre(m4.bravo);
        int ochre2 = arVar.ochre(m4.delta);
        long alpha = Q0.a.alpha(j5, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i40 = 0;
        while (true) {
            if (i40 < size) {
                obj = list2.get(i40);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj), "Leading")) {
                    break;
                }
                i40++;
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
        int i41 = 0;
        while (true) {
            if (i41 < size2) {
                obj2 = list2.get(i41);
                i10 = i39;
                if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj2), "Trailing")) {
                    break;
                }
                i41++;
                i39 = i10;
            } else {
                i10 = i39;
                obj2 = null;
                break;
            }
        }
        q0.ao aoVar2 = (q0.ao) obj2;
        if (aoVar2 != null) {
            abstractC2367C2 = aoVar2.victor(Q0.b.juliet(-i4, 0, 2, alpha));
        } else {
            abstractC2367C2 = null;
        }
        if (abstractC2367C2 != null) {
            i11 = abstractC2367C2.alpha;
        } else {
            i11 = 0;
        }
        int i42 = i4 + i11;
        if (abstractC2367C2 != null) {
            i12 = abstractC2367C2.purple;
        } else {
            i12 = 0;
        }
        int max2 = Math.max(max, i12);
        int size3 = list2.size();
        int i43 = 0;
        while (true) {
            if (i43 < size3) {
                obj3 = list2.get(i43);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj3), "Prefix")) {
                    break;
                }
                i43++;
            } else {
                obj3 = null;
                break;
            }
        }
        q0.ao aoVar3 = (q0.ao) obj3;
        if (aoVar3 != null) {
            i13 = ochre;
            abstractC2367C3 = aoVar3.victor(Q0.b.juliet(-i42, 0, 2, alpha));
        } else {
            i13 = ochre;
            abstractC2367C3 = null;
        }
        if (abstractC2367C3 != null) {
            i14 = abstractC2367C3.alpha;
        } else {
            i14 = 0;
        }
        int i44 = i42 + i14;
        if (abstractC2367C3 != null) {
            i15 = abstractC2367C3.purple;
        } else {
            i15 = 0;
        }
        int max3 = Math.max(max2, i15);
        int size4 = list2.size();
        int i45 = 0;
        while (true) {
            if (i45 < size4) {
                obj4 = list2.get(i45);
                if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj4), "Suffix")) {
                    break;
                }
                i45++;
            } else {
                obj4 = null;
                break;
            }
        }
        q0.ao aoVar4 = (q0.ao) obj4;
        if (aoVar4 != null) {
            abstractC2367C4 = aoVar4.victor(Q0.b.juliet(-i44, 0, 2, alpha));
        } else {
            abstractC2367C4 = null;
        }
        if (abstractC2367C4 != null) {
            i16 = abstractC2367C4.alpha;
        } else {
            i16 = 0;
        }
        int i46 = i44 + i16;
        if (abstractC2367C4 != null) {
            i17 = abstractC2367C4.purple;
        } else {
            i17 = 0;
        }
        int max4 = Math.max(max3, i17);
        int i47 = -i46;
        long india = Q0.b.india(i47, -ochre2, alpha);
        int size5 = list2.size();
        int i48 = 0;
        while (true) {
            if (i48 < size5) {
                obj5 = list2.get(i48);
                i18 = ochre2;
                int i49 = size5;
                if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj5), "Label")) {
                    break;
                }
                i48++;
                size5 = i49;
                ochre2 = i18;
            } else {
                i18 = ochre2;
                obj5 = null;
                break;
            }
        }
        q0.ao aoVar5 = (q0.ao) obj5;
        if (aoVar5 != null) {
            abstractC2367C5 = aoVar5.victor(india);
        } else {
            abstractC2367C5 = null;
        }
        int size6 = list2.size();
        int i50 = 0;
        while (true) {
            if (i50 < size6) {
                obj6 = list2.get(i50);
                int i51 = size6;
                if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj6), "Supporting")) {
                    break;
                }
                i50++;
                size6 = i51;
            } else {
                obj6 = null;
                break;
            }
        }
        q0.ao aoVar6 = (q0.ao) obj6;
        if (aoVar6 != null) {
            i19 = aoVar6.jade(Q0.a.juliet(j5));
        } else {
            i19 = 0;
        }
        if (abstractC2367C5 != null) {
            i20 = abstractC2367C5.purple;
        } else {
            i20 = 0;
        }
        int i52 = i20 + i13;
        int i53 = i13;
        long india2 = Q0.b.india(i47, ((-i52) - i18) - i19, Q0.a.alpha(j5, 0, 0, 0, 0, 11));
        int size7 = list2.size();
        int i54 = 0;
        while (i54 < size7) {
            int i55 = size7;
            q0.ao aoVar7 = (q0.ao) list2.get(i54);
            int i56 = i54;
            if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha(aoVar7), "TextField")) {
                AbstractC2367C victor = aoVar7.victor(india2);
                long alpha2 = Q0.a.alpha(india2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i57 = 0;
                while (true) {
                    if (i57 < size8) {
                        obj7 = list2.get(i57);
                        int i58 = size8;
                        int i59 = i57;
                        if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha((q0.ao) obj7), "Hint")) {
                            break;
                        }
                        i57 = i59 + 1;
                        size8 = i58;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                q0.ao aoVar8 = (q0.ao) obj7;
                if (aoVar8 != null) {
                    abstractC2367C6 = aoVar8.victor(alpha2);
                } else {
                    abstractC2367C6 = null;
                }
                int i60 = victor.purple;
                if (abstractC2367C6 != null) {
                    i21 = abstractC2367C6.purple;
                } else {
                    i21 = 0;
                }
                int max5 = Math.max(max4, Math.max(i60, i21) + i52 + i18);
                if (abstractC2367C != null) {
                    i22 = abstractC2367C.alpha;
                } else {
                    i22 = 0;
                }
                if (abstractC2367C2 != null) {
                    i23 = abstractC2367C2.alpha;
                } else {
                    i23 = 0;
                }
                if (abstractC2367C3 != null) {
                    i24 = abstractC2367C3.alpha;
                } else {
                    i24 = 0;
                }
                int i61 = i22;
                if (abstractC2367C4 != null) {
                    i25 = abstractC2367C4.alpha;
                } else {
                    i25 = 0;
                }
                int i62 = victor.alpha;
                if (abstractC2367C5 != null) {
                    i26 = abstractC2367C5.alpha;
                } else {
                    i26 = 0;
                }
                int i63 = i23;
                if (abstractC2367C6 != null) {
                    i27 = abstractC2367C6.alpha;
                } else {
                    i27 = 0;
                }
                int i64 = i24 + i25;
                int max6 = Math.max(Math.max(i62 + i64, Math.max(i27 + i64, i26)) + i61 + i63, Q0.a.juliet(j5));
                long alpha3 = Q0.a.alpha(Q0.b.juliet(0, -max5, i10, alpha), 0, max6, 0, 0, 9);
                int i65 = max6;
                if (aoVar6 != null) {
                    i28 = 0;
                    abstractC2367C7 = aoVar6.victor(alpha3);
                } else {
                    i28 = 0;
                    abstractC2367C7 = null;
                }
                if (abstractC2367C7 != null) {
                    i29 = abstractC2367C7.purple;
                } else {
                    i29 = i28;
                }
                int i66 = victor.purple;
                if (abstractC2367C5 != null) {
                    i30 = abstractC2367C5.purple;
                } else {
                    i30 = i28;
                }
                if (abstractC2367C != null) {
                    i31 = abstractC2367C.purple;
                } else {
                    i31 = i28;
                }
                if (abstractC2367C2 != null) {
                    i32 = abstractC2367C2.purple;
                } else {
                    i32 = i28;
                }
                if (abstractC2367C3 != null) {
                    i33 = abstractC2367C3.purple;
                } else {
                    i33 = i28;
                }
                if (abstractC2367C4 != null) {
                    i34 = abstractC2367C4.purple;
                } else {
                    i34 = i28;
                }
                if (abstractC2367C6 != null) {
                    i35 = abstractC2367C6.purple;
                } else {
                    i35 = i28;
                }
                if (abstractC2367C7 != null) {
                    i36 = abstractC2367C7.purple;
                } else {
                    i36 = i28;
                }
                int charlie = z2.charlie(i66, i30, i31, i32, i33, i34, i35, i36, b2.bravo, j5, arVar.alpha(), b2.charlie);
                int i67 = charlie - i29;
                int size9 = list2.size();
                int i68 = i28;
                while (i68 < size9) {
                    q0.ao aoVar9 = (q0.ao) list2.get(i68);
                    AbstractC2367C abstractC2367C8 = abstractC2367C3;
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.a.alpha(aoVar9), "Container")) {
                        if (i65 != Integer.MAX_VALUE) {
                            i37 = i65;
                        } else {
                            i37 = i28;
                        }
                        if (i67 != Integer.MAX_VALUE) {
                            i38 = i67;
                        } else {
                            i38 = i28;
                        }
                        AbstractC2367C victor2 = aoVar9.victor(Q0.b.alpha(i37, i65, i38, i67));
                        int i69 = i65;
                        AbstractC2367C abstractC2367C9 = abstractC2367C;
                        int i70 = charlie;
                        return arVar.papa(i69, i70, kotlin.collections.t.alpha, new A2(abstractC2367C5, i69, i70, victor, abstractC2367C6, abstractC2367C9, abstractC2367C2, abstractC2367C8, abstractC2367C4, victor2, abstractC2367C7, b2, i53, arVar));
                    }
                    AbstractC2367C abstractC2367C10 = abstractC2367C2;
                    i68++;
                    charlie = charlie;
                    abstractC2367C = abstractC2367C;
                    abstractC2367C2 = abstractC2367C10;
                    victor = victor;
                    b2 = this;
                    list2 = list;
                    abstractC2367C7 = abstractC2367C7;
                    i65 = i65;
                    abstractC2367C5 = abstractC2367C5;
                    abstractC2367C3 = abstractC2367C8;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i54 = i56 + 1;
            b2 = this;
            list2 = list;
            abstractC2367C3 = abstractC2367C3;
            india2 = india2;
            abstractC2367C2 = abstractC2367C2;
            size7 = i55;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // q0.ap
    public final int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return echo(list, i4, T.f1069o);
    }

    @Override // q0.ap
    public final int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        return charlie(interfaceC2402u, list, i4, T.f1068n);
    }
}
