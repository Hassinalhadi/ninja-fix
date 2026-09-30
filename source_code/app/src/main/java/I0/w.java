package I0;

import D0.am;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2813x5;
import s6.C5;

/* loaded from: classes3.dex */
public final class w implements InputConnection {
    public final Aa.m alpha;
    public final boolean bravo;
    public int charlie;
    public aa delta;
    public int echo;
    public boolean foxtrot;
    public final ArrayList golf = new ArrayList();
    public boolean hotel = true;

    public w(aa aaVar, Aa.m mVar, boolean z2) {
        this.alpha = mVar;
        this.bravo = z2;
        this.delta = aaVar;
    }

    public final void alpha(g gVar) {
        this.charlie++;
        try {
            this.golf.add(gVar);
        } finally {
            bravo();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z2 = this.hotel;
        if (z2) {
            this.charlie++;
            return true;
        }
        return z2;
    }

    public final boolean bravo() {
        int i4 = this.charlie - 1;
        this.charlie = i4;
        if (i4 == 0) {
            ArrayList arrayList = this.golf;
            if (!arrayList.isEmpty()) {
                ((ad) this.alpha.purple).echo.invoke(CollectionsKt.B(arrayList));
                arrayList.clear();
            }
        }
        if (this.charlie > 0) {
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
        boolean z2 = this.hotel;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.golf.clear();
        this.charlie = 0;
        this.hotel = false;
        ad adVar = (ad) this.alpha.purple;
        int size = adVar.india.size();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList arrayList = adVar.india;
            if (Intrinsics.areEqual(((WeakReference) arrayList.get(i4)).get(), this)) {
                arrayList.remove(i4);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z2 = this.hotel;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
        boolean z2 = this.hotel;
        if (z2) {
            return false;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z2 = this.hotel;
        if (z2) {
            return this.bravo;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i4) {
        boolean z2 = this.hotel;
        if (z2) {
            alpha(new a(String.valueOf(charSequence), i4));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i4, int i5) {
        boolean z2 = this.hotel;
        if (z2) {
            alpha(new e(i4, i5));
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        boolean z2 = this.hotel;
        if (z2) {
            alpha(new f(i4, i5));
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
        boolean z2 = this.hotel;
        if (z2) {
            alpha(new Object());
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i4) {
        aa aaVar = this.delta;
        return TextUtils.getCapsMode(aaVar.alpha.purple, am.foxtrot(aaVar.bravo), i4);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i4) {
        boolean z2 = true;
        int i5 = 0;
        if ((i4 & 1) == 0) {
            z2 = false;
        }
        this.foxtrot = z2;
        if (z2) {
            if (extractedTextRequest != null) {
                i5 = extractedTextRequest.token;
            }
            this.echo = i5;
        }
        return AbstractC2813x5.bravo(this.delta);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i4) {
        if (am.charlie(this.delta.bravo)) {
            return null;
        }
        return C5.foxtrot(this.delta).purple;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i4, int i5) {
        return C5.golf(this.delta, i4).purple;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i4, int i5) {
        return C5.hotel(this.delta, i4).purple;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i4) {
        boolean z2 = this.hotel;
        if (z2) {
            z2 = false;
            switch (i4) {
                case R.id.selectAll:
                    alpha(new z(0, this.delta.alpha.purple.length()));
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
        boolean z2 = this.hotel;
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
                ((ad) this.alpha.purple).foxtrot.invoke(new k(i5));
            }
            i5 = 1;
            ((ad) this.alpha.purple).foxtrot.invoke(new k(i5));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z2 = this.hotel;
        if (z2) {
            return true;
        }
        return z2;
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
        boolean z15 = this.hotel;
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
            c cVar = ((ad) this.alpha.purple).lima;
            synchronized (cVar.charlie) {
                try {
                    cVar.foxtrot = z11;
                    cVar.golf = z12;
                    cVar.hotel = z16;
                    cVar.india = z13;
                    if (z2) {
                        cVar.echo = true;
                        if (cVar.juliet != null) {
                            cVar.alpha();
                        }
                    }
                    cVar.delta = z10;
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
        boolean z2 = this.hotel;
        if (z2) {
            ((BaseInputConnection) ((ad) this.alpha.purple).juliet.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i4, int i5) {
        boolean z2 = this.hotel;
        if (z2) {
            alpha(new x(i4, i5));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i4) {
        boolean z2 = this.hotel;
        if (z2) {
            alpha(new y(String.valueOf(charSequence), i4));
        }
        return z2;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i4, int i5) {
        boolean z2 = this.hotel;
        if (z2) {
            alpha(new z(i4, i5));
            return true;
        }
        return z2;
    }
}
