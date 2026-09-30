package t9;

import C3.d;
import android.content.DialogInterface;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.measurement.internal.C1477x;
import com.stfalcon.imageviewer.common.pager.MultiTouchViewPager;
import gf.t;
import kotlin.jvm.internal.Intrinsics;
import o9.ViewOnTouchListenerC2201a;
import q9.InterfaceC2431a;

/* renamed from: t9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnShowListenerC3092a implements DialogInterface.OnShowListener {
    public final /* synthetic */ d alpha;

    public DialogInterfaceOnShowListenerC3092a(d dVar) {
        this.alpha = dVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        d dVar = this.alpha;
        u9.c cVar = (u9.c) dVar.purple;
        boolean z2 = dVar.alpha;
        FrameLayout makeVisible = cVar.f13972c;
        Intrinsics.foxtrot(makeVisible, "$this$makeVisible");
        makeVisible.setVisibility(0);
        MultiTouchViewPager makeGone = cVar.e;
        Intrinsics.foxtrot(makeGone, "$this$makeGone");
        makeGone.setVisibility(8);
        InterfaceC2431a interfaceC2431a = cVar.f13984p;
        ImageView copyBitmapFrom = cVar.f13973d;
        if (interfaceC2431a != null) {
            interfaceC2431a.foxtrot(copyBitmapFrom, cVar.f13983o.get(cVar.f13986r));
        }
        Intrinsics.foxtrot(copyBitmapFrom, "$this$copyBitmapFrom");
        FrameLayout makeGone2 = cVar.f13972c;
        cVar.f13985q = new C1477x(copyBitmapFrom, makeGone2);
        u9.b bVar = new u9.b(cVar, 2);
        ViewOnTouchListenerC2201a viewOnTouchListenerC2201a = new ViewOnTouchListenerC2201a(cVar.f13971b, new u9.b(cVar, 3), new t(2, cVar, 2), bVar);
        cVar.f13978j = viewOnTouchListenerC2201a;
        cVar.yellow.setOnTouchListener(viewOnTouchListenerC2201a);
        if (z2) {
            if (cVar.f13985q != null) {
                int[] containerPadding = cVar.teal;
                new u9.a(cVar, 2);
                u9.b bVar2 = new u9.b(cVar, 1);
                Intrinsics.foxtrot(containerPadding, "containerPadding");
                bVar2.invoke();
                return;
            }
            Intrinsics.lima("transitionImageAnimator");
            throw null;
        }
        cVar.f13970a.setAlpha(1.0f);
        Intrinsics.foxtrot(makeGone2, "$this$makeGone");
        makeGone2.setVisibility(8);
        MultiTouchViewPager makeVisible2 = cVar.e;
        Intrinsics.foxtrot(makeVisible2, "$this$makeVisible");
        makeVisible2.setVisibility(0);
    }
}
