package L5;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.V;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements f, V0.i {
    public final /* synthetic */ long alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ e(long j5, E5.i iVar) {
        this.alpha = j5;
        this.purple = iVar;
    }

    @Override // L5.f, be.InterfaceC0755a
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.alpha));
        E5.i iVar = (E5.i) this.purple;
        String str = iVar.alpha;
        B5.d dVar = iVar.charlie;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(O5.a.alpha(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.alpha);
            contentValues.put(Constants.INAPP_PRIORITY, Integer.valueOf(O5.a.alpha(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // V0.i
    public Object black(final V0.h hVar) {
        av.h hVar2 = (av.h) this.purple;
        hVar2.getClass();
        final long j5 = this.alpha;
        hVar2.alpha(new av.g() { // from class: av.e
            /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[RETURN] */
            @Override // av.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean charlie(TotalCaptureResult totalCaptureResult) {
                boolean z2;
                Long l10;
                long j6 = j5;
                if (totalCaptureResult.getRequest() != null) {
                    Object tag = totalCaptureResult.getRequest().getTag();
                    if ((tag instanceof V) && (l10 = (Long) ((V) tag).alpha.get("CameraControlSessionUpdateId")) != null && l10.longValue() >= j6) {
                        z2 = true;
                        if (!z2) {
                            hVar.bravo(null);
                            return true;
                        }
                        return false;
                    }
                }
                z2 = false;
                if (!z2) {
                }
            }
        });
        return "waitForSessionUpdateId:" + j5;
    }

    public /* synthetic */ e(av.h hVar, long j5) {
        this.purple = hVar;
        this.alpha = j5;
    }
}
