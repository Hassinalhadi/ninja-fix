package com.google.mlkit.vision.barcode.internal;

import B0.a;
import G6.g;
import Y8.c;
import android.graphics.Point;
import androidx.appcompat.widget.i1;
import ao.d;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.common.sdkinternal.l;
import com.google.mlkit.common.sdkinternal.p;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.ZoomSuggestionOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import n7.AbstractC2162a;
import s6.A5;
import s6.C2682j;
import s6.C2718n;
import s6.C2762s;
import s6.C2780u;
import s6.D;
import s6.EnumC2822y5;
import s6.M5;
import s6.P7;
import s6.V4;
import s6.W7;
import s6.X7;
import s6.a8;
import s6.ad;
import s6.af;
import s6.aj;
import t6.ai;

/* loaded from: classes2.dex */
public final class zzh extends c implements BarcodeScanner, AutoCloseable {
    public static final /* synthetic */ int zzc = 0;
    private static final BarcodeScannerOptions zzd = new BarcodeScannerOptions.Builder().build();
    final a8 zzb;
    private final boolean zze;
    private final BarcodeScannerOptions zzf;
    private int zzg;
    private boolean zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r10v1, types: [s6.L5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, androidx.appcompat.widget.i1] */
    public zzh(BarcodeScannerOptions barcodeScannerOptions, zzl zzlVar, Executor executor, P7 p72, i iVar) {
        super(zzlVar, executor);
        a8 a8Var;
        EnumC2822y5 enumC2822y5;
        ZoomSuggestionOptions zzb = barcodeScannerOptions.zzb();
        if (zzb == null) {
            a8Var = null;
        } else {
            a8 a8Var2 = new a8(iVar.bravo(), W7.lima, iVar.bravo().getPackageName());
            zze zzeVar = new zze(zzb);
            D d4 = D.alpha;
            a8Var2.romeo = zzeVar;
            a8Var2.india = d4;
            if (zzb.zza() >= 1.0f) {
                float zza = zzb.zza();
                synchronized (a8Var2.charlie) {
                    try {
                        if (zza >= 1.0f) {
                            a8Var2.kilo = zza;
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } finally {
                    }
                }
            }
            a8Var2.delta();
            a8Var = a8Var2;
        }
        this.zzf = barcodeScannerOptions;
        boolean zzf = zzb.zzf();
        this.zze = zzf;
        ?? obj = new Object();
        obj.bravo = zzb.zzc(barcodeScannerOptions);
        M5 m5 = new M5(obj);
        ?? obj2 = new Object();
        if (zzf) {
            enumC2822y5 = EnumC2822y5.TYPE_THICK;
        } else {
            enumC2822y5 = EnumC2822y5.TYPE_THIN;
        }
        obj2.charlie = enumC2822y5;
        obj2.delta = m5;
        p.alpha.execute(new d(p72, new a((i1) obj2, 1), A5.ON_DEVICE_BARCODE_CREATE, p72.charlie(), 11, false));
        this.zzb = a8Var;
    }

    private final Task zzf(Task task, final int i4, final int i5) {
        return task.kilo(new g() { // from class: com.google.mlkit.vision.barcode.internal.zzf
            @Override // G6.g
            public final Task then(Object obj) {
                return zzh.this.zzd(i4, i5, (List) obj);
            }
        });
    }

    @Override // Y8.c, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            a8 a8Var = this.zzb;
            if (a8Var != null) {
                a8Var.echo(this.zzh);
                this.zzb.bravo();
            }
            super.close();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    public final int getDetectorType() {
        return 1;
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner, com.google.android.gms.common.api.l
    public final Feature[] getOptionalFeatures() {
        if (this.zze) {
            return l.alpha;
        }
        return new Feature[]{l.bravo};
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    public final Task process(AbstractC2162a abstractC2162a) {
        super.processBase(abstractC2162a);
        throw null;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:? -> B:121:0x0281). Please report as a decompilation issue!!! */
    public final Task zzd(int i4, int i5, List list) throws Exception {
        char c3;
        int i10;
        List list2;
        ArrayList arrayList;
        char c4;
        int i11;
        Object obj;
        Iterator it;
        Map.Entry entry;
        float f5;
        int i12 = 1;
        if (this.zzb == null) {
            return V4.echo(list);
        }
        this.zzg++;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            c3 = 65535;
            if (!it2.hasNext()) {
                break;
            }
            Barcode barcode = (Barcode) it2.next();
            if (barcode.getFormat() == -1) {
                arrayList3.add(barcode);
            } else {
                arrayList2.add(barcode);
            }
        }
        if (arrayList2.isEmpty()) {
            int size = arrayList3.size();
            int i13 = 0;
            while (i13 < size) {
                Point[] cornerPoints = ((Barcode) arrayList3.get(i13)).getCornerPoints();
                if (cornerPoints != null) {
                    a8 a8Var = this.zzb;
                    int i14 = this.zzg;
                    int i15 = i4;
                    int i16 = i5;
                    c4 = c3;
                    int i17 = 0;
                    int i18 = 0;
                    for (Point point : Arrays.asList(cornerPoints)) {
                        i15 = Math.min(i15, point.x);
                        i16 = Math.min(i16, point.y);
                        i18 = Math.max(i18, point.x);
                        i17 = Math.max(i17, point.y);
                    }
                    int i19 = 0;
                    float f10 = i15 + 0.0f;
                    float f11 = i4;
                    float f12 = i5;
                    float f13 = f10 / f11;
                    float f14 = (i16 + 0.0f) / f12;
                    float f15 = (i18 + 0.0f) / f11;
                    float f16 = (i17 + 0.0f) / f12;
                    X7 x72 = new X7(f13, f14, f15, f16);
                    Object obj2 = a8Var.charlie;
                    synchronized (obj2) {
                        try {
                            if (a8Var.quebec != 2) {
                                arrayList = arrayList2;
                            } else {
                                if (x72.bravo()) {
                                    W7 w72 = a8Var.alpha;
                                    if (!w72.delta || w72.echo <= 0.0f) {
                                        if (!a8Var.papa) {
                                            A5 a52 = A5.SCANNER_AUTO_ZOOM_FIRST_ATTEMPT;
                                            float f17 = a8Var.juliet;
                                            a8Var.foxtrot(a52, f17, f17, x72);
                                            a8Var.papa = true;
                                        }
                                        V5.g gVar = a8.sierra;
                                        Locale locale = Locale.getDefault();
                                        Float valueOf = Float.valueOf(f13);
                                        Float valueOf2 = Float.valueOf(f14);
                                        Float valueOf3 = Float.valueOf(f15);
                                        Float valueOf4 = Float.valueOf(f16);
                                        Float valueOf5 = Float.valueOf(0.0f);
                                        Integer valueOf6 = Integer.valueOf(i14);
                                        arrayList = arrayList2;
                                        gVar.alpha(String.format(locale, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6));
                                        a8Var.delta.delta(valueOf6, x72);
                                        Set bravo = a8Var.delta.bravo();
                                        int size2 = ((C2718n) bravo).alpha.size() - 1;
                                        a8Var.alpha.getClass();
                                        if (size2 > 10) {
                                            Iterator it3 = ((C2718n) bravo).iterator();
                                            int i20 = i14;
                                            while (it3.hasNext()) {
                                                int intValue = ((Integer) it3.next()).intValue();
                                                if (i20 > intValue) {
                                                    i20 = intValue;
                                                }
                                            }
                                            a8.sierra.alpha("Removing recent frameIndex = " + i20);
                                            C2780u c2780u = a8Var.delta;
                                            Collection collection = (Collection) c2780u.silver.remove(Integer.valueOf(i20));
                                            if (collection == null) {
                                                List list3 = Collections.EMPTY_LIST;
                                            } else {
                                                ArrayList arrayList4 = new ArrayList(3);
                                                arrayList4.addAll(collection);
                                                c2780u.teal -= collection.size();
                                                collection.clear();
                                                Collections.unmodifiableList(arrayList4);
                                            }
                                        }
                                        HashSet hashSet = new HashSet();
                                        C2780u c2780u2 = a8Var.delta;
                                        C2762s c2762s = c2780u2.alpha;
                                        if (c2762s == null) {
                                            c2762s = new C2762s(i19, c2780u2);
                                            c2780u2.alpha = c2762s;
                                        }
                                        Iterator it4 = c2762s.iterator();
                                        while (true) {
                                            C2682j c2682j = (C2682j) it4;
                                            if (!c2682j.hasNext()) {
                                                break;
                                            }
                                            Map.Entry entry2 = (Map.Entry) c2682j.next();
                                            if (((Integer) entry2.getKey()).intValue() != i14) {
                                                X7 x73 = (X7) entry2.getValue();
                                                if (!x73.bravo() || !x72.bravo()) {
                                                    it = it4;
                                                    entry = entry2;
                                                    f5 = 0.0f;
                                                } else {
                                                    it = it4;
                                                    entry = entry2;
                                                    X7 x74 = new X7(Math.max(x73.alpha, x72.alpha), Math.max(x73.bravo, x72.bravo), Math.min(x73.charlie, x72.charlie), Math.min(x73.delta, x72.delta));
                                                    f5 = x74.alpha() / ((x73.alpha() + x72.alpha()) - x74.alpha());
                                                }
                                                if (f5 >= a8Var.alpha.bravo) {
                                                    hashSet.add((Integer) entry.getKey());
                                                }
                                                it4 = it;
                                            }
                                        }
                                        int size3 = hashSet.size();
                                        W7 w73 = a8Var.alpha;
                                        try {
                                            if (size3 < w73.alpha && (!w73.delta || w73.foxtrot > 0.0f)) {
                                                obj = obj2;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                        synchronized (a8Var.charlie) {
                                            try {
                                                obj = obj2;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                throw th;
                                            }
                                            try {
                                                if (a8Var.alpha() >= a8Var.alpha.golf) {
                                                    Float valueOf7 = Float.valueOf(x72.alpha);
                                                    Float valueOf8 = Float.valueOf(x72.bravo);
                                                    Float valueOf9 = Float.valueOf(x72.charlie);
                                                    Float valueOf10 = Float.valueOf(x72.delta);
                                                    ad adVar = af.purple;
                                                    Object[] objArr = {valueOf7, valueOf8, valueOf9, valueOf10};
                                                    ai.alpha(4, objArr);
                                                    ad listIterator = new aj(4, objArr).listIterator(0);
                                                    float f18 = 1.0E9f;
                                                    while (listIterator.hasNext()) {
                                                        float max = (a8Var.alpha.charlie / 2.0f) / Math.max(Math.abs(((Float) listIterator.next()).floatValue() - 0.5f), 0.001f);
                                                        if (f18 > max) {
                                                            f18 = max;
                                                        }
                                                    }
                                                    float f19 = a8Var.juliet;
                                                    float f20 = f18 * f19;
                                                    float f21 = a8Var.kilo;
                                                    if (f20 < 1.0f) {
                                                        f20 = 1.0f;
                                                    }
                                                    if (f21 <= 0.0f || f20 <= f21) {
                                                        f21 = f20;
                                                    }
                                                    W7 w74 = a8Var.alpha;
                                                    if (w74.india) {
                                                        float f22 = (f21 - f19) / f19;
                                                        if (f22 <= w74.juliet && f22 >= (-w74.kilo)) {
                                                            a8.sierra.alpha("Auto zoom to " + f21 + " is filtered by threshold");
                                                            a8Var.lima = a8Var.foxtrot.alpha();
                                                        }
                                                    }
                                                    a8.sierra.alpha("Going to set zoom = " + f21);
                                                    a8Var.charlie(f21, A5.SCANNER_AUTO_ZOOM_AUTO_ZOOM, x72);
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                throw th;
                                            }
                                        }
                                    }
                                }
                                arrayList = arrayList2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj2;
                        }
                    }
                    i11 = 1;
                } else {
                    arrayList = arrayList2;
                    c4 = c3;
                    i11 = i12;
                }
                i13 += i11;
                i12 = i11;
                c3 = c4;
                arrayList2 = arrayList;
            }
            i10 = i12;
            list2 = arrayList2;
        } else {
            i10 = 1;
            list2 = arrayList2;
            this.zzh = true;
        }
        if (i10 == this.zzf.zzd()) {
            list2 = list;
        }
        return V4.echo(list2);
    }

    @Override // com.google.mlkit.vision.barcode.BarcodeScanner
    public final Task process(X8.a aVar) {
        return zzf(super.processBase(aVar), aVar.delta, aVar.echo);
    }
}
