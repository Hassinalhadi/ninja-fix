package bq;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import u8.b;
import y5.o;

/* loaded from: classes3.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ a(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent e) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(e, "e");
                e.getX();
                ((b) this.bravo).getClass();
                e.getY();
                return true;
            default:
                return super.onDoubleTap(e);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f10) {
        switch (this.alpha) {
            case 1:
                ((o) this.bravo).getClass();
                return false;
            default:
                return super.onFling(motionEvent, motionEvent2, f5, f10);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        switch (this.alpha) {
            case 1:
                o oVar = (o) this.bravo;
                View.OnLongClickListener onLongClickListener = oVar.f14147j;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(oVar.f14139a);
                    return;
                }
                return;
            default:
                super.onLongPress(motionEvent);
                return;
        }
    }
}
