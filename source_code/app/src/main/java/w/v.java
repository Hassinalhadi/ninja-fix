package w;

import D0.ae;
import D0.ai;
import D0.aj;
import D0.ak;
import D0.am;
import I0.aa;
import I0.x;
import I0.y;
import I0.z;
import Jb.at;
import a0.ao;
import android.R;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import k4.C2007a;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import n.Y;
import n.ax;
import n.e0;
import s1.C2576i;
import s6.C5;
import t0.C0;
import t6.I2;
import t6.L2;
import t6.N2;
import y.C3344D;

/* loaded from: classes3.dex */
public final class v implements InputConnection {
    public final C2576i alpha;
    public final boolean bravo;
    public final ax charlie;
    public final C3344D delta;
    public final C0 echo;
    public int foxtrot;
    public aa golf;
    public int hotel;
    public boolean india;
    public final ArrayList juliet = new ArrayList();
    public boolean kilo = true;

    public v(aa aaVar, C2576i c2576i, boolean z2, ax axVar, C3344D c3344d, C0 c02) {
        this.alpha = c2576i;
        this.bravo = z2;
        this.charlie = axVar;
        this.delta = c3344d;
        this.echo = c02;
        this.golf = aaVar;
    }

    public final void alpha(I0.g gVar) {
        this.foxtrot++;
        try {
            this.juliet.add(gVar);
        } finally {
            bravo();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z2 = this.kilo;
        if (z2) {
            this.foxtrot++;
            return true;
        }
        return z2;
    }

    public final boolean bravo() {
        int i4 = this.foxtrot - 1;
        this.foxtrot = i4;
        if (i4 == 0) {
            ArrayList arrayList = this.juliet;
            if (!arrayList.isEmpty()) {
                ((u) this.alpha.alpha).charlie.invoke(CollectionsKt.B(arrayList));
                arrayList.clear();
            }
        }
        if (this.foxtrot > 0) {
            return true;
        }
        return false;
    }

    public final void charlie(int i4) {
        sendKeyEvent(new KeyEvent(0, i4));
        sendKeyEvent(new KeyEvent(1, i4));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i4) {
        boolean z2 = this.kilo;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.juliet.clear();
        this.foxtrot = 0;
        this.kilo = false;
        u uVar = (u) this.alpha.alpha;
        int size = uVar.juliet.size();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList arrayList = uVar.juliet;
            if (Intrinsics.areEqual(((WeakReference) arrayList.get(i4)).get(), this)) {
                arrayList.remove(i4);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z2 = this.kilo;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
        boolean z2 = this.kilo;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z2 = this.kilo;
        if (z2) {
            return this.bravo;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i4) {
        boolean z2 = this.kilo;
        if (z2) {
            alpha(new I0.a(String.valueOf(charSequence), i4));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i4, int i5) {
        boolean z2 = this.kilo;
        if (z2) {
            alpha(new I0.e(i4, i5));
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        boolean z2 = this.kilo;
        if (z2) {
            alpha(new I0.f(i4, i5));
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return bravo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [I0.g, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z2 = this.kilo;
        if (z2) {
            alpha(new Object());
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i4) {
        aa aaVar = this.golf;
        return TextUtils.getCapsMode(aaVar.alpha.purple, am.foxtrot(aaVar.bravo), i4);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i4) {
        boolean z2 = true;
        int i5 = 0;
        if ((i4 & 1) == 0) {
            z2 = false;
        }
        this.india = z2;
        if (z2) {
            if (extractedTextRequest != null) {
                i5 = extractedTextRequest.token;
            }
            this.hotel = i5;
        }
        return N2.alpha(this.golf);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i4) {
        if (am.charlie(this.golf.bravo)) {
            return null;
        }
        return C5.foxtrot(this.golf).purple;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i4, int i5) {
        return C5.golf(this.golf, i4).purple;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i4, int i5) {
        return C5.hotel(this.golf, i4).purple;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i4) {
        boolean z2 = this.kilo;
        if (z2) {
            z2 = false;
            switch (i4) {
                case R.id.selectAll:
                    alpha(new z(0, this.golf.alpha.purple.length()));
                    break;
                case R.id.cut:
                    charlie(277);
                    return false;
                case R.id.copy:
                    charlie(278);
                    return false;
                case R.id.paste:
                    charlie(279);
                    return false;
                default:
                    return false;
            }
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i4) {
        int i5;
        boolean z2 = this.kilo;
        if (z2) {
            z2 = true;
            if (i4 != 0) {
                switch (i4) {
                    case 2:
                        i5 = 2;
                        break;
                    case 3:
                        i5 = 3;
                        break;
                    case 4:
                        i5 = 4;
                        break;
                    case 5:
                        i5 = 6;
                        break;
                    case 6:
                        i5 = 7;
                        break;
                    case 7:
                        i5 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i4);
                        break;
                }
                ((u) this.alpha.alpha).delta.invoke(new I0.k(i5));
            }
            i5 = 1;
            ((u) this.alpha.alpha).delta.invoke(new I0.k(i5));
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [long] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlin.jvm.internal.s, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        D0.g gVar;
        PointF startPoint;
        PointF endPoint;
        ?? r16;
        long j5;
        int i4;
        PointF insertionPoint;
        e0 delta;
        String textToInsert;
        PointF joinOrSplitPoint;
        e0 delta2;
        int granularity;
        int i5;
        RectF deletionStartArea;
        RectF deletionEndArea;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int granularity3;
        int i10;
        RectF deletionArea;
        RectF selectionArea;
        int granularity4;
        aj ajVar;
        int i11 = 2;
        boolean z2 = false;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        if (Build.VERSION.SDK_INT >= 34) {
            Y y10 = new Y(21, this);
            ax axVar = this.charlie;
            int i14 = 3;
            if (axVar != null) {
                D0.g gVar2 = axVar.juliet;
                if (gVar2 != null) {
                    e0 delta3 = axVar.delta();
                    ak akVar = null;
                    if (delta3 != null && (ajVar = delta3.alpha.alpha) != null) {
                        gVar = ajVar.alpha;
                    } else {
                        gVar = null;
                    }
                    if (Intrinsics.areEqual(gVar2, gVar)) {
                        boolean november = l.november(handwritingGesture);
                        C3344D c3344d = this.delta;
                        if (november) {
                            SelectGesture kilo = l.kilo(handwritingGesture);
                            selectionArea = kilo.getSelectionArea();
                            Z.c bronze = ao.bronze(selectionArea);
                            granularity4 = kilo.getGranularity();
                            if (granularity4 == 1) {
                                i12 = 1;
                            }
                            long golf = L2.golf(axVar, bronze, i12);
                            if (am.charlie(golf)) {
                                i11 = I2.bravo(l.golf(kilo), y10);
                                i14 = i11;
                            } else {
                                y10.invoke(new z((int) (golf >> 32), (int) (golf & 4294967295L)));
                                if (c3344d != null) {
                                    c3344d.juliet(true);
                                }
                                i11 = 1;
                                i14 = i11;
                            }
                        } else if (l.romeo(handwritingGesture)) {
                            DeleteGesture echo = l.echo(handwritingGesture);
                            granularity3 = echo.getGranularity();
                            if (granularity3 != 1) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            deletionArea = echo.getDeletionArea();
                            long golf2 = L2.golf(axVar, ao.bronze(deletionArea), i10);
                            if (am.charlie(golf2)) {
                                i11 = I2.bravo(l.golf(echo), y10);
                                i14 = i11;
                            } else {
                                if (i10 == 1) {
                                    z10 = true;
                                }
                                I2.charlie(golf2, gVar2, z10, y10);
                                i11 = 1;
                                i14 = i11;
                            }
                        } else if (l.sierra(handwritingGesture)) {
                            SelectRangeGesture lima = l.lima(handwritingGesture);
                            selectionStartArea = lima.getSelectionStartArea();
                            Z.c bronze2 = ao.bronze(selectionStartArea);
                            selectionEndArea = lima.getSelectionEndArea();
                            Z.c bronze3 = ao.bronze(selectionEndArea);
                            granularity2 = lima.getGranularity();
                            if (granularity2 == 1) {
                                i13 = 1;
                            }
                            long charlie = L2.charlie(axVar, bronze2, bronze3, i13);
                            if (am.charlie(charlie)) {
                                i11 = I2.bravo(l.golf(lima), y10);
                                i14 = i11;
                            } else {
                                y10.invoke(new z((int) (charlie >> 32), (int) (charlie & 4294967295L)));
                                if (c3344d != null) {
                                    c3344d.juliet(true);
                                }
                                i11 = 1;
                                i14 = i11;
                            }
                        } else if (l.tango(handwritingGesture)) {
                            DeleteRangeGesture foxtrot = l.foxtrot(handwritingGesture);
                            granularity = foxtrot.getGranularity();
                            if (granularity != 1) {
                                i5 = 0;
                            } else {
                                i5 = 1;
                            }
                            deletionStartArea = foxtrot.getDeletionStartArea();
                            Z.c bronze4 = ao.bronze(deletionStartArea);
                            deletionEndArea = foxtrot.getDeletionEndArea();
                            long charlie2 = L2.charlie(axVar, bronze4, ao.bronze(deletionEndArea), i5);
                            if (am.charlie(charlie2)) {
                                i11 = I2.bravo(l.golf(foxtrot), y10);
                                i14 = i11;
                            } else {
                                if (i5 == 1) {
                                    z2 = true;
                                }
                                I2.charlie(charlie2, gVar2, z2, y10);
                                i11 = 1;
                                i14 = i11;
                            }
                        } else {
                            boolean quebec = l.quebec(handwritingGesture);
                            C0 c02 = this.echo;
                            if (quebec) {
                                JoinOrSplitGesture india = l.india(handwritingGesture);
                                if (c02 != null) {
                                    joinOrSplitPoint = india.getJoinOrSplitPoint();
                                    int bravo = L2.bravo(axVar, L2.echo(joinOrSplitPoint), c02);
                                    if (bravo != -1 && ((delta2 = axVar.delta()) == null || !L2.delta(delta2.alpha, bravo))) {
                                        int i15 = bravo;
                                        while (i15 > 0) {
                                            int codePointBefore = Character.codePointBefore(gVar2, i15);
                                            if (!L2.juliet(codePointBefore)) {
                                                break;
                                            } else {
                                                i15 -= Character.charCount(codePointBefore);
                                            }
                                        }
                                        while (bravo < gVar2.purple.length()) {
                                            int codePointAt = Character.codePointAt(gVar2, bravo);
                                            if (!L2.juliet(codePointAt)) {
                                                break;
                                            } else {
                                                bravo += Character.charCount(codePointAt);
                                            }
                                        }
                                        long bravo2 = ae.bravo(i15, bravo);
                                        if (am.charlie(bravo2)) {
                                            int i16 = (int) (bravo2 >> 32);
                                            y10.invoke(new n(new I0.g[]{new z(i16, i16), new I0.a(" ", 1)}));
                                        } else {
                                            I2.charlie(bravo2, gVar2, false, y10);
                                        }
                                        i11 = 1;
                                    } else {
                                        i11 = I2.bravo(l.golf(india), y10);
                                    }
                                } else {
                                    i11 = I2.bravo(l.golf(india), y10);
                                }
                                i14 = i11;
                            } else {
                                if (i2.c.victor(handwritingGesture)) {
                                    InsertGesture hotel = l.hotel(handwritingGesture);
                                    if (c02 != null) {
                                        insertionPoint = hotel.getInsertionPoint();
                                        int bravo3 = L2.bravo(axVar, L2.echo(insertionPoint), c02);
                                        if (bravo3 != -1 && ((delta = axVar.delta()) == null || !L2.delta(delta.alpha, bravo3))) {
                                            textToInsert = hotel.getTextToInsert();
                                            y10.invoke(new n(new I0.g[]{new z(bravo3, bravo3), new I0.a(textToInsert, 1)}));
                                            i11 = 1;
                                        } else {
                                            i11 = I2.bravo(l.golf(hotel), y10);
                                        }
                                    } else {
                                        i11 = I2.bravo(l.golf(hotel), y10);
                                    }
                                } else if (l.papa(handwritingGesture)) {
                                    RemoveSpaceGesture juliet = l.juliet(handwritingGesture);
                                    e0 delta4 = axVar.delta();
                                    if (delta4 != null) {
                                        akVar = delta4.alpha;
                                    }
                                    startPoint = juliet.getStartPoint();
                                    long echo2 = L2.echo(startPoint);
                                    endPoint = juliet.getEndPoint();
                                    long echo3 = L2.echo(endPoint);
                                    q0.z charlie3 = axVar.charlie();
                                    if (akVar == null || charlie3 == null) {
                                        r16 = ' ';
                                        j5 = am.bravo;
                                    } else {
                                        long cyan = charlie3.cyan(echo2);
                                        long cyan2 = charlie3.cyan(echo3);
                                        D0.o oVar = akVar.bravo;
                                        int foxtrot2 = L2.foxtrot(oVar, cyan, c02);
                                        int foxtrot3 = L2.foxtrot(oVar, cyan2, c02);
                                        if (foxtrot2 == -1) {
                                            if (foxtrot3 == -1) {
                                                j5 = am.bravo;
                                                r16 = ' ';
                                            }
                                        } else {
                                            if (foxtrot3 != -1) {
                                                foxtrot2 = Math.min(foxtrot2, foxtrot3);
                                            }
                                            foxtrot3 = foxtrot2;
                                        }
                                        float bravo4 = (oVar.bravo(foxtrot3) + oVar.foxtrot(foxtrot3)) / 2;
                                        int i17 = (int) (cyan >> 32);
                                        int i18 = (int) (cyan2 >> 32);
                                        r16 = ' ';
                                        j5 = oVar.hotel(new Z.c(Math.min(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)), bravo4 - 0.1f, Math.max(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)), bravo4 + 0.1f), 0, ai.alpha);
                                    }
                                    if (am.charlie(j5)) {
                                        i11 = I2.bravo(l.golf(juliet), y10);
                                    } else {
                                        ?? obj = new Object();
                                        obj.alpha = -1;
                                        ?? obj2 = new Object();
                                        obj2.alpha = -1;
                                        String golf3 = new Regex("\\s+").golf(gVar2.subSequence(am.foxtrot(j5), am.echo(j5)).purple, new C2007a(13, obj, obj2));
                                        int i19 = obj.alpha;
                                        if (i19 != -1 && (i4 = obj2.alpha) != -1) {
                                            int i20 = (int) (j5 >> r16);
                                            String substring = golf3.substring(i19, golf3.length() - (am.delta(j5) - obj2.alpha));
                                            Intrinsics.delta(substring, "substring(...)");
                                            z zVar = new z(i20 + i19, i20 + i4);
                                            i14 = 1;
                                            y10.invoke(new n(new I0.g[]{zVar, new I0.a(substring, 1)}));
                                        } else {
                                            i11 = I2.bravo(l.golf(juliet), y10);
                                        }
                                    }
                                }
                                i14 = i11;
                            }
                        }
                    }
                }
                i11 = i14;
                i14 = i11;
            }
            if (intConsumer != null) {
                if (executor == null) {
                    intConsumer.accept(i14);
                } else {
                    executor.execute(new at(intConsumer, i14, 6));
                }
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z2 = this.kilo;
        if (z2) {
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        ax axVar;
        D0.g gVar;
        D0.g gVar2;
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        int i4;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int i5;
        RectF deletionArea;
        int granularity3;
        int i10;
        RectF selectionArea;
        int granularity4;
        int i11;
        aj ajVar;
        if (Build.VERSION.SDK_INT >= 34 && (axVar = this.charlie) != null && (gVar = axVar.juliet) != null) {
            e0 delta = axVar.delta();
            if (delta != null && (ajVar = delta.alpha.alpha) != null) {
                gVar2 = ajVar.alpha;
            } else {
                gVar2 = null;
            }
            if (Intrinsics.areEqual(gVar, gVar2)) {
                boolean november = l.november(previewableHandwritingGesture);
                C3344D c3344d = this.delta;
                if (november) {
                    SelectGesture kilo = l.kilo(previewableHandwritingGesture);
                    if (c3344d != null) {
                        selectionArea = kilo.getSelectionArea();
                        Z.c bronze = ao.bronze(selectionArea);
                        granularity4 = kilo.getGranularity();
                        if (granularity4 != 1) {
                            i11 = 0;
                        } else {
                            i11 = 1;
                        }
                        long golf = L2.golf(axVar, bronze, i11);
                        ax axVar2 = c3344d.delta;
                        if (axVar2 != null) {
                            axVar2.foxtrot(golf);
                        }
                        ax axVar3 = c3344d.delta;
                        if (axVar3 != null) {
                            axVar3.echo(am.bravo);
                        }
                        if (!am.charlie(golf)) {
                            c3344d.uniform(false);
                            c3344d.romeo(n.am.alpha);
                        }
                    }
                } else if (l.romeo(previewableHandwritingGesture)) {
                    DeleteGesture echo = l.echo(previewableHandwritingGesture);
                    if (c3344d != null) {
                        deletionArea = echo.getDeletionArea();
                        Z.c bronze2 = ao.bronze(deletionArea);
                        granularity3 = echo.getGranularity();
                        if (granularity3 != 1) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                        long golf2 = L2.golf(axVar, bronze2, i10);
                        ax axVar4 = c3344d.delta;
                        if (axVar4 != null) {
                            axVar4.echo(golf2);
                        }
                        ax axVar5 = c3344d.delta;
                        if (axVar5 != null) {
                            axVar5.foxtrot(am.bravo);
                        }
                        if (!am.charlie(golf2)) {
                            c3344d.uniform(false);
                            c3344d.romeo(n.am.alpha);
                        }
                    }
                } else if (l.sierra(previewableHandwritingGesture)) {
                    SelectRangeGesture lima = l.lima(previewableHandwritingGesture);
                    if (c3344d != null) {
                        selectionStartArea = lima.getSelectionStartArea();
                        Z.c bronze3 = ao.bronze(selectionStartArea);
                        selectionEndArea = lima.getSelectionEndArea();
                        Z.c bronze4 = ao.bronze(selectionEndArea);
                        granularity2 = lima.getGranularity();
                        if (granularity2 != 1) {
                            i5 = 0;
                        } else {
                            i5 = 1;
                        }
                        long charlie = L2.charlie(axVar, bronze3, bronze4, i5);
                        ax axVar6 = c3344d.delta;
                        if (axVar6 != null) {
                            axVar6.foxtrot(charlie);
                        }
                        ax axVar7 = c3344d.delta;
                        if (axVar7 != null) {
                            axVar7.echo(am.bravo);
                        }
                        if (!am.charlie(charlie)) {
                            c3344d.uniform(false);
                            c3344d.romeo(n.am.alpha);
                        }
                    }
                } else if (l.tango(previewableHandwritingGesture)) {
                    DeleteRangeGesture foxtrot = l.foxtrot(previewableHandwritingGesture);
                    if (c3344d != null) {
                        deletionStartArea = foxtrot.getDeletionStartArea();
                        Z.c bronze5 = ao.bronze(deletionStartArea);
                        deletionEndArea = foxtrot.getDeletionEndArea();
                        Z.c bronze6 = ao.bronze(deletionEndArea);
                        granularity = foxtrot.getGranularity();
                        if (granularity != 1) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        long charlie2 = L2.charlie(axVar, bronze5, bronze6, i4);
                        ax axVar8 = c3344d.delta;
                        if (axVar8 != null) {
                            axVar8.echo(charlie2);
                        }
                        ax axVar9 = c3344d.delta;
                        if (axVar9 != null) {
                            axVar9.foxtrot(am.bravo);
                        }
                        if (!am.charlie(charlie2)) {
                            c3344d.uniform(false);
                            c3344d.romeo(n.am.alpha);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new m(0, c3344d));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z2) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i4) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = this.kilo;
        if (z15) {
            boolean z16 = false;
            if ((i4 & 1) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i4 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 33) {
                if ((i4 & 16) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i4 & 8) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((i4 & 4) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i5 >= 34 && (i4 & 32) != 0) {
                    z16 = true;
                }
                if (!z11 && !z12 && !z14 && !z16) {
                    if (i5 >= 34) {
                        z13 = true;
                        z16 = true;
                        z11 = true;
                        z12 = true;
                    } else {
                        z11 = true;
                        z12 = true;
                        z13 = z16;
                        z16 = true;
                    }
                } else {
                    z13 = z16;
                    z16 = z14;
                }
            } else {
                z11 = true;
                z12 = true;
                z13 = false;
            }
            r rVar = ((u) this.alpha.alpha).mike;
            synchronized (rVar.charlie) {
                try {
                    rVar.foxtrot = z11;
                    rVar.golf = z12;
                    rVar.hotel = z16;
                    rVar.india = z13;
                    if (z2) {
                        rVar.echo = true;
                        if (rVar.juliet != null) {
                            rVar.alpha();
                        }
                    }
                    rVar.delta = z10;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        return z15;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.kilo;
        if (z2) {
            ((BaseInputConnection) ((u) this.alpha.alpha).kilo.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i4, int i5) {
        boolean z2 = this.kilo;
        if (z2) {
            alpha(new x(i4, i5));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i4) {
        boolean z2 = this.kilo;
        if (z2) {
            alpha(new y(String.valueOf(charSequence), i4));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i4, int i5) {
        boolean z2 = this.kilo;
        if (z2) {
            alpha(new z(i4, i5));
            return true;
        }
        return z2;
    }
}
