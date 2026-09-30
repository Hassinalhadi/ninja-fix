package delivery.samurai.android.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.google.android.gms.maps.MapView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldelivery/samurai/android/utils/InterceptableMapView;", "Lcom/google/android/gms/maps/MapView;", "", "disallow", "", "setParentsDisallowIntercept", "(Z)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InterceptableMapView extends MapView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterceptableMapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.echo(context, "context");
        Intrinsics.checkNotNull(attributeSet);
    }

    private final void setParentsDisallowIntercept(boolean disallow) {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            parent.requestDisallowInterceptTouchEvent(disallow);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0 != 6) goto L16;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.echo(ev, "ev");
        int actionMasked = ev.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                        }
                    }
                }
            }
            setParentsDisallowIntercept(false);
            return super.dispatchTouchEvent(ev);
        }
        setParentsDisallowIntercept(true);
        return super.dispatchTouchEvent(ev);
    }
}
