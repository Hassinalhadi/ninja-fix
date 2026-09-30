package u9;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.measurement.internal.C1477x;
import com.stfalcon.imageviewer.common.pager.MultiTouchViewPager;
import delivery.samurai.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m9.C2108a;
import n9.C2165b;
import n9.EnumC2164a;
import o9.ViewOnTouchListenerC2201a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q9.InterfaceC2431a;
import r9.C2509a;
import r9.C2510b;
import s1.C2576i;
import s6.AbstractC2778t6;

/* loaded from: classes2.dex */
public final class c extends RelativeLayout {

    /* renamed from: a */
    public final View f13970a;
    public boolean alpha;

    /* renamed from: b */
    public final ViewGroup f13971b;

    /* renamed from: c */
    public final FrameLayout f13972c;

    /* renamed from: d */
    public final ImageView f13973d;
    public final MultiTouchViewPager e;

    /* renamed from: f */
    public C2510b f13974f;

    /* renamed from: g */
    public final C2165b f13975g;

    /* renamed from: h */
    public final C2576i f13976h;

    /* renamed from: i */
    public final ScaleGestureDetector f13977i;

    /* renamed from: j */
    public ViewOnTouchListenerC2201a f13978j;

    /* renamed from: k */
    public boolean f13979k;

    /* renamed from: l */
    public boolean f13980l;

    /* renamed from: m */
    public boolean f13981m;

    /* renamed from: n */
    public EnumC2164a f13982n;

    /* renamed from: o */
    public List f13983o;

    /* renamed from: p */
    public InterfaceC2431a f13984p;
    public boolean purple;

    /* renamed from: q */
    public C1477x f13985q;

    /* renamed from: r */
    public int f13986r;
    public Function0 red;
    public Function1 silver;
    public int[] teal;
    public View white;
    public final ViewGroup yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, s1.i] */
    public c(Context context) {
        super(context, null, 0);
        Intrinsics.foxtrot(context, "context");
        this.alpha = true;
        this.purple = true;
        this.teal = new int[]{0, 0, 0, 0};
        this.f13983o = CollectionsKt.emptyList();
        View.inflate(context, R.layout.view_image_viewer, this);
        View findViewById = findViewById(R.id.rootContainer);
        Intrinsics.bravo(findViewById, "findViewById(R.id.rootContainer)");
        this.yellow = (ViewGroup) findViewById;
        View findViewById2 = findViewById(R.id.backgroundView);
        Intrinsics.bravo(findViewById2, "findViewById(R.id.backgroundView)");
        this.f13970a = findViewById2;
        View findViewById3 = findViewById(R.id.dismissContainer);
        Intrinsics.bravo(findViewById3, "findViewById(R.id.dismissContainer)");
        this.f13971b = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(R.id.transitionImageContainer);
        Intrinsics.bravo(findViewById4, "findViewById(R.id.transitionImageContainer)");
        this.f13972c = (FrameLayout) findViewById4;
        View findViewById5 = findViewById(R.id.transitionImageView);
        Intrinsics.bravo(findViewById5, "findViewById(R.id.transitionImageView)");
        this.f13973d = (ImageView) findViewById5;
        View findViewById6 = findViewById(R.id.imagesPager);
        Intrinsics.bravo(findViewById6, "findViewById(R.id.imagesPager)");
        MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager) findViewById6;
        this.e = multiTouchViewPager;
        AbstractC2778t6.alpha(multiTouchViewPager, new a(this, 0), null, 5);
        Context context2 = getContext();
        Intrinsics.bravo(context2, "context");
        this.f13975g = new C2165b(context2, new a(this, 5));
        Context context3 = getContext();
        C2108a c2108a = new C2108a(new a(this, 3), new a(this, 4));
        ?? obj = new Object();
        obj.alpha = new GestureDetector(context3, c2108a, null);
        this.f13976h = obj;
        this.f13977i = new ScaleGestureDetector(getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener());
    }

    public static final void bravo(c cVar, MotionEvent motionEvent, boolean z2) {
        boolean z10;
        float f5;
        View view = cVar.white;
        if (view != null && !z2) {
            if (view.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f10 = 0.0f;
            if (z10) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            if (!z10) {
                f10 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f5, f10);
            ofFloat.setDuration(ViewConfiguration.getDoubleTapTimeout());
            if (z10) {
                ofFloat.addListener(new O6.b(9, view));
            } else {
                view.setVisibility(0);
            }
            ofFloat.start();
            super.dispatchTouchEvent(motionEvent);
        }
    }

    public final boolean getShouldDismissToBottom() {
        return true;
    }

    private final void setStartPosition(int i4) {
        this.f13986r = i4;
        setCurrentPosition$imageviewer_release(i4);
    }

    public final void charlie() {
        int marginEnd;
        int i4;
        FrameLayout makeVisible = this.f13972c;
        Intrinsics.foxtrot(makeVisible, "$this$makeVisible");
        makeVisible.setVisibility(0);
        MultiTouchViewPager makeGone = this.e;
        Intrinsics.foxtrot(makeGone, "$this$makeGone");
        makeGone.setVisibility(8);
        Integer num = 0;
        ViewGroup applyMargin = this.f13971b;
        Intrinsics.foxtrot(applyMargin, "$this$applyMargin");
        if (applyMargin.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = applyMargin.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(num.intValue());
                marginLayoutParams.topMargin = num.intValue();
                if (num != null) {
                    marginEnd = num.intValue();
                } else {
                    marginEnd = marginLayoutParams.getMarginEnd();
                }
                marginLayoutParams.setMarginEnd(marginEnd);
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = marginLayoutParams.bottomMargin;
                }
                marginLayoutParams.bottomMargin = i4;
                applyMargin.setLayoutParams(marginLayoutParams);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (this.f13985q != null) {
            getShouldDismissToBottom();
            new a(this, 1);
            new b(this, 0).invoke();
            return;
        }
        Intrinsics.lima("transitionImageAnimator");
        throw null;
    }

    public final void delta() {
        if (getShouldDismissToBottom()) {
            ViewOnTouchListenerC2201a viewOnTouchListenerC2201a = this.f13978j;
            if (viewOnTouchListenerC2201a != null) {
                viewOnTouchListenerC2201a.alpha(viewOnTouchListenerC2201a.silver.getHeight());
                return;
            } else {
                Intrinsics.lima("swipeDismissHandler");
                throw null;
            }
        }
        charlie();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x018d, code lost:
    
        if (r2 <= 360.0d) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e6, code lost:
    
        if (r10 != 3) goto L208;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent event) {
        boolean z2;
        Throwable th;
        String str;
        boolean z10;
        boolean z11;
        View view;
        Intrinsics.foxtrot(event, "event");
        View view2 = this.white;
        if (view2 != null && view2.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!z2 || (view = this.white) == null || !view.dispatchTouchEvent(event)) && this.f13985q != null && (!this.f13980l || event.getAction() != 2 || event.getPointerCount() != 1)) {
            int action = event.getAction();
            ViewGroup viewGroup = this.yellow;
            MultiTouchViewPager multiTouchViewPager = this.e;
            if (action == 1) {
                this.f13980l = false;
                ViewOnTouchListenerC2201a viewOnTouchListenerC2201a = this.f13978j;
                if (viewOnTouchListenerC2201a != null) {
                    viewOnTouchListenerC2201a.onTouch(viewGroup, event);
                    multiTouchViewPager.dispatchTouchEvent(event);
                    View view3 = this.white;
                    if (view3 != null && view3.getVisibility() == 0 && view3.dispatchTouchEvent(event)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f13981m = z11;
                } else {
                    Intrinsics.lima("swipeDismissHandler");
                    throw null;
                }
            }
            if (event.getAction() == 0) {
                this.f13982n = null;
                this.f13979k = false;
                multiTouchViewPager.dispatchTouchEvent(event);
                ViewOnTouchListenerC2201a viewOnTouchListenerC2201a2 = this.f13978j;
                if (viewOnTouchListenerC2201a2 != null) {
                    viewOnTouchListenerC2201a2.onTouch(viewGroup, event);
                    View view4 = this.white;
                    if (view4 != null && view4.getVisibility() == 0 && view4.dispatchTouchEvent(event)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f13981m = z10;
                } else {
                    Intrinsics.lima("swipeDismissHandler");
                    throw null;
                }
            }
            ScaleGestureDetector scaleGestureDetector = this.f13977i;
            scaleGestureDetector.onTouchEvent(event);
            ((GestureDetector) this.f13976h.alpha).onTouchEvent(event);
            if (this.f13982n == null && (scaleGestureDetector.isInProgress() || event.getPointerCount() > 1 || this.f13979k)) {
                this.f13979k = true;
                return multiTouchViewPager.dispatchTouchEvent(event);
            }
            if (echo()) {
                return super.dispatchTouchEvent(event);
            }
            C2165b c2165b = this.f13975g;
            c2165b.getClass();
            int action2 = event.getAction();
            if (action2 != 0) {
                EnumC2164a enumC2164a = EnumC2164a.alpha;
                a aVar = c2165b.echo;
                if (action2 != 1) {
                    if (action2 == 2) {
                        if (!c2165b.delta) {
                            float x4 = event.getX(0) - c2165b.bravo;
                            float y10 = event.getY(0) - c2165b.charlie;
                            if (((float) Math.sqrt((y10 * y10) + (x4 * x4))) > c2165b.alpha) {
                                c2165b.delta = true;
                                th = null;
                                str = "swipeDismissHandler";
                                double d4 = 180;
                                double atan2 = ((((Math.atan2(c2165b.charlie - event.getY(), event.getX() - c2165b.bravo) + 3.141592653589793d) * d4) / 3.141592653589793d) + d4) % 360;
                                EnumC2164a enumC2164a2 = EnumC2164a.teal;
                                if (atan2 < 0.0d || atan2 > 45.0d) {
                                    if (atan2 >= 45.0d && atan2 <= 135.0d) {
                                        enumC2164a = EnumC2164a.purple;
                                    } else if (atan2 >= 135.0d && atan2 <= 225.0d) {
                                        enumC2164a = EnumC2164a.silver;
                                    } else if (atan2 >= 225.0d && atan2 <= 315.0d) {
                                        enumC2164a = EnumC2164a.red;
                                    } else if (atan2 >= 315.0d) {
                                    }
                                    aVar.invoke(enumC2164a);
                                }
                                enumC2164a = enumC2164a2;
                                aVar.invoke(enumC2164a);
                            }
                        }
                    }
                    th = null;
                    str = "swipeDismissHandler";
                }
                th = null;
                str = "swipeDismissHandler";
                if (!c2165b.delta) {
                    aVar.invoke(enumC2164a);
                }
                c2165b.charlie = 0.0f;
                c2165b.bravo = 0.0f;
                c2165b.delta = false;
            } else {
                th = null;
                str = "swipeDismissHandler";
                c2165b.bravo = event.getX();
                c2165b.charlie = event.getY();
            }
            EnumC2164a enumC2164a3 = this.f13982n;
            if (enumC2164a3 != null) {
                int ordinal = enumC2164a3.ordinal();
                if (ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3 || ordinal == 4) {
                        return multiTouchViewPager.dispatchTouchEvent(event);
                    }
                } else if (this.purple && !this.f13979k && multiTouchViewPager.alpha) {
                    ViewOnTouchListenerC2201a viewOnTouchListenerC2201a3 = this.f13978j;
                    if (viewOnTouchListenerC2201a3 != null) {
                        return viewOnTouchListenerC2201a3.onTouch(viewGroup, event);
                    }
                    Intrinsics.lima(str);
                    throw th;
                }
            }
        }
        return true;
    }

    public final boolean echo() {
        Object obj;
        C2510b c2510b = this.f13974f;
        if (c2510b != null) {
            int currentPosition$imageviewer_release = getCurrentPosition$imageviewer_release();
            Iterator it = c2510b.delta.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C2509a) obj).alpha == currentPosition$imageviewer_release) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C2509a c2509a = (C2509a) obj;
            if (c2509a != null && c2509a.delta.getScale() > 1.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void foxtrot(List list, InterfaceC2431a interfaceC2431a) {
        this.f13983o = list;
        this.f13984p = interfaceC2431a;
        Context context = getContext();
        Intrinsics.bravo(context, "context");
        C2510b c2510b = new C2510b(context, list, interfaceC2431a, this.alpha);
        this.f13974f = c2510b;
        this.e.setAdapter(c2510b);
        setStartPosition(0);
    }

    @NotNull
    public final int[] getContainerPadding$imageviewer_release() {
        return this.teal;
    }

    public final int getCurrentPosition$imageviewer_release() {
        return this.e.getCurrentItem();
    }

    public final int getImagesMargin$imageviewer_release() {
        return this.e.getPageMargin();
    }

    @Nullable
    public final Function0<Unit> getOnDismiss$imageviewer_release() {
        return this.red;
    }

    @Nullable
    public final Function1<Integer, Unit> getOnPageChange$imageviewer_release() {
        return this.silver;
    }

    @Nullable
    public final View getOverlayView$imageviewer_release() {
        return this.white;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        findViewById(R.id.backgroundView).setBackgroundColor(i4);
    }

    public final void setContainerPadding$imageviewer_release(@NotNull int[] iArr) {
        Intrinsics.foxtrot(iArr, "<set-?>");
        this.teal = iArr;
    }

    public final void setCurrentPosition$imageviewer_release(int i4) {
        this.e.setCurrentItem(i4);
    }

    public final void setImagesMargin$imageviewer_release(int i4) {
        this.e.setPageMargin(i4);
    }

    public final void setOnDismiss$imageviewer_release(@Nullable Function0<Unit> function0) {
        this.red = function0;
    }

    public final void setOnPageChange$imageviewer_release(@Nullable Function1<? super Integer, Unit> function1) {
        this.silver = function1;
    }

    public final void setOverlayView$imageviewer_release(@Nullable View view) {
        this.white = view;
        if (view != null) {
            this.yellow.addView(view);
        }
    }

    public final void setSwipeToDismissAllowed$imageviewer_release(boolean z2) {
        this.purple = z2;
    }

    public final void setZoomingAllowed$imageviewer_release(boolean z2) {
        this.alpha = z2;
    }
}
