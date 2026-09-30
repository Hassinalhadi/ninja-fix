package a4;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.ao;

/* loaded from: classes3.dex */
public final class h extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ i red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Nd.c cVar) {
        super(2, cVar);
        this.red = iVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        h hVar = new h(this.red, cVar);
        hVar.purple = obj;
        return hVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        if (r14 != r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e5, code lost:
    
        if (r14 == r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[Catch: Exception -> 0x0023, TRY_ENTER, TryCatch #1 {Exception -> 0x0023, blocks: (B:12:0x001e, B:14:0x002e, B:16:0x0034, B:18:0x0038, B:20:0x0046, B:30:0x0064, B:46:0x0092, B:48:0x009f, B:53:0x00c5, B:59:0x0099), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #1 {Exception -> 0x0023, blocks: (B:12:0x001e, B:14:0x002e, B:16:0x0034, B:18:0x0038, B:20:0x0046, B:30:0x0064, B:46:0x0092, B:48:0x009f, B:53:0x00c5, B:59:0x0099), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:12:0x001e, B:14:0x002e, B:16:0x0034, B:18:0x0038, B:20:0x0046, B:30:0x0064, B:46:0x0092, B:48:0x009f, B:53:0x00c5, B:59:0x0099), top: B:2:0x000b }] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M1.g gVar;
        j jVar;
        Object blue;
        int i4;
        boolean z2;
        InputStream openInputStream;
        Object obj2 = Od.a.alpha;
        int i5 = this.alpha;
        i iVar = this.red;
        Uri uri = iVar.purple;
        try {
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                }
            } else {
                ResultKt.alpha(obj);
                vf.ab abVar = (vf.ab) this.purple;
                if (vf.ad.xray(abVar)) {
                    Rect rect = l.alpha;
                    Context context = iVar.alpha;
                    Fe.c india = l.india(context, uri, iVar.red, iVar.silver);
                    if (vf.ad.xray(abVar)) {
                        Bitmap bitmap = (Bitmap) india.red;
                        try {
                            ContentResolver contentResolver = context.getContentResolver();
                            Intrinsics.checkNotNull(uri);
                            openInputStream = contentResolver.openInputStream(uri);
                        } catch (Exception unused) {
                        }
                        if (openInputStream != null) {
                            gVar = new M1.g(openInputStream);
                            try {
                                openInputStream.close();
                            } catch (Exception unused2) {
                            }
                            boolean z10 = false;
                            if (gVar == null) {
                                int charlie = gVar.charlie(1, "Orientation");
                                if (charlie != 3) {
                                    if (charlie != 5 && charlie != 6 && charlie != 7) {
                                        if (charlie != 8) {
                                            i4 = 0;
                                        } else {
                                            i4 = 270;
                                        }
                                    } else {
                                        i4 = 90;
                                    }
                                } else {
                                    i4 = 180;
                                }
                                if (charlie != 2 && charlie != 5) {
                                    z2 = false;
                                    if (charlie != 4 || charlie == 7) {
                                        z10 = true;
                                    }
                                    jVar = new j(i4, bitmap, z2, z10);
                                }
                                z2 = true;
                                if (charlie != 4) {
                                }
                                z10 = true;
                                jVar = new j(i4, bitmap, z2, z10);
                            } else {
                                jVar = new j(0, bitmap, false, false);
                            }
                            f fVar = new f(uri, (Bitmap) jVar.delta, india.purple, jVar.alpha, jVar.bravo, jVar.charlie);
                            this.alpha = 1;
                            Cf.e eVar = ao.alpha;
                            blue = vf.ad.blue(Af.n.alpha, new g(iVar, fVar, null), this);
                            if (blue == Od.a.alpha) {
                                blue = Unit.INSTANCE;
                            }
                        }
                        gVar = null;
                        boolean z102 = false;
                        if (gVar == null) {
                        }
                        f fVar2 = new f(uri, (Bitmap) jVar.delta, india.purple, jVar.alpha, jVar.bravo, jVar.charlie);
                        this.alpha = 1;
                        Cf.e eVar2 = ao.alpha;
                        blue = vf.ad.blue(Af.n.alpha, new g(iVar, fVar2, null), this);
                        if (blue == Od.a.alpha) {
                        }
                    }
                }
            }
        } catch (Exception e) {
            f fVar3 = new f(uri, e);
            this.alpha = 2;
            Cf.e eVar3 = ao.alpha;
            Object blue2 = vf.ad.blue(Af.n.alpha, new g(iVar, fVar3, null), this);
            if (blue2 != Od.a.alpha) {
                blue2 = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
