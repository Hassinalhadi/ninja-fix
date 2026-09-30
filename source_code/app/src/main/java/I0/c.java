package I0;

import D0.ak;
import D0.am;
import a0.C0347ag;
import a0.ao;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import id.C1915c;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2795v5;
import s6.J4;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class c {
    public final C2946x alpha;
    public final C1915c bravo;
    public boolean delta;
    public boolean echo;
    public boolean foxtrot;
    public boolean golf;
    public boolean hotel;
    public boolean india;
    public aa juliet;
    public ak kilo;
    public t lima;
    public Z.c november;
    public Z.c oscar;
    public final Object charlie = new Object();
    public Function1 mike = b.red;
    public final CursorAnchorInfo.Builder papa = new CursorAnchorInfo.Builder();
    public final float[] quebec = C0347ag.alpha();
    public final Matrix romeo = new Matrix();

    public c(C2946x c2946x, C1915c c1915c) {
        this.alpha = c2946x;
        this.bravo = c1915c;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void alpha() {
        Lazy lazy;
        int echo;
        D0.o oVar;
        int echo2;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        C1915c c1915c = this.bravo;
        ?? r22 = c1915c.red;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view = (View) c1915c.purple;
        if (!inputMethodManager.isActive(view)) {
            return;
        }
        Function1 function1 = this.mike;
        float[] fArr = this.quebec;
        function1.invoke(new C0347ag(fArr));
        this.alpha.papa(fArr);
        Matrix matrix = this.romeo;
        ao.uniform(matrix, fArr);
        aa aaVar = this.juliet;
        Intrinsics.checkNotNull(aaVar);
        t tVar = this.lima;
        Intrinsics.checkNotNull(tVar);
        ak akVar = this.kilo;
        Intrinsics.checkNotNull(akVar);
        Z.c cVar = this.november;
        Intrinsics.checkNotNull(cVar);
        Z.c cVar2 = this.oscar;
        Intrinsics.checkNotNull(cVar2);
        boolean z10 = this.foxtrot;
        boolean z11 = this.golf;
        boolean z12 = this.hotel;
        boolean z13 = this.india;
        CursorAnchorInfo.Builder builder = this.papa;
        builder.reset();
        builder.setMatrix(matrix);
        int foxtrot = am.foxtrot(aaVar.bravo);
        builder.setSelectionRange(foxtrot, am.echo(aaVar.bravo));
        if (z10 && foxtrot >= 0) {
            int originalToTransformed = tVar.originalToTransformed(foxtrot);
            Z.c charlie = akVar.charlie(originalToTransformed);
            lazy = r22;
            float charlie2 = J4.charlie(charlie.alpha, 0.0f, (int) (akVar.charlie >> 32));
            boolean bravo = AbstractC2795v5.bravo(cVar, charlie2, charlie.bravo);
            boolean bravo2 = AbstractC2795v5.bravo(cVar, charlie2, charlie.delta);
            if (akVar.alpha(originalToTransformed) == O0.j.purple) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!bravo && !bravo2) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            if (!bravo || !bravo2) {
                i13 |= 2;
            }
            if (z2) {
                i13 |= 4;
            }
            float f5 = charlie.bravo;
            float f10 = charlie.delta;
            builder.setInsertionMarkerLocation(charlie2, f5, f10, f10, i13);
        } else {
            lazy = r22;
        }
        if (z11) {
            int i14 = -1;
            am amVar = aaVar.charlie;
            if (amVar != null) {
                i4 = am.foxtrot(amVar.alpha);
            } else {
                i4 = -1;
            }
            if (amVar != null) {
                i14 = am.echo(amVar.alpha);
            }
            if (i4 >= 0 && i4 < i14) {
                builder.setComposingText(i4, aaVar.alpha.purple.subSequence(i4, i14));
                int originalToTransformed2 = tVar.originalToTransformed(i4);
                int originalToTransformed3 = tVar.originalToTransformed(i14);
                float[] fArr2 = new float[(originalToTransformed3 - originalToTransformed2) * 4];
                int i15 = i14;
                akVar.bravo.alpha(D0.ae.bravo(originalToTransformed2, originalToTransformed3), fArr2);
                while (true) {
                    int i16 = i15;
                    if (i4 >= i16) {
                        break;
                    }
                    int originalToTransformed4 = tVar.originalToTransformed(i4);
                    int i17 = (originalToTransformed4 - originalToTransformed2) * 4;
                    float f11 = fArr2[i17];
                    i15 = i16;
                    float f12 = fArr2[i17 + 1];
                    int i18 = originalToTransformed2;
                    float f13 = fArr2[i17 + 2];
                    float f14 = fArr2[i17 + 3];
                    cVar.getClass();
                    t tVar2 = tVar;
                    if (cVar.alpha < f13) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    if (f11 < cVar.charlie) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    int i19 = i5 & i10;
                    if (cVar.bravo < f14) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    int i20 = i19 & i11;
                    if (f12 < cVar.delta) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    int i21 = i20 & i12;
                    if (!AbstractC2795v5.bravo(cVar, f11, f12) || !AbstractC2795v5.bravo(cVar, f13, f14)) {
                        i21 |= 2;
                    }
                    if (akVar.alpha(originalToTransformed4) == O0.j.purple) {
                        i21 |= 4;
                    }
                    float[] fArr3 = fArr2;
                    int i22 = i4;
                    builder.addCharacterBounds(i22, f11, f12, f13, f14, i21);
                    i4 = i22 + 1;
                    fArr2 = fArr3;
                    originalToTransformed2 = i18;
                    tVar = tVar2;
                }
            }
        }
        int i23 = Build.VERSION.SDK_INT;
        if (i23 >= 33 && z12) {
            editorBounds = aw.a.golf().setEditorBounds(ao.amber(cVar2));
            handwritingBounds = editorBounds.setHandwritingBounds(ao.amber(cVar2));
            build = handwritingBounds.build();
            builder.setEditorBoundsInfo(build);
        }
        if (i23 >= 34 && z13 && !cVar.echo() && (echo = akVar.bravo.echo(cVar.bravo)) <= (echo2 = (oVar = akVar.bravo).echo(cVar.delta))) {
            while (true) {
                builder.addVisibleLineBounds(akVar.delta(echo), oVar.foxtrot(echo), akVar.echo(echo), oVar.bravo(echo));
                if (echo == echo2) {
                    break;
                } else {
                    echo++;
                }
            }
        }
        ((InputMethodManager) lazy.getValue()).updateCursorAnchorInfo(view, builder.build());
        this.echo = false;
    }
}
