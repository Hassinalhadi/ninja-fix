package Wb;

import android.net.Uri;
import delivery.samurai.android.ui.orders.note.ui.AddressNoteActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2707l6;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class e extends Pd.i implements Xd.l {
    public final /* synthetic */ AddressNoteActivity alpha;
    public final /* synthetic */ Uri purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AddressNoteActivity addressNoteActivity, Uri uri, Nd.c cVar) {
        super(2, cVar);
        this.alpha = addressNoteActivity;
        this.purple = uri;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new e(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AddressNoteActivity addressNoteActivity = this.alpha;
        InputStream openInputStream = addressNoteActivity.getContentResolver().openInputStream(this.purple);
        File file = new File(addressNoteActivity.getCacheDir(), com.google.android.material.datepicker.j.kilo("samurai_", System.currentTimeMillis(), ".jpg"));
        try {
            file.createNewFile();
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
        } catch (Exception e) {
            Intrinsics.delta(file.getAbsolutePath(), "getAbsolutePath(...)");
            throw e;
        }
    }
}
