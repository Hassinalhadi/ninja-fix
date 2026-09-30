package A2;

import android.util.Log;
import ge.InterfaceC1772d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m2.AbstractC2096a;

/* loaded from: classes3.dex */
public final class h {
    public final LinkedHashMap alpha;

    public h(X2.l lVar) {
        this.alpha = kotlin.collections.y.amber(lVar.alpha);
    }

    public void alpha(AbstractC2096a... migrations) {
        Intrinsics.echo(migrations, "migrations");
        for (AbstractC2096a abstractC2096a : migrations) {
            int i4 = abstractC2096a.alpha;
            LinkedHashMap linkedHashMap = this.alpha;
            Integer valueOf = Integer.valueOf(i4);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                linkedHashMap.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i5 = abstractC2096a.bravo;
            if (treeMap.containsKey(Integer.valueOf(i5))) {
                Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i5)) + " with " + abstractC2096a);
            }
            treeMap.put(Integer.valueOf(i5), abstractC2096a);
        }
    }

    public void bravo(HashMap values) {
        boolean areEqual;
        boolean areEqual2;
        boolean areEqual3;
        boolean areEqual4;
        boolean areEqual5;
        boolean areEqual6;
        boolean areEqual7;
        boolean areEqual8;
        boolean areEqual9;
        boolean areEqual10;
        boolean areEqual11;
        boolean areEqual12;
        boolean areEqual13;
        Object[] objArr;
        Intrinsics.echo(values, "values");
        for (Map.Entry entry : values.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            Intrinsics.echo(key, "key");
            LinkedHashMap linkedHashMap = this.alpha;
            if (value == null) {
                value = null;
            } else {
                Class<?> cls = value.getClass();
                kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
                InterfaceC1772d bravo = vVar.bravo(cls);
                if (Intrinsics.areEqual(bravo, vVar.bravo(Boolean.TYPE))) {
                    areEqual = true;
                } else {
                    areEqual = Intrinsics.areEqual(bravo, vVar.bravo(Byte.TYPE));
                }
                if (areEqual) {
                    areEqual2 = true;
                } else {
                    areEqual2 = Intrinsics.areEqual(bravo, vVar.bravo(Integer.TYPE));
                }
                if (areEqual2) {
                    areEqual3 = true;
                } else {
                    areEqual3 = Intrinsics.areEqual(bravo, vVar.bravo(Long.TYPE));
                }
                if (areEqual3) {
                    areEqual4 = true;
                } else {
                    areEqual4 = Intrinsics.areEqual(bravo, vVar.bravo(Float.TYPE));
                }
                if (areEqual4) {
                    areEqual5 = true;
                } else {
                    areEqual5 = Intrinsics.areEqual(bravo, vVar.bravo(Double.TYPE));
                }
                if (areEqual5) {
                    areEqual6 = true;
                } else {
                    areEqual6 = Intrinsics.areEqual(bravo, vVar.bravo(String.class));
                }
                if (areEqual6) {
                    areEqual7 = true;
                } else {
                    areEqual7 = Intrinsics.areEqual(bravo, vVar.bravo(Boolean[].class));
                }
                if (areEqual7) {
                    areEqual8 = true;
                } else {
                    areEqual8 = Intrinsics.areEqual(bravo, vVar.bravo(Byte[].class));
                }
                if (areEqual8) {
                    areEqual9 = true;
                } else {
                    areEqual9 = Intrinsics.areEqual(bravo, vVar.bravo(Integer[].class));
                }
                if (areEqual9) {
                    areEqual10 = true;
                } else {
                    areEqual10 = Intrinsics.areEqual(bravo, vVar.bravo(Long[].class));
                }
                if (areEqual10) {
                    areEqual11 = true;
                } else {
                    areEqual11 = Intrinsics.areEqual(bravo, vVar.bravo(Float[].class));
                }
                if (areEqual11) {
                    areEqual12 = true;
                } else {
                    areEqual12 = Intrinsics.areEqual(bravo, vVar.bravo(Double[].class));
                }
                if (areEqual12) {
                    areEqual13 = true;
                } else {
                    areEqual13 = Intrinsics.areEqual(bravo, vVar.bravo(String[].class));
                }
                if (areEqual13) {
                    continue;
                } else {
                    int i4 = 0;
                    if (Intrinsics.areEqual(bravo, vVar.bravo(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str = k.alpha;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i4 < length) {
                            objArr[i4] = Boolean.valueOf(zArr[i4]);
                            i4++;
                        }
                    } else if (Intrinsics.areEqual(bravo, vVar.bravo(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str2 = k.alpha;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i4 < length2) {
                            objArr[i4] = Byte.valueOf(bArr[i4]);
                            i4++;
                        }
                    } else if (Intrinsics.areEqual(bravo, vVar.bravo(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str3 = k.alpha;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i4 < length3) {
                            objArr[i4] = Integer.valueOf(iArr[i4]);
                            i4++;
                        }
                    } else if (Intrinsics.areEqual(bravo, vVar.bravo(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str4 = k.alpha;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i4 < length4) {
                            objArr[i4] = Long.valueOf(jArr[i4]);
                            i4++;
                        }
                    } else if (Intrinsics.areEqual(bravo, vVar.bravo(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str5 = k.alpha;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i4 < length5) {
                            objArr[i4] = Float.valueOf(fArr[i4]);
                            i4++;
                        }
                    } else if (Intrinsics.areEqual(bravo, vVar.bravo(double[].class))) {
                        double[] dArr = (double[]) value;
                        String str6 = k.alpha;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i4 < length6) {
                            objArr[i4] = Double.valueOf(dArr[i4]);
                            i4++;
                        }
                    } else {
                        throw new IllegalArgumentException("Key " + key + " has invalid type " + bravo);
                    }
                    value = objArr;
                }
            }
            linkedHashMap.put(key, value);
        }
    }

    public B2.l charlie(J2.j id2) {
        Intrinsics.echo(id2, "id");
        return (B2.l) this.alpha.remove(id2);
    }

    public List delta(String workSpecId) {
        Intrinsics.echo(workSpecId, "workSpecId");
        LinkedHashMap linkedHashMap = this.alpha;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (Intrinsics.areEqual(((J2.j) entry.getKey()).alpha, workSpecId)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((J2.j) it.next());
        }
        return CollectionsKt.z(linkedHashMap2.values());
    }

    public B2.l echo(J2.j jVar) {
        LinkedHashMap linkedHashMap = this.alpha;
        Object obj = linkedHashMap.get(jVar);
        if (obj == null) {
            obj = new B2.l(jVar);
            linkedHashMap.put(jVar, obj);
        }
        return (B2.l) obj;
    }

    public h(int i4) {
        switch (i4) {
            case 1:
                this.alpha = new LinkedHashMap();
                return;
            case 2:
            default:
                this.alpha = new LinkedHashMap();
                return;
            case 3:
                this.alpha = new LinkedHashMap();
                return;
        }
    }
}
