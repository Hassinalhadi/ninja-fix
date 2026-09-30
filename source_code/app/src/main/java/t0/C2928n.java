package t0;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j0.C1926a;
import k0.AbstractC1994a;
import k0.AbstractC1996c;
import k0.C1995b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: t0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2928n extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2946x purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2928n(C2946x c2946x, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = c2946x;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Y.d dVar;
        Y.d dVar2;
        int i4;
        boolean z2;
        boolean z10;
        Rect rect;
        Looper looper = null;
        boolean z11 = false;
        boolean z12 = true;
        C2946x c2946x = this.purple;
        switch (this.alpha) {
            case 0:
                int i5 = ((C1926a) obj).alpha;
                if (i5 == 1) {
                    z11 = c2946x.isInTouchMode();
                } else if (i5 == 2) {
                    if (c2946x.isInTouchMode()) {
                        z11 = c2946x.requestFocusFromTouch();
                    } else {
                        z11 = true;
                    }
                }
                return Boolean.valueOf(z11);
            case 1:
                KeyEvent keyEvent = ((C1995b) obj).alpha;
                long delta = AbstractC1996c.delta(keyEvent);
                if (AbstractC1994a.alpha(delta, AbstractC1994a.bravo)) {
                    dVar2 = new Y.d(2);
                } else if (AbstractC1994a.alpha(delta, AbstractC1994a.charlie)) {
                    dVar2 = new Y.d(1);
                } else {
                    if (AbstractC1994a.alpha(delta, AbstractC1994a.india)) {
                        if (keyEvent.isShiftPressed()) {
                            i4 = 2;
                        } else {
                            i4 = 1;
                        }
                        dVar = new Y.d(i4);
                    } else if (AbstractC1994a.alpha(delta, AbstractC1994a.golf)) {
                        dVar2 = new Y.d(4);
                    } else if (AbstractC1994a.alpha(delta, AbstractC1994a.foxtrot)) {
                        dVar2 = new Y.d(3);
                    } else if (!AbstractC1994a.alpha(delta, AbstractC1994a.delta) && !AbstractC1994a.alpha(delta, AbstractC1994a.mike)) {
                        if (!AbstractC1994a.alpha(delta, AbstractC1994a.echo) && !AbstractC1994a.alpha(delta, AbstractC1994a.november)) {
                            if (!AbstractC1994a.alpha(delta, AbstractC1994a.hotel) && !AbstractC1994a.alpha(delta, AbstractC1994a.kilo) && !AbstractC1994a.alpha(delta, AbstractC1994a.oscar)) {
                                if (!AbstractC1994a.alpha(delta, AbstractC1994a.alpha) && !AbstractC1994a.alpha(delta, AbstractC1994a.lima)) {
                                    dVar2 = null;
                                } else {
                                    dVar2 = new Y.d(8);
                                }
                            } else {
                                dVar2 = new Y.d(7);
                            }
                        } else {
                            dVar2 = new Y.d(6);
                        }
                    } else {
                        dVar = new Y.d(5);
                    }
                    dVar2 = dVar;
                }
                if (dVar2 != null && AbstractC1996c.foxtrot(keyEvent) == 2) {
                    int i10 = dVar2.alpha;
                    Integer november = Y.g.november(i10);
                    Z.c embeddedViewFocusRect = c2946x.getEmbeddedViewFocusRect();
                    Boolean echo = ((Y.n) c2946x.getFocusOwner()).echo(i10, embeddedViewFocusRect, new C2938s(dVar2, 1));
                    if (echo != null) {
                        z2 = echo.booleanValue();
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        return Boolean.TRUE;
                    }
                    if (i10 == 1 || i10 == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return Boolean.FALSE;
                    }
                    if (november != null) {
                        int intValue = november.intValue();
                        Object obj2 = Y.foxtrot.get();
                        Intrinsics.checkNotNull(obj2);
                        Y y10 = (Y) obj2;
                        View view = c2946x;
                        while (true) {
                            if (view != null) {
                                View rootView = c2946x.getRootView();
                                Intrinsics.charlie(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                                view = y10.bravo(intValue, view, (ViewGroup) rootView);
                                if (view != null) {
                                    C2932p c2932p = an.alpha;
                                    if (!Intrinsics.areEqual(view, c2946x)) {
                                        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                            if (parent == c2946x) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                view = null;
                            }
                        }
                        if (Intrinsics.areEqual(view, c2946x)) {
                            view = null;
                        }
                        if (view != null) {
                            if (embeddedViewFocusRect != null) {
                                rect = a0.ao.zulu(embeddedViewFocusRect);
                            } else {
                                rect = null;
                            }
                            if (rect != null) {
                                View rootView2 = c2946x.getRootView();
                                Intrinsics.charlie(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                                ViewGroup viewGroup = (ViewGroup) rootView2;
                                viewGroup.offsetDescendantRectToMyCoords(c2946x, rect);
                                viewGroup.offsetRectIntoDescendantCoords(view, rect);
                                if (Y.g.kilo(view, november, rect)) {
                                    return Boolean.TRUE;
                                }
                            } else {
                                throw new IllegalStateException("Invalid rect");
                            }
                        }
                    }
                    if (!((Y.n) c2946x.getFocusOwner()).bravo(i10, false, false)) {
                        return Boolean.TRUE;
                    }
                    Boolean echo2 = ((Y.n) c2946x.getFocusOwner()).echo(i10, null, new C2938s(dVar2, 0));
                    if (echo2 != null) {
                        z12 = echo2.booleanValue();
                    }
                    return Boolean.valueOf(z12);
                }
                return Boolean.FALSE;
            case 2:
                Function0 function0 = (Function0) obj;
                Handler handler = c2946x.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                }
                if (looper == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = c2946x.getHandler();
                    if (handler2 != null) {
                        handler2.post(new U0.x(function0, 5));
                    }
                }
                return Unit.INSTANCE;
            default:
                return new au(c2946x, c2946x.getTextInputService(), (vf.ab) obj);
        }
    }
}
