package wc;

import F.C0130l1;
import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.compose.runtime.ag;
import be.RunnableC0756b;
import com.google.mlkit.vision.barcode.common.Barcode;
import g1.AbstractC1735d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wa.n;

/* renamed from: wc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3256b implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C3257c purple;

    public /* synthetic */ C3256b(C3257c c3257c, int i4) {
        this.alpha = i4;
        this.purple = c3257c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i4 = 1;
        C3257c c3257c = this.purple;
        switch (this.alpha) {
            case 0:
                List list = (List) obj;
                Intrinsics.checkNotNull(list);
                Barcode barcode = (Barcode) CollectionsKt.green(list);
                if (barcode == null) {
                    return Unit.INSTANCE;
                }
                String rawValue = barcode.getRawValue();
                byte[] rawBytes = barcode.getRawBytes();
                if (rawValue == null && rawBytes == null) {
                    return Unit.INSTANCE;
                }
                if (c3257c.echo.compareAndSet(false, true)) {
                    c3257c.charlie.invoke(rawValue, rawBytes);
                }
                return Unit.INSTANCE;
            case 1:
                ag DisposableEffect = (ag) obj;
                Intrinsics.echo(DisposableEffect, "$this$DisposableEffect");
                return new C0130l1(13, c3257c);
            default:
                Context ctx = (Context) obj;
                Intrinsics.echo(ctx, "ctx");
                PreviewView previewView = new PreviewView(ctx, null);
                c3257c.getClass();
                if (c3257c.juliet != previewView || c3257c.hotel == null) {
                    c3257c.juliet = previewView;
                    bo.e eVar = bo.e.golf;
                    Context context = c3257c.alpha;
                    RunnableC0756b charlie = y6.e.charlie(context);
                    charlie.foxtrot(new n(charlie, c3257c, previewView, i4), AbstractC1735d.delta(context));
                }
                return previewView;
        }
    }
}
