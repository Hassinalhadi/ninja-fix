package w;

import D0.ae;
import D0.ak;
import D0.am;
import I0.aa;
import a0.C0347ag;
import a0.ao;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.t0;
import kotlin.jvm.internal.Intrinsics;
import q0.z;
import s6.J4;
import t6.M2;

/* loaded from: classes3.dex */
public final class r {
    public final C3224b alpha;
    public final o bravo;
    public boolean delta;
    public boolean echo;
    public boolean foxtrot;
    public boolean golf;
    public boolean hotel;
    public boolean india;
    public aa juliet;
    public ak kilo;
    public I0.t lima;
    public Z.c mike;
    public Z.c november;
    public final Object charlie = new Object();
    public final CursorAnchorInfo.Builder oscar = new CursorAnchorInfo.Builder();
    public final float[] papa = C0347ag.alpha();
    public final Matrix quebec = new Matrix();

    public r(C3224b c3224b, o oVar) {
        this.alpha = c3224b;
        this.bravo = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0211 A[LOOP:1: B:83:0x01fc->B:85:0x0211, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214 A[EDGE_INSN: B:86:0x0214->B:87:0x0214 BREAK  A[LOOP:1: B:83:0x01fc->B:85:0x0211], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha() {
        o oVar;
        Z.c cVar;
        int i4;
        int echo;
        D0.o oVar2;
        int echo2;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z2;
        int i14;
        o oVar3 = this.bravo;
        InputMethodManager uniform = oVar3.uniform();
        View view = (View) oVar3.purple;
        if (uniform.isActive(view) && this.juliet != null && this.lima != null && this.kilo != null && this.mike != null && this.november != null) {
            float[] fArr = this.papa;
            C0347ag.delta(fArr);
            z zVar = (z) ((t0) this.alpha.alpha.silver).getValue();
            if (zVar != null) {
                if (!zVar.india()) {
                    zVar = null;
                }
                if (zVar != null) {
                    zVar.juliet(fArr);
                }
            }
            Z.c cVar2 = this.november;
            Intrinsics.checkNotNull(cVar2);
            float f5 = -cVar2.alpha;
            Z.c cVar3 = this.november;
            Intrinsics.checkNotNull(cVar3);
            C0347ag.foxtrot(fArr, f5, -cVar3.bravo);
            Matrix matrix = this.quebec;
            ao.uniform(matrix, fArr);
            aa aaVar = this.juliet;
            Intrinsics.checkNotNull(aaVar);
            I0.t tVar = this.lima;
            Intrinsics.checkNotNull(tVar);
            ak akVar = this.kilo;
            Intrinsics.checkNotNull(akVar);
            Z.c cVar4 = this.mike;
            Intrinsics.checkNotNull(cVar4);
            Z.c cVar5 = this.november;
            Intrinsics.checkNotNull(cVar5);
            boolean z10 = this.foxtrot;
            boolean z11 = this.golf;
            boolean z12 = this.hotel;
            boolean z13 = this.india;
            CursorAnchorInfo.Builder builder = this.oscar;
            builder.reset();
            builder.setMatrix(matrix);
            int foxtrot = am.foxtrot(aaVar.bravo);
            builder.setSelectionRange(foxtrot, am.echo(aaVar.bravo));
            if (z10 && foxtrot >= 0) {
                int originalToTransformed = tVar.originalToTransformed(foxtrot);
                Z.c charlie = akVar.charlie(originalToTransformed);
                oVar = oVar3;
                float charlie2 = J4.charlie(charlie.alpha, 0.0f, (int) (akVar.charlie >> 32));
                boolean bravo = M2.bravo(cVar4, charlie2, charlie.bravo);
                boolean bravo2 = M2.bravo(cVar4, charlie2, charlie.delta);
                if (akVar.alpha(originalToTransformed) == O0.j.purple) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!bravo && !bravo2) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
                if (!bravo || !bravo2) {
                    i14 |= 2;
                }
                if (z2) {
                    i14 |= 4;
                }
                float f10 = charlie.bravo;
                float f11 = charlie.delta;
                builder.setInsertionMarkerLocation(charlie2, f10, f11, f11, i14);
            } else {
                oVar = oVar3;
            }
            if (z11) {
                int i15 = -1;
                am amVar = aaVar.charlie;
                if (amVar != null) {
                    i5 = am.foxtrot(amVar.alpha);
                } else {
                    i5 = -1;
                }
                if (amVar != null) {
                    i15 = am.echo(amVar.alpha);
                }
                if (i5 >= 0 && i5 < i15) {
                    builder.setComposingText(i5, aaVar.alpha.purple.subSequence(i5, i15));
                    int originalToTransformed2 = tVar.originalToTransformed(i5);
                    int originalToTransformed3 = tVar.originalToTransformed(i15);
                    float[] fArr2 = new float[(originalToTransformed3 - originalToTransformed2) * 4];
                    cVar = cVar5;
                    akVar.bravo.alpha(ae.bravo(originalToTransformed2, originalToTransformed3), fArr2);
                    while (i5 < i15) {
                        int originalToTransformed4 = tVar.originalToTransformed(i5);
                        int i16 = (originalToTransformed4 - originalToTransformed2) * 4;
                        float f12 = fArr2[i16];
                        float f13 = fArr2[i16 + 1];
                        int i17 = originalToTransformed2;
                        float f14 = fArr2[i16 + 2];
                        float f15 = fArr2[i16 + 3];
                        cVar4.getClass();
                        int i18 = i15;
                        if (cVar4.alpha < f14) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if (f12 < cVar4.charlie) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        int i19 = i10 & i11;
                        if (cVar4.bravo < f15) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        int i20 = i19 & i12;
                        if (f13 < cVar4.delta) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        int i21 = i20 & i13;
                        if (!M2.bravo(cVar4, f12, f13) || !M2.bravo(cVar4, f14, f15)) {
                            i21 |= 2;
                        }
                        if (akVar.alpha(originalToTransformed4) == O0.j.purple) {
                            i21 |= 4;
                        }
                        float[] fArr3 = fArr2;
                        int i22 = i5;
                        builder.addCharacterBounds(i22, f12, f13, f14, f15, i21);
                        i5 = i22 + 1;
                        fArr2 = fArr3;
                        originalToTransformed2 = i17;
                        i15 = i18;
                    }
                    i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 33 && z12) {
                        editorBounds = aw.a.golf().setEditorBounds(ao.amber(cVar));
                        handwritingBounds = editorBounds.setHandwritingBounds(ao.amber(cVar));
                        build = handwritingBounds.build();
                        builder.setEditorBoundsInfo(build);
                    }
                    if (i4 >= 34 && z13 && !cVar4.echo() && (echo = akVar.bravo.echo(cVar4.bravo)) <= (echo2 = (oVar2 = akVar.bravo).echo(cVar4.delta))) {
                        while (true) {
                            builder.addVisibleLineBounds(akVar.delta(echo), oVar2.foxtrot(echo), akVar.echo(echo), oVar2.bravo(echo));
                            if (echo != echo2) {
                                break;
                            } else {
                                echo++;
                            }
                        }
                    }
                    oVar.uniform().updateCursorAnchorInfo(view, builder.build());
                    this.echo = false;
                }
            }
            cVar = cVar5;
            i4 = Build.VERSION.SDK_INT;
            if (i4 >= 33) {
                editorBounds = aw.a.golf().setEditorBounds(ao.amber(cVar));
                handwritingBounds = editorBounds.setHandwritingBounds(ao.amber(cVar));
                build = handwritingBounds.build();
                builder.setEditorBoundsInfo(build);
            }
            if (i4 >= 34) {
                while (true) {
                    builder.addVisibleLineBounds(akVar.delta(echo), oVar2.foxtrot(echo), akVar.echo(echo), oVar2.bravo(echo));
                    if (echo != echo2) {
                    }
                    echo++;
                }
            }
            oVar.uniform().updateCursorAnchorInfo(view, builder.build());
            this.echo = false;
        }
    }
}
