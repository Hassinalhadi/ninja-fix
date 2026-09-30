package F9;

import Xd.l;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.G5;
import vf.ab;
import y3.AbstractC3395a;

/* loaded from: classes2.dex */
public final class c extends Pd.i implements l {
    public final /* synthetic */ String alpha;
    public final /* synthetic */ File purple;
    public final /* synthetic */ File red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1278s;
    public final /* synthetic */ f silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ long white;
    public final /* synthetic */ int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, File file, File file2, f fVar, int i4, long j5, int i5, int i10, Nd.c cVar) {
        super(2, cVar);
        this.alpha = str;
        this.purple = file;
        this.red = file2;
        this.silver = fVar;
        this.teal = i4;
        this.white = j5;
        this.yellow = i5;
        this.f1278s = i10;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new c(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1278s, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Bitmap decodeFile;
        File file;
        int i4 = this.teal;
        f fVar = this.silver;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        String str = this.alpha;
        File file2 = this.purple;
        if (file2.exists()) {
            File file3 = this.red;
            G5.bravo(file3, "compressWithBitmapFactoryFallback_prepare");
            try {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(file2.getAbsolutePath(), options);
                    if (options.outWidth > 0 && options.outHeight > 0) {
                        int alpha = f.alpha(fVar, options, i4, i4);
                        K7.b.alpha().delta(alpha, "compress_fallback_in_sample_size");
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = alpha;
                        decodeFile = BitmapFactory.decodeFile(file2.getAbsolutePath(), options2);
                        if (decodeFile != null) {
                            int width = decodeFile.getWidth();
                            int height = decodeFile.getHeight();
                            try {
                                if (AbstractC3395a.bravo(decodeFile, file3, this.white, this.yellow, this.f1278s)) {
                                    new Integer(width);
                                    new Integer(height);
                                    I9.b.bravo(file2, str);
                                    file = file3;
                                } else {
                                    if (file3.exists()) {
                                        file3.length();
                                    }
                                    new Integer(width);
                                    new Integer(height);
                                    I9.b.bravo(file2, str);
                                    file = null;
                                }
                                if (!decodeFile.isRecycled()) {
                                    decodeFile.recycle();
                                }
                                return file;
                            } finally {
                            }
                        }
                    }
                } catch (OutOfMemoryError unused) {
                    BitmapFactory.Options options3 = new BitmapFactory.Options();
                    options3.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(file2.getAbsolutePath(), options3);
                    int alpha2 = f.alpha(fVar, options3, i4 / 2, i4 / 2) * 2;
                    BitmapFactory.Options options4 = new BitmapFactory.Options();
                    options4.inSampleSize = alpha2;
                    decodeFile = BitmapFactory.decodeFile(file2.getAbsolutePath(), options4);
                    if (decodeFile != null) {
                        int width2 = decodeFile.getWidth();
                        int height2 = decodeFile.getHeight();
                        try {
                            if (AbstractC3395a.bravo(decodeFile, file3, this.white, this.yellow, this.f1278s)) {
                                new Integer(width2);
                                new Integer(height2);
                                I9.b.bravo(file2, str);
                            } else {
                                if (file3.exists()) {
                                    file3.length();
                                }
                                new Integer(width2);
                                new Integer(height2);
                                I9.b.bravo(file2, str);
                                file3 = null;
                            }
                            return file3;
                        } finally {
                            if (!decodeFile.isRecycled()) {
                                decodeFile.recycle();
                            }
                            throw th;
                        }
                    }
                }
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }
}
