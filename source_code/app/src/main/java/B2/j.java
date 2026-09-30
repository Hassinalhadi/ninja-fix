package B2;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.M;
import androidx.work.impl.WorkDatabase;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.events.EventQueueManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import org.json.JSONArray;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ j(U7.c cVar, String str, Map map, List list) {
        this.alpha = 2;
        this.red = cVar;
        this.silver = str;
        this.teal = map;
        this.purple = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                List list = (List) this.purple;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).delta(((J2.j) this.red).alpha);
                }
                k.bravo((A2.a) this.silver, (WorkDatabase) this.teal, list);
                return;
            case 1:
                E5.i iVar = (E5.i) this.red;
                String str = iVar.alpha;
                B5.g gVar = (B5.g) this.silver;
                E5.h hVar = (E5.h) this.teal;
                J5.a aVar = (J5.a) this.purple;
                aVar.getClass();
                Logger logger = J5.a.foxtrot;
                try {
                    F5.h alpha = aVar.charlie.alpha(str);
                    if (alpha == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        gVar.echo(new IllegalArgumentException(str2));
                    } else {
                        ((L5.h) aVar.echo).papa(new A2.p(aVar, iVar, ((C5.c) alpha).alpha(hVar), 5));
                        gVar.echo(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    gVar.echo(e);
                    return;
                }
            case 2:
                U7.c cVar = (U7.c) this.red;
                String str3 = (String) ((AtomicMarkableReference) cVar.yellow).getReference();
                String str4 = (String) this.silver;
                Q7.h hVar2 = (Q7.h) cVar.purple;
                if (str3 != null) {
                    hVar2.juliet(str4, (String) ((AtomicMarkableReference) cVar.yellow).getReference());
                }
                Map map = (Map) this.teal;
                if (!map.isEmpty()) {
                    hVar2.hotel(str4, map, false);
                }
                List list2 = (List) this.purple;
                if (!list2.isEmpty()) {
                    hVar2.india(str4, list2);
                    return;
                }
                return;
            case 3:
                ((CameraCaptureSession.CaptureCallback) ((androidx.camera.camera2.internal.compat.e) this.purple).charlie).onCaptureCompleted((CameraCaptureSession) this.red, (CaptureRequest) this.silver, (TotalCaptureResult) this.teal);
                return;
            case 4:
                ((CameraCaptureSession.CaptureCallback) ((androidx.camera.camera2.internal.compat.e) this.purple).charlie).onCaptureProgressed((CameraCaptureSession) this.red, (CaptureRequest) this.silver, (CaptureResult) this.teal);
                return;
            case 5:
                ((CameraCaptureSession.CaptureCallback) ((androidx.camera.camera2.internal.compat.e) this.purple).charlie).onCaptureFailed((CameraCaptureSession) this.red, (CaptureRequest) this.silver, (CaptureFailure) this.teal);
                return;
            case 6:
                bp.r rVar = (bp.r) this.purple;
                rVar.getClass();
                AbstractC3066u3.bravo("TextureViewImpl", "Safe to release surface.");
                A2.p pVar = rVar.lima;
                if (pVar != null) {
                    pVar.bravo();
                    rVar.lima = null;
                }
                ((Surface) this.red).release();
                if (rVar.golf == ((V0.k) this.silver)) {
                    rVar.golf = null;
                }
                if (rVar.hotel == ((M) this.teal)) {
                    rVar.hotel = null;
                    return;
                }
                return;
            default:
                EventQueueManager.bravo((EventQueueManager) this.purple, (Context) this.red, (EventGroup) this.silver, (JSONArray) this.teal);
                return;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
    }
}
