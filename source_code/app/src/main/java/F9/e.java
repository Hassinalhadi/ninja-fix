package F9;

import Xd.l;
import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.util.concurrent.ExecutionException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;
import y3.AbstractC3395a;

/* loaded from: classes2.dex */
public final class e extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ File red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1287s;
    public final /* synthetic */ Context silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f1288t;
    public final /* synthetic */ File teal;
    public final /* synthetic */ long white;
    public final /* synthetic */ int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, File file, Context context, File file2, long j5, int i4, int i5, f fVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = str;
        this.red = file;
        this.silver = context;
        this.teal = file2;
        this.white = j5;
        this.yellow = i4;
        this.f1287s = i5;
        this.f1288t = fVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        f fVar = this.f1288t;
        return new e(this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f1287s, fVar, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0170, code lost:
    
        if (r0 != r11) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019c, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0147, code lost:
    
        if (r0 != r11) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019a, code lost:
    
        if (r0 != r11) goto L78;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar;
        File file;
        String str;
        String str2;
        Object bravo;
        Object bravo2;
        Object bravo3;
        U3.e eVar;
        Bitmap bitmap;
        int width;
        int height;
        f fVar2 = this.f1288t;
        File file2 = this.teal;
        Context context = this.silver;
        long j5 = this.white;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        ResultKt.alpha(obj);
                        bravo2 = obj;
                        return (File) bravo2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                bravo3 = obj;
                return (File) bravo3;
            }
            ResultKt.alpha(obj);
            bravo = obj;
            return (File) bravo;
        }
        ResultKt.alpha(obj);
        String str3 = this.purple;
        File file3 = this.red;
        if (!file3.exists()) {
            return null;
        }
        try {
            try {
                try {
                } catch (OutOfMemoryError e) {
                    e = e;
                    file = file3;
                    fVar2 = fVar2;
                } catch (ExecutionException e4) {
                    e = e4;
                    file = file3;
                    fVar2 = fVar2;
                }
                try {
                    try {
                        com.bumptech.glide.j crimson = com.bumptech.glide.b.bravo(context).charlie(context).foxtrot().crimson(file3);
                        crimson.getClass();
                        eVar = new U3.e(1080, 1080);
                        crimson.beige(eVar, eVar, crimson, Y3.f.bravo);
                        Object obj2 = eVar.get();
                        Intrinsics.delta(obj2, "get(...)");
                        bitmap = (Bitmap) obj2;
                        width = bitmap.getWidth();
                        height = bitmap.getHeight();
                    } catch (OutOfMemoryError e5) {
                        e = e5;
                        fVar = fVar2;
                        file = file3;
                    } catch (ExecutionException e10) {
                        e = e10;
                        fVar = fVar2;
                        file = file3;
                    }
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    file = file3;
                    str = str3;
                    new Long(j5);
                    new Integer(1080);
                    I9.b.charlie(file, e, str);
                    this.alpha = 1;
                    bravo = f.bravo(fVar2, this.red, file2, 1080, this.white, this.yellow, this.f1287s, str, this);
                } catch (ExecutionException e12) {
                    e = e12;
                    file = file3;
                    str2 = str3;
                    new Long(j5);
                    new Integer(1080);
                    I9.b.charlie(file, e, str2);
                    this.alpha = 2;
                    bravo3 = f.bravo(fVar2, this.red, file2, 1080, this.white, this.yellow, this.f1287s, str2, this);
                }
            } catch (Exception e13) {
                e = e13;
                fVar = fVar2;
                file = file3;
            }
        } catch (OutOfMemoryError e14) {
            e = e14;
        } catch (ExecutionException e15) {
            e = e15;
        }
        try {
            file = file3;
            fVar = fVar2;
            try {
                boolean bravo4 = AbstractC3395a.bravo(bitmap, file2, this.white, this.yellow, this.f1287s);
                com.bumptech.glide.b.bravo(context).charlie(context).india(eVar);
                if (bravo4) {
                    new Integer(width);
                    new Integer(height);
                    I9.b.bravo(file, str3);
                    return file2;
                }
                if (file2.exists()) {
                    file2.length();
                }
                new Integer(width);
                new Integer(height);
                I9.b.bravo(file, str3);
                return null;
            } catch (ExecutionException e16) {
                e = e16;
                str2 = str3;
                fVar2 = fVar;
                new Long(j5);
                new Integer(1080);
                I9.b.charlie(file, e, str2);
                this.alpha = 2;
                bravo3 = f.bravo(fVar2, this.red, file2, 1080, this.white, this.yellow, this.f1287s, str2, this);
            } catch (Exception e17) {
                e = e17;
                new Long(j5);
                new Integer(1080);
                I9.b.charlie(file, e, str3);
                String reason = e.getClass().getSimpleName().concat(" in salvage");
                Intrinsics.echo(reason, "reason");
                this.alpha = 3;
                f fVar3 = fVar;
                bravo2 = f.bravo(fVar3, this.red, file2, 1080, this.white, this.yellow, this.f1287s, str3, this);
            } catch (OutOfMemoryError e18) {
                e = e18;
                str = str3;
                fVar2 = fVar;
                new Long(j5);
                new Integer(1080);
                I9.b.charlie(file, e, str);
                this.alpha = 1;
                bravo = f.bravo(fVar2, this.red, file2, 1080, this.white, this.yellow, this.f1287s, str, this);
            }
        } catch (ExecutionException e19) {
            e = e19;
            file = file3;
            str2 = str3;
            new Long(j5);
            new Integer(1080);
            I9.b.charlie(file, e, str2);
            this.alpha = 2;
            bravo3 = f.bravo(fVar2, this.red, file2, 1080, this.white, this.yellow, this.f1287s, str2, this);
        } catch (Exception e20) {
            e = e20;
            fVar = fVar2;
            file = file3;
        } catch (OutOfMemoryError e21) {
            e = e21;
            file = file3;
            str = str3;
            new Long(j5);
            new Integer(1080);
            I9.b.charlie(file, e, str);
            this.alpha = 1;
            bravo = f.bravo(fVar2, this.red, file2, 1080, this.white, this.yellow, this.f1287s, str, this);
        }
    }
}
