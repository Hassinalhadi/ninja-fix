package F9;

import Xd.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import av.q;
import com.zendesk.service.HttpConstants;
import java.io.File;
import java.util.concurrent.ExecutionException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import s6.G5;
import s6.J6;
import vf.ab;
import y3.AbstractC3395a;

/* loaded from: classes2.dex */
public final class b extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ File red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f1277s;
    public final /* synthetic */ Integer silver;
    public final /* synthetic */ long teal;
    public final /* synthetic */ File white;
    public final /* synthetic */ Context yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, File file, Integer num, long j5, File file2, Context context, f fVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = str;
        this.red = file;
        this.silver = num;
        this.teal = j5;
        this.white = file2;
        this.yellow = context;
        this.f1277s = fVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new b(this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1277s, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:32|(4:34|35|36|(1:42)(2:40|41))(1:193)|43|44|45|46|47|48|49|50|51|(2:53|(6:55|(1:59)|60|61|62|(4:155|156|(1:160)|161)(18:66|67|68|69|70|71|72|(3:134|135|(1:137))|74|(2:76|77)(1:132)|78|79|(1:81)(1:121)|82|(3:87|88|(4:92|93|94|95))|84|85|86))(1:167))|168|61|62|(1:64)|155|156|(2:158|160)|161) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x04aa, code lost:
    
        if (r0 == r10) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0538, code lost:
    
        if (r0 == r10) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x056d, code lost:
    
        if (r0 == r10) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04f0, code lost:
    
        if (r0 != r10) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x035e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x036c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0363, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x035b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x035c, code lost:
    
        r10 = r10;
        r29 = r29;
        r30 = r30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x053f  */
    /* JADX WARN: Type inference failed for: r0v50, types: [U3.a, java.lang.Object, com.bumptech.glide.j] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v33, types: [int] */
    /* JADX WARN: Type inference failed for: r10v40, types: [F9.b] */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v12 */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v14 */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v16 */
    /* JADX WARN: Type inference failed for: r29v17 */
    /* JADX WARN: Type inference failed for: r29v18 */
    /* JADX WARN: Type inference failed for: r29v19 */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r29v20 */
    /* JADX WARN: Type inference failed for: r29v21 */
    /* JADX WARN: Type inference failed for: r29v24 */
    /* JADX WARN: Type inference failed for: r29v25 */
    /* JADX WARN: Type inference failed for: r29v26 */
    /* JADX WARN: Type inference failed for: r29v28 */
    /* JADX WARN: Type inference failed for: r29v29 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v12 */
    /* JADX WARN: Type inference failed for: r30v13 */
    /* JADX WARN: Type inference failed for: r30v14 */
    /* JADX WARN: Type inference failed for: r30v15 */
    /* JADX WARN: Type inference failed for: r30v16 */
    /* JADX WARN: Type inference failed for: r30v17 */
    /* JADX WARN: Type inference failed for: r30v18 */
    /* JADX WARN: Type inference failed for: r30v19 */
    /* JADX WARN: Type inference failed for: r30v20 */
    /* JADX WARN: Type inference failed for: r30v21 */
    /* JADX WARN: Type inference failed for: r30v23, types: [java.lang.Object, java.io.File] */
    /* JADX WARN: Type inference failed for: r30v25 */
    /* JADX WARN: Type inference failed for: r30v26 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v5 */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        ?? r30;
        b bVar;
        File file;
        b bVar2;
        File file2;
        ?? r10;
        int i4;
        int i5;
        Od.a aVar;
        String str3;
        String str4;
        int i10;
        String str5;
        int i11;
        String str6;
        File file3;
        Object bravo;
        File file4;
        Object bravo2;
        Object charlie;
        Object bravo3;
        File file5;
        b bVar3;
        U3.e eVar;
        Bitmap bitmap;
        int width;
        int height;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap bitmap2;
        long j5;
        long j6;
        int i12;
        File file6;
        Context context = this.yellow;
        J6.bravo();
        Od.a aVar2 = Od.a.alpha;
        int i13 = this.alpha;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 == 4) {
                            ResultKt.alpha(obj);
                            bravo3 = obj;
                            return (File) bravo3;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj);
                    bravo = obj;
                    return (File) bravo;
                }
                ResultKt.alpha(obj);
                bravo2 = obj;
                file6 = (File) bravo2;
            } else {
                ResultKt.alpha(obj);
                charlie = obj;
                file6 = (File) charlie;
            }
        } else {
            ResultKt.alpha(obj);
            String str7 = this.purple;
            if (str7 == null) {
                str7 = "unknown";
            }
            File file7 = this.red;
            long length = file7.length();
            int intValue = this.silver.intValue();
            Log.i("ImageCompression", "═══════════════════════════════════════════════════════════");
            Log.i("ImageCompression", "🔵 COMPRESSION START - operation=".concat(str7));
            String str8 = str7;
            Log.i("ImageCompression", q.golf("   Source: ", file7.getName(), " (", a.alpha(length), ")"));
            long j7 = this.teal;
            Log.i("ImageCompression", "   Target: maxBytes=" + a.alpha(j7) + ", maxDim=" + intValue + "px");
            if (!file7.exists()) {
                Log.e("ImageCompression", "❌ Source file does not exist: " + file7.getAbsolutePath());
                return null;
            }
            String str9 = ", target=";
            File file8 = this.white;
            if (length <= j7) {
                str = " (";
                Object obj2 = "   Compression params: maxBytes=";
                Object obj3 = "   ✅ Converted to RGB_565: ";
                Log.i("ImageCompression", q.golf("✅ Source already small enough (", a.alpha(length), " <= ", a.alpha(j7), ")"));
                try {
                    FilesKt.golf(file7, file8);
                    long length2 = file8.length();
                    if (file8.exists() && length2 <= j7) {
                        Log.i("ImageCompression", "✅ Copied source file: " + a.alpha(length2));
                        return file8;
                    }
                    Log.w("ImageCompression", "⚠️ Copy failed or size mismatch: copied=" + a.alpha(length2) + ", target=" + a.alpha(j7));
                    str2 = obj2;
                    r30 = obj3;
                } catch (Exception e) {
                    Log.e("ImageCompression", "❌ Failed to copy source file: " + e.getMessage(), e);
                    str2 = obj2;
                    r30 = obj3;
                }
            } else {
                str = " (";
                str2 = "   Compression params: maxBytes=";
                r30 = "   ✅ Converted to RGB_565: ";
                Log.i("ImageCompression", "📦 Source too large, starting compression...");
            }
            G5.bravo(file8, "compress_prepare");
            try {
                try {
                    try {
                        Log.d("ImageCompression", "   Loading bitmap with Glide: maxDim=" + intValue + "px");
                        ?? blue = com.bumptech.glide.b.echo(context).foxtrot().blue(file7);
                        try {
                            blue.getClass();
                            eVar = new U3.e(intValue, intValue);
                            blue.beige(eVar, eVar, blue, Y3.f.bravo);
                            Object obj4 = eVar.get();
                            Intrinsics.delta(obj4, "get(...)");
                            bitmap = (Bitmap) obj4;
                            width = bitmap.getWidth();
                            height = bitmap.getHeight();
                            Log.i("ImageCompression", "   Bitmap loaded: " + width + "x" + height + ", config=" + bitmap.getConfig());
                            config = bitmap.getConfig();
                            config2 = Bitmap.Config.RGB_565;
                        } catch (InterruptedException e4) {
                            e = e4;
                            r10 = this;
                            str2 = intValue;
                        } catch (OutOfMemoryError e5) {
                            e = e5;
                            r10 = this;
                            r30 = file8;
                            str2 = intValue;
                        } catch (ExecutionException e10) {
                            e = e10;
                            r10 = this;
                            r30 = file8;
                            str2 = intValue;
                        }
                    } catch (InterruptedException e11) {
                        e = e11;
                        r10 = this;
                    } catch (OutOfMemoryError e12) {
                        e = e12;
                        r10 = this;
                    } catch (ExecutionException e13) {
                        e = e13;
                        r10 = this;
                    }
                } catch (Exception e14) {
                    e = e14;
                    r10 = this;
                }
            } catch (InterruptedException e15) {
                e = e15;
            } catch (OutOfMemoryError e16) {
                e = e16;
                bVar2 = this;
                file2 = file8;
            } catch (ExecutionException e17) {
                e = e17;
                bVar = this;
                file = file8;
            }
            if (config != config2) {
                Log.d("ImageCompression", "   Converting to RGB_565 for memory efficiency...");
                bitmap2 = bitmap.copy(config2, false);
                if (bitmap2 != null) {
                    if (!Intrinsics.areEqual(bitmap, bitmap) && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    str9 = r30;
                    Log.d("ImageCompression", str9 + bitmap2.getWidth() + "x" + bitmap2.getHeight());
                    r10 = bitmap2.getWidth();
                    if (r10 <= 0 && bitmap2.getHeight() > 0) {
                        Log.i("ImageCompression", "   Starting ImageCompressor.squeeze()...");
                        Log.d("ImageCompression", str2 + a.alpha(j7) + ", minQuality=40, minDim=400");
                        r10 = this;
                        try {
                            try {
                                r30 = file8;
                            } catch (InterruptedException e18) {
                                e = e18;
                                str2 = intValue;
                                str9 = str8;
                                str6 = str9;
                                i11 = str2;
                                Log.w("ImageCompression", "⚠️ Compression interrupted");
                                Pd.f.bravo(j7);
                                Pd.f.alpha(i11);
                                I9.b.charlie(file7, e, str6);
                                return null;
                            }
                            try {
                                try {
                                    boolean bravo4 = AbstractC3395a.bravo(bitmap2, r30, r10.teal, 40, HttpConstants.HTTP_BAD_REQUEST);
                                    if (!Intrinsics.areEqual(bitmap2, bitmap)) {
                                        try {
                                            if (!bitmap2.isRecycled()) {
                                                bitmap2.recycle();
                                            }
                                        } catch (InterruptedException e19) {
                                            e = e19;
                                            i11 = intValue;
                                            str6 = str8;
                                            Log.w("ImageCompression", "⚠️ Compression interrupted");
                                            Pd.f.bravo(j7);
                                            Pd.f.alpha(i11);
                                            I9.b.charlie(file7, e, str6);
                                            return null;
                                        } catch (OutOfMemoryError e20) {
                                            e = e20;
                                            bVar2 = r10;
                                            file2 = r30;
                                            i10 = intValue;
                                            aVar = aVar2;
                                            str5 = str8;
                                            file4 = file2;
                                            Log.e("ImageCompression", "❌ OutOfMemoryError during compression", e);
                                            int i14 = i10 / 2;
                                            Log.e("ImageCompression", "   Attempting retry with smaller dimension: " + i14 + "px");
                                            Pd.f.bravo(j7);
                                            Pd.f.alpha(i10);
                                            I9.b.charlie(file7, e, str5);
                                            if (i10 > 200) {
                                            }
                                            return aVar;
                                        } catch (ExecutionException e21) {
                                            e = e21;
                                            bVar = r10;
                                            file = r30;
                                            i5 = intValue;
                                            aVar = aVar2;
                                            str3 = "   Using BitmapFactory fallback";
                                            str4 = str8;
                                            file3 = file;
                                            Log.e("ImageCompression", "❌ ExecutionException (Glide error) during compression", e);
                                            Log.e("ImageCompression", str3);
                                            Pd.f.bravo(j7);
                                            Pd.f.alpha(i5);
                                            I9.b.charlie(file7, e, str4);
                                            I9.b.delta(str4, "ExecutionException");
                                            bVar.alpha = 3;
                                            bravo = f.bravo(bVar.f1277s, bVar.red, file3, i5, bVar.teal, 40, HttpConstants.HTTP_BAD_REQUEST, str4, bVar);
                                        }
                                    }
                                    com.bumptech.glide.b.echo(context).india(eVar);
                                    if (r30.exists()) {
                                        j5 = r30.length();
                                    } else {
                                        j5 = 0;
                                    }
                                    if (length > 0) {
                                        str2 = intValue;
                                        j6 = j5;
                                        i12 = (int) ((1.0d - (j5 / length)) * 100);
                                    } else {
                                        j6 = j5;
                                        str2 = intValue;
                                        i12 = 0;
                                    }
                                    if (bravo4) {
                                        try {
                                            if (r30.exists() && j6 <= j7) {
                                                Log.i("ImageCompression", "✅ COMPRESSION SUCCESS");
                                                Log.i("ImageCompression", "   Final size: " + a.alpha(j6) + str + i12 + "% reduction)");
                                                StringBuilder sb2 = new StringBuilder("   Dimensions: ");
                                                sb2.append(width);
                                                sb2.append("x");
                                                sb2.append(height);
                                                Log.i("ImageCompression", sb2.toString());
                                                Log.i("ImageCompression", "   Target: " + a.alpha(j7));
                                                Log.i("ImageCompression", "═══════════════════════════════════════════════════════════");
                                                Pd.f.alpha(width);
                                                Pd.f.alpha(height);
                                                I9.b.bravo(file7, str8);
                                                return r30;
                                            }
                                        } catch (InterruptedException e22) {
                                            e = e22;
                                            str9 = str8;
                                            str6 = str9;
                                            i11 = str2;
                                            Log.w("ImageCompression", "⚠️ Compression interrupted");
                                            Pd.f.bravo(j7);
                                            Pd.f.alpha(i11);
                                            I9.b.charlie(file7, e, str6);
                                            return null;
                                        } catch (Exception e23) {
                                            e = e23;
                                            bVar3 = r10;
                                            i4 = str2;
                                            file5 = r30;
                                            str9 = str8;
                                            b bVar4 = bVar3;
                                            int i15 = i4;
                                            File file9 = file5;
                                            Log.e("ImageCompression", "❌ Exception during compression: ".concat(e.getClass().getSimpleName()), e);
                                            Log.e("ImageCompression", "   Using BitmapFactory fallback");
                                            Pd.f.bravo(j7);
                                            Pd.f.alpha(i15);
                                            I9.b.charlie(file7, e, str9);
                                            I9.b.delta(str9, e.getClass().getSimpleName());
                                            bVar4.alpha = 4;
                                            File file10 = file9;
                                            bravo3 = f.bravo(bVar4.f1277s, bVar4.red, file10, i15, bVar4.teal, 40, HttpConstants.HTTP_BAD_REQUEST, str9, bVar4);
                                            aVar = aVar2;
                                        } catch (OutOfMemoryError e24) {
                                            e = e24;
                                            str9 = str8;
                                            bVar2 = r10;
                                            str5 = str9;
                                            aVar = aVar2;
                                            i10 = str2;
                                            file4 = r30;
                                            Log.e("ImageCompression", "❌ OutOfMemoryError during compression", e);
                                            int i142 = i10 / 2;
                                            Log.e("ImageCompression", "   Attempting retry with smaller dimension: " + i142 + "px");
                                            Pd.f.bravo(j7);
                                            Pd.f.alpha(i10);
                                            I9.b.charlie(file7, e, str5);
                                            if (i10 > 200) {
                                            }
                                            return aVar;
                                        } catch (ExecutionException e25) {
                                            e = e25;
                                            str9 = str8;
                                            bVar = r10;
                                            str4 = str9;
                                            aVar = aVar2;
                                            str3 = "   Using BitmapFactory fallback";
                                            i5 = str2;
                                            file3 = r30;
                                            Log.e("ImageCompression", "❌ ExecutionException (Glide error) during compression", e);
                                            Log.e("ImageCompression", str3);
                                            Pd.f.bravo(j7);
                                            Pd.f.alpha(i5);
                                            I9.b.charlie(file7, e, str4);
                                            I9.b.delta(str4, "ExecutionException");
                                            bVar.alpha = 3;
                                            bravo = f.bravo(bVar.f1277s, bVar.red, file3, i5, bVar.teal, 40, HttpConstants.HTTP_BAD_REQUEST, str4, bVar);
                                        }
                                    }
                                    Log.e("ImageCompression", "❌ COMPRESSION FAILED");
                                    Log.e("ImageCompression", "   Final size: " + a.alpha(j6));
                                    Log.e("ImageCompression", "   Target: " + a.alpha(j7));
                                    Log.e("ImageCompression", "   Exceeded by: " + a.alpha(j6 - j7));
                                    Log.e("ImageCompression", "   Success flag: " + bravo4 + ", File exists: " + r30.exists());
                                    Log.e("ImageCompression", "═══════════════════════════════════════════════════════════");
                                    Pd.f.alpha(width);
                                    Pd.f.alpha(height);
                                    I9.b.bravo(file7, str8);
                                    return null;
                                } catch (Exception e26) {
                                    e = e26;
                                    i4 = intValue;
                                    bVar3 = r10;
                                    file5 = r30;
                                    str9 = str8;
                                    b bVar42 = bVar3;
                                    int i152 = i4;
                                    File file92 = file5;
                                    Log.e("ImageCompression", "❌ Exception during compression: ".concat(e.getClass().getSimpleName()), e);
                                    Log.e("ImageCompression", "   Using BitmapFactory fallback");
                                    Pd.f.bravo(j7);
                                    Pd.f.alpha(i152);
                                    I9.b.charlie(file7, e, str9);
                                    I9.b.delta(str9, e.getClass().getSimpleName());
                                    bVar42.alpha = 4;
                                    File file102 = file92;
                                    bravo3 = f.bravo(bVar42.f1277s, bVar42.red, file102, i152, bVar42.teal, 40, HttpConstants.HTTP_BAD_REQUEST, str9, bVar42);
                                    aVar = aVar2;
                                }
                            } catch (OutOfMemoryError e27) {
                                e = e27;
                                str2 = intValue;
                                str9 = str8;
                                bVar2 = r10;
                                str5 = str9;
                                aVar = aVar2;
                                i10 = str2;
                                file4 = r30;
                                Log.e("ImageCompression", "❌ OutOfMemoryError during compression", e);
                                int i1422 = i10 / 2;
                                Log.e("ImageCompression", "   Attempting retry with smaller dimension: " + i1422 + "px");
                                Pd.f.bravo(j7);
                                Pd.f.alpha(i10);
                                I9.b.charlie(file7, e, str5);
                                if (i10 > 200) {
                                    Integer alpha = Pd.f.alpha(i1422);
                                    bVar2.alpha = 1;
                                    charlie = bVar2.f1277s.charlie(context, bVar2.red, file4, bVar2.teal, alpha, str5, bVar2);
                                } else {
                                    Log.e("ImageCompression", "   MaxDim too small (" + i10 + "), using BitmapFactory fallback");
                                    I9.b.delta(str5, "OutOfMemoryError, maxDimPx <= 200");
                                    bVar2.alpha = 2;
                                    bravo2 = f.bravo(bVar2.f1277s, bVar2.red, file4, i10, bVar2.teal, 40, HttpConstants.HTTP_BAD_REQUEST, str5, bVar2);
                                }
                                return aVar;
                            } catch (ExecutionException e28) {
                                e = e28;
                                str2 = intValue;
                                str9 = str8;
                                bVar = r10;
                                str4 = str9;
                                aVar = aVar2;
                                str3 = "   Using BitmapFactory fallback";
                                i5 = str2;
                                file3 = r30;
                                Log.e("ImageCompression", "❌ ExecutionException (Glide error) during compression", e);
                                Log.e("ImageCompression", str3);
                                Pd.f.bravo(j7);
                                Pd.f.alpha(i5);
                                I9.b.charlie(file7, e, str4);
                                I9.b.delta(str4, "ExecutionException");
                                bVar.alpha = 3;
                                bravo = f.bravo(bVar.f1277s, bVar.red, file3, i5, bVar.teal, 40, HttpConstants.HTTP_BAD_REQUEST, str4, bVar);
                            }
                        } catch (Exception e29) {
                            e = e29;
                            r10 = r10;
                            r30 = file8;
                            i4 = intValue;
                            bVar3 = r10;
                            file5 = r30;
                            str9 = str8;
                            b bVar422 = bVar3;
                            int i1522 = i4;
                            File file922 = file5;
                            Log.e("ImageCompression", "❌ Exception during compression: ".concat(e.getClass().getSimpleName()), e);
                            Log.e("ImageCompression", "   Using BitmapFactory fallback");
                            Pd.f.bravo(j7);
                            Pd.f.alpha(i1522);
                            I9.b.charlie(file7, e, str9);
                            I9.b.delta(str9, e.getClass().getSimpleName());
                            bVar422.alpha = 4;
                            File file1022 = file922;
                            bravo3 = f.bravo(bVar422.f1277s, bVar422.red, file1022, i1522, bVar422.teal, 40, HttpConstants.HTTP_BAD_REQUEST, str9, bVar422);
                            aVar = aVar2;
                        } catch (OutOfMemoryError e30) {
                            e = e30;
                            r30 = file8;
                            str2 = intValue;
                            str9 = str8;
                            bVar2 = r10;
                            str5 = str9;
                            aVar = aVar2;
                            i10 = str2;
                            file4 = r30;
                            Log.e("ImageCompression", "❌ OutOfMemoryError during compression", e);
                            int i14222 = i10 / 2;
                            Log.e("ImageCompression", "   Attempting retry with smaller dimension: " + i14222 + "px");
                            Pd.f.bravo(j7);
                            Pd.f.alpha(i10);
                            I9.b.charlie(file7, e, str5);
                            if (i10 > 200) {
                            }
                            return aVar;
                        } catch (ExecutionException e31) {
                            e = e31;
                            r30 = file8;
                            str2 = intValue;
                            str9 = str8;
                            bVar = r10;
                            str4 = str9;
                            aVar = aVar2;
                            str3 = "   Using BitmapFactory fallback";
                            i5 = str2;
                            file3 = r30;
                            Log.e("ImageCompression", "❌ ExecutionException (Glide error) during compression", e);
                            Log.e("ImageCompression", str3);
                            Pd.f.bravo(j7);
                            Pd.f.alpha(i5);
                            I9.b.charlie(file7, e, str4);
                            I9.b.delta(str4, "ExecutionException");
                            bVar.alpha = 3;
                            bravo = f.bravo(bVar.f1277s, bVar.red, file3, i5, bVar.teal, 40, HttpConstants.HTTP_BAD_REQUEST, str4, bVar);
                        }
                    } else {
                        Log.e("ImageCompression", "❌ Invalid bitmap dimensions: " + bitmap2.getWidth() + "x" + bitmap2.getHeight());
                        com.bumptech.glide.b.echo(context).india(eVar);
                        if (!Intrinsics.areEqual(bitmap2, bitmap) && !bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        return null;
                    }
                } else {
                    Log.w("ImageCompression", "   ⚠️ Failed to convert to RGB_565, using original");
                }
            }
            bitmap2 = bitmap;
            r10 = bitmap2.getWidth();
            if (r10 <= 0) {
            }
            Log.e("ImageCompression", "❌ Invalid bitmap dimensions: " + bitmap2.getWidth() + "x" + bitmap2.getHeight());
            com.bumptech.glide.b.echo(context).india(eVar);
            if (!Intrinsics.areEqual(bitmap2, bitmap)) {
                bitmap2.recycle();
            }
            return null;
        }
        return file6;
    }
}
