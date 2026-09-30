package R;

import bv.al;
import bv.au;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2743p6;

/* loaded from: classes3.dex */
public final class h implements g {
    public final Function1 alpha;
    public final al purple;
    public al red;

    public h(Map map, Function1 function1) {
        al alVar;
        this.alpha = function1;
        if (map != null && !map.isEmpty()) {
            alVar = new al(map.size());
            for (Map.Entry entry : map.entrySet()) {
                alVar.mike(entry.getKey(), entry.getValue());
            }
        } else {
            alVar = null;
        }
        this.purple = alVar;
    }

    @Override // R.g
    public final boolean bravo(Object obj) {
        return ((Boolean) this.alpha.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    @Override // R.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map charlie() {
        int i4;
        int i5;
        long j5;
        char c3;
        long j6;
        long j7;
        al alVar;
        int i10;
        int i11;
        int i12;
        int i13;
        long j10;
        int i14 = 0;
        int i15 = 1;
        al alVar2 = this.purple;
        if (alVar2 == null && this.red == null) {
            return t.alpha;
        }
        if (alVar2 != null) {
            i4 = alVar2.echo;
        } else {
            i4 = 0;
        }
        al alVar3 = this.red;
        if (alVar3 != null) {
            i5 = alVar3.echo;
        } else {
            i5 = 0;
        }
        HashMap hashMap = new HashMap(i4 + i5);
        long j11 = -9187201950435737472L;
        int i16 = 8;
        if (alVar2 != null) {
            Object[] objArr = alVar2.bravo;
            Object[] objArr2 = alVar2.charlie;
            long[] jArr = alVar2.alpha;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i17 = 0;
                c3 = 7;
                j6 = 128;
                while (true) {
                    long j12 = jArr[i17];
                    j7 = 255;
                    if ((((~j12) << 7) & j12 & j11) != j11) {
                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j12 & 255) < 128) {
                                int i20 = (i17 << 3) + i19;
                                j10 = j11;
                                hashMap.put((String) objArr[i20], (List) objArr2[i20]);
                            } else {
                                j10 = j11;
                            }
                            j12 >>= 8;
                            i19++;
                            j11 = j10;
                        }
                        j5 = j11;
                        if (i18 != 8) {
                            break;
                        }
                    } else {
                        j5 = j11;
                    }
                    if (i17 == length) {
                        break;
                    }
                    i17++;
                    j11 = j5;
                }
                alVar = this.red;
                if (alVar != null) {
                    Object[] objArr3 = alVar.bravo;
                    Object[] objArr4 = alVar.charlie;
                    long[] jArr2 = alVar.alpha;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i21 = 0;
                        while (true) {
                            long j13 = jArr2[i21];
                            if ((((~j13) << c3) & j13 & j5) != j5) {
                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                int i23 = i14;
                                while (i23 < i22) {
                                    if ((j13 & j7) < j6) {
                                        int i24 = (i21 << 3) + i23;
                                        Object obj = objArr3[i24];
                                        List list = (List) objArr4[i24];
                                        String str = (String) obj;
                                        i13 = i16;
                                        if (list.size() == i15) {
                                            Object invoke = ((Function0) list.get(i14)).invoke();
                                            if (invoke != null) {
                                                if (bravo(invoke)) {
                                                    Object[] objArr5 = new Object[i15];
                                                    objArr5[i14] = invoke;
                                                    hashMap.put(str, CollectionsKt.azure(objArr5));
                                                } else {
                                                    throw new IllegalStateException(l.alpha(invoke).toString());
                                                }
                                            }
                                            i12 = i15;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            i12 = i15;
                                            int i25 = 0;
                                            while (i25 < size) {
                                                int i26 = i25;
                                                Object invoke2 = ((Function0) list.get(i25)).invoke();
                                                if (invoke2 != null && !bravo(invoke2)) {
                                                    throw new IllegalStateException(l.alpha(invoke2).toString());
                                                }
                                                arrayList.add(invoke2);
                                                i25 = i26 + 1;
                                            }
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        i12 = i15;
                                        i13 = i16;
                                    }
                                    j13 >>= i13;
                                    i23++;
                                    i16 = i13;
                                    i15 = i12;
                                    i14 = 0;
                                }
                                i10 = i15;
                                i11 = i16;
                                if (i22 != i11) {
                                    break;
                                }
                            } else {
                                i10 = i15;
                                i11 = i16;
                            }
                            if (i21 == length2) {
                                break;
                            }
                            i21++;
                            i16 = i11;
                            i15 = i10;
                            i14 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        j5 = -9187201950435737472L;
        c3 = 7;
        j6 = 128;
        j7 = 255;
        alVar = this.red;
        if (alVar != null) {
        }
        return hashMap;
    }

    @Override // R.g
    public final Object delta(String str) {
        List list;
        al alVar = this.purple;
        if (alVar != null) {
            list = (List) alVar.kilo(str);
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && alVar != null) {
            List subList = list.subList(1, list.size());
            int foxtrot = alVar.foxtrot(str);
            if (foxtrot < 0) {
                foxtrot = ~foxtrot;
            }
            Object[] objArr = alVar.charlie;
            Object obj = objArr[foxtrot];
            alVar.bravo[foxtrot] = str;
            objArr[foxtrot] = subList;
        }
        return list.get(0);
    }

    @Override // R.g
    public final f echo(String str, Function0 function0) {
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!AbstractC2743p6.delta(str.charAt(i4))) {
                al alVar = this.red;
                if (alVar == null) {
                    long[] jArr = au.alpha;
                    alVar = new al();
                    this.red = alVar;
                }
                Object golf = alVar.golf(str);
                if (golf == null) {
                    golf = new ArrayList();
                    alVar.mike(str, golf);
                }
                ((List) golf).add(function0);
                return new J2.t(alVar, str, function0);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
