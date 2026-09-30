package M;

import androidx.compose.runtime.J;
import fe.C1713e;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2725n6;
import s6.J4;

/* loaded from: classes3.dex */
public final class m {
    public static final m echo = new m(0, 0, new Object[0], null);
    public int alpha;
    public int bravo;
    public final O.b charlie;
    public Object[] delta;

    public m(int i4, int i5, Object[] objArr, O.b bVar) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = bVar;
        this.delta = objArr;
    }

    public static m juliet(int i4, Object obj, Object obj2, int i5, Object obj3, Object obj4, int i10, O.b bVar) {
        Object[] objArr;
        if (i10 > 30) {
            return new m(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int delta = AbstractC2725n6.delta(i4, i10);
        int delta2 = AbstractC2725n6.delta(i5, i10);
        if (delta != delta2) {
            if (delta < delta2) {
                objArr = new Object[]{obj, obj2, obj3, obj4};
            } else {
                objArr = new Object[]{obj3, obj4, obj, obj2};
            }
            return new m((1 << delta) | (1 << delta2), 0, objArr, bVar);
        }
        return new m(0, 1 << delta, new Object[]{juliet(i4, obj, obj2, i5, obj3, obj4, i10 + 5, bVar)}, bVar);
    }

    public final Object[] alpha(int i4, int i5, int i10, Object obj, Object obj2, int i11, O.b bVar) {
        int i12;
        Object obj3 = this.delta[i4];
        if (obj3 != null) {
            i12 = obj3.hashCode();
        } else {
            i12 = 0;
        }
        m juliet = juliet(i12, obj3, xray(i4), i10, obj, obj2, i11 + 5, bVar);
        int tango = tango(i5);
        int i13 = tango + 1;
        Object[] objArr = this.delta;
        Object[] objArr2 = new Object[objArr.length - 1];
        ArraysKt.beige(0, i4, 6, objArr, objArr2);
        ArraysKt.yankee(i4, i4 + 2, i13, objArr, objArr2);
        objArr2[tango - 1] = juliet;
        ArraysKt.yankee(tango, i13, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int bravo() {
        if (this.bravo == 0) {
            return this.delta.length / 2;
        }
        int bitCount = Integer.bitCount(this.alpha);
        int length = this.delta.length;
        for (int i4 = bitCount * 2; i4 < length; i4++) {
            bitCount += sierra(i4).bravo();
        }
        return bitCount;
    }

    public final boolean charlie(Object obj) {
        C1713e golf = J4.golf(J4.hotel(0, this.delta.length), 2);
        int i4 = golf.alpha;
        int i5 = golf.purple;
        int i10 = golf.red;
        if ((i10 > 0 && i4 <= i5) || (i10 < 0 && i5 <= i4)) {
            while (!Intrinsics.areEqual(obj, this.delta[i4])) {
                if (i4 != i5) {
                    i4 += i10;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean delta(int i4, int i5, Object obj) {
        int delta = 1 << AbstractC2725n6.delta(i4, i5);
        if (hotel(delta)) {
            return Intrinsics.areEqual(obj, this.delta[foxtrot(delta)]);
        }
        if (india(delta)) {
            m sierra = sierra(tango(delta));
            if (i5 == 30) {
                return sierra.charlie(obj);
            }
            return sierra.delta(i4, i5 + 5, obj);
        }
        return false;
    }

    public final boolean echo(m mVar) {
        if (this == mVar) {
            return true;
        }
        if (this.bravo != mVar.bravo || this.alpha != mVar.alpha) {
            return false;
        }
        int length = this.delta.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (this.delta[i4] != mVar.delta[i4]) {
                return false;
            }
        }
        return true;
    }

    public final int foxtrot(int i4) {
        return Integer.bitCount((i4 - 1) & this.alpha) * 2;
    }

    public final Object golf(int i4, int i5, Object obj) {
        int delta = 1 << AbstractC2725n6.delta(i4, i5);
        if (hotel(delta)) {
            int foxtrot = foxtrot(delta);
            if (Intrinsics.areEqual(obj, this.delta[foxtrot])) {
                return xray(foxtrot);
            }
            return null;
        }
        if (india(delta)) {
            m sierra = sierra(tango(delta));
            if (i5 == 30) {
                C1713e golf = J4.golf(J4.hotel(0, sierra.delta.length), 2);
                int i10 = golf.alpha;
                int i11 = golf.purple;
                int i12 = golf.red;
                if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                    while (!Intrinsics.areEqual(obj, sierra.delta[i10])) {
                        if (i10 != i11) {
                            i10 += i12;
                        } else {
                            return null;
                        }
                    }
                    return sierra.xray(i10);
                }
                return null;
            }
            return sierra.golf(i4, i5 + 5, obj);
        }
        return null;
    }

    public final boolean hotel(int i4) {
        if ((i4 & this.alpha) != 0) {
            return true;
        }
        return false;
    }

    public final boolean india(int i4) {
        if ((i4 & this.bravo) != 0) {
            return true;
        }
        return false;
    }

    public final m kilo(int i4, e eVar) {
        eVar.bravo(eVar.size() - 1);
        eVar.silver = xray(i4);
        Object[] objArr = this.delta;
        if (objArr.length == 2) {
            return null;
        }
        if (this.charlie == eVar.purple) {
            this.delta = AbstractC2725n6.bravo(i4, objArr);
            return this;
        }
        return new m(0, 0, AbstractC2725n6.bravo(i4, objArr), eVar.purple);
    }

    public final m lima(int i4, Object obj, Object obj2, int i5, e eVar) {
        e eVar2;
        m lima;
        int delta = 1 << AbstractC2725n6.delta(i4, i5);
        boolean hotel = hotel(delta);
        O.b bVar = this.charlie;
        if (hotel) {
            int foxtrot = foxtrot(delta);
            if (Intrinsics.areEqual(obj, this.delta[foxtrot])) {
                eVar.silver = xray(foxtrot);
                if (xray(foxtrot) == obj2) {
                    return this;
                }
                if (bVar == eVar.purple) {
                    this.delta[foxtrot + 1] = obj2;
                    return this;
                }
                eVar.teal++;
                Object[] objArr = this.delta;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                Intrinsics.delta(copyOf, "copyOf(...)");
                copyOf[foxtrot + 1] = obj2;
                return new m(this.alpha, this.bravo, copyOf, eVar.purple);
            }
            eVar.bravo(eVar.size() + 1);
            O.b bVar2 = eVar.purple;
            if (bVar == bVar2) {
                this.delta = alpha(foxtrot, delta, i4, obj, obj2, i5, bVar2);
                this.alpha ^= delta;
                this.bravo |= delta;
                return this;
            }
            return new m(this.alpha ^ delta, this.bravo | delta, alpha(foxtrot, delta, i4, obj, obj2, i5, bVar2), bVar2);
        }
        if (india(delta)) {
            int tango = tango(delta);
            m sierra = sierra(tango);
            if (i5 == 30) {
                C1713e golf = J4.golf(J4.hotel(0, sierra.delta.length), 2);
                int i10 = golf.alpha;
                int i11 = golf.purple;
                int i12 = golf.red;
                if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                    while (!Intrinsics.areEqual(obj, sierra.delta[i10])) {
                        if (i10 != i11) {
                            i10 += i12;
                        }
                    }
                    eVar.silver = sierra.xray(i10);
                    if (sierra.charlie == eVar.purple) {
                        sierra.delta[i10 + 1] = obj2;
                        lima = sierra;
                    } else {
                        eVar.teal++;
                        Object[] objArr2 = sierra.delta;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        Intrinsics.delta(copyOf2, "copyOf(...)");
                        copyOf2[i10 + 1] = obj2;
                        lima = new m(0, 0, copyOf2, eVar.purple);
                    }
                    eVar2 = eVar;
                }
                eVar.bravo(eVar.size() + 1);
                lima = new m(0, 0, AbstractC2725n6.alpha(sierra.delta, 0, obj, obj2), eVar.purple);
                eVar2 = eVar;
            } else {
                eVar2 = eVar;
                lima = sierra.lima(i4, obj, obj2, i5 + 5, eVar2);
            }
            if (sierra == lima) {
                return this;
            }
            return romeo(tango, lima, eVar2.purple);
        }
        eVar.bravo(eVar.size() + 1);
        O.b bVar3 = eVar.purple;
        int foxtrot2 = foxtrot(delta);
        if (bVar == bVar3) {
            this.delta = AbstractC2725n6.alpha(this.delta, foxtrot2, obj, obj2);
            this.alpha |= delta;
            return this;
        }
        return new m(this.alpha | delta, this.bravo, AbstractC2725n6.alpha(this.delta, foxtrot2, obj, obj2), bVar3);
    }

    public final m mike(m mVar, int i4, O.a aVar, e eVar) {
        m mVar2;
        Object[] objArr;
        int i5;
        int i10;
        m juliet;
        int i11;
        int i12;
        int i13;
        e eVar2 = eVar;
        if (this == mVar) {
            aVar.alpha += bravo();
            return this;
        }
        int i14 = 0;
        if (i4 > 30) {
            O.b bVar = eVar2.purple;
            int i15 = mVar.bravo;
            Object[] objArr2 = this.delta;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + mVar.delta.length);
            Intrinsics.delta(copyOf, "copyOf(...)");
            int length = this.delta.length;
            C1713e golf = J4.golf(J4.hotel(0, mVar.delta.length), 2);
            int i16 = golf.alpha;
            int i17 = golf.purple;
            int i18 = golf.red;
            if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                while (true) {
                    if (!charlie(mVar.delta[i16])) {
                        Object[] objArr3 = mVar.delta;
                        copyOf[length] = objArr3[i16];
                        copyOf[length + 1] = objArr3[i16 + 1];
                        length += 2;
                    } else {
                        aVar.alpha++;
                    }
                    if (i16 == i17) {
                        break;
                    }
                    i16 += i18;
                }
            }
            if (length != this.delta.length) {
                if (length == mVar.delta.length) {
                    return mVar;
                }
                if (length == copyOf.length) {
                    return new m(0, 0, copyOf, bVar);
                }
                Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                Intrinsics.delta(copyOf2, "copyOf(...)");
                return new m(0, 0, copyOf2, bVar);
            }
        } else {
            int i19 = this.bravo | mVar.bravo;
            int i20 = this.alpha;
            int i21 = mVar.alpha;
            int i22 = (i20 ^ i21) & (~i19);
            int i23 = i20 & i21;
            int i24 = i22;
            while (i23 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i23);
                if (Intrinsics.areEqual(this.delta[foxtrot(lowestOneBit)], mVar.delta[mVar.foxtrot(lowestOneBit)])) {
                    i24 |= lowestOneBit;
                } else {
                    i19 |= lowestOneBit;
                }
                i23 ^= lowestOneBit;
            }
            if ((i19 & i24) != 0) {
                J.bravo("Check failed.");
            }
            if (Intrinsics.areEqual(this.charlie, eVar2.purple) && this.alpha == i24 && this.bravo == i19) {
                mVar2 = this;
            } else {
                mVar2 = new m(i24, i19, new Object[Integer.bitCount(i19) + (Integer.bitCount(i24) * 2)], null);
            }
            int i25 = i19;
            int i26 = 0;
            while (i25 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i25);
                Object[] objArr4 = mVar2.delta;
                int length2 = (objArr4.length - 1) - i26;
                if (india(lowestOneBit2)) {
                    juliet = sierra(tango(lowestOneBit2));
                    if (mVar.india(lowestOneBit2)) {
                        juliet = juliet.mike(mVar.sierra(mVar.tango(lowestOneBit2)), i4 + 5, aVar, eVar2);
                        objArr = objArr4;
                    } else {
                        if (mVar.hotel(lowestOneBit2)) {
                            int foxtrot = mVar.foxtrot(lowestOneBit2);
                            Object obj = mVar.delta[foxtrot];
                            Object xray = mVar.xray(foxtrot);
                            int size = eVar2.size();
                            if (obj != null) {
                                i13 = obj.hashCode();
                            } else {
                                i13 = i14;
                            }
                            int i27 = i13;
                            objArr = objArr4;
                            juliet = juliet.lima(i27, obj, xray, i4 + 5, eVar2);
                            if (eVar.size() == size) {
                                aVar.alpha++;
                            }
                        } else {
                            objArr = objArr4;
                        }
                        eVar2 = eVar;
                    }
                } else {
                    objArr = objArr4;
                    if (mVar.india(lowestOneBit2)) {
                        m sierra = mVar.sierra(mVar.tango(lowestOneBit2));
                        if (hotel(lowestOneBit2)) {
                            int foxtrot2 = foxtrot(lowestOneBit2);
                            Object obj2 = this.delta[foxtrot2];
                            if (obj2 != null) {
                                i11 = obj2.hashCode();
                            } else {
                                i11 = 0;
                            }
                            int i28 = i4 + 5;
                            if (sierra.delta(i11, i28, obj2)) {
                                aVar.alpha++;
                            } else {
                                Object xray2 = xray(foxtrot2);
                                if (obj2 != null) {
                                    i12 = obj2.hashCode();
                                } else {
                                    i12 = 0;
                                }
                                eVar2 = eVar;
                                juliet = sierra.lima(i12, obj2, xray2, i28, eVar2);
                            }
                        }
                        eVar2 = eVar;
                        juliet = sierra;
                    } else {
                        eVar2 = eVar;
                        int foxtrot3 = foxtrot(lowestOneBit2);
                        Object obj3 = this.delta[foxtrot3];
                        Object xray3 = xray(foxtrot3);
                        int foxtrot4 = mVar.foxtrot(lowestOneBit2);
                        Object obj4 = mVar.delta[foxtrot4];
                        Object xray4 = mVar.xray(foxtrot4);
                        if (obj3 != null) {
                            i5 = obj3.hashCode();
                        } else {
                            i5 = 0;
                        }
                        if (obj4 != null) {
                            i10 = obj4.hashCode();
                        } else {
                            i10 = 0;
                        }
                        juliet = juliet(i5, obj3, xray3, i10, obj4, xray4, i4 + 5, eVar2.purple);
                    }
                }
                objArr[length2] = juliet;
                i26++;
                i25 ^= lowestOneBit2;
                i14 = 0;
            }
            int i29 = 0;
            while (i24 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i24);
                int i30 = i29 * 2;
                if (!mVar.hotel(lowestOneBit3)) {
                    int foxtrot5 = foxtrot(lowestOneBit3);
                    Object[] objArr5 = mVar2.delta;
                    objArr5[i30] = this.delta[foxtrot5];
                    objArr5[i30 + 1] = xray(foxtrot5);
                } else {
                    int foxtrot6 = mVar.foxtrot(lowestOneBit3);
                    Object[] objArr6 = mVar2.delta;
                    objArr6[i30] = mVar.delta[foxtrot6];
                    objArr6[i30 + 1] = mVar.xray(foxtrot6);
                    if (hotel(lowestOneBit3)) {
                        aVar.alpha++;
                    }
                }
                i29++;
                i24 ^= lowestOneBit3;
            }
            if (!echo(mVar2)) {
                if (mVar.echo(mVar2)) {
                    return mVar;
                }
                return mVar2;
            }
        }
        return this;
    }

    public final m november(int i4, Object obj, int i5, e eVar) {
        m november;
        int delta = 1 << AbstractC2725n6.delta(i4, i5);
        if (hotel(delta)) {
            int foxtrot = foxtrot(delta);
            if (Intrinsics.areEqual(obj, this.delta[foxtrot])) {
                return papa(foxtrot, delta, eVar);
            }
        } else if (india(delta)) {
            int tango = tango(delta);
            m sierra = sierra(tango);
            if (i5 == 30) {
                C1713e golf = J4.golf(J4.hotel(0, sierra.delta.length), 2);
                int i10 = golf.alpha;
                int i11 = golf.purple;
                int i12 = golf.red;
                if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                    while (!Intrinsics.areEqual(obj, sierra.delta[i10])) {
                        if (i10 != i11) {
                            i10 += i12;
                        }
                    }
                    november = sierra.kilo(i10, eVar);
                }
                november = sierra;
                break;
            }
            november = sierra.november(i4, obj, i5 + 5, eVar);
            return quebec(sierra, november, tango, delta, eVar.purple);
        }
        return this;
    }

    public final m oscar(int i4, Object obj, Object obj2, int i5, e eVar) {
        m mVar;
        m oscar;
        int delta = 1 << AbstractC2725n6.delta(i4, i5);
        if (hotel(delta)) {
            int foxtrot = foxtrot(delta);
            if (Intrinsics.areEqual(obj, this.delta[foxtrot]) && Intrinsics.areEqual(obj2, xray(foxtrot))) {
                return papa(foxtrot, delta, eVar);
            }
        } else if (india(delta)) {
            int tango = tango(delta);
            m sierra = sierra(tango);
            if (i5 == 30) {
                C1713e golf = J4.golf(J4.hotel(0, sierra.delta.length), 2);
                int i10 = golf.alpha;
                int i11 = golf.purple;
                int i12 = golf.red;
                if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                    while (true) {
                        if (Intrinsics.areEqual(obj, sierra.delta[i10]) && Intrinsics.areEqual(obj2, sierra.xray(i10))) {
                            oscar = sierra.kilo(i10, eVar);
                            break;
                        }
                        if (i10 == i11) {
                            break;
                        }
                        i10 += i12;
                    }
                    mVar = sierra;
                }
                oscar = sierra;
                mVar = sierra;
            } else {
                mVar = sierra;
                oscar = mVar.oscar(i4, obj, obj2, i5 + 5, eVar);
            }
            return quebec(mVar, oscar, tango, delta, eVar.purple);
        }
        return this;
    }

    public final m papa(int i4, int i5, e eVar) {
        eVar.bravo(eVar.size() - 1);
        eVar.silver = xray(i4);
        Object[] objArr = this.delta;
        if (objArr.length == 2) {
            return null;
        }
        if (this.charlie == eVar.purple) {
            this.delta = AbstractC2725n6.bravo(i4, objArr);
            this.alpha ^= i5;
            return this;
        }
        return new m(i5 ^ this.alpha, this.bravo, AbstractC2725n6.bravo(i4, objArr), eVar.purple);
    }

    public final m quebec(m mVar, m mVar2, int i4, int i5, O.b bVar) {
        O.b bVar2 = this.charlie;
        if (mVar2 == null) {
            Object[] objArr = this.delta;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 == bVar) {
                this.delta = AbstractC2725n6.charlie(i4, objArr);
                this.bravo ^= i5;
                return this;
            }
            return new m(this.alpha, i5 ^ this.bravo, AbstractC2725n6.charlie(i4, objArr), bVar);
        }
        if (bVar2 != bVar && mVar == mVar2) {
            return this;
        }
        return romeo(i4, mVar2, bVar);
    }

    public final m romeo(int i4, m mVar, O.b bVar) {
        Object[] objArr = this.delta;
        if (objArr.length == 1 && mVar.delta.length == 2 && mVar.bravo == 0) {
            mVar.alpha = this.bravo;
            return mVar;
        }
        if (this.charlie == bVar) {
            objArr[i4] = mVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.delta(copyOf, "copyOf(...)");
        copyOf[i4] = mVar;
        return new m(this.alpha, this.bravo, copyOf, bVar);
    }

    public final m sierra(int i4) {
        Object obj = this.delta[i4];
        Intrinsics.charlie(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (m) obj;
    }

    public final int tango(int i4) {
        return (this.delta.length - 1) - Integer.bitCount((i4 - 1) & this.bravo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e1, code lost:
    
        r14.red = whiskey(r12, r4, (M.m) r14.red);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if (r14 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Fe.c uniform(int i4, int i5, Object obj, Object obj2) {
        Fe.c uniform;
        int i10 = 1;
        int delta = 1 << AbstractC2725n6.delta(i4, i5);
        int i11 = 0;
        if (hotel(delta)) {
            int foxtrot = foxtrot(delta);
            if (Intrinsics.areEqual(obj, this.delta[foxtrot])) {
                if (xray(foxtrot) != obj2) {
                    Object[] objArr = this.delta;
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.delta(copyOf, "copyOf(...)");
                    copyOf[foxtrot + 1] = obj2;
                    return new Fe.c(new m(this.alpha, this.bravo, copyOf, null), i11, 1);
                }
            } else {
                return new Fe.c(new m(this.alpha ^ delta, this.bravo | delta, alpha(foxtrot, delta, i4, obj, obj2, i5, null), null), i10, 1);
            }
        } else if (india(delta)) {
            int tango = tango(delta);
            m sierra = sierra(tango);
            if (i5 == 30) {
                C1713e golf = J4.golf(J4.hotel(0, sierra.delta.length), 2);
                int i12 = golf.alpha;
                int i13 = golf.purple;
                int i14 = golf.red;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (!Intrinsics.areEqual(obj, sierra.delta[i12])) {
                        if (i12 != i13) {
                            i12 += i14;
                        }
                    }
                    if (obj2 == sierra.xray(i12)) {
                        uniform = null;
                    } else {
                        Object[] objArr2 = sierra.delta;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        Intrinsics.delta(copyOf2, "copyOf(...)");
                        copyOf2[i12 + 1] = obj2;
                        uniform = new Fe.c(new m(0, 0, copyOf2, null), i11, 1);
                    }
                }
                uniform = new Fe.c(new m(0, 0, AbstractC2725n6.alpha(sierra.delta, 0, obj, obj2), null), i10, 1);
                break;
            }
            uniform = sierra.uniform(i4, i5 + 5, obj, obj2);
        } else {
            return new Fe.c(new m(this.alpha | delta, this.bravo, AbstractC2725n6.alpha(this.delta, foxtrot(delta), obj, obj2), null), i10, 1);
        }
        return null;
    }

    public final m victor(int i4, int i5, Object obj) {
        m victor;
        int delta = 1 << AbstractC2725n6.delta(i4, i5);
        if (hotel(delta)) {
            int foxtrot = foxtrot(delta);
            if (Intrinsics.areEqual(obj, this.delta[foxtrot])) {
                Object[] objArr = this.delta;
                if (objArr.length != 2) {
                    return new m(this.alpha ^ delta, this.bravo, AbstractC2725n6.bravo(foxtrot, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (india(delta)) {
            int tango = tango(delta);
            m sierra = sierra(tango);
            if (i5 == 30) {
                C1713e golf = J4.golf(J4.hotel(0, sierra.delta.length), 2);
                int i10 = golf.alpha;
                int i11 = golf.purple;
                int i12 = golf.red;
                if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                    while (!Intrinsics.areEqual(obj, sierra.delta[i10])) {
                        if (i10 != i11) {
                            i10 += i12;
                        }
                    }
                    Object[] objArr2 = sierra.delta;
                    if (objArr2.length == 2) {
                        victor = null;
                    } else {
                        victor = new m(0, 0, AbstractC2725n6.bravo(i10, objArr2), null);
                    }
                }
                victor = sierra;
                break;
            }
            victor = sierra.victor(i4, i5 + 5, obj);
            if (victor == null) {
                Object[] objArr3 = this.delta;
                if (objArr3.length != 1) {
                    return new m(this.alpha, delta ^ this.bravo, AbstractC2725n6.charlie(tango, objArr3), null);
                }
                return null;
            }
            if (sierra != victor) {
                return whiskey(tango, delta, victor);
            }
        }
        return this;
    }

    public final m whiskey(int i4, int i5, m mVar) {
        Object[] objArr = mVar.delta;
        if (objArr.length == 2 && mVar.bravo == 0) {
            if (this.delta.length == 1) {
                mVar.alpha = this.bravo;
                return mVar;
            }
            int foxtrot = foxtrot(i5);
            Object[] objArr2 = this.delta;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            Intrinsics.delta(copyOf, "copyOf(...)");
            ArraysKt.yankee(i4 + 2, i4 + 1, objArr2.length, copyOf, copyOf);
            ArraysKt.yankee(foxtrot + 2, foxtrot, i4, copyOf, copyOf);
            copyOf[foxtrot] = obj;
            copyOf[foxtrot + 1] = obj2;
            return new m(this.alpha ^ i5, i5 ^ this.bravo, copyOf, null);
        }
        Object[] objArr3 = this.delta;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        Intrinsics.delta(copyOf2, "copyOf(...)");
        copyOf2[i4] = mVar;
        return new m(this.alpha, this.bravo, copyOf2, null);
    }

    public final Object xray(int i4) {
        return this.delta[i4 + 1];
    }
}
