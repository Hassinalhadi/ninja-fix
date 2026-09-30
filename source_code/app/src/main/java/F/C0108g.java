package F;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.C0537c;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.wallet.button.ButtonOptions;
import h6.BinderC1814d;
import i6.C1894c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q0.AbstractC2366B;
import q0.AbstractC2367C;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0108g extends Lambda implements Function1 {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Serializable red;
    public final /* synthetic */ Serializable silver;
    public final /* synthetic */ Object teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0108g(Z8.a aVar, Z8.b bVar, int i4, String str) {
        super(1);
        this.red = aVar;
        this.silver = bVar;
        this.purple = i4;
        this.teal = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* JADX WARN: Type inference failed for: r7v2, types: [I6.a, android.view.View$OnClickListener, android.widget.FrameLayout, android.view.View, java.lang.Object, android.view.ViewGroup] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i4;
        I6.b bVar;
        Object obj2 = this.teal;
        Serializable serializable = this.silver;
        Serializable serializable2 = this.red;
        switch (this.alpha) {
            case 0:
                AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
                ArrayList arrayList = (ArrayList) serializable2;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    List list = (List) arrayList.get(i5);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i10 = 0;
                    while (true) {
                        q0.ar arVar = (q0.ar) obj2;
                        if (i10 < size2) {
                            int i11 = ((AbstractC2367C) list.get(i10)).alpha;
                            if (i10 < CollectionsKt.ivory(list)) {
                                i4 = arVar.ochre(AbstractC0128l.charlie);
                            } else {
                                i4 = 0;
                            }
                            iArr[i10] = i11 + i4;
                            i10++;
                        } else {
                            C0537c c0537c = AbstractC0542h.bravo;
                            int[] iArr2 = new int[size2];
                            for (int i12 = 0; i12 < size2; i12++) {
                                iArr2[i12] = 0;
                            }
                            c0537c.charlie(arVar, this.purple, iArr, arVar.getLayoutDirection(), iArr2);
                            int size3 = list.size();
                            for (int i13 = 0; i13 < size3; i13++) {
                                AbstractC2366B.hotel(abstractC2366B, (AbstractC2367C) list.get(i13), iArr2[i13], ((Number) ((ArrayList) serializable).get(i5)).intValue());
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                Context context = (Context) obj;
                Intrinsics.echo(context, "context");
                View view = null;
                ?? frameLayout = new FrameLayout(context, null, 0);
                Aa.m o5 = ButtonOptions.o();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, H6.c.alpha);
                int i14 = obtainStyledAttributes.getInt(0, 1);
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, (int) TypedValue.applyDimension(1, 100.0f, Resources.getSystem().getDisplayMetrics()));
                ButtonOptions buttonOptions = (ButtonOptions) o5.purple;
                buttonOptions.purple = i14;
                buttonOptions.red = dimensionPixelSize;
                obtainStyledAttributes.hasValue(1);
                obtainStyledAttributes.recycle();
                buttonOptions.alpha = 1;
                if (frameLayout.isInEditMode()) {
                    frameLayout.alpha(buttonOptions);
                }
                Aa.m o10 = ButtonOptions.o();
                int i15 = ((Z8.a) serializable2).alpha;
                ButtonOptions buttonOptions2 = (ButtonOptions) o10.purple;
                buttonOptions2.purple = i15;
                int i16 = ((Z8.b) serializable).alpha;
                buttonOptions2.alpha = i16;
                int i17 = this.purple;
                buttonOptions2.red = i17;
                String str = (String) obj2;
                buttonOptions2.silver = str;
                if (i16 != 0) {
                    buttonOptions.alpha = i16;
                }
                if (i15 != 0) {
                    buttonOptions.purple = i15;
                }
                buttonOptions.red = i17;
                buttonOptions.silver = str;
                if (!frameLayout.isInEditMode()) {
                    frameLayout.removeAllViews();
                    if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(frameLayout.getContext(), 232100000) != 0) {
                        frameLayout.alpha(buttonOptions);
                        Log.e("PayButton", "Failed to create latest buttonView: Google Play Services version is outdated.");
                    } else if (TextUtils.isEmpty(buttonOptions.silver)) {
                        Log.e("PayButton", "Failed to create buttonView: allowedPaymentMethods cannot be empty.");
                    } else {
                        Context context2 = frameLayout.getContext();
                        V5.x.hotel(context2);
                        try {
                            C1894c charlie = C1894c.charlie(context2, C1894c.bravo, "com.google.android.gms.wallet_dynamite");
                            try {
                                IBinder bravo = charlie.bravo("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl");
                                if (bravo == null) {
                                    bVar = 0;
                                } else {
                                    IInterface queryLocalInterface = bravo.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
                                    if (queryLocalInterface instanceof I6.b) {
                                        bVar = (I6.b) queryLocalInterface;
                                    } else {
                                        bVar = new AbstractC1394y(bravo, "com.google.android.gms.wallet.button.IPayButtonCreator", 6);
                                    }
                                }
                                if (bVar != 0) {
                                    view = (View) BinderC1814d.magenta(bVar.magenta(new BinderC1814d(new Context[]{charlie.alpha, context2}), buttonOptions));
                                } else {
                                    Log.e("PayButtonProxy", "Failed to get the actual PayButtonCreatorChimeraImpl.");
                                }
                            } catch (RemoteException e) {
                                e = e;
                                Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
                                frameLayout.purple = view;
                                if (view == null) {
                                }
                                return frameLayout;
                            } catch (DynamiteModule$LoadingException e4) {
                                e = e4;
                                Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
                                frameLayout.purple = view;
                                if (view == null) {
                                }
                                return frameLayout;
                            }
                            frameLayout.purple = view;
                            if (view == null) {
                                Log.e("PayButton", "Failed to create buttonView");
                            } else {
                                frameLayout.addView(view);
                                frameLayout.purple.setOnClickListener(frameLayout);
                            }
                        } catch (DynamiteModule$LoadingException e5) {
                            throw new IllegalStateException(e5);
                        }
                    }
                } else {
                    frameLayout.alpha(buttonOptions);
                }
                return frameLayout;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0108g(ArrayList arrayList, q0.ar arVar, int i4, ArrayList arrayList2) {
        super(1);
        float f5 = AbstractC0128l.alpha;
        this.red = arrayList;
        this.teal = arVar;
        this.purple = i4;
        this.silver = arrayList2;
    }
}
