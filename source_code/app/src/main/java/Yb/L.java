package Yb;

import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.AbstractC2707l6;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class L extends Pd.i implements Xd.l {
    public final /* synthetic */ S alpha;
    public final /* synthetic */ Uri purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(S s3, Uri uri, Nd.c cVar) {
        super(2, cVar);
        this.alpha = s3;
        this.purple = uri;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new L(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        J2.c cVar = this.alpha.alpha;
        File alpha = ((F9.i) ((C0333u0) cVar.purple).charlie()).alpha(((C0333u0) cVar.purple).alpha);
        if (alpha == null) {
            alpha = ((C0333u0) cVar.purple).alpha.getCacheDir();
        }
        File file = new File(alpha, com.google.android.material.datepicker.j.kilo("invoice_gallery_", System.currentTimeMillis(), ".jpg"));
        file.createNewFile();
        InputStream openInputStream = ((C0333u0) cVar.purple).alpha.getContentResolver().openInputStream(this.purple);
        if (openInputStream != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    long echo = AbstractC2707l6.echo(openInputStream, fileOutputStream);
                    fileOutputStream.close();
                    Pd.f.bravo(echo);
                    openInputStream.close();
                    return file;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2716m6.alpha(openInputStream, th);
                    throw th2;
                }
            }
        } else {
            return file;
        }
    }
}
