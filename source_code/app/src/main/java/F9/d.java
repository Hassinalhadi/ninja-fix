package F9;

import Xd.l;
import android.content.Context;
import android.util.Log;
import av.q;
import com.zendesk.service.HttpConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import s6.G5;
import vf.ab;
import vf.ad;
import vf.ao;

/* loaded from: classes2.dex */
public final class d extends Pd.i implements l {
    public final /* synthetic */ File A;
    public String alpha;
    public List purple;
    public Iterator red;

    /* renamed from: s, reason: collision with root package name */
    public int f1279s;
    public long silver;

    /* renamed from: t, reason: collision with root package name */
    public int f1280t;
    public long teal;

    /* renamed from: u, reason: collision with root package name */
    public int f1281u;

    /* renamed from: v, reason: collision with root package name */
    public int f1282v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1283w;
    public long white;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ File f1284x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f1285y;
    public int yellow;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Context f1286z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(File file, f fVar, Context context, File file2, Nd.c cVar) {
        super(2, cVar);
        this.f1284x = file;
        this.f1285y = fVar;
        this.f1286z = context;
        this.A = file2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        Context context = this.f1286z;
        File file = this.A;
        d dVar = new d(this.f1284x, this.f1285y, context, file, cVar);
        dVar.f1283w = obj;
        return dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0278  */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0456 -> B:8:0x0462). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i4;
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        Context context;
        File file;
        Od.a aVar;
        f fVar;
        Object charlie;
        String str4;
        long j5;
        long j6;
        long j7;
        File file2;
        String str5;
        String str6;
        Object charlie2;
        long j10;
        long j11;
        int i5;
        File file3;
        File file4;
        Context context2;
        f fVar2;
        Object charlie3;
        String str7;
        long j12;
        long j13;
        long j14;
        File file5;
        f fVar3;
        Iterator it;
        String str8;
        List list;
        int i10;
        long j15;
        long j16;
        ab abVar = (ab) this.f1283w;
        Od.a aVar2 = Od.a.alpha;
        int i11 = this.f1282v;
        File file6 = this.A;
        File file7 = this.f1284x;
        Context context3 = this.f1286z;
        f fVar4 = this.f1285y;
        Context context4 = context3;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            int i12 = this.f1281u;
                            int i13 = this.f1280t;
                            int i14 = this.f1279s;
                            int i15 = this.yellow;
                            long j17 = this.white;
                            long j18 = this.teal;
                            fVar3 = fVar4;
                            long j19 = this.silver;
                            Iterator it2 = this.red;
                            list = this.purple;
                            Iterator it3 = it2;
                            String str9 = this.alpha;
                            ResultKt.alpha(obj);
                            File file8 = file7;
                            String str10 = "sourceFile";
                            int i16 = i13;
                            int i17 = i14;
                            long j20 = j17;
                            int i18 = i12;
                            j12 = j19;
                            String str11 = "operationType";
                            str8 = str9;
                            Object blue = obj;
                            aVar = aVar2;
                            j15 = j18;
                            File file9 = (File) blue;
                            if (file9 == null) {
                                Intrinsics.echo(file8, str10);
                                Intrinsics.echo(str8, str11);
                                list.add(new I9.a(i18, j20, 1080, i17, i16, true, new Long(file9.length()), null, null, 3968));
                                return file9;
                            }
                            list.add(new I9.a(i18, j20, 1080, i17, i16, false, null, "Salvage compression returned null", null, 3520));
                            file4 = file8;
                            str6 = str10;
                            i10 = i15;
                            str5 = str11;
                            it = it3;
                            j16 = j20;
                            i4 = 4;
                            if (!it.hasNext()) {
                                str10 = str6;
                                int i19 = i10 + 1;
                                file8 = file4;
                                Pair pair = (Pair) it.next();
                                ad.oscar(abVar.charlie());
                                Od.a aVar3 = aVar;
                                int intValue = ((Number) pair.first).intValue();
                                int intValue2 = ((Number) pair.second).intValue();
                                int i20 = i10 + 4;
                                Intrinsics.echo(str8, str5);
                                str11 = str5;
                                G5.bravo(file6, "compressWithRetry_salvage_attempt_" + i19);
                                this.f1283w = abVar;
                                this.alpha = str8;
                                this.purple = list;
                                this.red = it;
                                this.silver = j12;
                                this.teal = j15;
                                this.white = j16;
                                this.yellow = i19;
                                this.f1279s = intValue;
                                this.f1280t = intValue2;
                                this.f1281u = i20;
                                Iterator it4 = it;
                                this.f1282v = i4;
                                Cf.e eVar = ao.alpha;
                                String str12 = str8;
                                long j21 = j16;
                                blue = ad.blue(Cf.d.purple, new e(str12, this.f1284x, context4, file6, j21, intValue, intValue2, fVar3, null), this);
                                aVar = aVar3;
                                if (blue != aVar) {
                                    it3 = it4;
                                    i15 = i19;
                                    i18 = i20;
                                    str8 = str12;
                                    i17 = intValue;
                                    i16 = intValue2;
                                    j20 = j21;
                                    File file92 = (File) blue;
                                    if (file92 == null) {
                                    }
                                }
                                return aVar;
                            }
                            File file10 = file4;
                            long j22 = j16;
                            String str13 = str8;
                            String str14 = str5;
                            if (file10.length() < j22) {
                                try {
                                    FilesKt.golf(file10, file6);
                                    if (file6.exists() && file6.length() < j22) {
                                        Intrinsics.echo(str13, str14);
                                        list.add(new I9.a(10, j22, 0, 0, 0, true, new Long(file6.length()), "Used original file (smaller than target)", null, 7552));
                                        return file6;
                                    }
                                } catch (Exception e) {
                                    list.add(new I9.a(10, j22, 0, 0, 0, false, null, q.echo("Failed to copy original file: ", e.getMessage()), e.getClass().getSimpleName(), 6592));
                                }
                            }
                            Intrinsics.echo(str13, str14);
                            return null;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = 4;
                    long j23 = this.white;
                    long j24 = this.teal;
                    j12 = this.silver;
                    ?? r92 = this.purple;
                    String str15 = this.alpha;
                    ResultKt.alpha(obj);
                    j13 = j23;
                    file4 = file7;
                    str6 = "sourceFile";
                    context2 = context4;
                    fVar2 = fVar4;
                    charlie3 = obj;
                    aVar = aVar2;
                    j14 = j24;
                    str7 = str15;
                    arrayList = r92;
                    str5 = "operationType";
                    file5 = (File) charlie3;
                    if (file5 == null) {
                        Intrinsics.echo(file4, str6);
                        Intrinsics.echo(str7, str5);
                        arrayList.add(new I9.a(3, j13, 1080, 40, HttpConstants.HTTP_BAD_REQUEST, true, new Long(file5.length()), null, null, 8064));
                        return file5;
                    }
                    arrayList.add(new I9.a(3, j13, 1080, 40, HttpConstants.HTTP_BAD_REQUEST, false, null, "Compression returned null", null, 7616));
                    G5.bravo(file6, "compressWithRetry_salvage_prepare");
                    fVar3 = fVar2;
                    context4 = context2;
                    Pair pair2 = new Pair(new Integer(30), new Integer(300));
                    Pair pair3 = new Pair(new Integer(20), new Integer(250));
                    Pair pair4 = new Pair(new Integer(10), new Integer(200));
                    Pair pair5 = new Pair(new Integer(5), new Integer(150));
                    Pair pair6 = new Pair(new Integer(5), new Integer(100));
                    Pair pair7 = new Pair(new Integer(5), new Integer(50));
                    Pair[] pairArr = new Pair[6];
                    pairArr[0] = pair2;
                    pairArr[1] = pair3;
                    pairArr[2] = pair4;
                    pairArr[3] = pair5;
                    pairArr[i4] = pair6;
                    pairArr[5] = pair7;
                    it = CollectionsKt.listOf(pairArr).iterator();
                    str8 = str7;
                    list = arrayList;
                    i10 = 0;
                    j15 = j14;
                    j16 = j13;
                    if (!it.hasNext()) {
                    }
                } else {
                    i4 = 4;
                    long j25 = this.white;
                    long j26 = this.teal;
                    long j27 = this.silver;
                    ?? r93 = this.purple;
                    String str16 = this.alpha;
                    ResultKt.alpha(obj);
                    j10 = j25;
                    file2 = file7;
                    str6 = "sourceFile";
                    j5 = j27;
                    context = context4;
                    fVar = fVar4;
                    charlie2 = obj;
                    arrayList = r93;
                    str5 = "operationType";
                    aVar = aVar2;
                    j11 = j26;
                    str = str16;
                    file3 = (File) charlie2;
                    if (file3 == null) {
                        Intrinsics.echo(file2, str6);
                        Intrinsics.echo(str, str5);
                        arrayList.add(new I9.a(2, j10, 1440, 40, HttpConstants.HTTP_BAD_REQUEST, true, new Long(file3.length()), null, null, 8064));
                        return file3;
                    }
                    f fVar5 = fVar;
                    long j28 = j10;
                    arrayList.add(new I9.a(2, j10, 1440, 40, HttpConstants.HTTP_BAD_REQUEST, false, null, "Compression returned null", null, 7616));
                    Integer num = new Integer(1080);
                    this.f1283w = abVar;
                    this.alpha = str;
                    this.purple = arrayList;
                    this.silver = j5;
                    this.teal = j11;
                    this.white = j28;
                    this.f1282v = 3;
                    long j29 = j11;
                    long j30 = j5;
                    file4 = file2;
                    context2 = context;
                    fVar2 = fVar5;
                    charlie3 = fVar2.charlie(context2, this.f1284x, file6, j28, num, str, this);
                    if (charlie3 != aVar) {
                        str7 = str;
                        j12 = j30;
                        j13 = j28;
                        j14 = j29;
                        file5 = (File) charlie3;
                        if (file5 == null) {
                        }
                    }
                    return aVar;
                }
            } else {
                i4 = 4;
                long j31 = this.white;
                long j32 = this.teal;
                long j33 = this.silver;
                ?? r62 = this.purple;
                str = this.alpha;
                ResultKt.alpha(obj);
                str2 = "sourceFile";
                j7 = j32;
                str3 = "operationType";
                aVar = aVar2;
                arrayList = r62;
                str4 = " (";
                j6 = j31;
                j5 = j33;
                context = context4;
                fVar = fVar4;
                file = file7;
                charlie = obj;
            }
        } else {
            i4 = 4;
            ResultKt.alpha(obj);
            if (file7.exists()) {
                long length = file7.length();
                Log.i("ImageCompression", "═══════════════════════════════════════════════════════════");
                str = "delivery_proof";
                Log.i("ImageCompression", "🔄 COMPRESSION WITH RETRY START - operation=".concat("delivery_proof"));
                Log.i("ImageCompression", q.golf("   Source: ", file7.getName(), " (", a.alpha(length), ")"));
                Log.i("ImageCompression", "   Strategy: aggressive=" + a.alpha(409600L) + ", fallback=" + a.alpha(460800L));
                arrayList = new ArrayList();
                Integer num2 = new Integer(1440);
                this.f1283w = abVar;
                this.alpha = "delivery_proof";
                this.purple = arrayList;
                this.silver = length;
                this.teal = 409600L;
                this.white = 460800L;
                this.f1282v = 1;
                str2 = "sourceFile";
                str3 = "operationType";
                context = context4;
                file = file7;
                aVar = aVar2;
                fVar = fVar4;
                charlie = fVar.charlie(context, this.f1284x, file6, 409600L, num2, "delivery_proof", this);
                if (charlie != aVar) {
                    str4 = " (";
                    j5 = length;
                    j6 = 460800;
                    j7 = 409600;
                }
                return aVar;
            }
            return null;
        }
        File file11 = (File) charlie;
        if (file11 != null) {
            long length2 = file11.length();
            if (j5 > 0) {
                i5 = (int) ((1.0d - (length2 / j5)) * 100);
            } else {
                i5 = 0;
            }
            Log.i("ImageCompression", "✅ Attempt 1 SUCCESS: " + a.alpha(length2) + str4 + i5 + "% reduction)");
            Intrinsics.echo(file, str2);
            Intrinsics.echo(str, str3);
            arrayList.add(new I9.a(1, j7, 1440, 40, HttpConstants.HTTP_BAD_REQUEST, true, new Long(length2), null, null, 8064));
            return file11;
        }
        Log.w("ImageCompression", "⚠️ Attempt 1 FAILED: Compression returned null");
        file2 = file;
        long j34 = j7;
        arrayList.add(new I9.a(1, j7, 1440, 40, HttpConstants.HTTP_BAD_REQUEST, false, null, "Compression returned null", null, 7616));
        Integer num3 = new Integer(1440);
        this.f1283w = abVar;
        this.alpha = str;
        this.purple = arrayList;
        this.silver = j5;
        this.teal = j34;
        this.white = j6;
        this.f1282v = 2;
        str5 = str3;
        str6 = str2;
        charlie2 = fVar.charlie(context, this.f1284x, file6, j6, num3, str, this);
        if (charlie2 != aVar) {
            j10 = j6;
            j11 = j34;
            file3 = (File) charlie2;
            if (file3 == null) {
            }
        }
        return aVar;
    }
}
